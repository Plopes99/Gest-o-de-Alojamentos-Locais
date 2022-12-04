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
@Table(name = "ANIMAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Animal.findAll", query = "SELECT a FROM Animal a")
    , @NamedQuery(name = "Animal.findByIdanimal", query = "SELECT a FROM Animal a WHERE a.idanimal = :idanimal")
    , @NamedQuery(name = "Animal.findByRaca", query = "SELECT a FROM Animal a WHERE a.raca = :raca")
    , @NamedQuery(name = "Animal.findByEspecie", query = "SELECT a FROM Animal a WHERE a.especie = :especie")
    , @NamedQuery(name = "Animal.findByNome", query = "SELECT a FROM Animal a WHERE a.nome = :nome")
    , @NamedQuery(name = "Animal.findByNumchip", query = "SELECT a FROM Animal a WHERE a.numchip = :numchip")})
public class Animal implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ANIMAL_SEQ")
    @SequenceGenerator(sequenceName = "ANIMAL_SEQ", allocationSize = 1, name = "ANIMAL_SEQ")
    @Column(name = "IDANIMAL")
    private BigDecimal idanimal;
    @Column(name = "RACA")
    private String raca;
    @Column(name = "ESPECIE")
    private String especie;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "NUMCHIP")
    private BigInteger numchip;
    @JoinColumn(name = "IDCLIENTE", referencedColumnName = "IDCLIENTE")
    @ManyToOne(optional = false)
    private Cliente idcliente;

    public Animal() {
    }

    public Animal(BigDecimal idanimal) {
        this.idanimal = idanimal;
    }

    public BigDecimal getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(BigDecimal idanimal) {
        this.idanimal = idanimal;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigInteger getNumchip() {
        return numchip;
    }

    public void setNumchip(BigInteger numchip) {
        this.numchip = numchip;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idanimal != null ? idanimal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animal)) {
            return false;
        }
        Animal other = (Animal) object;
        if ((this.idanimal == null && other.idanimal != null) || (this.idanimal != null && !this.idanimal.equals(other.idanimal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Animal[ idanimal=" + idanimal + " ]";
    }
    
}
