package net.astonikum.spark_engine.item;

import net.astonikum.spark_engine.SparkEngine;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ACTIVE_SCRIPTS_MONITOR = registerItem(String.valueOf(Text.translatable("item.spark_engine.active_scripts_monitor" )),
            new Item(new FabricItemSettings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SparkEngine.MOD_ID, name), item);
    }

    public static void registerModItems() {

    }
}