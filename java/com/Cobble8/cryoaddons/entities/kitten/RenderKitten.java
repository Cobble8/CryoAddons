package com.Cobble8.cryoaddons.entities.kitten;

import com.Cobble8.cryoaddons.util.Reference;
import com.Cobble8.cryoaddons.entities.kitten.EntityKitten;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderKitten extends RenderLiving<EntityKitten>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID + ":textures/entities/kitten.png");
	
	public RenderKitten(RenderManager manager) 
	{
		super(manager, new ModelKitten(), 0.2f);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityKitten entity) {
		
		return TEXTURE;
	}
}
