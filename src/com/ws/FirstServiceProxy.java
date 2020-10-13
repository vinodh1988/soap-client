package com.ws;

public class FirstServiceProxy implements com.ws.FirstService {
  private String _endpoint = null;
  private com.ws.FirstService firstService = null;
  
  public FirstServiceProxy() {
    _initFirstServiceProxy();
  }
  
  public FirstServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFirstServiceProxy();
  }
  
  private void _initFirstServiceProxy() {
    try {
      firstService = (new com.ws.FirstServiceServiceLocator()).getFirstServicePort();
      if (firstService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)firstService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)firstService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (firstService != null)
      ((javax.xml.rpc.Stub)firstService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ws.FirstService getFirstService() {
    if (firstService == null)
      _initFirstServiceProxy();
    return firstService;
  }
  
  public int processNumber(int arg0, int arg1) throws java.rmi.RemoteException{
    if (firstService == null)
      _initFirstServiceProxy();
    return firstService.processNumber(arg0, arg1);
  }
  
  public java.lang.String process(java.lang.String arg0) throws java.rmi.RemoteException{
    if (firstService == null)
      _initFirstServiceProxy();
    return firstService.process(arg0);
  }
  
  
}