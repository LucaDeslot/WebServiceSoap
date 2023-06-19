package infres.ws.soap.service;

import infres.ws.soap.model.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService {
    static List<Room> rooms = new ArrayList<Room>();
    public static Room getRoom(Integer roomId) throws Exception {
        return rooms.stream()
                .filter(room -> room.getRoomNumber() == roomId)
                .findFirst()
                .orElseThrow(() -> new Exception("Room not found"));
    }
    public List<Room> getAllRoom(){
        return rooms;
    }
}
