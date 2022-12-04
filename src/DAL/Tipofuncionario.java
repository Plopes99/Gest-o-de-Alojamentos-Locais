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
@Table(name = "TIPOFUNCIONARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipofuncionario.findAll", query = "SELECT t FROM Tipofuncionario t")
    , @NamedQuery(name = "Tipofuncionario.findByCodtipofuncionario", query = "SELECT t FROM Tipofuncionario t WHERE t.codtipofuncionario = :codtipofuncionario")
    , @NamedQuery(name = "Tipofuncionario.findByDescricao", query = "SELECT t FROM Tipofuncionario t WHERE t.descricao = :descricao")})
public class Tipofuncionario implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CODTIPOFUNCIONARIO")
    private BigDecimal codtipofuncionario;
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codtipofuncionario")
    private List<Funcionario> funcionarioList;

    public Tipofuncionario() {
    }

    public Tipofuncionario(BigDecimal codtipofuncionario) {
        this.codtipofuncionario = codtipofuncionario;
    }

    public BigDecimal getCodtipofuncionario() {
        return codtipofuncionario;
    }

    public void setCodtipofuncionario(BigDecimal codtipofuncionario) {
        this.codtipofuncionario = codtipofuncionario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Funcionario> getFuncionarioList() {
        return funcionarioList;
    }

    public void setFuncionarioList(List<Funcionario> funcionarioList) {
        this.funcionarioList = funcionarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codtipofuncionario != null ? codtipofuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipofuncionario)) {
            return false;
        }
        Tipofuncionario other = (Tipofuncionario) object;
        if ((this.codtipofuncionario == null && other.codtipofuncionario != null) || (this.codtipofuncionario != null && !this.codtipofuncionario.equals(other.codtipofuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Tipofuncionario[ codtipofuncionario=" + codtipofuncionario + " ]";
    }
    
}
