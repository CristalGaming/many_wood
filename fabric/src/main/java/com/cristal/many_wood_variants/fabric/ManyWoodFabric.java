package com.cristal.many_wood_variants.fabric;

import net.fabricmc.api.ModInitializer;

import com.cristal.many_wood_variants.ManyWood;

public final class ManyWoodFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        ManyWood.init();
    }
}
