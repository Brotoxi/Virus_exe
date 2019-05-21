package com.brotoxi.brotoxit.items.tools;

import com.brotoxi.brotoxit.Main;
import com.brotoxi.brotoxit.init.ModItems;
import com.brotoxi.brotoxit.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel{
	
	public ToolHoe(String name, ToolMaterial material) {
		super(material);
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
