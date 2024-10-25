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
@Table(name = "dm_exec_distributed_sql_requests")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecDistributedSqlRequests.findAll", query = "SELECT d FROM DmExecDistributedSqlRequests d"),
    @NamedQuery(name = "DmExecDistributedSqlRequests.findByExecutionId", query = "SELECT d FROM DmExecDistributedSqlRequests d WHERE d.executionId = :executionId"),
    @NamedQuery(name = "DmExecDistributedSqlRequests.findByStepIndex", query = "SELECT d FROM DmExecDistributedSqlRequests d WHERE d.stepIndex = :stepIndex"),
    @NamedQuery(name = "DmExecDistributedSqlRequests.findByComputeNodeId", query = "SELECT d FROM DmExecDistributedSqlRequests d WHERE d.computeNodeId = :computeNodeId"),
    @NamedQuery(name = "DmExecDistributedSqlRequests.findByDistributionId", query = "SELECT d FROM DmExecDistributedSqlRequests d WHERE d.distributionId = :distributionId"),
    @NamedQuery(name = "DmExecDistributedSqlRequests.findByStatus", query = "SELECT d FROM DmExecDistributedSqlRequests d WHERE d.status = :status"),
    @NamedQuery(name = "DmExecDistributedSqlRequests.findByErrorId", query = "SELECT d FROM DmExecDistributedSqlRequests d WHERE d.errorId = :errorId"),
    @NamedQuery(name = "DmExecDistributedSqlRequests.findByStartTime", query = "SELECT d FROM DmExecDistributedSqlRequests d WHERE d.startTime = :startTime"),
    @NamedQuery(name = "DmExecDistributedSqlRequests.findByEndTime", query = "SELECT d FROM DmExecDistributedSqlRequests d WHERE d.endTime = :endTime"),
    @NamedQuery(name = "DmExecDistributedSqlRequests.findByTotalElapsedTime", query = "SELECT d FROM DmExecDistributedSqlRequests d WHERE d.totalElapsedTime = :totalElapsedTime"),
    @NamedQuery(name = "DmExecDistributedSqlRequests.findByRowCount", query = "SELECT d FROM DmExecDistributedSqlRequests d WHERE d.rowCount = :rowCount"),
    @NamedQuery(name = "DmExecDistributedSqlRequests.findBySpid", query = "SELECT d FROM DmExecDistributedSqlRequests d WHERE d.spid = :spid"),
    @NamedQuery(name = "DmExecDistributedSqlRequests.findByCommand", query = "SELECT d FROM DmExecDistributedSqlRequests d WHERE d.command = :command"),
    @NamedQuery(name = "DmExecDistributedSqlRequests.findByComputePoolId", query = "SELECT d FROM DmExecDistributedSqlRequests d WHERE d.computePoolId = :computePoolId")})
public class DmExecDistributedSqlRequests implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 32)
    @Column(name = "execution_id")
    private String executionId;
    @Column(name = "step_index")
    private Integer stepIndex;
    @Column(name = "compute_node_id")
    private Integer computeNodeId;
    @Column(name = "distribution_id")
    private Integer distributionId;
    @Size(max = 32)
    @Column(name = "status")
    private String status;
    @Size(max = 36)
    @Column(name = "error_id")
    private String errorId;
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "end_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "total_elapsed_time")
    private Integer totalElapsedTime;
    @Column(name = "row_count")
    private BigInteger rowCount;
    @Column(name = "spid")
    private Integer spid;
    @Size(max = 4000)
    @Column(name = "command")
    private String command;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compute_pool_id")
    private int computePoolId;

    public DmExecDistributedSqlRequests() {
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public Integer getStepIndex() {
        return stepIndex;
    }

    public void setStepIndex(Integer stepIndex) {
        this.stepIndex = stepIndex;
    }

    public Integer getComputeNodeId() {
        return computeNodeId;
    }

    public void setComputeNodeId(Integer computeNodeId) {
        this.computeNodeId = computeNodeId;
    }

    public Integer getDistributionId() {
        return distributionId;
    }

    public void setDistributionId(Integer distributionId) {
        this.distributionId = distributionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
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

    public Integer getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(Integer totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public BigInteger getRowCount() {
        return rowCount;
    }

    public void setRowCount(BigInteger rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public int getComputePoolId() {
        return computePoolId;
    }

    public void setComputePoolId(int computePoolId) {
        this.computePoolId = computePoolId;
    }
    
}
