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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CONSULTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consulta.findAll", query = "SELECT c FROM Consulta c")
    , @NamedQuery(name = "Consulta.findByIdconsulta", query = "SELECT c FROM Consulta c WHERE c.idconsulta = :idconsulta")
    , @NamedQuery(name = "Consulta.findByPrecobase", query = "SELECT c FROM Consulta c WHERE c.precobase = :precobase")
    , @NamedQuery(name = "Consulta.findByDatahoraconsulta", query = "SELECT c FROM Consulta c WHERE c.datahoraconsulta = :datahoraconsulta")
    , @NamedQuery(name = "Consulta.findByIvaconsulta", query = "SELECT c FROM Consulta c WHERE c.ivaconsulta = :ivaconsulta")
    , @NamedQuery(name = "Consulta.findByEstado", query = "SELECT c FROM Consulta c WHERE c.estado = :estado")
    , @NamedQuery(name = "Consulta.findByObservacoes", query = "SELECT c FROM Consulta c WHERE c.observacoes = :observacoes")})
public class Consulta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONSULTA_SEQ")
    @SequenceGenerator(sequenceName = "CONSULTA_SEQ", allocationSize = 1, name = "CONSULTA_SEQ")
    @Column(name = "IDCONSULTA")
    private BigDecimal idconsulta;
    @Column(name = "PRECOBASE")
    private String precobase;
    @Column(name = "DATAHORACONSULTA")
    private String datahoraconsulta;
    @Column(name = "IVACONSULTA")
    private String ivaconsulta;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OBSERVACOES")
    private String observacoes;
    @JoinColumn(name = "IDANIMAL", referencedColumnName = "IDANIMAL")
    @ManyToOne(optional = false)
    private Animal idanimal;
    @JoinColumn(name = "IDFUNCIONARIO", referencedColumnName = "IDFUNCIONARIO")
    @ManyToOne(optional = false)
    private Funcionario idfuncionario;
    @JoinColumn(name = "IDVENDA", referencedColumnName = "IDVENDA")
    @ManyToOne
    private Venda idvenda;

    public Consulta() {
    }

    public Consulta(BigDecimal idconsulta) {
        this.idconsulta = idconsulta;
    }

    public BigDecimal getIdconsulta() {
        return idconsulta;
    }

    public void setIdconsulta(BigDecimal idconsulta) {
        this.idconsulta = idconsulta;
    }

    public String getPrecobase() {
        return precobase;
    }

    public void setPrecobase(String precobase) {
        this.precobase = precobase;
    }

    public String getDatahoraconsulta() {
        return datahoraconsulta;
    }

    public void setDatahoraconsulta(String datahoraconsulta) {
        this.datahoraconsulta = datahoraconsulta;
    }

    public String getIvaconsulta() {
        return ivaconsulta;
    }

    public void setIvaconsulta(String ivaconsulta) {
        this.ivaconsulta = ivaconsulta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Animal getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(Animal idanimal) {
        this.idanimal = idanimal;
    }

    public Funcionario getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Funcionario idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public Venda getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(Venda idvenda) {
        this.idvenda = idvenda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconsulta != null ? idconsulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.idconsulta == null && other.idconsulta != null) || (this.idconsulta != null && !this.idconsulta.equals(other.idconsulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Consulta[ idconsulta=" + idconsulta + " ]";
    }
    
}
