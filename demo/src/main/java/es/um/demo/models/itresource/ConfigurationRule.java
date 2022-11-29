//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.22 at 01:37:53 PM CET 
//


package es.um.demo.models.itresource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="configurationRuleAction" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}ConfigurationAction"/&gt;
 *         &lt;element name="configurationCondition" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}ConfigurationCondition"/&gt;
 *         &lt;element name="externalData" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}ExternalData" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isCNF" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HSPL" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}HSPL" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationRule", propOrder = {
    "configurationRuleAction",
    "configurationCondition",
    "externalData",
    "name",
    "isCNF",
    "hspl"
})
public class ConfigurationRule {

    @XmlElement(required = true)
    protected ConfigurationAction configurationRuleAction;
    @XmlElement(required = true)
    protected ConfigurationCondition configurationCondition;
    protected ExternalData externalData;
    @XmlElement(name = "Name", required = true)
    protected String name;
    protected boolean isCNF;
    @XmlElement(name = "HSPL")
    protected List<HSPL> hspl;

    /**
     * Gets the value of the configurationRuleAction property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationAction }
     *     
     */
    public ConfigurationAction getConfigurationRuleAction() {
        return configurationRuleAction;
    }

    /**
     * Sets the value of the configurationRuleAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationAction }
     *     
     */
    public void setConfigurationRuleAction(ConfigurationAction value) {
        this.configurationRuleAction = value;
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

    /**
     * Gets the value of the externalData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalData }
     *     
     */
    public ExternalData getExternalData() {
        return externalData;
    }

    /**
     * Sets the value of the externalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalData }
     *     
     */
    public void setExternalData(ExternalData value) {
        this.externalData = value;
    }

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
     * Gets the value of the isCNF property.
     * 
     */
    public boolean isIsCNF() {
        return isCNF;
    }

    /**
     * Sets the value of the isCNF property.
     * 
     */
    public void setIsCNF(boolean value) {
        this.isCNF = value;
    }

    /**
     * Gets the value of the hspl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hspl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHSPL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HSPL }
     * 
     * 
     */
    public List<HSPL> getHSPL() {
        if (hspl == null) {
            hspl = new ArrayList<HSPL>();
        }
        return this.hspl;
    }

}
