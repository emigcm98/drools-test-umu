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
 * <p>Java class for RemoveTrackingTechniquesAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveTrackingTechniquesAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}RemoveAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RemoveTrackingTechniquesActionType" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}RemoveTrackingTechniquesActionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveTrackingTechniquesAction", propOrder = {
    "removeTrackingTechniquesActionType"
})
public class RemoveTrackingTechniquesAction
    extends RemoveAction
{

    @XmlElement(name = "RemoveTrackingTechniquesActionType", required = true)
    protected RemoveTrackingTechniquesActionType removeTrackingTechniquesActionType;

    /**
     * Gets the value of the removeTrackingTechniquesActionType property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveTrackingTechniquesActionType }
     *     
     */
    public RemoveTrackingTechniquesActionType getRemoveTrackingTechniquesActionType() {
        return removeTrackingTechniquesActionType;
    }

    /**
     * Sets the value of the removeTrackingTechniquesActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveTrackingTechniquesActionType }
     *     
     */
    public void setRemoveTrackingTechniquesActionType(RemoveTrackingTechniquesActionType value) {
        this.removeTrackingTechniquesActionType = value;
    }

}
