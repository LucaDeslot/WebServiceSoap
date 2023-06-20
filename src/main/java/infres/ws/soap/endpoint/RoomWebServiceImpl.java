package infres.ws.soap.endpoint;

import infres.ws.soap.model.Room;

import infres.ws.soap.service.RoomService;
import jakarta.jws.WebService;

@WebService(endpointInterface = "infres.ws.soap.endpoint.RoomWebService")
public class RoomWebServiceImpl implements RoomWebService {
    private final RoomService roomService = new RoomService();
    public Room getRoom(int id) {
        try {
            return roomService.getRoom(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Room[] getAllRooms() {
        return new Room[0];
    }
}
