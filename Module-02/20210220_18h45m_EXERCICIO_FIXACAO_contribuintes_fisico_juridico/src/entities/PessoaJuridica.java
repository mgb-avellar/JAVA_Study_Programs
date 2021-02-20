package entities;

public class PessoaJuridica extends Contribuinte {

    private Integer numeroFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nomeContribuinte, Double rendaAnual, Integer numeroFuncionarios) {
        super(nomeContribuinte, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double impostoPago() {

        double imposto= 0.0;

        if ( this.numeroFuncionarios <= 10 ) {

            imposto = super.getRendaAnual() * 0.16;
        }
        else if ( this.numeroFuncionarios > 10 ) {

            imposto = super.getRendaAnual() * 0.14;
        }

        return imposto;
    }
}
