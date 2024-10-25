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
@Table(name = "dm_resource_governor_external_resource_pools")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmResourceGovernorExternalResourcePools.findAll", query = "SELECT d FROM DmResourceGovernorExternalResourcePools d"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePools.findByExternalPoolId", query = "SELECT d FROM DmResourceGovernorExternalResourcePools d WHERE d.externalPoolId = :externalPoolId"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePools.findByName", query = "SELECT d FROM DmResourceGovernorExternalResourcePools d WHERE d.name = :name"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePools.findByPoolVersion", query = "SELECT d FROM DmResourceGovernorExternalResourcePools d WHERE d.poolVersion = :poolVersion"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePools.findByMaxCpuPercent", query = "SELECT d FROM DmResourceGovernorExternalResourcePools d WHERE d.maxCpuPercent = :maxCpuPercent"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePools.findByMaxProcesses", query = "SELECT d FROM DmResourceGovernorExternalResourcePools d WHERE d.maxProcesses = :maxProcesses"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePools.findByMaxMemoryPercent", query = "SELECT d FROM DmResourceGovernorExternalResourcePools d WHERE d.maxMemoryPercent = :maxMemoryPercent"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePools.findByStatisticsStartTime", query = "SELECT d FROM DmResourceGovernorExternalResourcePools d WHERE d.statisticsStartTime = :statisticsStartTime"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePools.findByPeakMemoryKb", query = "SELECT d FROM DmResourceGovernorExternalResourcePools d WHERE d.peakMemoryKb = :peakMemoryKb"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePools.findByWriteIoCount", query = "SELECT d FROM DmResourceGovernorExternalResourcePools d WHERE d.writeIoCount = :writeIoCount"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePools.findByReadIoCount", query = "SELECT d FROM DmResourceGovernorExternalResourcePools d WHERE d.readIoCount = :readIoCount"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePools.findByTotalCpuKernelMs", query = "SELECT d FROM DmResourceGovernorExternalResourcePools d WHERE d.totalCpuKernelMs = :totalCpuKernelMs"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePools.findByTotalCpuUserMs", query = "SELECT d FROM DmResourceGovernorExternalResourcePools d WHERE d.totalCpuUserMs = :totalCpuUserMs"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePools.findByActiveProcessesCount", query = "SELECT d FROM DmResourceGovernorExternalResourcePools d WHERE d.activeProcessesCount = :activeProcessesCount")})
public class DmResourceGovernorExternalResourcePools implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_pool_id")
    private int externalPoolId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pool_version")
    private long poolVersion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_cpu_percent")
    private int maxCpuPercent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_processes")
    private int maxProcesses;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_memory_percent")
    private int maxMemoryPercent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "statistics_start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statisticsStartTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "peak_memory_kb")
    private long peakMemoryKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "write_io_count")
    private long writeIoCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "read_io_count")
    private long readIoCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_cpu_kernel_ms")
    private long totalCpuKernelMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_cpu_user_ms")
    private long totalCpuUserMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active_processes_count")
    private long activeProcessesCount;

    public DmResourceGovernorExternalResourcePools() {
    }

    public int getExternalPoolId() {
        return externalPoolId;
    }

    public void setExternalPoolId(int externalPoolId) {
        this.externalPoolId = externalPoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPoolVersion() {
        return poolVersion;
    }

    public void setPoolVersion(long poolVersion) {
        this.poolVersion = poolVersion;
    }

    public int getMaxCpuPercent() {
        return maxCpuPercent;
    }

    public void setMaxCpuPercent(int maxCpuPercent) {
        this.maxCpuPercent = maxCpuPercent;
    }

    public int getMaxProcesses() {
        return maxProcesses;
    }

    public void setMaxProcesses(int maxProcesses) {
        this.maxProcesses = maxProcesses;
    }

    public int getMaxMemoryPercent() {
        return maxMemoryPercent;
    }

    public void setMaxMemoryPercent(int maxMemoryPercent) {
        this.maxMemoryPercent = maxMemoryPercent;
    }

    public Date getStatisticsStartTime() {
        return statisticsStartTime;
    }

    public void setStatisticsStartTime(Date statisticsStartTime) {
        this.statisticsStartTime = statisticsStartTime;
    }

    public long getPeakMemoryKb() {
        return peakMemoryKb;
    }

    public void setPeakMemoryKb(long peakMemoryKb) {
        this.peakMemoryKb = peakMemoryKb;
    }

    public long getWriteIoCount() {
        return writeIoCount;
    }

    public void setWriteIoCount(long writeIoCount) {
        this.writeIoCount = writeIoCount;
    }

    public long getReadIoCount() {
        return readIoCount;
    }

    public void setReadIoCount(long readIoCount) {
        this.readIoCount = readIoCount;
    }

    public long getTotalCpuKernelMs() {
        return totalCpuKernelMs;
    }

    public void setTotalCpuKernelMs(long totalCpuKernelMs) {
        this.totalCpuKernelMs = totalCpuKernelMs;
    }

    public long getTotalCpuUserMs() {
        return totalCpuUserMs;
    }

    public void setTotalCpuUserMs(long totalCpuUserMs) {
        this.totalCpuUserMs = totalCpuUserMs;
    }

    public long getActiveProcessesCount() {
        return activeProcessesCount;
    }

    public void setActiveProcessesCount(long activeProcessesCount) {
        this.activeProcessesCount = activeProcessesCount;
    }
    
}
