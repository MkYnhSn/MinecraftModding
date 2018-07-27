package com.bryancui.cbymod.world.gen;

import java.util.Random;

import com.bryancui.cbymod.blocks.BlockOres;
import com.bryancui.cbymod.init.ModBlocks;
import com.bryancui.cbymod.util.handlers.EnumHandler;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	
	private WorldGenerator uranium_ore;
	
	public WorldGenCustomOres()
	{
		uranium_ore = new WorldGenMinable(ModBlocks.URANIUM_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 0:
		
			runGenerator(uranium_ore, world, random, chunkX, chunkZ, 50, 0/*minH*/, 100/*maxH*/);
			
			break;
		}
		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore Generation Out of Bounds");
		
		int heightDiff= maxHeight - minHeight + 1;
		for (int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int z = chunkZ * 16 + rand.nextInt(16);
			int y= minHeight + rand.nextInt(heightDiff);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
		
	}



	
	

}
