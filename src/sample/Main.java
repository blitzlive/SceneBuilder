package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    private FXMLLoader loader;
    private Parent root;

    @Override
    public void start(Stage primaryStage) {
        try {

            loader = new FXMLLoader();
            root = (Parent) loader.load(getClass().getResourceAsStream("Verwaltungstool.fxml"));


            Scene scene = new Scene(root);
            scene.getStylesheets().add("ToolStyle.css");

            primaryStage.setScene(scene);
            primaryStage.setTitle("Aktivitätsverwaltung");
            primaryStage.sizeToScene();
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        launch(args);
    }
}
