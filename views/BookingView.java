package Homeworks_OOP.Homework_5_OOP;

import Homework_5_OOP.models.Table;
import Homework_5_OOP.presenters.View;
import Homework_5_OOP.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void updateTablesView(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void updateReservationTableResult(int reservationNo) {
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
    }

    public void newUpdateReservation() {
        System.out.println("Бронь была изменена");
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование
     * столика
     * 
     * @param reservationDate дата бронирования
     * @param tableNo         номер столика
     * @param name            имя клиета
     */
    public void reservationTableEvent(Date reservationDate, int tableNo, String name) {
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }

    // /**
    // * TODO: Доработать метод changeReservationTable в рамках домашнего задания
    // * Действие клиента (пользователь нажал на кнопку изменения бронирования),
    // * изменение бронирование столика
    // *
    // * @param oldReservation
    // * @param reservationDate
    // * @param tableNo
    // * @param name
    // */
    // public void changeReservationTable(int oldReservation, Date reservationDate,
    // int tableNo, String name) {

    // }

}
