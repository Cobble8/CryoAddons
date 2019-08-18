package com.Cobble8.cryoaddons.blocks.other.slabs;

import com.Cobble8.cryoaddons.init.ModBlocks;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CryogelidDoubleSlab extends CryogelidSlab
{


	public CryogelidDoubleSlab(String name, Material material, SoundType sound, float hardness, BlockSlab half) {
		super(name, material, half);
		ModBlocks.BLOCKS.add(this);
	}

	@Override
	public boolean isDouble() 
	{	
		return true;
	}
}
