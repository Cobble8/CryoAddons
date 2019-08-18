package com.Cobble8.cryoaddons.world.dimensions.cryogelidgrasslands;

import com.Cobble8.cryoaddons.init.ModBiomes;
import com.Cobble8.cryoaddons.init.ModBlocks;
import com.Cobble8.cryoaddons.init.ModDimensions;
import com.Cobble8.cryoaddons.util.Reference;

import net.minecraft.init.Blocks;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextOverworld;

public class DimensionCryogelidGrasslands extends WorldProvider {
	
	ContextOverworld ctx;
	public DimensionCryogelidGrasslands() {
		
		this.biomeProvider = new BiomeProviderSingle(ModBiomes.CG);
		this.hasSkyLight = true;
	}
	
	@Override
	public DimensionType getDimensionType() {
		
		return ModDimensions.CRYOGELID_GRASSLANDS;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() {
		
		return new ChunkGeneratorCryogelidGrasslands(world, true, 2);
	}
	
	@Override
	public boolean canRespawnHere() {
		
		return false;
	}
	@Override
	public boolean isSurfaceWorld() {
		
		return false;
	}
}
