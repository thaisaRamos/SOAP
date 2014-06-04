/**
 * InfoAeroporto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.server;

public interface InfoAeroporto extends java.rmi.Remote {
    public br.com.server.InfoRotaBean getAeroportos(java.lang.String cidadeOrigem, java.lang.String paisOrigem, java.lang.String cidadeDestino, java.lang.String paisDestino) throws java.rmi.RemoteException;
    public br.com.server.PaisBean getPais(java.lang.String pais) throws java.rmi.RemoteException;
}
