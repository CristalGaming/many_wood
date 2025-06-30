package com.cristal.many_wood_variants.item;

import com.cristal.many_wood_variants.ManyWood;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class VanillaSupport {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ManyWood.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> OAK_LUMBER = ITEMS.register("oak_lumber", Lumber::new);
    public static final RegistrySupplier<Item> SPRUCE_LUMBER = ITEMS.register("spruce_lumber", Lumber::new );
    public static final RegistrySupplier<Item> BIRCH_LUMBER = ITEMS.register("birch_lumber", Lumber::new );
    public static final RegistrySupplier<Item> JUNGLE_LUMBER = ITEMS.register("jungle_lumber", Lumber::new );
    public static final RegistrySupplier<Item> ACACIA_LUMBER = ITEMS.register("acacia_lumber", Lumber::new );
    public static final RegistrySupplier<Item> DARK_OAK_LUMBER = ITEMS.register("dark_oak_lumber", Lumber::new );
    public static final RegistrySupplier<Item> MANGROVE_LUMBER = ITEMS.register("mangrove_lumber", Lumber::new );
    public static final RegistrySupplier<Item> CHERRY_LUMBER = ITEMS.register("cherry_lumber", Lumber::new );
    public static final RegistrySupplier<Item> CRIMSON_LUMBER = ITEMS.register("crimson_lumber", Lumber::new );
    public static final RegistrySupplier<Item> WARPED_LUMBER = ITEMS.register("warped_lumber", Lumber::new );

    public static void register(){
        ITEMS.register();
    }
}
