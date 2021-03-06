
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.reactiveworks.practice.endpoint;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.12
 * 2020-03-20T16:52:42.281-07:00
 * Generated source version: 3.2.12
 *
 */

@javax.jws.WebService(
                      serviceName = "StudentWebServiceService",
                      portName = "StudentWebServicePort",
                      targetNamespace = "http://endpoint.practice.reactiveworks.com/",
                      wsdlLocation = "file:/C:/Users/reactiveworks13/new/SchoolClient/WebContent/wsdl/studentwebservice.wsdl",
                      endpointInterface = "com.reactiveworks.practice.endpoint.StudentWebService")

public class StudentWebServicePortImpl implements StudentWebService {

    private static final Logger LOG = Logger.getLogger(StudentWebServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.reactiveworks.practice.endpoint.StudentWebService#getStudent(int arg0)*
     */
    public com.reactiveworks.practice.endpoint.Student getStudent(int arg0) throws DaoOperationFailureException_Exception,  DataSourceAccessFailureDaoException_Exception   {
        LOG.info("Executing operation getStudent");
        System.out.println(arg0);
        try {
            com.reactiveworks.practice.endpoint.Student _return = new com.reactiveworks.practice.endpoint.Student();
            _return.setName("Name1926212764");
            _return.setPercentage(0.580626135302369);
            _return.setRollNo(1820068097);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DaoOperationFailureException_Exception("DaoOperationFailureException...");
        //throw new DataSourceAccessFailureDaoException_Exception("DataSourceAccessFailureDaoException...");
    }

    /* (non-Javadoc)
     * @see com.reactiveworks.practice.endpoint.StudentWebService#getStudents()*
     */
    public java.util.List<com.reactiveworks.practice.endpoint.Student> getStudents() throws DaoOperationFailureException_Exception,  DataSourceAccessFailureDaoException_Exception   {
        LOG.info("Executing operation getStudents");
        try {
            java.util.List<com.reactiveworks.practice.endpoint.Student> _return = new java.util.ArrayList<com.reactiveworks.practice.endpoint.Student>();
            com.reactiveworks.practice.endpoint.Student _returnVal1 = new com.reactiveworks.practice.endpoint.Student();
            _returnVal1.setName("Name-1282492216");
            _returnVal1.setPercentage(0.43745245491981877);
            _returnVal1.setRollNo(529971701);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DaoOperationFailureException_Exception("DaoOperationFailureException...");
        //throw new DataSourceAccessFailureDaoException_Exception("DataSourceAccessFailureDaoException...");
    }

    /* (non-Javadoc)
     * @see com.reactiveworks.practice.endpoint.StudentWebService#deleteStudent(int arg0)*
     */
    public void deleteStudent(int arg0) throws DaoOperationFailureException_Exception,  DataSourceAccessFailureDaoException_Exception   {
        LOG.info("Executing operation deleteStudent");
        System.out.println(arg0);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DaoOperationFailureException_Exception("DaoOperationFailureException...");
        //throw new DataSourceAccessFailureDaoException_Exception("DataSourceAccessFailureDaoException...");
    }

}
