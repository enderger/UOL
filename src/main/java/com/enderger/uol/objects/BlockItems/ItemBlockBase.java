package com.enderger.uol.objects.BlockItems;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

public class ItemBlockBase extends ItemBlock {
    public ItemBlockBase(Block block, ResourceLocation registryname, String blockname) {
        super(block);
        setUnlocalizedName(blockname);
        setRegistryName(registryname);
    }
}