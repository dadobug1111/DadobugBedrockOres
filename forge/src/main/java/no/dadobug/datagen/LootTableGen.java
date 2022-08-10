package no.dadobug.datagen;

import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.Identifier;
import no.dadobug.EntryModule;

public class LootTableGen extends BaseBedrockLootTableGen{

    public LootTableGen(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void addTables() {
        // Vanilla
        createFracturedBedrockTable("bedrock_fractured", EntryModule.BEDROCK_FRACTURED);
        createHollowBedrockTable("bedrock_hollow", EntryModule.BEDROCK_HOLLOW.get(), EntryModule.BEDROCK_HOLLOW_ITEM.get());
        createBedrockOreTable("bedrock_coal_ore", Blocks.COAL_ORE.getRegistryName(), EntryModule.BEDROCK_COAL_ORE);
        createBedrockOreTable("bedrock_iron_ore", Blocks.IRON_ORE.getRegistryName(), EntryModule.BEDROCK_IRON_ORE);
        createBedrockOreTable("bedrock_gold_ore", Blocks.GOLD_ORE.getRegistryName(), EntryModule.BEDROCK_GOLD_ORE);
        createBedrockOreTable("bedrock_diamond_ore", Blocks.DIAMOND_ORE.getRegistryName(), EntryModule.BEDROCK_DIAMOND_ORE);
        createBedrockOreTable("bedrock_redstone_ore", Blocks.REDSTONE_ORE.getRegistryName(), EntryModule.BEDROCK_REDSTONE_ORE);
        createBedrockOreTable("bedrock_copper_ore", Blocks.COPPER_ORE.getRegistryName(), EntryModule.BEDROCK_COPPER_ORE);
        createBedrockOreTable("bedrock_lapis_ore", Blocks.LAPIS_ORE.getRegistryName(), EntryModule.BEDROCK_LAPIS_ORE);
        createBedrockOreTable("bedrock_emerald_ore", Blocks.EMERALD_ORE.getRegistryName(), EntryModule.BEDROCK_EMERALD_ORE);

        createBedrockOreTable("bedrock_nether_gold_ore", Blocks.NETHER_GOLD_ORE.getRegistryName(), EntryModule.BEDROCK_NETHER_GOLD);
        createBedrockOreTable("bedrock_nether_quartz_ore", Blocks.NETHER_QUARTZ_ORE.getRegistryName(), EntryModule.BEDROCK_NETHER_QUARTZ);
        createBedrockOreTable("bedrock_ancient_debris_ore", Blocks.ANCIENT_DEBRIS.getRegistryName(), EntryModule.BEDROCK_ANCIENT_DEBRIS);

        createBedrockLiquidTable("bedrock_milk_ore", EntryModule.BEDROCK_MILK_ORE);
        createBedrockLiquidTable("bedrock_water_ore", EntryModule.BEDROCK_WATER_ORE);
        createBedrockLiquidTable("bedrock_lava_ore", EntryModule.BEDROCK_LAVA_ORE);
        createBedrockLiquidTable("bedrock_xp_leak", EntryModule.XP_LEAK);
        
        //techreborn
        createBedrockOreTable("bedrock_bauxite_ore", new Identifier("techreborn", "blocks/bauxite_ore"), EntryModule.BEDROCK_BAUXITE_ORE);
        createBedrockOreTable("bedrock_galena_ore", new Identifier("techreborn", "blocks/galena_ore"), EntryModule.BEDROCK_GALENA_ORE);
        createBedrockOreTable("bedrock_iridium_ore", new Identifier("techreborn", "blocks/iridium_ore"), EntryModule.BEDROCK_IRIDIUM_ORE);
        createBedrockOreTable("bedrock_lead_ore", new Identifier("techreborn", "blocks/lead_ore"), EntryModule.BEDROCK_LEAD_ORE);
        createBedrockOreTable("bedrock_ruby_ore", new Identifier("techreborn", "blocks/ruby_ore"), EntryModule.BEDROCK_RUBY_ORE);
        createBedrockOreTable("bedrock_sapphire_ore", new Identifier("techreborn", "blocks/sapphire_ore"), EntryModule.BEDROCK_SAPPHIRE_ORE);
        createBedrockOreTable("bedrock_silver_ore", new Identifier("techreborn", "blocks/silver_ore"), EntryModule.BEDROCK_SILVER_ORE);
        createBedrockOreTable("bedrock_tin_ore", new Identifier("techreborn", "blocks/tin_ore"), EntryModule.BEDROCK_TIN_ORE);
        
        createBedrockOreTable("bedrock_cinnabar_ore", new Identifier("techreborn", "blocks/cinnabar_ore"), EntryModule.BEDROCK_CINNABAR_ORE);
        createBedrockOreTable("bedrock_pyrite_ore", new Identifier("techreborn", "blocks/pyrite_ore"), EntryModule.BEDROCK_PYRITE_ORE);
        createBedrockOreTable("bedrock_sphalerite_ore", new Identifier("techreborn", "blocks/sphalerite_ore"), EntryModule.BEDROCK_SPHALERITE_ORE);
        
        createBedrockOreTable("bedrock_peridot_ore", new Identifier("techreborn", "blocks/peridot_ore"), EntryModule.BEDROCK_PERIDOT_ORE);
        createBedrockOreTable("bedrock_sheldonite_ore", new Identifier("techreborn", "blocks/sheldonite_ore"), EntryModule.BEDROCK_SHELDONITE_ORE);
        createBedrockOreTable("bedrock_sodalite_ore", new Identifier("techreborn", "blocks/sodalite_ore"), EntryModule.BEDROCK_SODALITE_ORE);
        createBedrockOreTable("bedrock_tungsten_ore", new Identifier("techreborn", "blocks/tungsten_ore"), EntryModule.BEDROCK_TUNGSTEN_ORE);
       
       
        createBedrockOreTable("bedrock_tc_cobalt_ore", new Identifier("tconstruct", "blocks/cobalt_ore"), EntryModule.BEDROCK_TC_COBALT_ORE);


        createBedrockOreTable("bedrock_ae_certus_quartz_ore", new Identifier("ae2", "blocks/quartz_ore"), EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE);


        createBedrockOreTable("bedrock_er_yellorite_ore", new Identifier("bigreactors", "blocks/yellorite_ore"), EntryModule.BEDROCK_ER_YELLORITE_ORE);
        createBedrockOreTable("bedrock_er_anglesite_ore", new Identifier("bigreactors", "blocks/anglesite_ore"), EntryModule.BEDROCK_ER_ANGLESITE_ORE);
        createBedrockOreTable("bedrock_er_benitoite_ore", new Identifier("bigreactors", "blocks/benitoite_ore"), EntryModule.BEDROCK_ER_BENITOITE_ORE);


        createBedrockOreTable("bedrock_br_uranium_ore", new Identifier("biggerreactors", "blocks/uranium_ore"), EntryModule.BEDROCK_BR_URANIUM_ORE);


        createBedrockOreTable("bedrock_ie_aluminum_ore", new Identifier("immersiveengineering", "blocks/ore_aluminum"), EntryModule.BEDROCK_IE_ALUMINUM_ORE);
        createBedrockOreTable("bedrock_ie_lead_ore", new Identifier("immersiveengineering", "blocks/ore_lead"), EntryModule.BEDROCK_IE_LEAD_ORE);
        createBedrockOreTable("bedrock_ie_silver_ore", new Identifier("immersiveengineering", "blocks/ore_silver"), EntryModule.BEDROCK_IE_SILVER_ORE);
        createBedrockOreTable("bedrock_ie_nickel_ore", new Identifier("immersiveengineering", "blocks/ore_nickel"), EntryModule.BEDROCK_IE_NICKEL_ORE);
        createBedrockOreTable("bedrock_ie_uranium_ore", new Identifier("immersiveengineering", "blocks/ore_uranium"), EntryModule.BEDROCK_IE_URANIUM_ORE);
        
        
        createBedrockOreTable("bedrock_mm_adamantite_ore", new Identifier("mythicmetals", "blocks/adamantite_ore"), EntryModule.BEDROCK_MM_ADAMANTITE_ORE);
        createBedrockOreTable("bedrock_mm_aquarium_ore", new Identifier("mythicmetals", "blocks/aquarium_ore"), EntryModule.BEDROCK_MM_AQUARIUM_ORE);
        createBedrockOreTable("bedrock_mm_banglum_ore", new Identifier("mythicmetals", "blocks/banglum_ore"), EntryModule.BEDROCK_MM_BANGLUM_ORE);
        createBedrockOreTable("bedrock_mm_carmot_ore", new Identifier("mythicmetals", "blocks/carmot_ore"), EntryModule.BEDROCK_MM_CARMOT_ORE);
        createBedrockOreTable("bedrock_mm_kyber_ore", new Identifier("mythicmetals", "blocks/kyber_ore"), EntryModule.BEDROCK_MM_KYBER_ORE);
        createBedrockOreTable("bedrock_mm_manganese_ore", new Identifier("mythicmetals", "blocks/manganese_ore"), EntryModule.BEDROCK_MM_MANGANESE_ORE);
        createBedrockOreTable("bedrock_mm_morkite_ore", new Identifier("mythicmetals", "blocks/morkite_ore"), EntryModule.BEDROCK_MM_MORKITE_ORE);
        createBedrockOreTable("bedrock_mm_mythril_ore", new Identifier("mythicmetals", "blocks/mythril_ore"), EntryModule.BEDROCK_MM_MYTHRIL_ORE);
        createBedrockOreTable("bedrock_mm_orichalcum_ore", new Identifier("mythicmetals", "blocks/orichalcum_ore"), EntryModule.BEDROCK_MM_ORICHALCUM_ORE);
        createBedrockOreTable("bedrock_mm_osmium_ore", new Identifier("mythicmetals", "blocks/osmium_ore"), EntryModule.BEDROCK_MM_OSMIUM_ORE);
        createBedrockOreTable("bedrock_mm_platinum_ore", new Identifier("mythicmetals", "blocks/platinum_ore"), EntryModule.BEDROCK_MM_PLATINUM_ORE);
        createBedrockOreTable("bedrock_mm_prometheum_ore", new Identifier("mythicmetals", "blocks/prometheum_ore"), EntryModule.BEDROCK_MM_PROMETHEUM_ORE);
        createBedrockOreTable("bedrock_mm_quadrillum_ore", new Identifier("mythicmetals", "blocks/quadrillum_ore"), EntryModule.BEDROCK_MM_QUADRILLUM_ORE);
        createBedrockOreTable("bedrock_mm_runite_ore", new Identifier("mythicmetals", "blocks/runite_ore"), EntryModule.BEDROCK_MM_RUNITE_ORE);
        createBedrockOreTable("bedrock_mm_silver_ore", new Identifier("mythicmetals", "blocks/silver_ore"), EntryModule.BEDROCK_MM_SILVER_ORE);
        createBedrockOreTable("bedrock_mm_starrite_ore", new Identifier("mythicmetals", "blocks/starrite_ore"), EntryModule.BEDROCK_MM_STARRITE_ORE);
        createBedrockOreTable("bedrock_mm_tin_ore", new Identifier("mythicmetals", "blocks/tin_ore"), EntryModule.BEDROCK_MM_TIN_ORE);
        createBedrockOreTable("bedrock_mm_unobtainium_ore", new Identifier("mythicmetals", "blocks/unobtainium_ore"), EntryModule.BEDROCK_MM_UNOBTAINIUM_ORE);
        
        createBedrockOreTable("bedrock_mm_nether_banglum_ore", new Identifier("mythicmetals", "blocks/nether_banglum_ore"), EntryModule.BEDROCK_MM_NETHER_BANGLUM_ORE);
        createBedrockOreTable("bedrock_mm_midas_gold_ore", new Identifier("mythicmetals", "blocks/midas_gold_ore"), EntryModule.BEDROCK_MM_MIDAS_GOLD_ORE);
        createBedrockOreTable("bedrock_mm_palladium_ore", new Identifier("mythicmetals", "blocks/palladium_ore"), EntryModule.BEDROCK_MM_PALLADIUM_ORE);
        createBedrockOreTable("bedrock_mm_stormyx_ore", new Identifier("mythicmetals", "blocks/stormyx_ore"), EntryModule.BEDROCK_MM_STORMYX_ORE);
        
        
        createBedrockOreTable("bedrock_cr_zinc_ore", new Identifier("create", "blocks/deepslate_zinc_ore"), EntryModule.BEDROCK_CR_ZINC_ORE);
        
        
        createBedrockOreTable("bedrock_mk_osmium_ore", new Identifier("mekanism", "blocks/osmium_ore"), EntryModule.BEDROCK_MK_OSMIUM_ORE);
        createBedrockOreTable("bedrock_mk_fluorite_ore", new Identifier("mekanism", "blocks/fluorite_ore"), EntryModule.BEDROCK_MK_FLUORITE_ORE);
        
        
        createBedrockOreTable("bedrock_ug_cloggrum_ore", new Identifier("undergarden", "blocks/shiverstone_cloggrum_ore"), EntryModule.BEDROCK_UG_CLOGGRUM_ORE);
        createBedrockOreTable("bedrock_ug_froststeel_ore", new Identifier("undergarden", "blocks/shiverstone_froststeel_ore"), EntryModule.BEDROCK_UG_FROSTSTEEL_ORE);
        createBedrockOreTable("bedrock_ug_utherium_ore", new Identifier("undergarden", "blocks/shiverstone_utherium_ore"), EntryModule.BEDROCK_UG_UTHERIUM_ORE);
        

        createBedrockOreTable("bedrock_be_desh_ore", new Identifier("beyond_earth", "blocks/moon_desh_ore"), EntryModule.BEDROCK_BE_DESH_ORE);
        createBedrockOreTable("bedrock_be_cheese_ore", new Identifier("beyond_earth", "blocks/moon_cheese_ore"), EntryModule.BEDROCK_BE_CHEESE_ORE);
        createBedrockOreTable("bedrock_be_ice_shard_ore", new Identifier("beyond_earth", "blocks/moon_ice_shard_ore"), EntryModule.BEDROCK_BE_ICE_SHARD_ORE);
        createBedrockOreTable("bedrock_be_ostrum_ore", new Identifier("beyond_earth", "blocks/mars_ostrum_ore"), EntryModule.BEDROCK_BE_OSTRUM_ORE);
        createBedrockOreTable("bedrock_be_calorite_ore", new Identifier("beyond_earth", "blocks/venus_calorite_ore"), EntryModule.BEDROCK_BE_CALORITE_ORE);
    }
}
