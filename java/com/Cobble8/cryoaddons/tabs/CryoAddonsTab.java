package com.Cobble8.cryoaddons.tabs;

import com.Cobble8.cryoaddons.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CryoAddonsTab extends CreativeTabs {
	
	public CryoAddonsTab(String label) {
		
		super("cryoaddonstab");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ModItems.CRYOSTEEL_INGOT);
	}
}
