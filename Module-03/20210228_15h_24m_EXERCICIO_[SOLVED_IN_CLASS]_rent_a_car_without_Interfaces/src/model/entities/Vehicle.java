package model.entities;

/*
    ESTA É UMA CLASSE DA CAMADA DE DOMÍNIO DA APLICAÇÃO
 */

public class Vehicle {

    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public Vehicle() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
