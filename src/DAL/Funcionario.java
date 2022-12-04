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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 35192
 */
@Entity
@Table(name = "FUNCIONARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f")
    , @NamedQuery(name = "Funcionario.findByIdfuncionario", query = "SELECT f FROM Funcionario f WHERE f.idfuncionario = :idfuncionario")
    , @NamedQuery(name = "Funcionario.findByNome", query = "SELECT f FROM Funcionario f WHERE f.nome = :nome")
    , @NamedQuery(name = "Funcionario.findByEmail", query = "SELECT f FROM Funcionario f WHERE f.email = :email")
    , @NamedQuery(name = "Funcionario.findByPassword", query = "SELECT f FROM Funcionario f WHERE f.password = :password")
    , @NamedQuery(name = "Funcionario.findByNiss", query = "SELECT f FROM Funcionario f WHERE f.niss = :niss")
    , @NamedQuery(name = "Funcionario.findByContacto", query = "SELECT f FROM Funcionario f WHERE f.contacto = :contacto")
    , @NamedQuery(name = "Funcionario.findByNumregisto", query = "SELECT f FROM Funcionario f WHERE f.numregisto = :numregisto")})
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FUNCIONARIO_SEQ")
    @SequenceGenerator(sequenceName = "FUNCIONARIO_SEQ", allocationSize = 1, name = "FUNCIONARIO_SEQ")
    @Column(name = "IDFUNCIONARIO")
    private BigDecimal idfuncionario;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "NISS")
    private String niss;
    @Column(name = "CONTACTO")
    private String contacto;
    @Column(name = "NUMREGISTO")
    private BigInteger numregisto;
    @JoinColumn(name = "IDESPECIALIDADE", referencedColumnName = "IDESPECIALIDADE")
    @ManyToOne
    private Especialidadefuncionario idespecialidade;
    @JoinColumn(name = "CODTIPOFUNCIONARIO", referencedColumnName = "CODTIPOFUNCIONARIO")
    @ManyToOne(optional = false)
    private Tipofuncionario codtipofuncionario;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "funcionario")
    private Especialidadefuncionario especialidadefuncionario;

    public Funcionario() {
    }

    public Funcionario(BigDecimal idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public BigDecimal getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(BigDecimal idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNiss() {
        return niss;
    }

    public void setNiss(String niss) {
        this.niss = niss;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public BigInteger getNumregisto() {
        return numregisto;
    }

    public void setNumregisto(BigInteger numregisto) {
        this.numregisto = numregisto;
    }

    public Especialidadefuncionario getIdespecialidade() {
        return idespecialidade;
    }

    public void setIdespecialidade(Especialidadefuncionario idespecialidade) {
        this.idespecialidade = idespecialidade;
    }

    public Tipofuncionario getCodtipofuncionario() {
        return codtipofuncionario;
    }

    public void setCodtipofuncionario(Tipofuncionario codtipofuncionario) {
        this.codtipofuncionario = codtipofuncionario;
    }

    public Especialidadefuncionario getEspecialidadefuncionario() {
        return especialidadefuncionario;
    }

    public void setEspecialidadefuncionario(Especialidadefuncionario especialidadefuncionario) {
        this.especialidadefuncionario = especialidadefuncionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfuncionario != null ? idfuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.idfuncionario == null && other.idfuncionario != null) || (this.idfuncionario != null && !this.idfuncionario.equals(other.idfuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Funcionario[ idfuncionario=" + idfuncionario + " ]";
    }
    
}
