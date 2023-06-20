package infres.ws.soap.endpoint;

import infres.ws.soap.model.Room;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import java.util.ArrayList;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface RoomWebService {

    @WebMethod
    Room getRoom(int id);

    @WebMethod
    Room[] getAllRooms();
    @WebMethod
    ArrayList<Room> getRooms();
}
