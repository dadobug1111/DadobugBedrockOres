package no.dadobug.blocks;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import no.dadobug.EntryModule;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class RegenerativeBlock extends BlockWithEntity {
    protected final UniformIntProvider experienceDropped;
    protected final IntProvider durabilityProvider;
    protected final boolean infinite;
    protected final boolean silk_able;
    protected final BlockState replaceBlock;
    protected Random random;


    public RegenerativeBlock(AbstractBlock.Settings settings, boolean ReplaceWithBlock, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        this(settings, ReplaceWithBlock, UniformIntProvider.create(0, 0), UniformIntProvider.create(1, 1), infinite, silk_able, replaceBlock);
    }

    public RegenerativeBlock(AbstractBlock.Settings settings, boolean ReplaceWithBlock, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        this(settings, ReplaceWithBlock, UniformIntProvider.create(0, 0), durabilityProvider, infinite, silk_able, replaceBlock);
    }

    public RegenerativeBlock(AbstractBlock.Settings settings, boolean ReplaceWithBlock, UniformIntProvider experienceDropped, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        this(settings, ReplaceWithBlock, experienceDropped, UniformIntProvider.create(1, 1), infinite, silk_able, replaceBlock);
    }


    public RegenerativeBlock(Settings settings, boolean ReplaceWithBlock, int XPmin, int XPmax, int DurabilityMin, int DurabilityMax, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        this(settings, ReplaceWithBlock, UniformIntProvider.create(XPmin, XPmax), UniformIntProvider.create(DurabilityMin, DurabilityMax), infinite, silk_able, replaceBlock);
    }


    public RegenerativeBlock(Settings settings, boolean ReplaceWithBlock, int XPmin, int XPmax, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        this(settings, ReplaceWithBlock, UniformIntProvider.create(XPmin, XPmax), durabilityProvider, infinite, silk_able, replaceBlock);
    }

    public RegenerativeBlock(Settings settings, boolean ReplaceWithBlock, UniformIntProvider experienceDropped, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock){
        super(settings);
        this.random = new Random();
        this.experienceDropped = experienceDropped;
        this.durabilityProvider = durabilityProvider;
        this.infinite = infinite;
        this.replaceBlock = replaceBlock;
        this.silk_able = silk_able;
        setDefaultState(getStateManager().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, ReplaceWithBlock));
    }

    public boolean isInfinite() {
        return infinite;
    }

    public boolean isSilk_able() {
        return silk_able;
    }

    public BlockState getReplaceBlock() {
        return replaceBlock;
    }

    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new RegenerativeBlockEntity(pos, state);
    }


    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
            BlockEntity blockEntity = world.getBlockEntity(pos);

    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, EntryModule.REGENERATIVEBLOCKTYPE.get(), RegenerativeBlockEntity::tick);
    }


    @Override
    public float calcBlockBreakingDelta(BlockState state, PlayerEntity player, BlockView world, BlockPos pos) {
        if(!player.canHarvest(state))return 0.0f;
        if(state.isIn(EntryModule.INDESTRUCTABLE_TAG))return 0.0f;
        if(state.isIn(EntryModule.ENCHANT_ONLY_TAG) && !(EnchantmentHelper.getEquipmentLevel(EntryModule.SHATTERING.get(), player)>0 || EnchantmentHelper.getEquipmentLevel(EntryModule.CURSE_OF_FRACTURING.get(), player)>0 || EnchantmentHelper.getEquipmentLevel(EntryModule.EXTRACTION.get(), player)>0 || EnchantmentHelper.getEquipmentLevel(EntryModule.CURSE_OF_SHATTERING.get(), player)>0 || EnchantmentHelper.getEquipmentLevel(EntryModule.GENTLE_MINING.get(), player)>0))return 0.0f;
        return super.calcBlockBreakingDelta(state, player, world, pos);
    }


    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(OresBlockStates.REPLACE_WITH_BLOCK);
    }

    @Override
    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.BLOCK;
    }

    /*
    @Override
    public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion) {
        if (!world.isClient) {
            world.setBlockState(pos, super.asBlock().getDefaultState());
        }
    }
    */

    @Override
    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0 && EnchantmentHelper.getLevel(EntryModule.CURSE_OF_FRACTURING.get(), stack) == 0 && EnchantmentHelper.getLevel(EntryModule.CURSE_OF_SHATTERING.get(), stack) == 0 && EnchantmentHelper.getLevel(EntryModule.ARCANE_EXTRACTION.get(), stack) == 0 && EnchantmentHelper.getLevel(EntryModule.EXTRACTION.get(), stack) == 0) {
            int i1 = 1 + EnchantmentHelper.getLevel(EntryModule.SHATTERING.get(), stack);
            for(int x = 0; x<i1; x++) {
                int i = this.experienceDropped.get(world.random);
                if (i > 0) {
                    this.dropExperience(world, pos, ((EnchantmentHelper.getLevel(EntryModule.SHATTERING.get(), stack) * (this.infinite?2:1)) + 1) * i);
                }
            }
        }
    }


    public void dropMultiStacks(BlockState state, World world, BlockPos pos, @Nullable BlockEntity blockEntity, Entity entity, ItemStack stack) {
        EntryModule.LOGGER.debug("dropMultiStacks");
        if (world instanceof ServerWorld) {
            if (EnchantmentHelper.getLevel(EntryModule.CURSE_OF_SHATTERING.get(), stack) < 1 && EnchantmentHelper.getLevel(EntryModule.CURSE_OF_FRACTURING.get(), stack) < 1) {

                if ((this.silk_able && EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) > 0) || EnchantmentHelper.getLevel(EntryModule.ARCANE_EXTRACTION.get(), stack) > 0 || EnchantmentHelper.getLevel(EntryModule.EXTRACTION.get(), stack) > 0){
                    getDroppedStacks(state, (ServerWorld) world, pos, blockEntity, entity, stack).forEach((stackx) -> {
                        dropStack(world, pos, stackx);
                    });
                } else {
                    int i1 = (1 + EnchantmentHelper.getLevel(EntryModule.SHATTERING.get(), stack)) * ((this.infinite && EnchantmentHelper.getLevel(EntryModule.SHATTERING.get(), stack) > 0) ? world.random.nextInt(3, 7) : 1);
                    for (int x = 0; x < i1; x++) {
                        getDroppedStacks(state, (ServerWorld) world, pos, blockEntity, entity, stack).forEach((stackx) -> {
                            dropStack(world, pos, stackx);
                        });
                    }
                }
            }
            state.onStacksDropped((ServerWorld) world, pos, stack);
        }


    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if(world instanceof ServerWorld) {
            BlockEntity entity = world.getBlockEntity(pos);
            if (entity instanceof RegenerativeBlockEntity) {
                ((RegenerativeBlockEntity) entity).registerMiningParameters(world, player, state);
            }
        }
        super.onBreak(world, pos, state, player);
    }



    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
        EntryModule.LOGGER.debug("afterBreak");
        player.incrementStat(Stats.MINED.getOrCreateStat(this));
        player.addExhaustion(0.005F);
        if (blockEntity instanceof RegenerativeBlockEntity) {
            ((RegenerativeBlockEntity) blockEntity).setStacksDropped(true);
        }
        this.dropMultiStacks(state, world, pos, blockEntity, player, stack);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.hasBlockEntity() && !state.isOf(newState.getBlock())) {
            BlockEntity entity = world.getBlockEntity(pos);
            if(entity instanceof RegenerativeBlockEntity){
                boolean regen = ((RegenerativeBlockEntity) entity).regen(world, newState);
                if(!regen){
                    world.removeBlockEntity(pos);
                }
            } else {
                world.removeBlockEntity(pos);
            }
        }

    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public int getExpDrop(BlockState state, WorldView reader, BlockPos pos, int fortune, int silktouch) {
        EntryModule.LOGGER.debug("checked XP");
        BlockEntity entity = reader.getBlockEntity(pos);
        if (entity instanceof RegenerativeBlockEntity) {
            if (silktouch == 0 && EnchantmentHelper.getLevel(EntryModule.CURSE_OF_FRACTURING.get(), ((RegenerativeBlockEntity)entity).getLastItem()) == 0 && EnchantmentHelper.getLevel(EntryModule.CURSE_OF_SHATTERING.get(), ((RegenerativeBlockEntity)entity).getLastItem()) == 0 && EnchantmentHelper.getLevel(EntryModule.ARCANE_EXTRACTION.get(), ((RegenerativeBlockEntity)entity).getLastItem()) == 0 && EnchantmentHelper.getLevel(EntryModule.EXTRACTION.get(), ((RegenerativeBlockEntity)entity).getLastItem()) == 0) {
                int z = 0;
                int i1 = 1 + EnchantmentHelper.getLevel(EntryModule.SHATTERING.get(), ((RegenerativeBlockEntity)entity).getLastItem());
                for (int x = 0; x < i1; x++) {
                    int i = this.experienceDropped.get(this.random);
                    if (i > 0) {
                        z = z + ((EnchantmentHelper.getLevel(EntryModule.SHATTERING.get(), ((RegenerativeBlockEntity)entity).getLastItem()) * (this.infinite ? 2 : 1)) + 1) * i;
                    }
                }
                return z;
            }
        }
        return 0;
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState state = ctx.getWorld().getBlockState(ctx.getBlockPos());
        if(state.getProperties().contains(OresBlockStates.REPLACE_WITH_BLOCK)){
            return this.getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, state.get(OresBlockStates.REPLACE_WITH_BLOCK));
        }
        return this.getDefaultState();
    }
}
