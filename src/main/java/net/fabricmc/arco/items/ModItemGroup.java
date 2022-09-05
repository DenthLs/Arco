package net.fabricmc.arco.items;

import net.fabricmc.arco.Main;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BOWS = FabricItemGroupBuilder.build(
            new Identifier(Main.MOD_ID, "bows"),
            () -> new ItemStack(ModItems.ANCIENT_BOW));
}
