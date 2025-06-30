package com.cristal.many_wood_variants.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;

import java.util.List;

public class Lumber extends Item {

    public String tooltipPath;

    public Lumber() {
        super(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS));
    }
    public Lumber(String tooltip) {
        super(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS));
        tooltipPath = tooltip;
    }
    public Lumber(Properties properties) {
        super(properties.arch$tab(CreativeModeTabs.INGREDIENTS));
    }
    public Lumber(Properties properties, String tooltip) {
        super(properties.arch$tab(CreativeModeTabs.INGREDIENTS));
        tooltipPath = tooltip;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> list, TooltipFlag tooltipFlag) {
        if(tooltipPath!=null)
        list.add(Component.translatable("tooltip.manywood."+tooltipPath));
        super.appendHoverText(itemStack, tooltipContext, list, tooltipFlag);
    }
}
