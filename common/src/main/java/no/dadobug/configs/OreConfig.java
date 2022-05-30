package no.dadobug.configs;

import me.shedaniel.autoconfig.annotation.ConfigEntry;

public class OreConfig {

    @ConfigEntry.Gui.RequiresRestart
    public boolean genOre;
    @ConfigEntry.Gui.RequiresRestart
    public int oreSize;
    @ConfigEntry.Gui.RequiresRestart
    public int oreChance;
    @ConfigEntry.Gui.RequiresRestart
    public int topOreChance;
    @ConfigEntry.Gui.RequiresRestart
    public int OreCount;

    public OreConfig(boolean genOre, int oreSize, int oreChance){
        this.genOre = genOre;
        this.oreSize = oreSize;
        this.oreChance = oreChance;
    }
    public OreConfig(boolean genOre, int oreSize, int oreChance, int topOreChance){
        this.genOre = genOre;
        this.oreSize = oreSize;
        this.oreChance = oreChance;
        this.topOreChance = topOreChance;
    }
    public OreConfig(int oreSize, int OreCount, boolean genOre){
        this.genOre = genOre;
        this.oreSize = oreSize;
        this.OreCount = OreCount;
    }
}
