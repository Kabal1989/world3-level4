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
@Table(name = "dm_exec_compute_nodes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecComputeNodes.findAll", query = "SELECT d FROM DmExecComputeNodes d"),
    @NamedQuery(name = "DmExecComputeNodes.findByComputeNodeId", query = "SELECT d FROM DmExecComputeNodes d WHERE d.computeNodeId = :computeNodeId"),
    @NamedQuery(name = "DmExecComputeNodes.findByType", query = "SELECT d FROM DmExecComputeNodes d WHERE d.type = :type"),
    @NamedQuery(name = "DmExecComputeNodes.findByName", query = "SELECT d FROM DmExecComputeNodes d WHERE d.name = :name"),
    @NamedQuery(name = "DmExecComputeNodes.findByAddress", query = "SELECT d FROM DmExecComputeNodes d WHERE d.address = :address"),
    @NamedQuery(name = "DmExecComputeNodes.findByComputePoolId", query = "SELECT d FROM DmExecComputeNodes d WHERE d.computePoolId = :computePoolId")})
public class DmExecComputeNodes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "compute_node_id")
    private Integer computeNodeId;
    @Size(max = 32)
    @Column(name = "type")
    private String type;
    @Size(max = 32)
    @Column(name = "name")
    private String name;
    @Size(max = 32)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compute_pool_id")
    private int computePoolId;

    public DmExecComputeNodes() {
    }

    public Integer getComputeNodeId() {
        return computeNodeId;
    }

    public void setComputeNodeId(Integer computeNodeId) {
        this.computeNodeId = computeNodeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getComputePoolId() {
        return computePoolId;
    }

    public void setComputePoolId(int computePoolId) {
        this.computePoolId = computePoolId;
    }
    
}
