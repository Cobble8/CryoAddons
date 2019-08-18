package com.Cobble8.cryoaddons.init;

import com.Cobble8.cryoaddons.util.Reference;
import com.Cobble8.cryoaddons.util.handlers.ConfigHandler;
import com.Cobble8.cryoaddons.world.dimensions.cryogelidgrasslands.DimensionCryogelidGrasslands;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class ModDimensions {
	
	public static final DimensionType CRYOGELID_GRASSLANDS = DimensionType.register("Cryogelid Grasslands", "_cryogelid grasslands", ConfigHandler.DIMENSION_CRYOGELID_GRASSLANDS, DimensionCryogelidGrasslands.class, false);
	
	public static void registerDimensions() {
		
		DimensionManager.registerDimension(ConfigHandler.DIMENSION_CRYOGELID_GRASSLANDS, CRYOGELID_GRASSLANDS);
	}
	
	
	
	
	
	
	
}
