/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_change_feed_log_scan_sessions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findAll", query = "SELECT d FROM DmChangeFeedLogScanSessions d"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findBySessionId", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByStartTime", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.startTime = :startTime"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByEndTime", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.endTime = :endTime"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByDuration", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.duration = :duration"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByBatchProcessingPhase", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.batchProcessingPhase = :batchProcessingPhase"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByErrorCount", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.errorCount = :errorCount"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByBatchStartLsn", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.batchStartLsn = :batchStartLsn"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByCurrentlyProcessedLsn", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.currentlyProcessedLsn = :currentlyProcessedLsn"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByBatchEndLsn", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.batchEndLsn = :batchEndLsn"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByTranCount", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.tranCount = :tranCount"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByCurrentlyProcessedCommitLsn", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.currentlyProcessedCommitLsn = :currentlyProcessedCommitLsn"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByCurrentlyProcessedCommitTime", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.currentlyProcessedCommitTime = :currentlyProcessedCommitTime"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByLogRecordCount", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.logRecordCount = :logRecordCount"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findBySchemaChangeCount", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.schemaChangeCount = :schemaChangeCount"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByCommandCount", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.commandCount = :commandCount"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByLatency", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.latency = :latency"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByRowsLeftToPublish", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.rowsLeftToPublish = :rowsLeftToPublish"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByTableGroupsToCommit", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.tableGroupsToCommit = :tableGroupsToCommit"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByEmptyScanCount", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.emptyScanCount = :emptyScanCount"),
    @NamedQuery(name = "DmChangeFeedLogScanSessions.findByFailedSessionsCount", query = "SELECT d FROM DmChangeFeedLogScanSessions d WHERE d.failedSessionsCount = :failedSessionsCount")})
public class DmChangeFeedLogScanSessions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "session_id")
    private Integer sessionId;
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "end_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "duration")
    private Integer duration;
    @Size(max = 200)
    @Column(name = "batch_processing_phase")
    private String batchProcessingPhase;
    @Column(name = "error_count")
    private Integer errorCount;
    @Size(max = 24)
    @Column(name = "batch_start_lsn")
    private String batchStartLsn;
    @Size(max = 24)
    @Column(name = "currently_processed_lsn")
    private String currentlyProcessedLsn;
    @Size(max = 24)
    @Column(name = "batch_end_lsn")
    private String batchEndLsn;
    @Column(name = "tran_count")
    private BigInteger tranCount;
    @Size(max = 24)
    @Column(name = "currently_processed_commit_lsn")
    private String currentlyProcessedCommitLsn;
    @Column(name = "currently_processed_commit_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date currentlyProcessedCommitTime;
    @Column(name = "log_record_count")
    private BigInteger logRecordCount;
    @Column(name = "schema_change_count")
    private Integer schemaChangeCount;
    @Column(name = "command_count")
    private BigInteger commandCount;
    @Column(name = "latency")
    private Integer latency;
    @Column(name = "rows_left_to_publish")
    private BigInteger rowsLeftToPublish;
    @Column(name = "table_groups_to_commit")
    private Integer tableGroupsToCommit;
    @Column(name = "empty_scan_count")
    private Integer emptyScanCount;
    @Column(name = "failed_sessions_count")
    private Integer failedSessionsCount;

    public DmChangeFeedLogScanSessions() {
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getBatchProcessingPhase() {
        return batchProcessingPhase;
    }

    public void setBatchProcessingPhase(String batchProcessingPhase) {
        this.batchProcessingPhase = batchProcessingPhase;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public String getBatchStartLsn() {
        return batchStartLsn;
    }

    public void setBatchStartLsn(String batchStartLsn) {
        this.batchStartLsn = batchStartLsn;
    }

    public String getCurrentlyProcessedLsn() {
        return currentlyProcessedLsn;
    }

    public void setCurrentlyProcessedLsn(String currentlyProcessedLsn) {
        this.currentlyProcessedLsn = currentlyProcessedLsn;
    }

    public String getBatchEndLsn() {
        return batchEndLsn;
    }

    public void setBatchEndLsn(String batchEndLsn) {
        this.batchEndLsn = batchEndLsn;
    }

    public BigInteger getTranCount() {
        return tranCount;
    }

    public void setTranCount(BigInteger tranCount) {
        this.tranCount = tranCount;
    }

    public String getCurrentlyProcessedCommitLsn() {
        return currentlyProcessedCommitLsn;
    }

    public void setCurrentlyProcessedCommitLsn(String currentlyProcessedCommitLsn) {
        this.currentlyProcessedCommitLsn = currentlyProcessedCommitLsn;
    }

    public Date getCurrentlyProcessedCommitTime() {
        return currentlyProcessedCommitTime;
    }

    public void setCurrentlyProcessedCommitTime(Date currentlyProcessedCommitTime) {
        this.currentlyProcessedCommitTime = currentlyProcessedCommitTime;
    }

    public BigInteger getLogRecordCount() {
        return logRecordCount;
    }

    public void setLogRecordCount(BigInteger logRecordCount) {
        this.logRecordCount = logRecordCount;
    }

    public Integer getSchemaChangeCount() {
        return schemaChangeCount;
    }

    public void setSchemaChangeCount(Integer schemaChangeCount) {
        this.schemaChangeCount = schemaChangeCount;
    }

    public BigInteger getCommandCount() {
        return commandCount;
    }

    public void setCommandCount(BigInteger commandCount) {
        this.commandCount = commandCount;
    }

    public Integer getLatency() {
        return latency;
    }

    public void setLatency(Integer latency) {
        this.latency = latency;
    }

    public BigInteger getRowsLeftToPublish() {
        return rowsLeftToPublish;
    }

    public void setRowsLeftToPublish(BigInteger rowsLeftToPublish) {
        this.rowsLeftToPublish = rowsLeftToPublish;
    }

    public Integer getTableGroupsToCommit() {
        return tableGroupsToCommit;
    }

    public void setTableGroupsToCommit(Integer tableGroupsToCommit) {
        this.tableGroupsToCommit = tableGroupsToCommit;
    }

    public Integer getEmptyScanCount() {
        return emptyScanCount;
    }

    public void setEmptyScanCount(Integer emptyScanCount) {
        this.emptyScanCount = emptyScanCount;
    }

    public Integer getFailedSessionsCount() {
        return failedSessionsCount;
    }

    public void setFailedSessionsCount(Integer failedSessionsCount) {
        this.failedSessionsCount = failedSessionsCount;
    }
    
}
