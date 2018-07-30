package com.bryancui.cbymod.util.handlers;

import com.bryancui.cbymod.init.ModBiomes;
import com.bryancui.cbymod.init.ModBlocks;
import com.bryancui.cbymod.init.ModEnchantments;
import com.bryancui.cbymod.init.ModEntities;
import com.bryancui.cbymod.init.ModFluid;
import com.bryancui.cbymod.init.ModItems;
import com.bryancui.cbymod.util.IHasModel;
import com.bryancui.cbymod.world.gen.WorldGenCustomOres;
import com.bryancui.cbymod.world.types.WorldTypeCity;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	 
	@SubscribeEvent
	public static void onEnchantmentregister(RegistryEvent.Register<Enchantment> event)
	{
		event.getRegistry().registerAll(ModEnchantments.ENCHANTMENTS.toArray(new Enchantment[0]));
	}

	public static void onFluidRegister()
	{
		for(Fluid object : ModFluid.FLUID)
		{
			FluidRegistry.registerFluid(object);
			FluidRegistry.addBucketForFluid(object);   
		}
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModel();
			}
			
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModel();
			}
			
		}
	}
	
	public static void otherRegistries()
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
	}
	
}
