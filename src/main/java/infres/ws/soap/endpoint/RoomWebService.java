package infres.ws.soap.endpoint;

import infres.ws.soap.model.Room;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface RoomWebService {

    @WebMethod
    Room getRoom(int id);

    @WebMethod
    Room[] getAllRooms();

}
