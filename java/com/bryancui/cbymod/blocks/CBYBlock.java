package com.bryancui.cbymod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CBYBlock extends BlockBase{

	public CBYBlock(String name, Material material) {
		
		super(name, material);
		
		setSoundType(SoundType.SNOW);
		setHardness(10.0F);
		setResistance(6000.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(0.5F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		

	}

}
