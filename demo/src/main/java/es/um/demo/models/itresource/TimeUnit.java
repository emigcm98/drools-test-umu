//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.22 at 01:37:53 PM CET 
//


package es.um.demo.models.itresource;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SECOND"/&gt;
 *     &lt;enumeration value="MINUTE"/&gt;
 *     &lt;enumeration value="HOUR"/&gt;
 *     &lt;enumeration value="DAY"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="MONTH"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeUnit")
@XmlEnum
public enum TimeUnit {

    SECOND,
    MINUTE,
    HOUR,
    DAY,
    WEEK,
    MONTH,
    YEAR;

    public String value() {
        return name();
    }

    public static TimeUnit fromValue(String v) {
        return valueOf(v);
    }

}
