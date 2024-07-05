package net.astonikum.spark_engine.gui.core;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class IconButtonWidget extends ButtonWidget {
    private final Identifier icon;

    public IconButtonWidget(int x, int y, int width, int height, PressAction onPress, Identifier icon) {
        super(x, y, width, height, Text.literal(""), onPress); // Пустой текст
        this.icon = icon;
    }

    @Override
    public void renderButton(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.renderButton(matrices, mouseX, mouseY, delta);
        MinecraftClient.getInstance().getTextureManager().bindTexture(icon);
        drawTexture(matrices, this.x + 2, this.y + 2, 0, 0, 16, 16, 16, 16);
    }
}