package com.mychery.mespulgin.boot.wsImpl.config;

import com.mychery.mespulgin.boot.wsInterface.Q058WebService;
import com.mychery.mespulgin.boot.wsInterface.Q059WebService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {
    @Autowired
    private Bus bus;

    @Autowired
    Q058WebService q058WebServiceIMplementation;

    @Autowired
    Q059WebService q059WebServiceIMplementation;


    /**
     * 此方法作用是改变项目中服务名的前缀名，此处127.0.0.1或者localhost不能访问时，请使用ipconfig查看本机ip来访问
     * 此方法被注释后:wsdl访问地址为http://127.0.0.1:8080/services/user?wsdl
     * 去掉注释后：wsdl访问地址为：http://127.0.0.1:8080/soap/user?wsdl
     *
     * @return
     */
    @Bean
    //dispatcherServlet
    public ServletRegistrationBean disServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new CXFServlet(), "/qzj/*");
        return servletRegistrationBean;
    }


    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    /** JAX-WS
     * 站点服务
     * **/
    @Bean
    public Endpoint endpointQ058() {
        EndpointImpl endpoint = new EndpointImpl(bus, q058WebServiceIMplementation);
        endpoint.publish("/Q058Service");
        return endpoint;
    }

    @Bean
    public Endpoint endpointQ059() {
        EndpointImpl endpoint = new EndpointImpl(bus, q059WebServiceIMplementation);
        endpoint.publish("/Q059Service");
        return endpoint;
    }

}
