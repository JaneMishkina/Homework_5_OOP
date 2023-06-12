package Homeworks_OOP.Homework_5_OOP;

import Homework_5_OOP.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final View bookingView;
    private final Model tableModel;

    public BookingPresenter(View bookingView, Model tableModel) {
        this.bookingView = bookingView;
        this.tableModel = tableModel;
        bookingView.setObserver(this);
    }

    // private Collection<Table> loadTables(){
    // return tableModel.loadTables();
    // }

    public void showTables() {
        bookingView.updateTablesView(tableModel.loadTables());
    }

    private void showReservationTableResult(int reservationNo) {
        bookingView.updateReservationTableResult(reservationNo);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = tableModel.reservationTable(orderDate, tableNo, name);
        showReservationTableResult(reservationNo);
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name) {
        int NewReservationNo = tableModel.onChangeReservationTable(oldReservation, orderDate, tableNo, name);
        newUpdateReservation();
        showReservationTableResult(NewReservationNo);
    }

    private void newUpdateReservation() {
        bookingView.newUpdateReservation();
    }
}
