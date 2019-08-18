package com.Cobble8.cryoaddons.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() 
	{
		GameRegistry.addSmelting(ModBlocks.CRYOSTEEL_ORE, new ItemStack(ModItems.CRYOSTEEL_INGOT, 1), 1.0f);
	}
}
