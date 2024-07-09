package net.astonikum.spark_engine.gui;
/*@Environment(EnvType.CLIENT)*/

import net.astonikum.spark_engine.gui.core.IconButtonWidget;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModMenuHub extends Screen {
    private final Screen parent;
    private static final Identifier ICON_TEXTURE = new Identifier("spark_engine", "/gui/settings-logo.png");

    public ModMenuHub(Screen parent, MutableText translatable) {
        super(translatable);
        this.parent = parent;
    }

    @Override
    public void close() {
        client.setScreen(parent);
    }

    @Override
    public void init() {
        //client.setScreen(new CodeEditor(Text.of("SCRIPTS EDITOR"), this, "untitled"));
        this.addDrawableChild(new IconButtonWidget(this.width / 2 - 180, this.height / 6 + 120 - 6, 20, 20, (button) -> {
            MinecraftClient.getInstance().setScreen(new CodeEditor("SCRIPTS EDITOR", this, "untitled"));
        }, ICON_TEXTURE));
    }

    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        drawCenteredText(matrices, this.textRenderer, this.title, this.width / 2, 15, 16777215);
        super.render(matrices, mouseX, mouseY, delta);
    }
}