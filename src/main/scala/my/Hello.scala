package my

import scalafx.Includes._
import scalafx.application
import scalafx.application.JFXApp
import scalafx.event.ActionEvent
import scalafx.scene.Scene
import scalafx.scene.control.Alert.AlertType
import scalafx.scene.control.{Alert, Button}

object Hello extends JFXApp {

  stage = new application.JFXApp.PrimaryStage {
    title.value = "Hello"
    width = 600
    height = 400
    scene = new Scene {
      content = new Button("Hello, JavaFX") {
        onAction = (event: ActionEvent) => {
          new Alert(AlertType.Information, "You clicked the button").showAndWait()
        }
      }
    }
  }
}
