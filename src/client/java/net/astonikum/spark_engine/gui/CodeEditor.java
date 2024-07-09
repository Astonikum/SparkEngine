package net.astonikum.spark_engine.gui;

import net.minecraft.client.font.FontStorage;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.widget.*;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TexturedButtonWidget;
import net.minecraft.client.gui.widget.EditBoxWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;


public class CodeEditor extends Screen {
    private String scriptName;
    private Screen parent;

    private EditBoxWidget codeBox;

    public CodeEditor(String title, Screen parent, String scriptName) {
        super(Text.of(title + " - " + scriptName));
        this.parent = parent;
        this.scriptName = scriptName;
    }

    @Override
    public void init() {
        super.init();



        //TexturedButtonWidget saveButton = new TexturedButtonWidget(10, 115, 16, 16, 0, 0, 1, new Identifier("spark_engine", "/gui/settings-logo.png"), 16, 16, (button) -> {});
        //this.addDrawableChild(saveButton);

        EditBoxWidget codeEditor = new EditBoxWidget(this.textRenderer, 5, 5 + 8, this.width - (5 * 3 + 16), this.height - (5 * 2 + 8), Text.of("&c-- write your lua here"), Text.of(""));
        this.addDrawableChild(codeEditor);
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