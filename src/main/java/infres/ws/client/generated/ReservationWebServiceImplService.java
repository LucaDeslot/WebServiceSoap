
package infres.ws.client.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "ReservationWebServiceImplService", targetNamespace = "http://endpoint.soap.ws.infres/", wsdlLocation = "http://localhost:8080/reservation?wsdl")
public class ReservationWebServiceImplService
    extends Service
{

    private static final URL RESERVATIONWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private static final WebServiceException RESERVATIONWEBSERVICEIMPLSERVICE_EXCEPTION;
    private static final QName RESERVATIONWEBSERVICEIMPLSERVICE_QNAME = new QName("http://endpoint.soap.ws.infres/", "ReservationWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/reservation?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESERVATIONWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        RESERVATIONWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ReservationWebServiceImplService() {
        super(__getWsdlLocation(), RESERVATIONWEBSERVICEIMPLSERVICE_QNAME);
    }

    public ReservationWebServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESERVATIONWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public ReservationWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, RESERVATIONWEBSERVICEIMPLSERVICE_QNAME);
    }

    public ReservationWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESERVATIONWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public ReservationWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReservationWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ReservationWebService
     */
    @WebEndpoint(name = "ReservationWebServiceImplPort")
    public ReservationWebService getReservationWebServiceImplPort() {
        return super.getPort(new QName("http://endpoint.soap.ws.infres/", "ReservationWebServiceImplPort"), ReservationWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReservationWebService
     */
    @WebEndpoint(name = "ReservationWebServiceImplPort")
    public ReservationWebService getReservationWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://endpoint.soap.ws.infres/", "ReservationWebServiceImplPort"), ReservationWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESERVATIONWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw RESERVATIONWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return RESERVATIONWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
