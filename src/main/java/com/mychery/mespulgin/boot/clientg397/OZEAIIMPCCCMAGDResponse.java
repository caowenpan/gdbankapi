
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
 *         &lt;element name="Z_EAI_IMP_CCCMA_GD.Response"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="ES_COMMON" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response}ZSEAICOMMON" minOccurs="0"/&gt;
 *                   &lt;element name="MSG" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="200"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RESULT_FLAG" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IT_ITEM" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response}ZFEAICCCMHEADERA" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *                             &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response}ZTEAIPROPERTY" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *       &lt;attribute name="cid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "zeaiimpcccmagdResponse"
})
@XmlRootElement(name = "O_Z_EAI_IMP_CCCMA_GDResponse", namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response")
public class OZEAIIMPCCCMAGDResponse {

    @XmlElement(name = "Z_EAI_IMP_CCCMA_GD.Response", namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response", required = true)
    protected ZEAIIMPCCCMAGDResponse zeaiimpcccmagdResponse;
    @XmlAttribute(name = "cid", required = true)
    protected String cid;

    /**
     * ��ȡzeaiimpcccmagdResponse���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link ZEAIIMPCCCMAGDResponse }
     *
     */
    public ZEAIIMPCCCMAGDResponse getZEAIIMPCCCMAGDResponse() {
        return zeaiimpcccmagdResponse;
    }

    /**
     * ����zeaiimpcccmagdResponse���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link ZEAIIMPCCCMAGDResponse }
     *
     */
    public void setZEAIIMPCCCMAGDResponse(ZEAIIMPCCCMAGDResponse value) {
        this.zeaiimpcccmagdResponse = value;
    }

    /**
     * ��ȡcid���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCid() {
        return cid;
    }

    /**
     * ����cid���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCid(String value) {
        this.cid = value;
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
     *         &lt;element name="ES_COMMON" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response}ZSEAICOMMON" minOccurs="0"/&gt;
     *         &lt;element name="MSG" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="200"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RESULT_FLAG" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="IT_ITEM" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response}ZFEAICCCMHEADERA" maxOccurs="unbounded" minOccurs="0"/&gt;
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
     *                   &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response}ZTEAIPROPERTY" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class ZEAIIMPCCCMAGDResponse {
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("ZEAIIMPCCCMAGDResponse{");
            sb.append("escommon=").append(escommon);
            sb.append(", msg='").append(msg).append('\'');
            sb.append(", resultflag='").append(resultflag).append('\'');
            sb.append(", ititem=").append(ititem);
            sb.append(", tproperty=").append(tproperty);
            sb.append('}');
            return sb.toString();
        }

        @XmlElement(name = "ES_COMMON", namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response")
        protected ZSEAICOMMON2 escommon;
        @XmlElement(name = "MSG", namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response")
        protected String msg;
        @XmlElement(name = "RESULT_FLAG", namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response")
        protected String resultflag;
        @XmlElement(name = "IT_ITEM", namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response")
        protected ITITEM ititem;
        @XmlElement(name = "T_PROPERTY", namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response")
        protected TPROPERTY tproperty;

        /**
         * ��ȡescommon���Ե�ֵ��
         *
         * @return
         *     possible object is
         *     {@link ZSEAICOMMON2 }
         *
         */
        public ZSEAICOMMON2 getESCOMMON() {
            return escommon;
        }

        /**
         * ����escommon���Ե�ֵ��
         *
         * @param value
         *     allowed object is
         *     {@link ZSEAICOMMON2 }
         *
         */
        public void setESCOMMON(ZSEAICOMMON2 value) {
            this.escommon = value;
        }

        /**
         * ��ȡmsg���Ե�ֵ��
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMSG() {
            return msg;
        }

        /**
         * ����msg���Ե�ֵ��
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMSG(String value) {
            this.msg = value;
        }

        /**
         * ��ȡresultflag���Ե�ֵ��
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRESULTFLAG() {
            return resultflag;
        }

        /**
         * ����resultflag���Ե�ֵ��
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRESULTFLAG(String value) {
            this.resultflag = value;
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
         *         &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response}ZFEAICCCMHEADERA" maxOccurs="unbounded" minOccurs="0"/&gt;
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

            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder("ITITEM{");
                sb.append("item=").append(item);
                sb.append('}');
                return sb.toString();
            }

            @XmlElement(namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response")
            protected List<ZFEAICCCMHEADERA2> item;

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
             * {@link ZFEAICCCMHEADERA2 }
             *
             *
             */
            public List<ZFEAICCCMHEADERA2> getItem() {
                if (item == null) {
                    item = new ArrayList<ZFEAICCCMHEADERA2>();
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
         *         &lt;element name="item" type="{urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response}ZTEAIPROPERTY" maxOccurs="unbounded" minOccurs="0"/&gt;
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


            @XmlElement(namespace = "urn:iwaysoftware:ibse:jul2003:O_Z_EAI_IMP_CCCMA_GD:response")
            protected List<ZTEAIPROPERTY2> item;

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
             * {@link ZTEAIPROPERTY2 }
             *
             *
             */
            public List<ZTEAIPROPERTY2> getItem() {
                if (item == null) {
                    item = new ArrayList<ZTEAIPROPERTY2>();
                }
                return this.item;
            }

            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder("TPROPERTY{");
                sb.append("item=").append(item);
                sb.append('}');
                return sb.toString();
            }
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OZEAIIMPCCCMAGDResponse{");
        sb.append("zeaiimpcccmagdResponse=").append(zeaiimpcccmagdResponse);
        sb.append(", cid='").append(cid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
