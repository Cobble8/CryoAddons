package com.Cobble8.cryoaddons.init;

import java.util.ArrayList;
import java.util.List;

import com.Cobble8.cryoaddons.blocks.BlockBase;
import com.Cobble8.cryoaddons.blocks.CryoGlowstone;
import com.Cobble8.cryoaddons.blocks.CryoPortal;
import com.Cobble8.cryoaddons.blocks.CryosteelOre;
import com.Cobble8.cryoaddons.blocks.machines.BlockCryosteelGenerator;
import com.Cobble8.cryoaddons.blocks.machines.BlockCryosteelProducer;
import com.Cobble8.cryoaddons.blocks.other.fence.CryogelidFence;
import com.Cobble8.cryoaddons.blocks.other.fence.CryogelidFenceGate;
import com.Cobble8.cryoaddons.blocks.other.slabs.CryogelidDoubleSlab;
import com.Cobble8.cryoaddons.blocks.other.slabs.CryogelidHalfSlab;
import com.Cobble8.cryoaddons.blocks.trees.CryogelidLeaves;
import com.Cobble8.cryoaddons.blocks.trees.CryogelidLog;
import com.Cobble8.cryoaddons.blocks.trees.CryogelidSapling;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class ModBlocks 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block CRYOSTEEL_BLOCK = new BlockBase("cryosteel_block", Material.IRON, SoundType.METAL, 9F);
	
	public static final Block CRYOSTEEL_ORE = new CryosteelOre("ore_overworld_cryosteel",  Material.IRON, SoundType.STONE, 8F);
	
	public static final Block CG_CRYOSTEEL_ORE = new CryosteelOre("ore_cg_cryosteel", Material.IRON, SoundType.GLASS, 8F);
	
	public static final Block CRYOGELID_GRASS = new BlockBase("cryogelid_grass", Material.GROUND, SoundType.PLANT, 0.6F);
	
	public static final Block CRYOGELID_LOG = new CryogelidLog("cryogelid_log");
	
	public static final Block CRYOGELID_PLANKS = new BlockBase("cryogelid_planks", Material.WOOD, SoundType.WOOD, 0.6F);
	
	public static final BlockSlab CRYOGELID_SLAB_HALF = new CryogelidHalfSlab("cryogelid_slab", Material.WOOD, SoundType.WOOD, 0.6F, ModBlocks.CRYOGELID_SLAB_HALF, ModBlocks.CRYOGELID_DOUBLE_HALF);
	
	public static final BlockSlab CRYOGELID_DOUBLE_HALF = new CryogelidDoubleSlab("cryogelid_slab_double", Material.WOOD, SoundType.WOOD, 0.6F, ModBlocks.CRYOGELID_SLAB_HALF);
	
	public static final BlockFence CRYOGELID_FENCE = new CryogelidFence("cryogelid_fence", 0.6F, 10F, SoundType.WOOD);
	
	public static final BlockHorizontal CRYOGELID_GATE = new CryogelidFenceGate("cryogelid_fence_gate", 0.6F, SoundType.WOOD, 0);
	
	public static final Block CRYOGELID_LEAVES = new CryogelidLeaves("cryogelid_leaves");
	
	public static final Block CRYOGELID_SAPLING = new CryogelidSapling("cryogelid_sapling");
	
	public static final Block CRYO_GLOWSTONE = new CryoGlowstone("cryo_glowstone", Material.GLASS, SoundType.GLASS, 0.3F);
	
	public static final Block CRYO_PORTAL = new CryoPortal("cryo_portal", Material.IRON, SoundType.STONE, 7F);
	
	public static final Block CRYOSTEEL_GENERATOR = new BlockCryosteelGenerator("cryosteel_generator");
	
	public static final Block CRYOSTEEL_PRODUCER = new BlockCryosteelProducer("cryosteel_producer");
	
	// GIVE CRYOSTEEL PRODUCER A TEXTURE BEFORE UNCOMMENTING THIS!
	
	
}
