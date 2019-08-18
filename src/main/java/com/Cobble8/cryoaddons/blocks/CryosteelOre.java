package com.Cobble8.cryoaddons.blocks;

import com.Cobble8.cryoaddons.Main;
import com.Cobble8.cryoaddons.init.ModBlocks;
import com.Cobble8.cryoaddons.init.ModItems;
import com.Cobble8.cryoaddons.util.handlers.EnumHandler;
import com.Cobble8.cryoaddons.util.handlers.EnumHandler.EnumType;
import com.Cobble8.cryoaddons.util.interfaces.IMetaName;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class CryosteelOre extends BlockBase {
	public CryosteelOre(String name, Material material, SoundType sound, float hardness) {
		super(name, material, sound, hardness);
		setResistance(15F);
		setHarvestLevel("pickaxe", 3);

	}
	
}
