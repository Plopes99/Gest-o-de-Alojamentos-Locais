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
@Table(name = "ARTIGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Artigo.findAll", query = "SELECT a FROM Artigo a")
    , @NamedQuery(name = "Artigo.findByIdartigo", query = "SELECT a FROM Artigo a WHERE a.idartigo = :idartigo")
    , @NamedQuery(name = "Artigo.findByDescricao", query = "SELECT a FROM Artigo a WHERE a.descricao = :descricao")
    , @NamedQuery(name = "Artigo.findByPrecoartigo", query = "SELECT a FROM Artigo a WHERE a.precoartigo = :precoartigo")
    , @NamedQuery(name = "Artigo.findByIvaartigo", query = "SELECT a FROM Artigo a WHERE a.ivaartigo = :ivaartigo")})
public class Artigo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARTIGO_SEQ")
    @SequenceGenerator(sequenceName = "ARTIGO_SEQ", allocationSize = 1, name = "ARTIGO_SEQ")
    @Column(name = "IDARTIGO")
    private BigDecimal idartigo;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "PRECOARTIGO")
    private String precoartigo;
    @Column(name = "IVAARTIGO")
    private String ivaartigo;

    public Artigo() {
    }

    public Artigo(BigDecimal idartigo) {
        this.idartigo = idartigo;
    }

    public BigDecimal getIdartigo() {
        return idartigo;
    }

    public void setIdartigo(BigDecimal idartigo) {
        this.idartigo = idartigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrecoartigo() {
        return precoartigo;
    }

    public void setPrecoartigo(String precoartigo) {
        this.precoartigo = precoartigo;
    }

    public String getIvaartigo() {
        return ivaartigo;
    }

    public void setIvaartigo(String ivaartigo) {
        this.ivaartigo = ivaartigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idartigo != null ? idartigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artigo)) {
            return false;
        }
        Artigo other = (Artigo) object;
        if ((this.idartigo == null && other.idartigo != null) || (this.idartigo != null && !this.idartigo.equals(other.idartigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Artigo[ idartigo=" + idartigo + " ]";
    }
    
}
