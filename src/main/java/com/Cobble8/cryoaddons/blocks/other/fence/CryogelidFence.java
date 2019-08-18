package com.Cobble8.cryoaddons.blocks.other.fence;

import com.Cobble8.cryoaddons.Main;
import com.Cobble8.cryoaddons.init.ModBlocks;
import com.Cobble8.cryoaddons.init.ModItems;
import com.Cobble8.cryoaddons.util.interfaces.IHasModel;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class CryogelidFence extends BlockFence implements IHasModel
{

	public CryogelidFence(String name, float hardness, float resistance, SoundType sound) 
	{
		super(Material.WOOD, Material.WOOD.getMaterialMapColor());
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setSoundType(sound);
		this.setCreativeTab(Main.CRYOADDONSTAB);
		this.useNeighborBrightness = true;
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	

}
