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
@Table(name = "query_store_replicas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QueryStoreReplicas.findAll", query = "SELECT q FROM QueryStoreReplicas q"),
    @NamedQuery(name = "QueryStoreReplicas.findByReplicaGroupId", query = "SELECT q FROM QueryStoreReplicas q WHERE q.replicaGroupId = :replicaGroupId"),
    @NamedQuery(name = "QueryStoreReplicas.findByRoleType", query = "SELECT q FROM QueryStoreReplicas q WHERE q.roleType = :roleType"),
    @NamedQuery(name = "QueryStoreReplicas.findByReplicaName", query = "SELECT q FROM QueryStoreReplicas q WHERE q.replicaName = :replicaName")})
public class QueryStoreReplicas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "replica_group_id")
    private long replicaGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "role_type")
    private short roleType;
    @Size(max = 644)
    @Column(name = "replica_name")
    private String replicaName;

    public QueryStoreReplicas() {
    }

    public long getReplicaGroupId() {
        return replicaGroupId;
    }

    public void setReplicaGroupId(long replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
    }

    public short getRoleType() {
        return roleType;
    }

    public void setRoleType(short roleType) {
        this.roleType = roleType;
    }

    public String getReplicaName() {
        return replicaName;
    }

    public void setReplicaName(String replicaName) {
        this.replicaName = replicaName;
    }
    
}
