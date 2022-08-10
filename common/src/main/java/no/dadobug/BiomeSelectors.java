package no.dadobug;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.registry.level.biome.BiomeModifications;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.*;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.biome.source.MultiNoiseBiomeSource;
import net.minecraft.world.biome.source.TheEndBiomeSource;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

public class BiomeSelectors {
    private BiomeSelectors() {}
    // Vanilla Biomes
    public static BiomeSource overworld = MultiNoiseBiomeSource.Preset.OVERWORLD.getBiomeSource(BuiltinRegistries.BIOME);
    public static BiomeSource nether = MultiNoiseBiomeSource.Preset.NETHER.getBiomeSource(BuiltinRegistries.BIOME);
    public static BiomeSource end = new TheEndBiomeSource(BuiltinRegistries.BIOME, 0);
    // Modded Biomes
    public static String[] undergardenBiomesIds = new String[]{"undergarden:forgotten_field", "undergarden:ancient_sea", "undergarden:frostfields", "undergarden:icy_sea", "undergarden:smogstem_forest", "undergarden:wigglewood_forest", "undergarden:dense_forest", "undergarden:gronglegrowth", "undergarden:barren_abyss", "undergarden:dead_sea", "undergarden:smog_spires", "undergarden:mushroom_bog"};
    public static ArrayList<String> undergardenBiomes = new ArrayList<>(Arrays.asList(undergardenBiomesIds));
    public static String[] beyondEarthMoonBiomesIds = new String[]{"beyond_earth:moon_desert"};
    public static ArrayList<String> beyondEarthMoonBiomes = new ArrayList<>(Arrays.asList(beyondEarthMoonBiomesIds));
    public static String[] beyondEarthMarsBiomesIds = new String[]{"beyond_earth:mars_desert", "beyond_earth:mars_rocky_plains", "beyond_earth:mars_ice_spikes"};
    public static ArrayList<String> beyondEarthMarsBiomes = new ArrayList<>(Arrays.asList(beyondEarthMarsBiomesIds));
    public static String[] beyondEarthVenusBiomesIds = new String[]{"beyond_earth:venus_desert", "beyond_earth:infernal_venus_barrens"};
    public static ArrayList<String> beyondEarthVenusBiomes = new ArrayList<>(Arrays.asList(beyondEarthVenusBiomesIds));
    public static String[] beyondEarthGlacioBiomesIds = new String[]{"beyond_earth:glacio", "beyond_earth:glacio_ice_spikes"};
    public static ArrayList<String> beyondEarthGlacioBiomes = new ArrayList<>(Arrays.asList(beyondEarthGlacioBiomesIds));

    public static Predicate<BiomeModifications.BiomeContext> gensFeature(RegistryEntry<PlacedFeature> FeatureIn) {

        return context -> context.getProperties().getGenerationProperties().getFeatures().stream().anyMatch((ctx) -> {
            for (RegistryEntry<PlacedFeature> placedFeatureRegistryEntry : ctx) {
                if (Objects.equals(BuiltinRegistries.PLACED_FEATURE.getOrEmpty(placedFeatureRegistryEntry.getKey().orElse(null)).orElse(null), FeatureIn.value()))
                    return true;
            }

            return false;
        });
    }

    public static Predicate<BiomeModifications.BiomeContext> gensEmeralds() {
        return (context) -> hasTag(TagKey.of(Registry.BIOME_KEY, new Identifier("minecraft", "is_mountain"))).test(context) || hasTag(TagKey.of(Registry.BIOME_KEY, new Identifier("minecraft", "is_hill"))).test(context) || BiomeKeys.GROVE.getValue().equals(context.getKey());
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

    public static Predicate<BiomeModifications.BiomeContext> hasTag(TagKey<Biome> tag) {
        return context -> BuiltinRegistries.BIOME.getEntryList(tag).stream().anyMatch((taglist) -> taglist.stream().anyMatch((biome) -> biome.matchesId(context.getKey())));
    }

    public static Predicate<BiomeModifications.BiomeContext> gensInSource(BiomeSource sourceIn) {
        return context -> sourceIn.getBiomes().stream().anyMatch(biome -> biome.value().equals(BuiltinRegistries.BIOME.get(context.getKey())));
    }

    @ExpectPlatform
    public static Predicate<BiomeModifications.BiomeContext> gensInBiome(Identifier identifier) {
        return context -> BuiltinRegistries.BIOME.get(identifier).equals(BuiltinRegistries.BIOME.get(context.getKey()));
    }

    public static Predicate<BiomeModifications.BiomeContext> gensInBiomeList(ArrayList<String> identifiers) {
        // Check if dimesion has biomes
        if (identifiers.isEmpty()) return ctx -> false;
        // If it does set predicate from first biome
        Predicate<BiomeModifications.BiomeContext> predicate = gensInBiome(new Identifier(identifiers.get(0)));
        // Then or  the rest together to check if biome is in dimension
        for (String biomeID : identifiers.subList(1, identifiers.size())) {
            predicate = predicate.or(gensInBiome(new Identifier(biomeID)));
        }
        return predicate;
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

    public static Predicate<BiomeModifications.BiomeContext> gensInUndergarden() {
        return gensInBiomeList(undergardenBiomes);
    }

    public static Predicate<BiomeModifications.BiomeContext> gensInBeyondEarthMoon() {
        return gensInBiomeList(beyondEarthMoonBiomes);
    } 

    public static Predicate<BiomeModifications.BiomeContext> gensInBeyondEarthMars() {
        return gensInBiomeList(beyondEarthMarsBiomes);
    } 

    public static Predicate<BiomeModifications.BiomeContext> gensInBeyondEarthVenus() {
        return gensInBiomeList(beyondEarthVenusBiomes);
    } 

    public static Predicate<BiomeModifications.BiomeContext> gensInBeyondEarthGlacio() {
        return gensInBiomeList(beyondEarthGlacioBiomes);
    } 
} 
