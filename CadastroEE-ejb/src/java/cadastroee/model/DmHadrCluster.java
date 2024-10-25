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
@Table(name = "dm_hadr_cluster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrCluster.findAll", query = "SELECT d FROM DmHadrCluster d"),
    @NamedQuery(name = "DmHadrCluster.findByClusterName", query = "SELECT d FROM DmHadrCluster d WHERE d.clusterName = :clusterName"),
    @NamedQuery(name = "DmHadrCluster.findByQuorumType", query = "SELECT d FROM DmHadrCluster d WHERE d.quorumType = :quorumType"),
    @NamedQuery(name = "DmHadrCluster.findByQuorumTypeDesc", query = "SELECT d FROM DmHadrCluster d WHERE d.quorumTypeDesc = :quorumTypeDesc"),
    @NamedQuery(name = "DmHadrCluster.findByQuorumState", query = "SELECT d FROM DmHadrCluster d WHERE d.quorumState = :quorumState"),
    @NamedQuery(name = "DmHadrCluster.findByQuorumStateDesc", query = "SELECT d FROM DmHadrCluster d WHERE d.quorumStateDesc = :quorumStateDesc")})
public class DmHadrCluster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "cluster_name")
    private String clusterName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quorum_type")
    private short quorumType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "quorum_type_desc")
    private String quorumTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quorum_state")
    private short quorumState;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "quorum_state_desc")
    private String quorumStateDesc;

    public DmHadrCluster() {
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public short getQuorumType() {
        return quorumType;
    }

    public void setQuorumType(short quorumType) {
        this.quorumType = quorumType;
    }

    public String getQuorumTypeDesc() {
        return quorumTypeDesc;
    }

    public void setQuorumTypeDesc(String quorumTypeDesc) {
        this.quorumTypeDesc = quorumTypeDesc;
    }

    public short getQuorumState() {
        return quorumState;
    }

    public void setQuorumState(short quorumState) {
        this.quorumState = quorumState;
    }

    public String getQuorumStateDesc() {
        return quorumStateDesc;
    }

    public void setQuorumStateDesc(String quorumStateDesc) {
        this.quorumStateDesc = quorumStateDesc;
    }
    
}
