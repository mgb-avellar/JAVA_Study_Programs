package services;

public class BrazilInterestService implements InterestService {

    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    /*
    Poderíamos perguntar se o getInterestRate() poderia ser deletado, a exemplo do payment().
    A resposta é que não, pois getInterestRate() depende da taxa de interesse e a interface
    não pode ter nem construtores, nem guardar estados.
     */
}
