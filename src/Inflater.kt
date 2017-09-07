import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage
import javafx.scene.control.Button
import javafx.scene.layout.StackPane

class Inflater: Application() {

    override fun start(primaryStage: Stage?) {
        primaryStage?.title = "Can You Die?"

        val button = Button()
        button.text = "Play"

        val root = StackPane()
        root.children.add(button)

        val width: Int = 500
        val height:Int = width
        primaryStage?.scene = Scene(root, width.toDouble(), height.toDouble())
        primaryStage?.show()
    }

    fun launchApplication() {
        launch(Inflater::class.java)
    }
}