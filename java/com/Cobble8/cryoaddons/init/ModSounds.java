package com.Cobble8.cryoaddons.init;

import com.Cobble8.cryoaddons.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSounds {
	
	public static final SoundEvent BOOK_CLOSE = registerSound("item.bookclose");;
	public static final SoundEvent BOOK_OPEN = registerSound("item.bookopen");;
	public static final SoundEvent PAGE_FLIP = registerSound("item.pageflip");;




	
	
	
	public static SoundEvent registerSound(String name) {
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
