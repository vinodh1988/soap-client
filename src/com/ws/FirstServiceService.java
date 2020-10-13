/**
 * FirstServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ws;

public interface FirstServiceService extends javax.xml.rpc.Service {
    public java.lang.String getFirstServicePortAddress();

    public com.ws.FirstService getFirstServicePort() throws javax.xml.rpc.ServiceException;

    public com.ws.FirstService getFirstServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
