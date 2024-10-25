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
@Table(name = "resource_governor_workload_groups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResourceGovernorWorkloadGroups.findAll", query = "SELECT r FROM ResourceGovernorWorkloadGroups r"),
    @NamedQuery(name = "ResourceGovernorWorkloadGroups.findByGroupId", query = "SELECT r FROM ResourceGovernorWorkloadGroups r WHERE r.groupId = :groupId"),
    @NamedQuery(name = "ResourceGovernorWorkloadGroups.findByName", query = "SELECT r FROM ResourceGovernorWorkloadGroups r WHERE r.name = :name"),
    @NamedQuery(name = "ResourceGovernorWorkloadGroups.findByImportance", query = "SELECT r FROM ResourceGovernorWorkloadGroups r WHERE r.importance = :importance"),
    @NamedQuery(name = "ResourceGovernorWorkloadGroups.findByRequestMaxMemoryGrantPercent", query = "SELECT r FROM ResourceGovernorWorkloadGroups r WHERE r.requestMaxMemoryGrantPercent = :requestMaxMemoryGrantPercent"),
    @NamedQuery(name = "ResourceGovernorWorkloadGroups.findByRequestMaxCpuTimeSec", query = "SELECT r FROM ResourceGovernorWorkloadGroups r WHERE r.requestMaxCpuTimeSec = :requestMaxCpuTimeSec"),
    @NamedQuery(name = "ResourceGovernorWorkloadGroups.findByRequestMemoryGrantTimeoutSec", query = "SELECT r FROM ResourceGovernorWorkloadGroups r WHERE r.requestMemoryGrantTimeoutSec = :requestMemoryGrantTimeoutSec"),
    @NamedQuery(name = "ResourceGovernorWorkloadGroups.findByMaxDop", query = "SELECT r FROM ResourceGovernorWorkloadGroups r WHERE r.maxDop = :maxDop"),
    @NamedQuery(name = "ResourceGovernorWorkloadGroups.findByGroupMaxRequests", query = "SELECT r FROM ResourceGovernorWorkloadGroups r WHERE r.groupMaxRequests = :groupMaxRequests"),
    @NamedQuery(name = "ResourceGovernorWorkloadGroups.findByPoolId", query = "SELECT r FROM ResourceGovernorWorkloadGroups r WHERE r.poolId = :poolId"),
    @NamedQuery(name = "ResourceGovernorWorkloadGroups.findByExternalPoolId", query = "SELECT r FROM ResourceGovernorWorkloadGroups r WHERE r.externalPoolId = :externalPoolId"),
    @NamedQuery(name = "ResourceGovernorWorkloadGroups.findByRequestMaxMemoryGrantPercentNumeric", query = "SELECT r FROM ResourceGovernorWorkloadGroups r WHERE r.requestMaxMemoryGrantPercentNumeric = :requestMaxMemoryGrantPercentNumeric")})
public class ResourceGovernorWorkloadGroups implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "group_id")
    private int groupId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "importance")
    private String importance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_max_memory_grant_percent")
    private int requestMaxMemoryGrantPercent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_max_cpu_time_sec")
    private int requestMaxCpuTimeSec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_memory_grant_timeout_sec")
    private int requestMemoryGrantTimeoutSec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_dop")
    private int maxDop;
    @Basic(optional = false)
    @NotNull
    @Column(name = "group_max_requests")
    private int groupMaxRequests;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pool_id")
    private int poolId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_pool_id")
    private int externalPoolId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_max_memory_grant_percent_numeric")
    private double requestMaxMemoryGrantPercentNumeric;

    public ResourceGovernorWorkloadGroups() {
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public int getRequestMaxMemoryGrantPercent() {
        return requestMaxMemoryGrantPercent;
    }

    public void setRequestMaxMemoryGrantPercent(int requestMaxMemoryGrantPercent) {
        this.requestMaxMemoryGrantPercent = requestMaxMemoryGrantPercent;
    }

    public int getRequestMaxCpuTimeSec() {
        return requestMaxCpuTimeSec;
    }

    public void setRequestMaxCpuTimeSec(int requestMaxCpuTimeSec) {
        this.requestMaxCpuTimeSec = requestMaxCpuTimeSec;
    }

    public int getRequestMemoryGrantTimeoutSec() {
        return requestMemoryGrantTimeoutSec;
    }

    public void setRequestMemoryGrantTimeoutSec(int requestMemoryGrantTimeoutSec) {
        this.requestMemoryGrantTimeoutSec = requestMemoryGrantTimeoutSec;
    }

    public int getMaxDop() {
        return maxDop;
    }

    public void setMaxDop(int maxDop) {
        this.maxDop = maxDop;
    }

    public int getGroupMaxRequests() {
        return groupMaxRequests;
    }

    public void setGroupMaxRequests(int groupMaxRequests) {
        this.groupMaxRequests = groupMaxRequests;
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public int getExternalPoolId() {
        return externalPoolId;
    }

    public void setExternalPoolId(int externalPoolId) {
        this.externalPoolId = externalPoolId;
    }

    public double getRequestMaxMemoryGrantPercentNumeric() {
        return requestMaxMemoryGrantPercentNumeric;
    }

    public void setRequestMaxMemoryGrantPercentNumeric(double requestMaxMemoryGrantPercentNumeric) {
        this.requestMaxMemoryGrantPercentNumeric = requestMaxMemoryGrantPercentNumeric;
    }
    
}
