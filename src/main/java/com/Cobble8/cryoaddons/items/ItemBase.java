package com.Cobble8.cryoaddons.items;

import com.Cobble8.cryoaddons.Main;
import com.Cobble8.cryoaddons.init.ModItems;
import com.Cobble8.cryoaddons.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.CRYOADDONSTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
