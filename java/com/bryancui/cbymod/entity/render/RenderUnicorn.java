package com.bryancui.cbymod.entity.render;

import com.bryancui.cbymod.entity.EntityUnicorn;
import com.bryancui.cbymod.entity.model.ModelUnicorn;
import com.bryancui.cbymod.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUnicorn extends RenderLiving<EntityUnicorn>
{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/unicorn.png");

	public RenderUnicorn(RenderManager manager) 
	{
		super(manager, new ModelUnicorn(), 0.5F);
		
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityUnicorn entity)
	{
		return TEXTURES;
	}
	
	
}
