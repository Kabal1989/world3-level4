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
@Table(name = "dm_hadr_cached_replica_states")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrCachedReplicaStates.findAll", query = "SELECT d FROM DmHadrCachedReplicaStates d"),
    @NamedQuery(name = "DmHadrCachedReplicaStates.findByAgId", query = "SELECT d FROM DmHadrCachedReplicaStates d WHERE d.agId = :agId"),
    @NamedQuery(name = "DmHadrCachedReplicaStates.findByAgName", query = "SELECT d FROM DmHadrCachedReplicaStates d WHERE d.agName = :agName"),
    @NamedQuery(name = "DmHadrCachedReplicaStates.findByReplicaId", query = "SELECT d FROM DmHadrCachedReplicaStates d WHERE d.replicaId = :replicaId"),
    @NamedQuery(name = "DmHadrCachedReplicaStates.findByReplicaName", query = "SELECT d FROM DmHadrCachedReplicaStates d WHERE d.replicaName = :replicaName"),
    @NamedQuery(name = "DmHadrCachedReplicaStates.findByIsLocal", query = "SELECT d FROM DmHadrCachedReplicaStates d WHERE d.isLocal = :isLocal"),
    @NamedQuery(name = "DmHadrCachedReplicaStates.findByAvailabilityMode", query = "SELECT d FROM DmHadrCachedReplicaStates d WHERE d.availabilityMode = :availabilityMode"),
    @NamedQuery(name = "DmHadrCachedReplicaStates.findBySequenceNumber", query = "SELECT d FROM DmHadrCachedReplicaStates d WHERE d.sequenceNumber = :sequenceNumber"),
    @NamedQuery(name = "DmHadrCachedReplicaStates.findByRole", query = "SELECT d FROM DmHadrCachedReplicaStates d WHERE d.role = :role"),
    @NamedQuery(name = "DmHadrCachedReplicaStates.findByRoleDesc", query = "SELECT d FROM DmHadrCachedReplicaStates d WHERE d.roleDesc = :roleDesc"),
    @NamedQuery(name = "DmHadrCachedReplicaStates.findBySynchronizationHealth", query = "SELECT d FROM DmHadrCachedReplicaStates d WHERE d.synchronizationHealth = :synchronizationHealth"),
    @NamedQuery(name = "DmHadrCachedReplicaStates.findBySynchronizationHealthDesc", query = "SELECT d FROM DmHadrCachedReplicaStates d WHERE d.synchronizationHealthDesc = :synchronizationHealthDesc"),
    @NamedQuery(name = "DmHadrCachedReplicaStates.findBySecondaryRoleAllowConnections", query = "SELECT d FROM DmHadrCachedReplicaStates d WHERE d.secondaryRoleAllowConnections = :secondaryRoleAllowConnections"),
    @NamedQuery(name = "DmHadrCachedReplicaStates.findBySecondaryRoleAllowConnectionsDesc", query = "SELECT d FROM DmHadrCachedReplicaStates d WHERE d.secondaryRoleAllowConnectionsDesc = :secondaryRoleAllowConnectionsDesc")})
public class DmHadrCachedReplicaStates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "ag_id")
    private String agId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "ag_name")
    private String agName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "replica_id")
    private String replicaId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "replica_name")
    private String replicaName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_local")
    private boolean isLocal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "availability_mode")
    private short availabilityMode;
    @Column(name = "sequence_number")
    private BigInteger sequenceNumber;
    @Column(name = "role")
    private Short role;
    @Size(max = 60)
    @Column(name = "role_desc")
    private String roleDesc;
    @Column(name = "synchronization_health")
    private Short synchronizationHealth;
    @Size(max = 60)
    @Column(name = "synchronization_health_desc")
    private String synchronizationHealthDesc;
    @Column(name = "secondary_role_allow_connections")
    private Short secondaryRoleAllowConnections;
    @Size(max = 60)
    @Column(name = "secondary_role_allow_connections_desc")
    private String secondaryRoleAllowConnectionsDesc;

    public DmHadrCachedReplicaStates() {
    }

    public String getAgId() {
        return agId;
    }

    public void setAgId(String agId) {
        this.agId = agId;
    }

    public String getAgName() {
        return agName;
    }

    public void setAgName(String agName) {
        this.agName = agName;
    }

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId;
    }

    public String getReplicaName() {
        return replicaName;
    }

    public void setReplicaName(String replicaName) {
        this.replicaName = replicaName;
    }

    public boolean getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(boolean isLocal) {
        this.isLocal = isLocal;
    }

    public short getAvailabilityMode() {
        return availabilityMode;
    }

    public void setAvailabilityMode(short availabilityMode) {
        this.availabilityMode = availabilityMode;
    }

    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(BigInteger sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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

    public Short getSecondaryRoleAllowConnections() {
        return secondaryRoleAllowConnections;
    }

    public void setSecondaryRoleAllowConnections(Short secondaryRoleAllowConnections) {
        this.secondaryRoleAllowConnections = secondaryRoleAllowConnections;
    }

    public String getSecondaryRoleAllowConnectionsDesc() {
        return secondaryRoleAllowConnectionsDesc;
    }

    public void setSecondaryRoleAllowConnectionsDesc(String secondaryRoleAllowConnectionsDesc) {
        this.secondaryRoleAllowConnectionsDesc = secondaryRoleAllowConnectionsDesc;
    }
    
}
