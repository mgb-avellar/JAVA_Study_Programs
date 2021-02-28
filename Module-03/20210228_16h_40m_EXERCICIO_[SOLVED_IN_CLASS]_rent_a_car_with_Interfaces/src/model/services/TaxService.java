package model.services;

public interface TaxService {

    double tax(double amount);

    /*
    Essa classe é uma interface genérica que é passada para a classe RentalService.
    Com isso, generalizamos a classe RentalService e não ficamos na dependência de
    BrazilTaxService ou qualquer outra.
    Se precisarmos de uma USTaxService, basta implementarmos separadamente, nos
    moldes de BrazilTaxService, mas não precisaremos mexer em parte alguma do código
    além disso.
     */

}
