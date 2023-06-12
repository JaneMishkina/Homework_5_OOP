package Homeworks_OOP.Homework_5_OOP;

import Homework_5_OOP.models.TableModel;
import Homework_5_OOP.presenters.BookingPresenter;
import Homework_5_OOP.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен заработать!
     * 
     * @param args
     */
    public static void main(String[] args) {

        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTableEvent(new Date(), 103, "Станислав");

        bookingView.onChangeReservationTable(9001, new Date(), 105, "Иван");
    }

}
