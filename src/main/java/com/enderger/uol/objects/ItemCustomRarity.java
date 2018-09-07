package com.enderger.uol.objects;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class ItemCustomRarity extends ItemBase{

    EnumRarity RARITY;
    public ItemCustomRarity(String name, EnumRarity rarity) {
        super(name);
        RARITY = rarity;
    }
    @Override
    public EnumRarity getRarity(ItemStack stack)
    {
        return RARITY;
    }
}

