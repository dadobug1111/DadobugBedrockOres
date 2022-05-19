package no.dadobug;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.text.MutableText;
import no.dadobug.blocks.BedrockStates;

import java.util.Objects;
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


    public static BedrockStack BedrockStackAlteredBedrock(String name, Supplier<Item.Settings> itemSettings, AbstractBlock.Settings blockSettings, boolean replaceWithBedrock, MutableText toolTip) {
        return new BedrockStack(name, "bedrock_", "", "regenerative_", "", itemSettings, blockSettings, replaceWithBedrock, toolTip);
    }

    public BedrockStack BedrockStackStandardOre(String name, Supplier<Item.Settings> itemSettings, AbstractBlock.Settings blockSettings, boolean replaceWithBedrock, MutableText toolTip) {
        return new BedrockStack(name, "bedrock_", "_ore", "regenerative_", "", itemSettings, blockSettings, replaceWithBedrock, toolTip);
    }

    public BedrockStack BedrockStackFluidOre(String name, Supplier<Item.Settings> itemSettings, AbstractBlock.Settings blockSettings, boolean replaceWithBedrock, MutableText toolTip, Fluid fluid) {
        return new BedrockStack(name, "bedrock_", "_ore", "regenerative_", "", itemSettings, blockSettings, replaceWithBedrock, toolTip, fluid);
    }


    public BedrockStack(String name, String orePrefix, String oreSuffix, String corePrefix, String coreSuffix, Supplier<Item.Settings> itemSettings, AbstractBlock.Settings blockSettings, boolean replaceWithBedrock, MutableText toolTip) {
        this.ore = EntryModule.BLOCKS.register(orePrefix + name + oreSuffix, () -> ExpectPlatformBox.newBedrockOre(blockSettings, replaceWithBedrock));
        this.oreItem = EntryModule.ITEMS.register(orePrefix + name + oreSuffix, () -> new BlockItem(this.ore.get(), itemSettings.get()));
        this.core = EntryModule.ITEMS.register(corePrefix + name + coreSuffix, () -> new RegenerativeCore(itemSettings.get(), this.ore.get(), toolTip));
    }
    public BedrockStack(String name, String orePrefix, String oreSuffix, String corePrefix, String coreSuffix, Supplier<Item.Settings> itemSettings, AbstractBlock.Settings blockSettings, boolean replaceWithBedrock, MutableText toolTip, Fluid fluid) {
        this.ore = EntryModule.BLOCKS.register(orePrefix + name + oreSuffix, () -> ExpectPlatformBox.newBedrockFluid(blockSettings, replaceWithBedrock, fluid));
        this.oreItem = EntryModule.ITEMS.register(orePrefix + name + oreSuffix, () -> new BlockItem(this.ore.get(), itemSettings.get()));
        this.core = EntryModule.ITEMS.register(corePrefix + name + coreSuffix, () -> new RegenerativeCore(itemSettings.get(), this.ore.get(), toolTip));
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