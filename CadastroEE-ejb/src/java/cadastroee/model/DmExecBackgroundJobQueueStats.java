/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "dm_exec_background_job_queue_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecBackgroundJobQueueStats.findAll", query = "SELECT d FROM DmExecBackgroundJobQueueStats d"),
    @NamedQuery(name = "DmExecBackgroundJobQueueStats.findByQueueMaxLen", query = "SELECT d FROM DmExecBackgroundJobQueueStats d WHERE d.queueMaxLen = :queueMaxLen"),
    @NamedQuery(name = "DmExecBackgroundJobQueueStats.findByEnqueuedCount", query = "SELECT d FROM DmExecBackgroundJobQueueStats d WHERE d.enqueuedCount = :enqueuedCount"),
    @NamedQuery(name = "DmExecBackgroundJobQueueStats.findByStartedCount", query = "SELECT d FROM DmExecBackgroundJobQueueStats d WHERE d.startedCount = :startedCount"),
    @NamedQuery(name = "DmExecBackgroundJobQueueStats.findByEndedCount", query = "SELECT d FROM DmExecBackgroundJobQueueStats d WHERE d.endedCount = :endedCount"),
    @NamedQuery(name = "DmExecBackgroundJobQueueStats.findByFailedLockCount", query = "SELECT d FROM DmExecBackgroundJobQueueStats d WHERE d.failedLockCount = :failedLockCount"),
    @NamedQuery(name = "DmExecBackgroundJobQueueStats.findByFailedOtherCount", query = "SELECT d FROM DmExecBackgroundJobQueueStats d WHERE d.failedOtherCount = :failedOtherCount"),
    @NamedQuery(name = "DmExecBackgroundJobQueueStats.findByFailedGiveupCount", query = "SELECT d FROM DmExecBackgroundJobQueueStats d WHERE d.failedGiveupCount = :failedGiveupCount"),
    @NamedQuery(name = "DmExecBackgroundJobQueueStats.findByEnqueueFailedFullCount", query = "SELECT d FROM DmExecBackgroundJobQueueStats d WHERE d.enqueueFailedFullCount = :enqueueFailedFullCount"),
    @NamedQuery(name = "DmExecBackgroundJobQueueStats.findByEnqueueFailedDuplicateCount", query = "SELECT d FROM DmExecBackgroundJobQueueStats d WHERE d.enqueueFailedDuplicateCount = :enqueueFailedDuplicateCount"),
    @NamedQuery(name = "DmExecBackgroundJobQueueStats.findByElapsedAvgMs", query = "SELECT d FROM DmExecBackgroundJobQueueStats d WHERE d.elapsedAvgMs = :elapsedAvgMs"),
    @NamedQuery(name = "DmExecBackgroundJobQueueStats.findByElapsedMaxMs", query = "SELECT d FROM DmExecBackgroundJobQueueStats d WHERE d.elapsedMaxMs = :elapsedMaxMs")})
public class DmExecBackgroundJobQueueStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "queue_max_len")
    private int queueMaxLen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enqueued_count")
    private int enqueuedCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "started_count")
    private int startedCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ended_count")
    private int endedCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "failed_lock_count")
    private int failedLockCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "failed_other_count")
    private int failedOtherCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "failed_giveup_count")
    private int failedGiveupCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enqueue_failed_full_count")
    private int enqueueFailedFullCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enqueue_failed_duplicate_count")
    private int enqueueFailedDuplicateCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "elapsed_avg_ms")
    private int elapsedAvgMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "elapsed_max_ms")
    private int elapsedMaxMs;

    public DmExecBackgroundJobQueueStats() {
    }

    public int getQueueMaxLen() {
        return queueMaxLen;
    }

    public void setQueueMaxLen(int queueMaxLen) {
        this.queueMaxLen = queueMaxLen;
    }

    public int getEnqueuedCount() {
        return enqueuedCount;
    }

    public void setEnqueuedCount(int enqueuedCount) {
        this.enqueuedCount = enqueuedCount;
    }

    public int getStartedCount() {
        return startedCount;
    }

    public void setStartedCount(int startedCount) {
        this.startedCount = startedCount;
    }

    public int getEndedCount() {
        return endedCount;
    }

    public void setEndedCount(int endedCount) {
        this.endedCount = endedCount;
    }

    public int getFailedLockCount() {
        return failedLockCount;
    }

    public void setFailedLockCount(int failedLockCount) {
        this.failedLockCount = failedLockCount;
    }

    public int getFailedOtherCount() {
        return failedOtherCount;
    }

    public void setFailedOtherCount(int failedOtherCount) {
        this.failedOtherCount = failedOtherCount;
    }

    public int getFailedGiveupCount() {
        return failedGiveupCount;
    }

    public void setFailedGiveupCount(int failedGiveupCount) {
        this.failedGiveupCount = failedGiveupCount;
    }

    public int getEnqueueFailedFullCount() {
        return enqueueFailedFullCount;
    }

    public void setEnqueueFailedFullCount(int enqueueFailedFullCount) {
        this.enqueueFailedFullCount = enqueueFailedFullCount;
    }

    public int getEnqueueFailedDuplicateCount() {
        return enqueueFailedDuplicateCount;
    }

    public void setEnqueueFailedDuplicateCount(int enqueueFailedDuplicateCount) {
        this.enqueueFailedDuplicateCount = enqueueFailedDuplicateCount;
    }

    public int getElapsedAvgMs() {
        return elapsedAvgMs;
    }

    public void setElapsedAvgMs(int elapsedAvgMs) {
        this.elapsedAvgMs = elapsedAvgMs;
    }

    public int getElapsedMaxMs() {
        return elapsedMaxMs;
    }

    public void setElapsedMaxMs(int elapsedMaxMs) {
        this.elapsedMaxMs = elapsedMaxMs;
    }
    
}
