//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.22 at 01:37:53 PM CET 
//


package es.um.demo.models.itresource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonitoringConfigurationCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoringConfigurationCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}FilteringConfigurationCondition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detectionFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channelProtected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="signatureList" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}SignatureList" minOccurs="0"/&gt;
 *         &lt;element name="maxCount" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}Counts" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="minCount" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}Counts" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringConfigurationCondition", propOrder = {
    "detectionFilter",
    "channelProtected",
    "signatureList",
    "maxCount",
    "minCount"
})
public class MonitoringConfigurationCondition
    extends FilteringConfigurationCondition
{

    protected String detectionFilter;
    protected Boolean channelProtected;
    protected SignatureList signatureList;
    protected List<Counts> maxCount;
    protected List<Counts> minCount;

    /**
     * Gets the value of the detectionFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectionFilter() {
        return detectionFilter;
    }

    /**
     * Sets the value of the detectionFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectionFilter(String value) {
        this.detectionFilter = value;
    }

    /**
     * Gets the value of the channelProtected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChannelProtected() {
        return channelProtected;
    }

    /**
     * Sets the value of the channelProtected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChannelProtected(Boolean value) {
        this.channelProtected = value;
    }

    /**
     * Gets the value of the signatureList property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureList }
     *     
     */
    public SignatureList getSignatureList() {
        return signatureList;
    }

    /**
     * Sets the value of the signatureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureList }
     *     
     */
    public void setSignatureList(SignatureList value) {
        this.signatureList = value;
    }

    /**
     * Gets the value of the maxCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maxCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaxCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Counts }
     * 
     * 
     */
    public List<Counts> getMaxCount() {
        if (maxCount == null) {
            maxCount = new ArrayList<Counts>();
        }
        return this.maxCount;
    }

    /**
     * Gets the value of the minCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Counts }
     * 
     * 
     */
    public List<Counts> getMinCount() {
        if (minCount == null) {
            minCount = new ArrayList<Counts>();
        }
        return this.minCount;
    }

}
