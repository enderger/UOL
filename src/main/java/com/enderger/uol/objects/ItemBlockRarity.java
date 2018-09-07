package com.enderger.uol.objects;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemBlockRarity extends ItemBlockBase{

    EnumRarity RARITY;
    public ItemBlockRarity(Block block, ResourceLocation registryname, String blockname, EnumRarity rarity) {
        super(block, registryname, blockname);
        RARITY = rarity;
    }
    @Override
    public EnumRarity getRarity(ItemStack stack)
    {
        return RARITY;
    }
}
