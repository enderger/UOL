package com.enderger.uol.objects;

//Imports
import com.enderger.uol.Main;
import com.enderger.uol.init.BlockInit;
import com.enderger.uol.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockBase extends Block implements IHasModel {
    Float HARDNESS;
    public BlockBase(String name, Material material, Float hardness) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.uoltab);
        HARDNESS = hardness;
        setHardness(HARDNESS);

        BlockInit.BLOCKS.add(this);

    }
    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
        }
    }