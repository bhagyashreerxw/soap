package com.reactiveworks.practice.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.12
 * 2020-03-20T16:52:42.292-07:00
 * Generated source version: 3.2.12
 *
 */
@WebService(targetNamespace = "http://endpoint.practice.reactiveworks.com/", name = "StudentWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface StudentWebService {

    @WebMethod
    @RequestWrapper(localName = "getStudent", targetNamespace = "http://endpoint.practice.reactiveworks.com/", className = "com.reactiveworks.practice.endpoint.GetStudent")
    @ResponseWrapper(localName = "getStudentResponse", targetNamespace = "http://endpoint.practice.reactiveworks.com/", className = "com.reactiveworks.practice.endpoint.GetStudentResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.reactiveworks.practice.endpoint.Student getStudent(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    ) throws DaoOperationFailureException_Exception, DataSourceAccessFailureDaoException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getStudents", targetNamespace = "http://endpoint.practice.reactiveworks.com/", className = "com.reactiveworks.practice.endpoint.GetStudents")
    @ResponseWrapper(localName = "getStudentsResponse", targetNamespace = "http://endpoint.practice.reactiveworks.com/", className = "com.reactiveworks.practice.endpoint.GetStudentsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.reactiveworks.practice.endpoint.Student> getStudents() throws DaoOperationFailureException_Exception, DataSourceAccessFailureDaoException_Exception;

    @WebMethod
    @RequestWrapper(localName = "deleteStudent", targetNamespace = "http://endpoint.practice.reactiveworks.com/", className = "com.reactiveworks.practice.endpoint.DeleteStudent")
    @ResponseWrapper(localName = "deleteStudentResponse", targetNamespace = "http://endpoint.practice.reactiveworks.com/", className = "com.reactiveworks.practice.endpoint.DeleteStudentResponse")
    public void deleteStudent(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    ) throws DaoOperationFailureException_Exception, DataSourceAccessFailureDaoException_Exception;
}
