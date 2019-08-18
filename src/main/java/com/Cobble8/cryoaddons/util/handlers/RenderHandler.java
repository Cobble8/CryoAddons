package com.Cobble8.cryoaddons.util.handlers;

import com.Cobble8.cryoaddons.entities.kitten.EntityKitten;
import com.Cobble8.cryoaddons.entities.kitten.RenderKitten;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderHandler {

	public static void registerEntityRenders() {
		
		RenderingRegistry.registerEntityRenderingHandler(EntityKitten.class, new IRenderFactory<EntityKitten>() {
			
			@Override
			public Render<? super EntityKitten> createRenderFor(RenderManager manager) {
				
				return new RenderKitten(manager);		
			}
		});
		
		
	}
}