package com.enderger.uol.objects;
import com.enderger.uol.init.ItemInit;
import com.enderger.uol.objects.BlockItems.ItemBlockBase;
import net.minecraft.block.material.Material;

public class BlockBaseRegister extends BlockBase{

    public BlockBaseRegister(String name, Material material, Float hardness) {
        super(name, material, hardness);

        ItemInit.ITEMS.add(new ItemBlockBase(this, this.getRegistryName(), this.getUnlocalizedName()));
    }
}
