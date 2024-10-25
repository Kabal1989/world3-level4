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
import javax.persistence.Lob;
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
@Table(name = "dm_tran_active_transactions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranActiveTransactions.findAll", query = "SELECT d FROM DmTranActiveTransactions d"),
    @NamedQuery(name = "DmTranActiveTransactions.findByTransactionId", query = "SELECT d FROM DmTranActiveTransactions d WHERE d.transactionId = :transactionId"),
    @NamedQuery(name = "DmTranActiveTransactions.findByName", query = "SELECT d FROM DmTranActiveTransactions d WHERE d.name = :name"),
    @NamedQuery(name = "DmTranActiveTransactions.findByTransactionBeginTime", query = "SELECT d FROM DmTranActiveTransactions d WHERE d.transactionBeginTime = :transactionBeginTime"),
    @NamedQuery(name = "DmTranActiveTransactions.findByTransactionType", query = "SELECT d FROM DmTranActiveTransactions d WHERE d.transactionType = :transactionType"),
    @NamedQuery(name = "DmTranActiveTransactions.findByTransactionUow", query = "SELECT d FROM DmTranActiveTransactions d WHERE d.transactionUow = :transactionUow"),
    @NamedQuery(name = "DmTranActiveTransactions.findByTransactionState", query = "SELECT d FROM DmTranActiveTransactions d WHERE d.transactionState = :transactionState"),
    @NamedQuery(name = "DmTranActiveTransactions.findByTransactionStatus", query = "SELECT d FROM DmTranActiveTransactions d WHERE d.transactionStatus = :transactionStatus"),
    @NamedQuery(name = "DmTranActiveTransactions.findByTransactionStatus2", query = "SELECT d FROM DmTranActiveTransactions d WHERE d.transactionStatus2 = :transactionStatus2"),
    @NamedQuery(name = "DmTranActiveTransactions.findByDtcState", query = "SELECT d FROM DmTranActiveTransactions d WHERE d.dtcState = :dtcState"),
    @NamedQuery(name = "DmTranActiveTransactions.findByDtcStatus", query = "SELECT d FROM DmTranActiveTransactions d WHERE d.dtcStatus = :dtcStatus"),
    @NamedQuery(name = "DmTranActiveTransactions.findByDtcIsolationLevel", query = "SELECT d FROM DmTranActiveTransactions d WHERE d.dtcIsolationLevel = :dtcIsolationLevel")})
public class DmTranActiveTransactions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_id")
    private long transactionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_begin_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionBeginTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_type")
    private int transactionType;
    @Size(max = 36)
    @Column(name = "transaction_uow")
    private String transactionUow;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_state")
    private int transactionState;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_status")
    private int transactionStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_status2")
    private int transactionStatus2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dtc_state")
    private int dtcState;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dtc_status")
    private int dtcStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dtc_isolation_level")
    private int dtcIsolationLevel;
    @Lob
    @Column(name = "filestream_transaction_id")
    private byte[] filestreamTransactionId;

    public DmTranActiveTransactions() {
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTransactionBeginTime() {
        return transactionBeginTime;
    }

    public void setTransactionBeginTime(Date transactionBeginTime) {
        this.transactionBeginTime = transactionBeginTime;
    }

    public int getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionUow() {
        return transactionUow;
    }

    public void setTransactionUow(String transactionUow) {
        this.transactionUow = transactionUow;
    }

    public int getTransactionState() {
        return transactionState;
    }

    public void setTransactionState(int transactionState) {
        this.transactionState = transactionState;
    }

    public int getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(int transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public int getTransactionStatus2() {
        return transactionStatus2;
    }

    public void setTransactionStatus2(int transactionStatus2) {
        this.transactionStatus2 = transactionStatus2;
    }

    public int getDtcState() {
        return dtcState;
    }

    public void setDtcState(int dtcState) {
        this.dtcState = dtcState;
    }

    public int getDtcStatus() {
        return dtcStatus;
    }

    public void setDtcStatus(int dtcStatus) {
        this.dtcStatus = dtcStatus;
    }

    public int getDtcIsolationLevel() {
        return dtcIsolationLevel;
    }

    public void setDtcIsolationLevel(int dtcIsolationLevel) {
        this.dtcIsolationLevel = dtcIsolationLevel;
    }

    public byte[] getFilestreamTransactionId() {
        return filestreamTransactionId;
    }

    public void setFilestreamTransactionId(byte[] filestreamTransactionId) {
        this.filestreamTransactionId = filestreamTransactionId;
    }
    
}
