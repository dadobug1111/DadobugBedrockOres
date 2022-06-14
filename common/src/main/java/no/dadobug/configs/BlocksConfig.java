package no.dadobug.configs;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import no.dadobug.EntryModule;

@Config(name = EntryModule.modid + "_block_config")
public class BlocksConfig implements ConfigData {

    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_FRACTURED = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_HOLLOW = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_COAL_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 2);
    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_IRON_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_GOLD_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_DIAMOND_ORE = new BlockConfig(true, 50f, 0.5f, 0, 3, 7);
    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_REDSTONE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 1, 6);
    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_COPPER_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_LAPIS_ORE = new BlockConfig(true, 50f, 0.5f, 0, 2, 5);
    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_EMERALD_ORE = new BlockConfig(true, 50f, 0.5f, 0, 3, 7);
    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_WATER_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 1);
    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_LAVA_ORE = new BlockConfig(true, 50f, 0.5f, 15, 0, 5);
    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_NETHER_GOLD = new BlockConfig(true, 50f, 0.5f, 0, 0, 1);
    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_NETHER_QUARTZ = new BlockConfig(true, 50f, 0.5f, 0, 2, 5);
    @ConfigEntry.Category("vanilla")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_ANCIENT_DEBRIS = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);


    @ConfigEntry.Category("funny")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MILK_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 10);
    @ConfigEntry.Category("funny")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_COOKIE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 10);


    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_BAUXITE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_GALENA_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_IRIDIUM_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_LEAD_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_RUBY_ORE = new BlockConfig(true, 50f, 0.5f, 0, 2, 6);
    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_SAPPHIRE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 2, 6);
    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_SILVER_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_TIN_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_CINNABAR_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_PYRITE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_SPHALERITE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_PERIDOT_ORE = new BlockConfig(true, 50f, 0.5f, 0, 2, 6);
    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_SHELDONITE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_SODALITE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("techreborn")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_TUNGSTEN_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);


    @ConfigEntry.Category("tconstruct")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_TC_COBALT_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);


    @ConfigEntry.Category("ae2")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_AE_CERTUS_QUARTZ_ORE = new BlockConfig(true, 50f, 0.5f, 0, 2, 5);


    @ConfigEntry.Category("bigreactors")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_ER_YELLORITE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("bigreactors")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_ER_ANGLESITE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 3, 5);
    @ConfigEntry.Category("bigreactors")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_ER_BENITOITE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 3, 5);


    @ConfigEntry.Category("biggerreactors")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_BR_URANIUM_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);


    @ConfigEntry.Category("immersiveengineering")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_IE_ALUMINUM_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("immersiveengineering")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_IE_LEAD_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("immersiveengineering")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_IE_SILVER_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("immersiveengineering")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_IE_NICKEL_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("immersiveengineering")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_IE_URANIUM_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);


    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_ADAMANTITE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_AQUARIUM_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_BANGLUM_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_CARMOT_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_KYBER_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_MANGANESE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_MORKITE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_MYTHRIL_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_ORICHALCUM_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_OSMIUM_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_PLATINUM_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_PROMETHEUM_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_QUADRILLUM_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_RUNITE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_SILVER_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_STARRITE_ORE = new BlockConfig(true, 50f, 0.5f, 0, 3, 6);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_TIN_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_UNOBTAINIUM_ORE = new BlockConfig(true, 50f, 0.5f, 1, 4, 7);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_NETHER_BANGLUM_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_MIDAS_GOLD_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_PALLADIUM_ORE = new BlockConfig(true, 50f, 0.5f, 0, 0, 0);
    @ConfigEntry.Category("mythicmetals")
    @ConfigEntry.Gui.CollapsibleObject()
    public BlockConfig BEDROCK_MM_STORMYX_ORE = new BlockConfig(true, 50f, 0.5f, 0, 2, 4);
}
