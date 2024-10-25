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
@Table(name = "dm_os_tasks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsTasks.findAll", query = "SELECT d FROM DmOsTasks d"),
    @NamedQuery(name = "DmOsTasks.findByTaskState", query = "SELECT d FROM DmOsTasks d WHERE d.taskState = :taskState"),
    @NamedQuery(name = "DmOsTasks.findByContextSwitchesCount", query = "SELECT d FROM DmOsTasks d WHERE d.contextSwitchesCount = :contextSwitchesCount"),
    @NamedQuery(name = "DmOsTasks.findByPendingIoCount", query = "SELECT d FROM DmOsTasks d WHERE d.pendingIoCount = :pendingIoCount"),
    @NamedQuery(name = "DmOsTasks.findByPendingIoByteCount", query = "SELECT d FROM DmOsTasks d WHERE d.pendingIoByteCount = :pendingIoByteCount"),
    @NamedQuery(name = "DmOsTasks.findByPendingIoByteAverage", query = "SELECT d FROM DmOsTasks d WHERE d.pendingIoByteAverage = :pendingIoByteAverage"),
    @NamedQuery(name = "DmOsTasks.findBySchedulerId", query = "SELECT d FROM DmOsTasks d WHERE d.schedulerId = :schedulerId"),
    @NamedQuery(name = "DmOsTasks.findBySessionId", query = "SELECT d FROM DmOsTasks d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmOsTasks.findByExecContextId", query = "SELECT d FROM DmOsTasks d WHERE d.execContextId = :execContextId"),
    @NamedQuery(name = "DmOsTasks.findByRequestId", query = "SELECT d FROM DmOsTasks d WHERE d.requestId = :requestId"),
    @NamedQuery(name = "DmOsTasks.findByTaskLocalStorage", query = "SELECT d FROM DmOsTasks d WHERE d.taskLocalStorage = :taskLocalStorage")})
public class DmOsTasks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "task_address")
    private byte[] taskAddress;
    @Size(max = 60)
    @Column(name = "task_state")
    private String taskState;
    @Column(name = "context_switches_count")
    private Integer contextSwitchesCount;
    @Column(name = "pending_io_count")
    private Integer pendingIoCount;
    @Column(name = "pending_io_byte_count")
    private BigInteger pendingIoByteCount;
    @Column(name = "pending_io_byte_average")
    private Integer pendingIoByteAverage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scheduler_id")
    private int schedulerId;
    @Column(name = "session_id")
    private Short sessionId;
    @Column(name = "exec_context_id")
    private Integer execContextId;
    @Column(name = "request_id")
    private Integer requestId;
    @Lob
    @Column(name = "worker_address")
    private byte[] workerAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "host_address")
    private byte[] hostAddress;
    @Lob
    @Column(name = "parent_task_address")
    private byte[] parentTaskAddress;
    @Size(max = 3072)
    @Column(name = "task_local_storage")
    private String taskLocalStorage;

    public DmOsTasks() {
    }

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }

    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public Integer getContextSwitchesCount() {
        return contextSwitchesCount;
    }

    public void setContextSwitchesCount(Integer contextSwitchesCount) {
        this.contextSwitchesCount = contextSwitchesCount;
    }

    public Integer getPendingIoCount() {
        return pendingIoCount;
    }

    public void setPendingIoCount(Integer pendingIoCount) {
        this.pendingIoCount = pendingIoCount;
    }

    public BigInteger getPendingIoByteCount() {
        return pendingIoByteCount;
    }

    public void setPendingIoByteCount(BigInteger pendingIoByteCount) {
        this.pendingIoByteCount = pendingIoByteCount;
    }

    public Integer getPendingIoByteAverage() {
        return pendingIoByteAverage;
    }

    public void setPendingIoByteAverage(Integer pendingIoByteAverage) {
        this.pendingIoByteAverage = pendingIoByteAverage;
    }

    public int getSchedulerId() {
        return schedulerId;
    }

    public void setSchedulerId(int schedulerId) {
        this.schedulerId = schedulerId;
    }

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getExecContextId() {
        return execContextId;
    }

    public void setExecContextId(Integer execContextId) {
        this.execContextId = execContextId;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public byte[] getWorkerAddress() {
        return workerAddress;
    }

    public void setWorkerAddress(byte[] workerAddress) {
        this.workerAddress = workerAddress;
    }

    public byte[] getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(byte[] hostAddress) {
        this.hostAddress = hostAddress;
    }

    public byte[] getParentTaskAddress() {
        return parentTaskAddress;
    }

    public void setParentTaskAddress(byte[] parentTaskAddress) {
        this.parentTaskAddress = parentTaskAddress;
    }

    public String getTaskLocalStorage() {
        return taskLocalStorage;
    }

    public void setTaskLocalStorage(String taskLocalStorage) {
        this.taskLocalStorage = taskLocalStorage;
    }
    
}
