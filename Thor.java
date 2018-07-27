package com.bryancui.cbymod.items.tools;

import java.util.List;

import com.bryancui.cbymod.items.ItemBase;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityJumpHelper;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.effect.EntityWeatherEffect;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Thor extends ToolSword
{

	public Thor(String name, ToolMaterial material) {
		super(name, material);
	}
	
	/*@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand handIn, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		ItemStack item = player.getHeldItem(handIn);
		Vec3d aim = player.getLookVec();
		EntityLightningBolt lightning = new EntityLightningBolt(worldIn, hitX, hitY, hitZ, false);
		
		worldIn.spawnEntity(lightning);
		lightning.setPosition(hitX, hitY, hitZ);
		
		
		
		item.damageItem(1, player);
		return null;
		
		
	}*/
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();
		
		EntityLightningBolt lightning = new EntityLightningBolt(worldIn, playerIn.posX+ aim.x*10, playerIn.posY+ aim.y*10, playerIn.posZ+ aim.z*10, false);
		worldIn.spawnEntity(lightning);
		lightning.setPosition(playerIn.posX+ aim.x*10, playerIn.posY + aim.y*10, playerIn.posZ + aim.z*10);
		playerIn.getCooldownTracker().setCooldown(this, 30);
		
		
		
		
		
		//item.damageItem(1, playerIn);
		
		return new ActionResult<ItemStack> (EnumActionResult.SUCCESS, item);		
	}
	
	

}
