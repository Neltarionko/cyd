import javafx.application.Application
import javafx.stage.Stage

class Inflater: Application() {

    override fun start(primaryStage: Stage?) {
        primaryStage?.title = "Can You Die?"
        primaryStage?.show()
    }

    fun launchApplication() {
        launch(Inflater::class.java)
    }
}