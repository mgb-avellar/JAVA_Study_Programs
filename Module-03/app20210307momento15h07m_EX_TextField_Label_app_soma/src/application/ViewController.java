package application;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class ViewController {

    // Preciso declarar as variáveis associadas com a tela que armazenarão os números a serem somados

    @FXML
    private TextField txtNumber1;
    @FXML
    private TextField txtNumber2;

    // Preciso também declarar o Label onde o resultado da soma será guardado

    @FXML
    private Label labelResult;

    // Meu botão de soma

    @FXML
    private Button btSum;

    // O método para calcular a soma dos dois números digitados
    @FXML
    public void onBtSumAction() {

        try {
            Locale.setDefault(Locale.US);

            double number1 = Double.parseDouble(txtNumber1.getText());
            double number2 = Double.parseDouble(txtNumber2.getText());

        /*
        'txtNumber1.getText()' pega o conteúdo digitado na caixinha como string, por isso preciso
        converter para Double usando o 'Double.parseDouble()'.
         */

            double sum = number1 + number2;

            labelResult.setText(String.format("%.2f", sum));
        }
        catch (NumberFormatException e) {
            Alerts.showAlert("Error", "Parse error", e.getMessage(), Alert.AlertType.ERROR);
        }

    }




}
