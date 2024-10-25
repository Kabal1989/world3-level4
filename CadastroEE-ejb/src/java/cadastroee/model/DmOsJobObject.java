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
@Table(name = "dm_os_job_object")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsJobObject.findAll", query = "SELECT d FROM DmOsJobObject d"),
    @NamedQuery(name = "DmOsJobObject.findByCpuRate", query = "SELECT d FROM DmOsJobObject d WHERE d.cpuRate = :cpuRate"),
    @NamedQuery(name = "DmOsJobObject.findByCpuAffinityMask", query = "SELECT d FROM DmOsJobObject d WHERE d.cpuAffinityMask = :cpuAffinityMask"),
    @NamedQuery(name = "DmOsJobObject.findByCpuAffinityGroup", query = "SELECT d FROM DmOsJobObject d WHERE d.cpuAffinityGroup = :cpuAffinityGroup"),
    @NamedQuery(name = "DmOsJobObject.findByMemoryLimitMb", query = "SELECT d FROM DmOsJobObject d WHERE d.memoryLimitMb = :memoryLimitMb"),
    @NamedQuery(name = "DmOsJobObject.findByProcessMemoryLimitMb", query = "SELECT d FROM DmOsJobObject d WHERE d.processMemoryLimitMb = :processMemoryLimitMb"),
    @NamedQuery(name = "DmOsJobObject.findByWorkingsetLimitMb", query = "SELECT d FROM DmOsJobObject d WHERE d.workingsetLimitMb = :workingsetLimitMb"),
    @NamedQuery(name = "DmOsJobObject.findByNonSosMemGapMb", query = "SELECT d FROM DmOsJobObject d WHERE d.nonSosMemGapMb = :nonSosMemGapMb"),
    @NamedQuery(name = "DmOsJobObject.findByLowMemSignalThresholdMb", query = "SELECT d FROM DmOsJobObject d WHERE d.lowMemSignalThresholdMb = :lowMemSignalThresholdMb"),
    @NamedQuery(name = "DmOsJobObject.findByTotalUserTime", query = "SELECT d FROM DmOsJobObject d WHERE d.totalUserTime = :totalUserTime"),
    @NamedQuery(name = "DmOsJobObject.findByTotalKernelTime", query = "SELECT d FROM DmOsJobObject d WHERE d.totalKernelTime = :totalKernelTime"),
    @NamedQuery(name = "DmOsJobObject.findByWriteOperationCount", query = "SELECT d FROM DmOsJobObject d WHERE d.writeOperationCount = :writeOperationCount"),
    @NamedQuery(name = "DmOsJobObject.findByReadOperationCount", query = "SELECT d FROM DmOsJobObject d WHERE d.readOperationCount = :readOperationCount"),
    @NamedQuery(name = "DmOsJobObject.findByPeakProcessMemoryUsedMb", query = "SELECT d FROM DmOsJobObject d WHERE d.peakProcessMemoryUsedMb = :peakProcessMemoryUsedMb"),
    @NamedQuery(name = "DmOsJobObject.findByPeakJobMemoryUsedMb", query = "SELECT d FROM DmOsJobObject d WHERE d.peakJobMemoryUsedMb = :peakJobMemoryUsedMb"),
    @NamedQuery(name = "DmOsJobObject.findByProcessPhysicalAffinity", query = "SELECT d FROM DmOsJobObject d WHERE d.processPhysicalAffinity = :processPhysicalAffinity")})
public class DmOsJobObject implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "cpu_rate")
    private Integer cpuRate;
    @Column(name = "cpu_affinity_mask")
    private BigInteger cpuAffinityMask;
    @Column(name = "cpu_affinity_group")
    private Integer cpuAffinityGroup;
    @Column(name = "memory_limit_mb")
    private BigInteger memoryLimitMb;
    @Column(name = "process_memory_limit_mb")
    private BigInteger processMemoryLimitMb;
    @Column(name = "workingset_limit_mb")
    private BigInteger workingsetLimitMb;
    @Column(name = "non_sos_mem_gap_mb")
    private BigInteger nonSosMemGapMb;
    @Column(name = "low_mem_signal_threshold_mb")
    private BigInteger lowMemSignalThresholdMb;
    @Column(name = "total_user_time")
    private BigInteger totalUserTime;
    @Column(name = "total_kernel_time")
    private BigInteger totalKernelTime;
    @Column(name = "write_operation_count")
    private BigInteger writeOperationCount;
    @Column(name = "read_operation_count")
    private BigInteger readOperationCount;
    @Column(name = "peak_process_memory_used_mb")
    private BigInteger peakProcessMemoryUsedMb;
    @Column(name = "peak_job_memory_used_mb")
    private BigInteger peakJobMemoryUsedMb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3072)
    @Column(name = "process_physical_affinity")
    private String processPhysicalAffinity;

    public DmOsJobObject() {
    }

    public Integer getCpuRate() {
        return cpuRate;
    }

    public void setCpuRate(Integer cpuRate) {
        this.cpuRate = cpuRate;
    }

    public BigInteger getCpuAffinityMask() {
        return cpuAffinityMask;
    }

    public void setCpuAffinityMask(BigInteger cpuAffinityMask) {
        this.cpuAffinityMask = cpuAffinityMask;
    }

    public Integer getCpuAffinityGroup() {
        return cpuAffinityGroup;
    }

    public void setCpuAffinityGroup(Integer cpuAffinityGroup) {
        this.cpuAffinityGroup = cpuAffinityGroup;
    }

    public BigInteger getMemoryLimitMb() {
        return memoryLimitMb;
    }

    public void setMemoryLimitMb(BigInteger memoryLimitMb) {
        this.memoryLimitMb = memoryLimitMb;
    }

    public BigInteger getProcessMemoryLimitMb() {
        return processMemoryLimitMb;
    }

    public void setProcessMemoryLimitMb(BigInteger processMemoryLimitMb) {
        this.processMemoryLimitMb = processMemoryLimitMb;
    }

    public BigInteger getWorkingsetLimitMb() {
        return workingsetLimitMb;
    }

    public void setWorkingsetLimitMb(BigInteger workingsetLimitMb) {
        this.workingsetLimitMb = workingsetLimitMb;
    }

    public BigInteger getNonSosMemGapMb() {
        return nonSosMemGapMb;
    }

    public void setNonSosMemGapMb(BigInteger nonSosMemGapMb) {
        this.nonSosMemGapMb = nonSosMemGapMb;
    }

    public BigInteger getLowMemSignalThresholdMb() {
        return lowMemSignalThresholdMb;
    }

    public void setLowMemSignalThresholdMb(BigInteger lowMemSignalThresholdMb) {
        this.lowMemSignalThresholdMb = lowMemSignalThresholdMb;
    }

    public BigInteger getTotalUserTime() {
        return totalUserTime;
    }

    public void setTotalUserTime(BigInteger totalUserTime) {
        this.totalUserTime = totalUserTime;
    }

    public BigInteger getTotalKernelTime() {
        return totalKernelTime;
    }

    public void setTotalKernelTime(BigInteger totalKernelTime) {
        this.totalKernelTime = totalKernelTime;
    }

    public BigInteger getWriteOperationCount() {
        return writeOperationCount;
    }

    public void setWriteOperationCount(BigInteger writeOperationCount) {
        this.writeOperationCount = writeOperationCount;
    }

    public BigInteger getReadOperationCount() {
        return readOperationCount;
    }

    public void setReadOperationCount(BigInteger readOperationCount) {
        this.readOperationCount = readOperationCount;
    }

    public BigInteger getPeakProcessMemoryUsedMb() {
        return peakProcessMemoryUsedMb;
    }

    public void setPeakProcessMemoryUsedMb(BigInteger peakProcessMemoryUsedMb) {
        this.peakProcessMemoryUsedMb = peakProcessMemoryUsedMb;
    }

    public BigInteger getPeakJobMemoryUsedMb() {
        return peakJobMemoryUsedMb;
    }

    public void setPeakJobMemoryUsedMb(BigInteger peakJobMemoryUsedMb) {
        this.peakJobMemoryUsedMb = peakJobMemoryUsedMb;
    }

    public String getProcessPhysicalAffinity() {
        return processPhysicalAffinity;
    }

    public void setProcessPhysicalAffinity(String processPhysicalAffinity) {
        this.processPhysicalAffinity = processPhysicalAffinity;
    }
    
}
