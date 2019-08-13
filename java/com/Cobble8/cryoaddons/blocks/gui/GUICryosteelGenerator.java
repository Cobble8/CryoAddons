package com.Cobble8.cryoaddons.blocks.gui;

import com.Cobble8.cryoaddons.blocks.container.ContainerCryosteelGenerator;
import com.Cobble8.cryoaddons.blocks.tileentity.TileEntityCryosteelGenerator;
import com.Cobble8.cryoaddons.util.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GUICryosteelGenerator extends GuiContainer
{


	private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/gui/container/cryosteel_generator.png");
	private final InventoryPlayer player;
	private final TileEntityCryosteelGenerator tileentity;
	
	public GUICryosteelGenerator(InventoryPlayer player, TileEntityCryosteelGenerator tileentity) 
	{
		super(new ContainerCryosteelGenerator(player, tileentity));
		this.player = player;
		this.tileentity = tileentity;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
	{
		String tileName = this.tileentity.getDisplayName().getUnformattedText();
		this.fontRenderer.drawString(tileName, (this.xSize / 2 - this.fontRenderer.getStringWidth(tileName) / 2) -5, 6, 4210752);
		this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 7, this.ySize - 96 + 2, 4210752);
		this.fontRenderer.drawString(Integer.toString(this.tileentity.getEnergyStored()) + " RF", 115, 72, 4210752);
		//this.fontRenderer.drawString(Integer.toString(rtpf + " RF/t", 115, 82, 4210752);
		

	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(TEXTURES);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		
		int l = this.getCookProgressScaled(20);
		this.drawTexturedModalRect(this.guiLeft + 81, this.guiTop + 22, 176, 0, 16, 16 - l);
		
		int k = this.getEnergyStoredScaled(58);
		this.drawTexturedModalRect(this.guiLeft + 8, this.guiTop + 9, 176, 31, 16, 58 - k);
	}
	
	private int getEnergyStoredScaled(int pixels)
	{
		int i = this.tileentity.getEnergyStored();
		int j = this.tileentity.getMaxEnergyStored();
		return i != 0 && j != 0 ? i * pixels / j : 0; 
	}
	
	private int getCookProgressScaled(int pixels)
	{
		int i = this.tileentity.cookTime;
		return i != 0 ? i * pixels / 25 : 0;
	}
}