package Homeworks_OOP.Homework_5_OOP;

import Homework_5_OOP.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    /**
     * Получение списка всех столиков
     * 
     * @return
     */
    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * 
     * @param reservationDate Дата бронирования
     * @param tableNo         Номер столика
     * @param name            Имя клиента
     * @return Номер брони
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

    int onChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name);

}
