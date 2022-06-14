package no.dadobug.forge;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import no.dadobug.blocks.forge.BedrockFluid;
import no.dadobug.blocks.forge.BedrockOre;

import java.util.Optional;

public class ExpectPlatformBoxImpl {

    public static Block newBedrockOre(AbstractBlock.Settings settings, boolean replaceWithBedrock, int XPmin, int XPmax){
        return new BedrockOre(settings, replaceWithBedrock, XPmin, XPmax);
    }


    public static Block newBedrockFluid(AbstractBlock.Settings settings, boolean replaceWithBedrock, Fluid fluidIn, int XPmin, int XPmax){
        return new BedrockFluid(settings, replaceWithBedrock, fluidIn, XPmin, XPmax);
    }


    public static Block newBedrockFluid(AbstractBlock.Settings settings, boolean replaceWithBedrock, ItemStack bucketIn, Optional<SoundEvent> bucketSoundIn, int XPmin, int XPmax){
        return new BedrockFluid(settings, replaceWithBedrock, bucketIn, bucketSoundIn, XPmin, XPmax);
    }
}
