
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
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.12
 * 2020-03-20T17:12:12.530-07:00
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
        System.out.println("Invoking insertProduct...");
        com.reactiveworks.productservice.service.Product _insertProduct_arg0 = new com.reactiveworks.productservice.service.Product();
        _insertProduct_arg0.setManufecturedDt(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2020-03-20T17:12:12.574-07:00"));
        _insertProduct_arg0.setProductId(892863559);
        _insertProduct_arg0.setProductName("ProductName-2000783956");
        _insertProduct_arg0.setProductType("ProductType154753965");
        try {
            port.insertProduct(_insertProduct_arg0);

        } catch (UnableToReadPropertyFileException_Exception e) {
            System.out.println("Expected exception: UnableToReadPropertyFileException has occurred.");
            System.out.println(e.toString());
        } catch (DataBaseAccessFailureException_Exception e) {
            System.out.println("Expected exception: DataBaseAccessFailureException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getProducts...");
        try {
            java.util.List<com.reactiveworks.productservice.service.Product> _getProducts__return = port.getProducts();
            System.out.println("getProducts.result=" + _getProducts__return);

        } catch (UnableToReadPropertyFileException_Exception e) {
            System.out.println("Expected exception: UnableToReadPropertyFileException has occurred.");
            System.out.println(e.toString());
        } catch (DataBaseAccessFailureException_Exception e) {
            System.out.println("Expected exception: DataBaseAccessFailureException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteProduct...");
        int _deleteProduct_arg0 = -1329697034;
        try {
            port.deleteProduct(_deleteProduct_arg0);

        } catch (UnableToReadPropertyFileException_Exception e) {
            System.out.println("Expected exception: UnableToReadPropertyFileException has occurred.");
            System.out.println(e.toString());
        } catch (DataBaseAccessFailureException_Exception e) {
            System.out.println("Expected exception: DataBaseAccessFailureException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getProduct...");
        int _getProduct_arg0 = -127436037;
        try {
            com.reactiveworks.productservice.service.Product _getProduct__return = port.getProduct(_getProduct_arg0);
            System.out.println("getProduct.result=" + _getProduct__return);

        } catch (UnableToReadPropertyFileException_Exception e) {
            System.out.println("Expected exception: UnableToReadPropertyFileException has occurred.");
            System.out.println(e.toString());
        } catch (DataBaseAccessFailureException_Exception e) {
            System.out.println("Expected exception: DataBaseAccessFailureException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
