package Homeworks_OOP.Homework_5_OOP;

import Homework_5_OOP.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Получение списка всех столиков
     * 
     * @return
     */
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     * 
     * @param reservationDate Дата бронирования
     * @param tableNo         Номер столика
     * @param name            Имя клиента
     * @return Номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    /**
     * TODO: Разработать метод самостоятельно в рамках домашнего задания
     * Поменять бронь столика
     * 
     * @return
     */
    public int onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {

        for (Table table : tables) {
            // Iterator iterator = table.getReservations().iterator();
            Reservation tempReservation = null;
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservation) {
                    // table.getReservations().remove(reservation);
                    tempReservation = reservation;
                }
            }
            if (tempReservation != null) {
                table.getReservations().remove(tempReservation);
            }
        }

        return reservationTable(reservationDate, tableNo, name);
        // TODO: Для создания нового резерва столика стоит воспользоваться уже
        // существующим методом reservationTable
    }

}
