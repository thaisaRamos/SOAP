/**
 * TempoAtualBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.server;

public class TempoAtualBean  implements java.io.Serializable {
    private java.lang.String condicaoCeu;

    private java.lang.String gmt;

    private java.lang.String humidadeRealitva;

    private java.lang.String localizacao;

    private java.lang.String pontoOrvalho;

    private java.lang.String pressao;

    private java.lang.String temperatura;

    private java.lang.String tempo;

    private java.lang.String vento;

    private java.lang.String visibilidade;

    public TempoAtualBean() {
    }

    public TempoAtualBean(
           java.lang.String condicaoCeu,
           java.lang.String gmt,
           java.lang.String humidadeRealitva,
           java.lang.String localizacao,
           java.lang.String pontoOrvalho,
           java.lang.String pressao,
           java.lang.String temperatura,
           java.lang.String tempo,
           java.lang.String vento,
           java.lang.String visibilidade) {
           this.condicaoCeu = condicaoCeu;
           this.gmt = gmt;
           this.humidadeRealitva = humidadeRealitva;
           this.localizacao = localizacao;
           this.pontoOrvalho = pontoOrvalho;
           this.pressao = pressao;
           this.temperatura = temperatura;
           this.tempo = tempo;
           this.vento = vento;
           this.visibilidade = visibilidade;
    }


    /**
     * Gets the condicaoCeu value for this TempoAtualBean.
     * 
     * @return condicaoCeu
     */
    public java.lang.String getCondicaoCeu() {
        return condicaoCeu;
    }


    /**
     * Sets the condicaoCeu value for this TempoAtualBean.
     * 
     * @param condicaoCeu
     */
    public void setCondicaoCeu(java.lang.String condicaoCeu) {
        this.condicaoCeu = condicaoCeu;
    }


    /**
     * Gets the gmt value for this TempoAtualBean.
     * 
     * @return gmt
     */
    public java.lang.String getGmt() {
        return gmt;
    }


    /**
     * Sets the gmt value for this TempoAtualBean.
     * 
     * @param gmt
     */
    public void setGmt(java.lang.String gmt) {
        this.gmt = gmt;
    }


    /**
     * Gets the humidadeRealitva value for this TempoAtualBean.
     * 
     * @return humidadeRealitva
     */
    public java.lang.String getHumidadeRealitva() {
        return humidadeRealitva;
    }


    /**
     * Sets the humidadeRealitva value for this TempoAtualBean.
     * 
     * @param humidadeRealitva
     */
    public void setHumidadeRealitva(java.lang.String humidadeRealitva) {
        this.humidadeRealitva = humidadeRealitva;
    }


    /**
     * Gets the localizacao value for this TempoAtualBean.
     * 
     * @return localizacao
     */
    public java.lang.String getLocalizacao() {
        return localizacao;
    }


    /**
     * Sets the localizacao value for this TempoAtualBean.
     * 
     * @param localizacao
     */
    public void setLocalizacao(java.lang.String localizacao) {
        this.localizacao = localizacao;
    }


    /**
     * Gets the pontoOrvalho value for this TempoAtualBean.
     * 
     * @return pontoOrvalho
     */
    public java.lang.String getPontoOrvalho() {
        return pontoOrvalho;
    }


    /**
     * Sets the pontoOrvalho value for this TempoAtualBean.
     * 
     * @param pontoOrvalho
     */
    public void setPontoOrvalho(java.lang.String pontoOrvalho) {
        this.pontoOrvalho = pontoOrvalho;
    }


    /**
     * Gets the pressao value for this TempoAtualBean.
     * 
     * @return pressao
     */
    public java.lang.String getPressao() {
        return pressao;
    }


    /**
     * Sets the pressao value for this TempoAtualBean.
     * 
     * @param pressao
     */
    public void setPressao(java.lang.String pressao) {
        this.pressao = pressao;
    }


    /**
     * Gets the temperatura value for this TempoAtualBean.
     * 
     * @return temperatura
     */
    public java.lang.String getTemperatura() {
        return temperatura;
    }


    /**
     * Sets the temperatura value for this TempoAtualBean.
     * 
     * @param temperatura
     */
    public void setTemperatura(java.lang.String temperatura) {
        this.temperatura = temperatura;
    }


    /**
     * Gets the tempo value for this TempoAtualBean.
     * 
     * @return tempo
     */
    public java.lang.String getTempo() {
        return tempo;
    }


    /**
     * Sets the tempo value for this TempoAtualBean.
     * 
     * @param tempo
     */
    public void setTempo(java.lang.String tempo) {
        this.tempo = tempo;
    }


    /**
     * Gets the vento value for this TempoAtualBean.
     * 
     * @return vento
     */
    public java.lang.String getVento() {
        return vento;
    }


    /**
     * Sets the vento value for this TempoAtualBean.
     * 
     * @param vento
     */
    public void setVento(java.lang.String vento) {
        this.vento = vento;
    }


    /**
     * Gets the visibilidade value for this TempoAtualBean.
     * 
     * @return visibilidade
     */
    public java.lang.String getVisibilidade() {
        return visibilidade;
    }


    /**
     * Sets the visibilidade value for this TempoAtualBean.
     * 
     * @param visibilidade
     */
    public void setVisibilidade(java.lang.String visibilidade) {
        this.visibilidade = visibilidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TempoAtualBean)) return false;
        TempoAtualBean other = (TempoAtualBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.condicaoCeu==null && other.getCondicaoCeu()==null) || 
             (this.condicaoCeu!=null &&
              this.condicaoCeu.equals(other.getCondicaoCeu()))) &&
            ((this.gmt==null && other.getGmt()==null) || 
             (this.gmt!=null &&
              this.gmt.equals(other.getGmt()))) &&
            ((this.humidadeRealitva==null && other.getHumidadeRealitva()==null) || 
             (this.humidadeRealitva!=null &&
              this.humidadeRealitva.equals(other.getHumidadeRealitva()))) &&
            ((this.localizacao==null && other.getLocalizacao()==null) || 
             (this.localizacao!=null &&
              this.localizacao.equals(other.getLocalizacao()))) &&
            ((this.pontoOrvalho==null && other.getPontoOrvalho()==null) || 
             (this.pontoOrvalho!=null &&
              this.pontoOrvalho.equals(other.getPontoOrvalho()))) &&
            ((this.pressao==null && other.getPressao()==null) || 
             (this.pressao!=null &&
              this.pressao.equals(other.getPressao()))) &&
            ((this.temperatura==null && other.getTemperatura()==null) || 
             (this.temperatura!=null &&
              this.temperatura.equals(other.getTemperatura()))) &&
            ((this.tempo==null && other.getTempo()==null) || 
             (this.tempo!=null &&
              this.tempo.equals(other.getTempo()))) &&
            ((this.vento==null && other.getVento()==null) || 
             (this.vento!=null &&
              this.vento.equals(other.getVento()))) &&
            ((this.visibilidade==null && other.getVisibilidade()==null) || 
             (this.visibilidade!=null &&
              this.visibilidade.equals(other.getVisibilidade())));
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
        if (getCondicaoCeu() != null) {
            _hashCode += getCondicaoCeu().hashCode();
        }
        if (getGmt() != null) {
            _hashCode += getGmt().hashCode();
        }
        if (getHumidadeRealitva() != null) {
            _hashCode += getHumidadeRealitva().hashCode();
        }
        if (getLocalizacao() != null) {
            _hashCode += getLocalizacao().hashCode();
        }
        if (getPontoOrvalho() != null) {
            _hashCode += getPontoOrvalho().hashCode();
        }
        if (getPressao() != null) {
            _hashCode += getPressao().hashCode();
        }
        if (getTemperatura() != null) {
            _hashCode += getTemperatura().hashCode();
        }
        if (getTempo() != null) {
            _hashCode += getTempo().hashCode();
        }
        if (getVento() != null) {
            _hashCode += getVento().hashCode();
        }
        if (getVisibilidade() != null) {
            _hashCode += getVisibilidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TempoAtualBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.com.br/", "tempoAtualBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condicaoCeu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "condicaoCeu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("humidadeRealitva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "humidadeRealitva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pontoOrvalho");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pontoOrvalho"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pressao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pressao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temperatura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "temperatura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tempo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibilidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "visibilidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
