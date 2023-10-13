package HW5.presenters;

import HW5.models.Table;
import HW5.models.TableModel;
import HW5.views.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {
    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setObserver(this);
    }
    private Collection<Table> loadTables() {
        return model.loadTable();
    }
    public void updateUIShowTables() {
        view.showTables(loadTables());
    }
    private void updateUIShowReservationTableResult(int reservationNo) {
        view.showReservationTableResult(reservationNo);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateUIShowReservationTableResult(reservationNo);
        }
        catch (RuntimeException e) {
            updateUIShowReservationTableResult(-1);
        }
    }

    @Override
    public void changeReservationTable(int oldOrder, Date date, int tableNo, String name) {
        try {
            int reservationNoNew = model.changeReservationTable(oldOrder, date, tableNo, name);
            updateUIShowReservationTableResult(reservationNoNew);
        }
        catch (RuntimeException e) {
            updateUIShowReservationTableResult(-1);
        }
    }
}
