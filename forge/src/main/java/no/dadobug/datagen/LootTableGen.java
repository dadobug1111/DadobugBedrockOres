package no.dadobug.datagen;

import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.Identifier;
import no.dadobug.EntryModule;

/*
 * Uses BaseBedrockLootTableGen to create the loot tables for every bedrock ore
 */
public class LootTableGen extends BaseBedrockLootTableGen{

    public LootTableGen(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void addTables() {
        // Vanilla
        createFracturedBedrockTable("bedrock_fractured", EntryModule.BEDROCK_FRACTURED);
        createHollowBedrockTable("bedrock_hollow", EntryModule.BEDROCK_HOLLOW.get(), EntryModule.BEDROCK_HOLLOW_ITEM.get());
        createCookieBedrockTable("bedrock_cookie_ore", EntryModule.BEDROCK_COOKIE_ORE);
        createBedrockOreTable("bedrock_coal_ore", EntryModule.BEDROCK_COAL_ORE, Blocks.COAL_ORE.getLootTableId(), Blocks.DEEPSLATE_COAL_ORE.getLootTableId(), new Identifier("undergarden", "blocks/depthrock_coal_ore"), new Identifier("undergarden", "blocks/shiverstone_coal_ore"), new Identifier("undergarden", "blocks/venus_coal_ore"), new Identifier("undergarden", "blocks/venus_coal_ore"));
        createBedrockOreTable("bedrock_iron_ore", EntryModule.BEDROCK_IRON_ORE, Blocks.IRON_ORE.getLootTableId(), Blocks.DEEPSLATE_IRON_ORE.getLootTableId(), new Identifier("undergarden", "blocks/depthrock_iron_ore"), new Identifier("undergarden", "blocks/shiverstone_iron_ore"), new Identifier("undergarden", "blocks/moon_iron_ore"), new Identifier("undergarden", "blocks/mars_iron_ore"), new Identifier("undergarden", "blocks/mercury_iron_ore"), new Identifier("undergarden", "blocks/glacio_iron_ore"));
        createBedrockOreTable("bedrock_gold_ore", EntryModule.BEDROCK_GOLD_ORE, Blocks.GOLD_ORE.getLootTableId(), Blocks.DEEPSLATE_GOLD_ORE.getLootTableId(), new Identifier("undergarden", "blocks/depthrock_gold_ore"), new Identifier("undergarden", "blocks/venus_gold_ore"));
        createBedrockOreTable("bedrock_diamond_ore", EntryModule.BEDROCK_DIAMOND_ORE, Blocks.DIAMOND_ORE.getLootTableId(), Blocks.DEEPSLATE_DIAMOND_ORE.getLootTableId(), new Identifier("undergarden", "blocks/depthrock_diamond_ore"), new Identifier("undergarden", "blocks/shiverstone_diamond_ore"), new Identifier("undergarden", "blocks/mars_diamond_ore"), new Identifier("undergarden", "blocks/venus_diamond_ore"));
        createBedrockOreTable("bedrock_redstone_ore", EntryModule.BEDROCK_REDSTONE_ORE, Blocks.REDSTONE_ORE.getLootTableId(), Blocks.DEEPSLATE_REDSTONE_ORE.getLootTableId());
        createBedrockOreTable("bedrock_copper_ore", EntryModule.BEDROCK_COPPER_ORE, Blocks.COPPER_ORE.getLootTableId(), Blocks.DEEPSLATE_COPPER_ORE.getLootTableId(), new Identifier("undergarden", "blocks/glacio_copper_ore"));
        createBedrockOreTable("bedrock_lapis_ore", EntryModule.BEDROCK_LAPIS_ORE, Blocks.LAPIS_ORE.getLootTableId(), Blocks.DEEPSLATE_LAPIS_ORE.getLootTableId(), new Identifier("undergarden", "blocks/glacio_lapis_ore"));
        createBedrockOreTable("bedrock_emerald_ore", EntryModule.BEDROCK_EMERALD_ORE, Blocks.EMERALD_ORE.getLootTableId(), Blocks.DEEPSLATE_EMERALD_ORE.getLootTableId());

        createBedrockOreTable("bedrock_nether_gold_ore", EntryModule.BEDROCK_NETHER_GOLD, Blocks.NETHER_GOLD_ORE.getLootTableId());
        createBedrockOreTable("bedrock_nether_quartz_ore", EntryModule.BEDROCK_NETHER_QUARTZ, Blocks.NETHER_QUARTZ_ORE.getLootTableId());
        createBedrockOreTable("bedrock_ancient_debris_ore", EntryModule.BEDROCK_ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS.getLootTableId());

        createBedrockLiquidTable("bedrock_milk_ore", EntryModule.BEDROCK_MILK_ORE);
        createBedrockLiquidTable("bedrock_water_ore", EntryModule.BEDROCK_WATER_ORE);
        createBedrockLiquidTable("bedrock_lava_ore", EntryModule.BEDROCK_LAVA_ORE);
        createBedrockLiquidTable("bedrock_xp_leak", EntryModule.XP_LEAK);
        
        //techreborn
        createBedrockOreTable("bedrock_bauxite_ore", EntryModule.BEDROCK_BAUXITE_ORE, new Identifier("techreborn", "blocks/bauxite_ore"), new Identifier("techreborn", "blocks/deepslate_bauxite_ore"));
        createBedrockOreTable("bedrock_galena_ore", EntryModule.BEDROCK_GALENA_ORE, new Identifier("techreborn", "blocks/galena_ore"), new Identifier("techreborn", "blocks/deepslate_galena_ore"));
        createBedrockOreTable("bedrock_iridium_ore", EntryModule.BEDROCK_IRIDIUM_ORE, new Identifier("techreborn", "blocks/iridium_ore"), new Identifier("techreborn", "blocks/deepslate_iridium_ore"));
        createBedrockOreTable("bedrock_lead_ore", EntryModule.BEDROCK_LEAD_ORE, new Identifier("techreborn", "blocks/lead_ore"), new Identifier("techreborn", "blocks/deepslate_lead_ore"));
        createBedrockOreTable("bedrock_ruby_ore", EntryModule.BEDROCK_RUBY_ORE, new Identifier("techreborn", "blocks/ruby_ore"), new Identifier("techreborn", "blocks/deepslate_ruby_ore"));
        createBedrockOreTable("bedrock_sapphire_ore", EntryModule.BEDROCK_SAPPHIRE_ORE, new Identifier("techreborn", "blocks/sapphire_ore"), new Identifier("techreborn", "blocks/deepslate_sapphire_ore"));
        createBedrockOreTable("bedrock_silver_ore", EntryModule.BEDROCK_SILVER_ORE, new Identifier("techreborn", "blocks/silver_ore"), new Identifier("techreborn", "blocks/deepslate_silver_ore"));
        createBedrockOreTable("bedrock_tin_ore", EntryModule.BEDROCK_TIN_ORE, new Identifier("techreborn", "blocks/tin_ore"), new Identifier("techreborn", "blocks/deepslate_tin_ore"));
        
        createBedrockOreTable("bedrock_cinnabar_ore", EntryModule.BEDROCK_CINNABAR_ORE, new Identifier("techreborn", "blocks/cinnabar_ore"));
        createBedrockOreTable("bedrock_pyrite_ore", EntryModule.BEDROCK_PYRITE_ORE, new Identifier("techreborn", "blocks/pyrite_ore"));
        createBedrockOreTable("bedrock_sphalerite_ore", EntryModule.BEDROCK_SPHALERITE_ORE, new Identifier("techreborn", "blocks/sphalerite_ore"));
        
        createBedrockOreTable("bedrock_peridot_ore", EntryModule.BEDROCK_PERIDOT_ORE, new Identifier("techreborn", "blocks/peridot_ore"));
        createBedrockOreTable("bedrock_sheldonite_ore", EntryModule.BEDROCK_SHELDONITE_ORE, new Identifier("techreborn", "blocks/sheldonite_ore"));
        createBedrockOreTable("bedrock_sodalite_ore", EntryModule.BEDROCK_SODALITE_ORE, new Identifier("techreborn", "blocks/sodalite_ore"));
        createBedrockOreTable("bedrock_tungsten_ore", EntryModule.BEDROCK_TUNGSTEN_ORE, new Identifier("techreborn", "blocks/tungsten_ore"));
       
       
        createBedrockOreTable("bedrock_tc_cobalt_ore", EntryModule.BEDROCK_TC_COBALT_ORE, new Identifier("tconstruct", "blocks/cobalt_ore"));


        createBedrockOreTable("bedrock_ae_certus_quartz_ore", EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE, new Identifier("ae2", "blocks/quartz_ore"), new Identifier("ae2", "blocks/deepslate_quartz_ore"));


        createBedrockOreTable("bedrock_er_yellorite_ore", EntryModule.BEDROCK_ER_YELLORITE_ORE, new Identifier("bigreactors", "blocks/yellorite_ore"));
        createBedrockOreTable("bedrock_er_anglesite_ore", EntryModule.BEDROCK_ER_ANGLESITE_ORE, new Identifier("bigreactors", "blocks/anglesite_ore"));
        createBedrockOreTable("bedrock_er_benitoite_ore", EntryModule.BEDROCK_ER_BENITOITE_ORE, new Identifier("bigreactors", "blocks/benitoite_ore"));


        createBedrockOreTable("bedrock_br_uranium_ore", EntryModule.BEDROCK_BR_URANIUM_ORE, new Identifier("biggerreactors", "blocks/uranium_ore"));


        createBedrockOreTable("bedrock_ie_aluminum_ore", EntryModule.BEDROCK_IE_ALUMINUM_ORE, new Identifier("immersiveengineering", "blocks/ore_aluminum"), new Identifier("immersiveengineering", "blocks/deepslate_ore_aluminum"));
        createBedrockOreTable("bedrock_ie_lead_ore", EntryModule.BEDROCK_IE_LEAD_ORE, new Identifier("immersiveengineering", "blocks/ore_lead"), new Identifier("immersiveengineering", "blocks/deepslate_ore_lead"));
        createBedrockOreTable("bedrock_ie_silver_ore", EntryModule.BEDROCK_IE_SILVER_ORE, new Identifier("immersiveengineering", "blocks/ore_silver"), new Identifier("immersiveengineering", "blocks/deepslate_ore_silver"));
        createBedrockOreTable("bedrock_ie_nickel_ore", EntryModule.BEDROCK_IE_NICKEL_ORE, new Identifier("immersiveengineering", "blocks/ore_nickel"), new Identifier("immersiveengineering", "blocks/deepslate_ore_nickel"));
        createBedrockOreTable("bedrock_ie_uranium_ore", EntryModule.BEDROCK_IE_URANIUM_ORE, new Identifier("immersiveengineering", "blocks/ore_uranium"), new Identifier("immersiveengineering", "blocks/deepslate_ore_uranium"));
        
        
        createBedrockOreTable("bedrock_mm_adamantite_ore", EntryModule.BEDROCK_MM_ADAMANTITE_ORE, new Identifier("mythicmetals", "blocks/adamantite_ore"), new Identifier("mythicmetals", "blocks/deepslate_adamantite_ore"));
        createBedrockOreTable("bedrock_mm_aquarium_ore", EntryModule.BEDROCK_MM_AQUARIUM_ORE, new Identifier("mythicmetals", "blocks/aquarium_ore"));
        createBedrockOreTable("bedrock_mm_banglum_ore", EntryModule.BEDROCK_MM_BANGLUM_ORE, new Identifier("mythicmetals", "blocks/banglum_ore"));
        createBedrockOreTable("bedrock_mm_carmot_ore", EntryModule.BEDROCK_MM_CARMOT_ORE, new Identifier("mythicmetals", "blocks/carmot_ore"), new Identifier("mythicmetals", "blocks/deepslate_carmot_ore"));
        createBedrockOreTable("bedrock_mm_kyber_ore", EntryModule.BEDROCK_MM_KYBER_ORE, new Identifier("mythicmetals", "blocks/kyber_ore"), new Identifier("mythicmetals", "blocks/calcite_kyber_ore"));
        createBedrockOreTable("bedrock_mm_manganese_ore", EntryModule.BEDROCK_MM_MANGANESE_ORE, new Identifier("mythicmetals", "blocks/manganese_ore"));
        createBedrockOreTable("bedrock_mm_morkite_ore", EntryModule.BEDROCK_MM_MORKITE_ORE, new Identifier("mythicmetals", "blocks/morkite_ore"), new Identifier("mythicmetals", "blocks/deepslate_morkite_ore"));
        createBedrockOreTable("bedrock_mm_mythril_ore", EntryModule.BEDROCK_MM_MYTHRIL_ORE, new Identifier("mythicmetals", "blocks/mythril_ore"), new Identifier("mythicmetals", "blocks/deepslate_mythril_ore"));
        createBedrockOreTable("bedrock_mm_orichalcum_ore", EntryModule.BEDROCK_MM_ORICHALCUM_ORE, new Identifier("mythicmetals", "blocks/orichalcum_ore"), new Identifier("mythicmetals", "blocks/deepslate_orichalcum_ore"), new Identifier("mythicmetals", "blocks/smooth_basalt_orichalcum_ore"));
        createBedrockOreTable("bedrock_mm_osmium_ore", EntryModule.BEDROCK_MM_OSMIUM_ORE, new Identifier("mythicmetals", "blocks/osmium_ore"));
        createBedrockOreTable("bedrock_mm_platinum_ore", EntryModule.BEDROCK_MM_PLATINUM_ORE, new Identifier("mythicmetals", "blocks/platinum_ore"));
        createBedrockOreTable("bedrock_mm_prometheum_ore", EntryModule.BEDROCK_MM_PROMETHEUM_ORE, new Identifier("mythicmetals", "blocks/prometheum_ore"), new Identifier("mythicmetals", "blocks/deepslate_prometheum_ore"));
        createBedrockOreTable("bedrock_mm_quadrillum_ore", EntryModule.BEDROCK_MM_QUADRILLUM_ORE, new Identifier("mythicmetals", "blocks/quadrillum_ore"));
        createBedrockOreTable("bedrock_mm_runite_ore", EntryModule.BEDROCK_MM_RUNITE_ORE, new Identifier("mythicmetals", "blocks/runite_ore"));
        createBedrockOreTable("bedrock_mm_silver_ore", EntryModule.BEDROCK_MM_SILVER_ORE, new Identifier("mythicmetals", "blocks/silver_ore"));
        createBedrockOreTable("bedrock_mm_starrite_ore", EntryModule.BEDROCK_MM_STARRITE_ORE, new Identifier("mythicmetals", "blocks/starrite_ore"), new Identifier("mythicmetals", "blocks/calcite_starrite_ore"), new Identifier("mythicmetals", "blocks/end_stone_starrite_ore"));
        createBedrockOreTable("bedrock_mm_tin_ore", EntryModule.BEDROCK_MM_TIN_ORE, new Identifier("mythicmetals", "blocks/tin_ore"));
        createBedrockOreTable("bedrock_mm_unobtainium_ore", EntryModule.BEDROCK_MM_UNOBTAINIUM_ORE, new Identifier("mythicmetals", "blocks/unobtainium_ore"), new Identifier("mythicmetals", "blocks/deepslate_unobtainium_ore"));
        
        createBedrockOreTable("bedrock_mm_nether_banglum_ore", EntryModule.BEDROCK_MM_NETHER_BANGLUM_ORE, new Identifier("mythicmetals", "blocks/nether_banglum_ore"));
        createBedrockOreTable("bedrock_mm_midas_gold_ore", EntryModule.BEDROCK_MM_MIDAS_GOLD_ORE, new Identifier("mythicmetals", "blocks/midas_gold_ore"));
        createBedrockOreTable("bedrock_mm_palladium_ore", EntryModule.BEDROCK_MM_PALLADIUM_ORE, new Identifier("mythicmetals", "blocks/palladium_ore"));
        createBedrockOreTable("bedrock_mm_stormyx_ore", EntryModule.BEDROCK_MM_STORMYX_ORE, new Identifier("mythicmetals", "blocks/stormyx_ore"), new Identifier("mythicmetals", "blocks/blackstone_stormyx_ore"));
        
        
        createBedrockOreTable("bedrock_cr_zinc_ore", EntryModule.BEDROCK_CR_ZINC_ORE, new Identifier("create", "blocks/zinc_ore"), new Identifier("create", "blocks/deepslate_zinc_ore"));
        
        
        createBedrockOreTable("bedrock_mk_osmium_ore", EntryModule.BEDROCK_MK_OSMIUM_ORE, new Identifier("mekanism", "blocks/osmium_ore"), new Identifier("mekanism", "blocks/deepslate_osmium_ore"));
        createBedrockOreTable("bedrock_mk_fluorite_ore", EntryModule.BEDROCK_MK_FLUORITE_ORE, new Identifier("mekanism", "blocks/fluorite_ore"), new Identifier("mekanism", "blocks/deepslate_fluorite_ore"));
        createBedrockOreTable("bedrock_mk_lead_ore", EntryModule.BEDROCK_MK_LEAD_ORE, new Identifier("mekanism", "blocks/lead_ore"), new Identifier("mekanism", "blocks/deepslate_lead_ore"));
        createBedrockOreTable("bedrock_mk_tin_ore", EntryModule.BEDROCK_MK_TIN_ORE, new Identifier("mekanism", "blocks/tin_ore"), new Identifier("mekanism", "blocks/deepslate_tin_ore"));
        createBedrockOreTable("bedrock_mk_uranium_ore", EntryModule.BEDROCK_MK_URANIUM_ORE, new Identifier("mekanism", "blocks/uranium_ore"), new Identifier("mekanism", "blocks/deepslate_uranium_ore"));
        
        
        createBedrockOreTable("bedrock_ug_cloggrum_ore", EntryModule.BEDROCK_UG_CLOGGRUM_ORE, new Identifier("undergarden", "blocks/depthrock_cloggrum_ore"), new Identifier("undergarden", "blocks/shiverstone_cloggrum_ore"));
        createBedrockOreTable("bedrock_ug_froststeel_ore", EntryModule.BEDROCK_UG_FROSTSTEEL_ORE, new Identifier("undergarden", "blocks/shiverstone_froststeel_ore"));
        createBedrockOreTable("bedrock_ug_utherium_ore", EntryModule.BEDROCK_UG_UTHERIUM_ORE, new Identifier("undergarden", "blocks/depthrock_utherium_ore"), new Identifier("undergarden", "blocks/shiverstone_utherium_ore"), new Identifier("undergarden", "blocks/tremblecrust_utherium_ore"));
        createBedrockOreTable("bedrock_ug_regalium_ore", EntryModule.BEDROCK_UG_REGALIUM_ORE, new Identifier("undergarden", "blocks/depthrock_regalium_ore"), new Identifier("undergarden", "blocks/shiverstone_regalium_ore"));


        createBedrockOreTable("bedrock_be_desh_ore", EntryModule.BEDROCK_BE_DESH_ORE, new Identifier("beyond_earth", "blocks/moon_desh_ore"));
        createBedrockOreTable("bedrock_be_cheese_ore", EntryModule.BEDROCK_BE_CHEESE_ORE, new Identifier("beyond_earth", "blocks/moon_cheese_ore"));
        createBedrockOreTable("bedrock_be_ice_shard_ore", EntryModule.BEDROCK_BE_ICE_SHARD_ORE, new Identifier("beyond_earth", "blocks/moon_ice_shard_ore"), new Identifier("beyond_earth", "blocks/mars_ice_shard_ore"), new Identifier("beyond_earth", "blocks/glacio_ice_shard_ore"));
        createBedrockOreTable("bedrock_be_ostrum_ore", EntryModule.BEDROCK_BE_OSTRUM_ORE, new Identifier("beyond_earth", "blocks/mars_ostrum_ore"));
        createBedrockOreTable("bedrock_be_calorite_ore", EntryModule.BEDROCK_BE_CALORITE_ORE, new Identifier("beyond_earth", "blocks/venus_calorite_ore"));


        createBedrockOreTable("bedrock_ic_tin_ore", EntryModule.BEDROCK_IC_TIN_ORE, new Identifier("ftbic", "blocks/tin_ore"), new Identifier("ftbic", "blocks/deepslate_tin_ore"));
        createBedrockOreTable("bedrock_ic_lead_ore", EntryModule.BEDROCK_IC_LEAD_ORE, new Identifier("ftbic", "blocks/lead_ore"), new Identifier("ftbic", "blocks/deepslate_lead_ore"));
        createBedrockOreTable("bedrock_ic_aluminum_ore", EntryModule.BEDROCK_IC_ALUMINUM_ORE, new Identifier("ftbic", "blocks/aluminum_ore"), new Identifier("ftbic", "blocks/deepslate_aluminum_ore"));
        createBedrockOreTable("bedrock_ic_iridium_ore", EntryModule.BEDROCK_IC_IRIDIUM_ORE, new Identifier("ftbic", "blocks/iridium_ore"), new Identifier("ftbic", "blocks/deepslate_iridium_ore"));
        createBedrockOreTable("bedrock_ic_uranium_ore", EntryModule.BEDROCK_IC_URANIUM_ORE, new Identifier("ftbic", "blocks/uranium_ore"), new Identifier("ftbic", "blocks/deepslate_uranium_ore"));


        createBedrockOreTable("bedrock_ma_soulstone_ore", EntryModule.BEDROCK_MA_SOULSTONE_ORE, new Identifier("malum", "blocks/soulstone_ore"), new Identifier("malum", "blocks/deepslate_soulstone_ore"));
        createBedrockOreTable("bedrock_ma_brilliance_ore", EntryModule.BEDROCK_MA_BRILLIANCE_ORE, new Identifier("malum", "blocks/brilliant_stone"), new Identifier("malum", "blocks/brilliant_deepslate"));
        createBedrockOreTable("bedrock_ma_blazing_quartz_ore", EntryModule.BEDROCK_MA_BLAZING_QUARTZ_ORE, new Identifier("malum", "blocks/blazing_quartz_ore"));


        createBedrockOreTable("bedrock_th_niter_ore", EntryModule.BEDROCK_TH_NITER_ORE, new Identifier("thermal", "blocks/niter_ore"), new Identifier("thermal", "blocks/deepslate_niter_ore"));
        createBedrockOreTable("bedrock_th_sulfur_ore", EntryModule.BEDROCK_TH_SULFUR_ORE, new Identifier("thermal", "blocks/sulfur_ore"), new Identifier("thermal", "blocks/deepslate_sulfur_ore"), new Identifier("thermal", "blocks/sulfur_ore_netherrack"));
        createBedrockOreTable("bedrock_th_tin_ore", EntryModule.BEDROCK_TH_TIN_ORE, new Identifier("thermal", "blocks/tin_ore"), new Identifier("thermal", "blocks/deepslate_tin_ore"));
        createBedrockOreTable("bedrock_th_lead_ore", EntryModule.BEDROCK_TH_LEAD_ORE, new Identifier("thermal", "blocks/lead_ore"), new Identifier("thermal", "blocks/deepslate_lead_ore"));
        createBedrockOreTable("bedrock_th_silver_ore", EntryModule.BEDROCK_TH_SILVER_ORE, new Identifier("thermal", "blocks/silver_ore"), new Identifier("thermal", "blocks/deepslate_silver_ore"));
        createBedrockOreTable("bedrock_th_nickel_ore", EntryModule.BEDROCK_TH_NICKEL_ORE, new Identifier("thermal", "blocks/nickel_ore"), new Identifier("thermal", "blocks/deepslate_nickel_ore"));
        createBedrockOreTable("bedrock_th_apatite_ore", EntryModule.BEDROCK_TH_APATITE_ORE, new Identifier("thermal", "blocks/apatite_ore"), new Identifier("thermal", "blocks/deepslate_apatite_ore"));
        createBedrockOreTable("bedrock_th_cinnabar_ore", EntryModule.BEDROCK_TH_CINNABAR_ORE, new Identifier("thermal", "blocks/cinnabar_ore"), new Identifier("thermal", "blocks/deepslate_cinnabar_ore"));
        createBedrockOreTable("bedrock_th_oil_ore", EntryModule.BEDROCK_TH_OIL_ORE, new Identifier("thermal", "blocks/oil_sand"), new Identifier("thermal", "blocks/oil_red_sand"));
    }
}
