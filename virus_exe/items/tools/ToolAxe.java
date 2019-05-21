package com.brotoxi.brotoxit.items.tools;

import com.brotoxi.brotoxit.Main;
import com.brotoxi.brotoxit.init.ModItems;
import com.brotoxi.brotoxit.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel{

	public ToolAxe(String name, ToolMaterial material) {
		super(material, 6.0f, -3.2f);
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
