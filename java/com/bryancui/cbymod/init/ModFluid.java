package com.bryancui.cbymod.init;

import java.util.ArrayList;
import java.util.List;

import com.bryancui.cbymod.blocks.fluid.FluidAcid;
import com.bryancui.cbymod.blocks.fluid.FluidBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

public class ModFluid
{
	public static final List<Fluid> FLUID = new ArrayList<Fluid>();
	public static final Fluid ACID = new FluidAcid();
}
