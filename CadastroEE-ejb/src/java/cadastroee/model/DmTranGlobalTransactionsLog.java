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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_tran_global_transactions_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranGlobalTransactionsLog.findAll", query = "SELECT d FROM DmTranGlobalTransactionsLog d"),
    @NamedQuery(name = "DmTranGlobalTransactionsLog.findByTransactionId", query = "SELECT d FROM DmTranGlobalTransactionsLog d WHERE d.transactionId = :transactionId"),
    @NamedQuery(name = "DmTranGlobalTransactionsLog.findByTimeUtc", query = "SELECT d FROM DmTranGlobalTransactionsLog d WHERE d.timeUtc = :timeUtc"),
    @NamedQuery(name = "DmTranGlobalTransactionsLog.findByDropped", query = "SELECT d FROM DmTranGlobalTransactionsLog d WHERE d.dropped = :dropped"),
    @NamedQuery(name = "DmTranGlobalTransactionsLog.findByResourceManagerId", query = "SELECT d FROM DmTranGlobalTransactionsLog d WHERE d.resourceManagerId = :resourceManagerId"),
    @NamedQuery(name = "DmTranGlobalTransactionsLog.findByResourceManagerPrepareLsn", query = "SELECT d FROM DmTranGlobalTransactionsLog d WHERE d.resourceManagerPrepareLsn = :resourceManagerPrepareLsn"),
    @NamedQuery(name = "DmTranGlobalTransactionsLog.findByResourceManagerAckReceived", query = "SELECT d FROM DmTranGlobalTransactionsLog d WHERE d.resourceManagerAckReceived = :resourceManagerAckReceived"),
    @NamedQuery(name = "DmTranGlobalTransactionsLog.findByCommitTimestamp", query = "SELECT d FROM DmTranGlobalTransactionsLog d WHERE d.commitTimestamp = :commitTimestamp")})
public class DmTranGlobalTransactionsLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "transaction_id")
    private String transactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUtc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dropped")
    private short dropped;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "resource_manager_id")
    private String resourceManagerId;
    @Size(max = 24)
    @Column(name = "resource_manager_prepare_lsn")
    private String resourceManagerPrepareLsn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resource_manager_ack_received")
    private short resourceManagerAckReceived;
    @Basic(optional = false)
    @NotNull
    @Column(name = "commit_timestamp")
    private long commitTimestamp;

    public DmTranGlobalTransactionsLog() {
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTimeUtc() {
        return timeUtc;
    }

    public void setTimeUtc(Date timeUtc) {
        this.timeUtc = timeUtc;
    }

    public short getDropped() {
        return dropped;
    }

    public void setDropped(short dropped) {
        this.dropped = dropped;
    }

    public String getResourceManagerId() {
        return resourceManagerId;
    }

    public void setResourceManagerId(String resourceManagerId) {
        this.resourceManagerId = resourceManagerId;
    }

    public String getResourceManagerPrepareLsn() {
        return resourceManagerPrepareLsn;
    }

    public void setResourceManagerPrepareLsn(String resourceManagerPrepareLsn) {
        this.resourceManagerPrepareLsn = resourceManagerPrepareLsn;
    }

    public short getResourceManagerAckReceived() {
        return resourceManagerAckReceived;
    }

    public void setResourceManagerAckReceived(short resourceManagerAckReceived) {
        this.resourceManagerAckReceived = resourceManagerAckReceived;
    }

    public long getCommitTimestamp() {
        return commitTimestamp;
    }

    public void setCommitTimestamp(long commitTimestamp) {
        this.commitTimestamp = commitTimestamp;
    }
    
}
