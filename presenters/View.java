package Homeworks_OOP.Homework_5_OOP;

import Homework_5_OOP.models.Table;

import java.util.Collection;

public interface View {

    void setObserver(ViewObserver observer);

    void updateTablesView(Collection<Table> tables);

    void updateReservationTableResult(int reservationNo);

    void newUpdateReservation();

}
