package infres.ws.soap.service;

import infres.ws.soap.model.Reservation;
import infres.ws.soap.model.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservationService {
    public List<Reservation> reservations = new ArrayList<Reservation>();
    public List<Room> rooms = new ArrayList<Room>();
    public ReservationService() {
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
    public Reservation createReservation(Date StartDate, Date EndDate, int idRoom, String customerName) throws Exception {
        Reservation reservation = new Reservation();
        reservation.setStartDate(StartDate);
        reservation.setEndDate(EndDate);
        Room room = getRoom(idRoom);
        reservation.setRoom(room);
        reservation.setCustomerName(customerName);
        return reservation;
    }

    public boolean checkAvailability(Date StartDate, Date EndDate, int idRoom) throws Exception {
        Room room = getRoom(idRoom);
        for (Reservation reservation : reservations) {
            if (reservation.getRoom().equals(room)) {
                if (reservation.getStartDate().before(EndDate) && reservation.getEndDate().after(StartDate)) {
                    return false;
                }
            }
        }
        return true;
    }

}
