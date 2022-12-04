/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 35192
 */
@Entity
@Table(name = "MEDICAMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medicamento.findAll", query = "SELECT m FROM Medicamento m")
    , @NamedQuery(name = "Medicamento.findByIdmedicamento", query = "SELECT m FROM Medicamento m WHERE m.idmedicamento = :idmedicamento")
    , @NamedQuery(name = "Medicamento.findByPrecomedicamento", query = "SELECT m FROM Medicamento m WHERE m.precomedicamento = :precomedicamento")
    , @NamedQuery(name = "Medicamento.findByIvamedicamento", query = "SELECT m FROM Medicamento m WHERE m.ivamedicamento = :ivamedicamento")
    , @NamedQuery(name = "Medicamento.findByNomemedicamento", query = "SELECT m FROM Medicamento m WHERE m.nomemedicamento = :nomemedicamento")})
public class Medicamento implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEDICAMENTO_SEQ")
    @SequenceGenerator(sequenceName = "MEDICAMENTO_SEQ", allocationSize = 1, name = "MEDICAMENTO_SEQ")
    @Column(name = "IDMEDICAMENTO")
    private BigDecimal idmedicamento;
    @Column(name = "PRECOMEDICAMENTO")
    private String precomedicamento;
    @Column(name = "IVAMEDICAMENTO")
    private String ivamedicamento;
    @Column(name = "NOMEMEDICAMENTO")
    private String nomemedicamento;

    public Medicamento() {
    }

    public Medicamento(BigDecimal idmedicamento) {
        this.idmedicamento = idmedicamento;
    }

    public BigDecimal getIdmedicamento() {
        return idmedicamento;
    }

    public void setIdmedicamento(BigDecimal idmedicamento) {
        this.idmedicamento = idmedicamento;
    }

    public String getPrecomedicamento() {
        return precomedicamento;
    }

    public void setPrecomedicamento(String precomedicamento) {
        this.precomedicamento = precomedicamento;
    }

    public String getIvamedicamento() {
        return ivamedicamento;
    }

    public void setIvamedicamento(String ivamedicamento) {
        this.ivamedicamento = ivamedicamento;
    }

    public String getNomemedicamento() {
        return nomemedicamento;
    }

    public void setNomemedicamento(String nomemedicamento) {
        this.nomemedicamento = nomemedicamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmedicamento != null ? idmedicamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicamento)) {
            return false;
        }
        Medicamento other = (Medicamento) object;
        if ((this.idmedicamento == null && other.idmedicamento != null) || (this.idmedicamento != null && !this.idmedicamento.equals(other.idmedicamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Medicamento[ idmedicamento=" + idmedicamento + " ]";
    }
    
}
