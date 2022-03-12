package no.dadobug.fabric;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import no.dadobug.Blocks.fabric.BedrockFluid;
import no.dadobug.Blocks.fabric.BedrockOre;

import java.util.Optional;

public class ExpectPlatformBoxImpl {

    public static Block newBedrockOre(AbstractBlock.Settings settings, boolean replaceWithBedrock){
        return new BedrockOre(settings, replaceWithBedrock);
    }


    public static Block newBedrockFluid(AbstractBlock.Settings settings, boolean replaceWithBedrock, Fluid fluidIn){
        return new BedrockFluid(settings, replaceWithBedrock, fluidIn);
    }


    public static Block newBedrockFluid(AbstractBlock.Settings settings, boolean replaceWithBedrock, ItemStack bucketIn, Optional<SoundEvent> bucketSoundIn){
        return new BedrockFluid(settings, replaceWithBedrock, bucketIn, bucketSoundIn);
    }
}
