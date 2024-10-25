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
@Table(name = "dm_cdc_log_scan_sessions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmCdcLogScanSessions.findAll", query = "SELECT d FROM DmCdcLogScanSessions d"),
    @NamedQuery(name = "DmCdcLogScanSessions.findBySessionId", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByStartTime", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.startTime = :startTime"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByEndTime", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.endTime = :endTime"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByDuration", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.duration = :duration"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByScanPhase", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.scanPhase = :scanPhase"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByErrorCount", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.errorCount = :errorCount"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByStartLsn", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.startLsn = :startLsn"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByCurrentLsn", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.currentLsn = :currentLsn"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByEndLsn", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.endLsn = :endLsn"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByTranCount", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.tranCount = :tranCount"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByLastCommitLsn", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.lastCommitLsn = :lastCommitLsn"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByLastCommitTime", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.lastCommitTime = :lastCommitTime"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByLogRecordCount", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.logRecordCount = :logRecordCount"),
    @NamedQuery(name = "DmCdcLogScanSessions.findBySchemaChangeCount", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.schemaChangeCount = :schemaChangeCount"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByCommandCount", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.commandCount = :commandCount"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByFirstBeginCdcLsn", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.firstBeginCdcLsn = :firstBeginCdcLsn"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByLastCommitCdcLsn", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.lastCommitCdcLsn = :lastCommitCdcLsn"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByLastCommitCdcTime", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.lastCommitCdcTime = :lastCommitCdcTime"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByLatency", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.latency = :latency"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByEmptyScanCount", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.emptyScanCount = :emptyScanCount"),
    @NamedQuery(name = "DmCdcLogScanSessions.findByFailedSessionsCount", query = "SELECT d FROM DmCdcLogScanSessions d WHERE d.failedSessionsCount = :failedSessionsCount")})
public class DmCdcLogScanSessions implements Serializable {

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
    @Column(name = "scan_phase")
    private String scanPhase;
    @Column(name = "error_count")
    private Integer errorCount;
    @Size(max = 24)
    @Column(name = "start_lsn")
    private String startLsn;
    @Size(max = 24)
    @Column(name = "current_lsn")
    private String currentLsn;
    @Size(max = 24)
    @Column(name = "end_lsn")
    private String endLsn;
    @Column(name = "tran_count")
    private BigInteger tranCount;
    @Size(max = 24)
    @Column(name = "last_commit_lsn")
    private String lastCommitLsn;
    @Column(name = "last_commit_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastCommitTime;
    @Column(name = "log_record_count")
    private BigInteger logRecordCount;
    @Column(name = "schema_change_count")
    private Integer schemaChangeCount;
    @Column(name = "command_count")
    private BigInteger commandCount;
    @Size(max = 24)
    @Column(name = "first_begin_cdc_lsn")
    private String firstBeginCdcLsn;
    @Size(max = 24)
    @Column(name = "last_commit_cdc_lsn")
    private String lastCommitCdcLsn;
    @Column(name = "last_commit_cdc_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastCommitCdcTime;
    @Column(name = "latency")
    private Integer latency;
    @Column(name = "empty_scan_count")
    private Integer emptyScanCount;
    @Column(name = "failed_sessions_count")
    private Integer failedSessionsCount;

    public DmCdcLogScanSessions() {
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

    public String getScanPhase() {
        return scanPhase;
    }

    public void setScanPhase(String scanPhase) {
        this.scanPhase = scanPhase;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public String getStartLsn() {
        return startLsn;
    }

    public void setStartLsn(String startLsn) {
        this.startLsn = startLsn;
    }

    public String getCurrentLsn() {
        return currentLsn;
    }

    public void setCurrentLsn(String currentLsn) {
        this.currentLsn = currentLsn;
    }

    public String getEndLsn() {
        return endLsn;
    }

    public void setEndLsn(String endLsn) {
        this.endLsn = endLsn;
    }

    public BigInteger getTranCount() {
        return tranCount;
    }

    public void setTranCount(BigInteger tranCount) {
        this.tranCount = tranCount;
    }

    public String getLastCommitLsn() {
        return lastCommitLsn;
    }

    public void setLastCommitLsn(String lastCommitLsn) {
        this.lastCommitLsn = lastCommitLsn;
    }

    public Date getLastCommitTime() {
        return lastCommitTime;
    }

    public void setLastCommitTime(Date lastCommitTime) {
        this.lastCommitTime = lastCommitTime;
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

    public String getFirstBeginCdcLsn() {
        return firstBeginCdcLsn;
    }

    public void setFirstBeginCdcLsn(String firstBeginCdcLsn) {
        this.firstBeginCdcLsn = firstBeginCdcLsn;
    }

    public String getLastCommitCdcLsn() {
        return lastCommitCdcLsn;
    }

    public void setLastCommitCdcLsn(String lastCommitCdcLsn) {
        this.lastCommitCdcLsn = lastCommitCdcLsn;
    }

    public Date getLastCommitCdcTime() {
        return lastCommitCdcTime;
    }

    public void setLastCommitCdcTime(Date lastCommitCdcTime) {
        this.lastCommitCdcTime = lastCommitCdcTime;
    }

    public Integer getLatency() {
        return latency;
    }

    public void setLatency(Integer latency) {
        this.latency = latency;
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
