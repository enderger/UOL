package com.enderger.uol.objects.BlockItems;

import com.enderger.uol.util.interfaces.IMetaName;
import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockVariants extends ItemBlock {
    String VARIENT;
    EnumRarity RARITY;
    public ItemBlockVariants(Block block) {
        super(block);
        setHasSubtypes(true);
        setMaxDamage(0);
    }
        @Override
        public int getMetadata(int damage){
            return damage;
        }
    @Override
        public String getUnlocalizedName(ItemStack stack){
            return super.getUnlocalizedName() + "_" + ((IMetaName)this.block).getSpecialName(stack);
        }
    @Override
    public EnumRarity getRarity(ItemStack stack) {
        VARIENT = ((IMetaName)this.block).getSpecialName(stack);
        if(VARIENT == "mithril") {
            RARITY = EnumRarity.RARE;
        } else if(VARIENT == "nickel") {
            RARITY = EnumRarity.UNCOMMON;
        } else {
            RARITY = EnumRarity.COMMON;
        }
        return RARITY;
    }
}

