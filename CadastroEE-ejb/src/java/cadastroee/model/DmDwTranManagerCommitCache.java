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
@Table(name = "dm_dw_tran_manager_commit_cache")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDwTranManagerCommitCache.findAll", query = "SELECT d FROM DmDwTranManagerCommitCache d"),
    @NamedQuery(name = "DmDwTranManagerCommitCache.findByBsn", query = "SELECT d FROM DmDwTranManagerCommitCache d WHERE d.bsn = :bsn"),
    @NamedQuery(name = "DmDwTranManagerCommitCache.findByCsn", query = "SELECT d FROM DmDwTranManagerCommitCache d WHERE d.csn = :csn"),
    @NamedQuery(name = "DmDwTranManagerCommitCache.findByMinActiveBsn", query = "SELECT d FROM DmDwTranManagerCommitCache d WHERE d.minActiveBsn = :minActiveBsn"),
    @NamedQuery(name = "DmDwTranManagerCommitCache.findByTag", query = "SELECT d FROM DmDwTranManagerCommitCache d WHERE d.tag = :tag"),
    @NamedQuery(name = "DmDwTranManagerCommitCache.findByState", query = "SELECT d FROM DmDwTranManagerCommitCache d WHERE d.state = :state")})
public class DmDwTranManagerCommitCache implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bsn")
    private long bsn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "csn")
    private long csn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_active_bsn")
    private long minActiveBsn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tag")
    private short tag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state")
    private short state;

    public DmDwTranManagerCommitCache() {
    }

    public long getBsn() {
        return bsn;
    }

    public void setBsn(long bsn) {
        this.bsn = bsn;
    }

    public long getCsn() {
        return csn;
    }

    public void setCsn(long csn) {
        this.csn = csn;
    }

    public long getMinActiveBsn() {
        return minActiveBsn;
    }

    public void setMinActiveBsn(long minActiveBsn) {
        this.minActiveBsn = minActiveBsn;
    }

    public short getTag() {
        return tag;
    }

    public void setTag(short tag) {
        this.tag = tag;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }
    
}
