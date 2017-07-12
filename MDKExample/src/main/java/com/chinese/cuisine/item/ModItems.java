package com.chinese.cuisine.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase corn;
	
	
	public static void init() {
		corn = register(new ItemBase("corn").setCreativeTab(CreativeTabs.MATERIALS));
	}
	
	private static <T extends Item> T register (T item) {
		GameRegistry.register(item);
		
		if (item instanceof ItemModelProvider) {
			((ItemModelProvider) item).registerItemModel(item);
		}
		
		return item;
	}
}
