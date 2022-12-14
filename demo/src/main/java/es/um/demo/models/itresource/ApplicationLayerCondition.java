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
 * <p>Java class for ApplicationLayerCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationLayerCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="httpCondition" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}HTTPCondition" minOccurs="0"/&gt;
 *         &lt;element name="fileExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxconn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dst_domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="src_domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_regex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationLayerCondition", propOrder = {
    "applicationProtocol",
    "url",
    "httpCondition",
    "fileExtension",
    "mimeType",
    "maxconn",
    "dstDomain",
    "srcDomain",
    "urlRegex"
})
@XmlSeeAlso({
    IoTApplicationLayerCondition.class
})
public class ApplicationLayerCondition {

    protected String applicationProtocol;
    @XmlElement(name = "URL")
    protected String url;
    protected HTTPCondition httpCondition;
    protected String fileExtension;
    protected String mimeType;
    protected Integer maxconn;
    @XmlElement(name = "dst_domain")
    protected String dstDomain;
    @XmlElement(name = "src_domain")
    protected String srcDomain;
    @XmlElement(name = "URL_regex")
    protected String urlRegex;

    /**
     * Gets the value of the applicationProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationProtocol() {
        return applicationProtocol;
    }

    /**
     * Sets the value of the applicationProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationProtocol(String value) {
        this.applicationProtocol = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the httpCondition property.
     * 
     * @return
     *     possible object is
     *     {@link HTTPCondition }
     *     
     */
    public HTTPCondition getHttpCondition() {
        return httpCondition;
    }

    /**
     * Sets the value of the httpCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTTPCondition }
     *     
     */
    public void setHttpCondition(HTTPCondition value) {
        this.httpCondition = value;
    }

    /**
     * Gets the value of the fileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * Sets the value of the fileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileExtension(String value) {
        this.fileExtension = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the maxconn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxconn() {
        return maxconn;
    }

    /**
     * Sets the value of the maxconn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxconn(Integer value) {
        this.maxconn = value;
    }

    /**
     * Gets the value of the dstDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstDomain() {
        return dstDomain;
    }

    /**
     * Sets the value of the dstDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstDomain(String value) {
        this.dstDomain = value;
    }

    /**
     * Gets the value of the srcDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcDomain() {
        return srcDomain;
    }

    /**
     * Sets the value of the srcDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcDomain(String value) {
        this.srcDomain = value;
    }

    /**
     * Gets the value of the urlRegex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLRegex() {
        return urlRegex;
    }

    /**
     * Sets the value of the urlRegex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLRegex(String value) {
        this.urlRegex = value;
    }

}
