package com.bryancui.cbymod.init;

import java.util.ArrayList;
import java.util.List;

import com.bryancui.cbymod.Main;
import com.bryancui.cbymod.blocks.BlockBananaPlant;
import com.bryancui.cbymod.blocks.BlockBase;
import com.bryancui.cbymod.blocks.CBYBlock;
import com.bryancui.cbymod.blocks.NuclearBomb;
import com.bryancui.cbymod.blocks.SaplingBase;
import com.bryancui.cbymod.blocks.UraniumOreBlock;
import com.bryancui.cbymod.blocks.item.ItemBlockVariant;
import com.bryancui.cbymod.util.handlers.EnumHandler;
import com.bryancui.cbymod.blocks.BlockOres;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
	public static final Block CBY_BLOCK = new CBYBlock("cby_block", Material.ICE);
	
	public static final Block BANANA_PLANT= new BlockBananaPlant("banana_plant");
	public static final Block URANIUM_ORE= new UraniumOreBlock("uranium_ore", Material.ROCK);
	
	public static final Block NUCLEAR_BOMB= new NuclearBomb("nuclear_bomb");
	
	public static final Block sapling= new SaplingBase("sapling");
	
	
	
	

	
	//public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld"); 
	
	

}
