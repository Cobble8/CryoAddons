package com.Cobble8.cryoaddons.util.handlers;

import com.Cobble8.cryoaddons.blocks.gui.GUICryoAddonsGuide;
import com.Cobble8.cryoaddons.blocks.gui.GUICryosteelGenerator;
import com.Cobble8.cryoaddons.blocks.gui.GUICryosteelProducer;
import com.Cobble8.cryoaddons.blocks.tileentity.TileEntityCryosteelGenerator;
import com.Cobble8.cryoaddons.blocks.tileentity.TileEntityCryosteelProducer;
import com.Cobble8.cryoaddons.blocks.container.ContainerCryosteelGenerator;
import com.Cobble8.cryoaddons.blocks.container.ContainerCryosteelProducer;
import com.Cobble8.cryoaddons.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_CRYOSTEEL_GENERATOR) return new ContainerCryosteelGenerator(player.inventory, (TileEntityCryosteelGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.GUI_CRYOSTEEL_PRODUCER) return new ContainerCryosteelProducer(player.inventory, (TileEntityCryosteelProducer)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_CRYOSTEEL_GENERATOR) return new GUICryosteelGenerator(player.inventory, (TileEntityCryosteelGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.GUI_CRYOSTEEL_PRODUCER) return new GUICryosteelProducer(player.inventory, (TileEntityCryosteelProducer)world.getTileEntity(new BlockPos(x,y,z)));
		
		if(ID == Reference.GUI_CRYOADDONS_GUIDE) { 
			EnumHand hand = x == 1 ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND; 
			return new GUICryoAddonsGuide(player.getHeldItem(hand)); 
		}
		return null;
	}
}
