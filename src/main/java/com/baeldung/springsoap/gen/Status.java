//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.24 at 04:05:13 PM GMT+01:00 
//


package com.baeldung.springsoap.gen;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="status"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SALE"/&gt;
 *     &lt;enumeration value="RENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "status")
@XmlEnum
public enum Status {

    SALE,
    RENT;

    public String value() {
        return name();
    }

    public static Status fromValue(String v) {
        return valueOf(v);
    }

}
