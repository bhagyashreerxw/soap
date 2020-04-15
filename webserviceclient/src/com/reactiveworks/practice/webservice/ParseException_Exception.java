
package com.reactiveworks.practice.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.12
 * 2020-03-20T10:24:46.858-07:00
 * Generated source version: 3.2.12
 */

@WebFault(name = "ParseException", targetNamespace = "http://webservice.practice.reactiveworks.com/")
public class ParseException_Exception extends Exception {

    private com.reactiveworks.practice.webservice.ParseException parseException;

    public ParseException_Exception() {
        super();
    }

    public ParseException_Exception(String message) {
        super(message);
    }

    public ParseException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ParseException_Exception(String message, com.reactiveworks.practice.webservice.ParseException parseException) {
        super(message);
        this.parseException = parseException;
    }

    public ParseException_Exception(String message, com.reactiveworks.practice.webservice.ParseException parseException, java.lang.Throwable cause) {
        super(message, cause);
        this.parseException = parseException;
    }

    public com.reactiveworks.practice.webservice.ParseException getFaultInfo() {
        return this.parseException;
    }
}
