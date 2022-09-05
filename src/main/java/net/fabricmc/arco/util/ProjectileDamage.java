package net.fabricmc.arco.util;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.arco.config.BowDamageConfig;
import net.fabricmc.arco.items.ModItems;
import net.minecraft.item.Item;
import net.projectiledamage.api.IProjectileWeapon;

public class ProjectileDamage {
        public static void setDamage(float damage, Item name){
            ((IProjectileWeapon)name).setProjectileDamage(damage);
        }
        static BowDamageConfig config = AutoConfig.getConfigHolder(BowDamageConfig.class).getConfig();
        public static void registryDamage(){
            ProjectileDamage.setDamage(config.ancientdamage, ModItems.ANCIENT_BOW);
            ProjectileDamage.setDamage(config.mechanicaldamage, ModItems.MECHANICAL_BOW);
            ProjectileDamage.setDamage(config.webdamage, ModItems.WEB_BOW);
            ProjectileDamage.setDamage(config.wintersdamage, ModItems.WINTERS_TOUCH_BOW);
            ProjectileDamage.setDamage(config.weepingdamage, ModItems.WEEPING_VINE_BOW);
            ProjectileDamage.setDamage(config.corrupteddamage, ModItems.CORRUPTED_CROSSBOW);
            ProjectileDamage.setDamage(config.doomdamage, ModItems.DOOM_CROSSBOW);
            ProjectileDamage.setDamage(config.pridedamage, ModItems.PRIDE_OF_THE_PIGLINS_CROSSBOW);
            ProjectileDamage.setDamage(config.feraldamage, ModItems.FERAL_SOUL_CROSSBOW);
            ProjectileDamage.setDamage(config.voiddamage, ModItems.VOID_CALLER_CROSSBOW);
        }

}
