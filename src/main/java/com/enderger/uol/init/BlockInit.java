package com.enderger.uol.init;

//Imports
import com.enderger.uol.objects.BlockBaseRegister;
import com.enderger.uol.objects.BlockMithril;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumRarity;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Blocks
    public static final Block COPPER_BLOCK = new BlockBaseRegister("block_copper",Material.IRON, 5.0f);
    public static final Block TIN_BLOCK = new BlockBaseRegister("block_tin",Material.IRON, 5.0f);
    public static final Block ALUMINUM_BLOCK = new BlockBaseRegister("block_aluminum",Material.IRON, 5.0f);
    public static final Block SILVER_BLOCK = new BlockBaseRegister("bock_silver", Material.IRON, 5.0f);

    public static final Block MITHRIL_BLOCK = new BlockMithril("block_mithril",Material.IRON, EnumRarity.RARE, 5.0f);
}
