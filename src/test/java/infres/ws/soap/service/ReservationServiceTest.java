package infres.ws.soap.service;

import infres.ws.soap.model.Reservation;
import org.junit.jupiter.api.BeforeAll;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
class ReservationServiceTest {

    static ReservationService reservationService;

    @BeforeAll
    static void setUp() {
        reservationService = new ReservationService();
    }

    @org.junit.jupiter.api.Test
    void getRoom() throws Exception {
        assertEquals(1, reservationService.getRoom(1).getRoomNumber());
    }

    @org.junit.jupiter.api.Test
    void getRooms() {
        assertEquals(3, reservationService.getRooms().length);
    }

    @org.junit.jupiter.api.Test
    void getReservations() {
        assertEquals(1, reservationService.getReservations().length);
    }

    @org.junit.jupiter.api.Test
    void checkAvailability() throws Exception {
        Date startDate = new Date(2021, 1, 1);
        Date endDate = new Date(2021, 1, 2);
        assertTrue(reservationService.checkAvailability(startDate, endDate, 1));
    }

    @org.junit.jupiter.api.Test
    void checkAvailabilityFalse() throws Exception {
        Date startDate = new Date(2021, 1, 1);
        Date endDate = new Date(2021, 1, 2);
        assertFalse(reservationService.checkAvailability(startDate, endDate, 2));
    }

    @org.junit.jupiter.api.Test
    void addReservation() throws Exception {
        Date startDate = new Date(2021, 1, 1);
        Date endDate = new Date(2021, 1, 2);
        Reservation reservation = new Reservation();
        reservation.setStartDate(startDate);
        reservation.setEndDate(endDate);
        reservation.setRoomId(reservationService.getRoom(1).getRoomNumber());
        reservationService.makeReservation(startDate, endDate, "Lionel",reservation.getRoomId());
        System.out.println(reservationService.getReservation(0).getCustomerName());
        assertEquals(1, reservationService.getReservations().length);
    }

    @org.junit.jupiter.api.Test
    void addReservationFalse() throws Exception {
        Date startDate = new Date(2021, 1, 1);
        Date endDate = new Date(2021, 1, 2);
        Reservation reservation = new Reservation();
        reservation.setStartDate(startDate);
        reservation.setEndDate(endDate);
        reservation.setRoomId(reservationService.getRoom(1).getRoomNumber());
        reservationService.makeReservation(startDate, endDate, "Lionel",reservation.getRoomId());
        System.out.println(reservationService.getReservation(0).getCustomerName());
        assertNotEquals(2, reservationService.getReservations().length);
    }

    @org.junit.jupiter.api.Test
    void getReservation() throws Exception {
        Date startDate = new Date(2021, 1, 1);
        Date endDate = new Date(2021, 1, 2);
        Reservation reservation = new Reservation();
        reservation.setStartDate(startDate);
        reservation.setEndDate(endDate);
        reservation.setRoomId(reservationService.getRoom(1).getRoomNumber());
        reservationService.makeReservation(startDate, endDate, "Lionel",reservation.getRoomId());
        System.out.println(reservationService.getReservation(0).getCustomerName());
        assertEquals("Lionel", reservationService.getReservation(0).getCustomerName());
    }

    @org.junit.jupiter.api.Test
    void getReservationByRoom() throws Exception {
        Date startDate = new Date(2021, 1, 1);
        Date endDate = new Date(2021, 1, 2);
        Reservation reservation = new Reservation();
        reservation.setStartDate(startDate);
        reservation.setEndDate(endDate);
        reservation.setRoomId(reservationService.getRoom(1).getRoomNumber());
        Reservation reservation1 = reservationService.makeReservation(startDate, endDate, "Lionel",reservation.getRoomId());
        assertEquals(reservation1, reservationService.getReservationByRoom(1));
    }
}