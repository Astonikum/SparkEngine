package net.astonikum.sparkengine.mixin.client;

import net.astonikum.sparkengine.gui.ModMenuHub;
import net.astonikum.sparkengine.gui.core.IconButtonWidget;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(OptionsScreen.class)
public abstract class OptionsScreenMixin extends Screen {

    private static final Identifier ICON_TEXTURE = new Identifier("spark_engine", "/assets/gui/settings-logo.png");

    protected OptionsScreenMixin(Text title) {
        super(title);
    }

    @Inject(at = @At("RETURN"), method = "init")
    public void init(CallbackInfo ci) {
        this.addDrawableChild(new IconButtonWidget(this.width / 2 - 180, this.height / 6 + 120 - 6, 20, 20, (button) -> {
            MinecraftClient.getInstance().setScreen(new ModMenuHub(this, Text.translatable("spark_engine.mod_settings.hub.title")));
        }, ICON_TEXTURE));
    }

}