package no.dadobug.fabric;

import dev.architectury.registry.level.biome.BiomeModifications;
import no.dadobug.BiomeSelectors;

import java.util.function.Predicate;

import static no.dadobug.BiomeSelectors.gensInSource;

public class BiomeSelectorsImpl {


    public static Predicate<BiomeModifications.BiomeContext> gensInOverworld() {
        return gensInSource(BiomeSelectors.overworld);
    }


    public static Predicate<BiomeModifications.BiomeContext> gensInNether() {
        return gensInSource(BiomeSelectors.nether);
    }


    public static Predicate<BiomeModifications.BiomeContext> gensInEnd() {
        return gensInSource(BiomeSelectors.end);
    }



}
