package com.bryancui.cbymod.init;

import java.util.ArrayList;
import java.util.List;

import com.bryancui.cbymod.enchantments.EnchantmentYours;
import com.bryancui.cbymod.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)
public class ModEnchantments 
{
	public static final List<Enchantment> ENCHANTMENTS = new ArrayList<Enchantment>();
	
	public static final Enchantment YOUR_ENCHANTMENT = new EnchantmentYours();
	
	@SubscribeEvent
	public static void yourEnchantmentFunc(LivingUpdateEvent event)
	{
		EntityLivingBase living = event.getEntityLiving();
		int level = EnchantmentHelper.getMaxEnchantmentLevel(YOUR_ENCHANTMENT, living);
		BlockPos pos = living.getPosition();
		World world = event.getEntity().world;
	}

}
