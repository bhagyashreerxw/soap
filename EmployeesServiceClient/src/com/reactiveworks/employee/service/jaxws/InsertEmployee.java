
package com.reactiveworks.employee.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.2.12
 * Fri Mar 20 18:53:53 PDT 2020
 * Generated source version: 3.2.12
 */

@XmlRootElement(name = "insertEmployee", namespace = "http://service.employee.reactiveworks.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertEmployee", namespace = "http://service.employee.reactiveworks.com/")

public class InsertEmployee {

    @XmlElement(name = "arg0")
    private com.reactiveworks.employee.model.Employee arg0;

    public com.reactiveworks.employee.model.Employee getArg0() {
        return this.arg0;
    }

    public void setArg0(com.reactiveworks.employee.model.Employee newArg0)  {
        this.arg0 = newArg0;
    }

}

