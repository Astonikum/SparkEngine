package net.astonikum.spark_engine.gui;

import net.minecraft.client.font.FontStorage;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.EditBox;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Function;
import java.util.stream.Stream;

public class CodeEditor extends Screen {
    private String scriptName;
    private Screen parent;

    public CodeEditor(String title, Screen parent, String scriptName) {
        super(Text.of(title + " - " + scriptName));
        this.parent = parent;
        this.scriptName = scriptName;
    }

    EditBox editBox = new EditBox(new TextRenderer(new Function< Identifier, FontStorage >), this.width);

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