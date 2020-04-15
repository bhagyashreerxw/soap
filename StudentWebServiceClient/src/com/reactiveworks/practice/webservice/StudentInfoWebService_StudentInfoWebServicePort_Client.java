
package com.reactiveworks.practice.webservice;

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
 * 2020-03-19T18:06:17.839-07:00
 * Generated source version: 3.2.12
 *
 */
public final class StudentInfoWebService_StudentInfoWebServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://webservice.practice.reactiveworks.com/", "StudentInfoWebServiceService");

    private StudentInfoWebService_StudentInfoWebServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = StudentInfoWebServiceService.WSDL_LOCATION;
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

        StudentInfoWebServiceService ss = new StudentInfoWebServiceService(wsdlURL, SERVICE_NAME);
        StudentInfoWebService port = ss.getStudentInfoWebServicePort();

        {
        System.out.println("Invoking getStudents...");
        try {
            java.util.List<com.reactiveworks.practice.webservice.Student> _getStudents__return = port.getStudents();
            System.out.println("getStudents.result=" + _getStudents__return);

        } catch (ParseException_Exception e) {
            System.out.println("Expected exception: ParseException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking insertStudent...");
        com.reactiveworks.practice.webservice.Student _insertStudent_arg0 = new com.reactiveworks.practice.webservice.Student();
        _insertStudent_arg0.setDob(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2020-03-19T18:06:17.879-07:00"));
        _insertStudent_arg0.setName("Name1354725414");
        _insertStudent_arg0.setPercentage(0.5541378427581566);
        _insertStudent_arg0.setRollNo(-1414507091);
        port.insertStudent(_insertStudent_arg0);


        }
        {
        System.out.println("Invoking deleteStudent...");
        int _deleteStudent_arg0 = 1356892491;
        port.deleteStudent(_deleteStudent_arg0);


        }

        System.exit(0);
    }

}
