/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 35192
 */
@Entity
@Table(name = "TIPOPAGAMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipopagamento.findAll", query = "SELECT t FROM Tipopagamento t")
    , @NamedQuery(name = "Tipopagamento.findByCodtipopagamento", query = "SELECT t FROM Tipopagamento t WHERE t.codtipopagamento = :codtipopagamento")
    , @NamedQuery(name = "Tipopagamento.findByDescricao", query = "SELECT t FROM Tipopagamento t WHERE t.descricao = :descricao")})
public class Tipopagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CODTIPOPAGAMENTO")
    private BigDecimal codtipopagamento;
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codtipopagamento")
    private List<Venda> vendaList;

    public Tipopagamento() {
    }

    public Tipopagamento(BigDecimal codtipopagamento) {
        this.codtipopagamento = codtipopagamento;
    }

    public BigDecimal getCodtipopagamento() {
        return codtipopagamento;
    }

    public void setCodtipopagamento(BigDecimal codtipopagamento) {
        this.codtipopagamento = codtipopagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Venda> getVendaList() {
        return vendaList;
    }

    public void setVendaList(List<Venda> vendaList) {
        this.vendaList = vendaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codtipopagamento != null ? codtipopagamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipopagamento)) {
            return false;
        }
        Tipopagamento other = (Tipopagamento) object;
        if ((this.codtipopagamento == null && other.codtipopagamento != null) || (this.codtipopagamento != null && !this.codtipopagamento.equals(other.codtipopagamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Tipopagamento[ codtipopagamento=" + codtipopagamento + " ]";
    }
    
}
