/**
 * InfoRotaBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.server;

public class InfoRotaBean  implements java.io.Serializable {
    private br.com.server.TempoAtualBean destino;

    private br.com.server.TempoAtualBean origem;

    public InfoRotaBean() {
    }

    public InfoRotaBean(
           br.com.server.TempoAtualBean destino,
           br.com.server.TempoAtualBean origem) {
           this.destino = destino;
           this.origem = origem;
    }


    /**
     * Gets the destino value for this InfoRotaBean.
     * 
     * @return destino
     */
    public br.com.server.TempoAtualBean getDestino() {
        return destino;
    }


    /**
     * Sets the destino value for this InfoRotaBean.
     * 
     * @param destino
     */
    public void setDestino(br.com.server.TempoAtualBean destino) {
        this.destino = destino;
    }


    /**
     * Gets the origem value for this InfoRotaBean.
     * 
     * @return origem
     */
    public br.com.server.TempoAtualBean getOrigem() {
        return origem;
    }


    /**
     * Sets the origem value for this InfoRotaBean.
     * 
     * @param origem
     */
    public void setOrigem(br.com.server.TempoAtualBean origem) {
        this.origem = origem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoRotaBean)) return false;
        InfoRotaBean other = (InfoRotaBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.destino==null && other.getDestino()==null) || 
             (this.destino!=null &&
              this.destino.equals(other.getDestino()))) &&
            ((this.origem==null && other.getOrigem()==null) || 
             (this.origem!=null &&
              this.origem.equals(other.getOrigem())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDestino() != null) {
            _hashCode += getDestino().hashCode();
        }
        if (getOrigem() != null) {
            _hashCode += getOrigem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoRotaBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.com.br/", "infoRotaBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://server.com.br/", "tempoAtualBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://server.com.br/", "tempoAtualBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
