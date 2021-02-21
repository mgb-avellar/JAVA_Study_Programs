package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
        if (!checkOut.after(checkIn)) {

            //throw new IllegalArgumentException("Check-out date " + // Ver comentário
                                                                     // em updateDate()
            throw new DomainException("Check-out date " +
                    "must be after the check-in date.");
        }

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }


    public Date getCheckOut() {
        return checkOut;
    }

    // Retiramos os setters para as datas de
    // check-in e check-out porque temos um método específico para isso.

    public long duration() {

        long diff = checkOut.getTime() - checkIn.getTime(); // vem em milissegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException {

        // Trataremos as exceções aqui. Faremos o método lançar uma exceção
        // Usaremos uma exceção personalizada, mas poderíamo ter usado uma
        // exceção típica do Java para argumentos inválidos
        // Porém, ao personalizar minha exceção na classe DomainException
        // sou obrigado a fazer o método lançar para o Main a exceção usando o comando
        // throws DomainException; nesse caso, o Main deverá ou repassar usando o throws
        // ou ele mesmo tratar usando catch.

        Date now = new Date();

        if (checkIn.before(now) || checkOut.before(now)) {

            //throw new IllegalArgumentException("Reservation dates " +
            throw new DomainException("Reservation dates " +
                    "for update must be future dates.");
        }
        if (!checkOut.after(checkIn)) {

            //throw new IllegalArgumentException("Check-out date " +
            throw new DomainException("Check-out date " +
                    "must be after the check-in date.");
        }

        // Depois dessa lógica de checagem, posso atualizar as datas.

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {

        return "Room " +
                roomNumber +
                ", check-in: " +
                sdf.format(checkIn) +
                ", check-out: " +
                sdf.format(checkOut) +
                ", " +
                duration() +
                " nights.";
    }
}
