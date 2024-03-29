package com.Cobble8.cryoaddons.blocks.tileentity;
import com.Cobble8.cryoaddons.energy.CustomEnergyStorage;
import com.Cobble8.cryoaddons.init.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityCryosteelProducer extends TileEntity implements ITickable
{
	public ItemStackHandler handler = new ItemStackHandler(1);
	public ItemStack cryosteelNugget = new ItemStack(ModItems.RAW_CRYOSTEEL, 1);
	private CustomEnergyStorage storage = new CustomEnergyStorage(100000, 0, 20);
	public int energy = storage.getEnergyStored();
	private String customName;
	public int cookTime;
	
	@Override
	public void update() 
	{
		if(energy < 100000 & handler.getStackInSlot(0).getCount() < 64 & energy >= 0) {
			
				cookTime++;
				if(cookTime == 190)
					{
					//energy -= getFuelValue(handler.getStackInSlot(0));
					if(handler.getStackInSlot(0).getCount() > 0)
					{
						handler.getStackInSlot(0).grow(1);
					}
					
					else
					{
						handler.insertItem(0, cryosteelNugget, false);
					}
					cookTime = 0;
					if(energy > 100000) energy = 100000;
					
				}
			
		}
		if(handler.getStackInSlot(0).getCount() > 64) {
			handler.getStackInSlot(0).setCount(64);
		}
	}
		

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) 
	{
		if(capability == CapabilityEnergy.ENERGY) return (T)this.storage;
		if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return (T)this.handler;
		return super.getCapability(capability, facing);
	}
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) 
	{
		if(capability == CapabilityEnergy.ENERGY) return true;
		if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return true;
		return super.hasCapability(capability, facing);
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) 
	{
		super.writeToNBT(compound);
		compound.setTag("Inventory", this.handler.serializeNBT());
		compound.setInteger("CookTime", this.cookTime);
		compound.setInteger("GuiEnergy", this.energy);
		compound.setString("Name", getDisplayName().toString());
		this.storage.writeToNBT(compound);
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) 
	{
		super.readFromNBT(compound);
		this.handler.deserializeNBT(compound.getCompoundTag("Inventory"));
		this.cookTime = compound.getInteger("CookTime");
		this.energy = compound.getInteger("GuiEnergy");
		this.customName = compound.getString("Name");
		this.storage.readFromNBT(compound);
	}
	
	@Override
	public ITextComponent getDisplayName()
	{
		return new TextComponentTranslation("container.cryosteel_producer");
	}
	
	public int getEnergyStored()
	{
		return this.energy;
	}
	
	public int getMaxEnergyStored()
	{
		return this.storage.getMaxEnergyStored();
	}
	
	public int getField(int id)
	{
		switch(id)
		{
		case 0:
			return this.energy;
		case 1:
			return this.cookTime;
		default:
			return 0;
		}
	}
	
	public void setField(int id, int value)
	{
		switch(id)
		{
		case 0:
			this.energy = value;
		case 1:
			this.cookTime = value;
		}
	}
	
	public boolean isUsableByPlayer(EntityPlayer player) 
	{
		return this.world.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
	}		
}