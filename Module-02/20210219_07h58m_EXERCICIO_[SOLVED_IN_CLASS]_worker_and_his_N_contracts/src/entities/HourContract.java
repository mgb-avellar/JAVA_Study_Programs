package entities;

import java.util.Date;

public class HourContract {

    /*
        Esta classe possui três variáveis: uma data (tipo Date), o valor pago por hora (double) e o número de
        horas do contrato (integer).
        Além disso, deve possuir um método que calcula o valor total pago dos contratos.
        Usaremos wrapper classes para as variáveis.
        Teremos o contrutor básico e o com parâmetros, e getters e setters.

     */

    private Date contractDate;
    private Double valuePerHour;
    private Integer hours;

    public HourContract() {

    }

    public HourContract(Date contractDate, Double valuePerHour, Integer hours) {
        this.contractDate = contractDate;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    // Método de cálculo do valor total do contrato (entra aqui o conceito de delegação [de tarefas])

    public Double totalValue() {

        return (this.valuePerHour * this.hours);
    }
}
