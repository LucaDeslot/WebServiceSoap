package infres.ws.soap.endpoint;

import infres.ws.soap.model.Hotel;
import infres.ws.soap.model.Reservation;
import infres.ws.soap.model.Room;
import infres.ws.soap.service.ReservationService;
import jakarta.jws.WebService;

import java.util.Date;

@WebService(endpointInterface = "infres.ws.soap.endpoint.ReservationWebService")
public class ReservationWebServiceImpl implements ReservationWebService {

    private final ReservationService reservationService = new ReservationService();
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

    @Override
    public Hotel getHotel(Integer hotelId) {
        return null;
    }

    @Override
    public Hotel[] getHotels(Integer hotelId) {
        return new Hotel[0];
    }

    @Override
    public Room[] getRooms() {
        try {
            return reservationService.getRooms();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Reservation[] getReservations() {
        try {
            return reservationService.getReservations();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Reservation getReservation(Integer reservationId) {
        try {
            return reservationService.getReservation(reservationId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Reservation makeReservation(Date StartDate, Date EndDate, String customerName, Integer idRoom) {
        return null;
    }

    @Override
    public Reservation[] getReservationsByHotel(Integer hotelId) {
        return new Reservation[0];
    }

    @Override
    public Reservation[] getReservationsByRoom(Integer roomId) {
        return new Reservation[0];
    }

    @Override
    public Reservation getReservationByRoom(Integer roomId) {
        try {
            return reservationService.getReservationByRoom(roomId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
