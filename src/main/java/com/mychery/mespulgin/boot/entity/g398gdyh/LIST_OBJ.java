package com.mychery.mespulgin.boot.entity.g398gdyh;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by IT000289 on 2020/4/23.
 */
public class LIST_OBJ implements Serializable {

    //出入库类型
    @XmlElement
    public String FLOW_TYPE;
    //合格证号
    @XmlElement
    public String PI_NO;

    //VIN码
    @XmlElement
    public String VEHICLE_CODE;
    //车型名称
    @XmlElement
    public String MODEL_NAME;
    //出入库时间
    @XmlElement
    public String IO_DATETIME;

    //经销商代码
    @XmlElement
    public String DEALER_CODE;

    //经销商名称
    @XmlElement
    public String DEALER_NAME;

    //金额
    @XmlElement
    public BigDecimal AMOUNT;

    //开票日期
    @XmlElement
    public String BILL_DATE;

    //票号
    @XmlElement
    public String BILL_NO;

    //备用字段1
    @XmlElement
    public String LIST_ATTRIBUTE1;
    //备用字段2
    @XmlElement
    public String LIST_ATTRIBUTE2;
    //备用字段3
    @XmlElement
    public String LIST_ATTRIBUTE3;

    @XmlTransient
    public String getDEALER_CODE() {
        return DEALER_CODE;
    }

    public void setDEALER_CODE(String DEALER_CODE) {
        this.DEALER_CODE = DEALER_CODE;
    }

    @XmlTransient
    public String getDEALER_NAME() {
        return DEALER_NAME;
    }


    public void setDEALER_NAME(String DEALER_NAME) {
        this.DEALER_NAME = DEALER_NAME;
    }

    @XmlTransient
    public String getFLOW_TYPE() {
        return FLOW_TYPE;
    }

    public void setFLOW_TYPE(String FLOW_TYPE) {
        this.FLOW_TYPE = FLOW_TYPE;
    }

    @XmlTransient
    public String getPI_NO() {
        return PI_NO;
    }

    public void setPI_NO(String PI_NO) {
        this.PI_NO = PI_NO;
    }

    @XmlTransient
    public String getVEHICLE_CODE() {
        return VEHICLE_CODE;
    }

    public void setVEHICLE_CODE(String VEHICLE_CODE) {
        this.VEHICLE_CODE = VEHICLE_CODE;
    }

    @XmlTransient
    public String getMODEL_NAME() {
        return MODEL_NAME;
    }

    public void setMODEL_NAME(String MODEL_NAME) {
        this.MODEL_NAME = MODEL_NAME;
    }

    @XmlTransient
    public String getIO_DATETIME() {
        return IO_DATETIME;
    }

    public void setIO_DATETIME(String IO_DATETIME) {
        this.IO_DATETIME = IO_DATETIME;
    }

    @XmlTransient
    public BigDecimal getAMOUNT() {
        return AMOUNT;
    }

    public void setAMOUNT(BigDecimal AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    @XmlTransient
    public String getBILL_DATE() {
        return BILL_DATE;
    }

    public void setBILL_DATE(String BILL_DATE) {
        this.BILL_DATE = BILL_DATE;
    }

    @XmlTransient
    public String getBILL_NO() {
        return BILL_NO;
    }

    public void setBILL_NO(String BILL_NO) {
        this.BILL_NO = BILL_NO;
    }

    @XmlTransient
    public String getLIST_ATTRIBUTE1() {
        return LIST_ATTRIBUTE1;
    }

    public void setLIST_ATTRIBUTE1(String LIST_ATTRIBUTE1) {
        this.LIST_ATTRIBUTE1 = LIST_ATTRIBUTE1;
    }

    @XmlTransient
    public String getLIST_ATTRIBUTE2() {
        return LIST_ATTRIBUTE2;
    }

    public void setLIST_ATTRIBUTE2(String LIST_ATTRIBUTE2) {
        this.LIST_ATTRIBUTE2 = LIST_ATTRIBUTE2;
    }

    @XmlTransient
    public String getLIST_ATTRIBUTE3() {
        return LIST_ATTRIBUTE3;
    }

    public void setLIST_ATTRIBUTE3(String LIST_ATTRIBUTE3) {
        this.LIST_ATTRIBUTE3 = LIST_ATTRIBUTE3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LIST_OBJ{");
        sb.append("FLOW_TYPE='").append(FLOW_TYPE).append('\'');
        sb.append(", PI_NO='").append(PI_NO).append('\'');
        sb.append(", VEHICLE_CODE='").append(VEHICLE_CODE).append('\'');
        sb.append(", MODEL_NAME='").append(MODEL_NAME).append('\'');
        sb.append(", IO_DATETIME='").append(IO_DATETIME).append('\'');
        sb.append(", DEALER_CODE='").append(DEALER_CODE).append('\'');
        sb.append(", DEALER_NAME='").append(DEALER_NAME).append('\'');
        sb.append(", AMOUNT=").append(AMOUNT);
        sb.append(", BILL_DATE='").append(BILL_DATE).append('\'');
        sb.append(", BILL_NO='").append(BILL_NO).append('\'');
        sb.append(", LIST_ATTRIBUTE1='").append(LIST_ATTRIBUTE1).append('\'');
        sb.append(", LIST_ATTRIBUTE2='").append(LIST_ATTRIBUTE2).append('\'');
        sb.append(", LIST_ATTRIBUTE3='").append(LIST_ATTRIBUTE3).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
