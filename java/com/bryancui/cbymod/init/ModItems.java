package com.bryancui.cbymod.init;

import java.util.ArrayList;
import java.util.List;

import com.bryancui.cbymod.items.ItemBase;
import com.bryancui.cbymod.items.armor.ArmorBase;
import com.bryancui.cbymod.items.food.FoodBase;
import com.bryancui.cbymod.items.food.SeedBase;
import com.bryancui.cbymod.items.tools.FireGun;
import com.bryancui.cbymod.items.tools.Thor;
import com.bryancui.cbymod.items.tools.ToolPickaxe;
import com.bryancui.cbymod.items.tools.ToolSpade;
import com.bryancui.cbymod.items.tools.ToolSword;
import com.bryancui.cbymod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//material
	public static final ToolMaterial MATERIAL_CBY = EnumHelper.addToolMaterial("material_cby", 3, 1561, 4.0F, 4.0F, 10);
	public static final ToolMaterial MATERIAL_ULTIMATE = EnumHelper.addToolMaterial("material_ultimate", 3, 1561, 4.0F, 4.0F, 10);
	
	public static final ArmorMaterial ARMOR_MATERIAL_CBY =  EnumHelper.addArmorMaterial("armor_material_cby", Reference.MOD_ID + ":cby", 10, 
			new int [] {/*boots*/1, /*leggings*/5, /*chest plate*/3, /*helmet*/2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	
	//items
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item CBY = new ItemBase("cby");
	public static final Item URANIUM_INGOT = new ItemBase("uranium_ingot");
	
	//tools
	public static final ItemSword CBY_SWORD = new ToolSword("cby_sword", MATERIAL_CBY);
	//public static final ItemSpade CBY_SHOVEL = new ToolSpade("cby_shovel", MATERIAL_CBY);
	
	public static final ItemPickaxe ULTIMATE_PICKAXE = new ToolPickaxe("ultimate_pickaxe", MATERIAL_ULTIMATE);
	
	//armor
	public static final Item CBY_CHESTPLATE = new ArmorBase("cby_chestplate", ARMOR_MATERIAL_CBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item CBY_LEGGINGS = new ArmorBase("cby_leggings", ARMOR_MATERIAL_CBY, 2, EntityEquipmentSlot.LEGS);
	
	//food
	public static final Item BANANA= new FoodBase("banana", 2, false);
	public static final Item BANANA_SEED= new SeedBase("banana_seed", 1, false);
	
	public static final Item FIREGUN = new FireGun("firegun");
	public static final Item THOR = new Thor("thor", MATERIAL_ULTIMATE);

}
