
package infres.ws.client.generated;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the infres.ws.soap.endpoint package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: infres.ws.soap.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Room }
     * 
     * @return
     *     the new instance of {@link Room }
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     * @return
     *     the new instance of {@link Reservation }
     */
    public Reservation createReservation() {
        return new Reservation();
    }

}
