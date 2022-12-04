/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 35192
 */
@Entity
@Table(name = "VENDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v")
    , @NamedQuery(name = "Venda.findByIdvenda", query = "SELECT v FROM Venda v WHERE v.idvenda = :idvenda")
    , @NamedQuery(name = "Venda.findByDatavenda", query = "SELECT v FROM Venda v WHERE v.datavenda = :datavenda")
    , @NamedQuery(name = "Venda.findByTotalvenda", query = "SELECT v FROM Venda v WHERE v.totalvenda = :totalvenda")
    , @NamedQuery(name = "Venda.findByEstado", query = "SELECT v FROM Venda v WHERE v.estado = :estado")
    , @NamedQuery(name = "Venda.findByDesconto", query = "SELECT v FROM Venda v WHERE v.desconto = :desconto")
    , @NamedQuery(name = "Venda.findByTroco", query = "SELECT v FROM Venda v WHERE v.troco = :troco")})
public class Venda implements Serializable {

    @OneToMany(mappedBy = "idvenda")
    private List<Consulta> consultaList;

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VENDA_SEQ")
    @SequenceGenerator(sequenceName = "VENDA_SEQ", allocationSize = 1, name = "VENDA_SEQ")
    @Column(name = "IDVENDA")
    private BigDecimal idvenda;
    @Column(name = "DATAVENDA")
    private String datavenda;
    @Column(name = "TOTALVENDA")
    private String totalvenda;
    @Column(name = "ESTADO")
    private BigInteger estado;
    @Column(name = "DESCONTO")
    private BigInteger desconto;
    @Column(name = "TROCO")
    private String troco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idvenda")
    private List<Linhavendamedicamento> linhavendamedicamentoList;
    @JoinColumn(name = "IDCLIENTE", referencedColumnName = "IDCLIENTE")
    @ManyToOne
    private Cliente idcliente;
    @JoinColumn(name = "IDFUNCIONARIO", referencedColumnName = "IDFUNCIONARIO")
    @ManyToOne
    private Funcionario idfuncionario;
    @JoinColumn(name = "CODTIPOPAGAMENTO", referencedColumnName = "CODTIPOPAGAMENTO")
    @ManyToOne
    private Tipopagamento codtipopagamento;

    public Venda() {
    }

    public Venda(BigDecimal idvenda) {
        this.idvenda = idvenda;
    }

    public BigDecimal getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(BigDecimal idvenda) {
        this.idvenda = idvenda;
    }

    public String getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(String datavenda) {
        this.datavenda = datavenda;
    }

    public String getTotalvenda() {
        return totalvenda;
    }

    public void setTotalvenda(String totalvenda) {
        this.totalvenda = totalvenda;
    }

    public BigInteger getEstado() {
        return estado;
    }

    public void setEstado(BigInteger estado) {
        this.estado = estado;
    }

    public BigInteger getDesconto() {
        return desconto;
    }

    public void setDesconto(BigInteger desconto) {
        this.desconto = desconto;
    }

    public String getTroco() {
        return troco;
    }

    public void setTroco(String troco) {
        this.troco = troco;
    }

    @XmlTransient
    public List<Linhavendamedicamento> getLinhavendamedicamentoList() {
        return linhavendamedicamentoList;
    }

    public void setLinhavendamedicamentoList(List<Linhavendamedicamento> linhavendamedicamentoList) {
        this.linhavendamedicamentoList = linhavendamedicamentoList;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
    }

    public Funcionario getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Funcionario idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public Tipopagamento getCodtipopagamento() {
        return codtipopagamento;
    }

    public void setCodtipopagamento(Tipopagamento codtipopagamento) {
        this.codtipopagamento = codtipopagamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvenda != null ? idvenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venda)) {
            return false;
        }
        Venda other = (Venda) object;
        if ((this.idvenda == null && other.idvenda != null) || (this.idvenda != null && !this.idvenda.equals(other.idvenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Venda[ idvenda=" + idvenda + " ]";
    }

    @XmlTransient
    public List<Consulta> getConsultaList() {
        return consultaList;
    }

    public void setConsultaList(List<Consulta> consultaList) {
        this.consultaList = consultaList;
    }
    
}
