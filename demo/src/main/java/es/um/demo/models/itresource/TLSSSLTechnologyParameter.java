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
 * <p>Java class for TLS_SSL_TechnologyParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TLS_SSL_TechnologyParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}TechnologySpecificParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ciphers-client" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ssl-version-client" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ciphers-server" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ssl-version-server" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLS_SSL_TechnologyParameter", propOrder = {
    "ciphersClient",
    "sslVersionClient",
    "ciphersServer",
    "sslVersionServer"
})
public class TLSSSLTechnologyParameter
    extends TechnologySpecificParameters
{

    @XmlElement(name = "ciphers-client", required = true)
    protected String ciphersClient;
    @XmlElement(name = "ssl-version-client", required = true)
    protected String sslVersionClient;
    @XmlElement(name = "ciphers-server", required = true)
    protected String ciphersServer;
    @XmlElement(name = "ssl-version-server", required = true)
    protected String sslVersionServer;

    /**
     * Gets the value of the ciphersClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiphersClient() {
        return ciphersClient;
    }

    /**
     * Sets the value of the ciphersClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiphersClient(String value) {
        this.ciphersClient = value;
    }

    /**
     * Gets the value of the sslVersionClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSslVersionClient() {
        return sslVersionClient;
    }

    /**
     * Sets the value of the sslVersionClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSslVersionClient(String value) {
        this.sslVersionClient = value;
    }

    /**
     * Gets the value of the ciphersServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiphersServer() {
        return ciphersServer;
    }

    /**
     * Sets the value of the ciphersServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiphersServer(String value) {
        this.ciphersServer = value;
    }

    /**
     * Gets the value of the sslVersionServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSslVersionServer() {
        return sslVersionServer;
    }

    /**
     * Sets the value of the sslVersionServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSslVersionServer(String value) {
        this.sslVersionServer = value;
    }

}