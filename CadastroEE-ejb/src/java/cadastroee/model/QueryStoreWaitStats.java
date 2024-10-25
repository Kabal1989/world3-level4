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
@Table(name = "query_store_wait_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QueryStoreWaitStats.findAll", query = "SELECT q FROM QueryStoreWaitStats q"),
    @NamedQuery(name = "QueryStoreWaitStats.findByWaitStatsId", query = "SELECT q FROM QueryStoreWaitStats q WHERE q.waitStatsId = :waitStatsId"),
    @NamedQuery(name = "QueryStoreWaitStats.findByPlanId", query = "SELECT q FROM QueryStoreWaitStats q WHERE q.planId = :planId"),
    @NamedQuery(name = "QueryStoreWaitStats.findByRuntimeStatsIntervalId", query = "SELECT q FROM QueryStoreWaitStats q WHERE q.runtimeStatsIntervalId = :runtimeStatsIntervalId"),
    @NamedQuery(name = "QueryStoreWaitStats.findByWaitCategory", query = "SELECT q FROM QueryStoreWaitStats q WHERE q.waitCategory = :waitCategory"),
    @NamedQuery(name = "QueryStoreWaitStats.findByWaitCategoryDesc", query = "SELECT q FROM QueryStoreWaitStats q WHERE q.waitCategoryDesc = :waitCategoryDesc"),
    @NamedQuery(name = "QueryStoreWaitStats.findByExecutionType", query = "SELECT q FROM QueryStoreWaitStats q WHERE q.executionType = :executionType"),
    @NamedQuery(name = "QueryStoreWaitStats.findByExecutionTypeDesc", query = "SELECT q FROM QueryStoreWaitStats q WHERE q.executionTypeDesc = :executionTypeDesc"),
    @NamedQuery(name = "QueryStoreWaitStats.findByTotalQueryWaitTimeMs", query = "SELECT q FROM QueryStoreWaitStats q WHERE q.totalQueryWaitTimeMs = :totalQueryWaitTimeMs"),
    @NamedQuery(name = "QueryStoreWaitStats.findByAvgQueryWaitTimeMs", query = "SELECT q FROM QueryStoreWaitStats q WHERE q.avgQueryWaitTimeMs = :avgQueryWaitTimeMs"),
    @NamedQuery(name = "QueryStoreWaitStats.findByLastQueryWaitTimeMs", query = "SELECT q FROM QueryStoreWaitStats q WHERE q.lastQueryWaitTimeMs = :lastQueryWaitTimeMs"),
    @NamedQuery(name = "QueryStoreWaitStats.findByMinQueryWaitTimeMs", query = "SELECT q FROM QueryStoreWaitStats q WHERE q.minQueryWaitTimeMs = :minQueryWaitTimeMs"),
    @NamedQuery(name = "QueryStoreWaitStats.findByMaxQueryWaitTimeMs", query = "SELECT q FROM QueryStoreWaitStats q WHERE q.maxQueryWaitTimeMs = :maxQueryWaitTimeMs"),
    @NamedQuery(name = "QueryStoreWaitStats.findByStdevQueryWaitTimeMs", query = "SELECT q FROM QueryStoreWaitStats q WHERE q.stdevQueryWaitTimeMs = :stdevQueryWaitTimeMs"),
    @NamedQuery(name = "QueryStoreWaitStats.findByReplicaGroupId", query = "SELECT q FROM QueryStoreWaitStats q WHERE q.replicaGroupId = :replicaGroupId")})
public class QueryStoreWaitStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wait_stats_id")
    private long waitStatsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "plan_id")
    private long planId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "runtime_stats_interval_id")
    private long runtimeStatsIntervalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wait_category")
    private short waitCategory;
    @Size(max = 60)
    @Column(name = "wait_category_desc")
    private String waitCategoryDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "execution_type")
    private short executionType;
    @Size(max = 60)
    @Column(name = "execution_type_desc")
    private String executionTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_query_wait_time_ms")
    private long totalQueryWaitTimeMs;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "avg_query_wait_time_ms")
    private Double avgQueryWaitTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_query_wait_time_ms")
    private long lastQueryWaitTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_query_wait_time_ms")
    private long minQueryWaitTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_query_wait_time_ms")
    private long maxQueryWaitTimeMs;
    @Column(name = "stdev_query_wait_time_ms")
    private Double stdevQueryWaitTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "replica_group_id")
    private long replicaGroupId;

    public QueryStoreWaitStats() {
    }

    public long getWaitStatsId() {
        return waitStatsId;
    }

    public void setWaitStatsId(long waitStatsId) {
        this.waitStatsId = waitStatsId;
    }

    public long getPlanId() {
        return planId;
    }

    public void setPlanId(long planId) {
        this.planId = planId;
    }

    public long getRuntimeStatsIntervalId() {
        return runtimeStatsIntervalId;
    }

    public void setRuntimeStatsIntervalId(long runtimeStatsIntervalId) {
        this.runtimeStatsIntervalId = runtimeStatsIntervalId;
    }

    public short getWaitCategory() {
        return waitCategory;
    }

    public void setWaitCategory(short waitCategory) {
        this.waitCategory = waitCategory;
    }

    public String getWaitCategoryDesc() {
        return waitCategoryDesc;
    }

    public void setWaitCategoryDesc(String waitCategoryDesc) {
        this.waitCategoryDesc = waitCategoryDesc;
    }

    public short getExecutionType() {
        return executionType;
    }

    public void setExecutionType(short executionType) {
        this.executionType = executionType;
    }

    public String getExecutionTypeDesc() {
        return executionTypeDesc;
    }

    public void setExecutionTypeDesc(String executionTypeDesc) {
        this.executionTypeDesc = executionTypeDesc;
    }

    public long getTotalQueryWaitTimeMs() {
        return totalQueryWaitTimeMs;
    }

    public void setTotalQueryWaitTimeMs(long totalQueryWaitTimeMs) {
        this.totalQueryWaitTimeMs = totalQueryWaitTimeMs;
    }

    public Double getAvgQueryWaitTimeMs() {
        return avgQueryWaitTimeMs;
    }

    public void setAvgQueryWaitTimeMs(Double avgQueryWaitTimeMs) {
        this.avgQueryWaitTimeMs = avgQueryWaitTimeMs;
    }

    public long getLastQueryWaitTimeMs() {
        return lastQueryWaitTimeMs;
    }

    public void setLastQueryWaitTimeMs(long lastQueryWaitTimeMs) {
        this.lastQueryWaitTimeMs = lastQueryWaitTimeMs;
    }

    public long getMinQueryWaitTimeMs() {
        return minQueryWaitTimeMs;
    }

    public void setMinQueryWaitTimeMs(long minQueryWaitTimeMs) {
        this.minQueryWaitTimeMs = minQueryWaitTimeMs;
    }

    public long getMaxQueryWaitTimeMs() {
        return maxQueryWaitTimeMs;
    }

    public void setMaxQueryWaitTimeMs(long maxQueryWaitTimeMs) {
        this.maxQueryWaitTimeMs = maxQueryWaitTimeMs;
    }

    public Double getStdevQueryWaitTimeMs() {
        return stdevQueryWaitTimeMs;
    }

    public void setStdevQueryWaitTimeMs(Double stdevQueryWaitTimeMs) {
        this.stdevQueryWaitTimeMs = stdevQueryWaitTimeMs;
    }

    public long getReplicaGroupId() {
        return replicaGroupId;
    }

    public void setReplicaGroupId(long replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
    }
    
}
