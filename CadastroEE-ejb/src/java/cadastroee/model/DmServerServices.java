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
@Table(name = "dm_server_services")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmServerServices.findAll", query = "SELECT d FROM DmServerServices d"),
    @NamedQuery(name = "DmServerServices.findByServicename", query = "SELECT d FROM DmServerServices d WHERE d.servicename = :servicename"),
    @NamedQuery(name = "DmServerServices.findByStartupType", query = "SELECT d FROM DmServerServices d WHERE d.startupType = :startupType"),
    @NamedQuery(name = "DmServerServices.findByStartupTypeDesc", query = "SELECT d FROM DmServerServices d WHERE d.startupTypeDesc = :startupTypeDesc"),
    @NamedQuery(name = "DmServerServices.findByStatus", query = "SELECT d FROM DmServerServices d WHERE d.status = :status"),
    @NamedQuery(name = "DmServerServices.findByStatusDesc", query = "SELECT d FROM DmServerServices d WHERE d.statusDesc = :statusDesc"),
    @NamedQuery(name = "DmServerServices.findByProcessId", query = "SELECT d FROM DmServerServices d WHERE d.processId = :processId"),
    @NamedQuery(name = "DmServerServices.findByLastStartupTime", query = "SELECT d FROM DmServerServices d WHERE d.lastStartupTime = :lastStartupTime"),
    @NamedQuery(name = "DmServerServices.findByServiceAccount", query = "SELECT d FROM DmServerServices d WHERE d.serviceAccount = :serviceAccount"),
    @NamedQuery(name = "DmServerServices.findByFilename", query = "SELECT d FROM DmServerServices d WHERE d.filename = :filename"),
    @NamedQuery(name = "DmServerServices.findByIsClustered", query = "SELECT d FROM DmServerServices d WHERE d.isClustered = :isClustered"),
    @NamedQuery(name = "DmServerServices.findByClusterNodename", query = "SELECT d FROM DmServerServices d WHERE d.clusterNodename = :clusterNodename"),
    @NamedQuery(name = "DmServerServices.findByInstantFileInitializationEnabled", query = "SELECT d FROM DmServerServices d WHERE d.instantFileInitializationEnabled = :instantFileInitializationEnabled")})
public class DmServerServices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "servicename")
    private String servicename;
    @Column(name = "startup_type")
    private Integer startupType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "startup_type_desc")
    private String startupTypeDesc;
    @Column(name = "status")
    private Integer status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "status_desc")
    private String statusDesc;
    @Column(name = "process_id")
    private Integer processId;
    @Column(name = "last_startup_time")
    private Serializable lastStartupTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "service_account")
    private String serviceAccount;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "filename")
    private String filename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "is_clustered")
    private String isClustered;
    @Size(max = 256)
    @Column(name = "cluster_nodename")
    private String clusterNodename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "instant_file_initialization_enabled")
    private String instantFileInitializationEnabled;

    public DmServerServices() {
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public Integer getStartupType() {
        return startupType;
    }

    public void setStartupType(Integer startupType) {
        this.startupType = startupType;
    }

    public String getStartupTypeDesc() {
        return startupTypeDesc;
    }

    public void setStartupTypeDesc(String startupTypeDesc) {
        this.startupTypeDesc = startupTypeDesc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public Serializable getLastStartupTime() {
        return lastStartupTime;
    }

    public void setLastStartupTime(Serializable lastStartupTime) {
        this.lastStartupTime = lastStartupTime;
    }

    public String getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getIsClustered() {
        return isClustered;
    }

    public void setIsClustered(String isClustered) {
        this.isClustered = isClustered;
    }

    public String getClusterNodename() {
        return clusterNodename;
    }

    public void setClusterNodename(String clusterNodename) {
        this.clusterNodename = clusterNodename;
    }

    public String getInstantFileInitializationEnabled() {
        return instantFileInitializationEnabled;
    }

    public void setInstantFileInitializationEnabled(String instantFileInitializationEnabled) {
        this.instantFileInitializationEnabled = instantFileInitializationEnabled;
    }
    
}
