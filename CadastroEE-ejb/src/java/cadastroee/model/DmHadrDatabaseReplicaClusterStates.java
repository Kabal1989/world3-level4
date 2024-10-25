/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "dm_hadr_database_replica_cluster_states")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrDatabaseReplicaClusterStates.findAll", query = "SELECT d FROM DmHadrDatabaseReplicaClusterStates d"),
    @NamedQuery(name = "DmHadrDatabaseReplicaClusterStates.findByReplicaId", query = "SELECT d FROM DmHadrDatabaseReplicaClusterStates d WHERE d.replicaId = :replicaId"),
    @NamedQuery(name = "DmHadrDatabaseReplicaClusterStates.findByGroupDatabaseId", query = "SELECT d FROM DmHadrDatabaseReplicaClusterStates d WHERE d.groupDatabaseId = :groupDatabaseId"),
    @NamedQuery(name = "DmHadrDatabaseReplicaClusterStates.findByDatabaseName", query = "SELECT d FROM DmHadrDatabaseReplicaClusterStates d WHERE d.databaseName = :databaseName"),
    @NamedQuery(name = "DmHadrDatabaseReplicaClusterStates.findByIsFailoverReady", query = "SELECT d FROM DmHadrDatabaseReplicaClusterStates d WHERE d.isFailoverReady = :isFailoverReady"),
    @NamedQuery(name = "DmHadrDatabaseReplicaClusterStates.findByIsPendingSecondarySuspend", query = "SELECT d FROM DmHadrDatabaseReplicaClusterStates d WHERE d.isPendingSecondarySuspend = :isPendingSecondarySuspend"),
    @NamedQuery(name = "DmHadrDatabaseReplicaClusterStates.findByIsDatabaseJoined", query = "SELECT d FROM DmHadrDatabaseReplicaClusterStates d WHERE d.isDatabaseJoined = :isDatabaseJoined"),
    @NamedQuery(name = "DmHadrDatabaseReplicaClusterStates.findByRecoveryLsn", query = "SELECT d FROM DmHadrDatabaseReplicaClusterStates d WHERE d.recoveryLsn = :recoveryLsn"),
    @NamedQuery(name = "DmHadrDatabaseReplicaClusterStates.findByTruncationLsn", query = "SELECT d FROM DmHadrDatabaseReplicaClusterStates d WHERE d.truncationLsn = :truncationLsn")})
public class DmHadrDatabaseReplicaClusterStates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "replica_id")
    private String replicaId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "group_database_id")
    private String groupDatabaseId;
    @Size(max = 128)
    @Column(name = "database_name")
    private String databaseName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_failover_ready")
    private boolean isFailoverReady;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_pending_secondary_suspend")
    private boolean isPendingSecondarySuspend;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_database_joined")
    private boolean isDatabaseJoined;
    @Column(name = "recovery_lsn")
    private BigInteger recoveryLsn;
    @Column(name = "truncation_lsn")
    private BigInteger truncationLsn;

    public DmHadrDatabaseReplicaClusterStates() {
    }

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId;
    }

    public String getGroupDatabaseId() {
        return groupDatabaseId;
    }

    public void setGroupDatabaseId(String groupDatabaseId) {
        this.groupDatabaseId = groupDatabaseId;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public boolean getIsFailoverReady() {
        return isFailoverReady;
    }

    public void setIsFailoverReady(boolean isFailoverReady) {
        this.isFailoverReady = isFailoverReady;
    }

    public boolean getIsPendingSecondarySuspend() {
        return isPendingSecondarySuspend;
    }

    public void setIsPendingSecondarySuspend(boolean isPendingSecondarySuspend) {
        this.isPendingSecondarySuspend = isPendingSecondarySuspend;
    }

    public boolean getIsDatabaseJoined() {
        return isDatabaseJoined;
    }

    public void setIsDatabaseJoined(boolean isDatabaseJoined) {
        this.isDatabaseJoined = isDatabaseJoined;
    }

    public BigInteger getRecoveryLsn() {
        return recoveryLsn;
    }

    public void setRecoveryLsn(BigInteger recoveryLsn) {
        this.recoveryLsn = recoveryLsn;
    }

    public BigInteger getTruncationLsn() {
        return truncationLsn;
    }

    public void setTruncationLsn(BigInteger truncationLsn) {
        this.truncationLsn = truncationLsn;
    }
    
}
