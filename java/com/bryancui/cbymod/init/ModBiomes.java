package com.bryancui.cbymod.init;

import com.bryancui.cbymod.world.biome.BiomeCity;
import com.bryancui.cbymod.world.biome.BiomeWasteLand;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBiomes 
{
	public static final Biome CITY = new BiomeCity();
	public static final Biome WASTE_LAND = new BiomeWasteLand();
	
	public static void registerBiomes()
	{
		initBiome(CITY, "City", BiomeType.WARM, Type.HILLS);
		initBiome(WASTE_LAND, "Waste_Land", BiomeType.DESERT, Type.DEAD, Type.WASTELAND);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type...types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("Biome Added");
		return biome;
	}

}
