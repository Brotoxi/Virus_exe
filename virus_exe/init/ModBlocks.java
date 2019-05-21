package com.brotoxi.brotoxit.init;

import java.util.ArrayList;
import java.util.List;

import com.brotoxi.brotoxit.blocks.BlockBase;
import com.brotoxi.brotoxit.blocks.BrotoxitBlock;
import com.brotoxi.brotoxit.blocks.BrotoxitOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BROTOXIT_BLOCK = new BrotoxitBlock("brotoxit_block", Material.IRON);
	public static final Block BROTOXIT_ORE = new BrotoxitOre("brotoxit_ore", Material.ROCK);
}
