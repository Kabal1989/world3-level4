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
@Table(name = "dm_hadr_availability_replica_cluster_nodes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrAvailabilityReplicaClusterNodes.findAll", query = "SELECT d FROM DmHadrAvailabilityReplicaClusterNodes d"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaClusterNodes.findByGroupName", query = "SELECT d FROM DmHadrAvailabilityReplicaClusterNodes d WHERE d.groupName = :groupName"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaClusterNodes.findByReplicaServerName", query = "SELECT d FROM DmHadrAvailabilityReplicaClusterNodes d WHERE d.replicaServerName = :replicaServerName"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaClusterNodes.findByNodeName", query = "SELECT d FROM DmHadrAvailabilityReplicaClusterNodes d WHERE d.nodeName = :nodeName")})
public class DmHadrAvailabilityReplicaClusterNodes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "group_name")
    private String groupName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "replica_server_name")
    private String replicaServerName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "node_name")
    private String nodeName;

    public DmHadrAvailabilityReplicaClusterNodes() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getReplicaServerName() {
        return replicaServerName;
    }

    public void setReplicaServerName(String replicaServerName) {
        this.replicaServerName = replicaServerName;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
    
}
