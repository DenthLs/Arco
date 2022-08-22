package net.fabricmc.arco;

import net.fabricmc.arco.items.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BOWS = FabricItemGroupBuilder.build(
            new Identifier(Entry.ARCO, "bows"),
            () -> new ItemStack(ModItems.ANCIENT_BOW));
}
