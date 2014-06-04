package br.com.server;

public class InfoAeroportoProxy implements br.com.server.InfoAeroporto {
  private String _endpoint = null;
  private br.com.server.InfoAeroporto infoAeroporto = null;
  
  public InfoAeroportoProxy() {
    _initInfoAeroportoProxy();
  }
  
  public InfoAeroportoProxy(String endpoint) {
    _endpoint = endpoint;
    _initInfoAeroportoProxy();
  }
  
  private void _initInfoAeroportoProxy() {
    try {
      infoAeroporto = (new br.com.server.InfoAreoportoServerLocator()).getInfoAeroportoPort();
      if (infoAeroporto != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)infoAeroporto)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)infoAeroporto)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (infoAeroporto != null)
      ((javax.xml.rpc.Stub)infoAeroporto)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.server.InfoAeroporto getInfoAeroporto() {
    if (infoAeroporto == null)
      _initInfoAeroportoProxy();
    return infoAeroporto;
  }
  
  public br.com.server.InfoRotaBean getAeroportos(java.lang.String cidadeOrigem, java.lang.String paisOrigem, java.lang.String cidadeDestino, java.lang.String paisDestino) throws java.rmi.RemoteException{
    if (infoAeroporto == null)
      _initInfoAeroportoProxy();
    return infoAeroporto.getAeroportos(cidadeOrigem, paisOrigem, cidadeDestino, paisDestino);
  }
  
  public br.com.server.PaisBean getPais(java.lang.String pais) throws java.rmi.RemoteException{
    if (infoAeroporto == null)
      _initInfoAeroportoProxy();
    return infoAeroporto.getPais(pais);
  }
  
  
}