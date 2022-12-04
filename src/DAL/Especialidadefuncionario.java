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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 35192
 */
@Entity
@Table(name = "ESPECIALIDADEFUNCIONARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Especialidadefuncionario.findAll", query = "SELECT e FROM Especialidadefuncionario e")
    , @NamedQuery(name = "Especialidadefuncionario.findByIdespecialidade", query = "SELECT e FROM Especialidadefuncionario e WHERE e.idespecialidade = :idespecialidade")
    , @NamedQuery(name = "Especialidadefuncionario.findByEspecialidade", query = "SELECT e FROM Especialidadefuncionario e WHERE e.especialidade = :especialidade")})
public class Especialidadefuncionario implements Serializable {

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "especialidadefuncionario")
    private Exame exame;

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDESPECIALIDADE")
    private BigDecimal idespecialidade;
    @Column(name = "ESPECIALIDADE")
    private String especialidade;
    @OneToMany(mappedBy = "idespecialidade")
    private List<Funcionario> funcionarioList;
    @JoinColumn(name = "IDESPECIALIDADE", referencedColumnName = "IDFUNCIONARIO", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Funcionario funcionario;

    public Especialidadefuncionario() {
    }

    public Especialidadefuncionario(BigDecimal idespecialidade) {
        this.idespecialidade = idespecialidade;
    }

    public BigDecimal getIdespecialidade() {
        return idespecialidade;
    }

    public void setIdespecialidade(BigDecimal idespecialidade) {
        this.idespecialidade = idespecialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @XmlTransient
    public List<Funcionario> getFuncionarioList() {
        return funcionarioList;
    }

    public void setFuncionarioList(List<Funcionario> funcionarioList) {
        this.funcionarioList = funcionarioList;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idespecialidade != null ? idespecialidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especialidadefuncionario)) {
            return false;
        }
        Especialidadefuncionario other = (Especialidadefuncionario) object;
        if ((this.idespecialidade == null && other.idespecialidade != null) || (this.idespecialidade != null && !this.idespecialidade.equals(other.idespecialidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Especialidadefuncionario[ idespecialidade=" + idespecialidade + " ]";
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }
    
}
