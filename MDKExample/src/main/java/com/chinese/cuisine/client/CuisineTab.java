package com.chinese.cuisine.client;

import com.chinese.cuisine.Cuisine;
import com.chinese.cuisine.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CuisineTab extends CreativeTabs {
	public CuisineTab() {
		super(Cuisine.MODID);
		//setBackgroundImageName("cuisine.png");
	}
	
	@Override
	public Item getTabIconItem() {
		return Items.ARROW;
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
