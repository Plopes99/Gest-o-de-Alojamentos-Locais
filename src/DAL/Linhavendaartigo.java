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
@Table(name = "LINHAVENDAARTIGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Linhavendaartigo.findAll", query = "SELECT l FROM Linhavendaartigo l")
    , @NamedQuery(name = "Linhavendaartigo.findByQuantidade", query = "SELECT l FROM Linhavendaartigo l WHERE l.quantidade = :quantidade")
    , @NamedQuery(name = "Linhavendaartigo.findByIdlva", query = "SELECT l FROM Linhavendaartigo l WHERE l.idlva = :idlva")})
public class Linhavendaartigo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "QUANTIDADE")
    private BigInteger quantidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LINHAVENDAARTIGO_SEQ")
    @SequenceGenerator(sequenceName = "LINHAVENDAARTIGO_SEQ", allocationSize = 1, name = "LINHAVENDAARTIGO_SEQ")
    @Column(name = "IDLVA")
    private BigDecimal idlva;
    @JoinColumn(name = "IDARTIGO", referencedColumnName = "IDARTIGO")
    @ManyToOne
    private Artigo idartigo;
    @JoinColumn(name = "IDVENDA", referencedColumnName = "IDVENDA")
    @ManyToOne
    private Venda idvenda;

    public Linhavendaartigo() {
    }

    public Linhavendaartigo(BigDecimal idlva) {
        this.idlva = idlva;
    }

    public BigInteger getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigInteger quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getIdlva() {
        return idlva;
    }

    public void setIdlva(BigDecimal idlva) {
        this.idlva = idlva;
    }

    public Artigo getIdartigo() {
        return idartigo;
    }

    public void setIdartigo(Artigo idartigo) {
        this.idartigo = idartigo;
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
        hash += (idlva != null ? idlva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Linhavendaartigo)) {
            return false;
        }
        Linhavendaartigo other = (Linhavendaartigo) object;
        if ((this.idlva == null && other.idlva != null) || (this.idlva != null && !this.idlva.equals(other.idlva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Linhavendaartigo[ idlva=" + idlva + " ]";
    }
    
}
