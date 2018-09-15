package com.enderger.uol.objects;

import com.enderger.uol.init.ItemInit;
import com.enderger.uol.objects.BlockItems.ItemBlockRarity;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumRarity;

public class BlockCustomRarity extends BlockBase{

    EnumRarity RARITY;
    public BlockCustomRarity(String name, Material material, EnumRarity rarity, Float hardness) {
        super(name, material, hardness);
        RARITY = rarity;

        ItemInit.ITEMS.add(new ItemBlockRarity(this, this.getRegistryName(), this.getUnlocalizedName(), RARITY));
    }
}


