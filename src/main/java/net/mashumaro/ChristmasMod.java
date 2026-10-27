package net.mashumaro;

import net.fabricmc.api.ModInitializer;

import net.mashumaro.item.ModItems;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChristmasMod implements ModInitializer {
	public static final String MOD_ID = "christmas-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
