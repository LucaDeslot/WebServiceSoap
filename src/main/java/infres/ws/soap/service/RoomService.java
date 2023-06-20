package infres.ws.soap.service;

import infres.ws.soap.model.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoomService {
    private final Room[] rooms = new Room[10];
    public RoomService() {
        // Créer des chambres et les ajouter à la liste
        Room basicRoom = new Room();
        basicRoom.setRoomNumber(1);
        basicRoom.setType("Basique");
        basicRoom.setPrice(50.0);
        rooms[0]=basicRoom;

        Room middleRoom = new Room();
        middleRoom.setRoomNumber(2);
        middleRoom.setType("Middle Gamme");
        middleRoom.setPrice(100.0);
        rooms[1]=middleRoom;

        Room highEndRoom = new Room();
        highEndRoom.setRoomNumber(3);
        highEndRoom.setType("Haut de Gamme");
        highEndRoom.setPrice(200.0);
        rooms[2]=highEndRoom;
    }
    public Room getRoom(Integer roomId) throws Exception {
        return Arrays.stream(this.rooms)
                .filter(room -> room.getRoomNumber() == roomId)
                .findFirst()
                .orElseThrow(() -> new Exception("Room not found"));
    }
    public Room[] getRooms(){
        return this.rooms;
    }
}
