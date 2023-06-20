package infres.ws.soap.service;

import infres.ws.soap.model.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService {
    private ArrayList<Room> rooms = new ArrayList<>();
    public RoomService() {
        // Créer des chambres et les ajouter à la liste
        Room basicRoom = new Room();
        basicRoom.setRoomNumber(1);
        basicRoom.setType("Basique");
        basicRoom.setPrice(50.0);
        rooms.add(basicRoom);

        Room middleRoom = new Room();
        middleRoom.setRoomNumber(2);
        middleRoom.setType("Middle Gamme");
        middleRoom.setPrice(100.0);
        rooms.add(middleRoom);

        Room highEndRoom = new Room();
        highEndRoom.setRoomNumber(3);
        highEndRoom.setType("Haut de Gamme");
        highEndRoom.setPrice(200.0);
        rooms.add(highEndRoom);
    }
    public Room getRoom(Integer roomId) throws Exception {
        return rooms.stream()
                .filter(room -> room.getRoomNumber() == roomId)
                .findFirst()
                .orElseThrow(() -> new Exception("Room not found"));
    }
    public ArrayList<Room> getRooms(){
        return rooms;
    }
}
