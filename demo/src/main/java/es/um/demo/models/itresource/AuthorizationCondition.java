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
 * <p>Java class for AuthorizationCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}FilteringConfigurationCondition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorizationSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationCondition", propOrder = {
    "authorizationSubject",
    "authorizationTarget"
})
public class AuthorizationCondition
    extends FilteringConfigurationCondition
{

    @XmlElement(name = "AuthorizationSubject")
    protected String authorizationSubject;
    @XmlElement(name = "AuthorizationTarget")
    protected String authorizationTarget;

    /**
     * Gets the value of the authorizationSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationSubject() {
        return authorizationSubject;
    }

    /**
     * Sets the value of the authorizationSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationSubject(String value) {
        this.authorizationSubject = value;
    }

    /**
     * Gets the value of the authorizationTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationTarget() {
        return authorizationTarget;
    }

    /**
     * Sets the value of the authorizationTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationTarget(String value) {
        this.authorizationTarget = value;
    }

}
