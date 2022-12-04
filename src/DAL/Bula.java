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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 35192
 */
@Entity
@Table(name = "BULA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bula.findAll", query = "SELECT b FROM Bula b")
    , @NamedQuery(name = "Bula.findByIdmedicamento", query = "SELECT b FROM Bula b WHERE b.idmedicamento = :idmedicamento")
    , @NamedQuery(name = "Bula.findByComposicao", query = "SELECT b FROM Bula b WHERE b.composicao = :composicao")
    , @NamedQuery(name = "Bula.findByIndicacoes", query = "SELECT b FROM Bula b WHERE b.indicacoes = :indicacoes")
    , @NamedQuery(name = "Bula.findByContraindicacoes", query = "SELECT b FROM Bula b WHERE b.contraindicacoes = :contraindicacoes")
    , @NamedQuery(name = "Bula.findByEfeitossecundarios", query = "SELECT b FROM Bula b WHERE b.efeitossecundarios = :efeitossecundarios")
    , @NamedQuery(name = "Bula.findByPosologia", query = "SELECT b FROM Bula b WHERE b.posologia = :posologia")
    , @NamedQuery(name = "Bula.findByPrecaucoes", query = "SELECT b FROM Bula b WHERE b.precaucoes = :precaucoes")
    , @NamedQuery(name = "Bula.findBySobredosagem", query = "SELECT b FROM Bula b WHERE b.sobredosagem = :sobredosagem")})
public class Bula implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDMEDICAMENTO")
    private BigDecimal idmedicamento;
    @Column(name = "COMPOSICAO")
    private String composicao;
    @Column(name = "INDICACOES")
    private String indicacoes;
    @Column(name = "CONTRAINDICACOES")
    private String contraindicacoes;
    @Column(name = "EFEITOSSECUNDARIOS")
    private String efeitossecundarios;
    @Column(name = "POSOLOGIA")
    private String posologia;
    @Column(name = "PRECAUCOES")
    private String precaucoes;
    @Column(name = "SOBREDOSAGEM")
    private String sobredosagem;

    public Bula() {
    }

    public Bula(BigDecimal idmedicamento) {
        this.idmedicamento = idmedicamento;
    }

    public BigDecimal getIdmedicamento() {
        return idmedicamento;
    }

    public void setIdmedicamento(BigDecimal idmedicamento) {
        this.idmedicamento = idmedicamento;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public String getIndicacoes() {
        return indicacoes;
    }

    public void setIndicacoes(String indicacoes) {
        this.indicacoes = indicacoes;
    }

    public String getContraindicacoes() {
        return contraindicacoes;
    }

    public void setContraindicacoes(String contraindicacoes) {
        this.contraindicacoes = contraindicacoes;
    }

    public String getEfeitossecundarios() {
        return efeitossecundarios;
    }

    public void setEfeitossecundarios(String efeitossecundarios) {
        this.efeitossecundarios = efeitossecundarios;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public String getPrecaucoes() {
        return precaucoes;
    }

    public void setPrecaucoes(String precaucoes) {
        this.precaucoes = precaucoes;
    }

    public String getSobredosagem() {
        return sobredosagem;
    }

    public void setSobredosagem(String sobredosagem) {
        this.sobredosagem = sobredosagem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmedicamento != null ? idmedicamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bula)) {
            return false;
        }
        Bula other = (Bula) object;
        if ((this.idmedicamento == null && other.idmedicamento != null) || (this.idmedicamento != null && !this.idmedicamento.equals(other.idmedicamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Bula[ idmedicamento=" + idmedicamento + " ]";
    }
    
}
