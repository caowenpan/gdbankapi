package com.mychery.mespulgin.boot.clientg398;


import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.util.List;


/**
 * Created by IT000289 on 2020/4/21.
 */
public class AddSoapHeader extends AbstractSoapInterceptor {

    public AddSoapHeader() {
        super(Phase.WRITE);
    }


    /**
     * 处理soap信息
     * @param message soap信息
     */
    public void handleMessage(SoapMessage message) throws Fault {
        // SoapHeader部分待添加的节点
        createSoapHeader(message);
    }

    private void createSoapHeader(SoapMessage message) {
        QName qName = new QName("ServiceInfo");

        Document document = DOMUtils.createDocument();

        Element userEle = document.createElement("tns:user_id");
        Element passwordEle = document.createElement("tns:password");
        Element serviceEle = document.createElement("tns:service_id");
        Element operationEle = document.createElement("tns:operation");
        Element instanceEle = document.createElement("tns:instance_id");
        Element systemCodeEle = document.createElement("tns:systemCode");
        Element expand1Ele = document.createElement("tns:expand1");
        Element expand2Ele = document.createElement("tns:expand2");

        setContent(userEle, passwordEle, serviceEle, operationEle, instanceEle, systemCodeEle, expand1Ele, expand2Ele);

        Element root = document.createElementNS("http://www.bps.com.cn/OSB/xsd/common/serviceInfo","tns:ServiceInfo");
        root.appendChild(userEle);
        root.appendChild(passwordEle);
        root.appendChild(serviceEle);
        root.appendChild(operationEle);
        root.appendChild(instanceEle);
        root.appendChild(systemCodeEle);
        root.appendChild(expand1Ele);
        root.appendChild(expand2Ele);

       // System.out.println(document);


        // 创建SoapHeader内容
        SoapHeader header = new SoapHeader(qName, root);
        // 添加SoapHeader内容
        List<Header> headers = message.getHeaders();
        headers.add(header);
    }

    private void setContent(Element userEle, Element passwordEle, Element serviceEle, Element operationEle, Element instanceEle, Element systemCodeEle, Element expand1Ele, Element expand2Ele) {
       //设置EAI 用户编号
        userEle.setTextContent("22");
        //设置EAI 用户密码
        passwordEle.setTextContent("e10adc3949ba59abbe56e057f20f883e");
        //设置EAI 接口编号
        serviceEle.setTextContent("EBS_ERP_A_737");
        operationEle.setTextContent("");
        instanceEle.setTextContent("");
        systemCodeEle.setTextContent("");
        expand1Ele.setTextContent("");
        expand2Ele.setTextContent("");
    }

}

