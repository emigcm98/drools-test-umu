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
 * <p>Java class for IPsecTechnologyParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPsecTechnologyParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}TechnologySpecificParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IPsecProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isTunnel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="localEndpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remoteEndpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPsecTechnologyParameter", propOrder = {
    "iPsecProtocol",
    "isTunnel",
    "localEndpoint",
    "remoteEndpoint"
})
@XmlSeeAlso({
    GenericChannelProtectionTechnologyParameter.class,
    DTLSTechnologyParameter.class
})
public class IPsecTechnologyParameter
    extends TechnologySpecificParameters
{

    @XmlElement(name = "IPsecProtocol")
    protected String iPsecProtocol;
    protected Boolean isTunnel;
    protected String localEndpoint;
    protected String remoteEndpoint;

    /**
     * Gets the value of the iPsecProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPsecProtocol() {
        return iPsecProtocol;
    }

    /**
     * Sets the value of the iPsecProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPsecProtocol(String value) {
        this.iPsecProtocol = value;
    }

    /**
     * Gets the value of the isTunnel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTunnel() {
        return isTunnel;
    }

    /**
     * Sets the value of the isTunnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTunnel(Boolean value) {
        this.isTunnel = value;
    }

    /**
     * Gets the value of the localEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalEndpoint() {
        return localEndpoint;
    }

    /**
     * Sets the value of the localEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalEndpoint(String value) {
        this.localEndpoint = value;
    }

    /**
     * Gets the value of the remoteEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteEndpoint() {
        return remoteEndpoint;
    }

    /**
     * Sets the value of the remoteEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteEndpoint(String value) {
        this.remoteEndpoint = value;
    }

}
