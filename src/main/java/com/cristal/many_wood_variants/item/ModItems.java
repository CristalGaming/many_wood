package com.cristal.many_wood_variants.item;

import com.cristal.many_wood_variants.ManyWoodVariants;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ManyWoodVariants.MODID);

    public static final DeferredItem<Item> OAK_LUMBER = ITEMS.register("oak_lumber",
            ()-> new Item(new Item.Properties()) );
    public static final DeferredItem<Item> SPRUCE_LUMBER = ITEMS.register("spruce_lumber",
            ()-> new Item(new Item.Properties()) );
    public static final DeferredItem<Item> BIRCH_LUMBER = ITEMS.register("birch_lumber",
            ()-> new Item(new Item.Properties()) );
    public static final DeferredItem<Item> JUNGLE_LUMBER = ITEMS.register("jungle_lumber",
            ()-> new Item(new Item.Properties()) );
    public static final DeferredItem<Item> ACACIA_LUMBER = ITEMS.register("acacia_lumber",
            ()-> new Item(new Item.Properties()) );
    public static final DeferredItem<Item> DARK_OAK_LUMBER = ITEMS.register("dark_oak_lumber",
            ()-> new Item(new Item.Properties()) );
    public static final DeferredItem<Item> MANGROVE_LUMBER = ITEMS.register("mangrove_lumber",
            ()-> new Item(new Item.Properties()) );
    public static final DeferredItem<Item> CHERRY_LUMBER = ITEMS.register("cherry_lumber",
            ()-> new Item(new Item.Properties()) );
    public static final DeferredItem<Item> CRIMSON_LUMBER = ITEMS.register("crimson_lumber",
            ()-> new Item(new Item.Properties()) );
    public static final DeferredItem<Item> WARPED_LUMBER = ITEMS.register("warped_lumber",
            ()-> new Item(new Item.Properties()) );


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
