package application;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.Callback;
import model.entities.Person;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class ViewController  implements Initializable {

    // Abaixo relaciono minha CoimboBox com o FXML
    @FXML
    private ComboBox<Person> comboBoxPerson;

    // Abaixo crio uma lista (vazia) de pessoas que pode ser enxergada pela ComboBox
    private ObservableList<Person> personObservableList;

    // Nossa ação após selecionar o nome da lista (vide abaixo)
    @FXML
    public void onComboBoxPersonAction () {

        Person person = comboBoxPerson.getSelectionModel().getSelectedItem();

        System.out.println(person);
    }

    // Criando um botão All
    @FXML
    private Button btAll;

    // Criando um evento para o botão All
    public void onBtAllAction () {

        for (Person person : comboBoxPerson.getItems()) {

            System.out.println(person);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // Criando a lista de pessoas
        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1, "Rosi", "rosi@gmail.com"));
        personList.add(new Person(2, "Bombs", "bombs@gmail.com"));
        personList.add(new Person(3, "Neno", "neno@gmail.com"));

        // Adicionando a lista de pessoas à lista observável
        personObservableList = FXCollections.observableArrayList(personList);

        // Colocando a lista observável na ComboBox
        comboBoxPerson.setItems(personObservableList);

        // Para que a listinha na ComboBox não use o toString() para mostrar os itens da lista, uso o seguinte:

        Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
            @Override
            protected void updateItem(Person item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty ? "" : item.getName());
            }
        };
        comboBoxPerson.setCellFactory(factory);
        comboBoxPerson.setButtonCell(factory.call(null));

    }
}
