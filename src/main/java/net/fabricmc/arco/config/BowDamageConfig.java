package net.fabricmc.arco.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "arco")
public
class BowDamageConfig implements ConfigData {
    @ConfigEntry.Gui.RequiresRestart
    public float ancientdamage = 8;
    @ConfigEntry.Gui.RequiresRestart
    public float mechanicaldamage = 10;
    @ConfigEntry.Gui.RequiresRestart
    public float webdamage = 13;
    @ConfigEntry.Gui.RequiresRestart
    public float wintersdamage = 17;
    @ConfigEntry.Gui.RequiresRestart
    public float weepingdamage = 23;
    @ConfigEntry.Gui.RequiresRestart
    public float corrupteddamage = 32;
    @ConfigEntry.Gui.RequiresRestart
    public float doomdamage = 15;
    @ConfigEntry.Gui.RequiresRestart
    public float pridedamage = 19;
    @ConfigEntry.Gui.RequiresRestart
    public float feraldamage = 24;
    @ConfigEntry.Gui.RequiresRestart
    public float voiddamage = 11;

}
