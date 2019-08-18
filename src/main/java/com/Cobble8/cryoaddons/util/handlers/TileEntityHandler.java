package com.Cobble8.cryoaddons.util.handlers;

import com.Cobble8.cryoaddons.blocks.tileentity.TileEntityCryosteelGenerator;
import com.Cobble8.cryoaddons.blocks.tileentity.TileEntityCryosteelProducer;
import com.Cobble8.cryoaddons.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityCryosteelGenerator.class, new ResourceLocation(Reference.MOD_ID + ":cryosteel_generator"));
		GameRegistry.registerTileEntity(TileEntityCryosteelProducer.class, new ResourceLocation(Reference.MOD_ID + ":cryosteel_producer"));
	}
}
