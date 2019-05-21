package com.brotoxi.brotoxit.blocks;

import java.util.Random;

import com.brotoxi.brotoxit.init.ModBlocks;
import com.brotoxi.brotoxit.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BrotoxitOre extends BlockBase{

	public BrotoxitOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 2);
		
	}
	
	/**
	*@Override
	*public Item getItemDropped(IBlockState state, Random rand, int fortune) {
	 
		return ModItems.BROTOXIT_INGOT;
	}
	
	@Override
	public int quantitiDropped(Random rand){
	int max = 3;
	int min = 1;
	
	return rand.nextInt(max) + min;
	*/
}
