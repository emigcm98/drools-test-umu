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
 * <p>Java class for EventDependency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventDependency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}Dependency"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="configurationCondition" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}ConfigurationCondition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDependency", propOrder = {
    "eventID",
    "configurationCondition"
})
public class EventDependency
    extends Dependency
{

    @XmlElement(required = true)
    protected String eventID;
    @XmlElement(required = true)
    protected ConfigurationCondition configurationCondition;

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the configurationCondition property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationCondition }
     *     
     */
    public ConfigurationCondition getConfigurationCondition() {
        return configurationCondition;
    }

    /**
     * Sets the value of the configurationCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationCondition }
     *     
     */
    public void setConfigurationCondition(ConfigurationCondition value) {
        this.configurationCondition = value;
    }

}
