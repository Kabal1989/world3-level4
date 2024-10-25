/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "query_store_runtime_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QueryStoreRuntimeStats.findAll", query = "SELECT q FROM QueryStoreRuntimeStats q"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByRuntimeStatsId", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.runtimeStatsId = :runtimeStatsId"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByPlanId", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.planId = :planId"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByRuntimeStatsIntervalId", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.runtimeStatsIntervalId = :runtimeStatsIntervalId"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByExecutionType", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.executionType = :executionType"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByExecutionTypeDesc", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.executionTypeDesc = :executionTypeDesc"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByFirstExecutionTime", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.firstExecutionTime = :firstExecutionTime"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByLastExecutionTime", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.lastExecutionTime = :lastExecutionTime"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByCountExecutions", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.countExecutions = :countExecutions"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByAvgDuration", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.avgDuration = :avgDuration"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByLastDuration", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.lastDuration = :lastDuration"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMinDuration", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.minDuration = :minDuration"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMaxDuration", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.maxDuration = :maxDuration"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByStdevDuration", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.stdevDuration = :stdevDuration"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByAvgCpuTime", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.avgCpuTime = :avgCpuTime"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByLastCpuTime", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.lastCpuTime = :lastCpuTime"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMinCpuTime", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.minCpuTime = :minCpuTime"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMaxCpuTime", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.maxCpuTime = :maxCpuTime"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByStdevCpuTime", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.stdevCpuTime = :stdevCpuTime"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByAvgLogicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.avgLogicalIoReads = :avgLogicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByLastLogicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.lastLogicalIoReads = :lastLogicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMinLogicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.minLogicalIoReads = :minLogicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMaxLogicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.maxLogicalIoReads = :maxLogicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByStdevLogicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.stdevLogicalIoReads = :stdevLogicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByAvgLogicalIoWrites", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.avgLogicalIoWrites = :avgLogicalIoWrites"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByLastLogicalIoWrites", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.lastLogicalIoWrites = :lastLogicalIoWrites"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMinLogicalIoWrites", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.minLogicalIoWrites = :minLogicalIoWrites"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMaxLogicalIoWrites", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.maxLogicalIoWrites = :maxLogicalIoWrites"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByStdevLogicalIoWrites", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.stdevLogicalIoWrites = :stdevLogicalIoWrites"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByAvgPhysicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.avgPhysicalIoReads = :avgPhysicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByLastPhysicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.lastPhysicalIoReads = :lastPhysicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMinPhysicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.minPhysicalIoReads = :minPhysicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMaxPhysicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.maxPhysicalIoReads = :maxPhysicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByStdevPhysicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.stdevPhysicalIoReads = :stdevPhysicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByAvgClrTime", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.avgClrTime = :avgClrTime"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByLastClrTime", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.lastClrTime = :lastClrTime"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMinClrTime", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.minClrTime = :minClrTime"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMaxClrTime", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.maxClrTime = :maxClrTime"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByStdevClrTime", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.stdevClrTime = :stdevClrTime"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByAvgDop", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.avgDop = :avgDop"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByLastDop", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.lastDop = :lastDop"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMinDop", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.minDop = :minDop"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMaxDop", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.maxDop = :maxDop"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByStdevDop", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.stdevDop = :stdevDop"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByAvgQueryMaxUsedMemory", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.avgQueryMaxUsedMemory = :avgQueryMaxUsedMemory"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByLastQueryMaxUsedMemory", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.lastQueryMaxUsedMemory = :lastQueryMaxUsedMemory"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMinQueryMaxUsedMemory", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.minQueryMaxUsedMemory = :minQueryMaxUsedMemory"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMaxQueryMaxUsedMemory", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.maxQueryMaxUsedMemory = :maxQueryMaxUsedMemory"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByStdevQueryMaxUsedMemory", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.stdevQueryMaxUsedMemory = :stdevQueryMaxUsedMemory"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByAvgRowcount", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.avgRowcount = :avgRowcount"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByLastRowcount", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.lastRowcount = :lastRowcount"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMinRowcount", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.minRowcount = :minRowcount"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMaxRowcount", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.maxRowcount = :maxRowcount"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByStdevRowcount", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.stdevRowcount = :stdevRowcount"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByAvgNumPhysicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.avgNumPhysicalIoReads = :avgNumPhysicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByLastNumPhysicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.lastNumPhysicalIoReads = :lastNumPhysicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMinNumPhysicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.minNumPhysicalIoReads = :minNumPhysicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMaxNumPhysicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.maxNumPhysicalIoReads = :maxNumPhysicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByStdevNumPhysicalIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.stdevNumPhysicalIoReads = :stdevNumPhysicalIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByAvgLogBytesUsed", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.avgLogBytesUsed = :avgLogBytesUsed"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByLastLogBytesUsed", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.lastLogBytesUsed = :lastLogBytesUsed"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMinLogBytesUsed", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.minLogBytesUsed = :minLogBytesUsed"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMaxLogBytesUsed", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.maxLogBytesUsed = :maxLogBytesUsed"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByStdevLogBytesUsed", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.stdevLogBytesUsed = :stdevLogBytesUsed"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByAvgTempdbSpaceUsed", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.avgTempdbSpaceUsed = :avgTempdbSpaceUsed"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByLastTempdbSpaceUsed", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.lastTempdbSpaceUsed = :lastTempdbSpaceUsed"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMinTempdbSpaceUsed", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.minTempdbSpaceUsed = :minTempdbSpaceUsed"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMaxTempdbSpaceUsed", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.maxTempdbSpaceUsed = :maxTempdbSpaceUsed"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByStdevTempdbSpaceUsed", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.stdevTempdbSpaceUsed = :stdevTempdbSpaceUsed"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByAvgPageServerIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.avgPageServerIoReads = :avgPageServerIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByLastPageServerIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.lastPageServerIoReads = :lastPageServerIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMinPageServerIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.minPageServerIoReads = :minPageServerIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByMaxPageServerIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.maxPageServerIoReads = :maxPageServerIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByStdevPageServerIoReads", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.stdevPageServerIoReads = :stdevPageServerIoReads"),
    @NamedQuery(name = "QueryStoreRuntimeStats.findByReplicaGroupId", query = "SELECT q FROM QueryStoreRuntimeStats q WHERE q.replicaGroupId = :replicaGroupId")})
public class QueryStoreRuntimeStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "runtime_stats_id")
    private long runtimeStatsId;
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
    @Column(name = "execution_type")
    private short executionType;
    @Size(max = 60)
    @Column(name = "execution_type_desc")
    private String executionTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "first_execution_time")
    private Serializable firstExecutionTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_execution_time")
    private Serializable lastExecutionTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "count_executions")
    private long countExecutions;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "avg_duration")
    private Double avgDuration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_duration")
    private long lastDuration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_duration")
    private long minDuration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_duration")
    private long maxDuration;
    @Column(name = "stdev_duration")
    private Double stdevDuration;
    @Column(name = "avg_cpu_time")
    private Double avgCpuTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_cpu_time")
    private long lastCpuTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_cpu_time")
    private long minCpuTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_cpu_time")
    private long maxCpuTime;
    @Column(name = "stdev_cpu_time")
    private Double stdevCpuTime;
    @Column(name = "avg_logical_io_reads")
    private Double avgLogicalIoReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_logical_io_reads")
    private long lastLogicalIoReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_logical_io_reads")
    private long minLogicalIoReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_logical_io_reads")
    private long maxLogicalIoReads;
    @Column(name = "stdev_logical_io_reads")
    private Double stdevLogicalIoReads;
    @Column(name = "avg_logical_io_writes")
    private Double avgLogicalIoWrites;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_logical_io_writes")
    private long lastLogicalIoWrites;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_logical_io_writes")
    private long minLogicalIoWrites;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_logical_io_writes")
    private long maxLogicalIoWrites;
    @Column(name = "stdev_logical_io_writes")
    private Double stdevLogicalIoWrites;
    @Column(name = "avg_physical_io_reads")
    private Double avgPhysicalIoReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_physical_io_reads")
    private long lastPhysicalIoReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_physical_io_reads")
    private long minPhysicalIoReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_physical_io_reads")
    private long maxPhysicalIoReads;
    @Column(name = "stdev_physical_io_reads")
    private Double stdevPhysicalIoReads;
    @Column(name = "avg_clr_time")
    private Double avgClrTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_clr_time")
    private long lastClrTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_clr_time")
    private long minClrTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_clr_time")
    private long maxClrTime;
    @Column(name = "stdev_clr_time")
    private Double stdevClrTime;
    @Column(name = "avg_dop")
    private Double avgDop;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_dop")
    private long lastDop;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_dop")
    private long minDop;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_dop")
    private long maxDop;
    @Column(name = "stdev_dop")
    private Double stdevDop;
    @Column(name = "avg_query_max_used_memory")
    private Double avgQueryMaxUsedMemory;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_query_max_used_memory")
    private long lastQueryMaxUsedMemory;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_query_max_used_memory")
    private long minQueryMaxUsedMemory;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_query_max_used_memory")
    private long maxQueryMaxUsedMemory;
    @Column(name = "stdev_query_max_used_memory")
    private Double stdevQueryMaxUsedMemory;
    @Column(name = "avg_rowcount")
    private Double avgRowcount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_rowcount")
    private long lastRowcount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_rowcount")
    private long minRowcount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_rowcount")
    private long maxRowcount;
    @Column(name = "stdev_rowcount")
    private Double stdevRowcount;
    @Column(name = "avg_num_physical_io_reads")
    private Double avgNumPhysicalIoReads;
    @Column(name = "last_num_physical_io_reads")
    private BigInteger lastNumPhysicalIoReads;
    @Column(name = "min_num_physical_io_reads")
    private BigInteger minNumPhysicalIoReads;
    @Column(name = "max_num_physical_io_reads")
    private BigInteger maxNumPhysicalIoReads;
    @Column(name = "stdev_num_physical_io_reads")
    private Double stdevNumPhysicalIoReads;
    @Column(name = "avg_log_bytes_used")
    private Double avgLogBytesUsed;
    @Column(name = "last_log_bytes_used")
    private BigInteger lastLogBytesUsed;
    @Column(name = "min_log_bytes_used")
    private BigInteger minLogBytesUsed;
    @Column(name = "max_log_bytes_used")
    private BigInteger maxLogBytesUsed;
    @Column(name = "stdev_log_bytes_used")
    private Double stdevLogBytesUsed;
    @Column(name = "avg_tempdb_space_used")
    private Double avgTempdbSpaceUsed;
    @Column(name = "last_tempdb_space_used")
    private BigInteger lastTempdbSpaceUsed;
    @Column(name = "min_tempdb_space_used")
    private BigInteger minTempdbSpaceUsed;
    @Column(name = "max_tempdb_space_used")
    private BigInteger maxTempdbSpaceUsed;
    @Column(name = "stdev_tempdb_space_used")
    private Double stdevTempdbSpaceUsed;
    @Column(name = "avg_page_server_io_reads")
    private Double avgPageServerIoReads;
    @Column(name = "last_page_server_io_reads")
    private BigInteger lastPageServerIoReads;
    @Column(name = "min_page_server_io_reads")
    private BigInteger minPageServerIoReads;
    @Column(name = "max_page_server_io_reads")
    private BigInteger maxPageServerIoReads;
    @Column(name = "stdev_page_server_io_reads")
    private Double stdevPageServerIoReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "replica_group_id")
    private long replicaGroupId;

    public QueryStoreRuntimeStats() {
    }

    public long getRuntimeStatsId() {
        return runtimeStatsId;
    }

    public void setRuntimeStatsId(long runtimeStatsId) {
        this.runtimeStatsId = runtimeStatsId;
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

    public Serializable getFirstExecutionTime() {
        return firstExecutionTime;
    }

    public void setFirstExecutionTime(Serializable firstExecutionTime) {
        this.firstExecutionTime = firstExecutionTime;
    }

    public Serializable getLastExecutionTime() {
        return lastExecutionTime;
    }

    public void setLastExecutionTime(Serializable lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
    }

    public long getCountExecutions() {
        return countExecutions;
    }

    public void setCountExecutions(long countExecutions) {
        this.countExecutions = countExecutions;
    }

    public Double getAvgDuration() {
        return avgDuration;
    }

    public void setAvgDuration(Double avgDuration) {
        this.avgDuration = avgDuration;
    }

    public long getLastDuration() {
        return lastDuration;
    }

    public void setLastDuration(long lastDuration) {
        this.lastDuration = lastDuration;
    }

    public long getMinDuration() {
        return minDuration;
    }

    public void setMinDuration(long minDuration) {
        this.minDuration = minDuration;
    }

    public long getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(long maxDuration) {
        this.maxDuration = maxDuration;
    }

    public Double getStdevDuration() {
        return stdevDuration;
    }

    public void setStdevDuration(Double stdevDuration) {
        this.stdevDuration = stdevDuration;
    }

    public Double getAvgCpuTime() {
        return avgCpuTime;
    }

    public void setAvgCpuTime(Double avgCpuTime) {
        this.avgCpuTime = avgCpuTime;
    }

    public long getLastCpuTime() {
        return lastCpuTime;
    }

    public void setLastCpuTime(long lastCpuTime) {
        this.lastCpuTime = lastCpuTime;
    }

    public long getMinCpuTime() {
        return minCpuTime;
    }

    public void setMinCpuTime(long minCpuTime) {
        this.minCpuTime = minCpuTime;
    }

    public long getMaxCpuTime() {
        return maxCpuTime;
    }

    public void setMaxCpuTime(long maxCpuTime) {
        this.maxCpuTime = maxCpuTime;
    }

    public Double getStdevCpuTime() {
        return stdevCpuTime;
    }

    public void setStdevCpuTime(Double stdevCpuTime) {
        this.stdevCpuTime = stdevCpuTime;
    }

    public Double getAvgLogicalIoReads() {
        return avgLogicalIoReads;
    }

    public void setAvgLogicalIoReads(Double avgLogicalIoReads) {
        this.avgLogicalIoReads = avgLogicalIoReads;
    }

    public long getLastLogicalIoReads() {
        return lastLogicalIoReads;
    }

    public void setLastLogicalIoReads(long lastLogicalIoReads) {
        this.lastLogicalIoReads = lastLogicalIoReads;
    }

    public long getMinLogicalIoReads() {
        return minLogicalIoReads;
    }

    public void setMinLogicalIoReads(long minLogicalIoReads) {
        this.minLogicalIoReads = minLogicalIoReads;
    }

    public long getMaxLogicalIoReads() {
        return maxLogicalIoReads;
    }

    public void setMaxLogicalIoReads(long maxLogicalIoReads) {
        this.maxLogicalIoReads = maxLogicalIoReads;
    }

    public Double getStdevLogicalIoReads() {
        return stdevLogicalIoReads;
    }

    public void setStdevLogicalIoReads(Double stdevLogicalIoReads) {
        this.stdevLogicalIoReads = stdevLogicalIoReads;
    }

    public Double getAvgLogicalIoWrites() {
        return avgLogicalIoWrites;
    }

    public void setAvgLogicalIoWrites(Double avgLogicalIoWrites) {
        this.avgLogicalIoWrites = avgLogicalIoWrites;
    }

    public long getLastLogicalIoWrites() {
        return lastLogicalIoWrites;
    }

    public void setLastLogicalIoWrites(long lastLogicalIoWrites) {
        this.lastLogicalIoWrites = lastLogicalIoWrites;
    }

    public long getMinLogicalIoWrites() {
        return minLogicalIoWrites;
    }

    public void setMinLogicalIoWrites(long minLogicalIoWrites) {
        this.minLogicalIoWrites = minLogicalIoWrites;
    }

    public long getMaxLogicalIoWrites() {
        return maxLogicalIoWrites;
    }

    public void setMaxLogicalIoWrites(long maxLogicalIoWrites) {
        this.maxLogicalIoWrites = maxLogicalIoWrites;
    }

    public Double getStdevLogicalIoWrites() {
        return stdevLogicalIoWrites;
    }

    public void setStdevLogicalIoWrites(Double stdevLogicalIoWrites) {
        this.stdevLogicalIoWrites = stdevLogicalIoWrites;
    }

    public Double getAvgPhysicalIoReads() {
        return avgPhysicalIoReads;
    }

    public void setAvgPhysicalIoReads(Double avgPhysicalIoReads) {
        this.avgPhysicalIoReads = avgPhysicalIoReads;
    }

    public long getLastPhysicalIoReads() {
        return lastPhysicalIoReads;
    }

    public void setLastPhysicalIoReads(long lastPhysicalIoReads) {
        this.lastPhysicalIoReads = lastPhysicalIoReads;
    }

    public long getMinPhysicalIoReads() {
        return minPhysicalIoReads;
    }

    public void setMinPhysicalIoReads(long minPhysicalIoReads) {
        this.minPhysicalIoReads = minPhysicalIoReads;
    }

    public long getMaxPhysicalIoReads() {
        return maxPhysicalIoReads;
    }

    public void setMaxPhysicalIoReads(long maxPhysicalIoReads) {
        this.maxPhysicalIoReads = maxPhysicalIoReads;
    }

    public Double getStdevPhysicalIoReads() {
        return stdevPhysicalIoReads;
    }

    public void setStdevPhysicalIoReads(Double stdevPhysicalIoReads) {
        this.stdevPhysicalIoReads = stdevPhysicalIoReads;
    }

    public Double getAvgClrTime() {
        return avgClrTime;
    }

    public void setAvgClrTime(Double avgClrTime) {
        this.avgClrTime = avgClrTime;
    }

    public long getLastClrTime() {
        return lastClrTime;
    }

    public void setLastClrTime(long lastClrTime) {
        this.lastClrTime = lastClrTime;
    }

    public long getMinClrTime() {
        return minClrTime;
    }

    public void setMinClrTime(long minClrTime) {
        this.minClrTime = minClrTime;
    }

    public long getMaxClrTime() {
        return maxClrTime;
    }

    public void setMaxClrTime(long maxClrTime) {
        this.maxClrTime = maxClrTime;
    }

    public Double getStdevClrTime() {
        return stdevClrTime;
    }

    public void setStdevClrTime(Double stdevClrTime) {
        this.stdevClrTime = stdevClrTime;
    }

    public Double getAvgDop() {
        return avgDop;
    }

    public void setAvgDop(Double avgDop) {
        this.avgDop = avgDop;
    }

    public long getLastDop() {
        return lastDop;
    }

    public void setLastDop(long lastDop) {
        this.lastDop = lastDop;
    }

    public long getMinDop() {
        return minDop;
    }

    public void setMinDop(long minDop) {
        this.minDop = minDop;
    }

    public long getMaxDop() {
        return maxDop;
    }

    public void setMaxDop(long maxDop) {
        this.maxDop = maxDop;
    }

    public Double getStdevDop() {
        return stdevDop;
    }

    public void setStdevDop(Double stdevDop) {
        this.stdevDop = stdevDop;
    }

    public Double getAvgQueryMaxUsedMemory() {
        return avgQueryMaxUsedMemory;
    }

    public void setAvgQueryMaxUsedMemory(Double avgQueryMaxUsedMemory) {
        this.avgQueryMaxUsedMemory = avgQueryMaxUsedMemory;
    }

    public long getLastQueryMaxUsedMemory() {
        return lastQueryMaxUsedMemory;
    }

    public void setLastQueryMaxUsedMemory(long lastQueryMaxUsedMemory) {
        this.lastQueryMaxUsedMemory = lastQueryMaxUsedMemory;
    }

    public long getMinQueryMaxUsedMemory() {
        return minQueryMaxUsedMemory;
    }

    public void setMinQueryMaxUsedMemory(long minQueryMaxUsedMemory) {
        this.minQueryMaxUsedMemory = minQueryMaxUsedMemory;
    }

    public long getMaxQueryMaxUsedMemory() {
        return maxQueryMaxUsedMemory;
    }

    public void setMaxQueryMaxUsedMemory(long maxQueryMaxUsedMemory) {
        this.maxQueryMaxUsedMemory = maxQueryMaxUsedMemory;
    }

    public Double getStdevQueryMaxUsedMemory() {
        return stdevQueryMaxUsedMemory;
    }

    public void setStdevQueryMaxUsedMemory(Double stdevQueryMaxUsedMemory) {
        this.stdevQueryMaxUsedMemory = stdevQueryMaxUsedMemory;
    }

    public Double getAvgRowcount() {
        return avgRowcount;
    }

    public void setAvgRowcount(Double avgRowcount) {
        this.avgRowcount = avgRowcount;
    }

    public long getLastRowcount() {
        return lastRowcount;
    }

    public void setLastRowcount(long lastRowcount) {
        this.lastRowcount = lastRowcount;
    }

    public long getMinRowcount() {
        return minRowcount;
    }

    public void setMinRowcount(long minRowcount) {
        this.minRowcount = minRowcount;
    }

    public long getMaxRowcount() {
        return maxRowcount;
    }

    public void setMaxRowcount(long maxRowcount) {
        this.maxRowcount = maxRowcount;
    }

    public Double getStdevRowcount() {
        return stdevRowcount;
    }

    public void setStdevRowcount(Double stdevRowcount) {
        this.stdevRowcount = stdevRowcount;
    }

    public Double getAvgNumPhysicalIoReads() {
        return avgNumPhysicalIoReads;
    }

    public void setAvgNumPhysicalIoReads(Double avgNumPhysicalIoReads) {
        this.avgNumPhysicalIoReads = avgNumPhysicalIoReads;
    }

    public BigInteger getLastNumPhysicalIoReads() {
        return lastNumPhysicalIoReads;
    }

    public void setLastNumPhysicalIoReads(BigInteger lastNumPhysicalIoReads) {
        this.lastNumPhysicalIoReads = lastNumPhysicalIoReads;
    }

    public BigInteger getMinNumPhysicalIoReads() {
        return minNumPhysicalIoReads;
    }

    public void setMinNumPhysicalIoReads(BigInteger minNumPhysicalIoReads) {
        this.minNumPhysicalIoReads = minNumPhysicalIoReads;
    }

    public BigInteger getMaxNumPhysicalIoReads() {
        return maxNumPhysicalIoReads;
    }

    public void setMaxNumPhysicalIoReads(BigInteger maxNumPhysicalIoReads) {
        this.maxNumPhysicalIoReads = maxNumPhysicalIoReads;
    }

    public Double getStdevNumPhysicalIoReads() {
        return stdevNumPhysicalIoReads;
    }

    public void setStdevNumPhysicalIoReads(Double stdevNumPhysicalIoReads) {
        this.stdevNumPhysicalIoReads = stdevNumPhysicalIoReads;
    }

    public Double getAvgLogBytesUsed() {
        return avgLogBytesUsed;
    }

    public void setAvgLogBytesUsed(Double avgLogBytesUsed) {
        this.avgLogBytesUsed = avgLogBytesUsed;
    }

    public BigInteger getLastLogBytesUsed() {
        return lastLogBytesUsed;
    }

    public void setLastLogBytesUsed(BigInteger lastLogBytesUsed) {
        this.lastLogBytesUsed = lastLogBytesUsed;
    }

    public BigInteger getMinLogBytesUsed() {
        return minLogBytesUsed;
    }

    public void setMinLogBytesUsed(BigInteger minLogBytesUsed) {
        this.minLogBytesUsed = minLogBytesUsed;
    }

    public BigInteger getMaxLogBytesUsed() {
        return maxLogBytesUsed;
    }

    public void setMaxLogBytesUsed(BigInteger maxLogBytesUsed) {
        this.maxLogBytesUsed = maxLogBytesUsed;
    }

    public Double getStdevLogBytesUsed() {
        return stdevLogBytesUsed;
    }

    public void setStdevLogBytesUsed(Double stdevLogBytesUsed) {
        this.stdevLogBytesUsed = stdevLogBytesUsed;
    }

    public Double getAvgTempdbSpaceUsed() {
        return avgTempdbSpaceUsed;
    }

    public void setAvgTempdbSpaceUsed(Double avgTempdbSpaceUsed) {
        this.avgTempdbSpaceUsed = avgTempdbSpaceUsed;
    }

    public BigInteger getLastTempdbSpaceUsed() {
        return lastTempdbSpaceUsed;
    }

    public void setLastTempdbSpaceUsed(BigInteger lastTempdbSpaceUsed) {
        this.lastTempdbSpaceUsed = lastTempdbSpaceUsed;
    }

    public BigInteger getMinTempdbSpaceUsed() {
        return minTempdbSpaceUsed;
    }

    public void setMinTempdbSpaceUsed(BigInteger minTempdbSpaceUsed) {
        this.minTempdbSpaceUsed = minTempdbSpaceUsed;
    }

    public BigInteger getMaxTempdbSpaceUsed() {
        return maxTempdbSpaceUsed;
    }

    public void setMaxTempdbSpaceUsed(BigInteger maxTempdbSpaceUsed) {
        this.maxTempdbSpaceUsed = maxTempdbSpaceUsed;
    }

    public Double getStdevTempdbSpaceUsed() {
        return stdevTempdbSpaceUsed;
    }

    public void setStdevTempdbSpaceUsed(Double stdevTempdbSpaceUsed) {
        this.stdevTempdbSpaceUsed = stdevTempdbSpaceUsed;
    }

    public Double getAvgPageServerIoReads() {
        return avgPageServerIoReads;
    }

    public void setAvgPageServerIoReads(Double avgPageServerIoReads) {
        this.avgPageServerIoReads = avgPageServerIoReads;
    }

    public BigInteger getLastPageServerIoReads() {
        return lastPageServerIoReads;
    }

    public void setLastPageServerIoReads(BigInteger lastPageServerIoReads) {
        this.lastPageServerIoReads = lastPageServerIoReads;
    }

    public BigInteger getMinPageServerIoReads() {
        return minPageServerIoReads;
    }

    public void setMinPageServerIoReads(BigInteger minPageServerIoReads) {
        this.minPageServerIoReads = minPageServerIoReads;
    }

    public BigInteger getMaxPageServerIoReads() {
        return maxPageServerIoReads;
    }

    public void setMaxPageServerIoReads(BigInteger maxPageServerIoReads) {
        this.maxPageServerIoReads = maxPageServerIoReads;
    }

    public Double getStdevPageServerIoReads() {
        return stdevPageServerIoReads;
    }

    public void setStdevPageServerIoReads(Double stdevPageServerIoReads) {
        this.stdevPageServerIoReads = stdevPageServerIoReads;
    }

    public long getReplicaGroupId() {
        return replicaGroupId;
    }

    public void setReplicaGroupId(long replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
    }
    
}
