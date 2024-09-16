package net.west.realmmmomod;

import net.fabricmc.api.ModInitializer;

import net.west.realmmmomod.block.ModBlocks;
import net.west.realmmmomod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class RealmmmoMod implements ModInitializer {
	public static final String MOD_ID = "realmmmomod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();







	}
}