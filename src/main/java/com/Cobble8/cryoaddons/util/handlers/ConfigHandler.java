package com.Cobble8.cryoaddons.util.handlers;

import java.io.File;

import com.Cobble8.cryoaddons.Main;
import com.Cobble8.cryoaddons.util.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler 
{
	//GUIs
	public static int GUI_CRYOSTEEL_GENERATOR = 1;
	public static int GUI_CRYOSTEEL_PRODUCER = 2;
	public static int GUI_CRYOADDONS_GUIDE = 3;
	
	//Entities
	public static int ENTITY_KITTEN = 120;
	
	//Dimensions
	public static int DIMENSION_CRYOGELID_GRASSLANDS = 3;
	
	//Biomes
	public static boolean BIOME_CRYOGELID_GRASSLANDS = true;
	
	//Config Stuff
	public static Configuration config;
	public static void init(File file) 
	{
		config = new Configuration(file);
		String category;
		category = "IDs";
		config.addCustomCategoryComment(category, "Set ID's for Entities, Dimensions, and GUIs.");
		ENTITY_KITTEN = config.getInt("Kitten Entity ID:", category, 250, 120, 999999999, "Set the ID of the Kitten entity here.");
		GUI_CRYOSTEEL_GENERATOR = config.getInt("Cryosteel Generator GUI ID:", category, 1, 0, 999999999, "Set the ID of the Cryosteel Generator GUI here.");
		GUI_CRYOSTEEL_PRODUCER = config.getInt("Cryosteel Producer GUI ID:", category, 2, 0, 999999999, "Set the ID of the Cryosteel Producer GUI here.");
		GUI_CRYOADDONS_GUIDE = config.getInt("CryoAddons Guide GUI ID:", category, 3, 0, 999999999, "Set the ID of the CryoAddons Guide GUI here.");
		DIMENSION_CRYOGELID_GRASSLANDS = config.getInt("Cryogelid Grasslands Dimension", category, 2, 2, 999999999, "Set the ID of the Cryogelid Grasslands Dimension Here");
		
		category = "Biomes";
		config.addCustomCategoryComment(category, "Set if you want biomes to spawn. True means they DO spawn and false means they don't. Obviously.");
		BIOME_CRYOGELID_GRASSLANDS = config.getBoolean("Cryogelid Grasslands Biome:", category, true, "Change this to false if you DON'T want this biome to spawn.");
		
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event) 
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), "config.cfg"));
	}
}
