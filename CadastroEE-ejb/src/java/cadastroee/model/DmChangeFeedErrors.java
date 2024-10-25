/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
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
@Table(name = "dm_change_feed_errors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmChangeFeedErrors.findAll", query = "SELECT d FROM DmChangeFeedErrors d"),
    @NamedQuery(name = "DmChangeFeedErrors.findBySessionId", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmChangeFeedErrors.findBySourceTask", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.sourceTask = :sourceTask"),
    @NamedQuery(name = "DmChangeFeedErrors.findByTableGroupId", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.tableGroupId = :tableGroupId"),
    @NamedQuery(name = "DmChangeFeedErrors.findByTableId", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.tableId = :tableId"),
    @NamedQuery(name = "DmChangeFeedErrors.findByCapturePhaseNumber", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.capturePhaseNumber = :capturePhaseNumber"),
    @NamedQuery(name = "DmChangeFeedErrors.findByEntryTime", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.entryTime = :entryTime"),
    @NamedQuery(name = "DmChangeFeedErrors.findByErrorNumber", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.errorNumber = :errorNumber"),
    @NamedQuery(name = "DmChangeFeedErrors.findByErrorSeverity", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.errorSeverity = :errorSeverity"),
    @NamedQuery(name = "DmChangeFeedErrors.findByErrorState", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.errorState = :errorState"),
    @NamedQuery(name = "DmChangeFeedErrors.findByErrorMessage", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.errorMessage = :errorMessage"),
    @NamedQuery(name = "DmChangeFeedErrors.findByBatchStartLsn", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.batchStartLsn = :batchStartLsn"),
    @NamedQuery(name = "DmChangeFeedErrors.findByBatchEndLsn", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.batchEndLsn = :batchEndLsn"),
    @NamedQuery(name = "DmChangeFeedErrors.findByTranBeginLsn", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.tranBeginLsn = :tranBeginLsn"),
    @NamedQuery(name = "DmChangeFeedErrors.findByTranCommitLsn", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.tranCommitLsn = :tranCommitLsn"),
    @NamedQuery(name = "DmChangeFeedErrors.findBySequenceValue", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.sequenceValue = :sequenceValue"),
    @NamedQuery(name = "DmChangeFeedErrors.findByCommandId", query = "SELECT d FROM DmChangeFeedErrors d WHERE d.commandId = :commandId")})
public class DmChangeFeedErrors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "session_id")
    private Integer sessionId;
    @Column(name = "source_task")
    private Short sourceTask;
    @Size(max = 36)
    @Column(name = "table_group_id")
    private String tableGroupId;
    @Column(name = "table_id")
    private Integer tableId;
    @Column(name = "capture_phase_number")
    private Integer capturePhaseNumber;
    @Column(name = "entry_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryTime;
    @Column(name = "error_number")
    private Integer errorNumber;
    @Column(name = "error_severity")
    private Integer errorSeverity;
    @Column(name = "error_state")
    private Integer errorState;
    @Size(max = 1025)
    @Column(name = "error_message")
    private String errorMessage;
    @Size(max = 24)
    @Column(name = "batch_start_lsn")
    private String batchStartLsn;
    @Size(max = 24)
    @Column(name = "batch_end_lsn")
    private String batchEndLsn;
    @Size(max = 24)
    @Column(name = "tran_begin_lsn")
    private String tranBeginLsn;
    @Size(max = 24)
    @Column(name = "tran_commit_lsn")
    private String tranCommitLsn;
    @Size(max = 24)
    @Column(name = "sequence_value")
    private String sequenceValue;
    @Column(name = "command_id")
    private Integer commandId;

    public DmChangeFeedErrors() {
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Short getSourceTask() {
        return sourceTask;
    }

    public void setSourceTask(Short sourceTask) {
        this.sourceTask = sourceTask;
    }

    public String getTableGroupId() {
        return tableGroupId;
    }

    public void setTableGroupId(String tableGroupId) {
        this.tableGroupId = tableGroupId;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getCapturePhaseNumber() {
        return capturePhaseNumber;
    }

    public void setCapturePhaseNumber(Integer capturePhaseNumber) {
        this.capturePhaseNumber = capturePhaseNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Integer getErrorNumber() {
        return errorNumber;
    }

    public void setErrorNumber(Integer errorNumber) {
        this.errorNumber = errorNumber;
    }

    public Integer getErrorSeverity() {
        return errorSeverity;
    }

    public void setErrorSeverity(Integer errorSeverity) {
        this.errorSeverity = errorSeverity;
    }

    public Integer getErrorState() {
        return errorState;
    }

    public void setErrorState(Integer errorState) {
        this.errorState = errorState;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getBatchStartLsn() {
        return batchStartLsn;
    }

    public void setBatchStartLsn(String batchStartLsn) {
        this.batchStartLsn = batchStartLsn;
    }

    public String getBatchEndLsn() {
        return batchEndLsn;
    }

    public void setBatchEndLsn(String batchEndLsn) {
        this.batchEndLsn = batchEndLsn;
    }

    public String getTranBeginLsn() {
        return tranBeginLsn;
    }

    public void setTranBeginLsn(String tranBeginLsn) {
        this.tranBeginLsn = tranBeginLsn;
    }

    public String getTranCommitLsn() {
        return tranCommitLsn;
    }

    public void setTranCommitLsn(String tranCommitLsn) {
        this.tranCommitLsn = tranCommitLsn;
    }

    public String getSequenceValue() {
        return sequenceValue;
    }

    public void setSequenceValue(String sequenceValue) {
        this.sequenceValue = sequenceValue;
    }

    public Integer getCommandId() {
        return commandId;
    }

    public void setCommandId(Integer commandId) {
        this.commandId = commandId;
    }
    
}
