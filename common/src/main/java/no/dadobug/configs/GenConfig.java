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


    @ConfigEntry.Category("ae2")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_AE_CERTUS_QUARTZ_BEDROCK_OVERWORLD = new OreConfig(true, 8, 4);


    @ConfigEntry.Category("bigreactors")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_ER_YELLORITE_BEDROCK_OVERWORLD = new OreConfig(true, 8, 8);

    @ConfigEntry.Category("bigreactors")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_ER_BENITOITE_BEDROCK_NETHER = new OreConfig(true, 8, 10, 10);

    @ConfigEntry.Category("bigreactors")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_ER_ANGLESITE_BEDROCK_END = new OreConfig( 8, 4, true);


    @ConfigEntry.Category("biggerreactors")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_BR_URANIUM_BEDROCK_OVERWORLD = new OreConfig(true, 8, 8);


    @ConfigEntry.Category("immersiveengineering")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IE_ALUMINUM_BEDROCK_OVERWORLD = new OreConfig(true, 6, 3);
    @ConfigEntry.Category("immersiveengineering")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IE_LEAD_BEDROCK_OVERWORLD = new OreConfig(true, 8, 5);
    @ConfigEntry.Category("immersiveengineering")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IE_SILVER_BEDROCK_OVERWORLD = new OreConfig(true, 9, 6);
    @ConfigEntry.Category("immersiveengineering")
    @ConfigEntry.Gui.CollapsibleObject()
    public OreConfig ORE_IE_NICKEL_BEDROCK_OVERWORLD = new OreConfig(true, 7, 5);
    @ConfigEntry.Category("immersiveengineering")
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

}
