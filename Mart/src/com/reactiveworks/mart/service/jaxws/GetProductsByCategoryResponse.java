
package com.reactiveworks.mart.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Fri Mar 13 16:54:16 PDT 2020
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "getProductsByCategoryResponse", namespace = "http://service.mart.reactiveworks.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductsByCategoryResponse", namespace = "http://service.mart.reactiveworks.com/")

public class GetProductsByCategoryResponse {

    @XmlElement(name = "return")
    private java.util.List<java.lang.String> _return;

    public java.util.List<java.lang.String> getReturn() {
        return this._return;
    }

    public void setReturn(java.util.List<java.lang.String> new_return)  {
        this._return = new_return;
    }

}

