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
@Table(name = "dm_tran_aborted_transactions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranAbortedTransactions.findAll", query = "SELECT d FROM DmTranAbortedTransactions d"),
    @NamedQuery(name = "DmTranAbortedTransactions.findByTransactionId", query = "SELECT d FROM DmTranAbortedTransactions d WHERE d.transactionId = :transactionId"),
    @NamedQuery(name = "DmTranAbortedTransactions.findByDatabaseId", query = "SELECT d FROM DmTranAbortedTransactions d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmTranAbortedTransactions.findByBeginXactLsn", query = "SELECT d FROM DmTranAbortedTransactions d WHERE d.beginXactLsn = :beginXactLsn"),
    @NamedQuery(name = "DmTranAbortedTransactions.findByEndXactLsn", query = "SELECT d FROM DmTranAbortedTransactions d WHERE d.endXactLsn = :endXactLsn"),
    @NamedQuery(name = "DmTranAbortedTransactions.findByBeginTime", query = "SELECT d FROM DmTranAbortedTransactions d WHERE d.beginTime = :beginTime"),
    @NamedQuery(name = "DmTranAbortedTransactions.findByNestAborted", query = "SELECT d FROM DmTranAbortedTransactions d WHERE d.nestAborted = :nestAborted")})
public class DmTranAbortedTransactions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_id")
    private long transactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private short databaseId;
    @Column(name = "begin_xact_lsn")
    private BigInteger beginXactLsn;
    @Column(name = "end_xact_lsn")
    private BigInteger endXactLsn;
    @Column(name = "begin_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date beginTime;
    @Column(name = "nest_aborted")
    private Boolean nestAborted;

    public DmTranAbortedTransactions() {
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(short databaseId) {
        this.databaseId = databaseId;
    }

    public BigInteger getBeginXactLsn() {
        return beginXactLsn;
    }

    public void setBeginXactLsn(BigInteger beginXactLsn) {
        this.beginXactLsn = beginXactLsn;
    }

    public BigInteger getEndXactLsn() {
        return endXactLsn;
    }

    public void setEndXactLsn(BigInteger endXactLsn) {
        this.endXactLsn = endXactLsn;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Boolean getNestAborted() {
        return nestAborted;
    }

    public void setNestAborted(Boolean nestAborted) {
        this.nestAborted = nestAborted;
    }
    
}
