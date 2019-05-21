package com.brotoxi.brotoxit.items;

import com.brotoxi.brotoxit.Main;
import com.brotoxi.brotoxit.init.ModItems;
import com.brotoxi.brotoxit.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "incentory");
	}

}
