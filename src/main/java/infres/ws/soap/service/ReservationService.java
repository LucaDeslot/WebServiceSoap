package infres.ws.soap.service;

import infres.ws.soap.model.Hotel;
import infres.ws.soap.model.Reservation;
import infres.ws.soap.model.Room;

import java.util.*;

public class ReservationService {
    public Hotel[] hotels = new Hotel[1];
    public Reservation[] reservations = new Reservation[1];
    public Room[] rooms = new Room[3];
    int reservationIndex = 0;
    public ReservationService() {
        // Créer des chambres et les ajouter à la liste
        Room basicRoom = new Room();
        basicRoom.setRoomNumber(1);
        basicRoom.setType("Basique");
        basicRoom.setPrice(50.0);
        rooms[0] = basicRoom;

        Room middleRoom = new Room();
        middleRoom.setRoomNumber(2);
        middleRoom.setType("Middle Gamme");
        middleRoom.setPrice(100.0);
        rooms[1]= middleRoom;

        Room highEndRoom = new Room();
        highEndRoom.setRoomNumber(3);
        highEndRoom.setType("Haut de Gamme");
        highEndRoom.setPrice(200.0);
        rooms[2] = highEndRoom;

        Reservation reservation = new Reservation();
        reservation.setId(1);
        reservation.setStartDate(new Date(2021, 10, 10));
        reservation.setEndDate(new Date(2021, 10, 20));
        reservation.setCustomerName("John Doe");
        reservation.setRoomId(basicRoom.getRoomNumber());
        reservations[0] = reservation;

        Hotel hotel = new Hotel();
        hotel.setId(1);
        hotel.setName("Hotel de la plage");
        Map<Room, Boolean> roomHotel = new HashMap<>();
        roomHotel.put(basicRoom,false);
        roomHotel.put(middleRoom,false);
        roomHotel.put(highEndRoom,false);
        hotel.setRoomsStatus(roomHotel);
        hotels[0] = hotel;
    }

    public Hotel[] getHotels() {
        return hotels;
    }
    public Hotel getHotel(Integer hotelId) throws Exception {
        return Arrays.stream(this.hotels)
                .filter(hotel -> hotel.getId() == hotelId)
                .findFirst()
                .orElseThrow(() -> new Exception("Hotel not found"));
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

    public Reservation[] getReservations(){
        return this.reservations;
    }
    public Reservation getReservation(Integer reservationId) throws Exception {
        return Arrays.stream(this.reservations)
                .filter(reservation -> reservation.getId() == reservationId)
                .findFirst()
                .orElseThrow(() -> new Exception("Reservation not found"));
    }

    public boolean checkAvailability(Date StartDate, Date EndDate, int idRoom) throws Exception {
        for (Reservation reservation : reservations) {
            if (reservation.getRoomId() == idRoom) {
                if (reservation.getStartDate().before(EndDate) && reservation.getEndDate().after(StartDate)) {
                    return false;
                }
            }
        }
        return true;
    }
    public Reservation makeReservation(Date StartDate, Date EndDate, String customerName, int idRoom) throws Exception {
        if (checkAvailability(StartDate, EndDate, idRoom)) {
            hotels[0].getRoomsStatus().put(getRoom(idRoom), true);
            Reservation reservation = new Reservation();
            reservation.setId(reservationIndex);
            reservation.setStartDate(StartDate);
            reservation.setEndDate(EndDate);
            reservation.setCustomerName(customerName);
            reservation.setRoomId(idRoom);
            reservation.setHotel(hotels[0]);
            reservations[reservationIndex] = reservation;
            reservationIndex++;
            return reservation;
        }
        else {
            throw new Exception("Room not available");
        }
    }
    public Reservation getReservationByRoom(int roomId) {
        return Arrays.stream(this.reservations)
                .filter(reservation -> reservation.getRoomId() == roomId)
                .findFirst()
                .orElse(null);
    }

}
