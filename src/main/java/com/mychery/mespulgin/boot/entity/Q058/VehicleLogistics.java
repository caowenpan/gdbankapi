package com.mychery.mespulgin.boot.entity.Q058;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VehicleLogistics implements java.io.Serializable{

    private static final long serialVersionUID = -5476946714386941383L;

    private String channelCode ;

    private String dealerCode ;

    private String dealerName ;

    private String mailingNumber ;

    private String expressCompanyName ;

    private String mailingNum ;

    private String mailingTime ;

    private List<VehicleLogisticsDetail> vehicleLogisticsDetails = new ArrayList<>();

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getMailingNumber() {
        return mailingNumber;
    }

    public void setMailingNumber(String mailingNumber) {
        this.mailingNumber = mailingNumber;
    }

    public String getExpressCompanyName() {
        return expressCompanyName;
    }

    public void setExpressCompanyName(String expressCompanyName) {
        this.expressCompanyName = expressCompanyName;
    }

    public String getMailingNum() {
        return mailingNum;
    }

    public void setMailingNum(String mailingNum) {
        this.mailingNum = mailingNum;
    }

    public String getMailingTime() {
        return mailingTime;
    }

    public void setMailingTime(String mailingTime) {
        this.mailingTime = mailingTime;
    }

    public List<VehicleLogisticsDetail> getVehicleLogisticsDetails() {
        return vehicleLogisticsDetails;
    }

    public void setVehicleLogisticsDetails(List<VehicleLogisticsDetail> vehicleLogisticsDetails) {
        this.vehicleLogisticsDetails = vehicleLogisticsDetails;
    }
}
