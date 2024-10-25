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
@Table(name = "dm_os_cluster_nodes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsClusterNodes.findAll", query = "SELECT d FROM DmOsClusterNodes d"),
    @NamedQuery(name = "DmOsClusterNodes.findByNodeName", query = "SELECT d FROM DmOsClusterNodes d WHERE d.nodeName = :nodeName"),
    @NamedQuery(name = "DmOsClusterNodes.findByStatus", query = "SELECT d FROM DmOsClusterNodes d WHERE d.status = :status"),
    @NamedQuery(name = "DmOsClusterNodes.findByStatusDescription", query = "SELECT d FROM DmOsClusterNodes d WHERE d.statusDescription = :statusDescription"),
    @NamedQuery(name = "DmOsClusterNodes.findByIsCurrentOwner", query = "SELECT d FROM DmOsClusterNodes d WHERE d.isCurrentOwner = :isCurrentOwner")})
public class DmOsClusterNodes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "NodeName")
    private String nodeName;
    @Column(name = "status")
    private Integer status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "status_description")
    private String statusDescription;
    @Column(name = "is_current_owner")
    private Boolean isCurrentOwner;

    public DmOsClusterNodes() {
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Boolean getIsCurrentOwner() {
        return isCurrentOwner;
    }

    public void setIsCurrentOwner(Boolean isCurrentOwner) {
        this.isCurrentOwner = isCurrentOwner;
    }
    
}
