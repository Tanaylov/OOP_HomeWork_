package HW5.models;

import HW5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class TableModel implements Model {
    private static Collection<Table> tables = tables();

    private static Collection<Table> tables() {
        ArrayList<Table> tables = new ArrayList<>();
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        return tables;
    }

    @Override
    public Collection<Table> loadTable() {
        return tables;
    }

    //    private Table getTable(int index) {
//        for (Table table : tables) {
//            if (table.getNo() == index) return table;
//        }
//        return new Table();
//    }
// 1:15
    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
//        if (getTable(tableNo).getNo() > tables.size()) {
//            System.out.println("This table doesn't exist");
//            return -1;
//        }
//        else {
//            Reservation reservation = new Reservation(reservationDate, name);
//            getTable(tableNo).getReservations().add(reservation);
//            return reservation.getId();
//        }
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("This table doesn't exist");
    }
    public int changeReservationTable(int oldOrder, Date date, int tableNo, String name) {
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldOrder) {
                    reservation.setReservationStatus(false);
                    return reservationTable(date, tableNo, name);
                }
            }
        }
        throw new RuntimeException("This reservation doesn't exist");
    }
}
