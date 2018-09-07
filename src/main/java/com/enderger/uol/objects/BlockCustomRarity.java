package com.enderger.uol.objects;

import com.enderger.uol.init.ItemInit;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BlockCustomRarity extends BlockBase{

    EnumRarity RARITY;
    public BlockCustomRarity(String name, Material material, EnumRarity rarity, Float hardness) {
        super(name, material, hardness);
        RARITY = rarity;

        ItemInit.ITEMS.add(new ItemBlockRarity(this, this.getRegistryName(), this.getUnlocalizedName(), RARITY));
    }
}


