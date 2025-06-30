package com.cristal.many_wood_variants.item;

import com.cristal.many_wood_variants.ManyWood;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;


public class RUSupport {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ManyWood.MOD_ID, Registries.ITEM);

    // ===== Normal ===== //

    public static final RegistrySupplier<Item> ALPHA_LUMBER = ITEMS.register("regions_unexplored/alpha_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> BAOBAB_LUMBER = ITEMS.register("regions_unexplored/baobab_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> BLACKWOOD_LUMBER = ITEMS.register("regions_unexplored/blackwood_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> BLUE_BIOSHROOM_LUMBER = ITEMS.register("regions_unexplored/blue_bioshroom_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored"));
    public static final RegistrySupplier<Item> BRIMWOOD_LUMBER = ITEMS.register("regions_unexplored/brimwood_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> COBALT_LUMBER = ITEMS.register("regions_unexplored/cobalt_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> CYPRESS_LUMBER = ITEMS.register("regions_unexplored/cypress_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> DEAD_LUMBER = ITEMS.register("regions_unexplored/dead_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> EUCALYPTUS_LUMBER = ITEMS.register("regions_unexplored/eucalyptus_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> GREEN_BIOSHROOM_LUMBER = ITEMS.register("regions_unexplored/green_bioshroom_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> JOSHUA_LUMBER = ITEMS.register("regions_unexplored/joshua_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> KAPOK_LUMBER = ITEMS.register("regions_unexplored/kapok_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> LARCH_LUMBER = ITEMS.register("regions_unexplored/larch_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> MAGNOLIA_LUMBER = ITEMS.register("regions_unexplored/magnolia_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> MAPLE_LUMBER = ITEMS.register("regions_unexplored/maple_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> MAUVE_LUMBER = ITEMS.register("regions_unexplored/mauve_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> PALM_LUMBER = ITEMS.register("regions_unexplored/palm_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> PINE_LUMBER = ITEMS.register("regions_unexplored/pine_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> PINK_BIOSHROOM_LUMBER = ITEMS.register("regions_unexplored/pink_bioshroom_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> REDWOOD_LUMBER = ITEMS.register("regions_unexplored/redwood_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> SOCOTRA_LUMBER = ITEMS.register("regions_unexplored/socotra_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> WILLOW_LUMBER = ITEMS.register("regions_unexplored/willow_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> YELLOW_BIOSHROOM_LUMBER = ITEMS.register("regions_unexplored/yellow_bioshroom_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );

    // ===== Painted ===== //

    public static final RegistrySupplier<Item> WHITE_PAINTED_LUMBER = ITEMS.register("regions_unexplored/white_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> LIGHT_GRAY_PAINTED_LUMBER = ITEMS.register("regions_unexplored/light_gray_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> GRAY_PAINTED_LUMBER = ITEMS.register("regions_unexplored/gray_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> BLACK_PAINTED_LUMBER = ITEMS.register("regions_unexplored/black_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );

    public static final RegistrySupplier<Item> BROWN_PAINTED_LUMBER = ITEMS.register("regions_unexplored/brown_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> RED_PAINTED_LUMBER = ITEMS.register("regions_unexplored/red_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> ORANGE_PAINTED_LUMBER = ITEMS.register("regions_unexplored/orange_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> YELLOW_PAINTED_LUMBER = ITEMS.register("regions_unexplored/yellow_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );

    public static final RegistrySupplier<Item> LIME_PAINTED_LUMBER = ITEMS.register("regions_unexplored/lime_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> GREEN_PAINTED_LUMBER = ITEMS.register("regions_unexplored/green_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> CYAN_PAINTED_LUMBER = ITEMS.register("regions_unexplored/cyan_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> LIGHT_BLUE_PAINTED_LUMBER = ITEMS.register("regions_unexplored/light_blue_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> BLUE_PAINTED_LUMBER = ITEMS.register("regions_unexplored/blue_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );

    public static final RegistrySupplier<Item> PURPLE_PAINTED_LUMBER = ITEMS.register("regions_unexplored/purple_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> MAGENTA_PAINTED_LUMBER = ITEMS.register("regions_unexplored/magenta_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );
    public static final RegistrySupplier<Item> PINK_PAINTED_LUMBER = ITEMS.register("regions_unexplored/pink_painted_lumber",
            () -> new Lumber(new Item.Properties(),"regions_unexplored") );



    public static void register(){
        ITEMS.register();
    }
}
