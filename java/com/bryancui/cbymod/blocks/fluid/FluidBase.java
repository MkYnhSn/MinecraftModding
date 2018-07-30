package com.bryancui.cbymod.blocks.fluid;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.BlockFluidClassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;

import com.bryancui.cbymod.Main;
import com.bryancui.cbymod.init.ModBiomes;
import com.bryancui.cbymod.init.ModBlocks;
import com.bryancui.cbymod.init.ModEntities;
import com.bryancui.cbymod.init.ModFluid;
import com.bryancui.cbymod.init.ModItems;
import com.bryancui.cbymod.util.IHasModel;
import com.bryancui.cbymod.util.handlers.RegistryHandler;
import com.bryancui.cbymod.util.handlers.RenderHandler;

public class FluidBase extends Fluid implements IHasModel
{
	static
	{
		FluidRegistry.enableUniversalBucket();
	}
	public FluidBase(String name, Material material)
	{
		this(name, material, new ResourceLocation("fluid/"+ name + "_still"), new ResourceLocation("fluid/" + name + "_flowing"));
	}
	
	public FluidBase(String name, Material material, ResourceLocation still, ResourceLocation flowing)
	{
		super(name, still, flowing);
		block = new BlockFluidClassic(this, material);
		block.setUnlocalizedName(name);
		block.setRegistryName("fluid " + name);
		Item item = new ItemBlock(block);
		item.setRegistryName(name);
		ModFluid.FLUID.add(this);
		ModBlocks.BLOCKS.add(block);
		ModItems.ITEMS.add(item);
	}
	
	@Override
	public void registerModel()
	{
		Main.proxy.registerFluidModel(Item.getItemFromBlock(this.getBlock()), this.getBlock(), this.getName());
	}
}
