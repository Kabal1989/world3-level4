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
@Table(name = "dm_os_waiting_tasks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsWaitingTasks.findAll", query = "SELECT d FROM DmOsWaitingTasks d"),
    @NamedQuery(name = "DmOsWaitingTasks.findBySessionId", query = "SELECT d FROM DmOsWaitingTasks d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmOsWaitingTasks.findByExecContextId", query = "SELECT d FROM DmOsWaitingTasks d WHERE d.execContextId = :execContextId"),
    @NamedQuery(name = "DmOsWaitingTasks.findByWaitDurationMs", query = "SELECT d FROM DmOsWaitingTasks d WHERE d.waitDurationMs = :waitDurationMs"),
    @NamedQuery(name = "DmOsWaitingTasks.findByWaitType", query = "SELECT d FROM DmOsWaitingTasks d WHERE d.waitType = :waitType"),
    @NamedQuery(name = "DmOsWaitingTasks.findByBlockingSessionId", query = "SELECT d FROM DmOsWaitingTasks d WHERE d.blockingSessionId = :blockingSessionId"),
    @NamedQuery(name = "DmOsWaitingTasks.findByBlockingExecContextId", query = "SELECT d FROM DmOsWaitingTasks d WHERE d.blockingExecContextId = :blockingExecContextId"),
    @NamedQuery(name = "DmOsWaitingTasks.findByResourceDescription", query = "SELECT d FROM DmOsWaitingTasks d WHERE d.resourceDescription = :resourceDescription")})
public class DmOsWaitingTasks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "waiting_task_address")
    private byte[] waitingTaskAddress;
    @Column(name = "session_id")
    private Short sessionId;
    @Column(name = "exec_context_id")
    private Integer execContextId;
    @Column(name = "wait_duration_ms")
    private BigInteger waitDurationMs;
    @Size(max = 60)
    @Column(name = "wait_type")
    private String waitType;
    @Lob
    @Column(name = "resource_address")
    private byte[] resourceAddress;
    @Lob
    @Column(name = "blocking_task_address")
    private byte[] blockingTaskAddress;
    @Column(name = "blocking_session_id")
    private Short blockingSessionId;
    @Column(name = "blocking_exec_context_id")
    private Integer blockingExecContextId;
    @Size(max = 3072)
    @Column(name = "resource_description")
    private String resourceDescription;

    public DmOsWaitingTasks() {
    }

    public byte[] getWaitingTaskAddress() {
        return waitingTaskAddress;
    }

    public void setWaitingTaskAddress(byte[] waitingTaskAddress) {
        this.waitingTaskAddress = waitingTaskAddress;
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

    public BigInteger getWaitDurationMs() {
        return waitDurationMs;
    }

    public void setWaitDurationMs(BigInteger waitDurationMs) {
        this.waitDurationMs = waitDurationMs;
    }

    public String getWaitType() {
        return waitType;
    }

    public void setWaitType(String waitType) {
        this.waitType = waitType;
    }

    public byte[] getResourceAddress() {
        return resourceAddress;
    }

    public void setResourceAddress(byte[] resourceAddress) {
        this.resourceAddress = resourceAddress;
    }

    public byte[] getBlockingTaskAddress() {
        return blockingTaskAddress;
    }

    public void setBlockingTaskAddress(byte[] blockingTaskAddress) {
        this.blockingTaskAddress = blockingTaskAddress;
    }

    public Short getBlockingSessionId() {
        return blockingSessionId;
    }

    public void setBlockingSessionId(Short blockingSessionId) {
        this.blockingSessionId = blockingSessionId;
    }

    public Integer getBlockingExecContextId() {
        return blockingExecContextId;
    }

    public void setBlockingExecContextId(Integer blockingExecContextId) {
        this.blockingExecContextId = blockingExecContextId;
    }

    public String getResourceDescription() {
        return resourceDescription;
    }

    public void setResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
    }
    
}
