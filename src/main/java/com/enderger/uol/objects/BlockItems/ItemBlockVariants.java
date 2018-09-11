package com.enderger.uol.objects.BlockItems;

import com.enderger.uol.util.interfaces.IMetalName;
import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockVariants extends ItemBlock {
    EnumRarity RARITY;
    public ItemBlockVariants(Block block) {
        super(block);
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    @Override
    public int getMetadata(int damage) {
        if(damage == 5) {
            RARITY = EnumRarity.RARE;
        } else if(damage == 6) {
            RARITY = EnumRarity.UNCOMMON;
        } else {
            RARITY = EnumRarity.COMMON;
        }
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "_" + ((IMetalName)this.block).getSpecialName(stack);
    }
    @Override
    public EnumRarity getRarity(ItemStack stack)
    {
        return RARITY;
    }
}

