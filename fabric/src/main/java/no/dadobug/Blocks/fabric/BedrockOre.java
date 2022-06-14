package no.dadobug.Blocks.fabric;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TransparentBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import no.dadobug.EntryModule;
import no.dadobug.blocks.BedrockStates;

public class BedrockOre extends TransparentBlock {
    private final UniformIntProvider experienceDropped;
    public BedrockOre(Settings settings, Boolean ReplaceWithBedrock) {
        this(settings, ReplaceWithBedrock, UniformIntProvider.create(0, 0));
    }


    public BedrockOre(Settings settings, Boolean ReplaceWithBedrock, int XPmin, int XPmax) {
        this(settings, ReplaceWithBedrock, UniformIntProvider.create(XPmin, XPmax));
    }

    public BedrockOre(Settings settings, Boolean ReplaceWithBedrock, UniformIntProvider experienceDropped){
        super(settings);
        this.experienceDropped = experienceDropped;
        setDefaultState(getStateManager().getDefaultState().with(BedrockStates.REPLACE_WITH_BEDROCK, ReplaceWithBedrock));
    }

    @Override
    public float calcBlockBreakingDelta(BlockState state, PlayerEntity player, BlockView world, BlockPos pos) {
        if(!player.canHarvest(state))return 0.0f;
        if(state.isIn(EntryModule.INDESTRUCTABLE_TAG))return 0.0f;
        if(state.isIn(EntryModule.ENCHANT_ONLY_TAG) && !(EnchantmentHelper.getEquipmentLevel(EntryModule.SHATTERING.get(), player)>0 || EnchantmentHelper.getEquipmentLevel(EntryModule.CURSE_OF_FRACTURING.get(), player)>0 || EnchantmentHelper.getEquipmentLevel(EntryModule.EXTRACTION.get(), player)>0))return 0.0f;
        return super.calcBlockBreakingDelta(state, player, world, pos);
    }


    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(BedrockStates.REPLACE_WITH_BEDROCK);
    }

    @Override
    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.BLOCK;
    }

    @Override
    public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion) {
        if (!world.isClient) {
            world.setBlockState(pos, super.asBlock().getDefaultState());
        }
    }

    @Override
    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0 && EnchantmentHelper.getLevel(EntryModule.CURSE_OF_FRACTURING.get(), stack) == 0 ) {
            int i = this.experienceDropped.get(world.random);
            if (i > 0) {
                this.dropExperience(world, pos, ((EnchantmentHelper.getLevel(EntryModule.SHATTERING.get(), stack)*2)+1)*i);
            }
        }

    }

}
