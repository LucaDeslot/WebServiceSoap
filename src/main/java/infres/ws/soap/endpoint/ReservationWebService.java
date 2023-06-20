package infres.ws.soap.endpoint;

import infres.ws.soap.model.Hotel;
import infres.ws.soap.model.Reservation;
import infres.ws.soap.model.Room;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import java.util.Date;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ReservationWebService {

    @WebMethod
    boolean checkAvailability(Date StartDate, Date EndDate, int idRoom);
    @WebMethod
    Room getRoom(Integer roomId);
    @WebMethod
    Hotel getHotel(Integer hotelId);
    @WebMethod
    Hotel[] getHotels(Integer hotelId);
    @WebMethod
    public Room[] getRooms();
    @WebMethod
    public Reservation[] getReservations();
    @WebMethod
    public Reservation getReservation(Integer reservationId);
    @WebMethod
    public Reservation makeReservation(Date StartDate, Date EndDate, String customerName, Integer idRoom);
    @WebMethod
    public Reservation[] getReservationsByHotel(Integer hotelId);
    @WebMethod
    public Reservation[] getReservationsByRoom(Integer roomId);

    Reservation getReservationByRoom(Integer roomId);
}
