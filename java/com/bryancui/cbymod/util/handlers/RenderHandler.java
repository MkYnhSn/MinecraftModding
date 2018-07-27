package com.bryancui.cbymod.util.handlers;

import com.bryancui.cbymod.entity.EntityBomb;
import com.bryancui.cbymod.entity.EntityBorderCollie;
import com.bryancui.cbymod.entity.EntityUnicorn;
import com.bryancui.cbymod.entity.render.RenderBomb;
import com.bryancui.cbymod.entity.render.RenderBorderCollie;
import com.bryancui.cbymod.entity.render.RenderUnicorn;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRender()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityUnicorn.class, new IRenderFactory<EntityUnicorn>()
		{
			@Override
			public Render<? super EntityUnicorn> createRenderFor(RenderManager manager)
			{
				return new RenderUnicorn (manager);
			}
			
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBorderCollie.class, new IRenderFactory<EntityBorderCollie>()
		{
			@Override
			public Render<? super EntityBorderCollie> createRenderFor(RenderManager manager)
			{
				return new RenderBorderCollie (manager);
			}
			
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBomb.class, new IRenderFactory<EntityBomb>()
		{
			@Override
			public Render<? super EntityBomb> createRenderFor(RenderManager manager)
			{
				return new RenderBomb (manager);
			}
			
		});
		
	}


}
