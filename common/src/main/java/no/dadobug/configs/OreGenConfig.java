package no.dadobug.configs;

import dev.architectury.platform.Platform;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import no.dadobug.BiomeSelectors;
import no.dadobug.EntryModule;
import no.dadobug.OreGen;
import no.dadobug.blocks.BedrockStates;

public class OreGenConfig {
    public static final RuleTest BEDROCK = new BlockMatchRuleTest(Blocks.BEDROCK);
    public static final RuleTest ENDSTONE = new BlockMatchRuleTest(Blocks.END_STONE);
    public static final MainConfig CONFIG = EntryModule.CONFIG;


    //overworld
    public static OreGen ORE_COAL_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_COAL_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_COAL_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_COAL_ORE.get().getDefaultState(), "ore_coal_bedrock_overworld");
    public static OreGen ORE_IRON_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IRON_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_IRON_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_IRON_ORE.get().getDefaultState(), "ore_iron_bedrock_overworld");
    public static OreGen ORE_GOLD_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_GOLD_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_GOLD_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_GOLD_ORE.get().getDefaultState(), "ore_gold_bedrock_overworld");
    public static OreGen ORE_DIAMOND_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_DIAMOND_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_DIAMOND_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_DIAMOND_ORE.get().getDefaultState(), "ore_diamond_bedrock_overworld");
    public static OreGen ORE_REDSTONE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_REDSTONE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_REDSTONE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_REDSTONE_ORE.get().getDefaultState(), "ore_redstone_bedrock_overworld");
    public static OreGen ORE_COPPER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_COPPER_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_COPPER_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_COPPER_ORE.get().getDefaultState(), "ore_copper_bedrock_overworld");
    public static OreGen ORE_LAPIS_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_LAPIS_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_LAPIS_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_LAPIS_ORE.get().getDefaultState(), "ore_lapis_bedrock_overworld");
    public static OreGen ORE_EMERALD_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_EMERALD_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_EMERALD_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_EMERALD_ORE.get().getDefaultState(), "ore_emerald_bedrock_overworld");
    public static OreGen ORE_HOLLOW_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_HOLLOW_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_HOLLOW_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_HOLLOW.get().getDefaultState(), "ore_hollow_bedrock_overworld");

    public static OreGen ORE_WATER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_WATER_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_WATER_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_WATER_ORE.get().getDefaultState(), "ore_water_bedrock_overworld");
    public static OreGen ORE_LAVA_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_LAVA_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_LAVA_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_LAVA_ORE.get().getDefaultState(), "ore_lava_bedrock_overworld");

    public static OreGen ORE_MILK_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MILK_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MILK_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MILK_ORE.get().getDefaultState(), "ore_milk_bedrock_overworld");
    public static OreGen ORE_COOKIE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_COOKIE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_COOKIE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_COOKIE_ORE.get().getDefaultState(), "ore_cookie_bedrock_overworld");


    //nether
    public static OreGen ORE_NETHER_GOLD_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_NETHER_GOLD_BEDROCK_NETHER.oreSize, CONFIG.ORE_NETHER_GOLD_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_NETHER_GOLD.get().getDefaultState(), "ore_nether_gold_bedrock_nether");
    public static OreGen ORE_NETHER_QUARTZ_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_NETHER_QUARTZ_BEDROCK_NETHER.oreSize, CONFIG.ORE_NETHER_QUARTZ_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_NETHER_QUARTZ.get().getDefaultState(), "ore_nether_quartz_bedrock_nether");
    public static OreGen ORE_ANCIENT_DEBRIS_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_ANCIENT_DEBRIS_BEDROCK_NETHER.oreSize, CONFIG.ORE_ANCIENT_DEBRIS_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_ANCIENT_DEBRIS.get().getDefaultState(), "ore_ancient_debris_bedrock_nether");
    public static OreGen ORE_HOLLOW_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_HOLLOW_BEDROCK_NETHER.oreSize, CONFIG.ORE_HOLLOW_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_HOLLOW.get().getDefaultState(), "ore_hollow_bedrock_nether");

    public static OreGen ORE_LAVA_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_LAVA_BEDROCK_NETHER.oreSize, CONFIG.ORE_LAVA_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_LAVA_ORE.get().getDefaultState(), "ore_lava_bedrock_nether");


    public static OreGen ORE_NETHER_GOLD_BEDROCK_NETHER_TOP = new OreGen().GenTop( CONFIG.ORE_NETHER_GOLD_BEDROCK_NETHER.topOreChance, ORE_NETHER_GOLD_BEDROCK_NETHER.getOre(), "ore_nether_gold_bedrock_nether_top");
    public static OreGen ORE_NETHER_QUARTZ_BEDROCK_NETHER_TOP = new OreGen().GenTop( CONFIG.ORE_NETHER_QUARTZ_BEDROCK_NETHER.topOreChance, ORE_NETHER_QUARTZ_BEDROCK_NETHER.getOre(), "ore_nether_quartz_bedrock_nether_top");
    public static OreGen ORE_ANCIENT_DEBRIS_BEDROCK_NETHER_TOP = new OreGen().GenTop( CONFIG.ORE_ANCIENT_DEBRIS_BEDROCK_NETHER.topOreChance, ORE_ANCIENT_DEBRIS_BEDROCK_NETHER.getOre(), "ore_ancient_debris_bedrock_nether_top");
    public static OreGen ORE_HOLLOW_BEDROCK_NETHER_TOP = new OreGen().GenTop( CONFIG.ORE_HOLLOW_BEDROCK_NETHER.topOreChance, ORE_HOLLOW_BEDROCK_NETHER.getOre(), "ore_hollow_bedrock_nether_top");

    public static OreGen ORE_LAVA_BEDROCK_NETHER_TOP = new OreGen().GenTop( CONFIG.ORE_LAVA_BEDROCK_NETHER.topOreChance, ORE_LAVA_BEDROCK_NETHER.getOre(), "ore_lava_bedrock_nether_top");

    //end
    public static OreGen ORE_HOLLOW_BEDROCK_END = new OreGen().GenAll(ENDSTONE, CONFIG.ORE_HOLLOW_BEDROCK_END.oreSize, CONFIG.ORE_HOLLOW_BEDROCK_END.OreCount, EntryModule.BEDROCK_HOLLOW.get().getDefaultState().with(BedrockStates.REPLACE_WITH_BEDROCK, false), "ore_hollow_bedrock_end");



    //techreborn overworld
    public static OreGen ORE_BAUXITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BAUXITE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_BAUXITE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_BAUXITE_ORE.get().getDefaultState(), "ore_bauxite_bedrock_overworld");
    public static OreGen ORE_GALENA_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_GALENA_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_GALENA_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_GALENA_ORE.get().getDefaultState(), "ore_galena_bedrock_overworld");
    public static OreGen ORE_IRIDIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IRIDIUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_IRIDIUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_IRIDIUM_ORE.get().getDefaultState(), "ore_iridium_bedrock_overworld");
    public static OreGen ORE_LEAD_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_LEAD_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_LEAD_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_LEAD_ORE.get().getDefaultState(), "ore_lead_bedrock_overworld");
    public static OreGen ORE_RUBY_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_RUBY_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_RUBY_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_RUBY_ORE.get().getDefaultState(), "ore_ruby_bedrock_overworld");
    public static OreGen ORE_SAPPHIRE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_SAPPHIRE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_SAPPHIRE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_SAPPHIRE_ORE.get().getDefaultState(), "ore_sapphire_bedrock_overworld");
    public static OreGen ORE_SILVER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_SILVER_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_SILVER_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_SILVER_ORE.get().getDefaultState(), "ore_silver_bedrock_overworld");
    public static OreGen ORE_TIN_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_TIN_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_TIN_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_TIN_ORE.get().getDefaultState(), "ore_tin_bedrock_overworld");

    //techreborn nether
    public static OreGen ORE_CINNABAR_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_CINNABAR_BEDROCK_NETHER.oreSize, CONFIG.ORE_CINNABAR_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_SAPPHIRE_ORE.get().getDefaultState(), "ore_cinnabar_bedrock_nether");
    public static OreGen ORE_PYRITE_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_PYRITE_BEDROCK_NETHER.oreSize, CONFIG.ORE_PYRITE_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_SILVER_ORE.get().getDefaultState(), "ore_pyrite_bedrock_nether");
    public static OreGen ORE_SPHALERITE_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_SPHALERITE_BEDROCK_NETHER.oreSize, CONFIG.ORE_SPHALERITE_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_TIN_ORE.get().getDefaultState(), "ore_sphalerite_bedrock_overworld_nether");

    public static OreGen ORE_CINNABAR_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_CINNABAR_BEDROCK_NETHER.topOreChance, ORE_CINNABAR_BEDROCK_NETHER.getOre(),  "ore_cinnabar_bedrock_nether_top");
    public static OreGen ORE_PYRITE_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_PYRITE_BEDROCK_NETHER.topOreChance, ORE_PYRITE_BEDROCK_NETHER.getOre(), "ore_pyrite_bedrock_nether_top");
    public static OreGen ORE_SPHALERITE_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_SPHALERITE_BEDROCK_NETHER.topOreChance, ORE_SPHALERITE_BEDROCK_NETHER.getOre(), "ore_sphalerite_bedrock_nether_top");

    //techreborn end
    public static OreGen ORE_PERIDOT_BEDROCK_END = new OreGen().GenAll(ENDSTONE, CONFIG.ORE_PERIDOT_BEDROCK_END.oreSize, CONFIG.ORE_PERIDOT_BEDROCK_END.OreCount, EntryModule.BEDROCK_PERIDOT_ORE.get().getDefaultState(), "ore_peridot_bedrock_end");
    public static OreGen ORE_SHELDONITE_BEDROCK_END = new OreGen().GenAll(ENDSTONE, CONFIG.ORE_SHELDONITE_BEDROCK_END.oreSize, CONFIG.ORE_SHELDONITE_BEDROCK_END.OreCount, EntryModule.BEDROCK_SHELDONITE_ORE.get().getDefaultState(), "ore_sheldonite_bedrock_end");
    public static OreGen ORE_SODALITE_BEDROCK_END = new OreGen().GenAll(ENDSTONE, CONFIG.ORE_SODALITE_BEDROCK_END.oreSize, CONFIG.ORE_SODALITE_BEDROCK_END.OreCount, EntryModule.BEDROCK_SODALITE_ORE.get().getDefaultState(), "ore_sodalite_bedrock_end");
    public static OreGen ORE_TUNGSTEN_BEDROCK_END = new OreGen().GenAll(ENDSTONE, CONFIG.ORE_TUNGSTEN_BEDROCK_END.oreSize, CONFIG.ORE_TUNGSTEN_BEDROCK_END.OreCount, EntryModule.BEDROCK_TUNGSTEN_ORE.get().getDefaultState(), "ore_tungsten_bedrock_end");



    //tconstruct
    public static OreGen ORE_TC_COBALT_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_TC_COBALT_BEDROCK_NETHER.oreSize, CONFIG.ORE_TC_COBALT_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_TC_COBALT_ORE.get().getDefaultState(), "ore_tc_cobalt_bedrock_nether");

    public static OreGen ORE_TC_COBALT_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_TC_COBALT_BEDROCK_NETHER.topOreChance, ORE_TC_COBALT_BEDROCK_NETHER.getOre(),  "ore_tc_cobalt_bedrock_nether_top");



    //ae2
    public static OreGen ORE_AE_CERTUS_QUARTZ_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_AE_CERTUS_QUARTZ_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_AE_CERTUS_QUARTZ_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE.get().getDefaultState(), "ore_ae_certus_quartz_bedrock_overworld");



    //bigreactors (Extreme Reactors)
    public static OreGen ORE_ER_YELLORITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_ER_YELLORITE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_ER_YELLORITE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_ER_YELLORITE_ORE.get().getDefaultState(), "ore_er_yellorium_bedrock_overworld");

    public static OreGen ORE_ER_ANGLESITE_BEDROCK_END = new OreGen().GenAll(BEDROCK, CONFIG.ORE_ER_ANGLESITE_BEDROCK_END.oreSize, CONFIG.ORE_ER_ANGLESITE_BEDROCK_END.OreCount, EntryModule.BEDROCK_ER_ANGLESITE_ORE.get().getDefaultState(), "ore_er_anglesite_bedrock_end");

    public static OreGen ORE_ER_BENITOITE_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_ER_BENITOITE_BEDROCK_NETHER.oreSize, CONFIG.ORE_ER_BENITOITE_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_ER_BENITOITE_ORE.get().getDefaultState(), "ore_er_benitoite_bedrock_nether");

    public static OreGen ORE_ER_BENITOITE_BEDROCK_NETHER_TOP = new OreGen().GenTop( CONFIG.ORE_ER_BENITOITE_BEDROCK_NETHER.topOreChance, ORE_ER_BENITOITE_BEDROCK_NETHER.getOre(), "ore_er_benitoite_bedrock_nether_top");



    //biggerreactors
    public static OreGen ORE_BR_URANIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BR_URANIUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_BR_URANIUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_BR_URANIUM_ORE.get().getDefaultState(), "ore_br_uranium_bedrock_overworld");



    //immersiveengineering
    public static OreGen ORE_IE_ALUMINUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IE_ALUMINUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_IE_ALUMINUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_IE_ALUMINUM_ORE.get().getDefaultState(), "ore_ie_aluminum_bedrock_overworld");
    public static OreGen ORE_IE_LEAD_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IE_LEAD_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_IE_LEAD_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_IE_LEAD_ORE.get().getDefaultState(), "ore_ie_lead_bedrock_overworld");
    public static OreGen ORE_IE_SILVER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IE_SILVER_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_IE_SILVER_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_IE_SILVER_ORE.get().getDefaultState(), "ore_ie_silver_bedrock_overworld");
    public static OreGen ORE_IE_NICKEL_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IE_NICKEL_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_IE_NICKEL_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_IE_NICKEL_ORE.get().getDefaultState(), "ore_ie_nickel_bedrock_overworld");
    public static OreGen ORE_IE_URANIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IE_URANIUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_IE_URANIUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_IE_URANIUM_ORE.get().getDefaultState(), "ore_ie_uranium_bedrock_overworld");



    //mythicmetals overworld
    public static OreGen ORE_MM_ADAMANTITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_ADAMANTITE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_ADAMANTITE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_ADAMANTITE_ORE.ore().get().getDefaultState(), "ore_mm_adamantite_bedrock_overworld");
    public static OreGen ORE_MM_AQUARIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_AQUARIUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_AQUARIUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_AQUARIUM_ORE.ore().get().getDefaultState(), "ore_mm_aquarium_bedrock_overworld");
    public static OreGen ORE_MM_BANGLUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_BANGLUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_BANGLUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_BANGLUM_ORE.ore().get().getDefaultState(), "ore_mm_banglum_bedrock_overworld");
    public static OreGen ORE_MM_CARMOT_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_CARMOT_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_CARMOT_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_CARMOT_ORE.ore().get().getDefaultState(), "ore_mm_carmot_bedrock_overworld");
    public static OreGen ORE_MM_KYBER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_KYBER_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_KYBER_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_KYBER_ORE.ore().get().getDefaultState(), "ore_mm_kyber_bedrock_overworld");
    public static OreGen ORE_MM_MANGANESE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_MANGANESE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_MANGANESE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_MANGANESE_ORE.ore().get().getDefaultState(), "ore_mm_maganese_bedrock_overworld");
    public static OreGen ORE_MM_MORKITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_MORKITE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_MORKITE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_MORKITE_ORE.ore().get().getDefaultState(), "ore_mm_morkite_bedrock_overworld");
    public static OreGen ORE_MM_MYTHRIL_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_MYTHRIL_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_MYTHRIL_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_MYTHRIL_ORE.ore().get().getDefaultState(), "ore_mm_mythril_bedrock_overworld");
    public static OreGen ORE_MM_ORICHALCUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_ORICHALCUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_ORICHALCUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_ORICHALCUM_ORE.ore().get().getDefaultState(), "ore_mm_orichalcum_bedrock_overworld");
    public static OreGen ORE_MM_OSMIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_OSMIUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_OSMIUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_OSMIUM_ORE.ore().get().getDefaultState(), "ore_mm_osmium_bedrock_overworld");
    public static OreGen ORE_MM_PLATINUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_PLATINUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_PLATINUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_PLATINUM_ORE.ore().get().getDefaultState(), "ore_mm_platinum_bedrock_overworld");
    public static OreGen ORE_MM_PROMETHEUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_PROMETHEUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_PROMETHEUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_PROMETHEUM_ORE.ore().get().getDefaultState(), "ore_mm_prometheum_bedrock_overworld");
    public static OreGen ORE_MM_QUADRILLUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_QUADRILLUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_QUADRILLUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_QUADRILLUM_ORE.ore().get().getDefaultState(), "ore_mm_quadrillum_bedrock_overworld");
    public static OreGen ORE_MM_RUNITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_RUNITE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_RUNITE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_RUNITE_ORE.ore().get().getDefaultState(), "ore_mm_runite_bedrock_overworld");
    public static OreGen ORE_MM_SILVER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_SILVER_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_SILVER_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_SILVER_ORE.ore().get().getDefaultState(), "ore_mm_silver_bedrock_overworld");
    public static OreGen ORE_MM_STARRITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_STARRITE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_STARRITE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_STARRITE_ORE.ore().get().getDefaultState(), "ore_mm_starrite_bedrock_overworld");
    public static OreGen ORE_MM_TIN_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_TIN_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_TIN_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_TIN_ORE.ore().get().getDefaultState(), "ore_mm_tin_bedrock_overworld");
    public static OreGen ORE_MM_UNOBTAINIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_UNOBTAINIUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_UNOBTAINIUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_UNOBTAINIUM_ORE.ore().get().getDefaultState(), "ore_mm_unobtainium_bedrock_overworld");

    //mythicmetals nether
    public static OreGen ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER.oreSize, CONFIG.ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_MM_NETHER_BANGLUM_ORE.ore().get().getDefaultState(), "ore_mm_nether_banglum_bedrock_nether");
    public static OreGen ORE_MM_MIDAS_GOLD_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_MIDAS_GOLD_BEDROCK_NETHER.oreSize, CONFIG.ORE_MM_MIDAS_GOLD_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_MM_MIDAS_GOLD_ORE.ore().get().getDefaultState(), "ore_mm_midas_gold_bedrock_nether");
    public static OreGen ORE_MM_PALLADIUM_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_PALLADIUM_BEDROCK_NETHER.oreSize, CONFIG.ORE_MM_PALLADIUM_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_MM_PALLADIUM_ORE.ore().get().getDefaultState(), "ore_mm_palladium_bedrock_nether");
    public static OreGen ORE_MM_STORMYX_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_STORMYX_BEDROCK_NETHER.oreSize, CONFIG.ORE_MM_STORMYX_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_MM_STORMYX_ORE.ore().get().getDefaultState(), "ore_mm_stormyx_bedrock_nether");

    public static OreGen ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER.topOreChance, ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER.getOre(), "ore_mm_nether_banglum_bedrock_nether_top");
    public static OreGen ORE_MM_MIDAS_GOLD_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_MM_MIDAS_GOLD_BEDROCK_NETHER.topOreChance, ORE_MM_MIDAS_GOLD_BEDROCK_NETHER.getOre(), "ore_mm_midas_gold_bedrock_nether_top");
    public static OreGen ORE_MM_PALLADIUM_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_MM_PALLADIUM_BEDROCK_NETHER.topOreChance, ORE_MM_PALLADIUM_BEDROCK_NETHER.getOre(), "ore_mm_palladium_bedrock_nether_top");
    public static OreGen ORE_MM_STORMYX_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_MM_STORMYX_BEDROCK_NETHER.topOreChance, ORE_MM_STORMYX_BEDROCK_NETHER.getOre(), "ore_mm_stormyx_bedrock_nether_top");

    //mythicmetals end
    public static OreGen ORE_MM_STARRITE_BEDROCK_END = new OreGen().GenAll(BEDROCK, CONFIG.ORE_MM_STARRITE_BEDROCK_END.oreSize, CONFIG.ORE_MM_STARRITE_BEDROCK_END.OreCount, EntryModule.BEDROCK_MM_STARRITE_ORE.ore().get().getDefaultState().with(BedrockStates.REPLACE_WITH_BEDROCK, false), "ore_mm_starrite_bedrock_end");


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

            ORE_CINNABAR_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether());
            ORE_PYRITE_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether());
            ORE_SPHALERITE_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether());

            ORE_CINNABAR_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether());
            ORE_PYRITE_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether());
            ORE_SPHALERITE_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether());

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
        if(Platform.isModLoaded("mythicmetals")) {
            ORE_MM_ADAMANTITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_AQUARIUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_BANGLUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_CARMOT_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_KYBER_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_MANGANESE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_MORKITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_MYTHRIL_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_ORICHALCUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_OSMIUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_PLATINUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_PROMETHEUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_QUADRILLUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_RUNITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_SILVER_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_STARRITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_TIN_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());
            ORE_MM_UNOBTAINIUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld());

            ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether());
            ORE_MM_MIDAS_GOLD_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether());
            ORE_MM_PALLADIUM_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether());
            ORE_MM_STORMYX_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether());

            ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether());
            ORE_MM_MIDAS_GOLD_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether());
            ORE_MM_PALLADIUM_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether());
            ORE_MM_STORMYX_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether());

            ORE_MM_STARRITE_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd());
        }
    }


}
