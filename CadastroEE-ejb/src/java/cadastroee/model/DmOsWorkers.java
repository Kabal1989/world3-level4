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
@Table(name = "dm_os_workers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsWorkers.findAll", query = "SELECT d FROM DmOsWorkers d"),
    @NamedQuery(name = "DmOsWorkers.findByStatus", query = "SELECT d FROM DmOsWorkers d WHERE d.status = :status"),
    @NamedQuery(name = "DmOsWorkers.findByIsPreemptive", query = "SELECT d FROM DmOsWorkers d WHERE d.isPreemptive = :isPreemptive"),
    @NamedQuery(name = "DmOsWorkers.findByIsFiber", query = "SELECT d FROM DmOsWorkers d WHERE d.isFiber = :isFiber"),
    @NamedQuery(name = "DmOsWorkers.findByIsSick", query = "SELECT d FROM DmOsWorkers d WHERE d.isSick = :isSick"),
    @NamedQuery(name = "DmOsWorkers.findByIsInCcException", query = "SELECT d FROM DmOsWorkers d WHERE d.isInCcException = :isInCcException"),
    @NamedQuery(name = "DmOsWorkers.findByIsFatalException", query = "SELECT d FROM DmOsWorkers d WHERE d.isFatalException = :isFatalException"),
    @NamedQuery(name = "DmOsWorkers.findByIsInsideCatch", query = "SELECT d FROM DmOsWorkers d WHERE d.isInsideCatch = :isInsideCatch"),
    @NamedQuery(name = "DmOsWorkers.findByIsInPollingIoCompletionRoutine", query = "SELECT d FROM DmOsWorkers d WHERE d.isInPollingIoCompletionRoutine = :isInPollingIoCompletionRoutine"),
    @NamedQuery(name = "DmOsWorkers.findByContextSwitchCount", query = "SELECT d FROM DmOsWorkers d WHERE d.contextSwitchCount = :contextSwitchCount"),
    @NamedQuery(name = "DmOsWorkers.findByPendingIoCount", query = "SELECT d FROM DmOsWorkers d WHERE d.pendingIoCount = :pendingIoCount"),
    @NamedQuery(name = "DmOsWorkers.findByPendingIoByteCount", query = "SELECT d FROM DmOsWorkers d WHERE d.pendingIoByteCount = :pendingIoByteCount"),
    @NamedQuery(name = "DmOsWorkers.findByPendingIoByteAverage", query = "SELECT d FROM DmOsWorkers d WHERE d.pendingIoByteAverage = :pendingIoByteAverage"),
    @NamedQuery(name = "DmOsWorkers.findByWaitStartedMsTicks", query = "SELECT d FROM DmOsWorkers d WHERE d.waitStartedMsTicks = :waitStartedMsTicks"),
    @NamedQuery(name = "DmOsWorkers.findByWaitResumedMsTicks", query = "SELECT d FROM DmOsWorkers d WHERE d.waitResumedMsTicks = :waitResumedMsTicks"),
    @NamedQuery(name = "DmOsWorkers.findByTaskBoundMsTicks", query = "SELECT d FROM DmOsWorkers d WHERE d.taskBoundMsTicks = :taskBoundMsTicks"),
    @NamedQuery(name = "DmOsWorkers.findByWorkerCreatedMsTicks", query = "SELECT d FROM DmOsWorkers d WHERE d.workerCreatedMsTicks = :workerCreatedMsTicks"),
    @NamedQuery(name = "DmOsWorkers.findByExceptionNum", query = "SELECT d FROM DmOsWorkers d WHERE d.exceptionNum = :exceptionNum"),
    @NamedQuery(name = "DmOsWorkers.findByExceptionSeverity", query = "SELECT d FROM DmOsWorkers d WHERE d.exceptionSeverity = :exceptionSeverity"),
    @NamedQuery(name = "DmOsWorkers.findByAffinity", query = "SELECT d FROM DmOsWorkers d WHERE d.affinity = :affinity"),
    @NamedQuery(name = "DmOsWorkers.findByState", query = "SELECT d FROM DmOsWorkers d WHERE d.state = :state"),
    @NamedQuery(name = "DmOsWorkers.findByStartQuantum", query = "SELECT d FROM DmOsWorkers d WHERE d.startQuantum = :startQuantum"),
    @NamedQuery(name = "DmOsWorkers.findByEndQuantum", query = "SELECT d FROM DmOsWorkers d WHERE d.endQuantum = :endQuantum"),
    @NamedQuery(name = "DmOsWorkers.findByLastWaitType", query = "SELECT d FROM DmOsWorkers d WHERE d.lastWaitType = :lastWaitType"),
    @NamedQuery(name = "DmOsWorkers.findByReturnCode", query = "SELECT d FROM DmOsWorkers d WHERE d.returnCode = :returnCode"),
    @NamedQuery(name = "DmOsWorkers.findByQuantumUsed", query = "SELECT d FROM DmOsWorkers d WHERE d.quantumUsed = :quantumUsed"),
    @NamedQuery(name = "DmOsWorkers.findByMaxQuantum", query = "SELECT d FROM DmOsWorkers d WHERE d.maxQuantum = :maxQuantum"),
    @NamedQuery(name = "DmOsWorkers.findByBoostCount", query = "SELECT d FROM DmOsWorkers d WHERE d.boostCount = :boostCount"),
    @NamedQuery(name = "DmOsWorkers.findByTasksProcessedCount", query = "SELECT d FROM DmOsWorkers d WHERE d.tasksProcessedCount = :tasksProcessedCount"),
    @NamedQuery(name = "DmOsWorkers.findByProcessorGroup", query = "SELECT d FROM DmOsWorkers d WHERE d.processorGroup = :processorGroup"),
    @NamedQuery(name = "DmOsWorkers.findByWorkerMigrationCount", query = "SELECT d FROM DmOsWorkers d WHERE d.workerMigrationCount = :workerMigrationCount"),
    @NamedQuery(name = "DmOsWorkers.findBySpinlockWaitTimeMs", query = "SELECT d FROM DmOsWorkers d WHERE d.spinlockWaitTimeMs = :spinlockWaitTimeMs"),
    @NamedQuery(name = "DmOsWorkers.findBySpinlockMaxWaitTimeMs", query = "SELECT d FROM DmOsWorkers d WHERE d.spinlockMaxWaitTimeMs = :spinlockMaxWaitTimeMs"),
    @NamedQuery(name = "DmOsWorkers.findBySpinlockWaitCount", query = "SELECT d FROM DmOsWorkers d WHERE d.spinlockWaitCount = :spinlockWaitCount")})
public class DmOsWorkers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "worker_address")
    private byte[] workerAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @Column(name = "is_preemptive")
    private Boolean isPreemptive;
    @Column(name = "is_fiber")
    private Boolean isFiber;
    @Column(name = "is_sick")
    private Boolean isSick;
    @Column(name = "is_in_cc_exception")
    private Boolean isInCcException;
    @Column(name = "is_fatal_exception")
    private Boolean isFatalException;
    @Column(name = "is_inside_catch")
    private Boolean isInsideCatch;
    @Column(name = "is_in_polling_io_completion_routine")
    private Boolean isInPollingIoCompletionRoutine;
    @Basic(optional = false)
    @NotNull
    @Column(name = "context_switch_count")
    private int contextSwitchCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pending_io_count")
    private int pendingIoCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pending_io_byte_count")
    private long pendingIoByteCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pending_io_byte_average")
    private int pendingIoByteAverage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wait_started_ms_ticks")
    private long waitStartedMsTicks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wait_resumed_ms_ticks")
    private long waitResumedMsTicks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "task_bound_ms_ticks")
    private long taskBoundMsTicks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "worker_created_ms_ticks")
    private long workerCreatedMsTicks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "exception_num")
    private int exceptionNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "exception_severity")
    private int exceptionSeverity;
    @Lob
    @Column(name = "exception_address")
    private byte[] exceptionAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "affinity")
    private long affinity;
    @Size(max = 60)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_quantum")
    private long startQuantum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "end_quantum")
    private long endQuantum;
    @Size(max = 60)
    @Column(name = "last_wait_type")
    private String lastWaitType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "return_code")
    private int returnCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantum_used")
    private long quantumUsed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_quantum")
    private long maxQuantum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "boost_count")
    private int boostCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tasks_processed_count")
    private int tasksProcessedCount;
    @Lob
    @Column(name = "fiber_address")
    private byte[] fiberAddress;
    @Lob
    @Column(name = "task_address")
    private byte[] taskAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_object_address")
    private byte[] memoryObjectAddress;
    @Lob
    @Column(name = "thread_address")
    private byte[] threadAddress;
    @Lob
    @Column(name = "signal_worker_address")
    private byte[] signalWorkerAddress;
    @Lob
    @Column(name = "scheduler_address")
    private byte[] schedulerAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "processor_group")
    private short processorGroup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "worker_migration_count")
    private int workerMigrationCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "spinlock_wait_time_ms")
    private long spinlockWaitTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "spinlock_max_wait_time_ms")
    private long spinlockMaxWaitTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "spinlock_wait_count")
    private long spinlockWaitCount;

    public DmOsWorkers() {
    }

    public byte[] getWorkerAddress() {
        return workerAddress;
    }

    public void setWorkerAddress(byte[] workerAddress) {
        this.workerAddress = workerAddress;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Boolean getIsPreemptive() {
        return isPreemptive;
    }

    public void setIsPreemptive(Boolean isPreemptive) {
        this.isPreemptive = isPreemptive;
    }

    public Boolean getIsFiber() {
        return isFiber;
    }

    public void setIsFiber(Boolean isFiber) {
        this.isFiber = isFiber;
    }

    public Boolean getIsSick() {
        return isSick;
    }

    public void setIsSick(Boolean isSick) {
        this.isSick = isSick;
    }

    public Boolean getIsInCcException() {
        return isInCcException;
    }

    public void setIsInCcException(Boolean isInCcException) {
        this.isInCcException = isInCcException;
    }

    public Boolean getIsFatalException() {
        return isFatalException;
    }

    public void setIsFatalException(Boolean isFatalException) {
        this.isFatalException = isFatalException;
    }

    public Boolean getIsInsideCatch() {
        return isInsideCatch;
    }

    public void setIsInsideCatch(Boolean isInsideCatch) {
        this.isInsideCatch = isInsideCatch;
    }

    public Boolean getIsInPollingIoCompletionRoutine() {
        return isInPollingIoCompletionRoutine;
    }

    public void setIsInPollingIoCompletionRoutine(Boolean isInPollingIoCompletionRoutine) {
        this.isInPollingIoCompletionRoutine = isInPollingIoCompletionRoutine;
    }

    public int getContextSwitchCount() {
        return contextSwitchCount;
    }

    public void setContextSwitchCount(int contextSwitchCount) {
        this.contextSwitchCount = contextSwitchCount;
    }

    public int getPendingIoCount() {
        return pendingIoCount;
    }

    public void setPendingIoCount(int pendingIoCount) {
        this.pendingIoCount = pendingIoCount;
    }

    public long getPendingIoByteCount() {
        return pendingIoByteCount;
    }

    public void setPendingIoByteCount(long pendingIoByteCount) {
        this.pendingIoByteCount = pendingIoByteCount;
    }

    public int getPendingIoByteAverage() {
        return pendingIoByteAverage;
    }

    public void setPendingIoByteAverage(int pendingIoByteAverage) {
        this.pendingIoByteAverage = pendingIoByteAverage;
    }

    public long getWaitStartedMsTicks() {
        return waitStartedMsTicks;
    }

    public void setWaitStartedMsTicks(long waitStartedMsTicks) {
        this.waitStartedMsTicks = waitStartedMsTicks;
    }

    public long getWaitResumedMsTicks() {
        return waitResumedMsTicks;
    }

    public void setWaitResumedMsTicks(long waitResumedMsTicks) {
        this.waitResumedMsTicks = waitResumedMsTicks;
    }

    public long getTaskBoundMsTicks() {
        return taskBoundMsTicks;
    }

    public void setTaskBoundMsTicks(long taskBoundMsTicks) {
        this.taskBoundMsTicks = taskBoundMsTicks;
    }

    public long getWorkerCreatedMsTicks() {
        return workerCreatedMsTicks;
    }

    public void setWorkerCreatedMsTicks(long workerCreatedMsTicks) {
        this.workerCreatedMsTicks = workerCreatedMsTicks;
    }

    public int getExceptionNum() {
        return exceptionNum;
    }

    public void setExceptionNum(int exceptionNum) {
        this.exceptionNum = exceptionNum;
    }

    public int getExceptionSeverity() {
        return exceptionSeverity;
    }

    public void setExceptionSeverity(int exceptionSeverity) {
        this.exceptionSeverity = exceptionSeverity;
    }

    public byte[] getExceptionAddress() {
        return exceptionAddress;
    }

    public void setExceptionAddress(byte[] exceptionAddress) {
        this.exceptionAddress = exceptionAddress;
    }

    public long getAffinity() {
        return affinity;
    }

    public void setAffinity(long affinity) {
        this.affinity = affinity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getStartQuantum() {
        return startQuantum;
    }

    public void setStartQuantum(long startQuantum) {
        this.startQuantum = startQuantum;
    }

    public long getEndQuantum() {
        return endQuantum;
    }

    public void setEndQuantum(long endQuantum) {
        this.endQuantum = endQuantum;
    }

    public String getLastWaitType() {
        return lastWaitType;
    }

    public void setLastWaitType(String lastWaitType) {
        this.lastWaitType = lastWaitType;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public long getQuantumUsed() {
        return quantumUsed;
    }

    public void setQuantumUsed(long quantumUsed) {
        this.quantumUsed = quantumUsed;
    }

    public long getMaxQuantum() {
        return maxQuantum;
    }

    public void setMaxQuantum(long maxQuantum) {
        this.maxQuantum = maxQuantum;
    }

    public int getBoostCount() {
        return boostCount;
    }

    public void setBoostCount(int boostCount) {
        this.boostCount = boostCount;
    }

    public int getTasksProcessedCount() {
        return tasksProcessedCount;
    }

    public void setTasksProcessedCount(int tasksProcessedCount) {
        this.tasksProcessedCount = tasksProcessedCount;
    }

    public byte[] getFiberAddress() {
        return fiberAddress;
    }

    public void setFiberAddress(byte[] fiberAddress) {
        this.fiberAddress = fiberAddress;
    }

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }

    public byte[] getThreadAddress() {
        return threadAddress;
    }

    public void setThreadAddress(byte[] threadAddress) {
        this.threadAddress = threadAddress;
    }

    public byte[] getSignalWorkerAddress() {
        return signalWorkerAddress;
    }

    public void setSignalWorkerAddress(byte[] signalWorkerAddress) {
        this.signalWorkerAddress = signalWorkerAddress;
    }

    public byte[] getSchedulerAddress() {
        return schedulerAddress;
    }

    public void setSchedulerAddress(byte[] schedulerAddress) {
        this.schedulerAddress = schedulerAddress;
    }

    public short getProcessorGroup() {
        return processorGroup;
    }

    public void setProcessorGroup(short processorGroup) {
        this.processorGroup = processorGroup;
    }

    public int getWorkerMigrationCount() {
        return workerMigrationCount;
    }

    public void setWorkerMigrationCount(int workerMigrationCount) {
        this.workerMigrationCount = workerMigrationCount;
    }

    public long getSpinlockWaitTimeMs() {
        return spinlockWaitTimeMs;
    }

    public void setSpinlockWaitTimeMs(long spinlockWaitTimeMs) {
        this.spinlockWaitTimeMs = spinlockWaitTimeMs;
    }

    public long getSpinlockMaxWaitTimeMs() {
        return spinlockMaxWaitTimeMs;
    }

    public void setSpinlockMaxWaitTimeMs(long spinlockMaxWaitTimeMs) {
        this.spinlockMaxWaitTimeMs = spinlockMaxWaitTimeMs;
    }

    public long getSpinlockWaitCount() {
        return spinlockWaitCount;
    }

    public void setSpinlockWaitCount(long spinlockWaitCount) {
        this.spinlockWaitCount = spinlockWaitCount;
    }
    
}
