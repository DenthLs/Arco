package net.fabricmc.arco;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.arco.util.ModModelPredicateProvider;

public class ClientMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ModModelPredicateProvider.registerModels();

    }
}
