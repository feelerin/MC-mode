package com.chinese.cuisine.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTool extends BlockBase {
	public BlockTool(String name) {
		super(Material.ROCK, name);
		
		setHardness(3f);
		setResistance(5f);
	}
	
	@Override
	public BlockTool setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
