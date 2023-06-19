package infres.ws.soap.endpoint;

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
    Reservation createReservation(Date StartDate, Date EndDate, int idRoom, String customerName);

    @WebMethod
    boolean checkAvailability(Date StartDate, Date EndDate, int idRoom);

    @WebMethod
    Room getRoom(Integer roomId);

}
