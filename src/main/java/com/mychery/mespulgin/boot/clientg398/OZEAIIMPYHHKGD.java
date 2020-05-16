
package com.mychery.mespulgin.boot.clientg398;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Z_EAI_IMP_YHHK_GD"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="IS_COMMON" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD}ZSEAICOMMON" minOccurs="0"/&gt;
 *                   &lt;element name="IT_ITEM" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD}ZFEAIYHHK" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="T_PROPERTY" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD}ZTEAIPROPERTY" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "", propOrder = {
    "zeaiimpyhhkgd"
})
@XmlRootElement(name = "O_Z_EAI_IMP_YHHK_GD", namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD")
public class OZEAIIMPYHHKGD {

    @XmlElement(name = "Z_EAI_IMP_YHHK_GD", namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD", required = true)
    protected ZEAIIMPYHHKGD zeaiimpyhhkgd;

    /**
     * ��ȡzeaiimpyhhkgd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ZEAIIMPYHHKGD }
     *     
     */
    public ZEAIIMPYHHKGD getZEAIIMPYHHKGD() {
        return zeaiimpyhhkgd;
    }

    /**
     * ����zeaiimpyhhkgd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ZEAIIMPYHHKGD }
     *     
     */
    public void setZEAIIMPYHHKGD(ZEAIIMPYHHKGD value) {
        this.zeaiimpyhhkgd = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="IS_COMMON" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD}ZSEAICOMMON" minOccurs="0"/&gt;
     *         &lt;element name="IT_ITEM" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD}ZFEAIYHHK" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="T_PROPERTY" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD}ZTEAIPROPERTY" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class ZEAIIMPYHHKGD {

        @XmlElement(name = "IS_COMMON", namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD")
        protected ZSEAICOMMON iscommon;
        @XmlElement(name = "IT_ITEM", namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD")
        protected ITITEM ititem;
        @XmlElement(name = "T_PROPERTY", namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD")
        protected TPROPERTY tproperty;

        /**
         * ��ȡiscommon���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ZSEAICOMMON }
         *     
         */
        public ZSEAICOMMON getISCOMMON() {
            return iscommon;
        }

        /**
         * ����iscommon���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ZSEAICOMMON }
         *     
         */
        public void setISCOMMON(ZSEAICOMMON value) {
            this.iscommon = value;
        }

        /**
         * ��ȡititem���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ITITEM }
         *     
         */
        public ITITEM getITITEM() {
            return ititem;
        }

        /**
         * ����ititem���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ITITEM }
         *     
         */
        public void setITITEM(ITITEM value) {
            this.ititem = value;
        }

        /**
         * ��ȡtproperty���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link TPROPERTY }
         *     
         */
        public TPROPERTY getTPROPERTY() {
            return tproperty;
        }

        /**
         * ����tproperty���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link TPROPERTY }
         *     
         */
        public void setTPROPERTY(TPROPERTY value) {
            this.tproperty = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD}ZFEAIYHHK" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class ITITEM {

            @XmlElement(namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD")
            protected List<ZFEAIYHHK> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZFEAIYHHK }
             * 
             * 
             */
            public List<ZFEAIYHHK> getItem() {
                if (item == null) {
                    item = new ArrayList<ZFEAIYHHK>();
                }
                return this.item;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD}ZTEAIPROPERTY" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class TPROPERTY {

            @XmlElement(namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_YHHK_GD")
            protected List<ZTEAIPROPERTY> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZTEAIPROPERTY }
             * 
             * 
             */
            public List<ZTEAIPROPERTY> getItem() {
                if (item == null) {
                    item = new ArrayList<ZTEAIPROPERTY>();
                }
                return this.item;
            }

        }

    }

}
