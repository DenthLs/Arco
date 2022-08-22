package net.fabricmc.arco;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.arco.config.BowDamageConfig;
import net.fabricmc.arco.items.ModItems;
import net.fabricmc.arco.items.ProjectileDamage;


public class Entry implements ModInitializer {
    public static final String ARCO = "arco";
    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        AutoConfig.register(BowDamageConfig.class, GsonConfigSerializer::new);
        ProjectileDamage.registryDamage();
    }

}


