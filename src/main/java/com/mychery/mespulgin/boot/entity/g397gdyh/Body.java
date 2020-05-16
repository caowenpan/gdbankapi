package com.mychery.mespulgin.boot.entity.g397gdyh;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IT000289 on 2020/4/23.
 */
public class Body implements Serializable {
    //交易代码
    @XmlElement
    private String TRANS_CODE;
    //接入机构号
    @XmlElement
    private String CHANNEL_CODE;
    //SIGN_TOKEN
    @XmlElement
    private String SIGN_TOKEN;
    //银行代码
    @XmlElement
    private String BANK_CODE;

    //总记录数
    @XmlElement
    private String TOTAL_COUNT;
    //数据日期
    @XmlElement(name="TRANS_DATE")
    private String DATE;
    //备用字段1
    @XmlElement
    private String ATTRIBUTE1;
    //备用字段2
    @XmlElement
    private String ATTRIBUTE2;
    //备用字段3
    @XmlElement
    private String ATTRIBUTE3;

    @XmlElement
    private List<LIST_OBJ> LIST_OBJ;

    @XmlTransient
    public String getTRANS_CODE() {
        return TRANS_CODE;
    }

    public void setTRANS_CODE(String TRANS_CODE) {
        this.TRANS_CODE = TRANS_CODE;
    }

    @XmlTransient
    public String getCHANNEL_CODE() {
        return CHANNEL_CODE;
    }

    public void setCHANNEL_CODE(String CHANNEL_CODE) {
        this.CHANNEL_CODE = CHANNEL_CODE;
    }

    @XmlTransient
    public String getSIGN_TOKEN() {
        return SIGN_TOKEN;
    }

    public void setSIGN_TOKEN(String SIGN_TOKEN) {
        this.SIGN_TOKEN = SIGN_TOKEN;
    }

    @XmlTransient
    public String getBANK_CODE() {
        return BANK_CODE;
    }

    public void setBANK_CODE(String BANK_CODE) {
        this.BANK_CODE = BANK_CODE;
    }
    @XmlTransient
    public String getTOTAL_COUNT() {
        return TOTAL_COUNT;
    }

    public void setTOTAL_COUNT(String TOTAL_COUNT) {
        this.TOTAL_COUNT = TOTAL_COUNT;
    }

    @XmlTransient
    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    @XmlTransient
    public String getATTRIBUTE1() {
        return ATTRIBUTE1;
    }

    public void setATTRIBUTE1(String ATTRIBUTE1) {
        this.ATTRIBUTE1 = ATTRIBUTE1;
    }

    @XmlTransient
    public String getATTRIBUTE2() {
        return ATTRIBUTE2;
    }

    public void setATTRIBUTE2(String ATTRIBUTE2) {
        this.ATTRIBUTE2 = ATTRIBUTE2;
    }

    @XmlTransient
    public String getATTRIBUTE3() {
        return ATTRIBUTE3;
    }

    public void setATTRIBUTE3(String ATTRIBUTE3) {
        this.ATTRIBUTE3 = ATTRIBUTE3;
    }

    @XmlTransient
    public List<LIST_OBJ> getLIST_OBJ() {
        if(LIST_OBJ ==null){
            LIST_OBJ =new ArrayList<LIST_OBJ>();
        }
        return this.LIST_OBJ;
    }

    public void setLIST_OBJ(List<LIST_OBJ> LIST_OBJ) {
        this.LIST_OBJ = LIST_OBJ;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Body{");
        sb.append("TRANS_CODE='").append(TRANS_CODE).append('\'');
        sb.append(", CHANNEL_CODE='").append(CHANNEL_CODE).append('\'');
        sb.append(", SIGN_TOKEN='").append(SIGN_TOKEN).append('\'');
        sb.append(", BANK_CODE='").append(BANK_CODE).append('\'');
        sb.append(", TOTAL_COUNT='").append(TOTAL_COUNT).append('\'');
        sb.append(", DATE='").append(DATE).append('\'');
        sb.append(", ATTRIBUTE1='").append(ATTRIBUTE1).append('\'');
        sb.append(", ATTRIBUTE2='").append(ATTRIBUTE2).append('\'');
        sb.append(", ATTRIBUTE3='").append(ATTRIBUTE3).append('\'');
        sb.append(", LIST_OBJ=").append(LIST_OBJ);
        sb.append('}');
        return sb.toString();
    }
}



