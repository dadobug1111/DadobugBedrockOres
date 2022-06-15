package no.dadobug;



import dev.architectury.registry.level.biome.BiomeModifications;
import net.minecraft.block.BlockState;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;
import java.util.function.Predicate;

public class OreGen {
    private ConfiguredFeature<?,?> Ore;
    private PlacedFeature PlacedOre;
    private String id;

    public OreGen GenBottom(RuleTest replaced, int size, int chance, BlockState ore, String id){
        this.Ore = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(EntryModule.modid, id), new ConfiguredFeature<>(Feature.ORE,new OreFeatureConfig(replaced, ore, size)));
        this.PlacedOre = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(EntryModule.modid, id), new PlacedFeature(RegistryEntry.of(this.Ore) , List.of(RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(5)), BiomePlacementModifier.of())));
        this.id = id;

        return this;
    }

    public OreGen GenTop(RuleTest replaced, int size, int chance, BlockState ore, String id){
        this.Ore = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(EntryModule.modid, id), new ConfiguredFeature<>(Feature.ORE,new OreFeatureConfig(replaced, ore, size)));
        this.PlacedOre = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(EntryModule.modid, id), new PlacedFeature(RegistryEntry.of(this.Ore) , List.of(RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.belowTop(0), YOffset.belowTop(5)), BiomePlacementModifier.of())));
        this.id = id;

        return this;
    }

    public OreGen GenAll(RuleTest replaced, int size, int count, BlockState ore, String id){
        this.Ore = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(EntryModule.modid, id), new ConfiguredFeature<>(Feature.ORE,new OreFeatureConfig(replaced, ore, size)));
        this.PlacedOre = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(EntryModule.modid, id), new PlacedFeature(RegistryEntry.of(this.Ore) , List.of(CountPlacementModifier.of(count), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.belowTop(0), YOffset.aboveBottom(0)), BiomePlacementModifier.of())));
        this.id = id;

        return this;
    }

    public OreGen GenBottom(int chance, ConfiguredFeature<?,?> ore, String id){
        this.Ore = ore;
        this.PlacedOre = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(EntryModule.modid, id), new PlacedFeature(RegistryEntry.of(this.Ore) , List.of(RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(5)), BiomePlacementModifier.of())));
        this.id = id;

        return this;
    }

    public OreGen GenTop(int chance, ConfiguredFeature<?,?> ore, String id){
        this.Ore = ore;
        this.PlacedOre = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(EntryModule.modid, id), new PlacedFeature(RegistryEntry.of(this.Ore) , List.of(RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.belowTop(0), YOffset.belowTop(5)), BiomePlacementModifier.of())));
        this.id = id;

        return this;
    }

    public OreGen GenAll(int count, ConfiguredFeature<?,?> ore, String id){
        this.Ore = ore;
        this.PlacedOre = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(EntryModule.modid, id), new PlacedFeature(RegistryEntry.of(this.Ore) , List.of(CountPlacementModifier.of(count), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.belowTop(0), YOffset.aboveBottom(0)), BiomePlacementModifier.of())));
        this.id = id;

        return this;
    }



    public PlacedFeature getPlacedOre() {return this.PlacedOre;}
    public ConfiguredFeature<?,?> getOre() {
        return this.Ore;
    }
    public void addOreToGen(Predicate<BiomeModifications.BiomeContext> where, boolean doIt){
        //BiomeModifications.addFeature(where, GenerationStep.Feature.UNDERGROUND_ORES, this.key);
        if (doIt) {
            BiomeModifications.addProperties(
                    where,
                    (ctx, mutable) -> mutable.getGenerationProperties().addFeature(GenerationStep.Feature.UNDERGROUND_ORES, this.PlacedOre)
            );
        }
    }
}
