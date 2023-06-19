package infres.ws.soap.standalone;

import infres.ws.soap.endpoint.ReservationWebServiceImpl;
import infres.ws.soap.endpoint.RoomWebServiceImpl;

import jakarta.xml.ws.Endpoint;

public class StandaloneServer {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/room", new RoomWebServiceImpl());
        Endpoint.publish("http://localhost:8080/reservation", new ReservationWebServiceImpl());
    }

}
