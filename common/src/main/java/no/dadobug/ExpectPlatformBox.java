package no.dadobug;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;

import java.util.Optional;

public class ExpectPlatformBox {

    @ExpectPlatform
    public static Block newBedrockOre(AbstractBlock.Settings settings, boolean replaceWithBedrock){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Block newBedrockFluid(AbstractBlock.Settings settings, boolean replaceWithBedrock, Fluid fluidIn){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Block newBedrockFluid(AbstractBlock.Settings settings, boolean replaceWithBedrock, ItemStack bucketIn, Optional<SoundEvent> bucketSoundIn){
        throw new AssertionError();
    }




}
