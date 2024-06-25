package net.astonikum.spark_engine;

import net.astonikum.spark_engine.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SparkEngine implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("spark_engine");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}