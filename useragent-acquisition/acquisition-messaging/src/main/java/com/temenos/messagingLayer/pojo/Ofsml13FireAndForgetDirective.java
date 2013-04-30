//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.20 at 02:21:10 PM IST 
//

package com.temenos.messagingLayer.pojo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * <p>
 * Java class for ofsml13FireAndForgetDirective.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="ofsml13FireAndForgetDirective">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NEVER"/>
 *     &lt;enumeration value="ALWAYS"/>
 *     &lt;enumeration value="ON-FAILURE"/>
 *     &lt;enumeration value="ON-SUCCESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum Ofsml13FireAndForgetDirective {

	ALWAYS("ALWAYS"), NEVER("NEVER"), @XmlEnumValue("ON-FAILURE")
	ON_FAILURE("ON-FAILURE"), @XmlEnumValue("ON-SUCCESS")
	ON_SUCCESS("ON-SUCCESS");
	private final String value;

	Ofsml13FireAndForgetDirective(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static Ofsml13FireAndForgetDirective fromValue(String v) {
		for (Ofsml13FireAndForgetDirective c : Ofsml13FireAndForgetDirective.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v.toString());
	}

}