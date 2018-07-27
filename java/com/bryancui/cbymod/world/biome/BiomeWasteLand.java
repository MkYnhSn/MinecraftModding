package com.bryancui.cbymod.world.biome;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.biome.Biome.SpawnListEntry;

public class BiomeWasteLand extends Biome{
	public BiomeWasteLand()
	{
		super(new BiomeProperties("Waste_Land").setBaseHeight(0.5F).setTemperature(1.0F).setWaterColor(65280));
		
		topBlock = Blocks.DIRT.getDefaultState();
		fillerBlock = Blocks.OBSIDIAN.getDefaultState();
		
		this.spawnableCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityStray.class, 10, 1, 10));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityHusk.class, 10, 1, 10));
		
	}


}
