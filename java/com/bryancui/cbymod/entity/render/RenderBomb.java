package com.bryancui.cbymod.entity.render;

import com.bryancui.cbymod.entity.EntityBomb;
import com.bryancui.cbymod.entity.model.ModelBomb;
import com.bryancui.cbymod.util.Reference;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.util.ResourceLocation;

public class RenderBomb extends Render<EntityBomb>
{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/blocks/nuclear_bomb.png");
	
	public RenderBomb(RenderManager manager) {
		super(manager);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBomb entity) {
		
		return TEXTURES;
	}

	

}