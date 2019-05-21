package com.brotoxi.brotoxit.init;

import java.util.ArrayList;
import java.util.List;

import com.brotoxi.brotoxit.items.ItemBase;
import com.brotoxi.brotoxit.items.tools.ToolAxe;
import com.brotoxi.brotoxit.items.tools.ToolHoe;
import com.brotoxi.brotoxit.items.tools.ToolPickaxe;
import com.brotoxi.brotoxit.items.tools.ToolSpade;
import com.brotoxi.brotoxit.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_BROTOXIT = EnumHelper.addToolMaterial("brotoxit_sword", 3, 250, 8.0F, 3.0F, 10);
	
	//Items
	public static final Item BROTOXIT_INGOT = new ItemBase("brotoxit_ingot");  

	//Tools
	public static final ItemSword BROTOXI_SWORT = new ToolSword("brotoxit_sword", MATERIAL_BROTOXIT);
	public static final ItemSpade BROTOXIT_SHOVEL = new ToolSpade("brotoxit_shovel", MATERIAL_BROTOXIT);
	public static final ItemPickaxe BROTOXIT_PICKAXE = new ToolPickaxe("brotoxit_pickaxe", MATERIAL_BROTOXIT);
	public static final ItemAxe BROTOXIT_AXE = new ToolAxe("brotoxit_axe", MATERIAL_BROTOXIT);
	public static final ItemHoe BROTOXIT_HOE = new ToolHoe("brotoxit_hoe", MATERIAL_BROTOXIT);
}
