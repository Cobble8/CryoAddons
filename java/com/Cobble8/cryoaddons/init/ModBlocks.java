package com.Cobble8.cryoaddons.init;

import java.util.ArrayList;
import java.util.List;

import com.Cobble8.cryoaddons.blocks.BlockBase;
import com.Cobble8.cryoaddons.blocks.CryoGlowstone;
import com.Cobble8.cryoaddons.blocks.CryoPortal;
import com.Cobble8.cryoaddons.blocks.CryosteelOre;
import com.Cobble8.cryoaddons.blocks.machines.BlockCryosteelGenerator;
import com.Cobble8.cryoaddons.blocks.machines.BlockCryosteelProducer;
import com.Cobble8.cryoaddons.energy.CustomEnergyStorage;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class ModBlocks 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block CRYOSTEEL_BLOCK = new BlockBase("cryosteel_block", Material.IRON, SoundType.METAL, 9F);
	
	public static final Block CRYOSTEEL_ORE = new CryosteelOre("cryosteel_ore", Material.IRON, SoundType.STONE, 8F);
	
	public static final Block CRYOGELID_GRASS = new BlockBase("cryogelid_grass", Material.GROUND, SoundType.PLANT, 0.6F);
	
	public static final Block CRYO_GLOWSTONE = new CryoGlowstone("cryo_glowstone", Material.GLASS, SoundType.GLASS, 0.3F);
	
	public static final Block CRYO_PORTAL = new CryoPortal("cryo_portal", Material.IRON, SoundType.STONE, 7F);
	
	public static final Block CRYOSTEEL_GENERATOR = new BlockCryosteelGenerator("cryosteel_generator");
	
	//public static final Block CRYOSTEEL_PRODUCER = new BlockCryosteelProducer("cryosteel_producer");
	
	// GIVE CRYOSTEEL PRODUCER A TEXTURE BEFORE UNCOMMENTING THIS!
	
	
}
