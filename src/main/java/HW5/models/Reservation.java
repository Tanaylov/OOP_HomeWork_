package HW5.models;

import java.util.Date;

public class Reservation {
    private final int id;
    private static int counter = 1000;
    private String name;
    private Date data;
    private boolean reservationStatus;
    public Reservation(Date data, String name) {
        this.name = name;
        this.data = data;
        reservationStatus = true;
    }
    public boolean isReservationStatus() {
        return reservationStatus;
    }
    public void setReservationStatus(boolean reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
    public String getName() {
        return name;
    }
    public Date getData() {
        return data;
    }
    public int getId() {
        return id;
    }

    {
        id = ++counter;
    }
}
