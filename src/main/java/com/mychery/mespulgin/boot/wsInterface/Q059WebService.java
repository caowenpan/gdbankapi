package com.mychery.mespulgin.boot.wsInterface;

import com.mychery.mespulgin.boot.entity.Q059.CertificateInfo;
import org.springframework.web.bind.annotation.RequestBody;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by xzh on 2017/8/21.
 */
//@WebService(name="Q058Service")//@WebService：将该接口发布成WebService服务器
@WebService(targetNamespace = "http://service.testbank.mychery.com/wsdl")
public interface Q059WebService {

    @WebMethod(action="http://service.testbank.mychery.com/sendReqest")
    public String sendReqest(@RequestBody CertificateInfo certificateInfo);

}