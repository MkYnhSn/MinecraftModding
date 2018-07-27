package com.bryancui.cbymod.items.tools;

import com.bryancui.cbymod.items.ItemBase;

import net.minecraft.entity.ai.EntityJumpHelper;
import net.minecraft.entity.effect.EntityWeatherEffect;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class FireGun extends ItemBase
{

	public FireGun(String name) {
		super(name);
		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();
		EntityLargeFireball fireball = new EntityLargeFireball(worldIn, playerIn, 1,1,1);
		
		fireball.setPosition(playerIn.posX + aim.x*1.5, playerIn.posY + aim.y*1.5, playerIn.posZ + aim.z*1.5);
		fireball.accelerationX = aim.x*1;
		fireball.accelerationY = aim.y*1;
		fireball.accelerationZ = aim.z*1;
		fireball.explosionPower=10;
		worldIn.spawnEntity(fireball);
		
		item.damageItem(1, playerIn);
		
		return new ActionResult<ItemStack> (EnumActionResult.SUCCESS, item);		
	}
	
	/*@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand handIn, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		
	}*/
	
	
	
	

}
