
package manage.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the manage.webservice package. 
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

    private final static QName _GomeDataResponse_QNAME = new QName("http://cxf.aisino.com/", "gomeDataResponse");
    private final static QName _GomeData_QNAME = new QName("http://cxf.aisino.com/", "gomeData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: manage.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GomeData }
     * 
     */
    public GomeData createGomeData() {
        return new GomeData();
    }

    /**
     * Create an instance of {@link GomeDataResponse }
     * 
     */
    public GomeDataResponse createGomeDataResponse() {
        return new GomeDataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GomeDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.aisino.com/", name = "gomeDataResponse")
    public JAXBElement<GomeDataResponse> createGomeDataResponse(GomeDataResponse value) {
        return new JAXBElement<GomeDataResponse>(_GomeDataResponse_QNAME, GomeDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GomeData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.aisino.com/", name = "gomeData")
    public JAXBElement<GomeData> createGomeData(GomeData value) {
        return new JAXBElement<GomeData>(_GomeData_QNAME, GomeData.class, null, value);
    }

}
