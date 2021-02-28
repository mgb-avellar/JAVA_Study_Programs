package model.services;

/*
    ESTA É UMA CLASSE DA CAMADA DE SERVIÇOS DA APLICAÇÃO
 */

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService; // Associação com a classe BrazilTaxService

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService texService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = texService;
    }

    public RentalService() {
    }

    public void processInvoice(CarRental carRental) {

        // Aqui entram os cálculos para montar a Invoice

        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();

        double hoursDifference = (double) (t2 - t1) / 1000 / 60 / 60;  // Diferença em horas

        double basicPayment;

        if (hoursDifference <= 12.0) {

            basicPayment = Math.ceil(hoursDifference) * pricePerHour;
        }
        else {

            basicPayment = Math.ceil(hoursDifference / 24 ) * pricePerDay;
        }

        double tax = taxService.tax(basicPayment); // Calculo o imposto baseado no valor de basicPayment

        // Instancio a nova Invoice, recebendo basicPayment e tax e associo ele com meu novo objeto de aluguel
        carRental.setInvoice(new Invoice(basicPayment, tax));

    }

}
