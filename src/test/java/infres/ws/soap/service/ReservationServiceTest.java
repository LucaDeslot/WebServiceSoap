package infres.ws.soap.service;

import infres.ws.soap.model.Reservation;
import org.junit.Before;
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
    void createReservation() throws Exception {
        Reservation reservation = reservationService.createReservation(new Date(), new Date(), 1, "test");
        assertEquals("test", reservation.getCustomerName());
        System.out.println(reservation.getStartDate());
    }
}