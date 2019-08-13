package com.Cobble8.cryoaddons.world.biomes;

import com.Cobble8.cryoaddons.init.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeCG extends Biome 
{
	
	public BiomeCG()
	{
		super(new BiomeProperties("Cryogelid Grasslands").setBaseHeight(0.125F).setHeightVariation(0.07F).setTemperature(0.6F).setRainDisabled().setWaterColor(8619007));
		topBlock = ModBlocks.CRYOGELID_GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		this.decorator.diamondGen = new WorldGenMinable(ModBlocks.CRYOSTEEL_ORE.getDefaultState(), 3);
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
	}
}
