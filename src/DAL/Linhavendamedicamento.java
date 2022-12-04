/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "LINHAVENDAMEDICAMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Linhavendamedicamento.findAll", query = "SELECT l FROM Linhavendamedicamento l")
    , @NamedQuery(name = "Linhavendamedicamento.findByQuantidade", query = "SELECT l FROM Linhavendamedicamento l WHERE l.quantidade = :quantidade")
    , @NamedQuery(name = "Linhavendamedicamento.findByIdlvm", query = "SELECT l FROM Linhavendamedicamento l WHERE l.idlvm = :idlvm")})
public class Linhavendamedicamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "QUANTIDADE")
    private BigInteger quantidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LINHAVENDAMEDICAMENTO_SEQ")
    @SequenceGenerator(sequenceName = "LINHAVENDAMEDICAMENTO_SEQ", allocationSize = 1, name = "LINHAVENDAMEDICAMENTO_SEQ")
    @Column(name = "IDLVM")
    private BigDecimal idlvm;
    @JoinColumn(name = "IDMEDICAMENTO", referencedColumnName = "IDMEDICAMENTO")
    @ManyToOne(optional = false)
    private Medicamento idmedicamento;
    @JoinColumn(name = "IDVENDA", referencedColumnName = "IDVENDA")
    @ManyToOne(optional = false)
    private Venda idvenda;

    public Linhavendamedicamento() {
    }

    public Linhavendamedicamento(BigDecimal idlvm) {
        this.idlvm = idlvm;
    }

    public BigInteger getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigInteger quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getIdlvm() {
        return idlvm;
    }

    public void setIdlvm(BigDecimal idlvm) {
        this.idlvm = idlvm;
    }

    public Medicamento getIdmedicamento() {
        return idmedicamento;
    }

    public void setIdmedicamento(Medicamento idmedicamento) {
        this.idmedicamento = idmedicamento;
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
        hash += (idlvm != null ? idlvm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Linhavendamedicamento)) {
            return false;
        }
        Linhavendamedicamento other = (Linhavendamedicamento) object;
        if ((this.idlvm == null && other.idlvm != null) || (this.idlvm != null && !this.idlvm.equals(other.idlvm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Linhavendamedicamento[ idlvm=" + idlvm + " ]";
    }
    
}
