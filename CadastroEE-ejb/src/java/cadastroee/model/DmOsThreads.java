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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_os_threads")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsThreads.findAll", query = "SELECT d FROM DmOsThreads d"),
    @NamedQuery(name = "DmOsThreads.findByStartedBySqlservr", query = "SELECT d FROM DmOsThreads d WHERE d.startedBySqlservr = :startedBySqlservr"),
    @NamedQuery(name = "DmOsThreads.findByOsThreadId", query = "SELECT d FROM DmOsThreads d WHERE d.osThreadId = :osThreadId"),
    @NamedQuery(name = "DmOsThreads.findByStatus", query = "SELECT d FROM DmOsThreads d WHERE d.status = :status"),
    @NamedQuery(name = "DmOsThreads.findByCreationTime", query = "SELECT d FROM DmOsThreads d WHERE d.creationTime = :creationTime"),
    @NamedQuery(name = "DmOsThreads.findByKernelTime", query = "SELECT d FROM DmOsThreads d WHERE d.kernelTime = :kernelTime"),
    @NamedQuery(name = "DmOsThreads.findByUsermodeTime", query = "SELECT d FROM DmOsThreads d WHERE d.usermodeTime = :usermodeTime"),
    @NamedQuery(name = "DmOsThreads.findByStackBytesCommitted", query = "SELECT d FROM DmOsThreads d WHERE d.stackBytesCommitted = :stackBytesCommitted"),
    @NamedQuery(name = "DmOsThreads.findByStackBytesUsed", query = "SELECT d FROM DmOsThreads d WHERE d.stackBytesUsed = :stackBytesUsed"),
    @NamedQuery(name = "DmOsThreads.findByAffinity", query = "SELECT d FROM DmOsThreads d WHERE d.affinity = :affinity"),
    @NamedQuery(name = "DmOsThreads.findByPriority", query = "SELECT d FROM DmOsThreads d WHERE d.priority = :priority"),
    @NamedQuery(name = "DmOsThreads.findByLocale", query = "SELECT d FROM DmOsThreads d WHERE d.locale = :locale"),
    @NamedQuery(name = "DmOsThreads.findByIsImpersonating", query = "SELECT d FROM DmOsThreads d WHERE d.isImpersonating = :isImpersonating"),
    @NamedQuery(name = "DmOsThreads.findByIsWaitingOnLoaderLock", query = "SELECT d FROM DmOsThreads d WHERE d.isWaitingOnLoaderLock = :isWaitingOnLoaderLock"),
    @NamedQuery(name = "DmOsThreads.findByProcessorGroup", query = "SELECT d FROM DmOsThreads d WHERE d.processorGroup = :processorGroup")})
public class DmOsThreads implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "thread_address")
    private byte[] threadAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "started_by_sqlservr")
    private boolean startedBySqlservr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "os_thread_id")
    private int osThreadId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @Lob
    @Column(name = "instruction_address")
    private byte[] instructionAddress;
    @Column(name = "creation_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationTime;
    @Column(name = "kernel_time")
    private BigInteger kernelTime;
    @Column(name = "usermode_time")
    private BigInteger usermodeTime;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "stack_base_address")
    private byte[] stackBaseAddress;
    @Lob
    @Column(name = "stack_end_address")
    private byte[] stackEndAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stack_bytes_committed")
    private int stackBytesCommitted;
    @Column(name = "stack_bytes_used")
    private Integer stackBytesUsed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "affinity")
    private long affinity;
    @Column(name = "priority")
    private Integer priority;
    @Column(name = "locale")
    private Integer locale;
    @Lob
    @Column(name = "token")
    private byte[] token;
    @Column(name = "is_impersonating")
    private Integer isImpersonating;
    @Column(name = "is_waiting_on_loader_lock")
    private Integer isWaitingOnLoaderLock;
    @Lob
    @Column(name = "fiber_data")
    private byte[] fiberData;
    @Lob
    @Column(name = "thread_handle")
    private byte[] threadHandle;
    @Lob
    @Column(name = "event_handle")
    private byte[] eventHandle;
    @Lob
    @Column(name = "scheduler_address")
    private byte[] schedulerAddress;
    @Lob
    @Column(name = "worker_address")
    private byte[] workerAddress;
    @Lob
    @Column(name = "fiber_context_address")
    private byte[] fiberContextAddress;
    @Lob
    @Column(name = "self_address")
    private byte[] selfAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "processor_group")
    private short processorGroup;

    public DmOsThreads() {
    }

    public byte[] getThreadAddress() {
        return threadAddress;
    }

    public void setThreadAddress(byte[] threadAddress) {
        this.threadAddress = threadAddress;
    }

    public boolean getStartedBySqlservr() {
        return startedBySqlservr;
    }

    public void setStartedBySqlservr(boolean startedBySqlservr) {
        this.startedBySqlservr = startedBySqlservr;
    }

    public int getOsThreadId() {
        return osThreadId;
    }

    public void setOsThreadId(int osThreadId) {
        this.osThreadId = osThreadId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public byte[] getInstructionAddress() {
        return instructionAddress;
    }

    public void setInstructionAddress(byte[] instructionAddress) {
        this.instructionAddress = instructionAddress;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public BigInteger getKernelTime() {
        return kernelTime;
    }

    public void setKernelTime(BigInteger kernelTime) {
        this.kernelTime = kernelTime;
    }

    public BigInteger getUsermodeTime() {
        return usermodeTime;
    }

    public void setUsermodeTime(BigInteger usermodeTime) {
        this.usermodeTime = usermodeTime;
    }

    public byte[] getStackBaseAddress() {
        return stackBaseAddress;
    }

    public void setStackBaseAddress(byte[] stackBaseAddress) {
        this.stackBaseAddress = stackBaseAddress;
    }

    public byte[] getStackEndAddress() {
        return stackEndAddress;
    }

    public void setStackEndAddress(byte[] stackEndAddress) {
        this.stackEndAddress = stackEndAddress;
    }

    public int getStackBytesCommitted() {
        return stackBytesCommitted;
    }

    public void setStackBytesCommitted(int stackBytesCommitted) {
        this.stackBytesCommitted = stackBytesCommitted;
    }

    public Integer getStackBytesUsed() {
        return stackBytesUsed;
    }

    public void setStackBytesUsed(Integer stackBytesUsed) {
        this.stackBytesUsed = stackBytesUsed;
    }

    public long getAffinity() {
        return affinity;
    }

    public void setAffinity(long affinity) {
        this.affinity = affinity;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getLocale() {
        return locale;
    }

    public void setLocale(Integer locale) {
        this.locale = locale;
    }

    public byte[] getToken() {
        return token;
    }

    public void setToken(byte[] token) {
        this.token = token;
    }

    public Integer getIsImpersonating() {
        return isImpersonating;
    }

    public void setIsImpersonating(Integer isImpersonating) {
        this.isImpersonating = isImpersonating;
    }

    public Integer getIsWaitingOnLoaderLock() {
        return isWaitingOnLoaderLock;
    }

    public void setIsWaitingOnLoaderLock(Integer isWaitingOnLoaderLock) {
        this.isWaitingOnLoaderLock = isWaitingOnLoaderLock;
    }

    public byte[] getFiberData() {
        return fiberData;
    }

    public void setFiberData(byte[] fiberData) {
        this.fiberData = fiberData;
    }

    public byte[] getThreadHandle() {
        return threadHandle;
    }

    public void setThreadHandle(byte[] threadHandle) {
        this.threadHandle = threadHandle;
    }

    public byte[] getEventHandle() {
        return eventHandle;
    }

    public void setEventHandle(byte[] eventHandle) {
        this.eventHandle = eventHandle;
    }

    public byte[] getSchedulerAddress() {
        return schedulerAddress;
    }

    public void setSchedulerAddress(byte[] schedulerAddress) {
        this.schedulerAddress = schedulerAddress;
    }

    public byte[] getWorkerAddress() {
        return workerAddress;
    }

    public void setWorkerAddress(byte[] workerAddress) {
        this.workerAddress = workerAddress;
    }

    public byte[] getFiberContextAddress() {
        return fiberContextAddress;
    }

    public void setFiberContextAddress(byte[] fiberContextAddress) {
        this.fiberContextAddress = fiberContextAddress;
    }

    public byte[] getSelfAddress() {
        return selfAddress;
    }

    public void setSelfAddress(byte[] selfAddress) {
        this.selfAddress = selfAddress;
    }

    public short getProcessorGroup() {
        return processorGroup;
    }

    public void setProcessorGroup(short processorGroup) {
        this.processorGroup = processorGroup;
    }
    
}
