package net.astonikum.spark_engine;

import net.astonikum.spark_engine.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SparkEngine implements ModInitializer {
	public static final String MOD_ID = "spark_engine";
    public static final Logger LOGGER = LoggerFactory.getLogger("spark_engine");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}