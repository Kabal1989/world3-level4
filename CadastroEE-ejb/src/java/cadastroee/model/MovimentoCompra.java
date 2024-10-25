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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "MovimentoCompra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MovimentoCompra.findAll", query = "SELECT m FROM MovimentoCompra m"),
    @NamedQuery(name = "MovimentoCompra.findByMovimentoCompraID", query = "SELECT m FROM MovimentoCompra m WHERE m.movimentoCompraID = :movimentoCompraID"),
    @NamedQuery(name = "MovimentoCompra.findByQuantidade", query = "SELECT m FROM MovimentoCompra m WHERE m.quantidade = :quantidade"),
    @NamedQuery(name = "MovimentoCompra.findByPrecoUnitario", query = "SELECT m FROM MovimentoCompra m WHERE m.precoUnitario = :precoUnitario"),
    @NamedQuery(name = "MovimentoCompra.findByDataCompra", query = "SELECT m FROM MovimentoCompra m WHERE m.dataCompra = :dataCompra")})
public class MovimentoCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MovimentoCompraID")
    private Integer movimentoCompraID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantidade")
    private int quantidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PrecoUnitario")
    private BigDecimal precoUnitario;
    @Column(name = "DataCompra")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCompra;
    @JoinColumn(name = "PessoaJuridicaID", referencedColumnName = "PessoaID")
    @ManyToOne
    private PessoaJuridica pessoaJuridicaID;
    @JoinColumn(name = "ProdutoID", referencedColumnName = "ProdutoID")
    @ManyToOne
    private Produto produtoID;
    @JoinColumn(name = "UsuarioID", referencedColumnName = "UsuarioID")
    @ManyToOne
    private Usuario usuarioID;

    public MovimentoCompra() {
    }

    public MovimentoCompra(Integer movimentoCompraID) {
        this.movimentoCompraID = movimentoCompraID;
    }

    public MovimentoCompra(Integer movimentoCompraID, int quantidade, BigDecimal precoUnitario) {
        this.movimentoCompraID = movimentoCompraID;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public Integer getMovimentoCompraID() {
        return movimentoCompraID;
    }

    public void setMovimentoCompraID(Integer movimentoCompraID) {
        this.movimentoCompraID = movimentoCompraID;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public PessoaJuridica getPessoaJuridicaID() {
        return pessoaJuridicaID;
    }

    public void setPessoaJuridicaID(PessoaJuridica pessoaJuridicaID) {
        this.pessoaJuridicaID = pessoaJuridicaID;
    }

    public Produto getProdutoID() {
        return produtoID;
    }

    public void setProdutoID(Produto produtoID) {
        this.produtoID = produtoID;
    }

    public Usuario getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(Usuario usuarioID) {
        this.usuarioID = usuarioID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movimentoCompraID != null ? movimentoCompraID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimentoCompra)) {
            return false;
        }
        MovimentoCompra other = (MovimentoCompra) object;
        if ((this.movimentoCompraID == null && other.movimentoCompraID != null) || (this.movimentoCompraID != null && !this.movimentoCompraID.equals(other.movimentoCompraID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cadastroee.model.MovimentoCompra[ movimentoCompraID=" + movimentoCompraID + " ]";
    }
    
}
