package net.astonikum.spark_engine.item;

import net.astonikum.spark_engine.SparkEngine;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SPARK_ENGINE_TAB = FabricItemGroupBuilder.build(new Identifier(SparkEngine.MOD_ID, "spark_engine_tab"),
            () -> new ItemStack(ModItems.AREAL_TRIGGER_EDITOR));
}
