
package com.mychery.mespulgin.boot.clientq058;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mychery.mespulgin.boot.clientq058 package.
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

    private final static QName _SendReqest_QNAME = new QName("http://service.testbank.mychery.com/wsdl", "sendReqest");
    private final static QName _SendReqestResponse_QNAME = new QName("http://service.testbank.mychery.com/wsdl", "sendReqestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mychery.mespulgin.boot.clientq058
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendReqest }
     * 
     */
    public SendReqest createSendReqest() {
        return new SendReqest();
    }

    /**
     * Create an instance of {@link SendReqestResponse }
     * 
     */
    public SendReqestResponse createSendReqestResponse() {
        return new SendReqestResponse();
    }

    /**
     * Create an instance of {@link VehicleLogistics }
     * 
     */
    public VehicleLogistics createVehicleLogistics() {
        return new VehicleLogistics();
    }


   /* public VehicleLogistics createVehicleLogistics(List<VehicleLogisticsDetail> vehicleLogisticsDetailList){
        return  new VehicleLogistics(vehicleLogisticsDetailList);
    }*/

    /**
     * Create an instance of {@link VehicleLogisticsDetail }
     * 
     */
    public VehicleLogisticsDetail createVehicleLogisticsDetail() {
        return new VehicleLogisticsDetail();
    }

    /**
     * Create an instance of {@link ResponseResult }
     * 
     */
    public ResponseResult createResponseResult() {
        return new ResponseResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendReqest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendReqest }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.testbank.mychery.com/wsdl", name = "sendReqest")
    public JAXBElement<SendReqest> createSendReqest(SendReqest value) {
        return new JAXBElement<SendReqest>(_SendReqest_QNAME, SendReqest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendReqestResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendReqestResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.testbank.mychery.com/wsdl", name = "sendReqestResponse")
    public JAXBElement<SendReqestResponse> createSendReqestResponse(SendReqestResponse value) {
        return new JAXBElement<SendReqestResponse>(_SendReqestResponse_QNAME, SendReqestResponse.class, null, value);
    }

}
