package infres.ws.soap.endpoint;

import infres.ws.soap.model.Room;

import jakarta.jws.WebService;

@WebService(endpointInterface = "infres.ws.soap.endpoint.RoomWebService")
public class RoomWebServiceImpl implements RoomWebService {

    public Room getRoom(int id) {
        return new Room();
    }

    public Room[] getAllRooms() {
        return new Room[0];
    }
}
