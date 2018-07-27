package com.bryancui.cbymod.entity.render;

import com.bryancui.cbymod.entity.EntityBorderCollie;
import com.bryancui.cbymod.entity.EntityUnicorn;
import com.bryancui.cbymod.entity.model.ModelBorderCollie;
import com.bryancui.cbymod.entity.model.ModelUnicorn;
import com.bryancui.cbymod.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBorderCollie extends RenderLiving<EntityBorderCollie>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/border_collie.png");
	
	public RenderBorderCollie(RenderManager manager) {
		super(manager, new ModelBorderCollie(), 0.5F);
	}

	
	@Override
	protected ResourceLocation getEntityTexture(EntityBorderCollie entity)
	{
		return TEXTURES;
	}
	

}
