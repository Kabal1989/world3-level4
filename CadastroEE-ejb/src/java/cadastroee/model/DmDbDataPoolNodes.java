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
@Table(name = "dm_db_data_pool_nodes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbDataPoolNodes.findAll", query = "SELECT d FROM DmDbDataPoolNodes d"),
    @NamedQuery(name = "DmDbDataPoolNodes.findByDataPoolId", query = "SELECT d FROM DmDbDataPoolNodes d WHERE d.dataPoolId = :dataPoolId"),
    @NamedQuery(name = "DmDbDataPoolNodes.findByDataPoolNodeName", query = "SELECT d FROM DmDbDataPoolNodes d WHERE d.dataPoolNodeName = :dataPoolNodeName"),
    @NamedQuery(name = "DmDbDataPoolNodes.findByAddress", query = "SELECT d FROM DmDbDataPoolNodes d WHERE d.address = :address"),
    @NamedQuery(name = "DmDbDataPoolNodes.findByState", query = "SELECT d FROM DmDbDataPoolNodes d WHERE d.state = :state"),
    @NamedQuery(name = "DmDbDataPoolNodes.findByHealthStatus", query = "SELECT d FROM DmDbDataPoolNodes d WHERE d.healthStatus = :healthStatus"),
    @NamedQuery(name = "DmDbDataPoolNodes.findByHealthErrorMessage", query = "SELECT d FROM DmDbDataPoolNodes d WHERE d.healthErrorMessage = :healthErrorMessage")})
public class DmDbDataPoolNodes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_pool_id")
    private int dataPoolId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "data_pool_node_name")
    private String dataPoolNodeName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "health_status")
    private String healthStatus;
    @Size(max = 4000)
    @Column(name = "health_error_message")
    private String healthErrorMessage;

    public DmDbDataPoolNodes() {
    }

    public int getDataPoolId() {
        return dataPoolId;
    }

    public void setDataPoolId(int dataPoolId) {
        this.dataPoolId = dataPoolId;
    }

    public String getDataPoolNodeName() {
        return dataPoolNodeName;
    }

    public void setDataPoolNodeName(String dataPoolNodeName) {
        this.dataPoolNodeName = dataPoolNodeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getHealthErrorMessage() {
        return healthErrorMessage;
    }

    public void setHealthErrorMessage(String healthErrorMessage) {
        this.healthErrorMessage = healthErrorMessage;
    }
    
}
