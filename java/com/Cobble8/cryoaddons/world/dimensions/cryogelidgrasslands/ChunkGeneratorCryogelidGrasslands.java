package com.Cobble8.cryoaddons.world.dimensions.cryogelidgrasslands;

import java.util.List;
import java.util.Random;

import com.Cobble8.cryoaddons.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class ChunkGeneratorCryogelidGrasslands implements IChunkGenerator {
    
    
	public Chunk generateChunk(int x, int z) {
		ChunkPrimer chunkprimer = new ChunkPrimer();
		for(int i = 1; i < 16; i++) {
			 int a = i;
			for(int j = 1; j < 16; j++) {
				int c = j;
				for(int l = 1; l < 30; l++) {
					int b = l;
					
					chunkprimer.setBlockState(a, b, c, (IBlockState) Blocks.STONE);
					
				}
			}
		}
		chunkprimer.setBlockState(0, 29, 0, (IBlockState) ModBlocks.CRYOSTEEL_BLOCK);
		return null;
		
	}

	@Override
	public void populate(int x, int z) {
		
		
	}

	@Override
	public boolean generateStructures(Chunk chunkIn, int x, int z) {
		
		return false;
	}

	@Override
	public List<SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
		
		return null;
	}

	@Override
	public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position, boolean findUnexplored) {
		
		return null;
	}

	@Override
	public void recreateStructures(Chunk chunkIn, int x, int z) {
		
		
	}

	@Override
	public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos) {
		
		return false;
	}
	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.getDimension() == 2) {
			
		}
	}


}
