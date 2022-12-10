package no.dadobug.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.datafixer.fix.PlayerUuidFix;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.nbt.NbtTypes;
import net.minecraft.network.Packet;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.World;
import no.dadobug.EntryModule;

import javax.annotation.Nullable;
import java.util.Objects;

public class RegenerativeBlockEntity extends BlockEntity {

    private int durability;
    private BlockState keepstate;
    private PlayerEntity lastPlayer = null;
    private ItemStack lastItem = ItemStack.EMPTY;
    private boolean regenComplete = true;
    private boolean stacksDropped = false;
    private boolean scronch = false;

    public RegenerativeBlockEntity(BlockPos pos, BlockState state) {
        super(EntryModule.REGENERATIVEBLOCKTYPE.get(), pos, state);
        this.keepstate = state;
        Block block = state.getBlock();
        if(block instanceof RegenerativeBlock block1) {
            this.durability = block1.durabilityProvider.get(block1.random);
        }

    }

    public void resetDurability(World worldIn, IntProvider durabilityIn){
        this.durability = durabilityIn.get(worldIn.random);
        EntryModule.LOGGER.debug("resetDurability");
        sendData(worldIn);
    }



    public void resetDurability(World worldIn, int durabilityIn){
        this.durability = durabilityIn;
        EntryModule.LOGGER.debug("setDurability");
        sendData(worldIn);
    }

    public BlockState getKeepstate() {
        return this.keepstate;
    }

    public int getDurability() {
        return durability;
    }

    public ItemStack getLastItem() {
        return lastItem;
    }

    public void setStacksDropped(boolean stacksDropped) {
        this.stacksDropped = stacksDropped;
    }

    public void registerMiningParameters(World worldIn, PlayerEntity player, BlockState state){
        EntryModule.LOGGER.debug("registerMiningParameters1");
        this.regenComplete = false;
        this.lastItem = player.getMainHandStack();
        this.lastPlayer = player;
        this.damageBlock(state, true);
        sendData(worldIn);
    }

    public void damageBlock(BlockState state, boolean doEnchant){
        Block block = state.getBlock();
        if(block instanceof RegenerativeBlock block1){
            if(!block1.isInfinite()){
                if(doEnchant) {
                    if (!(state.isIn(EntryModule.CORE_TAG) && (EnchantmentHelper.getLevel(EntryModule.EXTRACTION.get(), this.lastItem) > 0)) && !(state.isIn(EntryModule.FRACTURE_TAG) && (EnchantmentHelper.getLevel(EntryModule.CURSE_OF_FRACTURING.get(), this.lastItem) > 0)) && (!block1.isSilk_able() && (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, this.lastItem) > 0))) {
                        for (int i = 0; i < (EnchantmentHelper.getLevel(EntryModule.SHATTERING.get(), this.lastItem) + 1); i++) {
                            this.durability = this.durability - 6 - (EnchantmentHelper.getLevel(EntryModule.SHATTERING.get(), this.lastItem) > 0 ? 1 : 0) + Math.min(EnchantmentHelper.getLevel(EntryModule.GENTLE_MINING.get(), this.lastItem), 5);
                        }
                    }
                } else {
                    this.durability -= 6;
                }
            }
        }
    }

    public boolean regen(World worldIn, BlockState newState) {
        EntryModule.LOGGER.debug("regen");

        if(this.scronch) {
            sendData(worldIn);
            return false;
        }
        if(this.keepstate.isIn(EntryModule.HOLLOW_TAG) && newState.isIn(EntryModule.CORE_TAG)) {
            sendData(worldIn);
            return false;
        }
        if (this.lastPlayer != null){
            if (this.lastPlayer.isCreative() && !this.regenComplete){
                return false;
            }
        }

        if(worldIn != null && !worldIn.isClient) {
            if(this.regenComplete){
                this.damageBlock(this.keepstate, true);
            }
            if (this.keepstate.isIn(EntryModule.FRACTURE_TAG) && (EnchantmentHelper.getLevel(EntryModule.CURSE_OF_FRACTURING.get(), this.lastItem) > 0)) {
                worldIn.setBlockState(pos, EntryModule.BEDROCK_FRACTURED.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, this.keepstate.get(OresBlockStates.REPLACE_WITH_BLOCK)));
                if (!this.stacksDropped && !this.regenComplete) {
                    this.keepstate.getBlock().afterBreak(worldIn, this.lastPlayer, pos, this.keepstate, this, this.lastItem);
                    this.stacksDropped = false;
                    EntryModule.LOGGER.debug("forced drops");
                }
                sendData(worldIn);
                return false;
            } else if (this.keepstate.isIn(EntryModule.CORE_TAG) && ((EnchantmentHelper.getLevel(EntryModule.EXTRACTION.get(), this.lastItem) > 0))){
                worldIn.setBlockState(pos, EntryModule.BEDROCK_HOLLOW.get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, this.keepstate.get(OresBlockStates.REPLACE_WITH_BLOCK)));
                if (!this.stacksDropped && !this.regenComplete) {
                    this.keepstate.getBlock().afterBreak(worldIn, this.lastPlayer, pos, this.keepstate, this, this.lastItem);
                    this.stacksDropped = false;
                    EntryModule.LOGGER.debug("forced drops");
                }
                sendData(worldIn);
                return false;
            } else if(this.keepstate.getBlock() instanceof RegenerativeBlock block){
                if(block.isSilk_able() && (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, this.lastItem) > 0)) {
                    return false;
                } else if((this.keepstate.contains(OresBlockStates.REPLACE_WITH_BLOCK) && (((EnchantmentHelper.getLevel(EntryModule.SHATTERING.get(), this.lastItem) > 0) && block.isInfinite()) || (EnchantmentHelper.getLevel(EntryModule.CURSE_OF_SHATTERING.get(), this.lastItem) > 0))) || this.durability < 0  || (EnchantmentHelper.getLevel(EntryModule.ARCANE_EXTRACTION.get(), this.lastItem) > 0)) {
                    if(this.keepstate.get(OresBlockStates.REPLACE_WITH_BLOCK)) {
                        worldIn.setBlockState(pos, block.getReplaceBlock());
                        if (!this.stacksDropped && !this.regenComplete) {
                            this.keepstate.getBlock().afterBreak(worldIn, this.lastPlayer, pos, this.keepstate, this, this.lastItem);
                            this.stacksDropped = false;
                            EntryModule.LOGGER.debug("forced drops");
                        }
                    }
                    sendData(worldIn);
                    return false;
                } else if(newState != this.keepstate && (this.durability > 0 || block.isInfinite())){
                    EntryModule.LOGGER.debug("put it back");
                    worldIn.setBlockState(this.pos, this.keepstate);
                    if (!this.stacksDropped && !this.regenComplete) {
                        this.keepstate.getBlock().afterBreak(worldIn, this.lastPlayer, pos, this.keepstate, this, this.lastItem);
                        EntryModule.LOGGER.debug("forced drops");
                    }
                    this.lastItem = ItemStack.EMPTY;
                    this.regenComplete = true;
                    this.lastPlayer = null;
                    this.stacksDropped = false;
                    sendData(worldIn);
                    return true;
                }
            } else if(newState != this.keepstate && (this.durability > 0)){
                EntryModule.LOGGER.warn("Non-Regenerative block set as keepstate at " + pos.toString());
                EntryModule.LOGGER.debug("put it back");
                worldIn.setBlockState(this.pos, this.keepstate);
                if (!this.stacksDropped && !this.regenComplete) {
                    this.keepstate.getBlock().afterBreak(worldIn, this.lastPlayer, pos, this.keepstate, this, this.lastItem);
                    EntryModule.LOGGER.debug("forced drops");
                }
                this.lastItem = ItemStack.EMPTY;
                this.regenComplete = true;
                this.lastPlayer = null;
                this.stacksDropped = false;
                sendData(worldIn);
                return true;
            } else {
                EntryModule.LOGGER.warn("Non-Regenerative block set as keepstate at " + pos.toString());
            }
        }
        return false;
    }

    @Override
    public void writeNbt(NbtCompound tag) {

        tag.putInt("durability", this.durability);
        tag.put("keepstate", NbtHelper.fromBlockState(this.keepstate));
        tag.putBoolean("scronch", this.scronch);

        super.writeNbt(tag);
    }

    @Override
    public void readNbt(NbtCompound tag) {
        super.readNbt(tag);

        durability = tag.getInt("durability");
        keepstate = NbtHelper.toBlockState(tag.getCompound("keepstate"));
        scronch = tag.getBoolean("scronch");
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return createNbt();
    }

    public void sendData(World worldIn) {
        if (worldIn != null && !worldIn.isClient)
            worldIn.updateListeners(this.pos, this.keepstate, this.keepstate, 2 | 4 | 16);
    }
}
