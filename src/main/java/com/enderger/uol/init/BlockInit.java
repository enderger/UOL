package com.enderger.uol.init;

//Imports
import com.enderger.uol.objects.BlockBaseRegister;
import com.enderger.uol.objects.BlockCustomRarity;
import com.enderger.uol.objects.BlockMithril;
import com.enderger.uol.objects.BlockOres;
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
    public static final Block SILVER_BLOCK = new BlockBaseRegister("block_silver", Material.IRON, 5.0f);
    public static final Block LEAD_BLOCK = new BlockBaseRegister("block_lead", Material.IRON, 5.0f);
    public static final Block MITHRIL_BLOCK = new BlockMithril("block_mithril",Material.IRON, EnumRarity.RARE, 5.0f);
    public static final Block NICKEL_BLOCK = new BlockCustomRarity("block_nickel", Material.IRON, EnumRarity.UNCOMMON, 5.0f);
    public static final Block PLATINUM_BLOCK = new BlockBaseRegister("block_platinum", Material.IRON, 5.0f);

    //Ores
    public static final Block OVERWORLD_ORE = new BlockOres("ore_overworld", "overworld");
}
