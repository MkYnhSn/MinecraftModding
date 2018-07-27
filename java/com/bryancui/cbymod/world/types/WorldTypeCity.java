package com.bryancui.cbymod.world.types;

import com.bryancui.cbymod.init.ModBiomes;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;

public class WorldTypeCity extends WorldType{

	public WorldTypeCity() {
		super("City");
		
	}
	
	@Override
	public BiomeProvider getBiomeProvider(World world)
	{
		return new BiomeProviderSingle(ModBiomes.CITY);
	}

}
