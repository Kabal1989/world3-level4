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
@Table(name = "dm_hadr_availability_replica_cluster_states")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrAvailabilityReplicaClusterStates.findAll", query = "SELECT d FROM DmHadrAvailabilityReplicaClusterStates d"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaClusterStates.findByReplicaId", query = "SELECT d FROM DmHadrAvailabilityReplicaClusterStates d WHERE d.replicaId = :replicaId"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaClusterStates.findByReplicaServerName", query = "SELECT d FROM DmHadrAvailabilityReplicaClusterStates d WHERE d.replicaServerName = :replicaServerName"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaClusterStates.findByGroupId", query = "SELECT d FROM DmHadrAvailabilityReplicaClusterStates d WHERE d.groupId = :groupId"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaClusterStates.findByJoinState", query = "SELECT d FROM DmHadrAvailabilityReplicaClusterStates d WHERE d.joinState = :joinState"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaClusterStates.findByJoinStateDesc", query = "SELECT d FROM DmHadrAvailabilityReplicaClusterStates d WHERE d.joinStateDesc = :joinStateDesc")})
public class DmHadrAvailabilityReplicaClusterStates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "replica_id")
    private String replicaId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "replica_server_name")
    private String replicaServerName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "group_id")
    private String groupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "join_state")
    private short joinState;
    @Size(max = 60)
    @Column(name = "join_state_desc")
    private String joinStateDesc;

    public DmHadrAvailabilityReplicaClusterStates() {
    }

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId;
    }

    public String getReplicaServerName() {
        return replicaServerName;
    }

    public void setReplicaServerName(String replicaServerName) {
        this.replicaServerName = replicaServerName;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public short getJoinState() {
        return joinState;
    }

    public void setJoinState(short joinState) {
        this.joinState = joinState;
    }

    public String getJoinStateDesc() {
        return joinStateDesc;
    }

    public void setJoinStateDesc(String joinStateDesc) {
        this.joinStateDesc = joinStateDesc;
    }
    
}
