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
@Table(name = "dm_tran_global_transactions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranGlobalTransactions.findAll", query = "SELECT d FROM DmTranGlobalTransactions d"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByTransactionId", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.transactionId = :transactionId"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByDatabaseId", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByTransactionState", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.transactionState = :transactionState"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByResourceManagerId", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.resourceManagerId = :resourceManagerId"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByResourceManagerServer", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.resourceManagerServer = :resourceManagerServer"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByResourceManagerDatabase", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.resourceManagerDatabase = :resourceManagerDatabase"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByResourceManagerDbid", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.resourceManagerDbid = :resourceManagerDbid"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByResourceManagerState", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.resourceManagerState = :resourceManagerState"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByResourcePrepareLsn", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.resourcePrepareLsn = :resourcePrepareLsn"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByResourcePhase1Time", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.resourcePhase1Time = :resourcePhase1Time"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByResourcePhase2Time", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.resourcePhase2Time = :resourcePhase2Time"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByTransactionPhase1Time", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.transactionPhase1Time = :transactionPhase1Time"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByTransactionPhase2Time", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.transactionPhase2Time = :transactionPhase2Time"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByTransactionTotalTime", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.transactionTotalTime = :transactionTotalTime"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByTransactionDiagStatus", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.transactionDiagStatus = :transactionDiagStatus"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByResourceManagerDiagStatus", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.resourceManagerDiagStatus = :resourceManagerDiagStatus"),
    @NamedQuery(name = "DmTranGlobalTransactions.findByMaxCsn", query = "SELECT d FROM DmTranGlobalTransactions d WHERE d.maxCsn = :maxCsn")})
public class DmTranGlobalTransactions implements Serializable {

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
    @Column(name = "transaction_state")
    private int transactionState;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "resource_manager_id")
    private String resourceManagerId;
    @Size(max = 261)
    @Column(name = "resource_manager_server")
    private String resourceManagerServer;
    @Size(max = 129)
    @Column(name = "resource_manager_database")
    private String resourceManagerDatabase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resource_manager_dbid")
    private int resourceManagerDbid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resource_manager_state")
    private int resourceManagerState;
    @Size(max = 24)
    @Column(name = "resource_prepare_lsn")
    private String resourcePrepareLsn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resource_phase_1_time")
    private long resourcePhase1Time;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resource_phase_2_time")
    private long resourcePhase2Time;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_phase_1_time")
    private long transactionPhase1Time;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_phase_2_time")
    private long transactionPhase2Time;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_total_time")
    private long transactionTotalTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_diag_status")
    private int transactionDiagStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resource_manager_diag_status")
    private int resourceManagerDiagStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_csn")
    private long maxCsn;

    public DmTranGlobalTransactions() {
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

    public int getTransactionState() {
        return transactionState;
    }

    public void setTransactionState(int transactionState) {
        this.transactionState = transactionState;
    }

    public String getResourceManagerId() {
        return resourceManagerId;
    }

    public void setResourceManagerId(String resourceManagerId) {
        this.resourceManagerId = resourceManagerId;
    }

    public String getResourceManagerServer() {
        return resourceManagerServer;
    }

    public void setResourceManagerServer(String resourceManagerServer) {
        this.resourceManagerServer = resourceManagerServer;
    }

    public String getResourceManagerDatabase() {
        return resourceManagerDatabase;
    }

    public void setResourceManagerDatabase(String resourceManagerDatabase) {
        this.resourceManagerDatabase = resourceManagerDatabase;
    }

    public int getResourceManagerDbid() {
        return resourceManagerDbid;
    }

    public void setResourceManagerDbid(int resourceManagerDbid) {
        this.resourceManagerDbid = resourceManagerDbid;
    }

    public int getResourceManagerState() {
        return resourceManagerState;
    }

    public void setResourceManagerState(int resourceManagerState) {
        this.resourceManagerState = resourceManagerState;
    }

    public String getResourcePrepareLsn() {
        return resourcePrepareLsn;
    }

    public void setResourcePrepareLsn(String resourcePrepareLsn) {
        this.resourcePrepareLsn = resourcePrepareLsn;
    }

    public long getResourcePhase1Time() {
        return resourcePhase1Time;
    }

    public void setResourcePhase1Time(long resourcePhase1Time) {
        this.resourcePhase1Time = resourcePhase1Time;
    }

    public long getResourcePhase2Time() {
        return resourcePhase2Time;
    }

    public void setResourcePhase2Time(long resourcePhase2Time) {
        this.resourcePhase2Time = resourcePhase2Time;
    }

    public long getTransactionPhase1Time() {
        return transactionPhase1Time;
    }

    public void setTransactionPhase1Time(long transactionPhase1Time) {
        this.transactionPhase1Time = transactionPhase1Time;
    }

    public long getTransactionPhase2Time() {
        return transactionPhase2Time;
    }

    public void setTransactionPhase2Time(long transactionPhase2Time) {
        this.transactionPhase2Time = transactionPhase2Time;
    }

    public long getTransactionTotalTime() {
        return transactionTotalTime;
    }

    public void setTransactionTotalTime(long transactionTotalTime) {
        this.transactionTotalTime = transactionTotalTime;
    }

    public int getTransactionDiagStatus() {
        return transactionDiagStatus;
    }

    public void setTransactionDiagStatus(int transactionDiagStatus) {
        this.transactionDiagStatus = transactionDiagStatus;
    }

    public int getResourceManagerDiagStatus() {
        return resourceManagerDiagStatus;
    }

    public void setResourceManagerDiagStatus(int resourceManagerDiagStatus) {
        this.resourceManagerDiagStatus = resourceManagerDiagStatus;
    }

    public long getMaxCsn() {
        return maxCsn;
    }

    public void setMaxCsn(long maxCsn) {
        this.maxCsn = maxCsn;
    }
    
}
