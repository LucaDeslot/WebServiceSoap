package infres.ws.soap.service;

import infres.ws.soap.model.Reservation;
import infres.ws.soap.model.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservationService {
    public List<Reservation> reservations = new ArrayList<Reservation>();
    public List<Room> rooms = new ArrayList<Room>();
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

}
