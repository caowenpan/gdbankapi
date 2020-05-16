package com.mychery.mespulgin.boot.entity.g397gdyh;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by IT000289 on 2020/4/23.
 */
public class LIST_OBJ implements Serializable {

    //经销商代码
    @XmlElement
    public String DEALER_CODE;
    //经销商名称
    @XmlElement
    public String DEALER_NAME;
    //授信额度
    @XmlElement
    public BigDecimal INI_LIMIT;
    //可用额度
    @XmlElement
    public BigDecimal AVAIL_LIMIT;
    //已用额度
    @XmlElement
    public BigDecimal USED_LIMIT;
    //保证金比例
    @XmlElement
    public BigDecimal DEPOSIT_RATIO;
    //额度生效日
    @XmlElement
    public String LIMIT_EFFECT_DATE;
    //额度到期日
    @XmlElement
    public String LIMIT_DUE_DATE;
    //额度状态
    @XmlElement
    public String STATUS;
    //汇票\借款余额
    @XmlElement
    public BigDecimal AMOUNT;
    //开票保证金
    @XmlElement
    public BigDecimal DEPOSIT_AMOUNT;
    //赎证款
    @XmlElement
    public BigDecimal RANSOM_AMOUNT;
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
    public BigDecimal getINI_LIMIT() {
        return INI_LIMIT;
    }

    public void setINI_LIMIT(BigDecimal INI_LIMIT) {
        this.INI_LIMIT = INI_LIMIT;
    }

    @XmlTransient
    public BigDecimal getAVAIL_LIMIT() {
        return AVAIL_LIMIT;
    }

    public void setAVAIL_LIMIT(BigDecimal AVAIL_LIMIT) {
        this.AVAIL_LIMIT = AVAIL_LIMIT;
    }

    @XmlTransient
    public BigDecimal getUSED_LIMIT() {
        return USED_LIMIT;
    }

    public void setUSED_LIMIT(BigDecimal USED_LIMIT) {
        this.USED_LIMIT = USED_LIMIT;
    }

    @XmlTransient
    public BigDecimal getDEPOSIT_RATIO() {
        return DEPOSIT_RATIO;
    }

    public void setDEPOSIT_RATIO(BigDecimal DEPOSIT_RATIO) {
        this.DEPOSIT_RATIO = DEPOSIT_RATIO;
    }

    @XmlTransient
    public String getLIMIT_EFFECT_DATE() {
        return LIMIT_EFFECT_DATE;
    }

    public void setLIMIT_EFFECT_DATE(String LIMIT_EFFECT_DATE) {
        this.LIMIT_EFFECT_DATE = LIMIT_EFFECT_DATE;
    }

    @XmlTransient
    public String getLIMIT_DUE_DATE() {
        return LIMIT_DUE_DATE;
    }

    public void setLIMIT_DUE_DATE(String LIMIT_DUE_DATE) {
        this.LIMIT_DUE_DATE = LIMIT_DUE_DATE;
    }

    @XmlTransient
    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    @XmlTransient
    public BigDecimal getAMOUNT() {
        return AMOUNT;
    }

    public void setAMOUNT(BigDecimal AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    @XmlTransient
    public BigDecimal getDEPOSIT_AMOUNT() {
        return DEPOSIT_AMOUNT;
    }

    public void setDEPOSIT_AMOUNT(BigDecimal DEPOSIT_AMOUNT) {
        this.DEPOSIT_AMOUNT = DEPOSIT_AMOUNT;
    }

    @XmlTransient
    public BigDecimal getRANSOM_AMOUNT() {
        return RANSOM_AMOUNT;
    }

    public void setRANSOM_AMOUNT(BigDecimal RANSOM_AMOUNT) {
        this.RANSOM_AMOUNT = RANSOM_AMOUNT;
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
        sb.append("DEALER_CODE='").append(DEALER_CODE).append('\'');
        sb.append(", DEALER_NAME='").append(DEALER_NAME).append('\'');
        sb.append(", INI_LIMIT=").append(INI_LIMIT);
        sb.append(", AVAIL_LIMIT=").append(AVAIL_LIMIT);
        sb.append(", USED_LIMIT=").append(USED_LIMIT);
        sb.append(", DEPOSIT_RATIO=").append(DEPOSIT_RATIO);
        sb.append(", LIMIT_EFFECT_DATE='").append(LIMIT_EFFECT_DATE).append('\'');
        sb.append(", LIMIT_DUE_DATE='").append(LIMIT_DUE_DATE).append('\'');
        sb.append(", STATUS='").append(STATUS).append('\'');
        sb.append(", AMOUNT=").append(AMOUNT);
        sb.append(", DEPOSIT_AMOUNT=").append(DEPOSIT_AMOUNT);
        sb.append(", RANSOM_AMOUNT=").append(RANSOM_AMOUNT);
        sb.append(", LIST_ATTRIBUTE1='").append(LIST_ATTRIBUTE1).append('\'');
        sb.append(", LIST_ATTRIBUTE2='").append(LIST_ATTRIBUTE2).append('\'');
        sb.append(", LIST_ATTRIBUTE3='").append(LIST_ATTRIBUTE3).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
