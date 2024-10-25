/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "Movimentacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimentacao.findAll", query = "SELECT m FROM Movimentacao m"),
    @NamedQuery(name = "Movimentacao.findByMovimentacaoID", query = "SELECT m FROM Movimentacao m WHERE m.movimentacaoID = :movimentacaoID"),
    @NamedQuery(name = "Movimentacao.findByTipo", query = "SELECT m FROM Movimentacao m WHERE m.tipo = :tipo"),
    @NamedQuery(name = "Movimentacao.findByQuantidade", query = "SELECT m FROM Movimentacao m WHERE m.quantidade = :quantidade"),
    @NamedQuery(name = "Movimentacao.findByPreco", query = "SELECT m FROM Movimentacao m WHERE m.preco = :preco"),
    @NamedQuery(name = "Movimentacao.findByDataMovimentacao", query = "SELECT m FROM Movimentacao m WHERE m.dataMovimentacao = :dataMovimentacao")})
public class Movimentacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MovimentacaoID")
    private Integer movimentacaoID;
    @Column(name = "Tipo")
    private Character tipo;
    @Column(name = "Quantidade")
    private Integer quantidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Preco")
    private BigDecimal preco;
    @Column(name = "DataMovimentacao")
    @Temporal(TemporalType.DATE)
    private Date dataMovimentacao;
    @JoinColumn(name = "PessoaID", referencedColumnName = "PessoaID")
    @ManyToOne
    private Pessoa pessoaID;
    @JoinColumn(name = "ProdutoID", referencedColumnName = "ProdutoID")
    @ManyToOne
    private Produto produtoID;

    public Movimentacao() {
    }

    public Movimentacao(Integer movimentacaoID) {
        this.movimentacaoID = movimentacaoID;
    }

    public Integer getMovimentacaoID() {
        return movimentacaoID;
    }

    public void setMovimentacaoID(Integer movimentacaoID) {
        this.movimentacaoID = movimentacaoID;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Date getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(Date dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public Pessoa getPessoaID() {
        return pessoaID;
    }

    public void setPessoaID(Pessoa pessoaID) {
        this.pessoaID = pessoaID;
    }

    public Produto getProdutoID() {
        return produtoID;
    }

    public void setProdutoID(Produto produtoID) {
        this.produtoID = produtoID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movimentacaoID != null ? movimentacaoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimentacao)) {
            return false;
        }
        Movimentacao other = (Movimentacao) object;
        if ((this.movimentacaoID == null && other.movimentacaoID != null) || (this.movimentacaoID != null && !this.movimentacaoID.equals(other.movimentacaoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cadastroee.model.Movimentacao[ movimentacaoID=" + movimentacaoID + " ]";
    }
    
}
