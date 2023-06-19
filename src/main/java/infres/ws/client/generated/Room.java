
package infres.ws.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour room complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="room">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="roomNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "room", propOrder = {
    "price",
    "roomNumber",
    "type"
})
public class Room {

    protected double price;
    protected int roomNumber;
    protected String type;

    /**
     * Obtient la valeur de la propri�t� price.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * D�finit la valeur de la propri�t� price.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Obtient la valeur de la propri�t� roomNumber.
     * 
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * D�finit la valeur de la propri�t� roomNumber.
     * 
     */
    public void setRoomNumber(int value) {
        this.roomNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * D�finit la valeur de la propri�t� type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
