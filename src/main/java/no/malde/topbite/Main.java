package no.malde.topbite;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Main class and starting point of the application.
 * Used to open the first screen stage.
 * @author Andreas Follevaag Malde
 * @version 1.0 - SNAPSHOT
 */
public class Main extends Application {

  /**
   * Start the javaFX application. All general settings
   * are set here.
   * @param stage primary stage (screen)
   * @throws IOException If no FXML file is found
   */
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main-screen.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 320, 240);
    stage.setTitle("TopBite");
    stage.setScene(scene);
    stage.show();
  }

  /**
   * Main method/starting point of the java application
   * @param args N/A
   */
  public static void main(String[] args) {
    launch();
  }
}