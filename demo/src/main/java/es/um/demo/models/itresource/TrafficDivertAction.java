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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficDivertAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficDivertAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}ConfigurationAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrafficDivertActionType" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}TrafficDivertActionType"/&gt;
 *         &lt;element name="packetDivertAction" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}TrafficDivertConfigurationCondition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficDivertAction", propOrder = {
    "trafficDivertActionType",
    "packetDivertAction"
})
@XmlSeeAlso({
    TrafficDivertEncapsulationAction.class
})
public class TrafficDivertAction
    extends ConfigurationAction
{

    @XmlElement(name = "TrafficDivertActionType", required = true)
    @XmlSchemaType(name = "string")
    protected TrafficDivertActionType trafficDivertActionType;
    @XmlElement(required = true)
    protected TrafficDivertConfigurationCondition packetDivertAction;

    /**
     * Gets the value of the trafficDivertActionType property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficDivertActionType }
     *     
     */
    public TrafficDivertActionType getTrafficDivertActionType() {
        return trafficDivertActionType;
    }

    /**
     * Sets the value of the trafficDivertActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficDivertActionType }
     *     
     */
    public void setTrafficDivertActionType(TrafficDivertActionType value) {
        this.trafficDivertActionType = value;
    }

    /**
     * Gets the value of the packetDivertAction property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficDivertConfigurationCondition }
     *     
     */
    public TrafficDivertConfigurationCondition getPacketDivertAction() {
        return packetDivertAction;
    }

    /**
     * Sets the value of the packetDivertAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficDivertConfigurationCondition }
     *     
     */
    public void setPacketDivertAction(TrafficDivertConfigurationCondition value) {
        this.packetDivertAction = value;
    }

}