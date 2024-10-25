/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_exec_requests_history")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecRequestsHistory.findAll", query = "SELECT d FROM DmExecRequestsHistory d"),
    @NamedQuery(name = "DmExecRequestsHistory.findByStatus", query = "SELECT d FROM DmExecRequestsHistory d WHERE d.status = :status"),
    @NamedQuery(name = "DmExecRequestsHistory.findByTransactionId", query = "SELECT d FROM DmExecRequestsHistory d WHERE d.transactionId = :transactionId"),
    @NamedQuery(name = "DmExecRequestsHistory.findByDistributedStatementId", query = "SELECT d FROM DmExecRequestsHistory d WHERE d.distributedStatementId = :distributedStatementId"),
    @NamedQuery(name = "DmExecRequestsHistory.findByLoginName", query = "SELECT d FROM DmExecRequestsHistory d WHERE d.loginName = :loginName"),
    @NamedQuery(name = "DmExecRequestsHistory.findByStartTime", query = "SELECT d FROM DmExecRequestsHistory d WHERE d.startTime = :startTime"),
    @NamedQuery(name = "DmExecRequestsHistory.findByEndTime", query = "SELECT d FROM DmExecRequestsHistory d WHERE d.endTime = :endTime"),
    @NamedQuery(name = "DmExecRequestsHistory.findByCommand", query = "SELECT d FROM DmExecRequestsHistory d WHERE d.command = :command"),
    @NamedQuery(name = "DmExecRequestsHistory.findByQueryText", query = "SELECT d FROM DmExecRequestsHistory d WHERE d.queryText = :queryText"),
    @NamedQuery(name = "DmExecRequestsHistory.findByTotalElapsedTimeMs", query = "SELECT d FROM DmExecRequestsHistory d WHERE d.totalElapsedTimeMs = :totalElapsedTimeMs"),
    @NamedQuery(name = "DmExecRequestsHistory.findByDataProcessedMb", query = "SELECT d FROM DmExecRequestsHistory d WHERE d.dataProcessedMb = :dataProcessedMb"),
    @NamedQuery(name = "DmExecRequestsHistory.findByError", query = "SELECT d FROM DmExecRequestsHistory d WHERE d.error = :error"),
    @NamedQuery(name = "DmExecRequestsHistory.findByErrorCode", query = "SELECT d FROM DmExecRequestsHistory d WHERE d.errorCode = :errorCode"),
    @NamedQuery(name = "DmExecRequestsHistory.findByRejectedRowsPath", query = "SELECT d FROM DmExecRequestsHistory d WHERE d.rejectedRowsPath = :rejectedRowsPath")})
public class DmExecRequestsHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_id")
    private long transactionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "distributed_statement_id")
    private String distributedStatementId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "query_hash")
    private byte[] queryHash;
    @Size(max = 644)
    @Column(name = "login_name")
    private String loginName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "end_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Size(max = 4000)
    @Column(name = "command")
    private String command;
    @Size(max = 2147483647)
    @Column(name = "query_text")
    private String queryText;
    @Column(name = "total_elapsed_time_ms")
    private BigInteger totalElapsedTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_processed_mb")
    private long dataProcessedMb;
    @Size(max = 2147483647)
    @Column(name = "error")
    private String error;
    @Column(name = "error_code")
    private Integer errorCode;
    @Size(max = 2147483647)
    @Column(name = "rejected_rows_path")
    private String rejectedRowsPath;

    public DmExecRequestsHistory() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public String getDistributedStatementId() {
        return distributedStatementId;
    }

    public void setDistributedStatementId(String distributedStatementId) {
        this.distributedStatementId = distributedStatementId;
    }

    public byte[] getQueryHash() {
        return queryHash;
    }

    public void setQueryHash(byte[] queryHash) {
        this.queryHash = queryHash;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
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

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public BigInteger getTotalElapsedTimeMs() {
        return totalElapsedTimeMs;
    }

    public void setTotalElapsedTimeMs(BigInteger totalElapsedTimeMs) {
        this.totalElapsedTimeMs = totalElapsedTimeMs;
    }

    public long getDataProcessedMb() {
        return dataProcessedMb;
    }

    public void setDataProcessedMb(long dataProcessedMb) {
        this.dataProcessedMb = dataProcessedMb;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getRejectedRowsPath() {
        return rejectedRowsPath;
    }

    public void setRejectedRowsPath(String rejectedRowsPath) {
        this.rejectedRowsPath = rejectedRowsPath;
    }
    
}
