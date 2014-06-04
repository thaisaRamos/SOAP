/**
 * InfoAreoportoServerLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.server;

public class InfoAreoportoServerLocator extends org.apache.axis.client.Service implements br.com.server.InfoAreoportoServer {

    public InfoAreoportoServerLocator() {
    }


    public InfoAreoportoServerLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InfoAreoportoServerLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InfoAeroportoPort
    private java.lang.String InfoAeroportoPort_address = "http://10.9.98.241:8080/InfoAeroportos2/InfoAeroporto";

    public java.lang.String getInfoAeroportoPortAddress() {
        return InfoAeroportoPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InfoAeroportoPortWSDDServiceName = "InfoAeroportoPort";

    public java.lang.String getInfoAeroportoPortWSDDServiceName() {
        return InfoAeroportoPortWSDDServiceName;
    }

    public void setInfoAeroportoPortWSDDServiceName(java.lang.String name) {
        InfoAeroportoPortWSDDServiceName = name;
    }

    public br.com.server.InfoAeroporto getInfoAeroportoPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InfoAeroportoPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInfoAeroportoPort(endpoint);
    }

    public br.com.server.InfoAeroporto getInfoAeroportoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.server.InfoAeroportoPortBindingStub _stub = new br.com.server.InfoAeroportoPortBindingStub(portAddress, this);
            _stub.setPortName(getInfoAeroportoPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInfoAeroportoPortEndpointAddress(java.lang.String address) {
        InfoAeroportoPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.server.InfoAeroporto.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.server.InfoAeroportoPortBindingStub _stub = new br.com.server.InfoAeroportoPortBindingStub(new java.net.URL(InfoAeroportoPort_address), this);
                _stub.setPortName(getInfoAeroportoPortWSDDServiceName());
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
        if ("InfoAeroportoPort".equals(inputPortName)) {
            return getInfoAeroportoPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server.com.br/", "infoAreoportoServer");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server.com.br/", "InfoAeroportoPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InfoAeroportoPort".equals(portName)) {
            setInfoAeroportoPortEndpointAddress(address);
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
