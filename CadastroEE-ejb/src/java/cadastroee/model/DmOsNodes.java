/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
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
@Table(name = "dm_os_nodes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsNodes.findAll", query = "SELECT d FROM DmOsNodes d"),
    @NamedQuery(name = "DmOsNodes.findByNodeId", query = "SELECT d FROM DmOsNodes d WHERE d.nodeId = :nodeId"),
    @NamedQuery(name = "DmOsNodes.findByNodeStateDesc", query = "SELECT d FROM DmOsNodes d WHERE d.nodeStateDesc = :nodeStateDesc"),
    @NamedQuery(name = "DmOsNodes.findByMemoryNodeId", query = "SELECT d FROM DmOsNodes d WHERE d.memoryNodeId = :memoryNodeId"),
    @NamedQuery(name = "DmOsNodes.findByCpuAffinityMask", query = "SELECT d FROM DmOsNodes d WHERE d.cpuAffinityMask = :cpuAffinityMask"),
    @NamedQuery(name = "DmOsNodes.findByOnlineSchedulerCount", query = "SELECT d FROM DmOsNodes d WHERE d.onlineSchedulerCount = :onlineSchedulerCount"),
    @NamedQuery(name = "DmOsNodes.findByIdleSchedulerCount", query = "SELECT d FROM DmOsNodes d WHERE d.idleSchedulerCount = :idleSchedulerCount"),
    @NamedQuery(name = "DmOsNodes.findByActiveWorkerCount", query = "SELECT d FROM DmOsNodes d WHERE d.activeWorkerCount = :activeWorkerCount"),
    @NamedQuery(name = "DmOsNodes.findByAvgLoadBalance", query = "SELECT d FROM DmOsNodes d WHERE d.avgLoadBalance = :avgLoadBalance"),
    @NamedQuery(name = "DmOsNodes.findByTimerTaskAffinityMask", query = "SELECT d FROM DmOsNodes d WHERE d.timerTaskAffinityMask = :timerTaskAffinityMask"),
    @NamedQuery(name = "DmOsNodes.findByPermanentTaskAffinityMask", query = "SELECT d FROM DmOsNodes d WHERE d.permanentTaskAffinityMask = :permanentTaskAffinityMask"),
    @NamedQuery(name = "DmOsNodes.findByResourceMonitorState", query = "SELECT d FROM DmOsNodes d WHERE d.resourceMonitorState = :resourceMonitorState"),
    @NamedQuery(name = "DmOsNodes.findByOnlineSchedulerMask", query = "SELECT d FROM DmOsNodes d WHERE d.onlineSchedulerMask = :onlineSchedulerMask"),
    @NamedQuery(name = "DmOsNodes.findByProcessorGroup", query = "SELECT d FROM DmOsNodes d WHERE d.processorGroup = :processorGroup"),
    @NamedQuery(name = "DmOsNodes.findByCpuCount", query = "SELECT d FROM DmOsNodes d WHERE d.cpuCount = :cpuCount"),
    @NamedQuery(name = "DmOsNodes.findByCachedTasks", query = "SELECT d FROM DmOsNodes d WHERE d.cachedTasks = :cachedTasks"),
    @NamedQuery(name = "DmOsNodes.findByCachedTasksReused", query = "SELECT d FROM DmOsNodes d WHERE d.cachedTasksReused = :cachedTasksReused"),
    @NamedQuery(name = "DmOsNodes.findByCachedTasksRemoved", query = "SELECT d FROM DmOsNodes d WHERE d.cachedTasksRemoved = :cachedTasksRemoved")})
public class DmOsNodes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "node_id")
    private short nodeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "node_state_desc")
    private String nodeStateDesc;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_object_address")
    private byte[] memoryObjectAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_clerk_address")
    private byte[] memoryClerkAddress;
    @Lob
    @Column(name = "io_completion_worker_address")
    private byte[] ioCompletionWorkerAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "memory_node_id")
    private short memoryNodeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cpu_affinity_mask")
    private long cpuAffinityMask;
    @Basic(optional = false)
    @NotNull
    @Column(name = "online_scheduler_count")
    private short onlineSchedulerCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idle_scheduler_count")
    private short idleSchedulerCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active_worker_count")
    private int activeWorkerCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "avg_load_balance")
    private int avgLoadBalance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "timer_task_affinity_mask")
    private long timerTaskAffinityMask;
    @Basic(optional = false)
    @NotNull
    @Column(name = "permanent_task_affinity_mask")
    private long permanentTaskAffinityMask;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resource_monitor_state")
    private boolean resourceMonitorState;
    @Basic(optional = false)
    @NotNull
    @Column(name = "online_scheduler_mask")
    private long onlineSchedulerMask;
    @Basic(optional = false)
    @NotNull
    @Column(name = "processor_group")
    private short processorGroup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cpu_count")
    private int cpuCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cached_tasks")
    private long cachedTasks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cached_tasks_reused")
    private long cachedTasksReused;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cached_tasks_removed")
    private long cachedTasksRemoved;

    public DmOsNodes() {
    }

    public short getNodeId() {
        return nodeId;
    }

    public void setNodeId(short nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeStateDesc() {
        return nodeStateDesc;
    }

    public void setNodeStateDesc(String nodeStateDesc) {
        this.nodeStateDesc = nodeStateDesc;
    }

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }

    public byte[] getMemoryClerkAddress() {
        return memoryClerkAddress;
    }

    public void setMemoryClerkAddress(byte[] memoryClerkAddress) {
        this.memoryClerkAddress = memoryClerkAddress;
    }

    public byte[] getIoCompletionWorkerAddress() {
        return ioCompletionWorkerAddress;
    }

    public void setIoCompletionWorkerAddress(byte[] ioCompletionWorkerAddress) {
        this.ioCompletionWorkerAddress = ioCompletionWorkerAddress;
    }

    public short getMemoryNodeId() {
        return memoryNodeId;
    }

    public void setMemoryNodeId(short memoryNodeId) {
        this.memoryNodeId = memoryNodeId;
    }

    public long getCpuAffinityMask() {
        return cpuAffinityMask;
    }

    public void setCpuAffinityMask(long cpuAffinityMask) {
        this.cpuAffinityMask = cpuAffinityMask;
    }

    public short getOnlineSchedulerCount() {
        return onlineSchedulerCount;
    }

    public void setOnlineSchedulerCount(short onlineSchedulerCount) {
        this.onlineSchedulerCount = onlineSchedulerCount;
    }

    public short getIdleSchedulerCount() {
        return idleSchedulerCount;
    }

    public void setIdleSchedulerCount(short idleSchedulerCount) {
        this.idleSchedulerCount = idleSchedulerCount;
    }

    public int getActiveWorkerCount() {
        return activeWorkerCount;
    }

    public void setActiveWorkerCount(int activeWorkerCount) {
        this.activeWorkerCount = activeWorkerCount;
    }

    public int getAvgLoadBalance() {
        return avgLoadBalance;
    }

    public void setAvgLoadBalance(int avgLoadBalance) {
        this.avgLoadBalance = avgLoadBalance;
    }

    public long getTimerTaskAffinityMask() {
        return timerTaskAffinityMask;
    }

    public void setTimerTaskAffinityMask(long timerTaskAffinityMask) {
        this.timerTaskAffinityMask = timerTaskAffinityMask;
    }

    public long getPermanentTaskAffinityMask() {
        return permanentTaskAffinityMask;
    }

    public void setPermanentTaskAffinityMask(long permanentTaskAffinityMask) {
        this.permanentTaskAffinityMask = permanentTaskAffinityMask;
    }

    public boolean getResourceMonitorState() {
        return resourceMonitorState;
    }

    public void setResourceMonitorState(boolean resourceMonitorState) {
        this.resourceMonitorState = resourceMonitorState;
    }

    public long getOnlineSchedulerMask() {
        return onlineSchedulerMask;
    }

    public void setOnlineSchedulerMask(long onlineSchedulerMask) {
        this.onlineSchedulerMask = onlineSchedulerMask;
    }

    public short getProcessorGroup() {
        return processorGroup;
    }

    public void setProcessorGroup(short processorGroup) {
        this.processorGroup = processorGroup;
    }

    public int getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(int cpuCount) {
        this.cpuCount = cpuCount;
    }

    public long getCachedTasks() {
        return cachedTasks;
    }

    public void setCachedTasks(long cachedTasks) {
        this.cachedTasks = cachedTasks;
    }

    public long getCachedTasksReused() {
        return cachedTasksReused;
    }

    public void setCachedTasksReused(long cachedTasksReused) {
        this.cachedTasksReused = cachedTasksReused;
    }

    public long getCachedTasksRemoved() {
        return cachedTasksRemoved;
    }

    public void setCachedTasksRemoved(long cachedTasksRemoved) {
        this.cachedTasksRemoved = cachedTasksRemoved;
    }
    
}
