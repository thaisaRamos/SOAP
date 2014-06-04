/**
 * InfoAreoportoServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.server;

public interface InfoAreoportoServer extends javax.xml.rpc.Service {
    public java.lang.String getInfoAeroportoPortAddress();

    public br.com.server.InfoAeroporto getInfoAeroportoPort() throws javax.xml.rpc.ServiceException;

    public br.com.server.InfoAeroporto getInfoAeroportoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
