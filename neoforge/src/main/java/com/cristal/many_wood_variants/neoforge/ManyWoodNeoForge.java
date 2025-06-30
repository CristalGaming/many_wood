package com.cristal.many_wood_variants.neoforge;

import net.neoforged.fml.common.Mod;

import com.cristal.many_wood_variants.ManyWood;

@Mod(ManyWood.MOD_ID)
public final class ManyWoodNeoForge {
    public ManyWoodNeoForge() {
        // Run our common setup.
        ManyWood.init();
    }
}
