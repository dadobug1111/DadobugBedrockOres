package no.dadobug.blocks;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidDrainable;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.WorldAccess;

import java.util.Optional;
import java.util.Random;

public class RegenerativeFluid extends RegenerativeBlock implements FluidDrainable {
    protected final Fluid fluid;
    protected final ItemStack BucketItem;
    protected final Optional<SoundEvent> BucketSound;
    public RegenerativeFluid(AbstractBlock.Settings settings, Boolean ReplaceWithBedrock, Fluid fluidIn, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        this(settings, ReplaceWithBedrock, fluidIn, UniformIntProvider.create(0, 0), durabilityProvider, infinite, silk_able, replaceBlock);
    }
    public RegenerativeFluid(AbstractBlock.Settings settings, Boolean ReplaceWithBedrock, ItemStack bucketIn, Optional<SoundEvent> bucketSoundIn, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        this(settings, ReplaceWithBedrock, bucketIn, bucketSoundIn, UniformIntProvider.create(0, 0), durabilityProvider, infinite, silk_able, replaceBlock);

    }

    public RegenerativeFluid(AbstractBlock.Settings settings, Boolean ReplaceWithBedrock, Fluid fluidIn, int XPmin, int XPmax, int DurabilityMin, int DurabilityMax, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        this(settings, ReplaceWithBedrock, fluidIn, UniformIntProvider.create(XPmin, XPmax), UniformIntProvider.create(DurabilityMin, DurabilityMax), infinite, silk_able, replaceBlock);
    }
    public RegenerativeFluid(AbstractBlock.Settings settings, Boolean ReplaceWithBedrock, ItemStack bucketIn, Optional<SoundEvent> bucketSoundIn, int XPmin, int XPmax, int DurabilityMin, int DurabilityMax, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        this(settings, ReplaceWithBedrock, bucketIn, bucketSoundIn, UniformIntProvider.create(XPmin, XPmax), UniformIntProvider.create(DurabilityMin, DurabilityMax), infinite, silk_able, replaceBlock);

    }

    public RegenerativeFluid(AbstractBlock.Settings settings, Boolean ReplaceWithBedrock, Fluid fluidIn, int XPmin, int XPmax, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        this(settings, ReplaceWithBedrock, fluidIn, UniformIntProvider.create(XPmin, XPmax), durabilityProvider, infinite, silk_able, replaceBlock);
    }
    public RegenerativeFluid(AbstractBlock.Settings settings, Boolean ReplaceWithBedrock, ItemStack bucketIn, Optional<SoundEvent> bucketSoundIn, int XPmin, int XPmax, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        this(settings, ReplaceWithBedrock, bucketIn, bucketSoundIn, UniformIntProvider.create(XPmin, XPmax), durabilityProvider, infinite, silk_able, replaceBlock);

    }

    public RegenerativeFluid(AbstractBlock.Settings settings, Boolean ReplaceWithBedrock, Fluid fluidIn, UniformIntProvider experienceDropped, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        super(settings, ReplaceWithBedrock, experienceDropped, durabilityProvider, infinite, silk_able, replaceBlock);
        this.fluid = fluidIn;
        this.BucketItem = ItemStack.EMPTY;
        this.BucketSound = Fluids.WATER.getBucketFillSound();
    }
    public RegenerativeFluid(AbstractBlock.Settings settings, Boolean ReplaceWithBedrock, ItemStack bucketIn, Optional<SoundEvent> bucketSoundIn, UniformIntProvider experienceDropped, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        super(settings, ReplaceWithBedrock, experienceDropped, durabilityProvider, infinite, silk_able, replaceBlock);
        this.fluid = Fluids.EMPTY;
        this.BucketItem = bucketIn;
        this.BucketSound = bucketSoundIn;

    }

    @Override
    public ItemStack tryDrainFluid(WorldAccess world, BlockPos pos, BlockState state) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof RegenerativeBlockEntity && !world.isClient()) {
            ((RegenerativeBlockEntity)blockEntity).damageBlock(state);
        }
        if (this.fluid != Fluids.EMPTY) {
            return new ItemStack(this.fluid.getBucketItem());
        }
        return this.BucketItem;
    }

    @Override
    public Optional<SoundEvent> getBucketFillSound() {
        if (this.fluid != Fluids.EMPTY) {
            return this.fluid.getBucketFillSound();
        }
        return BucketSound;
    }

    @Override
    public FluidState getFluidState(BlockState state) { return this.fluid.getDefaultState(); }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        state.getFluidState().onRandomTick(world, pos, random);
    }
}
