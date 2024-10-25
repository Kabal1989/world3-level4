/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "dm_tran_commit_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranCommitTable.findAll", query = "SELECT d FROM DmTranCommitTable d"),
    @NamedQuery(name = "DmTranCommitTable.findByCommitTs", query = "SELECT d FROM DmTranCommitTable d WHERE d.commitTs = :commitTs"),
    @NamedQuery(name = "DmTranCommitTable.findByXdesId", query = "SELECT d FROM DmTranCommitTable d WHERE d.xdesId = :xdesId"),
    @NamedQuery(name = "DmTranCommitTable.findByCommitLbn", query = "SELECT d FROM DmTranCommitTable d WHERE d.commitLbn = :commitLbn"),
    @NamedQuery(name = "DmTranCommitTable.findByCommitCsn", query = "SELECT d FROM DmTranCommitTable d WHERE d.commitCsn = :commitCsn"),
    @NamedQuery(name = "DmTranCommitTable.findByCommitTime", query = "SELECT d FROM DmTranCommitTable d WHERE d.commitTime = :commitTime")})
public class DmTranCommitTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "commit_ts")
    private BigInteger commitTs;
    @Column(name = "xdes_id")
    private BigInteger xdesId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "commit_lbn")
    private long commitLbn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "commit_csn")
    private long commitCsn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "commit_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date commitTime;

    public DmTranCommitTable() {
    }

    public BigInteger getCommitTs() {
        return commitTs;
    }

    public void setCommitTs(BigInteger commitTs) {
        this.commitTs = commitTs;
    }

    public BigInteger getXdesId() {
        return xdesId;
    }

    public void setXdesId(BigInteger xdesId) {
        this.xdesId = xdesId;
    }

    public long getCommitLbn() {
        return commitLbn;
    }

    public void setCommitLbn(long commitLbn) {
        this.commitLbn = commitLbn;
    }

    public long getCommitCsn() {
        return commitCsn;
    }

    public void setCommitCsn(long commitCsn) {
        this.commitCsn = commitCsn;
    }

    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }
    
}
