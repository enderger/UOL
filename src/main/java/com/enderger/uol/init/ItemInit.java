package com.enderger.uol.init;

//Imports
import com.enderger.uol.objects.ItemBase;
import com.enderger.uol.objects.ItemCustomRarity;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //INGOTS
    public static final Item COPPER_INGOT = new ItemBase("ingot_copper");
    public static final Item TIN_INGOT = new ItemBase("ingot_tin");
    public static final Item ALUMINUM_INGOT = new ItemBase("ingot_aluminum");
    public static final Item SILVER_INGOT = new ItemBase("ingot_silver");
    public static final Item LEAD_INGOT = new ItemBase("ingot_lead");
    public static final Item MITHRIL_INGOT = new ItemCustomRarity("ingot_mithril", EnumRarity.RARE);
    public static final Item NICKEL_INGOT = new ItemCustomRarity("ingot_nickel", EnumRarity.UNCOMMON);
    public static final Item PLATINUM_INGOT = new ItemBase("ingot_platinum");

    //DUSTS
    public static final Item COPPER_DUST = new ItemBase("dust_copper");
    public static final Item TIN_DUST = new ItemBase("dust_tin");
    public static final Item ALUMINUM_DUST = new ItemBase("dust_aluminum");
    public static final Item SILVER_DUST = new ItemBase("dust_silver");
    public static final Item LEAD_DUST = new ItemBase("dust_lead");
    public static final Item MITHRIL_DUST = new ItemCustomRarity("dust_mithril", EnumRarity.RARE);
    public static final Item NICKEL_DUST = new ItemCustomRarity("dust_nickel", EnumRarity.UNCOMMON);
    public static final Item PLATINUM_DUST = new ItemBase("dust_platinum");
    public static final Item GOLD_DUST = new ItemBase("dust_gold");
    public static final Item IRON_DUST = new ItemBase("dust_iron");

    //PLATES
    public static final Item COPPER_PLATE = new ItemBase("plate_copper");
    public static final Item TIN_PLATE = new ItemBase("plate_tin");
    public static final Item ALUMINUM_PLATE = new ItemBase("plate_aluminum");
    public static final Item SILVER_PLATE = new ItemBase("plate_silver");
    public static final Item LEAD_PLATE = new ItemBase("plate_lead");
    public static final Item MITHRIL_PLATE = new ItemCustomRarity("plate_mithril", EnumRarity.RARE);
    public static final Item NICKEL_PLATE = new ItemCustomRarity("plate_nickel", EnumRarity.UNCOMMON);
    public static final Item PLATINUM_PLATE = new ItemBase("plate_platinum");
    public static final Item GOLD_PLATE = new ItemBase("plate_gold");
    public static final Item IRON_PLATE = new ItemBase("plate_iron");
}
