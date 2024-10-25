/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
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
@Table(name = "MovimentoVenda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MovimentoVenda.findAll", query = "SELECT m FROM MovimentoVenda m"),
    @NamedQuery(name = "MovimentoVenda.findByMovimentoVendaID", query = "SELECT m FROM MovimentoVenda m WHERE m.movimentoVendaID = :movimentoVendaID"),
    @NamedQuery(name = "MovimentoVenda.findByQuantidade", query = "SELECT m FROM MovimentoVenda m WHERE m.quantidade = :quantidade"),
    @NamedQuery(name = "MovimentoVenda.findByDataVenda", query = "SELECT m FROM MovimentoVenda m WHERE m.dataVenda = :dataVenda")})
public class MovimentoVenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MovimentoVendaID")
    private Integer movimentoVendaID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantidade")
    private int quantidade;
    @Column(name = "DataVenda")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataVenda;
    @JoinColumn(name = "PessoaFisicaID", referencedColumnName = "PessoaID")
    @ManyToOne
    private PessoaFisica pessoaFisicaID;
    @JoinColumn(name = "ProdutoID", referencedColumnName = "ProdutoID")
    @ManyToOne
    private Produto produtoID;
    @JoinColumn(name = "UsuarioID", referencedColumnName = "UsuarioID")
    @ManyToOne
    private Usuario usuarioID;

    public MovimentoVenda() {
    }

    public MovimentoVenda(Integer movimentoVendaID) {
        this.movimentoVendaID = movimentoVendaID;
    }

    public MovimentoVenda(Integer movimentoVendaID, int quantidade) {
        this.movimentoVendaID = movimentoVendaID;
        this.quantidade = quantidade;
    }

    public Integer getMovimentoVendaID() {
        return movimentoVendaID;
    }

    public void setMovimentoVendaID(Integer movimentoVendaID) {
        this.movimentoVendaID = movimentoVendaID;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public PessoaFisica getPessoaFisicaID() {
        return pessoaFisicaID;
    }

    public void setPessoaFisicaID(PessoaFisica pessoaFisicaID) {
        this.pessoaFisicaID = pessoaFisicaID;
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
        hash += (movimentoVendaID != null ? movimentoVendaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimentoVenda)) {
            return false;
        }
        MovimentoVenda other = (MovimentoVenda) object;
        if ((this.movimentoVendaID == null && other.movimentoVendaID != null) || (this.movimentoVendaID != null && !this.movimentoVendaID.equals(other.movimentoVendaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cadastroee.model.MovimentoVenda[ movimentoVendaID=" + movimentoVendaID + " ]";
    }
    
}
