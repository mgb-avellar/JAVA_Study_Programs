package model.services;

/*
    ESTA É UMA CLASSE DA CAMADA DE SERVIÇOS DA APLICAÇÃO
 */

public class BrazilTaxService {

    // Note que esta classe não tem atributos; tem apenas um método

    public Double tax(Double amount) {

        if (amount <= 100.0) {

            return (amount * 0.2);
        }
        else {

            return (amount * 0.15);
        }

    }
}
