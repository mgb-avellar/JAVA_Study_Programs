package application;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ViewController {

    @FXML
    private Button btTest;

    @FXML
    public void onBtTestAction() {

        // Geralmente, Actions correspondem a cliques do mouse que acionam uma ação
        System.out.println("click");

        // Mostrando o Alert
        Alerts.showAlert("Alert title", "Alert header", "Hello, guys!", Alert.AlertType.INFORMATION);

        // ps. o header do alert pode ser null

    }
}
