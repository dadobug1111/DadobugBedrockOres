package no.dadobug.blocks.forge;


import net.minecraft.block.BlockState;
import net.minecraft.block.FluidDrainable;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.WorldAccess;

import java.util.Optional;
import java.util.Random;

public class BedrockFluid extends BedrockOre implements FluidDrainable {
    protected final Fluid fluid;
    protected final ItemStack BucketItem;
    protected final Optional<SoundEvent> BucketSound;
    public BedrockFluid(Settings settings, Boolean ReplaceWithBedrock, Fluid fluidIn) {
        this(settings, ReplaceWithBedrock, fluidIn, UniformIntProvider.create(0, 0));
    }
    public BedrockFluid(Settings settings, Boolean ReplaceWithBedrock, ItemStack bucketIn, Optional<SoundEvent> bucketSoundIn) {
        this(settings, ReplaceWithBedrock, bucketIn, bucketSoundIn, UniformIntProvider.create(0, 0));

    }

    public BedrockFluid(Settings settings, Boolean ReplaceWithBedrock, Fluid fluidIn, int XPmin, int XPmax) {
        this(settings, ReplaceWithBedrock, fluidIn, UniformIntProvider.create(XPmin, XPmax));
    }
    public BedrockFluid(Settings settings, Boolean ReplaceWithBedrock, ItemStack bucketIn, Optional<SoundEvent> bucketSoundIn, int XPmin, int XPmax) {
        this(settings, ReplaceWithBedrock, bucketIn, bucketSoundIn, UniformIntProvider.create(XPmin, XPmax));

    }

    public BedrockFluid(Settings settings, Boolean ReplaceWithBedrock, Fluid fluidIn, UniformIntProvider experienceDropped) {
        super(settings, ReplaceWithBedrock, experienceDropped);
        this.fluid = fluidIn;
        this.BucketItem = ItemStack.EMPTY;
        this.BucketSound = Fluids.WATER.getBucketFillSound();
    }
    public BedrockFluid(Settings settings, Boolean ReplaceWithBedrock, ItemStack bucketIn, Optional<SoundEvent> bucketSoundIn, UniformIntProvider experienceDropped) {
        super(settings, ReplaceWithBedrock, experienceDropped);
        this.fluid = Fluids.EMPTY;
        this.BucketItem = bucketIn;
        this.BucketSound = bucketSoundIn;

    }

    @Override
    public ItemStack tryDrainFluid(WorldAccess world, BlockPos pos, BlockState state) {
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
