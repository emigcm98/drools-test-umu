//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.22 at 01:37:53 PM CET 
//


package es.um.demo.models.itresource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafeNet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SafeNet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="SafeSurfprofanity"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SafeSurfheterosexualthemes"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SafeSurfhomosexualthemes"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SafeSurfviolence"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SafeSurfdruguse"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SafeSurfotheradultthemes"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SafeSurfgambling"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minExclusive value="0"/&gt;
 *             &lt;maxExclusive value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafeNet")
public class SafeNet {

    @XmlAttribute(name = "SafeSurfprofanity")
    protected Integer safeSurfprofanity;
    @XmlAttribute(name = "SafeSurfheterosexualthemes")
    protected Integer safeSurfheterosexualthemes;
    @XmlAttribute(name = "SafeSurfhomosexualthemes")
    protected Integer safeSurfhomosexualthemes;
    @XmlAttribute(name = "SafeSurfviolence")
    protected Integer safeSurfviolence;
    @XmlAttribute(name = "SafeSurfdruguse")
    protected Integer safeSurfdruguse;
    @XmlAttribute(name = "SafeSurfotheradultthemes")
    protected Integer safeSurfotheradultthemes;
    @XmlAttribute(name = "SafeSurfgambling")
    protected Integer safeSurfgambling;

    /**
     * Gets the value of the safeSurfprofanity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSafeSurfprofanity() {
        return safeSurfprofanity;
    }

    /**
     * Sets the value of the safeSurfprofanity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSafeSurfprofanity(Integer value) {
        this.safeSurfprofanity = value;
    }

    /**
     * Gets the value of the safeSurfheterosexualthemes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSafeSurfheterosexualthemes() {
        return safeSurfheterosexualthemes;
    }

    /**
     * Sets the value of the safeSurfheterosexualthemes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSafeSurfheterosexualthemes(Integer value) {
        this.safeSurfheterosexualthemes = value;
    }

    /**
     * Gets the value of the safeSurfhomosexualthemes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSafeSurfhomosexualthemes() {
        return safeSurfhomosexualthemes;
    }

    /**
     * Sets the value of the safeSurfhomosexualthemes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSafeSurfhomosexualthemes(Integer value) {
        this.safeSurfhomosexualthemes = value;
    }

    /**
     * Gets the value of the safeSurfviolence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSafeSurfviolence() {
        return safeSurfviolence;
    }

    /**
     * Sets the value of the safeSurfviolence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSafeSurfviolence(Integer value) {
        this.safeSurfviolence = value;
    }

    /**
     * Gets the value of the safeSurfdruguse property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSafeSurfdruguse() {
        return safeSurfdruguse;
    }

    /**
     * Sets the value of the safeSurfdruguse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSafeSurfdruguse(Integer value) {
        this.safeSurfdruguse = value;
    }

    /**
     * Gets the value of the safeSurfotheradultthemes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSafeSurfotheradultthemes() {
        return safeSurfotheradultthemes;
    }

    /**
     * Sets the value of the safeSurfotheradultthemes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSafeSurfotheradultthemes(Integer value) {
        this.safeSurfotheradultthemes = value;
    }

    /**
     * Gets the value of the safeSurfgambling property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSafeSurfgambling() {
        return safeSurfgambling;
    }

    /**
     * Sets the value of the safeSurfgambling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSafeSurfgambling(Integer value) {
        this.safeSurfgambling = value;
    }

}
