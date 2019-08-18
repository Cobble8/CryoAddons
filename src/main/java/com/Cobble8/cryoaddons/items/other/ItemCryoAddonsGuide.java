package com.Cobble8.cryoaddons.items.other;

import com.Cobble8.cryoaddons.Main;
import com.Cobble8.cryoaddons.init.ModItems;
import com.Cobble8.cryoaddons.items.ItemBase;
import com.Cobble8.cryoaddons.util.Reference;
import com.Cobble8.cryoaddons.util.handlers.ConfigHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemCryoAddonsGuide extends ItemBase {

	public ItemCryoAddonsGuide(String name) {
		super(name);
		setCreativeTab(Main.CRYOADDONSTAB);
		//ModItems.ITEMS.add(this);
	}
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		playerIn.openGui(Main.instance, ConfigHandler.GUI_CRYOADDONS_GUIDE, worldIn, handIn == EnumHand.MAIN_HAND ? 1 : 0, 0, 0);
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}