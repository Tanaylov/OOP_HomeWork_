package HW5;

import HW5.models.TableModel;
import HW5.presenters.BookingPresenter;
import HW5.presenters.Model;
import HW5.presenters.View;
import HW5.views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);
        presenter.updateUIShowTables();
        view.reservationTable(new Date(), 1, "Ivan");
        view.changeReservationTable(1001, new Date(), 2, "Ivan");
    }
}
