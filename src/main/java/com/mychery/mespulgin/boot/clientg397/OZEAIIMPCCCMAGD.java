
package com.mychery.mespulgin.boot.clientg397;

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
 *         &lt;element name="Z_EAI_IMP_CCCMA_GD"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="IS_COMMON" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD}ZSEAICOMMON" minOccurs="0"/&gt;
 *                   &lt;element name="IT_ITEM" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD}ZFEAICCCMHEADERA" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *                             &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD}ZTEAIPROPERTY" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "zeaiimpcccmagd"
})
@XmlRootElement(name = "O_Z_EAI_IMP_CCCMA_GD")
public class OZEAIIMPCCCMAGD {

    @XmlElement(name = "Z_EAI_IMP_CCCMA_GD", required = true)
    protected ZEAIIMPCCCMAGD zeaiimpcccmagd;

    /**
     * ��ȡzeaiimpcccmagd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ZEAIIMPCCCMAGD }
     *     
     */
    public ZEAIIMPCCCMAGD getZEAIIMPCCCMAGD() {
        return zeaiimpcccmagd;
    }

    /**
     * ����zeaiimpcccmagd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ZEAIIMPCCCMAGD }
     *     
     */
    public void setZEAIIMPCCCMAGD(ZEAIIMPCCCMAGD value) {
        this.zeaiimpcccmagd = value;
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
     *         &lt;element name="IS_COMMON" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD}ZSEAICOMMON" minOccurs="0"/&gt;
     *         &lt;element name="IT_ITEM" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD}ZFEAICCCMHEADERA" maxOccurs="unbounded" minOccurs="0"/&gt;
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
     *                   &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD}ZTEAIPROPERTY" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class ZEAIIMPCCCMAGD {

        @XmlElement(name = "IS_COMMON")
        protected ZSEAICOMMON iscommon;
        @XmlElement(name = "IT_ITEM")
        protected ITITEM ititem;
        @XmlElement(name = "T_PROPERTY")
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
         *         &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD}ZFEAICCCMHEADERA" maxOccurs="unbounded" minOccurs="0"/&gt;
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

            protected List<ZFEAICCCMHEADERA> item;

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
             * {@link ZFEAICCCMHEADERA }
             * 
             * 
             */
            public List<ZFEAICCCMHEADERA> getItem() {
                if (item == null) {
                    item = new ArrayList<ZFEAICCCMHEADERA>();
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
         *         &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD}ZTEAIPROPERTY" maxOccurs="unbounded" minOccurs="0"/&gt;
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
