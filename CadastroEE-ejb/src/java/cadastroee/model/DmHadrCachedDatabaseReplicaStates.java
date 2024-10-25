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
@Table(name = "dm_hadr_cached_database_replica_states")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrCachedDatabaseReplicaStates.findAll", query = "SELECT d FROM DmHadrCachedDatabaseReplicaStates d"),
    @NamedQuery(name = "DmHadrCachedDatabaseReplicaStates.findByAgId", query = "SELECT d FROM DmHadrCachedDatabaseReplicaStates d WHERE d.agId = :agId"),
    @NamedQuery(name = "DmHadrCachedDatabaseReplicaStates.findByAgName", query = "SELECT d FROM DmHadrCachedDatabaseReplicaStates d WHERE d.agName = :agName"),
    @NamedQuery(name = "DmHadrCachedDatabaseReplicaStates.findByReplicaId", query = "SELECT d FROM DmHadrCachedDatabaseReplicaStates d WHERE d.replicaId = :replicaId"),
    @NamedQuery(name = "DmHadrCachedDatabaseReplicaStates.findByReplicaName", query = "SELECT d FROM DmHadrCachedDatabaseReplicaStates d WHERE d.replicaName = :replicaName"),
    @NamedQuery(name = "DmHadrCachedDatabaseReplicaStates.findByAgDbId", query = "SELECT d FROM DmHadrCachedDatabaseReplicaStates d WHERE d.agDbId = :agDbId"),
    @NamedQuery(name = "DmHadrCachedDatabaseReplicaStates.findByAgDbName", query = "SELECT d FROM DmHadrCachedDatabaseReplicaStates d WHERE d.agDbName = :agDbName"),
    @NamedQuery(name = "DmHadrCachedDatabaseReplicaStates.findByIsLocal", query = "SELECT d FROM DmHadrCachedDatabaseReplicaStates d WHERE d.isLocal = :isLocal"),
    @NamedQuery(name = "DmHadrCachedDatabaseReplicaStates.findByIsPrimaryReplica", query = "SELECT d FROM DmHadrCachedDatabaseReplicaStates d WHERE d.isPrimaryReplica = :isPrimaryReplica"),
    @NamedQuery(name = "DmHadrCachedDatabaseReplicaStates.findBySynchronizationState", query = "SELECT d FROM DmHadrCachedDatabaseReplicaStates d WHERE d.synchronizationState = :synchronizationState"),
    @NamedQuery(name = "DmHadrCachedDatabaseReplicaStates.findBySynchronizationStateDesc", query = "SELECT d FROM DmHadrCachedDatabaseReplicaStates d WHERE d.synchronizationStateDesc = :synchronizationStateDesc")})
public class DmHadrCachedDatabaseReplicaStates implements Serializable {

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
    @Size(min = 1, max = 36)
    @Column(name = "ag_db_id")
    private String agDbId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "ag_db_name")
    private String agDbName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_local")
    private boolean isLocal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_primary_replica")
    private boolean isPrimaryReplica;
    @Column(name = "synchronization_state")
    private Short synchronizationState;
    @Size(max = 60)
    @Column(name = "synchronization_state_desc")
    private String synchronizationStateDesc;

    public DmHadrCachedDatabaseReplicaStates() {
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

    public String getAgDbId() {
        return agDbId;
    }

    public void setAgDbId(String agDbId) {
        this.agDbId = agDbId;
    }

    public String getAgDbName() {
        return agDbName;
    }

    public void setAgDbName(String agDbName) {
        this.agDbName = agDbName;
    }

    public boolean getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(boolean isLocal) {
        this.isLocal = isLocal;
    }

    public boolean getIsPrimaryReplica() {
        return isPrimaryReplica;
    }

    public void setIsPrimaryReplica(boolean isPrimaryReplica) {
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
    
}
