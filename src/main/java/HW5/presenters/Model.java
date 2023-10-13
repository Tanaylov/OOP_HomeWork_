package HW5.presenters;

import HW5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTable();
    int reservationTable(Date reservationDate, int tableNo, String name);
    int changeReservationTable(int oldOrder, Date date, int tableNo, String name);
}
