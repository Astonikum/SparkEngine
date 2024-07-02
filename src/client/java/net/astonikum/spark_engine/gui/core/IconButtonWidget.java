package net.astonikum.spark_engine.gui.core;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class IconButtonWidget extends ButtonWidget {
    public IconButtonWidget(int x, int y, int width, int height, Text message, PressAction onPress) {
        super(x, y, width, height, message, onPress);
    }
//    private final ResourceLocation iconTexture;
//    private final int iconU;
//    private final int iconV;
//    private final int iconWidth;
//    private final int iconHeight;
//
//    public IconButtonWidget(int x, int y, int width, int height, Component message, ResourceLocation iconTexture, int iconU, int iconV, int iconWidth, int iconHeight, OnPress onPress) {
//        super(x, y, width, height, message, onPress);
//        this.iconTexture = iconTexture;
//        this.iconU = iconU;
//        this.iconV = iconV;
//        this.iconWidth = iconWidth;
//        this.iconHeight = iconHeight;
//    }
//
//    @override
//    public void renderButton(PoseStack matrices, int mouseX, int mouseY, float delta) {
//        super.renderButton(matrices, mouseX, mouseY, delta);
//        RenderSystem.setShaderTexture(0, this.iconTexture);
//        RenderSystem.enableBlend();
//        RenderSystem.defaultBlendFunc();
//        RenderSystem.enableDepthTest();
//
//        int iconX = this.x + (this.width - this.iconWidth) / 2;
//        int iconY = this.y + (this.height - this.iconHeight) / 2;
//
//        matrices.pushPose();
//        matrices.translate(iconX, iconY, 0);
//        matrices.scale(1.0F, 1.0F, 1.0F);
//        blit(matrices, 0, 0, this.iconU, this.iconV, this.iconWidth, this.iconHeight);
//        matrices.popPose();
//    }
}