//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.22 at 01:37:53 PM CET 
//


package es.um.demo.models.itresource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilteringConfigurationCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilteringConfigurationCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}ConfigurationCondition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packetFilterCondition" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}PacketFilterCondition" minOccurs="0"/&gt;
 *         &lt;element name="statefulCondition" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}StatefulCondition" minOccurs="0"/&gt;
 *         &lt;element name="timeCondition" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}TimeCondition" minOccurs="0"/&gt;
 *         &lt;element name="applicationLayerCondition" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}ApplicationLayerCondition" minOccurs="0"/&gt;
 *         &lt;element name="qosCondition" type="{http://modeliosoft/xsddesigner/a22bd60b-ee3d-425c-8618-beb6a854051a/ITResource.xsd}QoSCondition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilteringConfigurationCondition", propOrder = {
    "packetFilterCondition",
    "statefulCondition",
    "timeCondition",
    "applicationLayerCondition",
    "qosCondition"
})
@XmlSeeAlso({
    PrivacyConfigurationCondition.class,
    DataAggregationConfigurationCondition.class,
    AnonymityConfigurationCondition.class,
    MonitoringConfigurationCondition.class,
    TrafficDivertConfigurationCondition.class,
    AuthorizationCondition.class,
    AuthenticationCondition.class
})
public class FilteringConfigurationCondition
    extends ConfigurationCondition
{

    protected PacketFilterCondition packetFilterCondition;
    protected StatefulCondition statefulCondition;
    protected TimeCondition timeCondition;
    protected ApplicationLayerCondition applicationLayerCondition;
    protected QoSCondition qosCondition;

    /**
     * Gets the value of the packetFilterCondition property.
     * 
     * @return
     *     possible object is
     *     {@link PacketFilterCondition }
     *     
     */
    public PacketFilterCondition getPacketFilterCondition() {
        return packetFilterCondition;
    }

    /**
     * Sets the value of the packetFilterCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacketFilterCondition }
     *     
     */
    public void setPacketFilterCondition(PacketFilterCondition value) {
        this.packetFilterCondition = value;
    }

    /**
     * Gets the value of the statefulCondition property.
     * 
     * @return
     *     possible object is
     *     {@link StatefulCondition }
     *     
     */
    public StatefulCondition getStatefulCondition() {
        return statefulCondition;
    }

    /**
     * Sets the value of the statefulCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatefulCondition }
     *     
     */
    public void setStatefulCondition(StatefulCondition value) {
        this.statefulCondition = value;
    }

    /**
     * Gets the value of the timeCondition property.
     * 
     * @return
     *     possible object is
     *     {@link TimeCondition }
     *     
     */
    public TimeCondition getTimeCondition() {
        return timeCondition;
    }

    /**
     * Sets the value of the timeCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCondition }
     *     
     */
    public void setTimeCondition(TimeCondition value) {
        this.timeCondition = value;
    }

    /**
     * Gets the value of the applicationLayerCondition property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationLayerCondition }
     *     
     */
    public ApplicationLayerCondition getApplicationLayerCondition() {
        return applicationLayerCondition;
    }

    /**
     * Sets the value of the applicationLayerCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationLayerCondition }
     *     
     */
    public void setApplicationLayerCondition(ApplicationLayerCondition value) {
        this.applicationLayerCondition = value;
    }

    /**
     * Gets the value of the qosCondition property.
     * 
     * @return
     *     possible object is
     *     {@link QoSCondition }
     *     
     */
    public QoSCondition getQosCondition() {
        return qosCondition;
    }

    /**
     * Sets the value of the qosCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link QoSCondition }
     *     
     */
    public void setQosCondition(QoSCondition value) {
        this.qosCondition = value;
    }

}
