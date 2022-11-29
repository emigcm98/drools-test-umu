//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.22 at 01:37:53 PM CET 
//


package org.example.iothoneynetschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for honeyPotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="honeyPotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="interaction_level" type="{http://www.example.org/IoTHoneynetSchema}interactionLevel"/&gt;
 *         &lt;element name="if" type="{http://www.example.org/IoTHoneynetSchema}ifType"/&gt;
 *         &lt;element name="operatingSystem" type="{http://www.example.org/IoTHoneynetSchema}operatingSystemType"/&gt;
 *         &lt;element name="software" type="{http://www.example.org/IoTHoneynetSchema}softwareType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "honeyPotType", propOrder = {
    "name",
    "interactionLevel",
    "_if",
    "operatingSystem",
    "software"
})
@XmlSeeAlso({
    IoTHoneyPotType.class
})
public class HoneyPotType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "interaction_level", required = true)
    @XmlSchemaType(name = "string")
    protected InteractionLevel interactionLevel;
    @XmlElement(name = "if", required = true)
    protected IfType _if;
    @XmlElement(required = true)
    protected OperatingSystemType operatingSystem;
    @XmlElement(required = true)
    protected SoftwareType software;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the interactionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionLevel }
     *     
     */
    public InteractionLevel getInteractionLevel() {
        return interactionLevel;
    }

    /**
     * Sets the value of the interactionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionLevel }
     *     
     */
    public void setInteractionLevel(InteractionLevel value) {
        this.interactionLevel = value;
    }

    /**
     * Gets the value of the if property.
     * 
     * @return
     *     possible object is
     *     {@link IfType }
     *     
     */
    public IfType getIf() {
        return _if;
    }

    /**
     * Sets the value of the if property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfType }
     *     
     */
    public void setIf(IfType value) {
        this._if = value;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingSystemType }
     *     
     */
    public OperatingSystemType getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Sets the value of the operatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingSystemType }
     *     
     */
    public void setOperatingSystem(OperatingSystemType value) {
        this.operatingSystem = value;
    }

    /**
     * Gets the value of the software property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareType }
     *     
     */
    public SoftwareType getSoftware() {
        return software;
    }

    /**
     * Sets the value of the software property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareType }
     *     
     */
    public void setSoftware(SoftwareType value) {
        this.software = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
