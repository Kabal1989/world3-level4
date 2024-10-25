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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_db_task_space_usage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbTaskSpaceUsage.findAll", query = "SELECT d FROM DmDbTaskSpaceUsage d"),
    @NamedQuery(name = "DmDbTaskSpaceUsage.findByIsRemoteTask", query = "SELECT d FROM DmDbTaskSpaceUsage d WHERE d.isRemoteTask = :isRemoteTask"),
    @NamedQuery(name = "DmDbTaskSpaceUsage.findBySessionId", query = "SELECT d FROM DmDbTaskSpaceUsage d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmDbTaskSpaceUsage.findByRequestId", query = "SELECT d FROM DmDbTaskSpaceUsage d WHERE d.requestId = :requestId"),
    @NamedQuery(name = "DmDbTaskSpaceUsage.findByExecContextId", query = "SELECT d FROM DmDbTaskSpaceUsage d WHERE d.execContextId = :execContextId"),
    @NamedQuery(name = "DmDbTaskSpaceUsage.findByDatabaseId", query = "SELECT d FROM DmDbTaskSpaceUsage d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmDbTaskSpaceUsage.findByUserObjectsAllocPageCount", query = "SELECT d FROM DmDbTaskSpaceUsage d WHERE d.userObjectsAllocPageCount = :userObjectsAllocPageCount"),
    @NamedQuery(name = "DmDbTaskSpaceUsage.findByUserObjectsDeallocPageCount", query = "SELECT d FROM DmDbTaskSpaceUsage d WHERE d.userObjectsDeallocPageCount = :userObjectsDeallocPageCount"),
    @NamedQuery(name = "DmDbTaskSpaceUsage.findByInternalObjectsAllocPageCount", query = "SELECT d FROM DmDbTaskSpaceUsage d WHERE d.internalObjectsAllocPageCount = :internalObjectsAllocPageCount"),
    @NamedQuery(name = "DmDbTaskSpaceUsage.findByInternalObjectsDeallocPageCount", query = "SELECT d FROM DmDbTaskSpaceUsage d WHERE d.internalObjectsDeallocPageCount = :internalObjectsDeallocPageCount")})
public class DmDbTaskSpaceUsage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "task_address")
    private byte[] taskAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_remote_task")
    private boolean isRemoteTask;
    @Column(name = "session_id")
    private Short sessionId;
    @Column(name = "request_id")
    private Integer requestId;
    @Column(name = "exec_context_id")
    private Integer execContextId;
    @Column(name = "database_id")
    private Integer databaseId;
    @Column(name = "user_objects_alloc_page_count")
    private BigInteger userObjectsAllocPageCount;
    @Column(name = "user_objects_dealloc_page_count")
    private BigInteger userObjectsDeallocPageCount;
    @Column(name = "internal_objects_alloc_page_count")
    private BigInteger internalObjectsAllocPageCount;
    @Column(name = "internal_objects_dealloc_page_count")
    private BigInteger internalObjectsDeallocPageCount;

    public DmDbTaskSpaceUsage() {
    }

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }

    public boolean getIsRemoteTask() {
        return isRemoteTask;
    }

    public void setIsRemoteTask(boolean isRemoteTask) {
        this.isRemoteTask = isRemoteTask;
    }

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Integer getExecContextId() {
        return execContextId;
    }

    public void setExecContextId(Integer execContextId) {
        this.execContextId = execContextId;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public BigInteger getUserObjectsAllocPageCount() {
        return userObjectsAllocPageCount;
    }

    public void setUserObjectsAllocPageCount(BigInteger userObjectsAllocPageCount) {
        this.userObjectsAllocPageCount = userObjectsAllocPageCount;
    }

    public BigInteger getUserObjectsDeallocPageCount() {
        return userObjectsDeallocPageCount;
    }

    public void setUserObjectsDeallocPageCount(BigInteger userObjectsDeallocPageCount) {
        this.userObjectsDeallocPageCount = userObjectsDeallocPageCount;
    }

    public BigInteger getInternalObjectsAllocPageCount() {
        return internalObjectsAllocPageCount;
    }

    public void setInternalObjectsAllocPageCount(BigInteger internalObjectsAllocPageCount) {
        this.internalObjectsAllocPageCount = internalObjectsAllocPageCount;
    }

    public BigInteger getInternalObjectsDeallocPageCount() {
        return internalObjectsDeallocPageCount;
    }

    public void setInternalObjectsDeallocPageCount(BigInteger internalObjectsDeallocPageCount) {
        this.internalObjectsDeallocPageCount = internalObjectsDeallocPageCount;
    }
    
}
