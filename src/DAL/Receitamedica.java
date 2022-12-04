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
@Table(name = "RECEITAMEDICA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Receitamedica.findAll", query = "SELECT r FROM Receitamedica r")
    , @NamedQuery(name = "Receitamedica.findByIdreceita", query = "SELECT r FROM Receitamedica r WHERE r.idreceita = :idreceita")
    , @NamedQuery(name = "Receitamedica.findByObservacoes", query = "SELECT r FROM Receitamedica r WHERE r.observacoes = :observacoes")
    , @NamedQuery(name = "Receitamedica.findByValidade", query = "SELECT r FROM Receitamedica r WHERE r.validade = :validade")})
public class Receitamedica implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
       @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RECEITAMEDICA_SEQ")
    @SequenceGenerator(sequenceName = "RECEITAMEDICA_SEQ", allocationSize = 1, name = "RECEITAMEDICA_SEQ")
    @Column(name = "IDRECEITA")
    private BigDecimal idreceita;
    @Column(name = "OBSERVACOES")
    private String observacoes;
    @Column(name = "VALIDADE")
    private String validade;
    @JoinColumn(name = "IDANIMAL", referencedColumnName = "IDANIMAL")
    @ManyToOne
    private Animal idanimal;
    @JoinColumn(name = "IDFUNCIONARIO", referencedColumnName = "IDFUNCIONARIO")
    @ManyToOne
    private Funcionario idfuncionario;
    @JoinColumn(name = "IDMEDICAMENTO", referencedColumnName = "IDMEDICAMENTO")
    @ManyToOne
    private Medicamento idmedicamento;

    public Receitamedica() {
    }

    public Receitamedica(BigDecimal idreceita) {
        this.idreceita = idreceita;
    }

    public BigDecimal getIdreceita() {
        return idreceita;
    }

    public void setIdreceita(BigDecimal idreceita) {
        this.idreceita = idreceita;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
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

    public Medicamento getIdmedicamento() {
        return idmedicamento;
    }

    public void setIdmedicamento(Medicamento idmedicamento) {
        this.idmedicamento = idmedicamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreceita != null ? idreceita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receitamedica)) {
            return false;
        }
        Receitamedica other = (Receitamedica) object;
        if ((this.idreceita == null && other.idreceita != null) || (this.idreceita != null && !this.idreceita.equals(other.idreceita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Receitamedica[ idreceita=" + idreceita + " ]";
    }
    
}
