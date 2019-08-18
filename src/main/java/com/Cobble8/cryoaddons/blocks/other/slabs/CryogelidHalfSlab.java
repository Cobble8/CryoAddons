package com.Cobble8.cryoaddons.blocks.other.slabs;

import com.Cobble8.cryoaddons.init.ModBlocks;
import com.Cobble8.cryoaddons.init.ModItems;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class CryogelidHalfSlab extends CryogelidSlab
{


	public CryogelidHalfSlab(String name, Material material, SoundType sound, float hardness, BlockSlab half, BlockSlab doubleSlab) {
		super(name, material, half);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public boolean isDouble() 
	{	
		return false;
	}
}
