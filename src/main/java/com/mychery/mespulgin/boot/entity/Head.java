package com.mychery.mespulgin.boot.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;

/**
 * Created by IT000289 on 2020/4/23.
 */
public class Head  implements Serializable {

    //渠道号
    @XmlElement
    private String ChnlNo;

    //交易码
    @XmlElement
    private String FTranCode;

    //机构号
    @XmlElement
    private String InstID;

    //终端流水号
    @XmlElement
    private String TrmSeqNum;

    //交易日期时间
    @XmlElement
    private String TranDateTime;

    //错误码
    @XmlElement
    private String ErrCode;

    @XmlTransient
    public String getChnlNo() {
        return ChnlNo;
    }

    public void setChnlNo(String chnlNo) {
        ChnlNo = chnlNo;
    }

    @XmlTransient
    public String getFTranCode() {
        return FTranCode;
    }

    public void setFTranCode(String FTranCode) {
        this.FTranCode = FTranCode;
    }

    @XmlTransient
    public String getInstID() {
        return InstID;
    }

    public void setInstID(String instID) {
        InstID = instID;
    }

    @XmlTransient
    public String getTrmSeqNum() {
        return TrmSeqNum;
    }

    public void setTrmSeqNum(String trmSeqNum) {
        TrmSeqNum = trmSeqNum;
    }

    @XmlTransient
    public String getTranDateTime() {
        return TranDateTime;
    }

    public void setTranDateTime(String tranDateTime) {
        TranDateTime = tranDateTime;
    }

    @XmlTransient
    public String getErrCode() {
        return ErrCode;
    }

    public void setErrCode(String errCode) {
        ErrCode = errCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Head{");
        sb.append("ChnlNo='").append(ChnlNo).append('\'');
        sb.append(", FTranCode='").append(FTranCode).append('\'');
        sb.append(", InstID='").append(InstID).append('\'');
        sb.append(", TrmSeqNum='").append(TrmSeqNum).append('\'');
        sb.append(", TranDateTime='").append(TranDateTime).append('\'');
        sb.append(", ErrCode='").append(ErrCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
