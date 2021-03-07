package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {

    @FXML
    private Button btTest;

    @FXML
    public void onBtTestAction() {
        // Geralmente, Actions correspondem a cliques do mouse que acionam uma ação
        System.out.println("click");
    }
}
