package com.Cobble8.cryoaddons.util.handlers;

import com.Cobble8.cryoaddons.Main;
import com.Cobble8.cryoaddons.commands.CommandTeleportDimension;
import com.Cobble8.cryoaddons.init.ModBiomes;
import com.Cobble8.cryoaddons.init.ModBlocks;
import com.Cobble8.cryoaddons.init.ModDimensions;
import com.Cobble8.cryoaddons.init.ModEntities;
import com.Cobble8.cryoaddons.init.ModItems;
import com.Cobble8.cryoaddons.init.ModRecipes;
import com.Cobble8.cryoaddons.util.interfaces.IHasModel;
import com.Cobble8.cryoaddons.world.worldgen.ModWorldGen;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
	@SideOnly(Side.CLIENT)
	public static void onModelRegister(ModelRegistryEvent event)
	{
		ModEntities.registerEntities();
		RenderHandler.registerEntityRenders();
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

	public static void preInitRegistries(FMLPreInitializationEvent event) {
		
		System.out.println("Starting CryoAddons PreInit Registries");
		ModBiomes.registerBiome();
		ModDimensions.registerDimensions();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		ConfigHandler.registerConfig(event);
		System.out.println("Finished CryoAddons PreInit Registries Successfully");
	}
	public static void initRegistries(FMLInitializationEvent event) {
		System.out.println("Starting CryoAddons Init Registries");
		ModRecipes.init();
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GUIHandler());
		System.out.println("Finished CryoAddons Init Registries Successfully");
		
	}
	
	public static void postInitRegistries(FMLPostInitializationEvent event) {
		
		
	}
	
	public static void serverRegistries(FMLServerStartingEvent event) {
		System.out.println("Starting CryoAddons Server Registries");
		event.registerServerCommand(new CommandTeleportDimension());
		System.out.println("Finished CryoAddons Server Registries Successfully");
	}
	
}