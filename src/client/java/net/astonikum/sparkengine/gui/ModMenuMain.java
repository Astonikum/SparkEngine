package net.astonikum.sparkengine.gui;
/*@Environment(EnvType.CLIENT)*/

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.MutableText;

public class ModMenuMain extends Screen {
    private final Screen parent;

    public ModMenuMain(Screen parent, MutableText translatable) {
        super(translatable);
        this.parent = parent;
    }

}