package com.Cobble8.cryoaddons.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CryosteelOre extends BlockBase {
	public CryosteelOre(String name, Material material, SoundType sound, float hardness) {
		super(name, material, sound, hardness);
		setResistance(15F);
		setHarvestLevel("pickaxe", 3);
	}
	
}
