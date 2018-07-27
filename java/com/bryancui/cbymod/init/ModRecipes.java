package com.bryancui.cbymod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.CBY_BLOCK, new ItemStack(ModItems.CBY, 5), 0f);
		
	}

}
