
package com.mychery.mespulgin.boot.clientg398;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ZFEAIYHHK complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ZFEAIYHHK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BANK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SERNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KUNRG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QCNNR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZCXPZT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FKDAT1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{4}-\d{2}-\d{2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NAME1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KZWI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="11"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BILLD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{4}-\d{2}-\d{2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BINO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZEXST1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZEXST2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZEXST3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZEXST4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZEXST5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZEXST6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZEXST7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZEXST8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZEXST9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZEXST10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZFEAIYHHK", namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD", propOrder = {
    "bank",
    "type",
    "sernr",
    "kunrg",
    "qcnnr",
    "zcxpzt",
    "fkdat1",
    "name1",
    "kzwi",
    "billd",
    "bino",
    "zexst1",
    "zexst2",
    "zexst3",
    "zexst4",
    "zexst5",
    "zexst6",
    "zexst7",
    "zexst8",
    "zexst9",
    "zexst10"
})
public class ZFEAIYHHK {

    @XmlElement(name = "BANK")
    protected String bank;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "SERNR")
    protected String sernr;
    @XmlElement(name = "KUNRG")
    protected String kunrg;
    @XmlElement(name = "QCNNR")
    protected String qcnnr;
    @XmlElement(name = "ZCXPZT")
    protected String zcxpzt;
    @XmlElement(name = "FKDAT1")
    protected String fkdat1;
    @XmlElement(name = "NAME1")
    protected String name1;
    @XmlElement(name = "KZWI")
    protected BigDecimal kzwi;
    @XmlElement(name = "BILLD")
    protected String billd;
    @XmlElement(name = "BINO")
    protected String bino;
    @XmlElement(name = "ZEXST1")
    protected String zexst1;
    @XmlElement(name = "ZEXST2")
    protected String zexst2;
    @XmlElement(name = "ZEXST3")
    protected String zexst3;
    @XmlElement(name = "ZEXST4")
    protected String zexst4;
    @XmlElement(name = "ZEXST5")
    protected String zexst5;
    @XmlElement(name = "ZEXST6")
    protected String zexst6;
    @XmlElement(name = "ZEXST7")
    protected String zexst7;
    @XmlElement(name = "ZEXST8")
    protected String zexst8;
    @XmlElement(name = "ZEXST9")
    protected String zexst9;
    @XmlElement(name = "ZEXST10")
    protected String zexst10;

    /**
     * 获取bank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANK() {
        return bank;
    }

    /**
     * 设置bank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANK(String value) {
        this.bank = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * 获取sernr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERNR() {
        return sernr;
    }

    /**
     * 设置sernr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERNR(String value) {
        this.sernr = value;
    }

    /**
     * 获取kunrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKUNRG() {
        return kunrg;
    }

    /**
     * 设置kunrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKUNRG(String value) {
        this.kunrg = value;
    }

    /**
     * 获取qcnnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQCNNR() {
        return qcnnr;
    }

    /**
     * 设置qcnnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQCNNR(String value) {
        this.qcnnr = value;
    }

    /**
     * 获取zcxpzt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZCXPZT() {
        return zcxpzt;
    }

    /**
     * 设置zcxpzt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZCXPZT(String value) {
        this.zcxpzt = value;
    }

    /**
     * 获取fkdat1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKDAT1() {
        return fkdat1;
    }

    /**
     * 设置fkdat1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKDAT1(String value) {
        this.fkdat1 = value;
    }

    /**
     * 获取name1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME1() {
        return name1;
    }

    /**
     * 设置name1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME1(String value) {
        this.name1 = value;
    }

    /**
     * 获取kzwi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKZWI() {
        return kzwi;
    }

    /**
     * 设置kzwi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKZWI(BigDecimal value) {
        this.kzwi = value;
    }

    /**
     * 获取billd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLD() {
        return billd;
    }

    /**
     * 设置billd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLD(String value) {
        this.billd = value;
    }

    /**
     * 获取bino属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBINO() {
        return bino;
    }

    /**
     * 设置bino属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBINO(String value) {
        this.bino = value;
    }

    /**
     * 获取zexst1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEXST1() {
        return zexst1;
    }

    /**
     * 设置zexst1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEXST1(String value) {
        this.zexst1 = value;
    }

    /**
     * 获取zexst2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEXST2() {
        return zexst2;
    }

    /**
     * 设置zexst2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEXST2(String value) {
        this.zexst2 = value;
    }

    /**
     * 获取zexst3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEXST3() {
        return zexst3;
    }

    /**
     * 设置zexst3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEXST3(String value) {
        this.zexst3 = value;
    }

    /**
     * 获取zexst4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEXST4() {
        return zexst4;
    }

    /**
     * 设置zexst4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEXST4(String value) {
        this.zexst4 = value;
    }

    /**
     * 获取zexst5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEXST5() {
        return zexst5;
    }

    /**
     * 设置zexst5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEXST5(String value) {
        this.zexst5 = value;
    }

    /**
     * 获取zexst6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEXST6() {
        return zexst6;
    }

    /**
     * 设置zexst6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEXST6(String value) {
        this.zexst6 = value;
    }

    /**
     * 获取zexst7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEXST7() {
        return zexst7;
    }

    /**
     * 设置zexst7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEXST7(String value) {
        this.zexst7 = value;
    }

    /**
     * 获取zexst8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEXST8() {
        return zexst8;
    }

    /**
     * 设置zexst8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEXST8(String value) {
        this.zexst8 = value;
    }

    /**
     * 获取zexst9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEXST9() {
        return zexst9;
    }

    /**
     * 设置zexst9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEXST9(String value) {
        this.zexst9 = value;
    }

    /**
     * 获取zexst10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEXST10() {
        return zexst10;
    }

    /**
     * 设置zexst10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEXST10(String value) {
        this.zexst10 = value;
    }

}
