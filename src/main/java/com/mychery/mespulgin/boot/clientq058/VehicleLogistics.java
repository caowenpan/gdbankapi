
package com.mychery.mespulgin.boot.clientq058;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>vehicleLogistics complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="vehicleLogistics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dealerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dealerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expressCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mailingNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mailingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mailingTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicleLogisticsDetails" type="{http://service.testbank.mychery.com/wsdl}vehicleLogisticsDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleLogistics", propOrder = {
    "channelCode",
    "dealerCode",
    "dealerName",
    "expressCompanyName",
    "mailingNum",
    "mailingNumber",
    "mailingTime",
    "vehicleLogisticsDetails"
})
public class VehicleLogistics {

    protected String channelCode;
    protected String dealerCode;
    protected String dealerName;
    protected String expressCompanyName;
    protected String mailingNum;
    protected String mailingNumber;
    protected String mailingTime;
    @XmlElement(nillable = true)
    protected List<VehicleLogisticsDetail> vehicleLogisticsDetails;

   /* public VehicleLogistics(List<VehicleLogisticsDetail> vehicleLogisticsDetails){
        this.vehicleLogisticsDetails = vehicleLogisticsDetails;
    }*/


//    public VehicleLogistics(List<VehicleLogisticsDetail> vehicleLogisticsDetails){
//        this.vehicleLogisticsDetails = vehicleLogisticsDetails;
//    }

    /**
     * ��ȡchannelCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * ����channelCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * ��ȡdealerCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * ����dealerCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCode(String value) {
        this.dealerCode = value;
    }

    /**
     * ��ȡdealerName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * ����dealerName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerName(String value) {
        this.dealerName = value;
    }

    /**
     * ��ȡexpressCompanyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressCompanyName() {
        return expressCompanyName;
    }

    /**
     * ����expressCompanyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressCompanyName(String value) {
        this.expressCompanyName = value;
    }

    /**
     * ��ȡmailingNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingNum() {
        return mailingNum;
    }

    /**
     * ����mailingNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingNum(String value) {
        this.mailingNum = value;
    }

    /**
     * ��ȡmailingNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingNumber() {
        return mailingNumber;
    }

    /**
     * ����mailingNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingNumber(String value) {
        this.mailingNumber = value;
    }

    /**
     * ��ȡmailingTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingTime() {
        return mailingTime;
    }

    /**
     * ����mailingTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingTime(String value) {
        this.mailingTime = value;
    }

    /**
     * Gets the value of the vehicleLogisticsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleLogisticsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleLogisticsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleLogisticsDetail }
     * 
     * 
     */
    public List<VehicleLogisticsDetail> getVehicleLogisticsDetails() {
        if (vehicleLogisticsDetails == null) {
            vehicleLogisticsDetails = new ArrayList<VehicleLogisticsDetail>();
        }
        return this.vehicleLogisticsDetails;
    }

}
