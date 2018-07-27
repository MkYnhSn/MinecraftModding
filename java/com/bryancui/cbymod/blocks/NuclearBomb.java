package com.bryancui.cbymod.blocks;

import com.bryancui.cbymod.Main;
import com.bryancui.cbymod.entity.EntityBomb;
import com.bryancui.cbymod.init.ModBlocks;
import com.bryancui.cbymod.init.ModItems;
import com.bryancui.cbymod.util.IHasModel;

import net.minecraft.block.BlockTNT;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class NuclearBomb extends BlockTNT implements IHasModel
{
	 
	 public NuclearBomb(String name)
	 {
		setUnlocalizedName(name);
		setRegistryName(name);
			
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	 }
	 
	 @Override
	 public void onBlockDestroyedByExplosion(World world, BlockPos pos, Explosion explosion)
	    {
	        if (!world.isRemote)
	        {
	            EntityBomb entitytntprimed = new EntityBomb(world, (double)((float)pos.getX() + 0.5F), (double)pos.getY(), (double)((float)pos.getZ() + 0.5F), explosion.getExplosivePlacedBy());
	            entitytntprimed.setFuse((short)(world.rand.nextInt(entitytntprimed.getFuse() / 4) + entitytntprimed.getFuse() / 8));
	            world.spawnEntity(entitytntprimed);
	        }
	    }
	 
	 @Override
	 public void onBlockDestroyedByPlayer(World world, BlockPos pos, IBlockState state)
	    {
	        this.explode(world, pos, state, (EntityLivingBase)null);
	    }

	    public void explode(World world, BlockPos pos, IBlockState state, EntityLivingBase igniter)
	    {
	        if (!world.isRemote)
	        {
	            if (((Boolean)state.getValue(EXPLODE)).booleanValue())
	            {
	                EntityBomb entitytntprimed = new EntityBomb(world, (double)((float)pos.getX() + 0.5F), (double)pos.getY(), (double)((float)pos.getZ() + 0.5F), igniter);
	                world.spawnEntity(entitytntprimed);
	                world.playSound((EntityPlayer)null, entitytntprimed.posX, entitytntprimed.posY, entitytntprimed.posZ, SoundEvents.ENTITY_TNT_PRIMED, SoundCategory.BLOCKS, 1.0F, 1.0F);
	            }
	        }
	    }


		@Override
		public void registerModel() {
			// TODO Auto-generated method stub
			Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		}


	 
	 
}
