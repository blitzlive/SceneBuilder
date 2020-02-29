package sample;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable{

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }
    @FXML
    private void buttonDennisAction() {
        Alert alertDennis = new Alert(AlertType.ERROR);
        alertDennis.setContentText("Achtung");
        alertDennis.setHeaderText("Hallo Dennis");
        alertDennis.showAndWait();
    }

    @FXML
    private void helloWorldMenuAction() {
        Alert alertDennis = new Alert(AlertType.INFORMATION);
        alertDennis.setContentText("Hallo Welt");
        alertDennis.showAndWait();
    }



}


