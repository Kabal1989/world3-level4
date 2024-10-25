/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_resource_governor_workload_groups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findAll", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByGroupId", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.groupId = :groupId"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByName", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.name = :name"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByPoolId", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.poolId = :poolId"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByExternalPoolId", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.externalPoolId = :externalPoolId"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByStatisticsStartTime", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.statisticsStartTime = :statisticsStartTime"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByTotalRequestCount", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.totalRequestCount = :totalRequestCount"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByTotalQueuedRequestCount", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.totalQueuedRequestCount = :totalQueuedRequestCount"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByActiveRequestCount", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.activeRequestCount = :activeRequestCount"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByQueuedRequestCount", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.queuedRequestCount = :queuedRequestCount"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByTotalCpuLimitViolationCount", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.totalCpuLimitViolationCount = :totalCpuLimitViolationCount"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByTotalCpuUsageMs", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.totalCpuUsageMs = :totalCpuUsageMs"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByMaxRequestCpuTimeMs", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.maxRequestCpuTimeMs = :maxRequestCpuTimeMs"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByBlockedTaskCount", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.blockedTaskCount = :blockedTaskCount"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByTotalLockWaitCount", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.totalLockWaitCount = :totalLockWaitCount"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByTotalLockWaitTimeMs", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.totalLockWaitTimeMs = :totalLockWaitTimeMs"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByTotalQueryOptimizationCount", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.totalQueryOptimizationCount = :totalQueryOptimizationCount"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByTotalSuboptimalPlanGenerationCount", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.totalSuboptimalPlanGenerationCount = :totalSuboptimalPlanGenerationCount"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByTotalReducedMemgrantCount", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.totalReducedMemgrantCount = :totalReducedMemgrantCount"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByMaxRequestGrantMemoryKb", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.maxRequestGrantMemoryKb = :maxRequestGrantMemoryKb"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByActiveParallelThreadCount", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.activeParallelThreadCount = :activeParallelThreadCount"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByImportance", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.importance = :importance"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByRequestMaxMemoryGrantPercent", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.requestMaxMemoryGrantPercent = :requestMaxMemoryGrantPercent"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByRequestMaxCpuTimeSec", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.requestMaxCpuTimeSec = :requestMaxCpuTimeSec"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByRequestMemoryGrantTimeoutSec", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.requestMemoryGrantTimeoutSec = :requestMemoryGrantTimeoutSec"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByGroupMaxRequests", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.groupMaxRequests = :groupMaxRequests"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByMaxDop", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.maxDop = :maxDop"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByEffectiveMaxDop", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.effectiveMaxDop = :effectiveMaxDop"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByTotalCpuUsagePreemptiveMs", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.totalCpuUsagePreemptiveMs = :totalCpuUsagePreemptiveMs"),
    @NamedQuery(name = "DmResourceGovernorWorkloadGroups.findByRequestMaxMemoryGrantPercentNumeric", query = "SELECT d FROM DmResourceGovernorWorkloadGroups d WHERE d.requestMaxMemoryGrantPercentNumeric = :requestMaxMemoryGrantPercentNumeric")})
public class DmResourceGovernorWorkloadGroups implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "group_id")
    private int groupId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pool_id")
    private int poolId;
    @Column(name = "external_pool_id")
    private Integer externalPoolId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "statistics_start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statisticsStartTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_request_count")
    private long totalRequestCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_queued_request_count")
    private long totalQueuedRequestCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active_request_count")
    private int activeRequestCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "queued_request_count")
    private int queuedRequestCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_cpu_limit_violation_count")
    private long totalCpuLimitViolationCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_cpu_usage_ms")
    private long totalCpuUsageMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_request_cpu_time_ms")
    private long maxRequestCpuTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "blocked_task_count")
    private int blockedTaskCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_lock_wait_count")
    private long totalLockWaitCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_lock_wait_time_ms")
    private long totalLockWaitTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_query_optimization_count")
    private long totalQueryOptimizationCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_suboptimal_plan_generation_count")
    private long totalSuboptimalPlanGenerationCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_reduced_memgrant_count")
    private long totalReducedMemgrantCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_request_grant_memory_kb")
    private long maxRequestGrantMemoryKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active_parallel_thread_count")
    private long activeParallelThreadCount;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
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
    @Column(name = "group_max_requests")
    private int groupMaxRequests;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_dop")
    private int maxDop;
    @Basic(optional = false)
    @NotNull
    @Column(name = "effective_max_dop")
    private int effectiveMaxDop;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_cpu_usage_preemptive_ms")
    private long totalCpuUsagePreemptiveMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_max_memory_grant_percent_numeric")
    private double requestMaxMemoryGrantPercentNumeric;

    public DmResourceGovernorWorkloadGroups() {
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

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public Integer getExternalPoolId() {
        return externalPoolId;
    }

    public void setExternalPoolId(Integer externalPoolId) {
        this.externalPoolId = externalPoolId;
    }

    public Date getStatisticsStartTime() {
        return statisticsStartTime;
    }

    public void setStatisticsStartTime(Date statisticsStartTime) {
        this.statisticsStartTime = statisticsStartTime;
    }

    public long getTotalRequestCount() {
        return totalRequestCount;
    }

    public void setTotalRequestCount(long totalRequestCount) {
        this.totalRequestCount = totalRequestCount;
    }

    public long getTotalQueuedRequestCount() {
        return totalQueuedRequestCount;
    }

    public void setTotalQueuedRequestCount(long totalQueuedRequestCount) {
        this.totalQueuedRequestCount = totalQueuedRequestCount;
    }

    public int getActiveRequestCount() {
        return activeRequestCount;
    }

    public void setActiveRequestCount(int activeRequestCount) {
        this.activeRequestCount = activeRequestCount;
    }

    public int getQueuedRequestCount() {
        return queuedRequestCount;
    }

    public void setQueuedRequestCount(int queuedRequestCount) {
        this.queuedRequestCount = queuedRequestCount;
    }

    public long getTotalCpuLimitViolationCount() {
        return totalCpuLimitViolationCount;
    }

    public void setTotalCpuLimitViolationCount(long totalCpuLimitViolationCount) {
        this.totalCpuLimitViolationCount = totalCpuLimitViolationCount;
    }

    public long getTotalCpuUsageMs() {
        return totalCpuUsageMs;
    }

    public void setTotalCpuUsageMs(long totalCpuUsageMs) {
        this.totalCpuUsageMs = totalCpuUsageMs;
    }

    public long getMaxRequestCpuTimeMs() {
        return maxRequestCpuTimeMs;
    }

    public void setMaxRequestCpuTimeMs(long maxRequestCpuTimeMs) {
        this.maxRequestCpuTimeMs = maxRequestCpuTimeMs;
    }

    public int getBlockedTaskCount() {
        return blockedTaskCount;
    }

    public void setBlockedTaskCount(int blockedTaskCount) {
        this.blockedTaskCount = blockedTaskCount;
    }

    public long getTotalLockWaitCount() {
        return totalLockWaitCount;
    }

    public void setTotalLockWaitCount(long totalLockWaitCount) {
        this.totalLockWaitCount = totalLockWaitCount;
    }

    public long getTotalLockWaitTimeMs() {
        return totalLockWaitTimeMs;
    }

    public void setTotalLockWaitTimeMs(long totalLockWaitTimeMs) {
        this.totalLockWaitTimeMs = totalLockWaitTimeMs;
    }

    public long getTotalQueryOptimizationCount() {
        return totalQueryOptimizationCount;
    }

    public void setTotalQueryOptimizationCount(long totalQueryOptimizationCount) {
        this.totalQueryOptimizationCount = totalQueryOptimizationCount;
    }

    public long getTotalSuboptimalPlanGenerationCount() {
        return totalSuboptimalPlanGenerationCount;
    }

    public void setTotalSuboptimalPlanGenerationCount(long totalSuboptimalPlanGenerationCount) {
        this.totalSuboptimalPlanGenerationCount = totalSuboptimalPlanGenerationCount;
    }

    public long getTotalReducedMemgrantCount() {
        return totalReducedMemgrantCount;
    }

    public void setTotalReducedMemgrantCount(long totalReducedMemgrantCount) {
        this.totalReducedMemgrantCount = totalReducedMemgrantCount;
    }

    public long getMaxRequestGrantMemoryKb() {
        return maxRequestGrantMemoryKb;
    }

    public void setMaxRequestGrantMemoryKb(long maxRequestGrantMemoryKb) {
        this.maxRequestGrantMemoryKb = maxRequestGrantMemoryKb;
    }

    public long getActiveParallelThreadCount() {
        return activeParallelThreadCount;
    }

    public void setActiveParallelThreadCount(long activeParallelThreadCount) {
        this.activeParallelThreadCount = activeParallelThreadCount;
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

    public int getGroupMaxRequests() {
        return groupMaxRequests;
    }

    public void setGroupMaxRequests(int groupMaxRequests) {
        this.groupMaxRequests = groupMaxRequests;
    }

    public int getMaxDop() {
        return maxDop;
    }

    public void setMaxDop(int maxDop) {
        this.maxDop = maxDop;
    }

    public int getEffectiveMaxDop() {
        return effectiveMaxDop;
    }

    public void setEffectiveMaxDop(int effectiveMaxDop) {
        this.effectiveMaxDop = effectiveMaxDop;
    }

    public long getTotalCpuUsagePreemptiveMs() {
        return totalCpuUsagePreemptiveMs;
    }

    public void setTotalCpuUsagePreemptiveMs(long totalCpuUsagePreemptiveMs) {
        this.totalCpuUsagePreemptiveMs = totalCpuUsagePreemptiveMs;
    }

    public double getRequestMaxMemoryGrantPercentNumeric() {
        return requestMaxMemoryGrantPercentNumeric;
    }

    public void setRequestMaxMemoryGrantPercentNumeric(double requestMaxMemoryGrantPercentNumeric) {
        this.requestMaxMemoryGrantPercentNumeric = requestMaxMemoryGrantPercentNumeric;
    }
    
}
