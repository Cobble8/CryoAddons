package com.Cobble8.cryoaddons.util.handlers;

import com.Cobble8.cryoaddons.Main;
import com.Cobble8.cryoaddons.commands.CommandTeleportDimension;
import com.Cobble8.cryoaddons.init.ModBiomes;
import com.Cobble8.cryoaddons.init.ModBlocks;
import com.Cobble8.cryoaddons.init.ModDimensions;
import com.Cobble8.cryoaddons.init.ModEntities;
import com.Cobble8.cryoaddons.init.ModItems;
import com.Cobble8.cryoaddons.init.ModRecipes;
import com.Cobble8.cryoaddons.util.IHasModel;
import com.Cobble8.cryoaddons.world.worldgen.ModWorldGen;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}

	public static void preInitRegistries() {
		
		System.out.println("Starting Cryogelid Grasslands loadup now...");
		ModBiomes.registerBiome();
		ModDimensions.registerDimensions();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		ModEntities.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	public static void initRegistries() {
		
		ModRecipes.init();
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GUIHandler());
		
	}
	
	public static void postInitRegistries() {
		
		
	}
	
	public static void serverRegistries(FMLServerStartingEvent event) {
		
		event.registerServerCommand(new CommandTeleportDimension());
	}
	
}