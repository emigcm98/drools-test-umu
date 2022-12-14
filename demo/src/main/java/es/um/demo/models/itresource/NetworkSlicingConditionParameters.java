//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.22 at 01:37:53 PM CET 
//


package es.um.demo.models.itresource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkSlicingConditionParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkSlicingConditionParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceMAC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DestinationMAC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SliceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkSlicingConditionParameters", propOrder = {
    "sourceMAC",
    "destinationMAC",
    "sliceID"
})
public class NetworkSlicingConditionParameters {

    @XmlElement(name = "SourceMAC", required = true)
    protected String sourceMAC;
    @XmlElement(name = "DestinationMAC", required = true)
    protected String destinationMAC;
    @XmlElement(name = "SliceID", required = true)
    protected String sliceID;

    /**
     * Gets the value of the sourceMAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceMAC() {
        return sourceMAC;
    }

    /**
     * Sets the value of the sourceMAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceMAC(String value) {
        this.sourceMAC = value;
    }

    /**
     * Gets the value of the destinationMAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationMAC() {
        return destinationMAC;
    }

    /**
     * Sets the value of the destinationMAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationMAC(String value) {
        this.destinationMAC = value;
    }

    /**
     * Gets the value of the sliceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSliceID() {
        return sliceID;
    }

    /**
     * Sets the value of the sliceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSliceID(String value) {
        this.sliceID = value;
    }

}
