package uk.ac.rhul.cs2800;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author varunnarendra
 * 
 *         Class used to set up and show GUI for calculator project.
 */
public class Driver extends Application {

  /**
   * @param args default parameter inputed on console. (This is ignored).
   */

  public static void main(String[] args) {
    launch(args);
  }

  /**
   * Method called by Driver to load GUI. It finds the FXML file for GUI, creates a new scene and
   * sets the size of it.
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
    Pane pane = FXMLLoader.load(getClass().getResource("/MainView.fxml"));
    Scene scene = new Scene(pane, 450, 250);
    primaryStage.setScene(scene);
    primaryStage.setResizable(false);
    primaryStage.show();

  }

}
