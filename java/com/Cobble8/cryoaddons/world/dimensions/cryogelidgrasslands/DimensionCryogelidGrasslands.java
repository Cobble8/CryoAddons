package com.Cobble8.cryoaddons.world.dimensions.cryogelidgrasslands;

import com.Cobble8.cryoaddons.init.ModBiomes;
import com.Cobble8.cryoaddons.init.ModBlocks;
import com.Cobble8.cryoaddons.init.ModDimensions;

import net.minecraft.init.Blocks;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionCryogelidGrasslands extends WorldProvider {

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
		
		return new ChunkGeneratorCryogelidGrasslands();
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
