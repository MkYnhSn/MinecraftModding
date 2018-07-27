package com.bryancui.cbymod.items.tools;

import com.bryancui.cbymod.items.ItemBase;

import net.minecraft.entity.ai.EntityJumpHelper;
import net.minecraft.entity.effect.EntityWeatherEffect;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemFireball;
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
		this.maxStackSize=1;
		
	}
	int count = 0;
	
	
	
	
	private ItemStack findAmmo(EntityPlayer player)
    {
        if (this.isAmmo(player.getHeldItem(EnumHand.OFF_HAND)))
        {
            return player.getHeldItem(EnumHand.OFF_HAND);
        }
         if (this.isAmmo(player.getHeldItem(EnumHand.MAIN_HAND)))
        {
            return player.getHeldItem(EnumHand.MAIN_HAND);
        }
        else
        {
            for (int i = 0; i < player.inventory.getSizeInventory(); ++i)
            {
                ItemStack itemstack = player.inventory.getStackInSlot(i);

                if (this.isAmmo(itemstack))
                {
                    return itemstack;
                }
            }

            return ItemStack.EMPTY;
        }
    }

    protected boolean isAmmo(ItemStack stack)
    {
        return stack.getItem() instanceof ItemFireball;
    }
    
    
    
    
    
    
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();
		EntityLargeFireball fireball = new EntityLargeFireball(worldIn, playerIn, 1,1,1);
		boolean empty=this.findAmmo(playerIn).isEmpty();
		ItemStack ammo = this.findAmmo(playerIn);
		
		
		if(!empty)
		{
			count+=1;
			ammo.shrink(1);
			fireball.setPosition(playerIn.posX + aim.x*1.5, playerIn.posY + aim.y*1.5, playerIn.posZ + aim.z*1.5);
			fireball.accelerationX = aim.x*10;
			fireball.accelerationY = aim.y*10;
			fireball.accelerationZ = aim.z*10;
			worldIn.spawnEntity(fireball);
		
			if(count==10)
			{
				playerIn.getCooldownTracker().setCooldown(this, 40);
				count=0;
			}
		}			
		
		
		item.damageItem(1, playerIn);
		
		return new ActionResult<ItemStack> (EnumActionResult.SUCCESS, item);
	}
	
	/*@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand handIn, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		
	}*/
	
	
	
	

}
