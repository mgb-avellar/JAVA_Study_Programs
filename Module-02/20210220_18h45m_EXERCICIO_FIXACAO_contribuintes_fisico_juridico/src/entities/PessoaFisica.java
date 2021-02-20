package entities;

public class PessoaFisica extends Contribuinte {

    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nomeContribuinte, Double rendaAnual, Double gastosSaude) {
        super(nomeContribuinte, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double impostoPago() {

        double imposto = 0.0;

        if ( super.getRendaAnual() < 20000.0 ) {

            imposto = super.getRendaAnual() * 0.15 - this.gastosSaude * 0.50;
        }
        else if ( super.getRendaAnual() >= 20000.0 ) {

            imposto = super.getRendaAnual() * 0.25 - this.gastosSaude * 0.50;
        }

        return imposto;
    }
}
