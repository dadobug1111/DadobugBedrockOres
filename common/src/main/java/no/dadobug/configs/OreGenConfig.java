package no.dadobug.configs;

import java.util.HashMap;
import java.util.HashSet;

import dev.architectury.platform.Platform;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import no.dadobug.BiomeSelectors;
import no.dadobug.EntryModule;
import no.dadobug.OreGen;
import no.dadobug.blocks.OresBlockStates;

public class OreGenConfig {
    public static final RuleTest BEDROCK = new BlockMatchRuleTest(Blocks.BEDROCK);
    public static final RuleTest ENDSTONE = new BlockMatchRuleTest(Blocks.END_STONE);
    public static final GenConfig CONFIG = AutoConfig.register(GenConfig.class, GsonConfigSerializer::new).getConfig();
    public static final HashMap<DimensionType, HashSet<OreType>> GENERATED_ORES = new HashMap<>();


    //overworld
    public static OreGen ORE_COAL_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_COAL_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_COAL_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_COAL_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_coal_bedrock_overworld");
    public static OreGen ORE_IRON_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IRON_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_IRON_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_IRON_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_iron_bedrock_overworld");
    public static OreGen ORE_GOLD_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_GOLD_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_GOLD_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_GOLD_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_gold_bedrock_overworld");
    public static OreGen ORE_DIAMOND_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_DIAMOND_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_DIAMOND_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_DIAMOND_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_diamond_bedrock_overworld");
    public static OreGen ORE_REDSTONE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_REDSTONE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_REDSTONE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_REDSTONE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_redstone_bedrock_overworld");
    public static OreGen ORE_COPPER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_COPPER_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_COPPER_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_COPPER_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_copper_bedrock_overworld");
    public static OreGen ORE_LAPIS_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_LAPIS_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_LAPIS_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_LAPIS_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_lapis_bedrock_overworld");
    public static OreGen ORE_EMERALD_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_EMERALD_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_EMERALD_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_EMERALD_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_emerald_bedrock_overworld");
    public static OreGen ORE_HOLLOW_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_HOLLOW_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_HOLLOW_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_HOLLOW.get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_hollow_bedrock_overworld");
    public static OreGen ORE_XP_LEAK_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_XP_LEAK_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_XP_LEAK_BEDROCK_OVERWORLD.oreChance, EntryModule.XP_LEAK.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_xp_leak_bedrock_overworld");

    public static OreGen ORE_WATER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_WATER_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_WATER_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_WATER_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_water_bedrock_overworld");
    public static OreGen ORE_LAVA_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_LAVA_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_LAVA_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_LAVA_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_lava_bedrock_overworld");

    public static OreGen ORE_MILK_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MILK_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MILK_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MILK_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_milk_bedrock_overworld");
    public static OreGen ORE_COOKIE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_COOKIE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_COOKIE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_COOKIE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_cookie_bedrock_overworld");


    //nether
    public static OreGen ORE_NETHER_GOLD_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_NETHER_GOLD_BEDROCK_NETHER.oreSize, CONFIG.ORE_NETHER_GOLD_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_NETHER_GOLD.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_nether_gold_bedrock_nether");
    public static OreGen ORE_NETHER_QUARTZ_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_NETHER_QUARTZ_BEDROCK_NETHER.oreSize, CONFIG.ORE_NETHER_QUARTZ_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_NETHER_QUARTZ.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_nether_quartz_bedrock_nether");
    public static OreGen ORE_ANCIENT_DEBRIS_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_ANCIENT_DEBRIS_BEDROCK_NETHER.oreSize, CONFIG.ORE_ANCIENT_DEBRIS_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_ANCIENT_DEBRIS.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ancient_debris_bedrock_nether");
    public static OreGen ORE_HOLLOW_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_HOLLOW_BEDROCK_NETHER.oreSize, CONFIG.ORE_HOLLOW_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_HOLLOW.get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_hollow_bedrock_nether");
    public static OreGen ORE_XP_LEAK_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_XP_LEAK_BEDROCK_NETHER.oreSize, CONFIG.ORE_XP_LEAK_BEDROCK_NETHER.oreChance, EntryModule.XP_LEAK.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_xp_leak_bedrock_nether");

    public static OreGen ORE_LAVA_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_LAVA_BEDROCK_NETHER.oreSize, CONFIG.ORE_LAVA_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_LAVA_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_lava_bedrock_nether");


    public static OreGen ORE_NETHER_GOLD_BEDROCK_NETHER_TOP = new OreGen().GenTop( CONFIG.ORE_NETHER_GOLD_BEDROCK_NETHER.topOreChance, ORE_NETHER_GOLD_BEDROCK_NETHER.getOre(), "ore_nether_gold_bedrock_nether_top");
    public static OreGen ORE_NETHER_QUARTZ_BEDROCK_NETHER_TOP = new OreGen().GenTop( CONFIG.ORE_NETHER_QUARTZ_BEDROCK_NETHER.topOreChance, ORE_NETHER_QUARTZ_BEDROCK_NETHER.getOre(), "ore_nether_quartz_bedrock_nether_top");
    public static OreGen ORE_ANCIENT_DEBRIS_BEDROCK_NETHER_TOP = new OreGen().GenTop( CONFIG.ORE_ANCIENT_DEBRIS_BEDROCK_NETHER.topOreChance, ORE_ANCIENT_DEBRIS_BEDROCK_NETHER.getOre(), "ore_ancient_debris_bedrock_nether_top");
    public static OreGen ORE_HOLLOW_BEDROCK_NETHER_TOP = new OreGen().GenTop( CONFIG.ORE_HOLLOW_BEDROCK_NETHER.topOreChance, ORE_HOLLOW_BEDROCK_NETHER.getOre(), "ore_hollow_bedrock_nether_top");
    public static OreGen ORE_XP_LEAK_BEDROCK_NETHER_TOP = new OreGen().GenTop( CONFIG.ORE_XP_LEAK_BEDROCK_NETHER.topOreChance, ORE_XP_LEAK_BEDROCK_NETHER.getOre(), "ore_xp_leak_bedrock_nether_top");

    public static OreGen ORE_LAVA_BEDROCK_NETHER_TOP = new OreGen().GenTop( CONFIG.ORE_LAVA_BEDROCK_NETHER.topOreChance, ORE_LAVA_BEDROCK_NETHER.getOre(), "ore_lava_bedrock_nether_top");

    //end

    public static OreGen ORE_HOLLOW_BEDROCK_END = new OreGen().GenAll(ENDSTONE, CONFIG.ORE_HOLLOW_BEDROCK_END.oreSize, CONFIG.ORE_HOLLOW_BEDROCK_END.OreCount, EntryModule.BEDROCK_HOLLOW.get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, false), "ore_hollow_bedrock_end");
    public static OreGen ORE_XP_LEAK_BEDROCK_END = new OreGen().GenAll(ENDSTONE, CONFIG.ORE_XP_LEAK_BEDROCK_END.oreSize, CONFIG.ORE_XP_LEAK_BEDROCK_END.OreCount, EntryModule.XP_LEAK.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, false), "ore_xp_leak_bedrock_end");



    //techreborn overworld
    public static OreGen ORE_BAUXITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BAUXITE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_BAUXITE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_BAUXITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_bauxite_bedrock_overworld");
    public static OreGen ORE_GALENA_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_GALENA_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_GALENA_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_GALENA_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_galena_bedrock_overworld");
    public static OreGen ORE_IRIDIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IRIDIUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_IRIDIUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_IRIDIUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_iridium_bedrock_overworld");
    public static OreGen ORE_LEAD_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_LEAD_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_LEAD_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_LEAD_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_lead_bedrock_overworld");
    public static OreGen ORE_RUBY_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_RUBY_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_RUBY_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_RUBY_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ruby_bedrock_overworld");
    public static OreGen ORE_SAPPHIRE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_SAPPHIRE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_SAPPHIRE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_SAPPHIRE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_sapphire_bedrock_overworld");
    public static OreGen ORE_SILVER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_SILVER_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_SILVER_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_SILVER_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_silver_bedrock_overworld");
    public static OreGen ORE_TIN_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_TIN_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_TIN_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_TIN_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_tin_bedrock_overworld");

    //techreborn nether
    public static OreGen ORE_CINNABAR_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_CINNABAR_BEDROCK_NETHER.oreSize, CONFIG.ORE_CINNABAR_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_CINNABAR_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_cinnabar_bedrock_nether");
    public static OreGen ORE_PYRITE_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_PYRITE_BEDROCK_NETHER.oreSize, CONFIG.ORE_PYRITE_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_PYRITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_pyrite_bedrock_nether");
    public static OreGen ORE_SPHALERITE_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_SPHALERITE_BEDROCK_NETHER.oreSize, CONFIG.ORE_SPHALERITE_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_SPHALERITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_sphalerite_bedrock_overworld_nether");

    public static OreGen ORE_CINNABAR_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_CINNABAR_BEDROCK_NETHER.topOreChance, ORE_CINNABAR_BEDROCK_NETHER.getOre(),  "ore_cinnabar_bedrock_nether_top");
    public static OreGen ORE_PYRITE_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_PYRITE_BEDROCK_NETHER.topOreChance, ORE_PYRITE_BEDROCK_NETHER.getOre(), "ore_pyrite_bedrock_nether_top");
    public static OreGen ORE_SPHALERITE_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_SPHALERITE_BEDROCK_NETHER.topOreChance, ORE_SPHALERITE_BEDROCK_NETHER.getOre(), "ore_sphalerite_bedrock_nether_top");

    //techreborn end
    public static OreGen ORE_PERIDOT_BEDROCK_END = new OreGen().GenAll(ENDSTONE, CONFIG.ORE_PERIDOT_BEDROCK_END.oreSize, CONFIG.ORE_PERIDOT_BEDROCK_END.OreCount, EntryModule.BEDROCK_PERIDOT_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, false), "ore_peridot_bedrock_end");
    public static OreGen ORE_SHELDONITE_BEDROCK_END = new OreGen().GenAll(ENDSTONE, CONFIG.ORE_SHELDONITE_BEDROCK_END.oreSize, CONFIG.ORE_SHELDONITE_BEDROCK_END.OreCount, EntryModule.BEDROCK_SHELDONITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, false), "ore_sheldonite_bedrock_end");
    public static OreGen ORE_SODALITE_BEDROCK_END = new OreGen().GenAll(ENDSTONE, CONFIG.ORE_SODALITE_BEDROCK_END.oreSize, CONFIG.ORE_SODALITE_BEDROCK_END.OreCount, EntryModule.BEDROCK_SODALITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, false), "ore_sodalite_bedrock_end");
    public static OreGen ORE_TUNGSTEN_BEDROCK_END = new OreGen().GenAll(ENDSTONE, CONFIG.ORE_TUNGSTEN_BEDROCK_END.oreSize, CONFIG.ORE_TUNGSTEN_BEDROCK_END.OreCount, EntryModule.BEDROCK_TUNGSTEN_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, false), "ore_tungsten_bedrock_end");



    //tconstruct nether
    public static OreGen ORE_TC_COBALT_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_TC_COBALT_BEDROCK_NETHER.oreSize, CONFIG.ORE_TC_COBALT_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_TC_COBALT_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_tc_cobalt_bedrock_nether");

    public static OreGen ORE_TC_COBALT_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_TC_COBALT_BEDROCK_NETHER.topOreChance, ORE_TC_COBALT_BEDROCK_NETHER.getOre(),  "ore_tc_cobalt_bedrock_nether_top");



    //ae2 overworld
    public static OreGen ORE_AE_CERTUS_QUARTZ_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_AE_CERTUS_QUARTZ_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_AE_CERTUS_QUARTZ_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ae_certus_quartz_bedrock_overworld");



    //bigreactors (Extreme Reactors) overworld
    public static OreGen ORE_ER_YELLORITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_ER_YELLORITE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_ER_YELLORITE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_ER_YELLORITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_er_yellorium_bedrock_overworld");

    //bigreactors (Extreme Reactors) end
    public static OreGen ORE_ER_ANGLESITE_BEDROCK_END = new OreGen().GenAll(BEDROCK, CONFIG.ORE_ER_ANGLESITE_BEDROCK_END.oreSize, CONFIG.ORE_ER_ANGLESITE_BEDROCK_END.OreCount, EntryModule.BEDROCK_ER_ANGLESITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, false), "ore_er_anglesite_bedrock_end");

    //bigreactors (Extreme Reactors) nether
    public static OreGen ORE_ER_BENITOITE_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_ER_BENITOITE_BEDROCK_NETHER.oreSize, CONFIG.ORE_ER_BENITOITE_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_ER_BENITOITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_er_benitoite_bedrock_nether");

    public static OreGen ORE_ER_BENITOITE_BEDROCK_NETHER_TOP = new OreGen().GenTop( CONFIG.ORE_ER_BENITOITE_BEDROCK_NETHER.topOreChance, ORE_ER_BENITOITE_BEDROCK_NETHER.getOre(), "ore_er_benitoite_bedrock_nether_top");



    //biggerreactors overworld
    public static OreGen ORE_BR_URANIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BR_URANIUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_BR_URANIUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_BR_URANIUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_br_uranium_bedrock_overworld");



    //immersiveengineering overworld
    public static OreGen ORE_IE_ALUMINUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IE_ALUMINUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_IE_ALUMINUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_IE_ALUMINUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ie_aluminum_bedrock_overworld");
    public static OreGen ORE_IE_LEAD_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IE_LEAD_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_IE_LEAD_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_IE_LEAD_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ie_lead_bedrock_overworld");
    public static OreGen ORE_IE_SILVER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IE_SILVER_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_IE_SILVER_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_IE_SILVER_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ie_silver_bedrock_overworld");
    public static OreGen ORE_IE_NICKEL_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IE_NICKEL_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_IE_NICKEL_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_IE_NICKEL_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ie_nickel_bedrock_overworld");
    public static OreGen ORE_IE_URANIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IE_URANIUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_IE_URANIUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_IE_URANIUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ie_uranium_bedrock_overworld");



    //mythicmetals overworld
    public static OreGen ORE_MM_ADAMANTITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_ADAMANTITE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_ADAMANTITE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_ADAMANTITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_adamantite_bedrock_overworld");
    public static OreGen ORE_MM_AQUARIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_AQUARIUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_AQUARIUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_AQUARIUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_aquarium_bedrock_overworld");
    public static OreGen ORE_MM_BANGLUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_BANGLUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_BANGLUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_BANGLUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_banglum_bedrock_overworld");
    public static OreGen ORE_MM_CARMOT_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_CARMOT_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_CARMOT_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_CARMOT_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_carmot_bedrock_overworld");
    public static OreGen ORE_MM_KYBER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_KYBER_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_KYBER_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_KYBER_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_kyber_bedrock_overworld");
    public static OreGen ORE_MM_MANGANESE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_MANGANESE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_MANGANESE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_MANGANESE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_maganese_bedrock_overworld");
    public static OreGen ORE_MM_MORKITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_MORKITE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_MORKITE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_MORKITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_morkite_bedrock_overworld");
    public static OreGen ORE_MM_MYTHRIL_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_MYTHRIL_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_MYTHRIL_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_MYTHRIL_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_mythril_bedrock_overworld");
    public static OreGen ORE_MM_ORICHALCUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_ORICHALCUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_ORICHALCUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_ORICHALCUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_orichalcum_bedrock_overworld");
    public static OreGen ORE_MM_OSMIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_OSMIUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_OSMIUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_OSMIUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_osmium_bedrock_overworld");
    public static OreGen ORE_MM_PLATINUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_PLATINUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_PLATINUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_PLATINUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_platinum_bedrock_overworld");
    public static OreGen ORE_MM_PROMETHEUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_PROMETHEUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_PROMETHEUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_PROMETHEUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_prometheum_bedrock_overworld");
    public static OreGen ORE_MM_QUADRILLUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_QUADRILLUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_QUADRILLUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_QUADRILLUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_quadrillum_bedrock_overworld");
    public static OreGen ORE_MM_RUNITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_RUNITE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_RUNITE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_RUNITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_runite_bedrock_overworld");
    public static OreGen ORE_MM_SILVER_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_SILVER_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_SILVER_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_SILVER_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_silver_bedrock_overworld");
    public static OreGen ORE_MM_STARRITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_STARRITE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_STARRITE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_STARRITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_starrite_bedrock_overworld");
    public static OreGen ORE_MM_TIN_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_TIN_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_TIN_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_TIN_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_tin_bedrock_overworld");
    public static OreGen ORE_MM_UNOBTAINIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_UNOBTAINIUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MM_UNOBTAINIUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MM_UNOBTAINIUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_unobtainium_bedrock_overworld");

    //mythicmetals nether
    public static OreGen ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER.oreSize, CONFIG.ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_MM_NETHER_BANGLUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_nether_banglum_bedrock_nether");
    public static OreGen ORE_MM_MIDAS_GOLD_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_MIDAS_GOLD_BEDROCK_NETHER.oreSize, CONFIG.ORE_MM_MIDAS_GOLD_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_MM_MIDAS_GOLD_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_midas_gold_bedrock_nether");
    public static OreGen ORE_MM_PALLADIUM_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_PALLADIUM_BEDROCK_NETHER.oreSize, CONFIG.ORE_MM_PALLADIUM_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_MM_PALLADIUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_palladium_bedrock_nether");
    public static OreGen ORE_MM_STORMYX_BEDROCK_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MM_STORMYX_BEDROCK_NETHER.oreSize, CONFIG.ORE_MM_STORMYX_BEDROCK_NETHER.oreChance, EntryModule.BEDROCK_MM_STORMYX_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mm_stormyx_bedrock_nether");

    public static OreGen ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER.topOreChance, ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER.getOre(), "ore_mm_nether_banglum_bedrock_nether_top");
    public static OreGen ORE_MM_MIDAS_GOLD_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_MM_MIDAS_GOLD_BEDROCK_NETHER.topOreChance, ORE_MM_MIDAS_GOLD_BEDROCK_NETHER.getOre(), "ore_mm_midas_gold_bedrock_nether_top");
    public static OreGen ORE_MM_PALLADIUM_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_MM_PALLADIUM_BEDROCK_NETHER.topOreChance, ORE_MM_PALLADIUM_BEDROCK_NETHER.getOre(), "ore_mm_palladium_bedrock_nether_top");
    public static OreGen ORE_MM_STORMYX_BEDROCK_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_MM_STORMYX_BEDROCK_NETHER.topOreChance, ORE_MM_STORMYX_BEDROCK_NETHER.getOre(), "ore_mm_stormyx_bedrock_nether_top");

    //mythicmetals end
    public static OreGen ORE_MM_STARRITE_BEDROCK_END = new OreGen().GenAll(BEDROCK, CONFIG.ORE_MM_STARRITE_BEDROCK_END.oreSize, CONFIG.ORE_MM_STARRITE_BEDROCK_END.OreCount, EntryModule.BEDROCK_MM_STARRITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, false), "ore_mm_starrite_bedrock_end");



    //create overworld
    public static OreGen ORE_CR_ZINC_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_CR_ZINC_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_CR_ZINC_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_CR_ZINC_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_cr_zinc_bedrock_overworld");



    //mekanism overworld
    public static OreGen ORE_MK_OSMIUM_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MK_OSMIUM_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MK_OSMIUM_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MK_OSMIUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mk_osmium_bedrock_overworld");
    public static OreGen ORE_MK_FLUORITE_BEDROCK_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MK_FLUORITE_BEDROCK_OVERWORLD.oreSize, CONFIG.ORE_MK_FLUORITE_BEDROCK_OVERWORLD.oreChance, EntryModule.BEDROCK_MK_FLUORITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_mk_fluorite_bedrock_overworld");



    //vanilla undergarden
    public static OreGen ORE_UG_COAL_BEDROCK_UNDERGARDEN = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_COAL_BEDROCK_UNDERGARDEN.oreSize, CONFIG.ORE_COAL_BEDROCK_UNDERGARDEN.oreChance, EntryModule.BEDROCK_COAL_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_coal_bedrock_undergarden");
    public static OreGen ORE_UG_IRON_BEDROCK_UNDERGARDEN = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IRON_BEDROCK_UNDERGARDEN.oreSize, CONFIG.ORE_IRON_BEDROCK_UNDERGARDEN.oreChance, EntryModule.BEDROCK_IRON_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_iron_bedrock_undergarden");
    public static OreGen ORE_UG_GOLD_BEDROCK_UNDERGARDEN = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_GOLD_BEDROCK_UNDERGARDEN.oreSize, CONFIG.ORE_GOLD_BEDROCK_UNDERGARDEN.oreChance, EntryModule.BEDROCK_GOLD_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_gold_bedrock_undergarden");
    public static OreGen ORE_UG_DIAMOND_BEDROCK_UNDERGARDEN = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_DIAMOND_BEDROCK_UNDERGARDEN.oreSize, CONFIG.ORE_DIAMOND_BEDROCK_UNDERGARDEN.oreChance, EntryModule.BEDROCK_DIAMOND_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_diamond_bedrock_undergarden");

    //undergarden undergarden
    public static OreGen ORE_UG_CLOGGRUM_BEDROCK_UNDERGARDEN = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_UG_CLOGGRUM_BEDROCK_UNDERGARDEN.oreSize, CONFIG.ORE_UG_CLOGGRUM_BEDROCK_UNDERGARDEN.oreChance, EntryModule.BEDROCK_UG_CLOGGRUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_cloggrum_bedrock_undergarden");
    public static OreGen ORE_UG_FROSTSTEEL_BEDROCK_UNDERGARDEN = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_UG_FROSTSTEEL_BEDROCK_UNDERGARDEN.oreSize, CONFIG.ORE_UG_FROSTSTEEL_BEDROCK_UNDERGARDEN.oreChance, EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_froststeel_bedrock_undergarden");
    public static OreGen ORE_UG_UTHERIUM_BEDROCK_UNDERGARDEN = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_UG_UTHERIUM_BEDROCK_UNDERGARDEN.oreSize, CONFIG.ORE_UG_UTHERIUM_BEDROCK_UNDERGARDEN.oreChance, EntryModule.BEDROCK_UG_UTHERIUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_utherium_bedrock_undergarden");



    //vanilla moon
    public static OreGen ORE_BE_IRON_BEDROCK_MOON = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_IRON_BEDROCK_MOON.oreSize, CONFIG.ORE_BE_IRON_BEDROCK_MOON.oreChance, EntryModule.BEDROCK_IRON_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_iron_bedrock_moon");

    //beyond earth moon
    public static OreGen ORE_BE_DESH_BEDROCK_MOON = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_DESH_BEDROCK_MOON.oreSize, CONFIG.ORE_BE_DESH_BEDROCK_MOON.oreChance, EntryModule.BEDROCK_BE_DESH_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_desh_bedrock_moon");
    public static OreGen ORE_BE_ICE_SHARD_BEDROCK_MOON = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_ICE_SHARD_BEDROCK_MOON.oreSize, CONFIG.ORE_BE_ICE_SHARD_BEDROCK_MOON.oreChance, EntryModule.BEDROCK_BE_ICE_SHARD_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ice_shard_bedrock_moon");
    public static OreGen ORE_BE_CHEESE_BEDROCK_MOON = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_CHEESE_BEDROCK_MOON.oreSize, CONFIG.ORE_BE_CHEESE_BEDROCK_MOON.oreChance, EntryModule.BEDROCK_BE_CHEESE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_cheese_bedrock_moon");

    //vanilla mars
    public static OreGen ORE_BE_IRON_BEDROCK_MARS = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_IRON_BEDROCK_MARS.oreSize, CONFIG.ORE_BE_IRON_BEDROCK_MARS.oreChance, EntryModule.BEDROCK_IRON_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_iron_bedrock_mars");
    public static OreGen ORE_BE_DIAMOND_BEDROCK_MARS = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_DIAMOND_BEDROCK_MARS.oreSize, CONFIG.ORE_BE_DIAMOND_BEDROCK_MARS.oreChance, EntryModule.BEDROCK_DIAMOND_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_diamond_bedrock_mars");

    //beyond earth mars
    public static OreGen ORE_BE_OSTRUM_BEDROCK_MARS = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_OSTRUM_BEDROCK_MARS.oreSize, CONFIG.ORE_BE_OSTRUM_BEDROCK_MARS.oreChance, EntryModule.BEDROCK_BE_OSTRUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ostrum_bedrock_moon");
    public static OreGen ORE_BE_ICE_SHARD_BEDROCK_MARS = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_ICE_SHARD_BEDROCK_MARS.oreSize, CONFIG.ORE_BE_ICE_SHARD_BEDROCK_MARS.oreChance, EntryModule.BEDROCK_BE_ICE_SHARD_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ice_shard_bedrock_mars");

    //vanilla venus
    public static OreGen ORE_BE_COAL_BEDROCK_VENUS = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_COAL_BEDROCK_VENUS.oreSize, CONFIG.ORE_BE_COAL_BEDROCK_VENUS.oreChance, EntryModule.BEDROCK_COAL_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_coal_bedrock_venus");
    public static OreGen ORE_BE_DIAMOND_BEDROCK_VENUS = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_DIAMOND_BEDROCK_VENUS.oreSize, CONFIG.ORE_BE_DIAMOND_BEDROCK_VENUS.oreChance, EntryModule.BEDROCK_DIAMOND_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_diamond_bedrock_venus");
    public static OreGen ORE_BE_GOLD_BEDROCK_VENUS = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_GOLD_BEDROCK_VENUS.oreSize, CONFIG.ORE_BE_GOLD_BEDROCK_VENUS.oreChance, EntryModule.BEDROCK_GOLD_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_gold_bedrock_venus");

    //beyond earth venus
    public static OreGen ORE_BE_CALORITE_BEDROCK_VENUS = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_CALORITE_BEDROCK_VENUS.oreSize, CONFIG.ORE_BE_CALORITE_BEDROCK_VENUS.oreChance, EntryModule.BEDROCK_BE_CALORITE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_calorite_bedrock_venus");

    //vanilla glacio
    public static OreGen ORE_BE_COAL_BEDROCK_GLACIO = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_COAL_BEDROCK_GLACIO.oreSize, CONFIG.ORE_BE_COAL_BEDROCK_GLACIO.oreChance, EntryModule.BEDROCK_COAL_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_coal_bedrock_glacio");
    public static OreGen ORE_BE_COPPER_BEDROCK_GLACIO = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_COPPER_BEDROCK_GLACIO.oreSize, CONFIG.ORE_BE_COPPER_BEDROCK_GLACIO.oreChance, EntryModule.BEDROCK_COPPER_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_copper_bedrock_glacio");
    public static OreGen ORE_BE_IRON_BEDROCK_GLACIO = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_IRON_BEDROCK_GLACIO.oreSize, CONFIG.ORE_BE_IRON_BEDROCK_GLACIO.oreChance, EntryModule.BEDROCK_IRON_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_iron_bedrock_glacio");
    public static OreGen ORE_BE_LAPIS_BEDROCK_GLACIO = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_LAPIS_BEDROCK_GLACIO.oreSize, CONFIG.ORE_BE_LAPIS_BEDROCK_GLACIO.oreChance, EntryModule.BEDROCK_LAPIS_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_lapis_bedrock_glacio");

    //beyond earth glacio
    public static OreGen ORE_BE_ICE_SHARD_BEDROCK_GLACIO = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_BE_ICE_SHARD_BEDROCK_GLACIO.oreSize, CONFIG.ORE_BE_ICE_SHARD_BEDROCK_GLACIO.oreChance, EntryModule.BEDROCK_BE_ICE_SHARD_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ice_shard_bedrock_glacio");


    //ftb industrial contraptions
    public static OreGen ORE_IC_TIN_BEDROCK_FTB_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IC_TIN_BEDROCK_FTB_OVERWORLD.oreSize, CONFIG.ORE_IC_TIN_BEDROCK_FTB_OVERWORLD.oreChance, EntryModule.BEDROCK_IC_TIN_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ic_tin_bedrock_overworld");
    public static OreGen ORE_IC_LEAD_BEDROCK_FTB_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IC_LEAD_BEDROCK_FTB_OVERWORLD.oreSize, CONFIG.ORE_IC_LEAD_BEDROCK_FTB_OVERWORLD.oreChance, EntryModule.BEDROCK_IC_LEAD_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ic_lead_bedrock_overworld");
    public static OreGen ORE_IC_ALUMINUM_BEDROCK_FTB_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IC_ALUMINUM_BEDROCK_FTB_OVERWORLD.oreSize, CONFIG.ORE_IC_ALUMINUM_BEDROCK_FTB_OVERWORLD.oreChance, EntryModule.BEDROCK_IC_ALUMINUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ic_aluminum_bedrock_overworld");
    public static OreGen ORE_IC_IRIDIUM_BEDROCK_FTB_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IC_IRIDIUM_BEDROCK_FTB_OVERWORLD.oreSize, CONFIG.ORE_IC_IRIDIUM_BEDROCK_FTB_OVERWORLD.oreChance, EntryModule.BEDROCK_IC_IRIDIUM_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ic_iridium_bedrock_overworld");


    //malum
    public static OreGen ORE_MA_SOULSTONE_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MA_SOULSTONE_OVERWORLD.oreSize, CONFIG.ORE_MA_SOULSTONE_OVERWORLD.oreChance, EntryModule.BEDROCK_MA_SOULSTONE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ma_soulstone_bedrock_overworld");
    public static OreGen ORE_MA_BRILLIANCE_OVERWORLD = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_MA_BRILLIANCE_OVERWORLD.oreSize, CONFIG.ORE_MA_BRILLIANCE_OVERWORLD.oreChance, EntryModule.BEDROCK_MA_BRILLIANCE_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ma_brilliance_bedrock_overworld");
    
    public static OreGen ORE_MA_BLAZING_QUARTZ_NETHER = new OreGen().GenBottom(BEDROCK, CONFIG.ORE_IC_ALUMINUM_BEDROCK_FTB_OVERWORLD.oreSize, CONFIG.ORE_IC_ALUMINUM_BEDROCK_FTB_OVERWORLD.oreChance, EntryModule.BEDROCK_MA_BLAZING_QUARTZ_ORE.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BLOCK, true), "ore_ma_blazing_quartz_bedrock_nether");
    public static OreGen ORE_MA_BLAZING_QUARTZ_NETHER_TOP = new OreGen().GenTop(CONFIG.ORE_IC_ALUMINUM_BEDROCK_FTB_OVERWORLD.oreChance, ORE_MA_BLAZING_QUARTZ_NETHER.getOre(), "ore_ma_blazing_quartz_bedrock_nether_top");


    public static void init(){
        ORE_COAL_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_COAL_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.COAL);
        ORE_IRON_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_IRON_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.IRON);
        ORE_GOLD_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_GOLD_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.GOLD);
        ORE_DIAMOND_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_DIAMOND_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.DIAMOND);
        ORE_REDSTONE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_REDSTONE_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.REDSTONE);
        ORE_COPPER_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_COPPER_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.COPPER);
        ORE_LAPIS_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_LAPIS_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.LAPIS);
        ORE_EMERALD_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensEmeralds(), CONFIG.ORE_EMERALD_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.EMERALD);
        ORE_WATER_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_WATER_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.WATER);
        ORE_LAVA_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_LAVA_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.LAVA);
        ORE_MILK_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MILK_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.MILK);
        ORE_COOKIE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_COOKIE_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.COOKIE);
        ORE_HOLLOW_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_HOLLOW_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.HOLLOW);
        ORE_XP_LEAK_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_XP_LEAK_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.XP);


        ORE_NETHER_GOLD_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_NETHER_GOLD_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.GOLD);
        ORE_NETHER_QUARTZ_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_NETHER_QUARTZ_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.QUARTZ);
        ORE_ANCIENT_DEBRIS_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_ANCIENT_DEBRIS_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.NETHERITE);
        ORE_LAVA_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_LAVA_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.LAVA);
        ORE_HOLLOW_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_HOLLOW_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.HOLLOW);
        ORE_XP_LEAK_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_XP_LEAK_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.XP);

        ORE_NETHER_GOLD_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_NETHER_GOLD_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.GOLD);
        ORE_NETHER_QUARTZ_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_NETHER_QUARTZ_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.QUARTZ);
        ORE_ANCIENT_DEBRIS_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_ANCIENT_DEBRIS_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.NETHERITE);
        ORE_LAVA_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_LAVA_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.LAVA);
        ORE_HOLLOW_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_HOLLOW_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.HOLLOW);
        ORE_XP_LEAK_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_XP_LEAK_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.XP);

        ORE_HOLLOW_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd(), CONFIG.ORE_HOLLOW_BEDROCK_END.genOre, DimensionType.END, OreType.HOLLOW);
        ORE_XP_LEAK_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd(), CONFIG.ORE_XP_LEAK_BEDROCK_END.genOre, DimensionType.END, OreType.XP);


        if(Platform.isModLoaded("techreborn")) {
            ORE_BAUXITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_BAUXITE_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.ALUMINUM);
            ORE_GALENA_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_GALENA_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.GALENA);
            ORE_IRIDIUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_IRIDIUM_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.IRIDIUM);
            ORE_LEAD_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_LEAD_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.LEAD);
            ORE_RUBY_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_RUBY_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.RUBY);
            ORE_SAPPHIRE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_SAPPHIRE_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.SAPPHIRE);
            ORE_SILVER_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_SILVER_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.SILVER);
            ORE_TIN_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_TIN_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.TIN);

            ORE_CINNABAR_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_CINNABAR_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.CINNABAR);
            ORE_PYRITE_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_PYRITE_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.PYRITE);
            ORE_SPHALERITE_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_SPHALERITE_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.SPHALERITE);

            ORE_CINNABAR_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_CINNABAR_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.CINNABAR);
            ORE_PYRITE_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_PYRITE_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.PYRITE);
            ORE_SPHALERITE_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_SPHALERITE_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.SPHALERITE);

            ORE_PERIDOT_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd(), CONFIG.ORE_PERIDOT_BEDROCK_END.genOre, DimensionType.END, OreType.PERIDOT);
            ORE_SHELDONITE_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd(), CONFIG.ORE_SHELDONITE_BEDROCK_END.genOre, DimensionType.END, OreType.SHELDONITE);
            ORE_SODALITE_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd(), CONFIG.ORE_SODALITE_BEDROCK_END.genOre, DimensionType.END, OreType.SODALITE);
            ORE_TUNGSTEN_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd(), CONFIG.ORE_TUNGSTEN_BEDROCK_END.genOre, DimensionType.END, OreType.TUNGSTEN);
        }
        if(Platform.isModLoaded("tconstruct")) {
            ORE_TC_COBALT_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_TC_COBALT_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.COBALT);

            ORE_TC_COBALT_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_TC_COBALT_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.COBALT);
        }
        if(Platform.isModLoaded("ae2")) {
            ORE_AE_CERTUS_QUARTZ_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_AE_CERTUS_QUARTZ_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.CERTUS_QUARTZ);
        }
        if(Platform.isModLoaded("bigreactors")) {
            ORE_ER_YELLORITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_ER_YELLORITE_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.YELLORIUM);

            ORE_ER_ANGLESITE_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd(), CONFIG.ORE_ER_ANGLESITE_BEDROCK_END.genOre, DimensionType.END, OreType.ANGLESITE);

            ORE_ER_BENITOITE_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_ER_BENITOITE_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.BENITOITE);

            ORE_ER_BENITOITE_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_ER_BENITOITE_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.BENITOITE);
        }
        if(Platform.isModLoaded("biggerreactors")) {
            ORE_BR_URANIUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_BR_URANIUM_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.URANIUM);
        }
        if(Platform.isModLoaded("immersiveengineering")) {
            ORE_IE_ALUMINUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_IE_ALUMINUM_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.ALUMINUM);
            ORE_IE_LEAD_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_IE_LEAD_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.LEAD);
            ORE_IE_SILVER_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_IE_SILVER_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.SILVER);
            ORE_IE_NICKEL_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_IE_NICKEL_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.NICKEL);
            ORE_IE_URANIUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_IE_URANIUM_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.URANIUM);
        }
        if(Platform.isModLoaded("mythicmetals")) {
            ORE_MM_ADAMANTITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_ADAMANTITE_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.ADAMANTINE);
            ORE_MM_AQUARIUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_AQUARIUM_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.AQUARIUM);
            ORE_MM_BANGLUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_BANGLUM_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.BANGLUM);
            ORE_MM_CARMOT_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_CARMOT_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.CARMOT);
            ORE_MM_KYBER_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_KYBER_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.KYBER);
            ORE_MM_MANGANESE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_MANGANESE_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.MANGANESE);
            ORE_MM_MORKITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_MORKITE_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.MORKITE);
            ORE_MM_MYTHRIL_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_MYTHRIL_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.MITHRIL);
            ORE_MM_ORICHALCUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_ORICHALCUM_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.ORICHALCUM);
            ORE_MM_OSMIUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_OSMIUM_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.OSMIUM);
            ORE_MM_PLATINUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_PLATINUM_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.PLATINUM);
            ORE_MM_PROMETHEUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_PROMETHEUM_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.PROMETHEUM);
            ORE_MM_QUADRILLUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_QUADRILLUM_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.QUADRILLUM);
            ORE_MM_RUNITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_RUNITE_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.RUNITE);
            ORE_MM_SILVER_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_SILVER_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.SILVER);
            ORE_MM_STARRITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_STARRITE_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.STARRITE);
            ORE_MM_TIN_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_TIN_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.TIN);
            ORE_MM_UNOBTAINIUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MM_UNOBTAINIUM_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.UNOBTAINIUM);

            ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.BANGLUM);
            ORE_MM_MIDAS_GOLD_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_MM_MIDAS_GOLD_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.MIDAS_GOLD);
            ORE_MM_PALLADIUM_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_MM_PALLADIUM_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.PALLADIUM);
            ORE_MM_STORMYX_BEDROCK_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_MM_STORMYX_BEDROCK_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.STORMYX);

            ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.BANGLUM);
            ORE_MM_MIDAS_GOLD_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_MM_MIDAS_GOLD_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.MIDAS_GOLD);
            ORE_MM_PALLADIUM_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_MM_PALLADIUM_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.PALLADIUM);
            ORE_MM_STORMYX_BEDROCK_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_MM_STORMYX_BEDROCK_NETHER.genOre, DimensionType.NETHER_TOP, OreType.STORMYX);

            ORE_MM_STARRITE_BEDROCK_END.addOreToGen(BiomeSelectors.gensInEnd(), CONFIG.ORE_MM_STARRITE_BEDROCK_END.genOre, DimensionType.END, OreType.STARRITE);
        }
        if(Platform.isModLoaded("create")) {
            ORE_CR_ZINC_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_CR_ZINC_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.ZINC);
        }
        if(Platform.isModLoaded("mekanism")) {
            ORE_MK_OSMIUM_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MK_OSMIUM_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.OSMIUM);
            ORE_MK_FLUORITE_BEDROCK_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MK_FLUORITE_BEDROCK_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.FLUORITE);
        }
        if(Platform.isModLoaded("undergarden")) {
            ORE_UG_COAL_BEDROCK_UNDERGARDEN.addOreToGen(BiomeSelectors.gensInUndergarden(), CONFIG.ORE_COAL_BEDROCK_UNDERGARDEN.genOre, DimensionType.UNDERGARDEN, OreType.COAL);
            ORE_UG_IRON_BEDROCK_UNDERGARDEN.addOreToGen(BiomeSelectors.gensInUndergarden(), CONFIG.ORE_IRON_BEDROCK_UNDERGARDEN.genOre, DimensionType.UNDERGARDEN, OreType.IRON);
            ORE_UG_GOLD_BEDROCK_UNDERGARDEN.addOreToGen(BiomeSelectors.gensInUndergarden(), CONFIG.ORE_GOLD_BEDROCK_UNDERGARDEN.genOre, DimensionType.UNDERGARDEN, OreType.GOLD);
            ORE_UG_DIAMOND_BEDROCK_UNDERGARDEN.addOreToGen(BiomeSelectors.gensInUndergarden(), CONFIG.ORE_DIAMOND_BEDROCK_UNDERGARDEN.genOre, DimensionType.UNDERGARDEN, OreType.DIAMOND);

            ORE_UG_CLOGGRUM_BEDROCK_UNDERGARDEN.addOreToGen(BiomeSelectors.gensInUndergarden(), CONFIG.ORE_UG_CLOGGRUM_BEDROCK_UNDERGARDEN.genOre, DimensionType.UNDERGARDEN, OreType.CLOGGRUM);
            ORE_UG_FROSTSTEEL_BEDROCK_UNDERGARDEN.addOreToGen(BiomeSelectors.gensInUndergarden(), CONFIG.ORE_UG_FROSTSTEEL_BEDROCK_UNDERGARDEN.genOre, DimensionType.UNDERGARDEN, OreType.FROSTSTEEL);
            ORE_UG_UTHERIUM_BEDROCK_UNDERGARDEN.addOreToGen(BiomeSelectors.gensInUndergarden(), CONFIG.ORE_UG_UTHERIUM_BEDROCK_UNDERGARDEN.genOre, DimensionType.UNDERGARDEN, OreType.UTHERIUM);            
        }
        if(Platform.isModLoaded("beyond_earth")) {
            ORE_BE_IRON_BEDROCK_MOON.addOreToGen(BiomeSelectors.gensInBeyondEarthMoon(), CONFIG.ORE_BE_IRON_BEDROCK_MOON.genOre, DimensionType.MOON, OreType.IRON);
            ORE_BE_DESH_BEDROCK_MOON.addOreToGen(BiomeSelectors.gensInBeyondEarthMoon(), CONFIG.ORE_BE_DESH_BEDROCK_MOON.genOre, DimensionType.MOON, OreType.DESH);
            ORE_BE_ICE_SHARD_BEDROCK_MOON.addOreToGen(BiomeSelectors.gensInBeyondEarthMoon(), CONFIG.ORE_BE_ICE_SHARD_BEDROCK_MOON.genOre, DimensionType.MOON, OreType.ICE_SHARD);
            ORE_BE_CHEESE_BEDROCK_MOON.addOreToGen(BiomeSelectors.gensInBeyondEarthMoon(), CONFIG.ORE_BE_CHEESE_BEDROCK_MOON.genOre, DimensionType.MOON, OreType.CHEESE);

            ORE_BE_IRON_BEDROCK_MARS.addOreToGen(BiomeSelectors.gensInBeyondEarthMars(), CONFIG.ORE_BE_IRON_BEDROCK_MARS.genOre, DimensionType.MARS, OreType.IRON);
            ORE_BE_DIAMOND_BEDROCK_MARS.addOreToGen(BiomeSelectors.gensInBeyondEarthMars(), CONFIG.ORE_BE_DIAMOND_BEDROCK_MARS.genOre, DimensionType.MARS, OreType.DIAMOND);
            ORE_BE_OSTRUM_BEDROCK_MARS.addOreToGen(BiomeSelectors.gensInBeyondEarthMars(), CONFIG.ORE_BE_OSTRUM_BEDROCK_MARS.genOre, DimensionType.MARS, OreType.OSTRUM);
            ORE_BE_ICE_SHARD_BEDROCK_MARS.addOreToGen(BiomeSelectors.gensInBeyondEarthMars(), CONFIG.ORE_BE_ICE_SHARD_BEDROCK_MARS.genOre, DimensionType.MARS, OreType.ICE_SHARD);

            ORE_BE_COAL_BEDROCK_VENUS.addOreToGen(BiomeSelectors.gensInBeyondEarthVenus(), CONFIG.ORE_BE_COAL_BEDROCK_VENUS.genOre, DimensionType.VENUS, OreType.COAL);
            ORE_BE_DIAMOND_BEDROCK_VENUS.addOreToGen(BiomeSelectors.gensInBeyondEarthVenus(), CONFIG.ORE_BE_DIAMOND_BEDROCK_VENUS.genOre, DimensionType.VENUS, OreType.DIAMOND);
            ORE_BE_GOLD_BEDROCK_VENUS.addOreToGen(BiomeSelectors.gensInBeyondEarthVenus(), CONFIG.ORE_BE_GOLD_BEDROCK_VENUS.genOre, DimensionType.VENUS, OreType.GOLD);
            ORE_BE_CALORITE_BEDROCK_VENUS.addOreToGen(BiomeSelectors.gensInBeyondEarthVenus(), CONFIG.ORE_BE_CALORITE_BEDROCK_VENUS.genOre, DimensionType.VENUS, OreType.CALORITE);

            ORE_BE_COAL_BEDROCK_GLACIO.addOreToGen(BiomeSelectors.gensInBeyondEarthGlacio(), CONFIG.ORE_BE_COAL_BEDROCK_GLACIO.genOre, DimensionType.GLACIO, OreType.COAL);
            ORE_BE_COPPER_BEDROCK_GLACIO.addOreToGen(BiomeSelectors.gensInBeyondEarthGlacio(), CONFIG.ORE_BE_COPPER_BEDROCK_GLACIO.genOre, DimensionType.GLACIO, OreType.COPPER);
            ORE_BE_IRON_BEDROCK_GLACIO.addOreToGen(BiomeSelectors.gensInBeyondEarthGlacio(), CONFIG.ORE_BE_IRON_BEDROCK_GLACIO.genOre, DimensionType.GLACIO, OreType.IRON);
            ORE_BE_LAPIS_BEDROCK_GLACIO.addOreToGen(BiomeSelectors.gensInBeyondEarthGlacio(), CONFIG.ORE_BE_LAPIS_BEDROCK_GLACIO.genOre, DimensionType.GLACIO, OreType.LAPIS);
            ORE_BE_ICE_SHARD_BEDROCK_GLACIO.addOreToGen(BiomeSelectors.gensInBeyondEarthGlacio(), CONFIG.ORE_BE_ICE_SHARD_BEDROCK_GLACIO.genOre, DimensionType.GLACIO, OreType.ICE_SHARD);
        }
        if (Platform.isModLoaded("ftbic")) {
            ORE_IC_TIN_BEDROCK_FTB_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_IC_TIN_BEDROCK_FTB_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.TIN);
            ORE_IC_LEAD_BEDROCK_FTB_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_IC_LEAD_BEDROCK_FTB_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.LEAD);
            ORE_IC_ALUMINUM_BEDROCK_FTB_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_IC_ALUMINUM_BEDROCK_FTB_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.ALUMINUM);
            ORE_IC_IRIDIUM_BEDROCK_FTB_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_IC_IRIDIUM_BEDROCK_FTB_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.IRIDIUM);
        }
        if (Platform.isModLoaded("malum")) {
            ORE_MA_SOULSTONE_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MA_SOULSTONE_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.SOULSTONE);
            ORE_MA_BRILLIANCE_OVERWORLD.addOreToGen(BiomeSelectors.gensInOverworld(), CONFIG.ORE_MA_BRILLIANCE_OVERWORLD.genOre, DimensionType.OVERWORLD, OreType.BRILLIANCE);
            
            ORE_MA_BLAZING_QUARTZ_NETHER.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_MA_BLAZING_QUARTZ_NETHER.genOre, DimensionType.NETHER_BOTTOM, OreType.BLAZING_QUARTZ);
            ORE_MA_BLAZING_QUARTZ_NETHER_TOP.addOreToGen(BiomeSelectors.gensInNether(), CONFIG.ORE_MA_BLAZING_QUARTZ_NETHER.genOre, DimensionType.NETHER_TOP, OreType.BLAZING_QUARTZ);
        }
    }


}
