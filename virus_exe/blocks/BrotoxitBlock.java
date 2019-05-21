package com.brotoxi.brotoxit.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BrotoxitBlock extends BlockBase{

	public BrotoxitBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe" , 2);
		setLightLevel(0.0f);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

	
}
