package com.mychery.mespulgin.boot.entity.Q059;

import com.mychery.mespulgin.boot.entity.Q058.VehicleLogisticsDetail;

import java.util.ArrayList;
import java.util.List;

public class CertificateInfoDetail implements java.io.Serializable{

    private static final long serialVersionUID = -5476946714386941383L;

    private String biNo ;  // 银行承兑汇票号

    private String csNo ;  // 厂商端客户号

    private String csNe ;  // 经销商名称

    private String bity ;  // 提单属性  1生成提单 4提单退回

    private String djNo ;  // Vin码

    private String biDe ;  // 提单日期 yyyyMMdd

    private String mlce ;  // 车型代码

    private String mlne ;  // 车型名称

    private String pino ;  // 合格证号

    private String bipe ;  // 提单价格

    private String orno ;  // 采购单单号

    private String reserve1 ;  // 发票号码

    public String getBiNo() {
        return biNo;
    }

    public void setBiNo(String biNo) {
        this.biNo = biNo;
    }

    public String getCsNo() {
        return csNo;
    }

    public void setCsNo(String csNo) {
        this.csNo = csNo;
    }

    public String getCsNe() {
        return csNe;
    }

    public void setCsNe(String csNe) {
        this.csNe = csNe;
    }

    public String getBity() {
        return bity;
    }

    public void setBity(String bity) {
        this.bity = bity;
    }

    public String getDjNo() {
        return djNo;
    }

    public void setDjNo(String djNo) {
        this.djNo = djNo;
    }

    public String getBiDe() {
        return biDe;
    }

    public void setBiDe(String biDe) {
        this.biDe = biDe;
    }

    public String getMlce() {
        return mlce;
    }

    public void setMlce(String mlce) {
        this.mlce = mlce;
    }

    public String getMlne() {
        return mlne;
    }

    public void setMlne(String mlne) {
        this.mlne = mlne;
    }

    public String getPino() {
        return pino;
    }

    public void setPino(String pino) {
        this.pino = pino;
    }

    public String getBipe() {
        return bipe;
    }

    public void setBipe(String bipe) {
        this.bipe = bipe;
    }

    public String getOrno() {
        return orno;
    }

    public void setOrno(String orno) {
        this.orno = orno;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }
}
