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
@Table(name = "dm_request_phases")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmRequestPhases.findAll", query = "SELECT d FROM DmRequestPhases d"),
    @NamedQuery(name = "DmRequestPhases.findByDistStatementId", query = "SELECT d FROM DmRequestPhases d WHERE d.distStatementId = :distStatementId"),
    @NamedQuery(name = "DmRequestPhases.findByDistRequestId", query = "SELECT d FROM DmRequestPhases d WHERE d.distRequestId = :distRequestId"),
    @NamedQuery(name = "DmRequestPhases.findById", query = "SELECT d FROM DmRequestPhases d WHERE d.id = :id"),
    @NamedQuery(name = "DmRequestPhases.findByStartTime", query = "SELECT d FROM DmRequestPhases d WHERE d.startTime = :startTime"),
    @NamedQuery(name = "DmRequestPhases.findByEndTime", query = "SELECT d FROM DmRequestPhases d WHERE d.endTime = :endTime"),
    @NamedQuery(name = "DmRequestPhases.findByTotalElapsedTimeMs", query = "SELECT d FROM DmRequestPhases d WHERE d.totalElapsedTimeMs = :totalElapsedTimeMs"),
    @NamedQuery(name = "DmRequestPhases.findByMinTimeMs", query = "SELECT d FROM DmRequestPhases d WHERE d.minTimeMs = :minTimeMs"),
    @NamedQuery(name = "DmRequestPhases.findByMaxTimeMs", query = "SELECT d FROM DmRequestPhases d WHERE d.maxTimeMs = :maxTimeMs"),
    @NamedQuery(name = "DmRequestPhases.findByAvgTimeMs", query = "SELECT d FROM DmRequestPhases d WHERE d.avgTimeMs = :avgTimeMs"),
    @NamedQuery(name = "DmRequestPhases.findByStdevTimeMs", query = "SELECT d FROM DmRequestPhases d WHERE d.stdevTimeMs = :stdevTimeMs"),
    @NamedQuery(name = "DmRequestPhases.findByInputDop", query = "SELECT d FROM DmRequestPhases d WHERE d.inputDop = :inputDop"),
    @NamedQuery(name = "DmRequestPhases.findByOutputDop", query = "SELECT d FROM DmRequestPhases d WHERE d.outputDop = :outputDop"),
    @NamedQuery(name = "DmRequestPhases.findByStateDesc", query = "SELECT d FROM DmRequestPhases d WHERE d.stateDesc = :stateDesc"),
    @NamedQuery(name = "DmRequestPhases.findByTotalBytesProcessed", query = "SELECT d FROM DmRequestPhases d WHERE d.totalBytesProcessed = :totalBytesProcessed"),
    @NamedQuery(name = "DmRequestPhases.findByOperationType", query = "SELECT d FROM DmRequestPhases d WHERE d.operationType = :operationType"),
    @NamedQuery(name = "DmRequestPhases.findByTaskRetries", query = "SELECT d FROM DmRequestPhases d WHERE d.taskRetries = :taskRetries"),
    @NamedQuery(name = "DmRequestPhases.findByParentIds", query = "SELECT d FROM DmRequestPhases d WHERE d.parentIds = :parentIds"),
    @NamedQuery(name = "DmRequestPhases.findByMinRows", query = "SELECT d FROM DmRequestPhases d WHERE d.minRows = :minRows"),
    @NamedQuery(name = "DmRequestPhases.findByMaxRows", query = "SELECT d FROM DmRequestPhases d WHERE d.maxRows = :maxRows"),
    @NamedQuery(name = "DmRequestPhases.findByAvgRows", query = "SELECT d FROM DmRequestPhases d WHERE d.avgRows = :avgRows"),
    @NamedQuery(name = "DmRequestPhases.findByStdevRows", query = "SELECT d FROM DmRequestPhases d WHERE d.stdevRows = :stdevRows"),
    @NamedQuery(name = "DmRequestPhases.findByTotalRows", query = "SELECT d FROM DmRequestPhases d WHERE d.totalRows = :totalRows"),
    @NamedQuery(name = "DmRequestPhases.findByErrorId", query = "SELECT d FROM DmRequestPhases d WHERE d.errorId = :errorId")})
public class DmRequestPhases implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "dist_statement_id")
    private String distStatementId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "dist_request_id")
    private String distRequestId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "id")
    private String id;
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "end_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "total_elapsed_time_ms")
    private BigInteger totalElapsedTimeMs;
    @Column(name = "min_time_ms")
    private BigInteger minTimeMs;
    @Column(name = "max_time_ms")
    private BigInteger maxTimeMs;
    @Column(name = "avg_time_ms")
    private BigInteger avgTimeMs;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "stdev_time_ms")
    private Double stdevTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "input_dop")
    private int inputDop;
    @Basic(optional = false)
    @NotNull
    @Column(name = "output_dop")
    private int outputDop;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "state_desc")
    private String stateDesc;
    @Column(name = "total_bytes_processed")
    private BigInteger totalBytesProcessed;
    @Size(max = 30)
    @Column(name = "operation_type")
    private String operationType;
    @Column(name = "task_retries")
    private Integer taskRetries;
    @Size(max = 30)
    @Column(name = "parent_ids")
    private String parentIds;
    @Column(name = "min_rows")
    private BigInteger minRows;
    @Column(name = "max_rows")
    private BigInteger maxRows;
    @Column(name = "avg_rows")
    private BigInteger avgRows;
    @Column(name = "stdev_rows")
    private Double stdevRows;
    @Column(name = "total_rows")
    private BigInteger totalRows;
    @Size(max = 30)
    @Column(name = "error_id")
    private String errorId;

    public DmRequestPhases() {
    }

    public String getDistStatementId() {
        return distStatementId;
    }

    public void setDistStatementId(String distStatementId) {
        this.distStatementId = distStatementId;
    }

    public String getDistRequestId() {
        return distRequestId;
    }

    public void setDistRequestId(String distRequestId) {
        this.distRequestId = distRequestId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public BigInteger getTotalElapsedTimeMs() {
        return totalElapsedTimeMs;
    }

    public void setTotalElapsedTimeMs(BigInteger totalElapsedTimeMs) {
        this.totalElapsedTimeMs = totalElapsedTimeMs;
    }

    public BigInteger getMinTimeMs() {
        return minTimeMs;
    }

    public void setMinTimeMs(BigInteger minTimeMs) {
        this.minTimeMs = minTimeMs;
    }

    public BigInteger getMaxTimeMs() {
        return maxTimeMs;
    }

    public void setMaxTimeMs(BigInteger maxTimeMs) {
        this.maxTimeMs = maxTimeMs;
    }

    public BigInteger getAvgTimeMs() {
        return avgTimeMs;
    }

    public void setAvgTimeMs(BigInteger avgTimeMs) {
        this.avgTimeMs = avgTimeMs;
    }

    public Double getStdevTimeMs() {
        return stdevTimeMs;
    }

    public void setStdevTimeMs(Double stdevTimeMs) {
        this.stdevTimeMs = stdevTimeMs;
    }

    public int getInputDop() {
        return inputDop;
    }

    public void setInputDop(int inputDop) {
        this.inputDop = inputDop;
    }

    public int getOutputDop() {
        return outputDop;
    }

    public void setOutputDop(int outputDop) {
        this.outputDop = outputDop;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public BigInteger getTotalBytesProcessed() {
        return totalBytesProcessed;
    }

    public void setTotalBytesProcessed(BigInteger totalBytesProcessed) {
        this.totalBytesProcessed = totalBytesProcessed;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Integer getTaskRetries() {
        return taskRetries;
    }

    public void setTaskRetries(Integer taskRetries) {
        this.taskRetries = taskRetries;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public BigInteger getMinRows() {
        return minRows;
    }

    public void setMinRows(BigInteger minRows) {
        this.minRows = minRows;
    }

    public BigInteger getMaxRows() {
        return maxRows;
    }

    public void setMaxRows(BigInteger maxRows) {
        this.maxRows = maxRows;
    }

    public BigInteger getAvgRows() {
        return avgRows;
    }

    public void setAvgRows(BigInteger avgRows) {
        this.avgRows = avgRows;
    }

    public Double getStdevRows() {
        return stdevRows;
    }

    public void setStdevRows(Double stdevRows) {
        this.stdevRows = stdevRows;
    }

    public BigInteger getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(BigInteger totalRows) {
        this.totalRows = totalRows;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }
    
}
