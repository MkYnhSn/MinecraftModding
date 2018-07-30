package com.bryancui.cbymod.items.tools;

import com.bryancui.cbymod.entity.EntityUnicorn;
import com.bryancui.cbymod.items.ItemBase;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class TeleportGun extends ItemBase
{

	public TeleportGun(String name) {
		super(name);
		this.maxStackSize=1;
	}
	
	int count = 0;
	
	
	//code for ammo system: 
	private ItemStack findAmmo(EntityPlayer player)
    {
        if (this.isAmmo(player.getHeldItem(EnumHand.OFF_HAND)))
        {
            return player.getHeldItem(EnumHand.OFF_HAND);
        }
        else if (this.isAmmo(player.getHeldItem(EnumHand.MAIN_HAND)))
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
        return stack.getItem() instanceof ItemEnderPearl;
    }
    //important
    
    
    
    
    
    
	
	
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();
		boolean empty=this.findAmmo(playerIn).isEmpty();
		ItemStack ammo = this.findAmmo(playerIn);
		
		double tpX = playerIn.posX + aim.x*30;
		double tpY = playerIn.posY + aim.y*30;
		double tpZ = playerIn.posZ + aim.z*30;
		
		
		
		if(!empty)
		{
		playerIn.setPosition(tpX, tpY, tpZ);
		worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ENDERPEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		count = count + 1;
		if(count == 4)
		{
			playerIn.getCooldownTracker().setCooldown(this, 50);
			count = 0;
			ammo.shrink(1);
		}
		
		
		}
		else
		{
			worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.BLOCK_METAL_HIT, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		}
		
		return  new ActionResult<ItemStack> (EnumActionResult.SUCCESS, item);
		
	}
	
	

}
