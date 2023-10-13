package HW5.models;

import java.util.LinkedList;
import java.util.Locale;

public class Table {
    private final int no;
    private static int counter;

    {
        no = ++counter;
    }
    private final LinkedList<Reservation> reservations = new LinkedList<>();

    public LinkedList<Reservation> getReservations() {
        return reservations;
    }

    public int getNo() {return no;}
    @Override
    public String toString() {return String.format(Locale.getDefault(), "Table #%d", no);}
}
