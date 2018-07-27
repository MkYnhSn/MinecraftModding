package com.bryancui.cbymod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class UraniumOreBlock extends BlockBase{

	public UraniumOreBlock(String name, Material material) {
		super(name, material);
		this.setSoundType(SoundType.STONE);
		this.setHardness(10.0F);
		this.setResistance(60.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(1.0F);
	}

}
