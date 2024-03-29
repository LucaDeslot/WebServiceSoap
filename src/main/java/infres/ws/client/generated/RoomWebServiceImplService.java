
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
@WebServiceClient(name = "RoomWebServiceImplService", targetNamespace = "http://endpoint.soap.ws.infres/", wsdlLocation = "http://localhost:8080/room?wsdl")
public class RoomWebServiceImplService
    extends Service
{

    private static final URL ROOMWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private static final WebServiceException ROOMWEBSERVICEIMPLSERVICE_EXCEPTION;
    private static final QName ROOMWEBSERVICEIMPLSERVICE_QNAME = new QName("http://endpoint.soap.ws.infres/", "RoomWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/room?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ROOMWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        ROOMWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public RoomWebServiceImplService() {
        super(__getWsdlLocation(), ROOMWEBSERVICEIMPLSERVICE_QNAME);
    }

    public RoomWebServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ROOMWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public RoomWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, ROOMWEBSERVICEIMPLSERVICE_QNAME);
    }

    public RoomWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ROOMWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public RoomWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RoomWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RoomWebService
     */
    @WebEndpoint(name = "RoomWebServiceImplPort")
    public RoomWebService getRoomWebServiceImplPort() {
        return super.getPort(new QName("http://endpoint.soap.ws.infres/", "RoomWebServiceImplPort"), RoomWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RoomWebService
     */
    @WebEndpoint(name = "RoomWebServiceImplPort")
    public RoomWebService getRoomWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://endpoint.soap.ws.infres/", "RoomWebServiceImplPort"), RoomWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ROOMWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw ROOMWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return ROOMWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
