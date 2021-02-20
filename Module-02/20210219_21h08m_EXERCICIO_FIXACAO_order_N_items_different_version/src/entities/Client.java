package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    /*
     Essa classe tem três atributos simples: nome, email e data de nascimento.
     Permitirei que nome e email possam ser mudados via setter, mas não a data de nascimento.

     */

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String clientName;
    private String clientEmail;
    private Date clientBirthDate;

    public Client(String clientName, String clientEmail, Date clientBirthDate) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.clientBirthDate = clientBirthDate;
    }

    public Client() {

    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public Date getClientBirthDate() {
        return clientBirthDate;
    }

    public String toString() {

        return clientName + " (" + sdf.format(clientBirthDate) + ") - " + clientEmail;
    }

}
