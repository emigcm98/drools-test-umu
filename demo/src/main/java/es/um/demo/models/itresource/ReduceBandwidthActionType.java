//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.22 at 01:37:53 PM CET 
//


package es.um.demo.models.itresource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReduceBandwidthActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReduceBandwidthActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="downlink_bandwidth_value" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="uplink_bandwidth_value" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReduceBandwidthActionType")
public class ReduceBandwidthActionType {

    @XmlAttribute(name = "downlink_bandwidth_value")
    protected Double downlinkBandwidthValue;
    @XmlAttribute(name = "uplink_bandwidth_value")
    protected Double uplinkBandwidthValue;

    /**
     * Gets the value of the downlinkBandwidthValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDownlinkBandwidthValue() {
        return downlinkBandwidthValue;
    }

    /**
     * Sets the value of the downlinkBandwidthValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDownlinkBandwidthValue(Double value) {
        this.downlinkBandwidthValue = value;
    }

    /**
     * Gets the value of the uplinkBandwidthValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUplinkBandwidthValue() {
        return uplinkBandwidthValue;
    }

    /**
     * Sets the value of the uplinkBandwidthValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUplinkBandwidthValue(Double value) {
        this.uplinkBandwidthValue = value;
    }

}
