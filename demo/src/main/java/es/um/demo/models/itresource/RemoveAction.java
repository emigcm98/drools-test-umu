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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}ConfigurationAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RemoveActionType" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}RemoveActionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveAction", propOrder = {
    "removeActionType"
})
@XmlSeeAlso({
    RemoveAdvertisementAction.class,
    RemoveTrackingTechniquesAction.class
})
public class RemoveAction
    extends ConfigurationAction
{

    @XmlElement(name = "RemoveActionType", required = true)
    protected RemoveActionType removeActionType;

    /**
     * Gets the value of the removeActionType property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveActionType }
     *     
     */
    public RemoveActionType getRemoveActionType() {
        return removeActionType;
    }

    /**
     * Sets the value of the removeActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveActionType }
     *     
     */
    public void setRemoveActionType(RemoveActionType value) {
        this.removeActionType = value;
    }

}