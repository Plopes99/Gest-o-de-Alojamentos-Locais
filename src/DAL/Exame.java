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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 35192
 */
@Entity
@Table(name = "EXAME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Exame.findAll", query = "SELECT e FROM Exame e")
    , @NamedQuery(name = "Exame.findByIdexame", query = "SELECT e FROM Exame e WHERE e.idexame = :idexame")
    , @NamedQuery(name = "Exame.findByPrecoexame", query = "SELECT e FROM Exame e WHERE e.precoexame = :precoexame")
    , @NamedQuery(name = "Exame.findByEstado", query = "SELECT e FROM Exame e WHERE e.estado = :estado")
    , @NamedQuery(name = "Exame.findByDescricaoexame", query = "SELECT e FROM Exame e WHERE e.descricaoexame = :descricaoexame")
    , @NamedQuery(name = "Exame.findByIdfuncionario", query = "SELECT e FROM Exame e WHERE e.idfuncionario = :idfuncionario")
    , @NamedQuery(name = "Exame.findByData", query = "SELECT e FROM Exame e WHERE e.data = :data")})
public class Exame implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EXAME_SEQ")
    @SequenceGenerator(sequenceName = "EXAME_SEQ", allocationSize = 1, name = "EXAME_SEQ")
    @Column(name = "IDEXAME")
    private BigDecimal idexame;
    @Column(name = "PRECOEXAME")
    private String precoexame;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "DESCRICAOEXAME")
    private String descricaoexame;
    @Column(name = "IDFUNCIONARIO")
    private String idfuncionario;
    @Column(name = "DATA")
    private String data;
    @JoinColumn(name = "IDANIMAL", referencedColumnName = "IDANIMAL")
    @ManyToOne
    private Animal idanimal;
    @JoinColumn(name = "IDEXAME", referencedColumnName = "IDESPECIALIDADE", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Especialidadefuncionario especialidadefuncionario;
    @JoinColumn(name = "IDVENDA", referencedColumnName = "IDVENDA")
    @ManyToOne
    private Venda idvenda;

    public Exame() {
    }

    public Exame(BigDecimal idexame) {
        this.idexame = idexame;
    }

    public BigDecimal getIdexame() {
        return idexame;
    }

    public void setIdexame(BigDecimal idexame) {
        this.idexame = idexame;
    }

    public String getPrecoexame() {
        return precoexame;
    }

    public void setPrecoexame(String precoexame) {
        this.precoexame = precoexame;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescricaoexame() {
        return descricaoexame;
    }

    public void setDescricaoexame(String descricaoexame) {
        this.descricaoexame = descricaoexame;
    }

    public String getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(String idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Animal getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(Animal idanimal) {
        this.idanimal = idanimal;
    }

    public Especialidadefuncionario getEspecialidadefuncionario() {
        return especialidadefuncionario;
    }

    public void setEspecialidadefuncionario(Especialidadefuncionario especialidadefuncionario) {
        this.especialidadefuncionario = especialidadefuncionario;
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
        hash += (idexame != null ? idexame.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exame)) {
            return false;
        }
        Exame other = (Exame) object;
        if ((this.idexame == null && other.idexame != null) || (this.idexame != null && !this.idexame.equals(other.idexame))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Exame[ idexame=" + idexame + " ]";
    }
    
}
