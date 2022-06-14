package no.dadobug.configs;

import me.shedaniel.autoconfig.annotation.ConfigEntry;

public class BlockConfig {

    @ConfigEntry.Gui.RequiresRestart
    public boolean showOre;
    @ConfigEntry.Gui.RequiresRestart
    public float hardness;
    @ConfigEntry.Gui.RequiresRestart
    public float resistance;
    @ConfigEntry.BoundedDiscrete(
            min = 0,
            max = 15
    )
    @ConfigEntry.Gui.RequiresRestart
    public int luminance;
    @ConfigEntry.Gui.RequiresRestart
    public int XPmin;
    @ConfigEntry.Gui.RequiresRestart
    public int XPmax;

    public BlockConfig(boolean showOre, float hardness, float resistance, int luminance, int XPmin, int XPmax){
        this.showOre = showOre;
        this.hardness = hardness;
        this.resistance = resistance;
        this.luminance = luminance;
        this.XPmin = XPmin;
        this.XPmax = XPmax;
    }
}
