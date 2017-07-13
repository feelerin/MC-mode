package com.chinese.cuisine.crafting;

import com.chinese.cuisine.block.ModBlocks;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void addREcipes() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tradStove), "   ", "###", "#*#", '#', Items.BRICK, '*', Items.COAL);
		
		//GameRegistry.addShapelessRecipe(new ItemStack(), params);
		
		//GameRegistry.addSmelting(input, output, xp);
	}
}
