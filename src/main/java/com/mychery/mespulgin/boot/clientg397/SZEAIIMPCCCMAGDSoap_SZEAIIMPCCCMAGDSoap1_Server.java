
package com.mychery.mespulgin.boot.clientg397;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-04-21T13:07:50.638+08:00
 * Generated source version: 3.3.5
 *
 */

public class SZEAIIMPCCCMAGDSoap_SZEAIIMPCCCMAGDSoap1_Server{

    protected SZEAIIMPCCCMAGDSoap_SZEAIIMPCCCMAGDSoap1_Server() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new S_Z_EAI_IMP_CCCMA_GDSoap1Impl();
        String address = "http://10.1.3.178:6001/OSB_MNGT/Proxy/DynamicProxy";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws Exception {
        new SZEAIIMPCCCMAGDSoap_SZEAIIMPCCCMAGDSoap1_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
