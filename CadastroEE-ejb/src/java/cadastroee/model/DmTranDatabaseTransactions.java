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
@Table(name = "dm_tran_database_transactions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranDatabaseTransactions.findAll", query = "SELECT d FROM DmTranDatabaseTransactions d"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByTransactionId", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.transactionId = :transactionId"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseId", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionBeginTime", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionBeginTime = :databaseTransactionBeginTime"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionType", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionType = :databaseTransactionType"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionState", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionState = :databaseTransactionState"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionStatus", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionStatus = :databaseTransactionStatus"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionStatus2", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionStatus2 = :databaseTransactionStatus2"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionLogRecordCount", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionLogRecordCount = :databaseTransactionLogRecordCount"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionReplicateRecordCount", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionReplicateRecordCount = :databaseTransactionReplicateRecordCount"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionLogBytesUsed", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionLogBytesUsed = :databaseTransactionLogBytesUsed"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionLogBytesReserved", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionLogBytesReserved = :databaseTransactionLogBytesReserved"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionLogBytesUsedSystem", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionLogBytesUsedSystem = :databaseTransactionLogBytesUsedSystem"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionLogBytesReservedSystem", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionLogBytesReservedSystem = :databaseTransactionLogBytesReservedSystem"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionBeginLsn", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionBeginLsn = :databaseTransactionBeginLsn"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionLastLsn", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionLastLsn = :databaseTransactionLastLsn"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionMostRecentSavepointLsn", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionMostRecentSavepointLsn = :databaseTransactionMostRecentSavepointLsn"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionCommitLsn", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionCommitLsn = :databaseTransactionCommitLsn"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionLastRollbackLsn", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionLastRollbackLsn = :databaseTransactionLastRollbackLsn"),
    @NamedQuery(name = "DmTranDatabaseTransactions.findByDatabaseTransactionNextUndoLsn", query = "SELECT d FROM DmTranDatabaseTransactions d WHERE d.databaseTransactionNextUndoLsn = :databaseTransactionNextUndoLsn")})
public class DmTranDatabaseTransactions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_id")
    private long transactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Column(name = "database_transaction_begin_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date databaseTransactionBeginTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_transaction_type")
    private int databaseTransactionType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_transaction_state")
    private int databaseTransactionState;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_transaction_status")
    private int databaseTransactionStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_transaction_status2")
    private int databaseTransactionStatus2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_transaction_log_record_count")
    private long databaseTransactionLogRecordCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_transaction_replicate_record_count")
    private int databaseTransactionReplicateRecordCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_transaction_log_bytes_used")
    private long databaseTransactionLogBytesUsed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_transaction_log_bytes_reserved")
    private long databaseTransactionLogBytesReserved;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_transaction_log_bytes_used_system")
    private int databaseTransactionLogBytesUsedSystem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_transaction_log_bytes_reserved_system")
    private int databaseTransactionLogBytesReservedSystem;
    @Column(name = "database_transaction_begin_lsn")
    private BigInteger databaseTransactionBeginLsn;
    @Column(name = "database_transaction_last_lsn")
    private BigInteger databaseTransactionLastLsn;
    @Column(name = "database_transaction_most_recent_savepoint_lsn")
    private BigInteger databaseTransactionMostRecentSavepointLsn;
    @Column(name = "database_transaction_commit_lsn")
    private BigInteger databaseTransactionCommitLsn;
    @Column(name = "database_transaction_last_rollback_lsn")
    private BigInteger databaseTransactionLastRollbackLsn;
    @Column(name = "database_transaction_next_undo_lsn")
    private BigInteger databaseTransactionNextUndoLsn;

    public DmTranDatabaseTransactions() {
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public Date getDatabaseTransactionBeginTime() {
        return databaseTransactionBeginTime;
    }

    public void setDatabaseTransactionBeginTime(Date databaseTransactionBeginTime) {
        this.databaseTransactionBeginTime = databaseTransactionBeginTime;
    }

    public int getDatabaseTransactionType() {
        return databaseTransactionType;
    }

    public void setDatabaseTransactionType(int databaseTransactionType) {
        this.databaseTransactionType = databaseTransactionType;
    }

    public int getDatabaseTransactionState() {
        return databaseTransactionState;
    }

    public void setDatabaseTransactionState(int databaseTransactionState) {
        this.databaseTransactionState = databaseTransactionState;
    }

    public int getDatabaseTransactionStatus() {
        return databaseTransactionStatus;
    }

    public void setDatabaseTransactionStatus(int databaseTransactionStatus) {
        this.databaseTransactionStatus = databaseTransactionStatus;
    }

    public int getDatabaseTransactionStatus2() {
        return databaseTransactionStatus2;
    }

    public void setDatabaseTransactionStatus2(int databaseTransactionStatus2) {
        this.databaseTransactionStatus2 = databaseTransactionStatus2;
    }

    public long getDatabaseTransactionLogRecordCount() {
        return databaseTransactionLogRecordCount;
    }

    public void setDatabaseTransactionLogRecordCount(long databaseTransactionLogRecordCount) {
        this.databaseTransactionLogRecordCount = databaseTransactionLogRecordCount;
    }

    public int getDatabaseTransactionReplicateRecordCount() {
        return databaseTransactionReplicateRecordCount;
    }

    public void setDatabaseTransactionReplicateRecordCount(int databaseTransactionReplicateRecordCount) {
        this.databaseTransactionReplicateRecordCount = databaseTransactionReplicateRecordCount;
    }

    public long getDatabaseTransactionLogBytesUsed() {
        return databaseTransactionLogBytesUsed;
    }

    public void setDatabaseTransactionLogBytesUsed(long databaseTransactionLogBytesUsed) {
        this.databaseTransactionLogBytesUsed = databaseTransactionLogBytesUsed;
    }

    public long getDatabaseTransactionLogBytesReserved() {
        return databaseTransactionLogBytesReserved;
    }

    public void setDatabaseTransactionLogBytesReserved(long databaseTransactionLogBytesReserved) {
        this.databaseTransactionLogBytesReserved = databaseTransactionLogBytesReserved;
    }

    public int getDatabaseTransactionLogBytesUsedSystem() {
        return databaseTransactionLogBytesUsedSystem;
    }

    public void setDatabaseTransactionLogBytesUsedSystem(int databaseTransactionLogBytesUsedSystem) {
        this.databaseTransactionLogBytesUsedSystem = databaseTransactionLogBytesUsedSystem;
    }

    public int getDatabaseTransactionLogBytesReservedSystem() {
        return databaseTransactionLogBytesReservedSystem;
    }

    public void setDatabaseTransactionLogBytesReservedSystem(int databaseTransactionLogBytesReservedSystem) {
        this.databaseTransactionLogBytesReservedSystem = databaseTransactionLogBytesReservedSystem;
    }

    public BigInteger getDatabaseTransactionBeginLsn() {
        return databaseTransactionBeginLsn;
    }

    public void setDatabaseTransactionBeginLsn(BigInteger databaseTransactionBeginLsn) {
        this.databaseTransactionBeginLsn = databaseTransactionBeginLsn;
    }

    public BigInteger getDatabaseTransactionLastLsn() {
        return databaseTransactionLastLsn;
    }

    public void setDatabaseTransactionLastLsn(BigInteger databaseTransactionLastLsn) {
        this.databaseTransactionLastLsn = databaseTransactionLastLsn;
    }

    public BigInteger getDatabaseTransactionMostRecentSavepointLsn() {
        return databaseTransactionMostRecentSavepointLsn;
    }

    public void setDatabaseTransactionMostRecentSavepointLsn(BigInteger databaseTransactionMostRecentSavepointLsn) {
        this.databaseTransactionMostRecentSavepointLsn = databaseTransactionMostRecentSavepointLsn;
    }

    public BigInteger getDatabaseTransactionCommitLsn() {
        return databaseTransactionCommitLsn;
    }

    public void setDatabaseTransactionCommitLsn(BigInteger databaseTransactionCommitLsn) {
        this.databaseTransactionCommitLsn = databaseTransactionCommitLsn;
    }

    public BigInteger getDatabaseTransactionLastRollbackLsn() {
        return databaseTransactionLastRollbackLsn;
    }

    public void setDatabaseTransactionLastRollbackLsn(BigInteger databaseTransactionLastRollbackLsn) {
        this.databaseTransactionLastRollbackLsn = databaseTransactionLastRollbackLsn;
    }

    public BigInteger getDatabaseTransactionNextUndoLsn() {
        return databaseTransactionNextUndoLsn;
    }

    public void setDatabaseTransactionNextUndoLsn(BigInteger databaseTransactionNextUndoLsn) {
        this.databaseTransactionNextUndoLsn = databaseTransactionNextUndoLsn;
    }
    
}
