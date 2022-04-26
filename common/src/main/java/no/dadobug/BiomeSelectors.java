package no.dadobug;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.registry.level.biome.BiomeModifications;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registries;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.*;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.biome.source.MultiNoiseBiomeSource;
import net.minecraft.world.biome.source.TheEndBiomeSource;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.gen.feature.OrePlacedFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

public class BiomeSelectors {
    private BiomeSelectors() {}
    public static BiomeSource overworld = MultiNoiseBiomeSource.Preset.OVERWORLD.getBiomeSource(BuiltinRegistries.BIOME);
    public static BiomeSource nether = MultiNoiseBiomeSource.Preset.NETHER.getBiomeSource(BuiltinRegistries.BIOME);
    public static BiomeSource end = new TheEndBiomeSource(BuiltinRegistries.BIOME, 0);

    public static Predicate<BiomeModifications.BiomeContext> gensFeature(RegistryEntry<PlacedFeature> FeatureIn) {

        return context -> context.getProperties().getGenerationProperties().getFeatures().stream().anyMatch((ctx) -> {
            for (RegistryEntry<PlacedFeature> placedFeatureRegistryEntry : ctx) {
                if (Objects.equals(BuiltinRegistries.PLACED_FEATURE.getOrEmpty(placedFeatureRegistryEntry.getKey().orElse(null)).orElse(null), FeatureIn.value()))
                    return true;
            }

            return false;
        });

        /*
        return context -> {
            for(int i=0; i<context.getProperties().getGenerationProperties().getFeatures().size(); i++) {
                List<Supplier<PlacedFeature>> next = context.getProperties().getGenerationProperties().getFeatures().get(i);
                for(int j=0; j<context.getProperties().getGenerationProperties().getFeatures().size(); j++){
                    Supplier<PlacedFeature> nextnext = next.get(i);
                    if(nextnext.get().equals(FeatureIn))return true;
                }
            }

            return false;
        };
         */
    }

    public static Predicate<BiomeModifications.BiomeContext> gensEmeralds() {
        return BiomeSelectors.gensFeature(OrePlacedFeatures.ORE_EMERALD);
    }

    public static Optional<World> getWorld(MinecraftServer server, RegistryKey<World> world) {
        return Optional.ofNullable(server.getWorld(RegistryKey.of(Registry.WORLD_KEY, world.getValue())));
    }



    public static Predicate<BiomeModifications.BiomeContext> inCategory(Biome.Category category) {
        return (ctx)->ctx.getProperties().getCategory() == category;
    }

    public static Predicate<BiomeModifications.BiomeContext> hasTag(Tag<Biome> tag) {
        return context -> tag.values().contains(BuiltinRegistries.BIOME.get(context.getKey()));
    }

    public static Predicate<BiomeModifications.BiomeContext> gensInSource(BiomeSource sourceIn) {
        return context -> sourceIn.getBiomes().stream().anyMatch(biome -> biome.value().equals(BuiltinRegistries.BIOME.get(context.getKey())));
    }

    @ExpectPlatform
    public static Predicate<BiomeModifications.BiomeContext> gensInOverworld() {
        return gensInSource(overworld);
    }

    @ExpectPlatform
    public static Predicate<BiomeModifications.BiomeContext> gensInNether() {
        return gensInSource(nether);
    }

    @ExpectPlatform
    public static Predicate<BiomeModifications.BiomeContext> gensInEnd() {
        return gensInSource(end);
    }
}
