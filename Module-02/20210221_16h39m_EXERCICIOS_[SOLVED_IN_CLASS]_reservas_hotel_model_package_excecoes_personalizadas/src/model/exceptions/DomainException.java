package model.exceptions;

public class DomainException extends Exception {
    /*
        Eu poderia ainda fazer public class DomainException extends RuntimeException;
        isso faria com que eu não precisasse lançar (propagar) exceções da classe
        Reservation, como deixei feito (ao contrário do gabarito oficial)
     */

    /*
        Essa classe é serializável, pois estende Exception, que é serializável.
        Preciso colocar um "private static final long serialVersionUID = 1L;"
        para lidar com isso, embora o IntelliJ não tenha apontado nada, ao
        contrário do Eclipse usado na aula, que aponta.

        Além disso, preciso de um construtor que recebe uma mensagem, para que
        eu possa instanciá-la na classe principal ao receber uma mensagem.
     */

    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
