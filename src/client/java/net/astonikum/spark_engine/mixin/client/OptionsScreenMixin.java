package net.astonikum.spark_engine.mixin.client;

import net.astonikum.spark_engine.gui.ModMenuHub;
import net.astonikum.spark_engine.gui.core.IconButtonWidget;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.widget.TexturedButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(OptionsScreen.class)
public abstract class OptionsScreenMixin extends Screen {

    private static final Identifier SPARK_LOGO = new Identifier("spark_engine", "/gui/settings-logo.png");

    protected OptionsScreenMixin(Text title) {
        super(title);
    }

    @Inject(at = @At("RETURN"), method = "init")
    public void init(CallbackInfo ci) {
        this.addDrawableChild(
            new TexturedButtonWidget(this.width / 2 - 180, this.height / 6 + 120 - 6, 20, 20, 0, 0, 1, SPARK_LOGO, 20, 20, (button) -> {
                MinecraftClient.getInstance().setScreen(new ModMenuHub(this, Text.translatable("gui.spark_engine.mod_settings.hub.title")));
            })
        );
    }

}