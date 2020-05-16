package com.mychery.mespulgin.boot.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Created by IT000289 on 2020/4/24.
 */
public class Body2 {
    @XmlElement
    private  String RESULT_FLAG; //成功标志

    @XmlElement
    private  String MSG;  //结果信息

    @XmlElement
    private  String ErrorCode;  //错误码

    @XmlElement
    private  String ErrorInfo;  //错误信息

    @XmlTransient
    public String getRESULT_FLAG() {
        return RESULT_FLAG;
    }

    public void setRESULT_FLAG(String RESULT_FLAG) {
        this.RESULT_FLAG = RESULT_FLAG;
    }

    @XmlTransient
    public String getMSG() {
        return MSG;
    }

    public void setMSG(String MSG) {
        this.MSG = MSG;
    }


    @XmlTransient
    public String getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(String errorCode) {
        ErrorCode = errorCode;
    }

    @XmlTransient
    public String getErrorInfo() {
        return ErrorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        ErrorInfo = errorInfo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Body2{");
        sb.append("RESULT_FLAG='").append(RESULT_FLAG).append('\'');
        sb.append(", MSG='").append(MSG).append('\'');
        sb.append(", ErrorCode='").append(ErrorCode).append('\'');
        sb.append(", ErrorInfo='").append(ErrorInfo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
