package com.enderger.uol.objects;

import com.enderger.uol.Main;
import com.enderger.uol.init.ItemInit;
import com.enderger.uol.tabs.UolTab;
import com.enderger.uol.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.uoltab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
