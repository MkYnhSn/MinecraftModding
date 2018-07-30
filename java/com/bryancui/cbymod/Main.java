package com.bryancui.cbymod;

import com.bryancui.cbymod.init.ModBiomes;
import com.bryancui.cbymod.init.ModEntities;
import com.bryancui.cbymod.init.ModRecipes;
import com.bryancui.cbymod.proxy.CommonProxy;
import com.bryancui.cbymod.util.Reference;
import com.bryancui.cbymod.util.handlers.RegistryHandler;
import com.bryancui.cbymod.util.handlers.RenderHandler;
import com.bryancui.cbymod.world.types.WorldTypeCity;
import com.bryancui.cbymod.world.types.WorldTypeWasteLand;

import net.minecraft.world.WorldType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		ModBiomes.registerBiomes();
		ModEntities.registryEntities();
		RenderHandler.registerEntityRender();
		RegistryHandler.otherRegistries();
		RegistryHandler.onFluidRegister();
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		WorldType CITY = new WorldTypeCity();
		WorldType WASTE_LAND = new WorldTypeWasteLand();
	}
}
