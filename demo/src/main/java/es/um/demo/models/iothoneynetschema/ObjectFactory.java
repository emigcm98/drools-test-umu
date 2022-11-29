//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.22 at 01:37:53 PM CET 
//


package es.um.demo.models.iothoneynetschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.iothoneynetschema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IoTHoneyNet_QNAME = new QName("http://www.example.org/IoTHoneynetSchema", "ioTHoneyNet");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.iothoneynetschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IoTHoneyNetType }
     * 
     */
    public IoTHoneyNetType createIoTHoneyNetType() {
        return new IoTHoneyNetType();
    }

    /**
     * Create an instance of {@link HoneyNetType }
     * 
     */
    public HoneyNetType createHoneyNetType() {
        return new HoneyNetType();
    }

    /**
     * Create an instance of {@link NetType }
     * 
     */
    public NetType createNetType() {
        return new NetType();
    }

    /**
     * Create an instance of {@link RouterType }
     * 
     */
    public RouterType createRouterType() {
        return new RouterType();
    }

    /**
     * Create an instance of {@link RouteType }
     * 
     */
    public RouteType createRouteType() {
        return new RouteType();
    }

    /**
     * Create an instance of {@link ContainmentGatewayType }
     * 
     */
    public ContainmentGatewayType createContainmentGatewayType() {
        return new ContainmentGatewayType();
    }

    /**
     * Create an instance of {@link HoneyPotType }
     * 
     */
    public HoneyPotType createHoneyPotType() {
        return new HoneyPotType();
    }

    /**
     * Create an instance of {@link IoTHoneyPotType }
     * 
     */
    public IoTHoneyPotType createIoTHoneyPotType() {
        return new IoTHoneyPotType();
    }

    /**
     * Create an instance of {@link IoTRouterType }
     * 
     */
    public IoTRouterType createIoTRouterType() {
        return new IoTRouterType();
    }

    /**
     * Create an instance of {@link PhysicalLocation }
     * 
     */
    public PhysicalLocation createPhysicalLocation() {
        return new PhysicalLocation();
    }

    /**
     * Create an instance of {@link IfType }
     * 
     */
    public IfType createIfType() {
        return new IfType();
    }

    /**
     * Create an instance of {@link OperatingSystemType }
     * 
     */
    public OperatingSystemType createOperatingSystemType() {
        return new OperatingSystemType();
    }

    /**
     * Create an instance of {@link SoftwareType }
     * 
     */
    public SoftwareType createSoftwareType() {
        return new SoftwareType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IoTHoneyNetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IoTHoneyNetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.org/IoTHoneynetSchema", name = "ioTHoneyNet")
    public JAXBElement<IoTHoneyNetType> createIoTHoneyNet(IoTHoneyNetType value) {
        return new JAXBElement<IoTHoneyNetType>(_IoTHoneyNet_QNAME, IoTHoneyNetType.class, null, value);
    }

}
