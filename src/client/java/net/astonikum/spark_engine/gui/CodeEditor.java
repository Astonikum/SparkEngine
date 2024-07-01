package net.astonikum.spark_engine.gui;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.EditBox;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

import java.util.stream.Stream;

public class CodeEditor extends Screen {
    private final String scriptName;
    private final Screen parent;

    protected CodeEditor(String title, Screen parent, String scriptName) {
        super(Text.of(title + " - " + scriptName));
        this.parent = parent;
        this.scriptName = scriptName;
    }

    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        drawCenteredText(matrices, this.textRenderer, this.title, this.width / 2, 15, 16777215);
        super.render(matrices, mouseX, mouseY, delta);
    }

    @Override
    public void close() {
        client.setScreen(parent);
    }
}