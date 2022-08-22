package net.fabricmc.arco.util;

import net.fabricmc.arco.items.ModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModModelPredicateProvider {
    public static void registerModels(){

        registerBow(ModItems.ANCIENT_BOW);
        registerBow(ModItems.WEB_BOW);
        registerBow(ModItems.MECHANICAL_BOW);
        registerBow(ModItems.WEEPING_VINE_BOW);
        registerBow(ModItems.WINTERS_TOUCH_BOW);
//
        registerCrossbow(ModItems.CORRUPTED_CROSSBOW);
        registerCrossbow(ModItems.FERAL_SOUL_CROSSBOW);
        registerCrossbow(ModItems.PRIDE_OF_THE_PIGLINS_CROSSBOW);
        registerCrossbow(ModItems.DOOM_CROSSBOW);
        registerCrossbow(ModItems.VOID_CALLER_CROSSBOW);

    }
    private static void registerBow(Item bow){
        ModelPredicateProviderRegistry.register(bow, new Identifier("pull"),
                (stack, world, entity, seed) -> {
                    if (entity == null){
                        return 0.0f;
                    }
                    if (entity.getActiveItem() != stack){
                        return 0.0f;
                    }
                    return (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0f;
                });
        ModelPredicateProviderRegistry.register(bow, new Identifier("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem()
                && entity.getActiveItem() == stack ? 1.0f : 0.0f);
    }
    private static void registerCrossbow(Item crossbow){
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("pull"),
                (stack, world, entity, seed) -> {
                    if (entity == null){
                        return 0.0f;
                    }
                    if (entity.getActiveItem() != stack){
                        return 0.0f;
                    }
                    return (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0f;
                });
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("charged"),
                (stack, world, entity, seed) -> entity != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("firework"),
                (stack, world, entity, seed) -> entity != null && CrossbowItem.isCharged(stack) && CrossbowItem.hasProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);
    }
}

