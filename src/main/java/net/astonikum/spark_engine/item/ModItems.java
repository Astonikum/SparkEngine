package net.astonikum.spark_engine.item;

import net.astonikum.spark_engine.SparkEngine;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ACTIVE_SCRIPTS_MONITOR = registerStandartItemWIthGroupSPARKENGINETAB("active_scripts_monitor",
            new FabricItemSettings().maxCount(1));

    public static final Item AREAL_TRIGGER_EDITOR = registerStandartItemWIthGroupSPARKENGINETAB("areal_trigger_editor",
            new FabricItemSettings().maxCount(1));

    public static final Item NPC_SPAWNER = registerStandartItemWIthGroupSPARKENGINETAB("npc_spawner",
            new FabricItemSettings().maxCount(1));

    public static final Item PATH_CREATOR = registerStandartItemWIthGroupSPARKENGINETAB("path_creator",
            new FabricItemSettings().maxCount(1));

    public static final Item UNIVERSAL_CUSTOMIZER = registerStandartItemWIthGroupSPARKENGINETAB("universal_customizer",
            new FabricItemSettings().maxCount(1));

    private static Item registerStandartItemWIthGroupSPARKENGINETAB(String name, FabricItemSettings settings) {
        return Registry.register(Registry.ITEM, new Identifier(SparkEngine.MOD_ID, name), new Item(settings.group(ModItemGroup.SPARK_ENGINE_TAB)));
    }

    public static void registerModItems() {

    }
}