package com.mychery.mespulgin.boot.entity.Q059;

import com.mychery.mespulgin.boot.entity.Q058.VehicleLogisticsDetail;

import java.util.ArrayList;
import java.util.List;

public class CertificateInfo implements java.io.Serializable{

    private static final long serialVersionUID = -5476946714386941383L;

    private String channelCode ;

    private String sum ;

    private List<CertificateInfoDetail> certificateInfoDetails = new ArrayList<>();

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public List<CertificateInfoDetail> getCertificateInfoDetails() {
        return certificateInfoDetails;
    }

    public void setCertificateInfoDetails(List<CertificateInfoDetail> certificateInfoDetails) {
        this.certificateInfoDetails = certificateInfoDetails;
    }
}
