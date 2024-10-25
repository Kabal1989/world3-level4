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
@Table(name = "dm_tran_global_recovery_transactions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranGlobalRecoveryTransactions.findAll", query = "SELECT d FROM DmTranGlobalRecoveryTransactions d"),
    @NamedQuery(name = "DmTranGlobalRecoveryTransactions.findByDatabaseId", query = "SELECT d FROM DmTranGlobalRecoveryTransactions d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmTranGlobalRecoveryTransactions.findByTransactionUow", query = "SELECT d FROM DmTranGlobalRecoveryTransactions d WHERE d.transactionUow = :transactionUow"),
    @NamedQuery(name = "DmTranGlobalRecoveryTransactions.findByTransactionManagerDbid", query = "SELECT d FROM DmTranGlobalRecoveryTransactions d WHERE d.transactionManagerDbid = :transactionManagerDbid"),
    @NamedQuery(name = "DmTranGlobalRecoveryTransactions.findByTransactionManagerRmid", query = "SELECT d FROM DmTranGlobalRecoveryTransactions d WHERE d.transactionManagerRmid = :transactionManagerRmid"),
    @NamedQuery(name = "DmTranGlobalRecoveryTransactions.findByTransactionManagerServerName", query = "SELECT d FROM DmTranGlobalRecoveryTransactions d WHERE d.transactionManagerServerName = :transactionManagerServerName"),
    @NamedQuery(name = "DmTranGlobalRecoveryTransactions.findByTransactionManagerDatabaseName", query = "SELECT d FROM DmTranGlobalRecoveryTransactions d WHERE d.transactionManagerDatabaseName = :transactionManagerDatabaseName")})
public class DmTranGlobalRecoveryTransactions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "transaction_uow")
    private String transactionUow;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_manager_dbid")
    private int transactionManagerDbid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "transaction_manager_rmid")
    private String transactionManagerRmid;
    @Size(max = 261)
    @Column(name = "transaction_manager_server_name")
    private String transactionManagerServerName;
    @Size(max = 129)
    @Column(name = "transaction_manager_database_name")
    private String transactionManagerDatabaseName;

    public DmTranGlobalRecoveryTransactions() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public String getTransactionUow() {
        return transactionUow;
    }

    public void setTransactionUow(String transactionUow) {
        this.transactionUow = transactionUow;
    }

    public int getTransactionManagerDbid() {
        return transactionManagerDbid;
    }

    public void setTransactionManagerDbid(int transactionManagerDbid) {
        this.transactionManagerDbid = transactionManagerDbid;
    }

    public String getTransactionManagerRmid() {
        return transactionManagerRmid;
    }

    public void setTransactionManagerRmid(String transactionManagerRmid) {
        this.transactionManagerRmid = transactionManagerRmid;
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
    
}
