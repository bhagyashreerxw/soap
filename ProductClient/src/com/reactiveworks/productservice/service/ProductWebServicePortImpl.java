
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.reactiveworks.productservice.service;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.12
 * 2020-03-20T19:19:52.407-07:00
 * Generated source version: 3.2.12
 *
 */

@javax.jws.WebService(
                      serviceName = "ProductWebServiceService",
                      portName = "ProductWebServicePort",
                      targetNamespace = "http://service.productservice.reactiveworks.com/",
                      wsdlLocation = "file:/C:/Users/reactiveworks13/new/ProductClient/WebContent/wsdl/productwebservice.wsdl",
                      endpointInterface = "com.reactiveworks.productservice.service.ProductWebService")

public class ProductWebServicePortImpl implements ProductWebService {

    private static final Logger LOG = Logger.getLogger(ProductWebServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.reactiveworks.productservice.service.ProductWebService#getProducts()*
     */
    public java.util.List<com.reactiveworks.productservice.service.Product> getProducts() throws ParseException_Exception   {
        LOG.info("Executing operation getProducts");
        try {
            java.util.List<com.reactiveworks.productservice.service.Product> _return = new java.util.ArrayList<com.reactiveworks.productservice.service.Product>();
            com.reactiveworks.productservice.service.Product _returnVal1 = new com.reactiveworks.productservice.service.Product();
            _returnVal1.setManufecturedDt(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2020-03-20T19:19:52.416-07:00"));
            _returnVal1.setProductId(1667921005);
            _returnVal1.setProductName("ProductName1066415245");
            _returnVal1.setProductType("ProductType2060546082");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ParseException_Exception("ParseException...");
    }

}
