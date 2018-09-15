package com.enderger.uol.util.compat;

import com.enderger.uol.init.BlockInit;
import com.enderger.uol.init.ItemInit;
import com.enderger.uol.objects.BlockOres;
import com.enderger.uol.util.handelers.EnumHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat {
    public static void registerOres() {
        //Ores
        OreDictionary.registerOre("oreCopper", new ItemStack(BlockInit.OVERWORLD_ORE, 1, 0));
        OreDictionary.registerOre("oreTin", new ItemStack(BlockInit.OVERWORLD_ORE, 1, 1));
        OreDictionary.registerOre("oreAluminum", new ItemStack(BlockInit.OVERWORLD_ORE, 1, 2));
        OreDictionary.registerOre("oreSilver", new ItemStack(BlockInit.OVERWORLD_ORE, 1, 3));
        OreDictionary.registerOre("oreLead", new ItemStack(BlockInit.OVERWORLD_ORE, 1, 4));
        OreDictionary.registerOre("oreMithril", new ItemStack(BlockInit.OVERWORLD_ORE, 1, 5));
        OreDictionary.registerOre("oreNickel", new ItemStack(BlockInit.OVERWORLD_ORE, 1, 6));
        OreDictionary.registerOre("orePlatinum", new ItemStack(BlockInit.OVERWORLD_ORE, 1, 7));
        //Blocks
        OreDictionary.registerOre("blockCopper", BlockInit.COPPER_BLOCK);
        OreDictionary.registerOre("blockTin", BlockInit.TIN_BLOCK);
        OreDictionary.registerOre("blockAluminum", BlockInit.ALUMINUM_BLOCK);
        OreDictionary.registerOre("blockSilver", BlockInit.SILVER_BLOCK);
        OreDictionary.registerOre("blockLead", BlockInit.LEAD_BLOCK);
        OreDictionary.registerOre("blockMithril", BlockInit.MITHRIL_BLOCK);
        OreDictionary.registerOre("blockNickel", BlockInit.NICKEL_BLOCK);
        OreDictionary.registerOre("blockPlatinum", BlockInit.PLATINUM_BLOCK);
        //Ingots
        OreDictionary.registerOre("ingotCopper", ItemInit.COPPER_INGOT);
        OreDictionary.registerOre("ingotTin", ItemInit.TIN_INGOT);
        OreDictionary.registerOre("ingotAluminum", ItemInit.ALUMINUM_INGOT);
        OreDictionary.registerOre("ingotSilver", ItemInit.SILVER_INGOT);
        OreDictionary.registerOre("ingotLead", ItemInit.LEAD_INGOT);
        OreDictionary.registerOre("ingotMithril", ItemInit.MITHRIL_INGOT);
        OreDictionary.registerOre("ingotNickel", ItemInit.NICKEL_INGOT);
        OreDictionary.registerOre("ingotPlatinum", ItemInit.PLATINUM_INGOT);
        //Dusts
        OreDictionary.registerOre("dustCopper", ItemInit.COPPER_DUST);
        OreDictionary.registerOre("dustTin", ItemInit.TIN_DUST);
        OreDictionary.registerOre("dustAluminum", ItemInit.ALUMINUM_DUST);
        OreDictionary.registerOre("dustSilver", ItemInit.SILVER_DUST);
        OreDictionary.registerOre("dustLead", ItemInit.LEAD_DUST);
        OreDictionary.registerOre("dustMithril", ItemInit.MITHRIL_DUST);
        OreDictionary.registerOre("dustNickel", ItemInit.NICKEL_DUST);
        OreDictionary.registerOre("dustPlatinum", ItemInit.PLATINUM_DUST);
        OreDictionary.registerOre("dustIron", ItemInit.IRON_DUST);
        OreDictionary.registerOre("dustGold", ItemInit.GOLD_DUST);
        //Plates
        OreDictionary.registerOre("plateCopper", ItemInit.COPPER_PLATE);
        OreDictionary.registerOre("plateTin", ItemInit.TIN_PLATE);
        OreDictionary.registerOre("plateAluminum", ItemInit.ALUMINUM_PLATE);
        OreDictionary.registerOre("plateSilver", ItemInit.SILVER_PLATE);
        OreDictionary.registerOre("plateLead", ItemInit.LEAD_PLATE);
        OreDictionary.registerOre("plateMithril", ItemInit.MITHRIL_PLATE);
        OreDictionary.registerOre("plateNickel", ItemInit.NICKEL_PLATE);
        OreDictionary.registerOre("platePlatinum", ItemInit.PLATINUM_PLATE);
        OreDictionary.registerOre("plateIron", ItemInit.IRON_PLATE);
        OreDictionary.registerOre("plateGold", ItemInit.GOLD_PLATE);
    }
}
