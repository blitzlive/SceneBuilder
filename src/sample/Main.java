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
            //BorderPane root = new BorderPane();

            loader = new FXMLLoader();
            root = (Parent) loader.load(getClass().getResourceAsStream("sample.fxml"));




//			HBox bottomBox = new HBox();
//			root.setBottom(bottomBox);
//
//
//			Button buttonTano = new Button("Tano");
//			bottomBox.getChildren().add(buttonTano);
//
//
//			Button buttonDennis = new Button("Dennis");
//			bottomBox.getChildren().add(buttonDennis);
//			buttonDennis.setOnAction(new EventHandler<ActionEvent>() {
//
//				@Override
//				public void handle(ActionEvent event) {
//					Alert alertDennis = new Alert(AlertType.ERROR);
//					alertDennis.setContentText("Achtung");
//					alertDennis.setHeaderText("Hallo Dennis");
//					alertDennis.showAndWait();
//				}
//
//			});
//
//
//
//			buttonTano.setOnAction(new EventHandler<ActionEvent>() {
//				@Override
//				public void handle(ActionEvent arg0) {
//					Alert alertTano = new Alert(AlertType.INFORMATION);
//					alertTano.setContentText("Hallo Tano");
//					alertTano.setHeaderText("Hallo");
//					alertTano.show();
//				}
//			});

            Scene scene = new Scene(root,800,420);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
