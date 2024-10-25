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
@Table(name = "dm_hadr_availability_replica_states")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findAll", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByReplicaId", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.replicaId = :replicaId"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByGroupId", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.groupId = :groupId"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByIsLocal", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.isLocal = :isLocal"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByRole", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.role = :role"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByRoleDesc", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.roleDesc = :roleDesc"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByOperationalState", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.operationalState = :operationalState"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByOperationalStateDesc", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.operationalStateDesc = :operationalStateDesc"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByConnectedState", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.connectedState = :connectedState"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByConnectedStateDesc", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.connectedStateDesc = :connectedStateDesc"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByRecoveryHealth", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.recoveryHealth = :recoveryHealth"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByRecoveryHealthDesc", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.recoveryHealthDesc = :recoveryHealthDesc"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findBySynchronizationHealth", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.synchronizationHealth = :synchronizationHealth"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findBySynchronizationHealthDesc", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.synchronizationHealthDesc = :synchronizationHealthDesc"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByLastConnectErrorNumber", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.lastConnectErrorNumber = :lastConnectErrorNumber"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByLastConnectErrorDescription", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.lastConnectErrorDescription = :lastConnectErrorDescription"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByLastConnectErrorTimestamp", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.lastConnectErrorTimestamp = :lastConnectErrorTimestamp"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByWriteLeaseRemainingTicks", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.writeLeaseRemainingTicks = :writeLeaseRemainingTicks"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaStates.findByCurrentConfigurationCommitStartTimeUtc", query = "SELECT d FROM DmHadrAvailabilityReplicaStates d WHERE d.currentConfigurationCommitStartTimeUtc = :currentConfigurationCommitStartTimeUtc")})
public class DmHadrAvailabilityReplicaStates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "replica_id")
    private String replicaId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "group_id")
    private String groupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_local")
    private boolean isLocal;
    @Column(name = "role")
    private Short role;
    @Size(max = 60)
    @Column(name = "role_desc")
    private String roleDesc;
    @Column(name = "operational_state")
    private Short operationalState;
    @Size(max = 60)
    @Column(name = "operational_state_desc")
    private String operationalStateDesc;
    @Column(name = "connected_state")
    private Short connectedState;
    @Size(max = 60)
    @Column(name = "connected_state_desc")
    private String connectedStateDesc;
    @Column(name = "recovery_health")
    private Short recoveryHealth;
    @Size(max = 60)
    @Column(name = "recovery_health_desc")
    private String recoveryHealthDesc;
    @Column(name = "synchronization_health")
    private Short synchronizationHealth;
    @Size(max = 60)
    @Column(name = "synchronization_health_desc")
    private String synchronizationHealthDesc;
    @Column(name = "last_connect_error_number")
    private Integer lastConnectErrorNumber;
    @Size(max = 1024)
    @Column(name = "last_connect_error_description")
    private String lastConnectErrorDescription;
    @Column(name = "last_connect_error_timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastConnectErrorTimestamp;
    @Column(name = "write_lease_remaining_ticks")
    private BigInteger writeLeaseRemainingTicks;
    @Column(name = "current_configuration_commit_start_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date currentConfigurationCommitStartTimeUtc;

    public DmHadrAvailabilityReplicaStates() {
    }

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public boolean getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(boolean isLocal) {
        this.isLocal = isLocal;
    }

    public Short getRole() {
        return role;
    }

    public void setRole(Short role) {
        this.role = role;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public Short getOperationalState() {
        return operationalState;
    }

    public void setOperationalState(Short operationalState) {
        this.operationalState = operationalState;
    }

    public String getOperationalStateDesc() {
        return operationalStateDesc;
    }

    public void setOperationalStateDesc(String operationalStateDesc) {
        this.operationalStateDesc = operationalStateDesc;
    }

    public Short getConnectedState() {
        return connectedState;
    }

    public void setConnectedState(Short connectedState) {
        this.connectedState = connectedState;
    }

    public String getConnectedStateDesc() {
        return connectedStateDesc;
    }

    public void setConnectedStateDesc(String connectedStateDesc) {
        this.connectedStateDesc = connectedStateDesc;
    }

    public Short getRecoveryHealth() {
        return recoveryHealth;
    }

    public void setRecoveryHealth(Short recoveryHealth) {
        this.recoveryHealth = recoveryHealth;
    }

    public String getRecoveryHealthDesc() {
        return recoveryHealthDesc;
    }

    public void setRecoveryHealthDesc(String recoveryHealthDesc) {
        this.recoveryHealthDesc = recoveryHealthDesc;
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

    public Integer getLastConnectErrorNumber() {
        return lastConnectErrorNumber;
    }

    public void setLastConnectErrorNumber(Integer lastConnectErrorNumber) {
        this.lastConnectErrorNumber = lastConnectErrorNumber;
    }

    public String getLastConnectErrorDescription() {
        return lastConnectErrorDescription;
    }

    public void setLastConnectErrorDescription(String lastConnectErrorDescription) {
        this.lastConnectErrorDescription = lastConnectErrorDescription;
    }

    public Date getLastConnectErrorTimestamp() {
        return lastConnectErrorTimestamp;
    }

    public void setLastConnectErrorTimestamp(Date lastConnectErrorTimestamp) {
        this.lastConnectErrorTimestamp = lastConnectErrorTimestamp;
    }

    public BigInteger getWriteLeaseRemainingTicks() {
        return writeLeaseRemainingTicks;
    }

    public void setWriteLeaseRemainingTicks(BigInteger writeLeaseRemainingTicks) {
        this.writeLeaseRemainingTicks = writeLeaseRemainingTicks;
    }

    public Date getCurrentConfigurationCommitStartTimeUtc() {
        return currentConfigurationCommitStartTimeUtc;
    }

    public void setCurrentConfigurationCommitStartTimeUtc(Date currentConfigurationCommitStartTimeUtc) {
        this.currentConfigurationCommitStartTimeUtc = currentConfigurationCommitStartTimeUtc;
    }
    
}
