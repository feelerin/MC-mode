package com.chinese.cuisine;

import com.chinese.cuisine.block.ModBlocks;
import com.chinese.cuisine.client.CuisineTab;
import com.chinese.cuisine.crafting.ModRecipes;
import com.chinese.cuisine.item.ModItems;
import com.chinese.cuisine.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Cuisine.MODID, name = Cuisine.NAME, version = Cuisine.VERSION, acceptedMinecraftVersions = "[1.10.2]")
public class Cuisine {
	
	@SidedProxy(serverSide = "com.chinese.cuisine.proxy.CommonProxy", clientSide = "com.chinese.cuisine.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	
	public static final String MODID = "chinesecuisine";
	public static final String NAME = "Chinese Cuisine";
	public static final String VERSION = "1.0";
	
	public static final CuisineTab creativeTab = new CuisineTab();
	
	@Mod.Instance(MODID)
	public static Cuisine instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(NAME + "is loading!");
		ModItems.init();
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.addREcipes();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
