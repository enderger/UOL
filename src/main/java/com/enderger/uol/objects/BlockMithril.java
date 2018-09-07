package com.enderger.uol.objects;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class BlockMithril extends BlockCustomRarity {

    public BlockMithril(String name, Material material, EnumRarity rarity, Float hardness) {
        super(name, material, rarity, hardness);
    }

    @Override
    public float getEnchantPowerBonus(World world, BlockPos pos) {
        return 4;
    }
}
