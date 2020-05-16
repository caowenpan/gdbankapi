
package com.mychery.mespulgin.boot.clientg397;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>ZFEAICCCMHEADERA complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ZFEAICCCMHEADERA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDATE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{4}-\d{2}-\d{2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BANK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
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
 *         &lt;element name="NAME1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KLIMA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KUSEB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KLIMB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="KLIMC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="5"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DATAB" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{4}-\d{2}-\d{2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DATBI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{4}-\d{2}-\d{2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AMOUNT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AMOUNT1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AMOUNT2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZRESERVE1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZRESERVE2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZRESERVE3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZRESERVE4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZRESERVE5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZRESERVE6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZRESERVE7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZRESERVE8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZRESERVE9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ZRESERVE10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
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
@XmlType(name = "ZFEAICCCMHEADERA", namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response", propOrder = {
    "idate",
    "bank",
    "kunrg",
    "name1",
    "klima",
    "kuseb",
    "klimb",
    "klimc",
    "datab",
    "datbi",
    "status",
    "amount",
    "amount1",
    "amount2",
    "zreserve1",
    "zreserve2",
    "zreserve3",
    "zreserve4",
    "zreserve5",
    "zreserve6",
    "zreserve7",
    "zreserve8",
    "zreserve9",
    "zreserve10"
})
public class ZFEAICCCMHEADERA2 {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ZFEAICCCMHEADERA2{");
        sb.append("idate='").append(idate).append('\'');
        sb.append(", bank='").append(bank).append('\'');
        sb.append(", kunrg='").append(kunrg).append('\'');
        sb.append(", name1='").append(name1).append('\'');
        sb.append(", klima=").append(klima);
        sb.append(", kuseb=").append(kuseb);
        sb.append(", klimb=").append(klimb);
        sb.append(", klimc=").append(klimc);
        sb.append(", datab='").append(datab).append('\'');
        sb.append(", datbi='").append(datbi).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", amount=").append(amount);
        sb.append(", amount1=").append(amount1);
        sb.append(", amount2=").append(amount2);
        sb.append(", zreserve1='").append(zreserve1).append('\'');
        sb.append(", zreserve2='").append(zreserve2).append('\'');
        sb.append(", zreserve3='").append(zreserve3).append('\'');
        sb.append(", zreserve4='").append(zreserve4).append('\'');
        sb.append(", zreserve5='").append(zreserve5).append('\'');
        sb.append(", zreserve6='").append(zreserve6).append('\'');
        sb.append(", zreserve7='").append(zreserve7).append('\'');
        sb.append(", zreserve8='").append(zreserve8).append('\'');
        sb.append(", zreserve9='").append(zreserve9).append('\'');
        sb.append(", zreserve10='").append(zreserve10).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @XmlElement(name = "IDATE")
    protected String idate;
    @XmlElement(name = "BANK")
    protected String bank;
    @XmlElement(name = "KUNRG")
    protected String kunrg;
    @XmlElement(name = "NAME1")
    protected String name1;
    @XmlElement(name = "KLIMA")
    protected BigDecimal klima;
    @XmlElement(name = "KUSEB")
    protected BigDecimal kuseb;
    @XmlElement(name = "KLIMB")
    protected BigDecimal klimb;
    @XmlElement(name = "KLIMC")
    protected BigDecimal klimc;
    @XmlElement(name = "DATAB")
    protected String datab;
    @XmlElement(name = "DATBI")
    protected String datbi;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "AMOUNT")
    protected BigDecimal amount;
    @XmlElement(name = "AMOUNT1")
    protected BigDecimal amount1;
    @XmlElement(name = "AMOUNT2")
    protected BigDecimal amount2;
    @XmlElement(name = "ZRESERVE1")
    protected String zreserve1;
    @XmlElement(name = "ZRESERVE2")
    protected String zreserve2;
    @XmlElement(name = "ZRESERVE3")
    protected String zreserve3;
    @XmlElement(name = "ZRESERVE4")
    protected String zreserve4;
    @XmlElement(name = "ZRESERVE5")
    protected String zreserve5;
    @XmlElement(name = "ZRESERVE6")
    protected String zreserve6;
    @XmlElement(name = "ZRESERVE7")
    protected String zreserve7;
    @XmlElement(name = "ZRESERVE8")
    protected String zreserve8;
    @XmlElement(name = "ZRESERVE9")
    protected String zreserve9;
    @XmlElement(name = "ZRESERVE10")
    protected String zreserve10;

    /**
     * ��ȡidate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDATE() {
        return idate;
    }

    /**
     * ����idate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDATE(String value) {
        this.idate = value;
    }

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
     * ��ȡklima���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKLIMA() {
        return klima;
    }

    /**
     * ����klima���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKLIMA(BigDecimal value) {
        this.klima = value;
    }

    /**
     * ��ȡkuseb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKUSEB() {
        return kuseb;
    }

    /**
     * ����kuseb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKUSEB(BigDecimal value) {
        this.kuseb = value;
    }

    /**
     * ��ȡklimb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKLIMB() {
        return klimb;
    }

    /**
     * ����klimb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKLIMB(BigDecimal value) {
        this.klimb = value;
    }

    /**
     * ��ȡklimc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKLIMC() {
        return klimc;
    }

    /**
     * ����klimc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKLIMC(BigDecimal value) {
        this.klimc = value;
    }

    /**
     * ��ȡdatab���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAB() {
        return datab;
    }

    /**
     * ����datab���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAB(String value) {
        this.datab = value;
    }

    /**
     * ��ȡdatbi���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATBI() {
        return datbi;
    }

    /**
     * ����datbi���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATBI(String value) {
        this.datbi = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * ��ȡamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNT() {
        return amount;
    }

    /**
     * ����amount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNT(BigDecimal value) {
        this.amount = value;
    }

    /**
     * ��ȡamount1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNT1() {
        return amount1;
    }

    /**
     * ����amount1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNT1(BigDecimal value) {
        this.amount1 = value;
    }

    /**
     * ��ȡamount2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNT2() {
        return amount2;
    }

    /**
     * ����amount2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNT2(BigDecimal value) {
        this.amount2 = value;
    }

    /**
     * ��ȡzreserve1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZRESERVE1() {
        return zreserve1;
    }

    /**
     * ����zreserve1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZRESERVE1(String value) {
        this.zreserve1 = value;
    }

    /**
     * ��ȡzreserve2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZRESERVE2() {
        return zreserve2;
    }

    /**
     * ����zreserve2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZRESERVE2(String value) {
        this.zreserve2 = value;
    }

    /**
     * ��ȡzreserve3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZRESERVE3() {
        return zreserve3;
    }

    /**
     * ����zreserve3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZRESERVE3(String value) {
        this.zreserve3 = value;
    }

    /**
     * ��ȡzreserve4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZRESERVE4() {
        return zreserve4;
    }

    /**
     * ����zreserve4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZRESERVE4(String value) {
        this.zreserve4 = value;
    }

    /**
     * ��ȡzreserve5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZRESERVE5() {
        return zreserve5;
    }

    /**
     * ����zreserve5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZRESERVE5(String value) {
        this.zreserve5 = value;
    }

    /**
     * ��ȡzreserve6���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZRESERVE6() {
        return zreserve6;
    }

    /**
     * ����zreserve6���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZRESERVE6(String value) {
        this.zreserve6 = value;
    }

    /**
     * ��ȡzreserve7���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZRESERVE7() {
        return zreserve7;
    }

    /**
     * ����zreserve7���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZRESERVE7(String value) {
        this.zreserve7 = value;
    }

    /**
     * ��ȡzreserve8���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZRESERVE8() {
        return zreserve8;
    }

    /**
     * ����zreserve8���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZRESERVE8(String value) {
        this.zreserve8 = value;
    }

    /**
     * ��ȡzreserve9���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZRESERVE9() {
        return zreserve9;
    }

    /**
     * ����zreserve9���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZRESERVE9(String value) {
        this.zreserve9 = value;
    }

    /**
     * ��ȡzreserve10���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZRESERVE10() {
        return zreserve10;
    }

    /**
     * ����zreserve10���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZRESERVE10(String value) {
        this.zreserve10 = value;
    }

}
