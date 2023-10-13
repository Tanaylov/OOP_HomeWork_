package HW5.presenters;

import HW5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {
    void showTables(Collection<Table> tables);
    void setObserver(ViewObserver observer);
    void showReservationTableResult(int reservationNo);
    void reservationTable(Date orderDate, int tableNo, String name);
    void changeReservationTable(int oldOder, Date orderDate, int tableNo, String name);
}
