package com.bryancui.cbymod.world.biome;

import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeCity extends Biome
{
	public BiomeCity()
	{
		super(new BiomeProperties("City").setBaseHeight(1.5F).setTemperature(1.0F).setWaterColor(0000));
		
		topBlock = Blocks.STONEBRICK.getDefaultState();
		fillerBlock = Blocks.COBBLESTONE.getDefaultState();
		
		this.spawnableCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 10, 1, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityOcelot.class, 10, 1, 5));
		
	}

}
