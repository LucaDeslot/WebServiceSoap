package infres.ws.soap.service;

import infres.ws.soap.model.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoomService {
    private Room[] rooms;
    public RoomService() {
        // Créer des chambres et les ajouter à la liste
        Room basicRoom = new Room();
        basicRoom.setRoomNumber(1);
        basicRoom.setType("Basique");
        basicRoom.setPrice(50.0);
        rooms[1]=basicRoom;

        Room middleRoom = new Room();
        middleRoom.setRoomNumber(2);
        middleRoom.setType("Middle Gamme");
        middleRoom.setPrice(100.0);
        rooms[2]=middleRoom;

        Room highEndRoom = new Room();
        highEndRoom.setRoomNumber(3);
        highEndRoom.setType("Haut de Gamme");
        highEndRoom.setPrice(200.0);
        rooms[3]=highEndRoom;
    }
    public Room getRoom(Integer roomId) throws Exception {
        return Arrays.stream(rooms)
                .filter(room -> room.getRoomNumber() == roomId)
                .findFirst()
                .orElseThrow(() -> new Exception("Room not found"));
    }
    public Room[] getRooms(){
        return rooms;
    }
}
