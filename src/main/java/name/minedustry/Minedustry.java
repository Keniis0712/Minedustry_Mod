package name.minedustry;

import name.minedustry.item.MinedustryItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Minedustry implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("minedustry");
	public static final String MOD_ID = "minedustry";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Mod start");

		MinedustryItems.registerModItems();

		LOGGER.info("Mod initial finish");
	}
}