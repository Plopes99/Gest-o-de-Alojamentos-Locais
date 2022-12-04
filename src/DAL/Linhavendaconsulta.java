/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 35192
 */
@Entity
@Table(name = "LINHAVENDACONSULTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Linhavendaconsulta.findAll", query = "SELECT l FROM Linhavendaconsulta l")
    , @NamedQuery(name = "Linhavendaconsulta.findById", query = "SELECT l FROM Linhavendaconsulta l WHERE l.id = :id")})
public class Linhavendaconsulta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @JoinColumn(name = "IDCONSULTA", referencedColumnName = "IDCONSULTA")
    @ManyToOne(optional = false)
    private Consulta idconsulta;
    @JoinColumn(name = "IDVENDA", referencedColumnName = "IDVENDA")
    @ManyToOne(optional = false)
    private Venda idvenda;

    public Linhavendaconsulta() {
    }

    public Linhavendaconsulta(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Consulta getIdconsulta() {
        return idconsulta;
    }

    public void setIdconsulta(Consulta idconsulta) {
        this.idconsulta = idconsulta;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Linhavendaconsulta)) {
            return false;
        }
        Linhavendaconsulta other = (Linhavendaconsulta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Linhavendaconsulta[ id=" + id + " ]";
    }
    
}
