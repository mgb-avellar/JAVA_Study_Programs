package application;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class ViewController  implements Initializable {
    // Esse 'implements Initializable' serve para o aplicativo usar as restrições da classe Constraints
    //  Veja a implementação de Initializable ao final.

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // Coloco ações que quero que sejam executadas quando da instanciação do controlador

        Constraints.setTextFieldDouble(txtNumber1);
        Constraints.setTextFieldDouble(txtNumber1);

        // Por exemplo, o tamanho máximo de 12 caracteres

        Constraints.setTextFieldMaxLength(txtNumber1, 12);
        Constraints.setTextFieldMaxLength(txtNumber2, 12);
    }
}
