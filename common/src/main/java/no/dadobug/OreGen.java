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
import no.dadobug.configs.DimensionType;
import no.dadobug.worldgen.BedrockOreFeatureConfig;
import no.dadobug.worldgen.BedrockOreGenerator;
import no.dadobug.worldgen.OreGenConfig;
import no.dadobug.configs.OreType;

import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;

public class OreGen {
    private ConfiguredFeature<?,?> Ore;
    private PlacedFeature PlacedOre;
    private String id;

    public OreGen GenBottom(RuleTest replaced, int size, int chance, BlockState ore, String id){
        this.Ore = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(EntryModule.modid, id), new ConfiguredFeature<>(EntryModule.BEDROCK_ORE_GENERATOR.get(),new BedrockOreFeatureConfig(replaced, ore, size, 1, true)));
        this.PlacedOre = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(EntryModule.modid, id), new PlacedFeature(RegistryEntry.of(this.Ore) , List.of(RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.getBottom()), BiomePlacementModifier.of())));
        this.id = id;

        return this;
    }

    public OreGen GenTop(RuleTest replaced, int size, int chance, BlockState ore, String id){
        this.Ore = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(EntryModule.modid, id), new ConfiguredFeature<>(EntryModule.BEDROCK_ORE_GENERATOR.get(),new BedrockOreFeatureConfig(replaced, ore, size, 1, false)));
        this.PlacedOre = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(EntryModule.modid, id), new PlacedFeature(RegistryEntry.of(this.Ore) , List.of(RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getTop(), YOffset.getTop()), BiomePlacementModifier.of())));
        this.id = id;

        return this;
    }

    public OreGen GenAll(RuleTest replaced, int size, int count, BlockState ore, String id){
        this.Ore = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(EntryModule.modid, id), new ConfiguredFeature<>(Feature.ORE,new OreFeatureConfig(replaced, ore, size)));
        this.PlacedOre = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(EntryModule.modid, id), new PlacedFeature(RegistryEntry.of(this.Ore) , List.of(CountPlacementModifier.of(count), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getTop(), YOffset.getBottom()), BiomePlacementModifier.of())));
        this.id = id;

        return this;
    }

    public OreGen GenBottom(int chance, ConfiguredFeature<?,?> ore, String id){
        this.Ore = ore;
        this.PlacedOre = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(EntryModule.modid, id), new PlacedFeature(RegistryEntry.of(this.Ore) , List.of(RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.getBottom()), BiomePlacementModifier.of())));
        this.id = id;

        return this;
    }

    public OreGen GenTop(int chance, ConfiguredFeature<?,?> ore, String id){
        this.Ore = ore;
        this.PlacedOre = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(EntryModule.modid, id), new PlacedFeature(RegistryEntry.of(this.Ore) , List.of(RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getTop(), YOffset.getTop()), BiomePlacementModifier.of())));
        this.id = id;

        return this;
    }

    public OreGen GenAll(int count, ConfiguredFeature<?,?> ore, String id){
        this.Ore = ore;
        this.PlacedOre = Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(EntryModule.modid, id), new PlacedFeature(RegistryEntry.of(this.Ore) , List.of(CountPlacementModifier.of(count), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getTop(), YOffset.getBottom()), BiomePlacementModifier.of())));
        this.id = id;

        return this;
    }



    public PlacedFeature getPlacedOre() {return this.PlacedOre;}

    public ConfiguredFeature<?,?> getOre() {
        return this.Ore;
    }

    public void addOreToGen(Predicate<BiomeModifications.BiomeContext> where, boolean doIt, DimensionType dimension, OreType ore){
        if (doIt) {
            // If the dimension has no ores or if the dimension doesn't have this ore yet then generate it
            if (OreGenConfig.GENERATED_ORES.get(dimension) == null || !OreGenConfig.GENERATED_ORES.get(dimension).contains(ore)) {
                BiomeModifications.addProperties(
                        where,
                        (ctx, mutable) -> mutable.getGenerationProperties().addFeature(GenerationStep.Feature.UNDERGROUND_ORES, BuiltinRegistries.PLACED_FEATURE.entryOf(BuiltinRegistries.PLACED_FEATURE.getKey(this.PlacedOre).get()))
                );
                
                if (OreGenConfig.GENERATED_ORES.get(dimension) == null) {
                    HashSet<OreType> ores = new HashSet<>();
                    ores.add(ore);
                    OreGenConfig.GENERATED_ORES.put(dimension, ores);
                } else {
                    OreGenConfig.GENERATED_ORES.get(dimension).add(ore);
                }
                
            }
        }
    }
}
