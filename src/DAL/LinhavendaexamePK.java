/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author 35192
 */
@Embeddable
public class LinhavendaexamePK implements Serializable {

    @Basic(optional = false)
    
    @Column(name = "IDVENDA")
    private BigInteger idvenda;
    @Basic(optional = false)
   
    @Column(name = "IDEXAME")
    private BigInteger idexame;

    public LinhavendaexamePK() {
    }

    public LinhavendaexamePK(BigInteger idvenda, BigInteger idexame) {
        this.idvenda = idvenda;
        this.idexame = idexame;
    }

    public BigInteger getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(BigInteger idvenda) {
        this.idvenda = idvenda;
    }

    public BigInteger getIdexame() {
        return idexame;
    }

    public void setIdexame(BigInteger idexame) {
        this.idexame = idexame;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvenda != null ? idvenda.hashCode() : 0);
        hash += (idexame != null ? idexame.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LinhavendaexamePK)) {
            return false;
        }
        LinhavendaexamePK other = (LinhavendaexamePK) object;
        if ((this.idvenda == null && other.idvenda != null) || (this.idvenda != null && !this.idvenda.equals(other.idvenda))) {
            return false;
        }
        if ((this.idexame == null && other.idexame != null) || (this.idexame != null && !this.idexame.equals(other.idexame))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.LinhavendaexamePK[ idvenda=" + idvenda + ", idexame=" + idexame + " ]";
    }
    
}
