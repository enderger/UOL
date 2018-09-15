package com.enderger.uol.init;

import com.enderger.uol.util.compat.OreDictionaryCompat;
import javafx.scene.paint.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.OreIngredient;

public class RecipeInit {
    static float xp = 3.0f;
    public static void init() {
        //OreToIngot
        GameRegistry.addSmelting(new ItemStack(BlockInit.OVERWORLD_ORE, 1, 0), new ItemStack(ItemInit.COPPER_INGOT, 1), xp);
        GameRegistry.addSmelting(new ItemStack(BlockInit.OVERWORLD_ORE, 1, 1), new ItemStack(ItemInit.TIN_INGOT, 1), xp);
        GameRegistry.addSmelting(new ItemStack(BlockInit.OVERWORLD_ORE, 1, 2), new ItemStack(ItemInit.ALUMINUM_INGOT, 1), xp);
        GameRegistry.addSmelting(new ItemStack(BlockInit.OVERWORLD_ORE, 1, 3), new ItemStack(ItemInit.SILVER_INGOT, 1), xp);
        GameRegistry.addSmelting(new ItemStack(BlockInit.OVERWORLD_ORE, 1, 4), new ItemStack(ItemInit.LEAD_INGOT, 1), xp);
        GameRegistry.addSmelting(new ItemStack(BlockInit.OVERWORLD_ORE, 1, 5), new ItemStack(ItemInit.MITHRIL_INGOT, 1), xp);
        GameRegistry.addSmelting(new ItemStack(BlockInit.OVERWORLD_ORE, 1, 6), new ItemStack(ItemInit.NICKEL_INGOT, 1), xp);
        GameRegistry.addSmelting(new ItemStack(BlockInit.OVERWORLD_ORE, 1, 7), new ItemStack(ItemInit.PLATINUM_INGOT, 1), xp);
        //DustToIngot
        GameRegistry.addSmelting(ItemInit.COPPER_DUST, new ItemStack(ItemInit.COPPER_INGOT,1), xp);
        GameRegistry.addSmelting(ItemInit.TIN_DUST, new ItemStack(ItemInit.TIN_INGOT,1), xp);
        GameRegistry.addSmelting(ItemInit.ALUMINUM_DUST, new ItemStack(ItemInit.ALUMINUM_INGOT,1), xp);
        GameRegistry.addSmelting(ItemInit.SILVER_DUST, new ItemStack(ItemInit.SILVER_INGOT,1), xp);
        GameRegistry.addSmelting(ItemInit.LEAD_DUST, new ItemStack(ItemInit.LEAD_INGOT,1), xp);
        GameRegistry.addSmelting(ItemInit.MITHRIL_DUST, new ItemStack(ItemInit.MITHRIL_INGOT,1), xp);
        GameRegistry.addSmelting(ItemInit.NICKEL_DUST, new ItemStack(ItemInit.NICKEL_INGOT,1), xp);
        GameRegistry.addSmelting(ItemInit.PLATINUM_DUST, new ItemStack(ItemInit.PLATINUM_INGOT,1), xp);
    }
}
