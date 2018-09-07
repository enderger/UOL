package com.enderger.uol.tabs;

import com.enderger.uol.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UolTab extends CreativeTabs {
    public UolTab(String label) {
        super("uoltab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.COPPER_INGOT);
    }
}


