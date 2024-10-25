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
import javax.persistence.Lob;
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
@Table(name = "dm_os_schedulers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsSchedulers.findAll", query = "SELECT d FROM DmOsSchedulers d"),
    @NamedQuery(name = "DmOsSchedulers.findByParentNodeId", query = "SELECT d FROM DmOsSchedulers d WHERE d.parentNodeId = :parentNodeId"),
    @NamedQuery(name = "DmOsSchedulers.findBySchedulerId", query = "SELECT d FROM DmOsSchedulers d WHERE d.schedulerId = :schedulerId"),
    @NamedQuery(name = "DmOsSchedulers.findByCpuId", query = "SELECT d FROM DmOsSchedulers d WHERE d.cpuId = :cpuId"),
    @NamedQuery(name = "DmOsSchedulers.findByStatus", query = "SELECT d FROM DmOsSchedulers d WHERE d.status = :status"),
    @NamedQuery(name = "DmOsSchedulers.findByIsOnline", query = "SELECT d FROM DmOsSchedulers d WHERE d.isOnline = :isOnline"),
    @NamedQuery(name = "DmOsSchedulers.findByIsIdle", query = "SELECT d FROM DmOsSchedulers d WHERE d.isIdle = :isIdle"),
    @NamedQuery(name = "DmOsSchedulers.findByPreemptiveSwitchesCount", query = "SELECT d FROM DmOsSchedulers d WHERE d.preemptiveSwitchesCount = :preemptiveSwitchesCount"),
    @NamedQuery(name = "DmOsSchedulers.findByContextSwitchesCount", query = "SELECT d FROM DmOsSchedulers d WHERE d.contextSwitchesCount = :contextSwitchesCount"),
    @NamedQuery(name = "DmOsSchedulers.findByIdleSwitchesCount", query = "SELECT d FROM DmOsSchedulers d WHERE d.idleSwitchesCount = :idleSwitchesCount"),
    @NamedQuery(name = "DmOsSchedulers.findByCurrentTasksCount", query = "SELECT d FROM DmOsSchedulers d WHERE d.currentTasksCount = :currentTasksCount"),
    @NamedQuery(name = "DmOsSchedulers.findByRunnableTasksCount", query = "SELECT d FROM DmOsSchedulers d WHERE d.runnableTasksCount = :runnableTasksCount"),
    @NamedQuery(name = "DmOsSchedulers.findByCurrentWorkersCount", query = "SELECT d FROM DmOsSchedulers d WHERE d.currentWorkersCount = :currentWorkersCount"),
    @NamedQuery(name = "DmOsSchedulers.findByActiveWorkersCount", query = "SELECT d FROM DmOsSchedulers d WHERE d.activeWorkersCount = :activeWorkersCount"),
    @NamedQuery(name = "DmOsSchedulers.findByWorkQueueCount", query = "SELECT d FROM DmOsSchedulers d WHERE d.workQueueCount = :workQueueCount"),
    @NamedQuery(name = "DmOsSchedulers.findByPendingDiskIoCount", query = "SELECT d FROM DmOsSchedulers d WHERE d.pendingDiskIoCount = :pendingDiskIoCount"),
    @NamedQuery(name = "DmOsSchedulers.findByQueuedDiskIoCount", query = "SELECT d FROM DmOsSchedulers d WHERE d.queuedDiskIoCount = :queuedDiskIoCount"),
    @NamedQuery(name = "DmOsSchedulers.findByLoadFactor", query = "SELECT d FROM DmOsSchedulers d WHERE d.loadFactor = :loadFactor"),
    @NamedQuery(name = "DmOsSchedulers.findByYieldCount", query = "SELECT d FROM DmOsSchedulers d WHERE d.yieldCount = :yieldCount"),
    @NamedQuery(name = "DmOsSchedulers.findByLastTimerActivity", query = "SELECT d FROM DmOsSchedulers d WHERE d.lastTimerActivity = :lastTimerActivity"),
    @NamedQuery(name = "DmOsSchedulers.findByFailedToCreateWorker", query = "SELECT d FROM DmOsSchedulers d WHERE d.failedToCreateWorker = :failedToCreateWorker"),
    @NamedQuery(name = "DmOsSchedulers.findByQuantumLengthUs", query = "SELECT d FROM DmOsSchedulers d WHERE d.quantumLengthUs = :quantumLengthUs"),
    @NamedQuery(name = "DmOsSchedulers.findByTotalCpuUsageMs", query = "SELECT d FROM DmOsSchedulers d WHERE d.totalCpuUsageMs = :totalCpuUsageMs"),
    @NamedQuery(name = "DmOsSchedulers.findByTotalCpuIdleCappedMs", query = "SELECT d FROM DmOsSchedulers d WHERE d.totalCpuIdleCappedMs = :totalCpuIdleCappedMs"),
    @NamedQuery(name = "DmOsSchedulers.findByTotalSchedulerDelayMs", query = "SELECT d FROM DmOsSchedulers d WHERE d.totalSchedulerDelayMs = :totalSchedulerDelayMs"),
    @NamedQuery(name = "DmOsSchedulers.findByIdealWorkersLimit", query = "SELECT d FROM DmOsSchedulers d WHERE d.idealWorkersLimit = :idealWorkersLimit"),
    @NamedQuery(name = "DmOsSchedulers.findByTotalEnqueuedTasks", query = "SELECT d FROM DmOsSchedulers d WHERE d.totalEnqueuedTasks = :totalEnqueuedTasks")})
public class DmOsSchedulers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "scheduler_address")
    private byte[] schedulerAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_node_id")
    private int parentNodeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scheduler_id")
    private int schedulerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cpu_id")
    private int cpuId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_online")
    private boolean isOnline;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_idle")
    private boolean isIdle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "preemptive_switches_count")
    private int preemptiveSwitchesCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "context_switches_count")
    private int contextSwitchesCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idle_switches_count")
    private int idleSwitchesCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "current_tasks_count")
    private int currentTasksCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "runnable_tasks_count")
    private int runnableTasksCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "current_workers_count")
    private int currentWorkersCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active_workers_count")
    private int activeWorkersCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "work_queue_count")
    private long workQueueCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pending_disk_io_count")
    private int pendingDiskIoCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "queued_disk_io_count")
    private int queuedDiskIoCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "load_factor")
    private int loadFactor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "yield_count")
    private int yieldCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_timer_activity")
    private long lastTimerActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "failed_to_create_worker")
    private boolean failedToCreateWorker;
    @Lob
    @Column(name = "active_worker_address")
    private byte[] activeWorkerAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_object_address")
    private byte[] memoryObjectAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "task_memory_object_address")
    private byte[] taskMemoryObjectAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantum_length_us")
    private long quantumLengthUs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_cpu_usage_ms")
    private long totalCpuUsageMs;
    @Column(name = "total_cpu_idle_capped_ms")
    private BigInteger totalCpuIdleCappedMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_scheduler_delay_ms")
    private long totalSchedulerDelayMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ideal_workers_limit")
    private int idealWorkersLimit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_enqueued_tasks")
    private int totalEnqueuedTasks;

    public DmOsSchedulers() {
    }

    public byte[] getSchedulerAddress() {
        return schedulerAddress;
    }

    public void setSchedulerAddress(byte[] schedulerAddress) {
        this.schedulerAddress = schedulerAddress;
    }

    public int getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(int parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public int getSchedulerId() {
        return schedulerId;
    }

    public void setSchedulerId(int schedulerId) {
        this.schedulerId = schedulerId;
    }

    public int getCpuId() {
        return cpuId;
    }

    public void setCpuId(int cpuId) {
        this.cpuId = cpuId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public boolean getIsIdle() {
        return isIdle;
    }

    public void setIsIdle(boolean isIdle) {
        this.isIdle = isIdle;
    }

    public int getPreemptiveSwitchesCount() {
        return preemptiveSwitchesCount;
    }

    public void setPreemptiveSwitchesCount(int preemptiveSwitchesCount) {
        this.preemptiveSwitchesCount = preemptiveSwitchesCount;
    }

    public int getContextSwitchesCount() {
        return contextSwitchesCount;
    }

    public void setContextSwitchesCount(int contextSwitchesCount) {
        this.contextSwitchesCount = contextSwitchesCount;
    }

    public int getIdleSwitchesCount() {
        return idleSwitchesCount;
    }

    public void setIdleSwitchesCount(int idleSwitchesCount) {
        this.idleSwitchesCount = idleSwitchesCount;
    }

    public int getCurrentTasksCount() {
        return currentTasksCount;
    }

    public void setCurrentTasksCount(int currentTasksCount) {
        this.currentTasksCount = currentTasksCount;
    }

    public int getRunnableTasksCount() {
        return runnableTasksCount;
    }

    public void setRunnableTasksCount(int runnableTasksCount) {
        this.runnableTasksCount = runnableTasksCount;
    }

    public int getCurrentWorkersCount() {
        return currentWorkersCount;
    }

    public void setCurrentWorkersCount(int currentWorkersCount) {
        this.currentWorkersCount = currentWorkersCount;
    }

    public int getActiveWorkersCount() {
        return activeWorkersCount;
    }

    public void setActiveWorkersCount(int activeWorkersCount) {
        this.activeWorkersCount = activeWorkersCount;
    }

    public long getWorkQueueCount() {
        return workQueueCount;
    }

    public void setWorkQueueCount(long workQueueCount) {
        this.workQueueCount = workQueueCount;
    }

    public int getPendingDiskIoCount() {
        return pendingDiskIoCount;
    }

    public void setPendingDiskIoCount(int pendingDiskIoCount) {
        this.pendingDiskIoCount = pendingDiskIoCount;
    }

    public int getQueuedDiskIoCount() {
        return queuedDiskIoCount;
    }

    public void setQueuedDiskIoCount(int queuedDiskIoCount) {
        this.queuedDiskIoCount = queuedDiskIoCount;
    }

    public int getLoadFactor() {
        return loadFactor;
    }

    public void setLoadFactor(int loadFactor) {
        this.loadFactor = loadFactor;
    }

    public int getYieldCount() {
        return yieldCount;
    }

    public void setYieldCount(int yieldCount) {
        this.yieldCount = yieldCount;
    }

    public long getLastTimerActivity() {
        return lastTimerActivity;
    }

    public void setLastTimerActivity(long lastTimerActivity) {
        this.lastTimerActivity = lastTimerActivity;
    }

    public boolean getFailedToCreateWorker() {
        return failedToCreateWorker;
    }

    public void setFailedToCreateWorker(boolean failedToCreateWorker) {
        this.failedToCreateWorker = failedToCreateWorker;
    }

    public byte[] getActiveWorkerAddress() {
        return activeWorkerAddress;
    }

    public void setActiveWorkerAddress(byte[] activeWorkerAddress) {
        this.activeWorkerAddress = activeWorkerAddress;
    }

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }

    public byte[] getTaskMemoryObjectAddress() {
        return taskMemoryObjectAddress;
    }

    public void setTaskMemoryObjectAddress(byte[] taskMemoryObjectAddress) {
        this.taskMemoryObjectAddress = taskMemoryObjectAddress;
    }

    public long getQuantumLengthUs() {
        return quantumLengthUs;
    }

    public void setQuantumLengthUs(long quantumLengthUs) {
        this.quantumLengthUs = quantumLengthUs;
    }

    public long getTotalCpuUsageMs() {
        return totalCpuUsageMs;
    }

    public void setTotalCpuUsageMs(long totalCpuUsageMs) {
        this.totalCpuUsageMs = totalCpuUsageMs;
    }

    public BigInteger getTotalCpuIdleCappedMs() {
        return totalCpuIdleCappedMs;
    }

    public void setTotalCpuIdleCappedMs(BigInteger totalCpuIdleCappedMs) {
        this.totalCpuIdleCappedMs = totalCpuIdleCappedMs;
    }

    public long getTotalSchedulerDelayMs() {
        return totalSchedulerDelayMs;
    }

    public void setTotalSchedulerDelayMs(long totalSchedulerDelayMs) {
        this.totalSchedulerDelayMs = totalSchedulerDelayMs;
    }

    public int getIdealWorkersLimit() {
        return idealWorkersLimit;
    }

    public void setIdealWorkersLimit(int idealWorkersLimit) {
        this.idealWorkersLimit = idealWorkersLimit;
    }

    public int getTotalEnqueuedTasks() {
        return totalEnqueuedTasks;
    }

    public void setTotalEnqueuedTasks(int totalEnqueuedTasks) {
        this.totalEnqueuedTasks = totalEnqueuedTasks;
    }
    
}
