
package com.mychery.mespulgin.boot.clientg398;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>ZFEAIYHHK complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
@XmlType(name = "ZFEAIYHHK", propOrder = {
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
public class ZFEAIYHHK2 {

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
     * ��ȡbank���Ե�ֵ��
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
     * ����bank���Ե�ֵ��
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
     * ��ȡtype���Ե�ֵ��
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
     * ����type���Ե�ֵ��
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
     * ��ȡsernr���Ե�ֵ��
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
     * ����sernr���Ե�ֵ��
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
     * ��ȡkunrg���Ե�ֵ��
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
     * ����kunrg���Ե�ֵ��
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
     * ��ȡqcnnr���Ե�ֵ��
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
     * ����qcnnr���Ե�ֵ��
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
     * ��ȡzcxpzt���Ե�ֵ��
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
     * ����zcxpzt���Ե�ֵ��
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
     * ��ȡfkdat1���Ե�ֵ��
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
     * ����fkdat1���Ե�ֵ��
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
     * ��ȡname1���Ե�ֵ��
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
     * ����name1���Ե�ֵ��
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
     * ��ȡkzwi���Ե�ֵ��
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
     * ����kzwi���Ե�ֵ��
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
     * ��ȡbilld���Ե�ֵ��
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
     * ����billd���Ե�ֵ��
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
     * ��ȡbino���Ե�ֵ��
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
     * ����bino���Ե�ֵ��
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
     * ��ȡzexst1���Ե�ֵ��
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
     * ����zexst1���Ե�ֵ��
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
     * ��ȡzexst2���Ե�ֵ��
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
     * ����zexst2���Ե�ֵ��
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
     * ��ȡzexst3���Ե�ֵ��
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
     * ����zexst3���Ե�ֵ��
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
     * ��ȡzexst4���Ե�ֵ��
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
     * ����zexst4���Ե�ֵ��
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
     * ��ȡzexst5���Ե�ֵ��
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
     * ����zexst5���Ե�ֵ��
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
     * ��ȡzexst6���Ե�ֵ��
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
     * ����zexst6���Ե�ֵ��
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
     * ��ȡzexst7���Ե�ֵ��
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
     * ����zexst7���Ե�ֵ��
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
     * ��ȡzexst8���Ե�ֵ��
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
     * ����zexst8���Ե�ֵ��
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
     * ��ȡzexst9���Ե�ֵ��
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
     * ����zexst9���Ե�ֵ��
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
     * ��ȡzexst10���Ե�ֵ��
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
     * ����zexst10���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEXST10(String value) {
        this.zexst10 = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ZFEAIYHHK2{");
        sb.append("bank='").append(bank).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", sernr='").append(sernr).append('\'');
        sb.append(", kunrg='").append(kunrg).append('\'');
        sb.append(", qcnnr='").append(qcnnr).append('\'');
        sb.append(", zcxpzt='").append(zcxpzt).append('\'');
        sb.append(", fkdat1='").append(fkdat1).append('\'');
        sb.append(", name1='").append(name1).append('\'');
        sb.append(", kzwi=").append(kzwi);
        sb.append(", billd='").append(billd).append('\'');
        sb.append(", bino='").append(bino).append('\'');
        sb.append(", zexst1='").append(zexst1).append('\'');
        sb.append(", zexst2='").append(zexst2).append('\'');
        sb.append(", zexst3='").append(zexst3).append('\'');
        sb.append(", zexst4='").append(zexst4).append('\'');
        sb.append(", zexst5='").append(zexst5).append('\'');
        sb.append(", zexst6='").append(zexst6).append('\'');
        sb.append(", zexst7='").append(zexst7).append('\'');
        sb.append(", zexst8='").append(zexst8).append('\'');
        sb.append(", zexst9='").append(zexst9).append('\'');
        sb.append(", zexst10='").append(zexst10).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
