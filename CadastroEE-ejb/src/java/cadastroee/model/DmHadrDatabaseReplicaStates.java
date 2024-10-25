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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_hadr_database_replica_states")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findAll", query = "SELECT d FROM DmHadrDatabaseReplicaStates d"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByDatabaseId", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByGroupId", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.groupId = :groupId"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByReplicaId", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.replicaId = :replicaId"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByGroupDatabaseId", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.groupDatabaseId = :groupDatabaseId"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByIsLocal", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.isLocal = :isLocal"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByIsPrimaryReplica", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.isPrimaryReplica = :isPrimaryReplica"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findBySynchronizationState", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.synchronizationState = :synchronizationState"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findBySynchronizationStateDesc", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.synchronizationStateDesc = :synchronizationStateDesc"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByIsCommitParticipant", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.isCommitParticipant = :isCommitParticipant"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findBySynchronizationHealth", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.synchronizationHealth = :synchronizationHealth"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findBySynchronizationHealthDesc", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.synchronizationHealthDesc = :synchronizationHealthDesc"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByDatabaseState", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.databaseState = :databaseState"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByDatabaseStateDesc", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.databaseStateDesc = :databaseStateDesc"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByIsSuspended", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.isSuspended = :isSuspended"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findBySuspendReason", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.suspendReason = :suspendReason"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findBySuspendReasonDesc", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.suspendReasonDesc = :suspendReasonDesc"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByRecoveryLsn", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.recoveryLsn = :recoveryLsn"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByTruncationLsn", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.truncationLsn = :truncationLsn"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByLastSentLsn", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.lastSentLsn = :lastSentLsn"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByLastSentTime", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.lastSentTime = :lastSentTime"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByLastReceivedLsn", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.lastReceivedLsn = :lastReceivedLsn"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByLastReceivedTime", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.lastReceivedTime = :lastReceivedTime"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByLastHardenedLsn", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.lastHardenedLsn = :lastHardenedLsn"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByLastHardenedTime", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.lastHardenedTime = :lastHardenedTime"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByLastRedoneLsn", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.lastRedoneLsn = :lastRedoneLsn"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByLastRedoneTime", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.lastRedoneTime = :lastRedoneTime"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByLogSendQueueSize", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.logSendQueueSize = :logSendQueueSize"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByLogSendRate", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.logSendRate = :logSendRate"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByRedoQueueSize", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.redoQueueSize = :redoQueueSize"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByRedoRate", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.redoRate = :redoRate"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByFilestreamSendRate", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.filestreamSendRate = :filestreamSendRate"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByEndOfLogLsn", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.endOfLogLsn = :endOfLogLsn"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByLastCommitLsn", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.lastCommitLsn = :lastCommitLsn"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByLastCommitTime", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.lastCommitTime = :lastCommitTime"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByLowWaterMarkForGhosts", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.lowWaterMarkForGhosts = :lowWaterMarkForGhosts"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findBySecondaryLagSeconds", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.secondaryLagSeconds = :secondaryLagSeconds"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByQuorumCommitLsn", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.quorumCommitLsn = :quorumCommitLsn"),
    @NamedQuery(name = "DmHadrDatabaseReplicaStates.findByQuorumCommitTime", query = "SELECT d FROM DmHadrDatabaseReplicaStates d WHERE d.quorumCommitTime = :quorumCommitTime")})
public class DmHadrDatabaseReplicaStates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "group_id")
    private String groupId;
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
    @Column(name = "is_local")
    private Boolean isLocal;
    @Column(name = "is_primary_replica")
    private Boolean isPrimaryReplica;
    @Column(name = "synchronization_state")
    private Short synchronizationState;
    @Size(max = 60)
    @Column(name = "synchronization_state_desc")
    private String synchronizationStateDesc;
    @Column(name = "is_commit_participant")
    private Boolean isCommitParticipant;
    @Column(name = "synchronization_health")
    private Short synchronizationHealth;
    @Size(max = 60)
    @Column(name = "synchronization_health_desc")
    private String synchronizationHealthDesc;
    @Column(name = "database_state")
    private Short databaseState;
    @Size(max = 60)
    @Column(name = "database_state_desc")
    private String databaseStateDesc;
    @Column(name = "is_suspended")
    private Boolean isSuspended;
    @Column(name = "suspend_reason")
    private Short suspendReason;
    @Size(max = 60)
    @Column(name = "suspend_reason_desc")
    private String suspendReasonDesc;
    @Column(name = "recovery_lsn")
    private BigInteger recoveryLsn;
    @Column(name = "truncation_lsn")
    private BigInteger truncationLsn;
    @Column(name = "last_sent_lsn")
    private BigInteger lastSentLsn;
    @Column(name = "last_sent_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSentTime;
    @Column(name = "last_received_lsn")
    private BigInteger lastReceivedLsn;
    @Column(name = "last_received_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastReceivedTime;
    @Column(name = "last_hardened_lsn")
    private BigInteger lastHardenedLsn;
    @Column(name = "last_hardened_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastHardenedTime;
    @Column(name = "last_redone_lsn")
    private BigInteger lastRedoneLsn;
    @Column(name = "last_redone_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastRedoneTime;
    @Column(name = "log_send_queue_size")
    private BigInteger logSendQueueSize;
    @Column(name = "log_send_rate")
    private BigInteger logSendRate;
    @Column(name = "redo_queue_size")
    private BigInteger redoQueueSize;
    @Column(name = "redo_rate")
    private BigInteger redoRate;
    @Column(name = "filestream_send_rate")
    private BigInteger filestreamSendRate;
    @Column(name = "end_of_log_lsn")
    private BigInteger endOfLogLsn;
    @Column(name = "last_commit_lsn")
    private BigInteger lastCommitLsn;
    @Column(name = "last_commit_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastCommitTime;
    @Column(name = "low_water_mark_for_ghosts")
    private BigInteger lowWaterMarkForGhosts;
    @Column(name = "secondary_lag_seconds")
    private BigInteger secondaryLagSeconds;
    @Column(name = "quorum_commit_lsn")
    private BigInteger quorumCommitLsn;
    @Column(name = "quorum_commit_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date quorumCommitTime;

    public DmHadrDatabaseReplicaStates() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
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

    public Boolean getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    public Boolean getIsPrimaryReplica() {
        return isPrimaryReplica;
    }

    public void setIsPrimaryReplica(Boolean isPrimaryReplica) {
        this.isPrimaryReplica = isPrimaryReplica;
    }

    public Short getSynchronizationState() {
        return synchronizationState;
    }

    public void setSynchronizationState(Short synchronizationState) {
        this.synchronizationState = synchronizationState;
    }

    public String getSynchronizationStateDesc() {
        return synchronizationStateDesc;
    }

    public void setSynchronizationStateDesc(String synchronizationStateDesc) {
        this.synchronizationStateDesc = synchronizationStateDesc;
    }

    public Boolean getIsCommitParticipant() {
        return isCommitParticipant;
    }

    public void setIsCommitParticipant(Boolean isCommitParticipant) {
        this.isCommitParticipant = isCommitParticipant;
    }

    public Short getSynchronizationHealth() {
        return synchronizationHealth;
    }

    public void setSynchronizationHealth(Short synchronizationHealth) {
        this.synchronizationHealth = synchronizationHealth;
    }

    public String getSynchronizationHealthDesc() {
        return synchronizationHealthDesc;
    }

    public void setSynchronizationHealthDesc(String synchronizationHealthDesc) {
        this.synchronizationHealthDesc = synchronizationHealthDesc;
    }

    public Short getDatabaseState() {
        return databaseState;
    }

    public void setDatabaseState(Short databaseState) {
        this.databaseState = databaseState;
    }

    public String getDatabaseStateDesc() {
        return databaseStateDesc;
    }

    public void setDatabaseStateDesc(String databaseStateDesc) {
        this.databaseStateDesc = databaseStateDesc;
    }

    public Boolean getIsSuspended() {
        return isSuspended;
    }

    public void setIsSuspended(Boolean isSuspended) {
        this.isSuspended = isSuspended;
    }

    public Short getSuspendReason() {
        return suspendReason;
    }

    public void setSuspendReason(Short suspendReason) {
        this.suspendReason = suspendReason;
    }

    public String getSuspendReasonDesc() {
        return suspendReasonDesc;
    }

    public void setSuspendReasonDesc(String suspendReasonDesc) {
        this.suspendReasonDesc = suspendReasonDesc;
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

    public BigInteger getLastSentLsn() {
        return lastSentLsn;
    }

    public void setLastSentLsn(BigInteger lastSentLsn) {
        this.lastSentLsn = lastSentLsn;
    }

    public Date getLastSentTime() {
        return lastSentTime;
    }

    public void setLastSentTime(Date lastSentTime) {
        this.lastSentTime = lastSentTime;
    }

    public BigInteger getLastReceivedLsn() {
        return lastReceivedLsn;
    }

    public void setLastReceivedLsn(BigInteger lastReceivedLsn) {
        this.lastReceivedLsn = lastReceivedLsn;
    }

    public Date getLastReceivedTime() {
        return lastReceivedTime;
    }

    public void setLastReceivedTime(Date lastReceivedTime) {
        this.lastReceivedTime = lastReceivedTime;
    }

    public BigInteger getLastHardenedLsn() {
        return lastHardenedLsn;
    }

    public void setLastHardenedLsn(BigInteger lastHardenedLsn) {
        this.lastHardenedLsn = lastHardenedLsn;
    }

    public Date getLastHardenedTime() {
        return lastHardenedTime;
    }

    public void setLastHardenedTime(Date lastHardenedTime) {
        this.lastHardenedTime = lastHardenedTime;
    }

    public BigInteger getLastRedoneLsn() {
        return lastRedoneLsn;
    }

    public void setLastRedoneLsn(BigInteger lastRedoneLsn) {
        this.lastRedoneLsn = lastRedoneLsn;
    }

    public Date getLastRedoneTime() {
        return lastRedoneTime;
    }

    public void setLastRedoneTime(Date lastRedoneTime) {
        this.lastRedoneTime = lastRedoneTime;
    }

    public BigInteger getLogSendQueueSize() {
        return logSendQueueSize;
    }

    public void setLogSendQueueSize(BigInteger logSendQueueSize) {
        this.logSendQueueSize = logSendQueueSize;
    }

    public BigInteger getLogSendRate() {
        return logSendRate;
    }

    public void setLogSendRate(BigInteger logSendRate) {
        this.logSendRate = logSendRate;
    }

    public BigInteger getRedoQueueSize() {
        return redoQueueSize;
    }

    public void setRedoQueueSize(BigInteger redoQueueSize) {
        this.redoQueueSize = redoQueueSize;
    }

    public BigInteger getRedoRate() {
        return redoRate;
    }

    public void setRedoRate(BigInteger redoRate) {
        this.redoRate = redoRate;
    }

    public BigInteger getFilestreamSendRate() {
        return filestreamSendRate;
    }

    public void setFilestreamSendRate(BigInteger filestreamSendRate) {
        this.filestreamSendRate = filestreamSendRate;
    }

    public BigInteger getEndOfLogLsn() {
        return endOfLogLsn;
    }

    public void setEndOfLogLsn(BigInteger endOfLogLsn) {
        this.endOfLogLsn = endOfLogLsn;
    }

    public BigInteger getLastCommitLsn() {
        return lastCommitLsn;
    }

    public void setLastCommitLsn(BigInteger lastCommitLsn) {
        this.lastCommitLsn = lastCommitLsn;
    }

    public Date getLastCommitTime() {
        return lastCommitTime;
    }

    public void setLastCommitTime(Date lastCommitTime) {
        this.lastCommitTime = lastCommitTime;
    }

    public BigInteger getLowWaterMarkForGhosts() {
        return lowWaterMarkForGhosts;
    }

    public void setLowWaterMarkForGhosts(BigInteger lowWaterMarkForGhosts) {
        this.lowWaterMarkForGhosts = lowWaterMarkForGhosts;
    }

    public BigInteger getSecondaryLagSeconds() {
        return secondaryLagSeconds;
    }

    public void setSecondaryLagSeconds(BigInteger secondaryLagSeconds) {
        this.secondaryLagSeconds = secondaryLagSeconds;
    }

    public BigInteger getQuorumCommitLsn() {
        return quorumCommitLsn;
    }

    public void setQuorumCommitLsn(BigInteger quorumCommitLsn) {
        this.quorumCommitLsn = quorumCommitLsn;
    }

    public Date getQuorumCommitTime() {
        return quorumCommitTime;
    }

    public void setQuorumCommitTime(Date quorumCommitTime) {
        this.quorumCommitTime = quorumCommitTime;
    }
    
}
