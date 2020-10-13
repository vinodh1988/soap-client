/**
 * FirstServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ws;

public class FirstServiceServiceLocator extends org.apache.axis.client.Service implements com.ws.FirstServiceService {

    public FirstServiceServiceLocator() {
    }


    public FirstServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FirstServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FirstServicePort
    private java.lang.String FirstServicePort_address = "http://localhost:8080/soapservice/services/FirstServicePort";

    public java.lang.String getFirstServicePortAddress() {
        return FirstServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FirstServicePortWSDDServiceName = "FirstServicePort";

    public java.lang.String getFirstServicePortWSDDServiceName() {
        return FirstServicePortWSDDServiceName;
    }

    public void setFirstServicePortWSDDServiceName(java.lang.String name) {
        FirstServicePortWSDDServiceName = name;
    }

    public com.ws.FirstService getFirstServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FirstServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFirstServicePort(endpoint);
    }

    public com.ws.FirstService getFirstServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ws.FirstServiceServiceSoapBindingStub _stub = new com.ws.FirstServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getFirstServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFirstServicePortEndpointAddress(java.lang.String address) {
        FirstServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ws.FirstService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ws.FirstServiceServiceSoapBindingStub _stub = new com.ws.FirstServiceServiceSoapBindingStub(new java.net.URL(FirstServicePort_address), this);
                _stub.setPortName(getFirstServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FirstServicePort".equals(inputPortName)) {
            return getFirstServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.com/", "FirstServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.com/", "FirstServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FirstServicePort".equals(portName)) {
            setFirstServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
