package net.astonikum.spark_engine.gui;
/*@Environment(EnvType.CLIENT)*/

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.MutableText;

public class ModMenuHub extends Screen {
    private final Screen parent;

    public ModMenuHub(Screen parent, MutableText translatable) {
        super(translatable);
        this.parent = parent;
    }

    @Override
    public void close() {
        client.setScreen(parent);
    }

    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        drawCenteredText(matrices, this.textRenderer, this.title, this.width / 2, 15, 16777215);
        super.render(matrices, mouseX, mouseY, delta);
    }
}