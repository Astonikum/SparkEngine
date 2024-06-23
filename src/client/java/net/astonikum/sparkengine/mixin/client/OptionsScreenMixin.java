package net.astonikum.sparkengine.mixin.client;

import net.astonikum.sparkengine.gui.ModMenuMain;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(OptionsScreen.class)
public abstract class OptionsScreenMixin extends Screen {

    protected OptionsScreenMixin(Text title) {
        super(title);
    }

    @Inject(at = @At("RETURN"), method = "init")
    public void init(CallbackInfo ci) {
        this.addDrawableChild(new ButtonWidget(this.width / 2 - 185, this.height / 6 + 120 - 6, 20, 20, Text.translatable("options.resourcepack"), (button) -> {
            MinecraftClient.getInstance().setScreen(new ModMenuMain(this, Text.translatable("resourcePack.title")));
        }));
    }

}
