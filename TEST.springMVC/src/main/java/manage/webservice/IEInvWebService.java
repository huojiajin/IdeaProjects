
package manage.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IEInvWebService", targetNamespace = "http://cxf.aisino.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IEInvWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "gomeData", targetNamespace = "http://cxf.aisino.com/", className = "manage.webservice.GomeData")
    @ResponseWrapper(localName = "gomeDataResponse", targetNamespace = "http://cxf.aisino.com/", className = "manage.webservice.GomeDataResponse")
    public String gomeData(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}