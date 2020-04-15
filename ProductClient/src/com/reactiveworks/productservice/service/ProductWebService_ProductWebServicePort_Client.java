
package com.reactiveworks.productservice.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.12
 * 2020-03-20T19:19:52.360-07:00
 * Generated source version: 3.2.12
 *
 */
public final class ProductWebService_ProductWebServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.productservice.reactiveworks.com/", "ProductWebServiceService");

    private ProductWebService_ProductWebServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ProductWebServiceService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        ProductWebServiceService ss = new ProductWebServiceService(wsdlURL, SERVICE_NAME);
        ProductWebService port = ss.getProductWebServicePort();

        {
        System.out.println("Invoking getProducts...");
        try {
            java.util.List<com.reactiveworks.productservice.service.Product> _getProducts__return = port.getProducts();
            System.out.println("getProducts.result=" + _getProducts__return);

        } catch (ParseException_Exception e) {
            System.out.println("Expected exception: ParseException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
