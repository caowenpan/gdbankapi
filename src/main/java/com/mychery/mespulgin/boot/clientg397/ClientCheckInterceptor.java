package com.mychery.mespulgin.boot.clientg397;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.util.List;


/**
 * 暂时没有用到该类
 */

/**
 * Created by IT000289 on 2020/4/21.
 */
public class ClientCheckInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

    public static final String USER_ID = "22";
    public static final String PASSWORD = "e10adc3949ba59abbe56e057f20f883e";
    public static final String SERVICE_ID = "EBS_ERP_A_736";
    public static final String OPERATION = "";
    public static final String INSTANCE_ID = "";
    public static final String SYSTEMCODE = "";
    public static final String EXPAND1 = "";
    public static final String EXPAND2 = "";
    public ClientCheckInterceptor() {
        super(Phase.PREPARE_SEND);
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        List<Header> headers = message.getHeaders();
        Document document = DOMUtils.createDocument();
        Element serviceInfoEle = document.createElement("ServiceInfo");
        Element userEle = document.createElement("user_id");
        Element passwordEle = document.createElement("password");
        Element serviceEle = document.createElement("service_id");
        Element operationEle = document.createElement("operation");
        Element instanceEle = document.createElement("instance_id");
        Element systemCodeEle = document.createElement("systemCode");
        Element expand1Ele = document.createElement("expand1");
        Element expand2Ele = document.createElement("expand2");

        userEle.setTextContent(USER_ID);
        passwordEle.setTextContent(PASSWORD);
        serviceEle.setTextContent(SERVICE_ID);
        operationEle.setTextContent(OPERATION);
        instanceEle.setTextContent(INSTANCE_ID);
        systemCodeEle.setTextContent(SYSTEMCODE);
        expand1Ele.setTextContent(EXPAND1);
        expand2Ele.setTextContent(EXPAND2);


        serviceInfoEle.appendChild(userEle);
        serviceInfoEle.appendChild(passwordEle);
        serviceInfoEle.appendChild(serviceEle);
        serviceInfoEle.appendChild(operationEle);
        serviceInfoEle.appendChild(instanceEle);
        serviceInfoEle.appendChild(systemCodeEle);
        serviceInfoEle.appendChild(expand1Ele);
        serviceInfoEle.appendChild(expand2Ele);
        headers.add(new Header(new QName("http://www.bps.com.cn/OSB/xsd/common/serviceInfo","ServiceInfo","tns"),serviceInfoEle));
    }


}
