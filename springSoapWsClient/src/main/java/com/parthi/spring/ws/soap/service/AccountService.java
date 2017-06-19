
package com.parthi.spring.ws.soap.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "accountService", targetNamespace = "http://service.soap.ws.spring.parthi.com/", wsdlLocation = "file:/C:/data/codebase/ws/soapRest/springSoapWsClient/src/main/resources/accountService.wsdl")
public class AccountService
    extends Service
{

    private final static URL ACCOUNTSERVICE_WSDL_LOCATION;
    private final static WebServiceException ACCOUNTSERVICE_EXCEPTION;
    private final static QName ACCOUNTSERVICE_QNAME = new QName("http://service.soap.ws.spring.parthi.com/", "accountService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/data/codebase/ws/soapRest/springSoapWsClient/src/main/resources/accountService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ACCOUNTSERVICE_WSDL_LOCATION = url;
        ACCOUNTSERVICE_EXCEPTION = e;
    }

    public AccountService() {
        super(__getWsdlLocation(), ACCOUNTSERVICE_QNAME);
    }

    public AccountService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ACCOUNTSERVICE_QNAME, features);
    }

    public AccountService(URL wsdlLocation) {
        super(wsdlLocation, ACCOUNTSERVICE_QNAME);
    }

    public AccountService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ACCOUNTSERVICE_QNAME, features);
    }

    public AccountService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AccountServicePortType
     */
    @WebEndpoint(name = "accountServicePortTypeSoap11")
    public AccountServicePortType getAccountServicePortTypeSoap11() {
        return super.getPort(new QName("http://service.soap.ws.spring.parthi.com/", "accountServicePortTypeSoap11"), AccountServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccountServicePortType
     */
    @WebEndpoint(name = "accountServicePortTypeSoap11")
    public AccountServicePortType getAccountServicePortTypeSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.soap.ws.spring.parthi.com/", "accountServicePortTypeSoap11"), AccountServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACCOUNTSERVICE_EXCEPTION!= null) {
            throw ACCOUNTSERVICE_EXCEPTION;
        }
        return ACCOUNTSERVICE_WSDL_LOCATION;
    }

}
