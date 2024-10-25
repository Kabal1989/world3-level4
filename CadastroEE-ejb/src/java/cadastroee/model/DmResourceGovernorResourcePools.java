/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "dm_resource_governor_resource_pools")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmResourceGovernorResourcePools.findAll", query = "SELECT d FROM DmResourceGovernorResourcePools d"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByPoolId", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.poolId = :poolId"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByName", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.name = :name"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByStatisticsStartTime", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.statisticsStartTime = :statisticsStartTime"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByTotalCpuUsageMs", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.totalCpuUsageMs = :totalCpuUsageMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByCacheMemoryKb", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.cacheMemoryKb = :cacheMemoryKb"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByCompileMemoryKb", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.compileMemoryKb = :compileMemoryKb"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByUsedMemgrantKb", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.usedMemgrantKb = :usedMemgrantKb"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByTotalMemgrantCount", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.totalMemgrantCount = :totalMemgrantCount"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByTotalMemgrantTimeoutCount", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.totalMemgrantTimeoutCount = :totalMemgrantTimeoutCount"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByActiveMemgrantCount", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.activeMemgrantCount = :activeMemgrantCount"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByActiveMemgrantKb", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.activeMemgrantKb = :activeMemgrantKb"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByMemgrantWaiterCount", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.memgrantWaiterCount = :memgrantWaiterCount"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByMaxMemoryKb", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.maxMemoryKb = :maxMemoryKb"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByUsedMemoryKb", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.usedMemoryKb = :usedMemoryKb"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByTargetMemoryKb", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.targetMemoryKb = :targetMemoryKb"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByOutOfMemoryCount", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.outOfMemoryCount = :outOfMemoryCount"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByMinCpuPercent", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.minCpuPercent = :minCpuPercent"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByMaxCpuPercent", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.maxCpuPercent = :maxCpuPercent"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByMinMemoryPercent", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.minMemoryPercent = :minMemoryPercent"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByMaxMemoryPercent", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.maxMemoryPercent = :maxMemoryPercent"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByCapCpuPercent", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.capCpuPercent = :capCpuPercent"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByMinIopsPerVolume", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.minIopsPerVolume = :minIopsPerVolume"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByMaxIopsPerVolume", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.maxIopsPerVolume = :maxIopsPerVolume"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByReadIoQueuedTotal", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.readIoQueuedTotal = :readIoQueuedTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByReadIoIssuedTotal", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.readIoIssuedTotal = :readIoIssuedTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByReadIoCompletedTotal", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.readIoCompletedTotal = :readIoCompletedTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByReadIoThrottledTotal", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.readIoThrottledTotal = :readIoThrottledTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByReadBytesTotal", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.readBytesTotal = :readBytesTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByReadIoStallTotalMs", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.readIoStallTotalMs = :readIoStallTotalMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByReadIoStallQueuedMs", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.readIoStallQueuedMs = :readIoStallQueuedMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByWriteIoQueuedTotal", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.writeIoQueuedTotal = :writeIoQueuedTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByWriteIoIssuedTotal", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.writeIoIssuedTotal = :writeIoIssuedTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByWriteIoCompletedTotal", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.writeIoCompletedTotal = :writeIoCompletedTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByWriteIoThrottledTotal", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.writeIoThrottledTotal = :writeIoThrottledTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByWriteBytesTotal", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.writeBytesTotal = :writeBytesTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByWriteIoStallTotalMs", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.writeIoStallTotalMs = :writeIoStallTotalMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByWriteIoStallQueuedMs", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.writeIoStallQueuedMs = :writeIoStallQueuedMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByIoIssueViolationsTotal", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.ioIssueViolationsTotal = :ioIssueViolationsTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByIoIssueDelayTotalMs", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.ioIssueDelayTotalMs = :ioIssueDelayTotalMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByIoIssueAheadTotalMs", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.ioIssueAheadTotalMs = :ioIssueAheadTotalMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByReservedIoLimitedByVolumeTotal", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.reservedIoLimitedByVolumeTotal = :reservedIoLimitedByVolumeTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByIoIssueDelayNonThrottledTotalMs", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.ioIssueDelayNonThrottledTotalMs = :ioIssueDelayNonThrottledTotalMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByTotalCpuDelayedMs", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.totalCpuDelayedMs = :totalCpuDelayedMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByTotalCpuActiveMs", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.totalCpuActiveMs = :totalCpuActiveMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByTotalCpuViolationDelayMs", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.totalCpuViolationDelayMs = :totalCpuViolationDelayMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByTotalCpuViolationSec", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.totalCpuViolationSec = :totalCpuViolationSec"),
    @NamedQuery(name = "DmResourceGovernorResourcePools.findByTotalCpuUsagePreemptiveMs", query = "SELECT d FROM DmResourceGovernorResourcePools d WHERE d.totalCpuUsagePreemptiveMs = :totalCpuUsagePreemptiveMs")})
public class DmResourceGovernorResourcePools implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pool_id")
    private int poolId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "statistics_start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statisticsStartTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_cpu_usage_ms")
    private long totalCpuUsageMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cache_memory_kb")
    private long cacheMemoryKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compile_memory_kb")
    private long compileMemoryKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "used_memgrant_kb")
    private long usedMemgrantKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_memgrant_count")
    private long totalMemgrantCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_memgrant_timeout_count")
    private long totalMemgrantTimeoutCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active_memgrant_count")
    private int activeMemgrantCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active_memgrant_kb")
    private long activeMemgrantKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "memgrant_waiter_count")
    private int memgrantWaiterCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_memory_kb")
    private long maxMemoryKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "used_memory_kb")
    private long usedMemoryKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "target_memory_kb")
    private long targetMemoryKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "out_of_memory_count")
    private long outOfMemoryCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_cpu_percent")
    private int minCpuPercent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_cpu_percent")
    private int maxCpuPercent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_memory_percent")
    private int minMemoryPercent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_memory_percent")
    private int maxMemoryPercent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cap_cpu_percent")
    private int capCpuPercent;
    @Column(name = "min_iops_per_volume")
    private Integer minIopsPerVolume;
    @Column(name = "max_iops_per_volume")
    private Integer maxIopsPerVolume;
    @Column(name = "read_io_queued_total")
    private Integer readIoQueuedTotal;
    @Column(name = "read_io_issued_total")
    private Integer readIoIssuedTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "read_io_completed_total")
    private int readIoCompletedTotal;
    @Column(name = "read_io_throttled_total")
    private Integer readIoThrottledTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "read_bytes_total")
    private long readBytesTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "read_io_stall_total_ms")
    private long readIoStallTotalMs;
    @Column(name = "read_io_stall_queued_ms")
    private BigInteger readIoStallQueuedMs;
    @Column(name = "write_io_queued_total")
    private Integer writeIoQueuedTotal;
    @Column(name = "write_io_issued_total")
    private Integer writeIoIssuedTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "write_io_completed_total")
    private int writeIoCompletedTotal;
    @Column(name = "write_io_throttled_total")
    private Integer writeIoThrottledTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "write_bytes_total")
    private long writeBytesTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "write_io_stall_total_ms")
    private long writeIoStallTotalMs;
    @Column(name = "write_io_stall_queued_ms")
    private BigInteger writeIoStallQueuedMs;
    @Column(name = "io_issue_violations_total")
    private Integer ioIssueViolationsTotal;
    @Column(name = "io_issue_delay_total_ms")
    private BigInteger ioIssueDelayTotalMs;
    @Column(name = "io_issue_ahead_total_ms")
    private BigInteger ioIssueAheadTotalMs;
    @Column(name = "reserved_io_limited_by_volume_total")
    private Integer reservedIoLimitedByVolumeTotal;
    @Column(name = "io_issue_delay_non_throttled_total_ms")
    private BigInteger ioIssueDelayNonThrottledTotalMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_cpu_delayed_ms")
    private long totalCpuDelayedMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_cpu_active_ms")
    private long totalCpuActiveMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_cpu_violation_delay_ms")
    private long totalCpuViolationDelayMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_cpu_violation_sec")
    private long totalCpuViolationSec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_cpu_usage_preemptive_ms")
    private long totalCpuUsagePreemptiveMs;

    public DmResourceGovernorResourcePools() {
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStatisticsStartTime() {
        return statisticsStartTime;
    }

    public void setStatisticsStartTime(Date statisticsStartTime) {
        this.statisticsStartTime = statisticsStartTime;
    }

    public long getTotalCpuUsageMs() {
        return totalCpuUsageMs;
    }

    public void setTotalCpuUsageMs(long totalCpuUsageMs) {
        this.totalCpuUsageMs = totalCpuUsageMs;
    }

    public long getCacheMemoryKb() {
        return cacheMemoryKb;
    }

    public void setCacheMemoryKb(long cacheMemoryKb) {
        this.cacheMemoryKb = cacheMemoryKb;
    }

    public long getCompileMemoryKb() {
        return compileMemoryKb;
    }

    public void setCompileMemoryKb(long compileMemoryKb) {
        this.compileMemoryKb = compileMemoryKb;
    }

    public long getUsedMemgrantKb() {
        return usedMemgrantKb;
    }

    public void setUsedMemgrantKb(long usedMemgrantKb) {
        this.usedMemgrantKb = usedMemgrantKb;
    }

    public long getTotalMemgrantCount() {
        return totalMemgrantCount;
    }

    public void setTotalMemgrantCount(long totalMemgrantCount) {
        this.totalMemgrantCount = totalMemgrantCount;
    }

    public long getTotalMemgrantTimeoutCount() {
        return totalMemgrantTimeoutCount;
    }

    public void setTotalMemgrantTimeoutCount(long totalMemgrantTimeoutCount) {
        this.totalMemgrantTimeoutCount = totalMemgrantTimeoutCount;
    }

    public int getActiveMemgrantCount() {
        return activeMemgrantCount;
    }

    public void setActiveMemgrantCount(int activeMemgrantCount) {
        this.activeMemgrantCount = activeMemgrantCount;
    }

    public long getActiveMemgrantKb() {
        return activeMemgrantKb;
    }

    public void setActiveMemgrantKb(long activeMemgrantKb) {
        this.activeMemgrantKb = activeMemgrantKb;
    }

    public int getMemgrantWaiterCount() {
        return memgrantWaiterCount;
    }

    public void setMemgrantWaiterCount(int memgrantWaiterCount) {
        this.memgrantWaiterCount = memgrantWaiterCount;
    }

    public long getMaxMemoryKb() {
        return maxMemoryKb;
    }

    public void setMaxMemoryKb(long maxMemoryKb) {
        this.maxMemoryKb = maxMemoryKb;
    }

    public long getUsedMemoryKb() {
        return usedMemoryKb;
    }

    public void setUsedMemoryKb(long usedMemoryKb) {
        this.usedMemoryKb = usedMemoryKb;
    }

    public long getTargetMemoryKb() {
        return targetMemoryKb;
    }

    public void setTargetMemoryKb(long targetMemoryKb) {
        this.targetMemoryKb = targetMemoryKb;
    }

    public long getOutOfMemoryCount() {
        return outOfMemoryCount;
    }

    public void setOutOfMemoryCount(long outOfMemoryCount) {
        this.outOfMemoryCount = outOfMemoryCount;
    }

    public int getMinCpuPercent() {
        return minCpuPercent;
    }

    public void setMinCpuPercent(int minCpuPercent) {
        this.minCpuPercent = minCpuPercent;
    }

    public int getMaxCpuPercent() {
        return maxCpuPercent;
    }

    public void setMaxCpuPercent(int maxCpuPercent) {
        this.maxCpuPercent = maxCpuPercent;
    }

    public int getMinMemoryPercent() {
        return minMemoryPercent;
    }

    public void setMinMemoryPercent(int minMemoryPercent) {
        this.minMemoryPercent = minMemoryPercent;
    }

    public int getMaxMemoryPercent() {
        return maxMemoryPercent;
    }

    public void setMaxMemoryPercent(int maxMemoryPercent) {
        this.maxMemoryPercent = maxMemoryPercent;
    }

    public int getCapCpuPercent() {
        return capCpuPercent;
    }

    public void setCapCpuPercent(int capCpuPercent) {
        this.capCpuPercent = capCpuPercent;
    }

    public Integer getMinIopsPerVolume() {
        return minIopsPerVolume;
    }

    public void setMinIopsPerVolume(Integer minIopsPerVolume) {
        this.minIopsPerVolume = minIopsPerVolume;
    }

    public Integer getMaxIopsPerVolume() {
        return maxIopsPerVolume;
    }

    public void setMaxIopsPerVolume(Integer maxIopsPerVolume) {
        this.maxIopsPerVolume = maxIopsPerVolume;
    }

    public Integer getReadIoQueuedTotal() {
        return readIoQueuedTotal;
    }

    public void setReadIoQueuedTotal(Integer readIoQueuedTotal) {
        this.readIoQueuedTotal = readIoQueuedTotal;
    }

    public Integer getReadIoIssuedTotal() {
        return readIoIssuedTotal;
    }

    public void setReadIoIssuedTotal(Integer readIoIssuedTotal) {
        this.readIoIssuedTotal = readIoIssuedTotal;
    }

    public int getReadIoCompletedTotal() {
        return readIoCompletedTotal;
    }

    public void setReadIoCompletedTotal(int readIoCompletedTotal) {
        this.readIoCompletedTotal = readIoCompletedTotal;
    }

    public Integer getReadIoThrottledTotal() {
        return readIoThrottledTotal;
    }

    public void setReadIoThrottledTotal(Integer readIoThrottledTotal) {
        this.readIoThrottledTotal = readIoThrottledTotal;
    }

    public long getReadBytesTotal() {
        return readBytesTotal;
    }

    public void setReadBytesTotal(long readBytesTotal) {
        this.readBytesTotal = readBytesTotal;
    }

    public long getReadIoStallTotalMs() {
        return readIoStallTotalMs;
    }

    public void setReadIoStallTotalMs(long readIoStallTotalMs) {
        this.readIoStallTotalMs = readIoStallTotalMs;
    }

    public BigInteger getReadIoStallQueuedMs() {
        return readIoStallQueuedMs;
    }

    public void setReadIoStallQueuedMs(BigInteger readIoStallQueuedMs) {
        this.readIoStallQueuedMs = readIoStallQueuedMs;
    }

    public Integer getWriteIoQueuedTotal() {
        return writeIoQueuedTotal;
    }

    public void setWriteIoQueuedTotal(Integer writeIoQueuedTotal) {
        this.writeIoQueuedTotal = writeIoQueuedTotal;
    }

    public Integer getWriteIoIssuedTotal() {
        return writeIoIssuedTotal;
    }

    public void setWriteIoIssuedTotal(Integer writeIoIssuedTotal) {
        this.writeIoIssuedTotal = writeIoIssuedTotal;
    }

    public int getWriteIoCompletedTotal() {
        return writeIoCompletedTotal;
    }

    public void setWriteIoCompletedTotal(int writeIoCompletedTotal) {
        this.writeIoCompletedTotal = writeIoCompletedTotal;
    }

    public Integer getWriteIoThrottledTotal() {
        return writeIoThrottledTotal;
    }

    public void setWriteIoThrottledTotal(Integer writeIoThrottledTotal) {
        this.writeIoThrottledTotal = writeIoThrottledTotal;
    }

    public long getWriteBytesTotal() {
        return writeBytesTotal;
    }

    public void setWriteBytesTotal(long writeBytesTotal) {
        this.writeBytesTotal = writeBytesTotal;
    }

    public long getWriteIoStallTotalMs() {
        return writeIoStallTotalMs;
    }

    public void setWriteIoStallTotalMs(long writeIoStallTotalMs) {
        this.writeIoStallTotalMs = writeIoStallTotalMs;
    }

    public BigInteger getWriteIoStallQueuedMs() {
        return writeIoStallQueuedMs;
    }

    public void setWriteIoStallQueuedMs(BigInteger writeIoStallQueuedMs) {
        this.writeIoStallQueuedMs = writeIoStallQueuedMs;
    }

    public Integer getIoIssueViolationsTotal() {
        return ioIssueViolationsTotal;
    }

    public void setIoIssueViolationsTotal(Integer ioIssueViolationsTotal) {
        this.ioIssueViolationsTotal = ioIssueViolationsTotal;
    }

    public BigInteger getIoIssueDelayTotalMs() {
        return ioIssueDelayTotalMs;
    }

    public void setIoIssueDelayTotalMs(BigInteger ioIssueDelayTotalMs) {
        this.ioIssueDelayTotalMs = ioIssueDelayTotalMs;
    }

    public BigInteger getIoIssueAheadTotalMs() {
        return ioIssueAheadTotalMs;
    }

    public void setIoIssueAheadTotalMs(BigInteger ioIssueAheadTotalMs) {
        this.ioIssueAheadTotalMs = ioIssueAheadTotalMs;
    }

    public Integer getReservedIoLimitedByVolumeTotal() {
        return reservedIoLimitedByVolumeTotal;
    }

    public void setReservedIoLimitedByVolumeTotal(Integer reservedIoLimitedByVolumeTotal) {
        this.reservedIoLimitedByVolumeTotal = reservedIoLimitedByVolumeTotal;
    }

    public BigInteger getIoIssueDelayNonThrottledTotalMs() {
        return ioIssueDelayNonThrottledTotalMs;
    }

    public void setIoIssueDelayNonThrottledTotalMs(BigInteger ioIssueDelayNonThrottledTotalMs) {
        this.ioIssueDelayNonThrottledTotalMs = ioIssueDelayNonThrottledTotalMs;
    }

    public long getTotalCpuDelayedMs() {
        return totalCpuDelayedMs;
    }

    public void setTotalCpuDelayedMs(long totalCpuDelayedMs) {
        this.totalCpuDelayedMs = totalCpuDelayedMs;
    }

    public long getTotalCpuActiveMs() {
        return totalCpuActiveMs;
    }

    public void setTotalCpuActiveMs(long totalCpuActiveMs) {
        this.totalCpuActiveMs = totalCpuActiveMs;
    }

    public long getTotalCpuViolationDelayMs() {
        return totalCpuViolationDelayMs;
    }

    public void setTotalCpuViolationDelayMs(long totalCpuViolationDelayMs) {
        this.totalCpuViolationDelayMs = totalCpuViolationDelayMs;
    }

    public long getTotalCpuViolationSec() {
        return totalCpuViolationSec;
    }

    public void setTotalCpuViolationSec(long totalCpuViolationSec) {
        this.totalCpuViolationSec = totalCpuViolationSec;
    }

    public long getTotalCpuUsagePreemptiveMs() {
        return totalCpuUsagePreemptiveMs;
    }

    public void setTotalCpuUsagePreemptiveMs(long totalCpuUsagePreemptiveMs) {
        this.totalCpuUsagePreemptiveMs = totalCpuUsagePreemptiveMs;
    }
    
}
