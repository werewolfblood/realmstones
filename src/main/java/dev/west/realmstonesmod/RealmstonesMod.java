package dev.west.realmstonesmod;

import dev.west.realmstonesmod.block.InitBlocks;


import dev.west.realmstonesmod.item.InitItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealmstonesMod implements ModInitializer {
	public static final String MOD_ID = "realmstonesmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		InitBlocks.registerModBlocks();
		InitItems.registerModItems();





		LOGGER.info("Hello Fabric world!");


	}
}