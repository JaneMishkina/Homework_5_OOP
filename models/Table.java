package Homeworks_OOP.Homework_5_OOP;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private static int counter = 100;

    private final Collection<Reservation> reservations = new ArrayList<>();
    private final int no;

    {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public Reservation getReservation(int reservationId) {
        for (Reservation reservation : reservations) {
            if (reservationId == reservation.getId()) {
                return reservation;
            }
        }
        System.out.println("Такой брони не существует");
        return null;
    }

    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }
}
