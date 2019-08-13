package com.Cobble8.cryoaddons.init;

import com.Cobble8.cryoaddons.Main;
import com.Cobble8.cryoaddons.entities.kitten.EntityKitten;
import com.Cobble8.cryoaddons.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	
	public static void registerEntities() {
		
		registerEntity("kitten", EntityKitten.class, Reference.ENTITY_KITTEN, 20, 1315860, 15132390);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
	
	private static void nonMobEntity() {
		
	}
}
