package infres.ws.soap.endpoint;

import infres.ws.soap.model.Reservation;
import infres.ws.soap.model.Room;
import infres.ws.soap.service.ReservationService;
import jakarta.jws.WebService;

import java.util.Date;

@WebService(endpointInterface = "infres.ws.soap.endpoint.ReservationWebService")
public class ReservationWebServiceImpl implements ReservationWebService {

    private final ReservationService reservationService = new ReservationService();

    @Override
    public Reservation createReservation(Date StartDate, Date EndDate, int idRoom, String customerName) {
        try {
            return reservationService.createReservation(StartDate, EndDate, idRoom, customerName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean checkAvailability(Date StartDate, Date EndDate, int idRoom) {
        try {
            return reservationService.checkAvailability(StartDate, EndDate, idRoom);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Room getRoom(Integer roomId) {
        try {
            return reservationService.getRoom(roomId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
