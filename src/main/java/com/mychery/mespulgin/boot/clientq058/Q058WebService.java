package com.mychery.mespulgin.boot.clientq058;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-04-17T14:21:41.137+08:00
 * Generated source version: 3.3.5
 *
 */
@WebService(targetNamespace = "http://service.testbank.mychery.com/wsdl", name = "Q058WebService")
@XmlSeeAlso({ObjectFactory.class})
public interface Q058WebService {

    @WebMethod
    @RequestWrapper(localName = "sendReqest", targetNamespace = "http://service.testbank.mychery.com/wsdl", className = "com.mychery.mespulgin.boot.clientq058.SendReqest")
    @ResponseWrapper(localName = "sendReqestResponse", targetNamespace = "http://service.testbank.mychery.com/wsdl", className = "com.mychery.mespulgin.boot.clientq058.SendReqestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.mychery.mespulgin.boot.clientq058.ResponseResult sendReqest(

            @WebParam(name = "arg0", targetNamespace = "")
            com.mychery.mespulgin.boot.clientq058.VehicleLogistics arg0
    );
}
