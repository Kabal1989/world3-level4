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
@Table(name = "dm_cdc_errors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmCdcErrors.findAll", query = "SELECT d FROM DmCdcErrors d"),
    @NamedQuery(name = "DmCdcErrors.findBySessionId", query = "SELECT d FROM DmCdcErrors d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmCdcErrors.findByPhaseNumber", query = "SELECT d FROM DmCdcErrors d WHERE d.phaseNumber = :phaseNumber"),
    @NamedQuery(name = "DmCdcErrors.findByEntryTime", query = "SELECT d FROM DmCdcErrors d WHERE d.entryTime = :entryTime"),
    @NamedQuery(name = "DmCdcErrors.findByErrorNumber", query = "SELECT d FROM DmCdcErrors d WHERE d.errorNumber = :errorNumber"),
    @NamedQuery(name = "DmCdcErrors.findByErrorSeverity", query = "SELECT d FROM DmCdcErrors d WHERE d.errorSeverity = :errorSeverity"),
    @NamedQuery(name = "DmCdcErrors.findByErrorState", query = "SELECT d FROM DmCdcErrors d WHERE d.errorState = :errorState"),
    @NamedQuery(name = "DmCdcErrors.findByErrorMessage", query = "SELECT d FROM DmCdcErrors d WHERE d.errorMessage = :errorMessage"),
    @NamedQuery(name = "DmCdcErrors.findByStartLsn", query = "SELECT d FROM DmCdcErrors d WHERE d.startLsn = :startLsn"),
    @NamedQuery(name = "DmCdcErrors.findByBeginLsn", query = "SELECT d FROM DmCdcErrors d WHERE d.beginLsn = :beginLsn"),
    @NamedQuery(name = "DmCdcErrors.findBySequenceValue", query = "SELECT d FROM DmCdcErrors d WHERE d.sequenceValue = :sequenceValue")})
public class DmCdcErrors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "session_id")
    private Integer sessionId;
    @Column(name = "phase_number")
    private Integer phaseNumber;
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
    @Column(name = "start_lsn")
    private String startLsn;
    @Size(max = 24)
    @Column(name = "begin_lsn")
    private String beginLsn;
    @Size(max = 24)
    @Column(name = "sequence_value")
    private String sequenceValue;

    public DmCdcErrors() {
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getPhaseNumber() {
        return phaseNumber;
    }

    public void setPhaseNumber(Integer phaseNumber) {
        this.phaseNumber = phaseNumber;
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

    public String getStartLsn() {
        return startLsn;
    }

    public void setStartLsn(String startLsn) {
        this.startLsn = startLsn;
    }

    public String getBeginLsn() {
        return beginLsn;
    }

    public void setBeginLsn(String beginLsn) {
        this.beginLsn = beginLsn;
    }

    public String getSequenceValue() {
        return sequenceValue;
    }

    public void setSequenceValue(String sequenceValue) {
        this.sequenceValue = sequenceValue;
    }
    
}
