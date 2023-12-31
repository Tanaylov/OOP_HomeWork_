package HW5.presenters;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date orderDate, int tableNo, String name);
    void changeReservationTable(int oldOrder, Date date, int tableNo, String name);
}
