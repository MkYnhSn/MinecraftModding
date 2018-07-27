package com.bryancui.cbymod.items.tools;

import javax.annotation.Nullable;

import com.bryancui.cbymod.items.ItemBase;
import com.google.common.base.Predicate;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIDefendVillage;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookAtVillager;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class SummonWand extends ItemBase
{
	public SummonWand(String name)
	{
		super(name);
	}
	
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();
		
		if(!worldIn.isRemote)
		{
			EntityIronGolem golem = new EntityIronGolem(worldIn);
			
			golem.tasks.addTask(1, new EntityAIAttackMelee(golem, 1.0D, true));
			golem.tasks.addTask(2, new EntityAIMoveTowardsTarget(golem, 0.9D, 32.0F));
			golem.tasks.addTask(3, new EntityAIMoveThroughVillage(golem, 0.6D, true));
			golem.tasks.addTask(4, new EntityAIMoveTowardsRestriction(golem, 1.0D));
			golem.tasks.addTask(5, new EntityAILookAtVillager(golem));
			golem.tasks.addTask(6, new EntityAIWanderAvoidWater(golem, 0.6D));
			golem.tasks.addTask(7, new EntityAIWatchClosest(golem, EntityPlayer.class, 6.0F));
			golem.tasks.addTask(8, new EntityAILookIdle(golem));
			golem.targetTasks.addTask(1, new EntityAIDefendVillage(golem));
			golem.targetTasks.addTask(2, new EntityAIHurtByTarget(golem, false, new Class[0]));
			golem.targetTasks.addTask(3, new EntityAINearestAttackableTarget(golem, EntityLiving.class, 10, false, true, new Predicate<EntityLiving>()
	        {
	            public boolean apply(@Nullable EntityLiving p_apply_1_)
	            {
	                return p_apply_1_ != null && IMob.VISIBLE_MOB_SELECTOR.apply(p_apply_1_) && !(p_apply_1_ instanceof EntityCreeper);
	            }
	        }));
		
			golem.setPosition(playerIn.posX + aim.x, playerIn.posY + aim.y, playerIn.posZ + aim.z);
			worldIn.spawnEntity(golem);
			
			playerIn.setHealth(playerIn.getMaxHealth());
			
			playerIn.getCooldownTracker().setCooldown(this, 100);
			
			
		}
		
		
		//item.damageItem(1, playerIn);
		
		return new ActionResult<ItemStack> (EnumActionResult.SUCCESS, item);		
	}

}
