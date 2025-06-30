package com.cristal.many_wood_variants;

import com.cristal.many_wood_variants.item.RUSupport;
import com.cristal.many_wood_variants.item.VanillaSupport;
import dev.architectury.platform.Platform;

public final class ManyWood {
    public static final String MOD_ID = "manywood";

    public static void init() {
        // Write common init code here.
        VanillaSupport.register();
        if(Platform.isModLoaded("regions_unexplored")) RUSupport.register();
    }
}
