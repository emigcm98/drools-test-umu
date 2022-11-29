//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.22 at 01:37:53 PM CET 
//


package es.um.demo.models.iothoneynetschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ioTHoneyPotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ioTHoneyPotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.example.org/IoTHoneynetSchema}honeyPotType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.example.org/IoTHoneynetSchema}physicalLocation" minOccurs="0"/&gt;
 *         &lt;element name="resource" type="{http://www.example.org/IoTHoneynetSchema}ioTResourceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ioTHoneyPotType", propOrder = {
    "model",
    "location",
    "resource"
})
@XmlSeeAlso({
    IoTRouterType.class
})
public class IoTHoneyPotType
    extends HoneyPotType
{

    protected String model;
    protected PhysicalLocation location;
    @XmlSchemaType(name = "string")
    protected List<IoTResourceType> resource;

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalLocation }
     *     
     */
    public PhysicalLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalLocation }
     *     
     */
    public void setLocation(PhysicalLocation value) {
        this.location = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IoTResourceType }
     * 
     * 
     */
    public List<IoTResourceType> getResource() {
        if (resource == null) {
            resource = new ArrayList<IoTResourceType>();
        }
        return this.resource;
    }

}