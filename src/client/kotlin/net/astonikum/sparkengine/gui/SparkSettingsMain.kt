import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.gui.widget.ButtonWidget
import net.minecraft.text.Text

class SparkSettingsMain : Screen(Text.of("SparkEngine Config")) {
    override fun init() {
        super.init()
        addDrawableChild(ButtonWidget(
            width / 2 - 100, height / 6 + 24 - 6, 200, 20, Text.of("Back")
        ) {
            client?.setScreen(null)
        })
    }
}