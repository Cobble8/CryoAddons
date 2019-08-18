package com.Cobble8.cryoaddons.blocks;

import com.Cobble8.cryoaddons.Main;
import com.Cobble8.cryoaddons.init.ModBlocks;
import com.Cobble8.cryoaddons.init.ModItems;
import com.Cobble8.cryoaddons.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material, SoundType sound, float hardness)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.CRYOADDONSTAB);
		setSoundType(sound);
		setHardness(hardness);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
