package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 *This is the main file of the program.
 * @author: Nicholis Wright
 *
 * */

public class Main extends Application {
  /*
   *This method creates the scene.
   * @author: Nicholis Wright
   *@param Stage primary stage: sets scene.
   * */

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setTitle("Hello World");
    primaryStage.setScene(new Scene(root, 400, 400));
    primaryStage.show();
  }

  /*
   * @author: Nicholis Wright
   *@param String[args]: main array that holds commands
   * */

  public static void main(String[] args) {
    launch(args);
  }
}
