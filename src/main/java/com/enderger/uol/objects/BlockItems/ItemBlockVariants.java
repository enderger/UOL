package com.enderger.uol.objects.BlockItems;

import com.enderger.uol.util.interfaces.IMetaName;
import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ItemBlockVariants extends ItemBlock {
    EnumRarity RARITY;
    public ItemBlockVariants(Block block) {
        super(block);
        setHasSubtypes(true);
        setMaxDamage(0);
    }
    int DAMAGE;
        @Override
        public int getMetadata(int damage){
            DAMAGE = damage;
            return damage;
        }

        @Override
        public String getUnlocalizedName(ItemStack stack){
            return super.getUnlocalizedName() + "_" + ((IMetaName)this.block).getSpecialName(stack);
        }
    @Override
    @Nonnull
    public EnumRarity getRarity(ItemStack stack) {
        if(DAMAGE == 5) {
            RARITY = EnumRarity.UNCOMMON;
        } else if(DAMAGE == 6) {
            RARITY = EnumRarity.RARE;
        } else {
            RARITY = EnumRarity.COMMON;
        }
        return RARITY;
    }
}

