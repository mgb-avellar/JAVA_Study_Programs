package model.services;

/*
    ESTA É UMA CLASSE DA CAMADA DE SERVIÇOS DA APLICAÇÃO
 */

public class BrazilTaxService implements TaxService {

    // Note que esta classe não tem atributos; tem apenas um método

    public double tax(double amount) {

        if (amount <= 100.0) {

            return (amount * 0.2);
        }
        else {

            return (amount * 0.15);
        }

    }


}
