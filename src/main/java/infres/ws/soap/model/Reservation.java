package infres.ws.soap.model;

import java.util.Date;
import java.util.Map;

public class Reservation {

    private int id; // Un identifiant unique pour la réservation
    private int roomId; // La chambre réservée
    private Hotel hotel; // L'hôtel dans lequel la chambre est réservée
    private Date startDate; // La date de début de la réservation
    private Date endDate; // La date de fin de la réservation
    private String customerName; // Le nom du client qui a fait la réservation

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
