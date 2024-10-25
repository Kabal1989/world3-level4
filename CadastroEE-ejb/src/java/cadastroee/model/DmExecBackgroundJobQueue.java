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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_exec_background_job_queue")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecBackgroundJobQueue.findAll", query = "SELECT d FROM DmExecBackgroundJobQueue d"),
    @NamedQuery(name = "DmExecBackgroundJobQueue.findByTimeQueued", query = "SELECT d FROM DmExecBackgroundJobQueue d WHERE d.timeQueued = :timeQueued"),
    @NamedQuery(name = "DmExecBackgroundJobQueue.findByJobId", query = "SELECT d FROM DmExecBackgroundJobQueue d WHERE d.jobId = :jobId"),
    @NamedQuery(name = "DmExecBackgroundJobQueue.findByDatabaseId", query = "SELECT d FROM DmExecBackgroundJobQueue d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmExecBackgroundJobQueue.findByObjectId1", query = "SELECT d FROM DmExecBackgroundJobQueue d WHERE d.objectId1 = :objectId1"),
    @NamedQuery(name = "DmExecBackgroundJobQueue.findByObjectId2", query = "SELECT d FROM DmExecBackgroundJobQueue d WHERE d.objectId2 = :objectId2"),
    @NamedQuery(name = "DmExecBackgroundJobQueue.findByObjectId3", query = "SELECT d FROM DmExecBackgroundJobQueue d WHERE d.objectId3 = :objectId3"),
    @NamedQuery(name = "DmExecBackgroundJobQueue.findByObjectId4", query = "SELECT d FROM DmExecBackgroundJobQueue d WHERE d.objectId4 = :objectId4"),
    @NamedQuery(name = "DmExecBackgroundJobQueue.findByErrorCode", query = "SELECT d FROM DmExecBackgroundJobQueue d WHERE d.errorCode = :errorCode"),
    @NamedQuery(name = "DmExecBackgroundJobQueue.findByRequestType", query = "SELECT d FROM DmExecBackgroundJobQueue d WHERE d.requestType = :requestType"),
    @NamedQuery(name = "DmExecBackgroundJobQueue.findByRetryCount", query = "SELECT d FROM DmExecBackgroundJobQueue d WHERE d.retryCount = :retryCount"),
    @NamedQuery(name = "DmExecBackgroundJobQueue.findByInProgress", query = "SELECT d FROM DmExecBackgroundJobQueue d WHERE d.inProgress = :inProgress"),
    @NamedQuery(name = "DmExecBackgroundJobQueue.findBySessionId", query = "SELECT d FROM DmExecBackgroundJobQueue d WHERE d.sessionId = :sessionId")})
public class DmExecBackgroundJobQueue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "time_queued")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeQueued;
    @Basic(optional = false)
    @NotNull
    @Column(name = "job_id")
    private int jobId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id1")
    private int objectId1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id2")
    private int objectId2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id3")
    private int objectId3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id4")
    private int objectId4;
    @Column(name = "error_code")
    private Integer errorCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_type")
    private short requestType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "retry_count")
    private short retryCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "in_progress")
    private short inProgress;
    @Column(name = "session_id")
    private Short sessionId;

    public DmExecBackgroundJobQueue() {
    }

    public Date getTimeQueued() {
        return timeQueued;
    }

    public void setTimeQueued(Date timeQueued) {
        this.timeQueued = timeQueued;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public int getObjectId1() {
        return objectId1;
    }

    public void setObjectId1(int objectId1) {
        this.objectId1 = objectId1;
    }

    public int getObjectId2() {
        return objectId2;
    }

    public void setObjectId2(int objectId2) {
        this.objectId2 = objectId2;
    }

    public int getObjectId3() {
        return objectId3;
    }

    public void setObjectId3(int objectId3) {
        this.objectId3 = objectId3;
    }

    public int getObjectId4() {
        return objectId4;
    }

    public void setObjectId4(int objectId4) {
        this.objectId4 = objectId4;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public short getRequestType() {
        return requestType;
    }

    public void setRequestType(short requestType) {
        this.requestType = requestType;
    }

    public short getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(short retryCount) {
        this.retryCount = retryCount;
    }

    public short getInProgress() {
        return inProgress;
    }

    public void setInProgress(short inProgress) {
        this.inProgress = inProgress;
    }

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }
    
}
