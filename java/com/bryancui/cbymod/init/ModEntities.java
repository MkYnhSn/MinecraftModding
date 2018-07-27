package com.bryancui.cbymod.init;

import com.bryancui.cbymod.Main;
import com.bryancui.cbymod.entity.EntityBomb;
import com.bryancui.cbymod.entity.EntityBorderCollie;
import com.bryancui.cbymod.entity.EntityUnicorn;
import com.bryancui.cbymod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities 
{
	
	public static void registryEntities()
	{
		registerEntity("unicorn", EntityUnicorn.class, Reference.ENTITY_UNICORN, 50, 4671546, 9274624);
		registerEntity("border_collie", EntityBorderCollie.class, Reference.ENTITY_BORDER_COLLIE, 50, 000000, 16777215);
		registerTNTEntity("nuclear_bomb", EntityBomb.class, Reference.ENTITY_BOMB);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
	
	private static void registerTNTEntity(String name, Class<? extends Entity> entity, int id)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, 51, Main.instance, 256, 1, false);
	}
	

}
