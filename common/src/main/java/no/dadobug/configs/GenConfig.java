package no.dadobug.configs;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import no.dadobug.EntryModule;

@Config(name = EntryModule.modid + "_gen_config")
public class GenConfig implements ConfigData {

    @ConfigEntry.Category("vanilla_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_COAL_BEDROCK_OVERWORLD = new OreConfig(true, 20, 3);
    @ConfigEntry.Category("vanilla_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IRON_BEDROCK_OVERWORLD = new OreConfig(true, 9, 5);
    @ConfigEntry.Category("vanilla_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_GOLD_BEDROCK_OVERWORLD = new OreConfig(true, 9, 7);
    @ConfigEntry.Category("vanilla_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_DIAMOND_BEDROCK_OVERWORLD = new OreConfig(true, 8, 12);
    @ConfigEntry.Category("vanilla_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_REDSTONE_BEDROCK_OVERWORLD = new OreConfig(true, 11, 6);
    @ConfigEntry.Category("vanilla_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_COPPER_BEDROCK_OVERWORLD = new OreConfig(true, 13, 3);
    @ConfigEntry.Category("vanilla_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_LAPIS_BEDROCK_OVERWORLD = new OreConfig(true, 9, 9);
    @ConfigEntry.Category("vanilla_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_EMERALD_BEDROCK_OVERWORLD = new OreConfig(true, 3, 2);
    @ConfigEntry.Category("vanilla_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_HOLLOW_BEDROCK_OVERWORLD = new OreConfig(true, 40, 16);
    @ConfigEntry.Category("vanilla_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_XP_LEAK_BEDROCK_OVERWORLD = new OreConfig(true, 5, 13);
    @ConfigEntry.Category("vanilla_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_WATER_BEDROCK_OVERWORLD = new OreConfig(true, 15, 3);
    @ConfigEntry.Category("vanilla_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_LAVA_BEDROCK_OVERWORLD = new OreConfig(true, 5, 8);
    @ConfigEntry.Category("vanilla_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MILK_BEDROCK_OVERWORLD = new OreConfig(true, 30, 24);
    @ConfigEntry.Category("vanilla_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_COOKIE_BEDROCK_OVERWORLD = new OreConfig(true, 30, 24);

    @ConfigEntry.Category("vanilla_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_NETHER_GOLD_BEDROCK_NETHER = new OreConfig(true, 10, 1, 1);
    @ConfigEntry.Category("vanilla_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_NETHER_QUARTZ_BEDROCK_NETHER = new OreConfig(true, 5, 2, 2);
    @ConfigEntry.Category("vanilla_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_ANCIENT_DEBRIS_BEDROCK_NETHER = new OreConfig(true, 4, 16, 24);
    @ConfigEntry.Category("vanilla_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_HOLLOW_BEDROCK_NETHER = new OreConfig(true, 50, 14, 12);
    @ConfigEntry.Category("vanilla_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_XP_LEAK_BEDROCK_NETHER = new OreConfig(true, 7, 9, 8);
    @ConfigEntry.Category("vanilla_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_LAVA_BEDROCK_NETHER = new OreConfig(true, 30, 3, 3);

    @ConfigEntry.Category("vanilla_end")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_HOLLOW_BEDROCK_END = new OreConfig( 60, 1, true);
    @ConfigEntry.Category("vanilla_end")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_XP_LEAK_BEDROCK_END = new OreConfig( 12, 2, true);


    @ConfigEntry.Category("techreborn_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BAUXITE_BEDROCK_OVERWORLD = new OreConfig(true, 6, 5);
    @ConfigEntry.Category("techreborn_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_GALENA_BEDROCK_OVERWORLD = new OreConfig(true, 8, 5);
    @ConfigEntry.Category("techreborn_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IRIDIUM_BEDROCK_OVERWORLD = new OreConfig(true, 3, 12);
    @ConfigEntry.Category("techreborn_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_LEAD_BEDROCK_OVERWORLD = new OreConfig(true, 6, 2);
    @ConfigEntry.Category("techreborn_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_RUBY_BEDROCK_OVERWORLD = new OreConfig(true, 6, 8);
    @ConfigEntry.Category("techreborn_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_SAPPHIRE_BEDROCK_OVERWORLD = new OreConfig(true, 6, 9);
    @ConfigEntry.Category("techreborn_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_SILVER_BEDROCK_OVERWORLD = new OreConfig(true, 6, 2);
    @ConfigEntry.Category("techreborn_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_TIN_BEDROCK_OVERWORLD = new OreConfig(true, 8, 2);

    @ConfigEntry.Category("techreborn_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_CINNABAR_BEDROCK_NETHER = new OreConfig(true, 6, 11, 5);
    @ConfigEntry.Category("techreborn_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_PYRITE_BEDROCK_NETHER = new OreConfig(true, 6, 10, 5);
    @ConfigEntry.Category("techreborn_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_SPHALERITE_BEDROCK_NETHER = new OreConfig(true, 6, 12, 5);

    @ConfigEntry.Category("techreborn_end")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_PERIDOT_BEDROCK_END = new OreConfig( 6, 6, true);
    @ConfigEntry.Category("techreborn_end")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_SHELDONITE_BEDROCK_END = new OreConfig( 6, 4, true);
    @ConfigEntry.Category("techreborn_end")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_SODALITE_BEDROCK_END = new OreConfig( 6, 4, true);
    @ConfigEntry.Category("techreborn_end")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_TUNGSTEN_BEDROCK_END = new OreConfig( 6, 2, true);


    @ConfigEntry.Category("tconstruct")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_TC_COBALT_BEDROCK_NETHER = new OreConfig(true, 4, 10, 10);


    @ConfigEntry.Category("ae2_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_AE_CERTUS_QUARTZ_BEDROCK_OVERWORLD = new OreConfig(true, 8, 4);


    @ConfigEntry.Category("bigreactors_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_ER_YELLORITE_BEDROCK_OVERWORLD = new OreConfig(true, 8, 8);

    @ConfigEntry.Category("bigreactors_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_ER_BENITOITE_BEDROCK_NETHER = new OreConfig(true, 8, 10, 10);

    @ConfigEntry.Category("bigreactors_end")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_ER_ANGLESITE_BEDROCK_END = new OreConfig( 8, 4, true);


    @ConfigEntry.Category("biggerreactors_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BR_URANIUM_BEDROCK_OVERWORLD = new OreConfig(true, 8, 8);


    @ConfigEntry.Category("immersiveengineering_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IE_ALUMINUM_BEDROCK_OVERWORLD = new OreConfig(true, 6, 3);
    @ConfigEntry.Category("immersiveengineering_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IE_LEAD_BEDROCK_OVERWORLD = new OreConfig(true, 8, 5);
    @ConfigEntry.Category("immersiveengineering_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IE_SILVER_BEDROCK_OVERWORLD = new OreConfig(true, 9, 6);
    @ConfigEntry.Category("immersiveengineering_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IE_NICKEL_BEDROCK_OVERWORLD = new OreConfig(true, 7, 5);
    @ConfigEntry.Category("immersiveengineering_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IE_URANIUM_BEDROCK_OVERWORLD = new OreConfig(true, 4, 7);


    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_ADAMANTITE_BEDROCK_OVERWORLD = new OreConfig(true, 5, 16);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_AQUARIUM_BEDROCK_OVERWORLD = new OreConfig(true, 9, 4);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_BANGLUM_BEDROCK_OVERWORLD = new OreConfig(true, 6, 4);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_CARMOT_BEDROCK_OVERWORLD = new OreConfig(true, 4, 8);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_KYBER_BEDROCK_OVERWORLD = new OreConfig(true, 3, 13);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_MANGANESE_BEDROCK_OVERWORLD = new OreConfig(true, 9, 9);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_MORKITE_BEDROCK_OVERWORLD = new OreConfig(true, 11, 5);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_MYTHRIL_BEDROCK_OVERWORLD = new OreConfig(true, 5, 3);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_ORICHALCUM_BEDROCK_OVERWORLD = new OreConfig(true, 5, 14);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_OSMIUM_BEDROCK_OVERWORLD = new OreConfig(true, 6, 3);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_PLATINUM_BEDROCK_OVERWORLD = new OreConfig(true, 6, 7);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_PROMETHEUM_BEDROCK_OVERWORLD = new OreConfig(true, 6, 4);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_QUADRILLUM_BEDROCK_OVERWORLD = new OreConfig(true, 7, 8);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_RUNITE_BEDROCK_OVERWORLD = new OreConfig(true, 4, 15);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_SILVER_BEDROCK_OVERWORLD = new OreConfig(true, 8, 4);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_STARRITE_BEDROCK_OVERWORLD = new OreConfig(true, 4, 16);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_TIN_BEDROCK_OVERWORLD = new OreConfig(true, 8, 3);
    @ConfigEntry.Category("mythicmetals_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_UNOBTAINIUM_BEDROCK_OVERWORLD = new OreConfig(true, 3, 16);

    @ConfigEntry.Category("mythicmetals_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_NETHER_BANGLUM_BEDROCK_NETHER = new OreConfig(true, 8, 5, 4);
    @ConfigEntry.Category("mythicmetals_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_MIDAS_GOLD_BEDROCK_NETHER = new OreConfig(true, 7, 4, 3);
    @ConfigEntry.Category("mythicmetals_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_PALLADIUM_BEDROCK_NETHER = new OreConfig(true, 5, 7, 8);
    @ConfigEntry.Category("mythicmetals_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_STORMYX_BEDROCK_NETHER = new OreConfig(true, 8, 7, 9);

    @ConfigEntry.Category("mythicmetals_end")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MM_STARRITE_BEDROCK_END = new OreConfig( 7, 1, true);


    @ConfigEntry.Category("create_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_CR_ZINC_BEDROCK_OVERWORLD = new OreConfig(true, 12, 3);


    @ConfigEntry.Category("mekanism_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MK_OSMIUM_BEDROCK_OVERWORLD = new OreConfig(true, 9, 5);
    @ConfigEntry.Category("mekanism_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MK_FLUORITE_BEDROCK_OVERWORLD = new OreConfig(true, 8, 12);
    @ConfigEntry.Category("mekanism_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MK_LEAD_BEDROCK_OVERWORLD = new OreConfig(true, 8, 4);
    @ConfigEntry.Category("mekanism_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MK_TIN_BEDROCK_OVERWORLD = new OreConfig(true, 10, 4);
    @ConfigEntry.Category("mekanism_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MK_URANIUM_BEDROCK_OVERWORLD = new OreConfig(true, 8, 10);


    @ConfigEntry.Category("vanilla_undergarden")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_COAL_BEDROCK_UNDERGARDEN = new OreConfig(true, 20, 3);
    @ConfigEntry.Category("vanilla_undergarden")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IRON_BEDROCK_UNDERGARDEN = new OreConfig(true, 9, 5);
    @ConfigEntry.Category("vanilla_undergarden")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_GOLD_BEDROCK_UNDERGARDEN = new OreConfig(true, 9, 7);
    @ConfigEntry.Category("vanilla_undergarden")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_DIAMOND_BEDROCK_UNDERGARDEN = new OreConfig(true, 8, 12);

    @ConfigEntry.Category("undergarden_undergarden") //No idea what the spawn chance and sizes should
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_UG_CLOGGRUM_BEDROCK_UNDERGARDEN  = new OreConfig(true, 9, 5);
    @ConfigEntry.Category("undergarden_undergarden")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_UG_FROSTSTEEL_BEDROCK_UNDERGARDEN = new OreConfig(true, 9, 7);
    @ConfigEntry.Category("undergarden_undergarden")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_UG_UTHERIUM_BEDROCK_UNDERGARDEN = new OreConfig(true, 8, 12);
    @ConfigEntry.Category("undergarden_undergarden")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_UG_REGALIUM_BEDROCK_UNDERGARDEN = new OreConfig(true, 7, 13);


    @ConfigEntry.Category("vanilla_moon") // Roughly the same spawn rate as their respective ore
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_IRON_BEDROCK_MOON = new OreConfig(true, 11, 8);

    @ConfigEntry.Category("beyond_earth_moon")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_DESH_BEDROCK_MOON = new OreConfig(true, 9, 14);
    @ConfigEntry.Category("beyond_earth_moon")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_ICE_SHARD_BEDROCK_MOON = new OreConfig(true, 10, 10);
    @ConfigEntry.Category("beyond_earth_moon")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_CHEESE_BEDROCK_MOON = new OreConfig(true, 10, 7);

    @ConfigEntry.Category("vanilla_mars")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_IRON_BEDROCK_MARS = new OreConfig(true, 11, 8);
    @ConfigEntry.Category("vanilla_mars")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_DIAMOND_BEDROCK_MARS = new OreConfig(true, 7, 10);

    @ConfigEntry.Category("beyond_earth_mars")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_OSTRUM_BEDROCK_MARS = new OreConfig(true, 8, 10);
    @ConfigEntry.Category("beyond_earth_mars")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_ICE_SHARD_BEDROCK_MARS = new OreConfig(true, 10, 7);

    @ConfigEntry.Category("vanilla_venus")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_COAL_BEDROCK_VENUS = new OreConfig(true, 20, 3);
    @ConfigEntry.Category("vanilla_venus")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_DIAMOND_BEDROCK_VENUS = new OreConfig(true, 7, 10);
    @ConfigEntry.Category("vanilla_venus")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_GOLD_BEDROCK_VENUS = new OreConfig(true, 9, 7);

    @ConfigEntry.Category("beyond_earth_venus")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_CALORITE_BEDROCK_VENUS = new OreConfig(true, 8, 16);

    @ConfigEntry.Category("vanilla_glacio")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_COAL_BEDROCK_GLACIO = new OreConfig(true, 20, 3);
    @ConfigEntry.Category("vanilla_glacio")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_COPPER_BEDROCK_GLACIO = new OreConfig(true, 13, 3);
    @ConfigEntry.Category("vanilla_glacio")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_IRON_BEDROCK_GLACIO = new OreConfig(true, 11, 8);
    @ConfigEntry.Category("vanilla_glacio")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_LAPIS_BEDROCK_GLACIO = new OreConfig(true, 9, 9);

    @ConfigEntry.Category("beyond_earth_glacio")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_ICE_SHARD_BEDROCK_GLACIO = new OreConfig(true, 12, 5);

    @ConfigEntry.Category("vanilla_mercury")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BE_IRON_BEDROCK_MERCURY = new OreConfig(true, 11, 4);

    
    @ConfigEntry.Category("ftb_industrial_contraptions_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IC_TIN_BEDROCK_FTB_OVERWORLD = new OreConfig(true, 8, 2);
    @ConfigEntry.Category("ftb_industrial_contraptions_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IC_LEAD_BEDROCK_FTB_OVERWORLD = new OreConfig(true, 8, 5);
    @ConfigEntry.Category("ftb_industrial_contraptions_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IC_ALUMINUM_BEDROCK_FTB_OVERWORLD = new OreConfig(true, 6, 3);
    @ConfigEntry.Category("ftb_industrial_contraptions_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IC_IRIDIUM_BEDROCK_FTB_OVERWORLD = new OreConfig(true, 3, 12);
    @ConfigEntry.Category("ftb_industrial_contraptions_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IC_URANIUM_BEDROCK_FTB_OVERWORLD = new OreConfig(true, 3, 10);


    @ConfigEntry.Category("malum_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MA_SOULSTONE_OVERWORLD = new OreConfig(true, 9, 7);
    @ConfigEntry.Category("malum_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MA_BRILLIANCE_OVERWORLD = new OreConfig(true, 6, 15);
    @ConfigEntry.Category("malum_nether")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_MA_BLAZING_QUARTZ_NETHER = new OreConfig(true, 8, 2);


    @ConfigEntry.Category("thermal_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_TH_NITER_OVERWORLD = new OreConfig(true, 7, 9);
    @ConfigEntry.Category("thermal_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_TH_SULFUR_OVERWORLD = new OreConfig(true, 7, 9);
    @ConfigEntry.Category("thermal_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_TH_TIN_OVERWORLD = new OreConfig(true, 9, 3);
    @ConfigEntry.Category("thermal_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_TH_LEAD_OVERWORLD = new OreConfig(true, 8, 3);
    @ConfigEntry.Category("thermal_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_TH_SILVER_OVERWORLD = new OreConfig(true, 8, 6);
    @ConfigEntry.Category("thermal_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_TH_NICKEL_OVERWORLD = new OreConfig(true, 8, 6);
    @ConfigEntry.Category("thermal_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_TH_APATITE_OVERWORLD = new OreConfig(true, 9, 6);
    @ConfigEntry.Category("thermal_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_TH_CINNABAR_OVERWORLD = new OreConfig(true, 5, 13);
    @ConfigEntry.Category("thermal_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_TH_OIL_OVERWORLD = new OreConfig(true, 24, 9);


    @ConfigEntry.Category("powah_overworld")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_PW_URANINITE_OVERWORLD = new OreConfig(true, 5, 4);
}
