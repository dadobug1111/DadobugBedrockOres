package no.dadobug.configs;

import dev.architectury.platform.Platform;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import no.dadobug.BiomeSelectors;
import no.dadobug.EntryModule;
import no.dadobug.OreGen;
import no.dadobug.blocks.BedrockStates;

public class OreConfig {
    public static final RuleTest BEDROCK = new BlockMatchRuleTest(Blocks.BEDROCK);
    public static final RuleTest ENDSTONE = new BlockMatchRuleTest(Blocks.END_STONE);


    //overworld
    public static OreGen ORE_COAL_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 20, 3, EntryModule.BEDROCK_COAL_ORE.get().getDefaultState(), "ore_coal_bedrock_overworld");
    public static OreGen ORE_IRON_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 9, 5, EntryModule.BEDROCK_IRON_ORE.get().getDefaultState(), "ore_iron_bedrock_overworld");
    public static OreGen ORE_GOLD_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 9, 7, EntryModule.BEDROCK_GOLD_ORE.get().getDefaultState(), "ore_gold_bedrock_overworld");
    public static OreGen ORE_DIAMOND_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 8, 12, EntryModule.BEDROCK_DIAMOND_ORE.get().getDefaultState(), "ore_diamond_bedrock_overworld");
    public static OreGen ORE_REDSTONE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 11, 6, EntryModule.BEDROCK_REDSTONE_ORE.get().getDefaultState(), "ore_redstone_bedrock_overworld");
    public static OreGen ORE_COPPER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 13, 3, EntryModule.BEDROCK_COPPER_ORE.get().getDefaultState(), "ore_copper_bedrock_overworld");
    public static OreGen ORE_LAPIS_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 9, 9, EntryModule.BEDROCK_LAPIS_ORE.get().getDefaultState(), "ore_lapis_bedrock_overworld");
    public static OreGen ORE_EMERALD_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 3, 2, EntryModule.BEDROCK_EMERALD_ORE.get().getDefaultState(), "ore_emerald_bedrock_overworld");
    public static OreGen ORE_HOLLOW_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 40, 16, EntryModule.BEDROCK_HOLLOW.get().getDefaultState(), "ore_hollow_bedrock_overworld");

    public static OreGen ORE_WATER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 15, 3, EntryModule.BEDROCK_WATER_ORE.get().getDefaultState(), "ore_water_bedrock_overworld");
    public static OreGen ORE_LAVA_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 5, 8, EntryModule.BEDROCK_LAVA_ORE.get().getDefaultState(), "ore_lava_bedrock_overworld");

    public static OreGen ORE_MILK_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 30, 24, EntryModule.BEDROCK_MILK_ORE.get().getDefaultState(), "ore_milk_bedrock_overworld");
    public static OreGen ORE_COOKIE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 30, 24, EntryModule.BEDROCK_COOKIE_ORE.get().getDefaultState(), "ore_cookie_bedrock_overworld");


    //nether
    public static OreGen ORE_NETHER_GOLD_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, 10, 1, EntryModule.BEDROCK_NETHER_GOLD.get().getDefaultState(), "ore_nether_gold_bedrock_nether");
    public static OreGen ORE_NETHER_QUARTZ_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, 5, 2, EntryModule.BEDROCK_NETHER_QUARTZ.get().getDefaultState(), "ore_nether_quartz_bedrock_nether");
    public static OreGen ORE_ANCIENT_DEBRIS_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, 4, 16, EntryModule.BEDROCK_ANCIENT_DEBRIS.get().getDefaultState(), "ore_ancient_debris_bedrock_nether");
    public static OreGen ORE_HOLLOW_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, 50, 14, EntryModule.BEDROCK_HOLLOW.get().getDefaultState(), "ore_hollow_bedrock_nether");

    public static OreGen ORE_LAVA_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, 30, 3, EntryModule.BEDROCK_LAVA_ORE.get().getDefaultState(), "ore_lava_bedrock_nether");


    public static OreGen ORE_NETHER_GOLD_BEDROCK_NETHER_TOP = new OreGen().GenTop( 1, ORE_NETHER_GOLD_BEDROCK_NETHER.getOre(), "ore_nether_gold_bedrock_nether_top");
    public static OreGen ORE_NETHER_QUARTZ_BEDROCK_NETHER_TOP = new OreGen().GenTop( 2, ORE_NETHER_QUARTZ_BEDROCK_NETHER.getOre(), "ore_nether_quartz_bedrock_nether_top");
    public static OreGen ORE_ANCIENT_DEBRIS_BEDROCK_NETHER_TOP = new OreGen().GenTop( 24, ORE_ANCIENT_DEBRIS_BEDROCK_NETHER.getOre(), "ore_ancient_debris_bedrock_nether_top");
    public static OreGen ORE_HOLLOW_BEDROCK_NETHER_TOP = new OreGen().GenTop( 12, ORE_HOLLOW_BEDROCK_NETHER.getOre(), "ore_hollow_bedrock_nether_top");

    public static OreGen ORE_LAVA_BEDROCK_NETHER_TOP = new OreGen().GenTop( 3, ORE_LAVA_BEDROCK_NETHER.getOre(), "ore_lava_bedrock_nether_top");

    //end
    public static OreGen ORE_HOLLOW_BEDROCK_END = new OreGen().GenAll(ENDSTONE, 60, 1, EntryModule.BEDROCK_HOLLOW.get().getDefaultState().with(BedrockStates.REPLACE_WITH_BEDROCK, false), "ore_hollow_bedrock_end");



    //techreborn overworld
    public static OreGen ORE_BAUXITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 6, 5, EntryModule.BEDROCK_BAUXITE_ORE.get().getDefaultState(), "ore_bauxite_bedrock_overworld");
    public static OreGen ORE_GALENA_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 8, 5, EntryModule.BEDROCK_GALENA_ORE.get().getDefaultState(), "ore_galena_bedrock_overworld");
    public static OreGen ORE_IRIDIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 3, 12, EntryModule.BEDROCK_IRIDIUM_ORE.get().getDefaultState(), "ore_iridium_bedrock_overworld");
    public static OreGen ORE_LEAD_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 6, 2, EntryModule.BEDROCK_LEAD_ORE.get().getDefaultState(), "ore_lead_bedrock_overworld");
    public static OreGen ORE_RUBY_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 6, 8, EntryModule.BEDROCK_RUBY_ORE.get().getDefaultState(), "ore_ruby_bedrock_overworld");
    public static OreGen ORE_SAPPHIRE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 6, 9, EntryModule.BEDROCK_SAPPHIRE_ORE.get().getDefaultState(), "ore_sapphire_bedrock_overworld");
    public static OreGen ORE_SILVER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 6, 2, EntryModule.BEDROCK_SILVER_ORE.get().getDefaultState(), "ore_silver_bedrock_overworld");
    public static OreGen ORE_TIN_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 8, 2, EntryModule.BEDROCK_TIN_ORE.get().getDefaultState(), "ore_tin_bedrock_overworld");

    //techreborn nether
    public static OreGen ORE_CINNABAR_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 6, 11, EntryModule.BEDROCK_SAPPHIRE_ORE.get().getDefaultState(), "ore_cinnabar_bedrock_nether");
    public static OreGen ORE_PYRITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 6, 10, EntryModule.BEDROCK_SILVER_ORE.get().getDefaultState(), "ore_pyrite_bedrock_nether");
    public static OreGen ORE_SPHALERITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 6, 12, EntryModule.BEDROCK_TIN_ORE.get().getDefaultState(), "ore_sphalerite_bedrock_overworld_nether");

    public static OreGen ORE_CINNABAR_BEDROCK_OVERWORLD_TOP = new OreGen().GenTop(1, ORE_CINNABAR_BEDROCK_OVERWORLD.getOre(),  "ore_cinnabar_bedrock_nether_top");
    public static OreGen ORE_PYRITE_BEDROCK_OVERWORLD_TOP = new OreGen().GenTop(1, ORE_PYRITE_BEDROCK_OVERWORLD.getOre(), "ore_pyrite_bedrock_nether_top");
    public static OreGen ORE_SPHALERITE_BEDROCK_OVERWORLD_TOP = new OreGen().GenTop(1, ORE_SPHALERITE_BEDROCK_OVERWORLD.getOre(), "ore_sphalerite_bedrock_nether_top");

    //techreborn end
    public static OreGen ORE_PERIDOT_BEDROCK_END = new OreGen().GenAll(ENDSTONE, 6, 6, EntryModule.BEDROCK_PERIDOT_ORE.get().getDefaultState(), "ore_peridot_bedrock_end");
    public static OreGen ORE_SHELDONITE_BEDROCK_END = new OreGen().GenAll(ENDSTONE, 6, 4, EntryModule.BEDROCK_SHELDONITE_ORE.get().getDefaultState(), "ore_sheldonite_bedrock_end");
    public static OreGen ORE_SODALITE_BEDROCK_END = new OreGen().GenAll(ENDSTONE, 6, 4, EntryModule.BEDROCK_SODALITE_ORE.get().getDefaultState(), "ore_sodalite_bedrock_end");
    public static OreGen ORE_TUNGSTEN_BEDROCK_END = new OreGen().GenAll(ENDSTONE, 6, 2, EntryModule.BEDROCK_TUNGSTEN_ORE.get().getDefaultState(), "ore_tungsten_bedrock_end");



    //tconstruct
    public static OreGen ORE_TC_COBALT_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, 4, 10, EntryModule.BEDROCK_TC_COBALT_ORE.get().getDefaultState(), "ore_tc_cobalt_bedrock_nether");

    public static OreGen ORE_TC_COBALT_BEDROCK_NETHER_TOP = new OreGen().GenTop(10, ORE_TC_COBALT_BEDROCK_NETHER.getOre(),  "ore_tc_cobalt_bedrock_nether_top");



    //ae2
    public static OreGen ORE_AE_CERTUS_QUARTZ_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 8, 4, EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE.get().getDefaultState(), "ore_ae_certus_quartz_bedrock_overworld");



    //bigreactors (Extreme Reactors)
    public static OreGen ORE_ER_YELLORITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 8, 8, EntryModule.BEDROCK_ER_YELLORITE_ORE.get().getDefaultState(), "ore_er_yellorium_bedrock_overworld");

    public static OreGen ORE_ER_ANGLESITE_BEDROCK_END = new OreGen().GenAll(BEDROCK, 8, 4, EntryModule.BEDROCK_ER_ANGLESITE_ORE.get().getDefaultState(), "ore_er_anglesite_bedrock_end");

    public static OreGen ORE_ER_BENITOITE_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, 8, 10, EntryModule.BEDROCK_ER_BENITOITE_ORE.get().getDefaultState(), "ore_er_benitoite_bedrock_nether");

    public static OreGen ORE_ER_BENITOITE_BEDROCK_NETHER_TOP = new OreGen().GenTop(BEDROCK, 10, 8, EntryModule.BEDROCK_ER_BENITOITE_ORE.get().getDefaultState(), "ore_er_benitoite_bedrock_nether_top");



    //biggerreactors
    public static OreGen ORE_BR_URANIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 8, 8, EntryModule.BEDROCK_BR_URANIUM_ORE.get().getDefaultState(), "ore_br_uranium_bedrock_overworld");



    //immersiveengineering
    public static OreGen ORE_IE_ALUMINUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 6, 3, EntryModule.BEDROCK_IE_ALUMINUM_ORE.get().getDefaultState(), "ore_ie_aluminum_bedrock_overworld");
    public static OreGen ORE_IE_LEAD_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 8, 5, EntryModule.BEDROCK_IE_LEAD_ORE.get().getDefaultState(), "ore_ie_lead_bedrock_overworld");
    public static OreGen ORE_IE_SILVER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 9, 6, EntryModule.BEDROCK_IE_SILVER_ORE.get().getDefaultState(), "ore_ie_silver_bedrock_overworld");
    public static OreGen ORE_IE_NICKEL_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 7, 5, EntryModule.BEDROCK_IE_NICKEL_ORE.get().getDefaultState(), "ore_ie_nickel_bedrock_overworld");
    public static OreGen ORE_IE_URANIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, 4, 7, EntryModule.BEDROCK_IE_URANIUM_ORE.get().getDefaultState(), "ore_ie_uranium_bedrock_overworld");


    public static void init(){
        ORE_COAL_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
        ORE_IRON_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
        ORE_GOLD_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
        ORE_DIAMOND_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
        ORE_REDSTONE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
        ORE_COPPER_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
        ORE_LAPIS_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
        ORE_EMERALD_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensEmeralds());
        ORE_WATER_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
        ORE_LAVA_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
        ORE_MILK_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
        ORE_COOKIE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
        ORE_HOLLOW_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());


        ORE_NETHER_GOLD_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether());
        ORE_NETHER_QUARTZ_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether());
        ORE_ANCIENT_DEBRIS_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether());
        ORE_LAVA_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether());
        ORE_HOLLOW_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether());

        ORE_NETHER_GOLD_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether());
        ORE_NETHER_QUARTZ_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether());
        ORE_ANCIENT_DEBRIS_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether());
        ORE_LAVA_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether());
        ORE_HOLLOW_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether());

        ORE_HOLLOW_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd());


        if(Platform.isModLoaded("techreborn")) {
            ORE_BAUXITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_GALENA_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_IRIDIUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_LEAD_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_RUBY_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_SAPPHIRE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_SILVER_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_TIN_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());

            ORE_CINNABAR_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInNether());
            ORE_PYRITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInNether());
            ORE_SPHALERITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInNether());

            ORE_CINNABAR_BEDROCK_OVERWORLD_TOP.addOreToGen(BiomeSelectors.gensInNether());
            ORE_PYRITE_BEDROCK_OVERWORLD_TOP.addOreToGen(BiomeSelectors.gensInNether());
            ORE_SPHALERITE_BEDROCK_OVERWORLD_TOP.addOreToGen(BiomeSelectors.gensInNether());

            ORE_PERIDOT_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd());
            ORE_SHELDONITE_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd());
            ORE_SODALITE_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd());
            ORE_TUNGSTEN_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd());
        }
        if(Platform.isModLoaded("tconstruct")) {
            ORE_TC_COBALT_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether());

            ORE_TC_COBALT_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether());
        }
        if(Platform.isModLoaded("ae2")) {
            ORE_AE_CERTUS_QUARTZ_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
        }
        if(Platform.isModLoaded("bigreactors")) {
            ORE_ER_YELLORITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_ER_ANGLESITE_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd());
            ORE_ER_BENITOITE_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether());

            ORE_ER_BENITOITE_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether());
        }
        if(Platform.isModLoaded("biggerreactors")) {
            ORE_BR_URANIUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
        }
        if(Platform.isModLoaded("immersiveengineering")) {
            ORE_IE_ALUMINUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_IE_LEAD_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_IE_SILVER_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_IE_NICKEL_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_IE_URANIUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
        }
    }


}
