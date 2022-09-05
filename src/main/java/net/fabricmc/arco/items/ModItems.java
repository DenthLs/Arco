package net.fabricmc.arco.items;

import net.fabricmc.arco.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;


public class ModItems {
//  BOWS
    public static final Item ANCIENT_BOW = registerItem("ancient_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.BOWS).maxCount(1).rarity(Rarity.COMMON).maxDamage(600)));
    public static final Item MECHANICAL_BOW = registerItem("mechanical_shortbow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.BOWS).maxCount(1).rarity(Rarity.COMMON).maxDamage(900)));
    public static final Item WEB_BOW = registerItem("web_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.BOWS).maxCount(1).rarity(Rarity.UNCOMMON).maxDamage(1200)));
    public static final Item WEEPING_VINE_BOW = registerItem("weeping_vine_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.BOWS).maxCount(1).rarity(Rarity.EPIC).maxDamage(1800)));
    public static final Item WINTERS_TOUCH_BOW = registerItem("winters_touch",
            new BowItem(new FabricItemSettings().group(ModItemGroup.BOWS).maxCount(1).rarity(Rarity.RARE).maxDamage(1500)));


//  CROSSBOWS
    public static final Item CORRUPTED_CROSSBOW = registerItem("corrupted_crossbow",
            new CrossbowItem(new FabricItemSettings().group(ModItemGroup.BOWS).maxCount(1).rarity(Rarity.EPIC).maxDamage(1800)));
    public static final Item DOOM_CROSSBOW = registerItem("doom_crossbow",
            new CrossbowItem(new FabricItemSettings().group(ModItemGroup.BOWS).maxCount(1).rarity(Rarity.COMMON).maxDamage(900)));
    public static final Item FERAL_SOUL_CROSSBOW = registerItem("feral_soul_crossbow",
            new CrossbowItem(new FabricItemSettings().group(ModItemGroup.BOWS).maxCount(1).rarity(Rarity.RARE).maxDamage(1500)));
    public static final Item PRIDE_OF_THE_PIGLINS_CROSSBOW = registerItem("pride_of_the_piglins",
            new CrossbowItem(new FabricItemSettings().group(ModItemGroup.BOWS).maxCount(1).rarity(Rarity.UNCOMMON).maxDamage(1200)));
    public static final Item VOID_CALLER_CROSSBOW = registerItem("voidcaller_crossbow",
            new CrossbowItem(new FabricItemSettings().group(ModItemGroup.BOWS).maxCount(1).rarity(Rarity.COMMON).maxDamage(600)));

//  REGISTRATION
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name), item);
    }
//  INITIALISATION FUNCTION
    public static void registerModItems(){}
}
