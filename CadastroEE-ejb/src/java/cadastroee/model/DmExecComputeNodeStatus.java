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
@Table(name = "dm_exec_compute_node_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecComputeNodeStatus.findAll", query = "SELECT d FROM DmExecComputeNodeStatus d"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findByComputeNodeId", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.computeNodeId = :computeNodeId"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findByProcessId", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.processId = :processId"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findByProcessName", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.processName = :processName"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findByAllocatedMemory", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.allocatedMemory = :allocatedMemory"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findByAvailableMemory", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.availableMemory = :availableMemory"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findByProcessCpuUsage", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.processCpuUsage = :processCpuUsage"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findByTotalCpuUsage", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.totalCpuUsage = :totalCpuUsage"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findByThreadCount", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.threadCount = :threadCount"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findByHandleCount", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.handleCount = :handleCount"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findByTotalElapsedTime", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.totalElapsedTime = :totalElapsedTime"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findByIsAvailable", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.isAvailable = :isAvailable"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findBySentTime", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.sentTime = :sentTime"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findByReceivedTime", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.receivedTime = :receivedTime"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findByErrorId", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.errorId = :errorId"),
    @NamedQuery(name = "DmExecComputeNodeStatus.findByComputePoolId", query = "SELECT d FROM DmExecComputeNodeStatus d WHERE d.computePoolId = :computePoolId")})
public class DmExecComputeNodeStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "compute_node_id")
    private Integer computeNodeId;
    @Column(name = "process_id")
    private Integer processId;
    @Size(max = 255)
    @Column(name = "process_name")
    private String processName;
    @Column(name = "allocated_memory")
    private BigInteger allocatedMemory;
    @Column(name = "available_memory")
    private BigInteger availableMemory;
    @Column(name = "process_cpu_usage")
    private BigInteger processCpuUsage;
    @Column(name = "total_cpu_usage")
    private BigInteger totalCpuUsage;
    @Column(name = "thread_count")
    private BigInteger threadCount;
    @Column(name = "handle_count")
    private BigInteger handleCount;
    @Column(name = "total_elapsed_time")
    private BigInteger totalElapsedTime;
    @Column(name = "is_available")
    private Boolean isAvailable;
    @Column(name = "sent_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sentTime;
    @Column(name = "received_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivedTime;
    @Size(max = 36)
    @Column(name = "error_id")
    private String errorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compute_pool_id")
    private int computePoolId;

    public DmExecComputeNodeStatus() {
    }

    public Integer getComputeNodeId() {
        return computeNodeId;
    }

    public void setComputeNodeId(Integer computeNodeId) {
        this.computeNodeId = computeNodeId;
    }

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public BigInteger getAllocatedMemory() {
        return allocatedMemory;
    }

    public void setAllocatedMemory(BigInteger allocatedMemory) {
        this.allocatedMemory = allocatedMemory;
    }

    public BigInteger getAvailableMemory() {
        return availableMemory;
    }

    public void setAvailableMemory(BigInteger availableMemory) {
        this.availableMemory = availableMemory;
    }

    public BigInteger getProcessCpuUsage() {
        return processCpuUsage;
    }

    public void setProcessCpuUsage(BigInteger processCpuUsage) {
        this.processCpuUsage = processCpuUsage;
    }

    public BigInteger getTotalCpuUsage() {
        return totalCpuUsage;
    }

    public void setTotalCpuUsage(BigInteger totalCpuUsage) {
        this.totalCpuUsage = totalCpuUsage;
    }

    public BigInteger getThreadCount() {
        return threadCount;
    }

    public void setThreadCount(BigInteger threadCount) {
        this.threadCount = threadCount;
    }

    public BigInteger getHandleCount() {
        return handleCount;
    }

    public void setHandleCount(BigInteger handleCount) {
        this.handleCount = handleCount;
    }

    public BigInteger getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(BigInteger totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Date getSentTime() {
        return sentTime;
    }

    public void setSentTime(Date sentTime) {
        this.sentTime = sentTime;
    }

    public Date getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Date receivedTime) {
        this.receivedTime = receivedTime;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public int getComputePoolId() {
        return computePoolId;
    }

    public void setComputePoolId(int computePoolId) {
        this.computePoolId = computePoolId;
    }
    
}
