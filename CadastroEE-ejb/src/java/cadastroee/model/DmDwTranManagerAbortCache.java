/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_dw_tran_manager_abort_cache")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDwTranManagerAbortCache.findAll", query = "SELECT d FROM DmDwTranManagerAbortCache d"),
    @NamedQuery(name = "DmDwTranManagerAbortCache.findByAsn", query = "SELECT d FROM DmDwTranManagerAbortCache d WHERE d.asn = :asn"),
    @NamedQuery(name = "DmDwTranManagerAbortCache.findByBsn", query = "SELECT d FROM DmDwTranManagerAbortCache d WHERE d.bsn = :bsn"),
    @NamedQuery(name = "DmDwTranManagerAbortCache.findByNestedId", query = "SELECT d FROM DmDwTranManagerAbortCache d WHERE d.nestedId = :nestedId")})
public class DmDwTranManagerAbortCache implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "asn")
    private long asn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bsn")
    private long bsn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nested_id")
    private long nestedId;

    public DmDwTranManagerAbortCache() {
    }

    public long getAsn() {
        return asn;
    }

    public void setAsn(long asn) {
        this.asn = asn;
    }

    public long getBsn() {
        return bsn;
    }

    public void setBsn(long bsn) {
        this.bsn = bsn;
    }

    public long getNestedId() {
        return nestedId;
    }

    public void setNestedId(long nestedId) {
        this.nestedId = nestedId;
    }
    
}
