package model.entities;

import java.util.Date;

/*
    ESTA É UMA CLASSE DA CAMADA DE DOMÍNIO DA APLICAÇÃO
 */

public class CarRental {

    private Date start;
    private Date finish;

    // As associações que CarRental tem com as outras duas entidades
    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(Date start, Date finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
        // this.invoice fica de fora porque ele pode ter dois estados: processado ou não.
    }

    public CarRental() {
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
