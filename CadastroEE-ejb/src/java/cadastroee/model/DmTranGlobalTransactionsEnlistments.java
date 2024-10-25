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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_tran_global_transactions_enlistments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findAll", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByTransactionId", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.transactionId = :transactionId"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByDatabaseId", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByIsoLevel", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.isoLevel = :isoLevel"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByCanCommit", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.canCommit = :canCommit"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByEnlistmentState", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.enlistmentState = :enlistmentState"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByResourceManagerId", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.resourceManagerId = :resourceManagerId"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByServerName", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.serverName = :serverName"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByDatabaseName", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.databaseName = :databaseName"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByTransactionManagerServerName", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.transactionManagerServerName = :transactionManagerServerName"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByTransactionManagerDatabaseName", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.transactionManagerDatabaseName = :transactionManagerDatabaseName"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByTransactionManagerDatabaseId", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.transactionManagerDatabaseId = :transactionManagerDatabaseId"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByTransactionManagerRmid", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.transactionManagerRmid = :transactionManagerRmid"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByPrepareLsn", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.prepareLsn = :prepareLsn"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findBySnapshotTimestamp", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.snapshotTimestamp = :snapshotTimestamp"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByOldestActiveLsn", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.oldestActiveLsn = :oldestActiveLsn"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByPrepareElapsedTime", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.prepareElapsedTime = :prepareElapsedTime"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByObjectRefCount", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.objectRefCount = :objectRefCount"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByTransactionTimeout", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.transactionTimeout = :transactionTimeout"),
    @NamedQuery(name = "DmTranGlobalTransactionsEnlistments.findByDiagStatus", query = "SELECT d FROM DmTranGlobalTransactionsEnlistments d WHERE d.diagStatus = :diagStatus")})
public class DmTranGlobalTransactionsEnlistments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "transaction_id")
    private String transactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iso_level")
    private int isoLevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "can_commit")
    private int canCommit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enlistment_state")
    private int enlistmentState;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "resource_manager_id")
    private String resourceManagerId;
    @Size(max = 261)
    @Column(name = "server_name")
    private String serverName;
    @Size(max = 129)
    @Column(name = "database_name")
    private String databaseName;
    @Size(max = 261)
    @Column(name = "transaction_manager_server_name")
    private String transactionManagerServerName;
    @Size(max = 129)
    @Column(name = "transaction_manager_database_name")
    private String transactionManagerDatabaseName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_manager_database_id")
    private int transactionManagerDatabaseId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "transaction_manager_rmid")
    private String transactionManagerRmid;
    @Size(max = 24)
    @Column(name = "prepare_lsn")
    private String prepareLsn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "snapshot_timestamp")
    private long snapshotTimestamp;
    @Size(max = 24)
    @Column(name = "oldest_active_lsn")
    private String oldestActiveLsn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prepare_elapsed_time")
    private long prepareElapsedTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_ref_count")
    private int objectRefCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_timeout")
    private int transactionTimeout;
    @Basic(optional = false)
    @NotNull
    @Column(name = "diag_status")
    private int diagStatus;

    public DmTranGlobalTransactionsEnlistments() {
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public int getIsoLevel() {
        return isoLevel;
    }

    public void setIsoLevel(int isoLevel) {
        this.isoLevel = isoLevel;
    }

    public int getCanCommit() {
        return canCommit;
    }

    public void setCanCommit(int canCommit) {
        this.canCommit = canCommit;
    }

    public int getEnlistmentState() {
        return enlistmentState;
    }

    public void setEnlistmentState(int enlistmentState) {
        this.enlistmentState = enlistmentState;
    }

    public String getResourceManagerId() {
        return resourceManagerId;
    }

    public void setResourceManagerId(String resourceManagerId) {
        this.resourceManagerId = resourceManagerId;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getTransactionManagerServerName() {
        return transactionManagerServerName;
    }

    public void setTransactionManagerServerName(String transactionManagerServerName) {
        this.transactionManagerServerName = transactionManagerServerName;
    }

    public String getTransactionManagerDatabaseName() {
        return transactionManagerDatabaseName;
    }

    public void setTransactionManagerDatabaseName(String transactionManagerDatabaseName) {
        this.transactionManagerDatabaseName = transactionManagerDatabaseName;
    }

    public int getTransactionManagerDatabaseId() {
        return transactionManagerDatabaseId;
    }

    public void setTransactionManagerDatabaseId(int transactionManagerDatabaseId) {
        this.transactionManagerDatabaseId = transactionManagerDatabaseId;
    }

    public String getTransactionManagerRmid() {
        return transactionManagerRmid;
    }

    public void setTransactionManagerRmid(String transactionManagerRmid) {
        this.transactionManagerRmid = transactionManagerRmid;
    }

    public String getPrepareLsn() {
        return prepareLsn;
    }

    public void setPrepareLsn(String prepareLsn) {
        this.prepareLsn = prepareLsn;
    }

    public long getSnapshotTimestamp() {
        return snapshotTimestamp;
    }

    public void setSnapshotTimestamp(long snapshotTimestamp) {
        this.snapshotTimestamp = snapshotTimestamp;
    }

    public String getOldestActiveLsn() {
        return oldestActiveLsn;
    }

    public void setOldestActiveLsn(String oldestActiveLsn) {
        this.oldestActiveLsn = oldestActiveLsn;
    }

    public long getPrepareElapsedTime() {
        return prepareElapsedTime;
    }

    public void setPrepareElapsedTime(long prepareElapsedTime) {
        this.prepareElapsedTime = prepareElapsedTime;
    }

    public int getObjectRefCount() {
        return objectRefCount;
    }

    public void setObjectRefCount(int objectRefCount) {
        this.objectRefCount = objectRefCount;
    }

    public int getTransactionTimeout() {
        return transactionTimeout;
    }

    public void setTransactionTimeout(int transactionTimeout) {
        this.transactionTimeout = transactionTimeout;
    }

    public int getDiagStatus() {
        return diagStatus;
    }

    public void setDiagStatus(int diagStatus) {
        this.diagStatus = diagStatus;
    }
    
}
