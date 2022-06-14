package no.dadobug;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.MutableText;
import no.dadobug.blocks.BedrockStates;
import no.dadobug.configs.BlockConfig;
import no.dadobug.configs.BlockConfigLambda;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public final class BedrockStack {
    private final RegistrySupplier<Block> ore;
    private final RegistrySupplier<Item> oreItem;
    private final RegistrySupplier<Item> core;

    public BedrockStack(RegistrySupplier<Block> ore, RegistrySupplier<Item> oreItem, RegistrySupplier<Item> core) {
        this.ore = ore;
        this.oreItem = oreItem;
        this.core = core;
    }


    public static BedrockStack BedrockStackAlteredBedrock(String name, BlockConfig config, BlockConfigLambda<Item.Settings> itemSettings, BlockConfigLambda<AbstractBlock.Settings> blockSettings, boolean replaceWithBedrock, MutableText toolTip) {
        return new BedrockStack(name, "bedrock_", "", "regenerative_", "", config, itemSettings, blockSettings, replaceWithBedrock, toolTip);
    }

    public static BedrockStack BedrockStackStandardOre(String name, BlockConfig config, BlockConfigLambda<Item.Settings> itemSettings, BlockConfigLambda<AbstractBlock.Settings> blockSettings, boolean replaceWithBedrock, MutableText toolTip) {
        return new BedrockStack(name, "bedrock_", "_ore", "regenerative_", "", config, itemSettings, blockSettings, replaceWithBedrock, toolTip);
    }

    public static BedrockStack BedrockStackFluidOre(String name, BlockConfig config, BlockConfigLambda<Item.Settings> itemSettings, BlockConfigLambda<AbstractBlock.Settings> blockSettings, boolean replaceWithBedrock, MutableText toolTip, Fluid fluid) {
        return new BedrockStack(name, "bedrock_", "_ore", "regenerative_", "", config, itemSettings, blockSettings, replaceWithBedrock, toolTip, fluid);
    }

    public static BedrockStack BedrockStackFluidOre(String name, BlockConfig config, BlockConfigLambda<Item.Settings> itemSettings, BlockConfigLambda<AbstractBlock.Settings> blockSettings, boolean replaceWithBedrock, MutableText toolTip, ItemStack bucketIn, Optional<SoundEvent> bucketSoundIn) {
        return new BedrockStack(name, "bedrock_", "_ore", "regenerative_", "", config, itemSettings, blockSettings, replaceWithBedrock, toolTip, bucketIn, bucketSoundIn);
    }
    //


    public BedrockStack(String name, String orePrefix, String oreSuffix, String corePrefix, String coreSuffix, BlockConfig config, BlockConfigLambda<Item.Settings> itemSettings, BlockConfigLambda<AbstractBlock.Settings> blockSettings, boolean replaceWithBedrock, MutableText toolTip) {
        this.ore = EntryModule.BLOCKS.register(orePrefix + name + oreSuffix, () -> ExpectPlatformBox.newBedrockOre(blockSettings.get(config), replaceWithBedrock, config.XPmin, config.XPmax));
        this.oreItem = EntryModule.ITEMS.register(orePrefix + name + oreSuffix, () -> new BlockItem(this.ore.get(), itemSettings.get(config)));
        this.core = EntryModule.ITEMS.register(corePrefix + name + coreSuffix, () -> new RegenerativeCore(itemSettings.get(config), this.ore.get(), toolTip));
    }
    public BedrockStack(String name, String orePrefix, String oreSuffix, String corePrefix, String coreSuffix, BlockConfig config, BlockConfigLambda<Item.Settings> itemSettings, BlockConfigLambda<AbstractBlock.Settings> blockSettings, boolean replaceWithBedrock, MutableText toolTip, Fluid fluid) {
        this.ore = EntryModule.BLOCKS.register(orePrefix + name + oreSuffix, () -> ExpectPlatformBox.newBedrockFluid(blockSettings.get(config), replaceWithBedrock, fluid, config.XPmin, config.XPmax));
        this.oreItem = EntryModule.ITEMS.register(orePrefix + name + oreSuffix, () -> new BlockItem(this.ore.get(), itemSettings.get(config)));
        this.core = EntryModule.ITEMS.register(corePrefix + name + coreSuffix, () -> new RegenerativeCore(itemSettings.get(config), this.ore.get(), toolTip));
    }
    public BedrockStack(String name, String orePrefix, String oreSuffix, String corePrefix, String coreSuffix, BlockConfig config, BlockConfigLambda<Item.Settings> itemSettings, BlockConfigLambda<AbstractBlock.Settings> blockSettings, boolean replaceWithBedrock, MutableText toolTip, ItemStack bucketIn, Optional<SoundEvent> bucketSoundIn) {
        this.ore = EntryModule.BLOCKS.register(orePrefix + name + oreSuffix, () -> ExpectPlatformBox.newBedrockFluid(blockSettings.get(config), replaceWithBedrock, bucketIn, bucketSoundIn, config.XPmin, config.XPmax));
        this.oreItem = EntryModule.ITEMS.register(orePrefix + name + oreSuffix, () -> new BlockItem(this.ore.get(), itemSettings.get(config)));
        this.core = EntryModule.ITEMS.register(corePrefix + name + coreSuffix, () -> new RegenerativeCore(itemSettings.get(config), this.ore.get(), toolTip));
    }

    public RegistrySupplier<Block> ore() {
        return ore;
    }

    public RegistrySupplier<Item> oreItem() {
        return oreItem;
    }

    public RegistrySupplier<Item> core() {
        return core;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (BedrockStack) obj;
        return Objects.equals(this.ore, that.ore) &&
                Objects.equals(this.oreItem, that.oreItem) &&
                Objects.equals(this.core, that.core);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ore, oreItem, core);
    }

    @Override
    public String toString() {
        return "BedrockStack[" +
                "ore=" + ore + ", " +
                "oreItem=" + oreItem + ", " +
                "core=" + core + ']';
    }


}
