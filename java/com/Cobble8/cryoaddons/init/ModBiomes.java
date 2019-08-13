package com.Cobble8.cryoaddons.init;

import com.Cobble8.cryoaddons.world.biomes.BiomeCG;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBiomes 
{

	public static final Biome CG = new BiomeCG();

	public static void registerBiome()
	{
		System.out.println("Starting Cryogelid Grasslands loadup now...");
		initBiome(CG, "Cryogelid Grasslands", BiomeType.ICY, Type.PLAINS, Type.DRY);
		System.out.println("Finished Cryogelid Grasslands Types");
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Cryosteel Grasslands has been loaded!");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("Cryosteel Grasslands has been added!");
		return biome;
	}

}
