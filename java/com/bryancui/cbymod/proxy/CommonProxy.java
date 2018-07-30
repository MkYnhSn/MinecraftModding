package com.bryancui.cbymod.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id){}
	public void registerVariantRenderer(Item item, int meta, String filename, String id){}
	public void registerFluidModel(Item item, Block block, String name) {}
}
