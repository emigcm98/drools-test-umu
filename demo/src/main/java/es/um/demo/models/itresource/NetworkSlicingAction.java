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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkSlicingAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkSlicingAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}ConfigurationAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkSlicingActionType" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}NetworkSlicingActionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkSlicingAction", propOrder = {
    "networkSlicingActionType"
})
public class NetworkSlicingAction
    extends ConfigurationAction
{

    @XmlElement(name = "NetworkSlicingActionType", required = true)
    @XmlSchemaType(name = "string")
    protected NetworkSlicingActionType networkSlicingActionType;

    /**
     * Gets the value of the networkSlicingActionType property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSlicingActionType }
     *     
     */
    public NetworkSlicingActionType getNetworkSlicingActionType() {
        return networkSlicingActionType;
    }

    /**
     * Sets the value of the networkSlicingActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSlicingActionType }
     *     
     */
    public void setNetworkSlicingActionType(NetworkSlicingActionType value) {
        this.networkSlicingActionType = value;
    }

}
