package infres.ws.client;

import infres.ws.client.generated.Room;
import infres.ws.client.generated.RoomWebService;
import infres.ws.client.generated.RoomWebServiceImplService;

public class WebServiceClient {
    public static void main(String[] args) {
        WebServiceClient client = new WebServiceClient();
        client.doTest();
    }

    public void doTest() {
        try {
            RoomWebServiceImplService service = new RoomWebServiceImplService(); // Create a new instance of the service class generated by wsimport
            RoomWebService port = service.getRoomWebServiceImplPort(); // Get a proxy for the port to the service

            Room room = port.getRoom(1); // Invoke the web service method
            System.out.println(room.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}