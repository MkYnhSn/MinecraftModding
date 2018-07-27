package com.bryancui.cbymod.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntityBomb extends EntityTNTPrimed
{
	
	private EntityLivingBase tntPlacedBy;

	public EntityBomb(World world) {
		super(world);
		this.fuse=100;
	}
	public EntityBomb(World world, double x, double y, double z, EntityLivingBase igniter)
    {
        this(world);
        this.setPosition(x, y, z);
        float f = (float)(Math.random() * (Math.PI * 2D));
        this.motionX = (double)(-((float)Math.sin((double)f)) * 0.02F);
        this.motionY = 0.0D;
        this.motionZ = (double)(-((float)Math.cos((double)f)) * 0.02F);
        this.setFuse(80);
        this.prevPosX = x;
        this.prevPosY = y;
        this.prevPosZ = z;
        this.tntPlacedBy = igniter;
    }

	private int fuse;
	
	@Override
	public void onUpdate()
	    {
	        this.prevPosX = this.posX;
	        this.prevPosY = this.posY;
	        this.prevPosZ = this.posZ;

	        if (!this.hasNoGravity())
	        {
	            this.motionY -= 0.0D;
	        }

	        this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
	        this.motionX *= 0.9800000190734863D;
	        this.motionY *= 0.0D;
	        this.motionZ *= 0.9800000190734863D;

	        if (this.onGround)
	        {
	            this.motionX *= 0.699999988079071D;
	            this.motionZ *= 0.699999988079071D;
	            this.motionY *= 0.0D;
	        }

	        --this.fuse;

	        if (this.fuse <= 0)
	        {
	            this.setDead();

	            if (!this.world.isRemote)
	            {
	                this.boom();
	            }
	        }
	        else
	        {
	            this.handleWaterMovement();
	            this.world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
	        }
	    }

	private void boom()
	{
		float f= 60.0F;
		this.world.createExplosion(this, this.posX, this.posY + (double)(this.height / 16.0F), this.posZ, 60.0F, true);
	}

}
