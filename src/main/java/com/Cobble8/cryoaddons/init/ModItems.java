package com.Cobble8.cryoaddons.init;

import java.util.ArrayList;
import java.util.List;

import com.Cobble8.cryoaddons.items.ItemBase;
import com.Cobble8.cryoaddons.items.armor.ArmorBase;
import com.Cobble8.cryoaddons.items.other.ItemCryoAddonsGuide;
import com.Cobble8.cryoaddons.items.tools.ToolAxe;
import com.Cobble8.cryoaddons.items.tools.ToolHoe;
import com.Cobble8.cryoaddons.items.tools.ToolPickaxe;
import com.Cobble8.cryoaddons.items.tools.ToolSpade;
import com.Cobble8.cryoaddons.items.tools.ToolSword;
import com.Cobble8.cryoaddons.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	//Materials
	public static final ToolMaterial MATERIAL_CRYOSTEEL = EnumHelper.addToolMaterial("material_cryosteel", 3, 2500, 10.0F, 4.0F, 22);
	public static final ArmorMaterial ARMOR_MATERIAL_CRYOSTEEL = EnumHelper.addArmorMaterial("armor_material_cryosteel", Reference.MOD_ID + ":cryosteel", 17, 
			new int[] {4, 10, 7, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//Tools
	public static final ItemSword CRYOSTEEL_SWORD = new ToolSword("cryosteel_sword", MATERIAL_CRYOSTEEL);
	public static final ItemSpade CRYOSTEEL_SHOVEL = new ToolSpade("cryosteel_shovel", MATERIAL_CRYOSTEEL);
	public static final ItemPickaxe CRYOSTEEL_PICKAXE = new ToolPickaxe("cryosteel_pickaxe", MATERIAL_CRYOSTEEL);
	public static final ItemAxe CRYOSTEEL_AXE = new ToolAxe("cryosteel_axe", MATERIAL_CRYOSTEEL);
	public static final ItemHoe CRYOSTEEL_HOE = new ToolHoe("cryosteel_hoe", MATERIAL_CRYOSTEEL);
	
	
	//Armor
	public static final Item CRYOSTEEL_HELMET = new ArmorBase("cryosteel_helmet", ARMOR_MATERIAL_CRYOSTEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item CRYOSTEEL_CHESTPLATE = new ArmorBase("cryosteel_chestplate", ARMOR_MATERIAL_CRYOSTEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item CRYOSTEEL_LEGGINGS = new ArmorBase("cryosteel_leggings", ARMOR_MATERIAL_CRYOSTEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item CRYOSTEEL_BOOTS = new ArmorBase("cryosteel_boots", ARMOR_MATERIAL_CRYOSTEEL, 1, EntityEquipmentSlot.FEET);
	
	//Items
	public static final Item CRYOSTEEL_NUGGET = new ItemBase("cryosteel_nugget");
	public static final Item CRYOSTEEL_INGOT = new ItemBase("cryosteel_ingot");
	public static final Item RAW_CRYOSTEEL = new ItemBase("raw_cryosteel");
	public static final Item CRYOADDONS_GUIDE = new ItemCryoAddonsGuide("cryoaddons_guide");
	
	//Threatening Messages
	public static final Item THREAT_1 = new ItemBase("threat_1");
	public static final Item THREAT_2 = new ItemBase("threat_2");
	public static final Item THREAT_3 = new ItemBase("threat_3");
	public static final Item THREAT_4 = new ItemBase("threat_4");
	public static final Item THREAT_5 = new ItemBase("threat_5");
	
}
