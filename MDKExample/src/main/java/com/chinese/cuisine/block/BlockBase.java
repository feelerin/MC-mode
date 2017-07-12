package com.chinese.cuisine.block;

import com.chinese.cuisine.Cuisine;
import com.chinese.cuisine.item.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockBase extends Block implements ItemModelProvider {
	protected String name;
	
	public BlockBase(Material materialIn, String name) {
		super(materialIn);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		//setCreativeTab(Cuisine.creativeTab);
	}
	
	@Override
	public void registerItemModel(Item itemBlock) {
		Cuisine.proxy.registerItemRenderer(itemBlock, 0, name);	
	}
	
	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
}
