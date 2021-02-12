package com.repsi0.denominatingcurrency;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class DenominatingCurrency implements ModInitializer {
	public static final int MAXSTACKSIZE = 50;
	
	public static final Item PENNY = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(MAXSTACKSIZE).rarity(Rarity.COMMON));
	public static final Item NICKEL = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(MAXSTACKSIZE).rarity(Rarity.COMMON));
	public static final Item DIME = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(MAXSTACKSIZE).rarity(Rarity.COMMON));
	public static final Item QUARTER = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(MAXSTACKSIZE).rarity(Rarity.COMMON));
	public static final Item HALF = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(MAXSTACKSIZE).rarity(Rarity.COMMON));
	public static final Item ONE = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(MAXSTACKSIZE).rarity(Rarity.UNCOMMON));
	public static final Item FIVE = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(MAXSTACKSIZE).rarity(Rarity.UNCOMMON));
	public static final Item TEN = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(MAXSTACKSIZE).rarity(Rarity.UNCOMMON));
	public static final Item TWENTYFIVE = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(MAXSTACKSIZE).rarity(Rarity.UNCOMMON));
	public static final Item FIFTY = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(MAXSTACKSIZE).rarity(Rarity.UNCOMMON));
	public static final Item HUNDRED = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(MAXSTACKSIZE).rarity(Rarity.RARE));
	public static final Item FIVEHUNDRED = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(MAXSTACKSIZE).rarity(Rarity.RARE));
	public static final Item THOUSAND = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(MAXSTACKSIZE).rarity(Rarity.EPIC));
	
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("denominatingcurrency", "penny_cent"), PENNY); //copper
		Registry.register(Registry.ITEM, new Identifier("denominatingcurrency", "nickel_cent"), NICKEL); //iron
		Registry.register(Registry.ITEM, new Identifier("denominatingcurrency", "dime_cent"), DIME); //silver
		Registry.register(Registry.ITEM, new Identifier("denominatingcurrency", "quarter_cent"), QUARTER); //gold
		Registry.register(Registry.ITEM, new Identifier("denominatingcurrency", "half_cent"), HALF); //platinum (cyan)
		Registry.register(Registry.ITEM, new Identifier("denominatingcurrency", "one_dollar"), ONE); //copper
		Registry.register(Registry.ITEM, new Identifier("denominatingcurrency", "five_dollar"), FIVE); //iron
		Registry.register(Registry.ITEM, new Identifier("denominatingcurrency", "ten_dollar"), TEN); //silver
		Registry.register(Registry.ITEM, new Identifier("denominatingcurrency", "twenty_five_dollar"), TWENTYFIVE); //gold
		Registry.register(Registry.ITEM, new Identifier("denominatingcurrency", "fifty_dollar"), FIFTY); //platinum (cyan)
		Registry.register(Registry.ITEM, new Identifier("denominatingcurrency", "hundred_superdollar"), HUNDRED); //silver - purple outline
		Registry.register(Registry.ITEM, new Identifier("denominatingcurrency", "five_hundred_superdollar"), FIVEHUNDRED); //gold - purple outline
		Registry.register(Registry.ITEM, new Identifier("denominatingcurrency", "thousand_megadollar"), THOUSAND); //platinum(cyan) - purple outline
	}
}
