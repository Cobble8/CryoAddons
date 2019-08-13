package com.Cobble8.cryoaddons.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class CryoGlowstone extends BlockBase {

	public CryoGlowstone(String name, Material material, SoundType sound, float hardness) {
		super(name, material, sound, hardness);
		
		
	}
	
	@Override
	public int getLightValue(IBlockState state) {
	    return 15;
	}

}
