package HW5.views;

import HW5.models.Table;
import HW5.presenters.View;
import HW5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {
    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0)
            System.out.printf("Table was reserved. Reservation number is: %d\n", reservationNo);
        else System.out.println("Table wasn't reserved, please, try later.");
    }

    public void showTables(Collection<Table> tables) {
        for (Table table : tables) System.out.println(table);
    }
    public void reservationTable(Date orderDate, int tableNo, String name) {
        if (observer != null) observer.onReservationTable(orderDate, tableNo, name);
    }
    public void changeReservationTable(int oldOder, Date date, int tableNo, String name) {
        if (observer != null) observer.changeReservationTable(oldOder, date, tableNo, name);
    }
}
