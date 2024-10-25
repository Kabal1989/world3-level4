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
@Table(name = "dm_exec_dms_workers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecDmsWorkers.findAll", query = "SELECT d FROM DmExecDmsWorkers d"),
    @NamedQuery(name = "DmExecDmsWorkers.findByExecutionId", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.executionId = :executionId"),
    @NamedQuery(name = "DmExecDmsWorkers.findByStepIndex", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.stepIndex = :stepIndex"),
    @NamedQuery(name = "DmExecDmsWorkers.findByDmsStepIndex", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.dmsStepIndex = :dmsStepIndex"),
    @NamedQuery(name = "DmExecDmsWorkers.findByComputeNodeId", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.computeNodeId = :computeNodeId"),
    @NamedQuery(name = "DmExecDmsWorkers.findByDistributionId", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.distributionId = :distributionId"),
    @NamedQuery(name = "DmExecDmsWorkers.findByType", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.type = :type"),
    @NamedQuery(name = "DmExecDmsWorkers.findByStatus", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.status = :status"),
    @NamedQuery(name = "DmExecDmsWorkers.findByBytesPerSec", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.bytesPerSec = :bytesPerSec"),
    @NamedQuery(name = "DmExecDmsWorkers.findByBytesProcessed", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.bytesProcessed = :bytesProcessed"),
    @NamedQuery(name = "DmExecDmsWorkers.findByRowsProcessed", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.rowsProcessed = :rowsProcessed"),
    @NamedQuery(name = "DmExecDmsWorkers.findByStartTime", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.startTime = :startTime"),
    @NamedQuery(name = "DmExecDmsWorkers.findByEndTime", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.endTime = :endTime"),
    @NamedQuery(name = "DmExecDmsWorkers.findByTotalElapsedTime", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.totalElapsedTime = :totalElapsedTime"),
    @NamedQuery(name = "DmExecDmsWorkers.findByCpuTime", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.cpuTime = :cpuTime"),
    @NamedQuery(name = "DmExecDmsWorkers.findByQueryTime", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.queryTime = :queryTime"),
    @NamedQuery(name = "DmExecDmsWorkers.findByBuffersAvailable", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.buffersAvailable = :buffersAvailable"),
    @NamedQuery(name = "DmExecDmsWorkers.findByDmsCpid", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.dmsCpid = :dmsCpid"),
    @NamedQuery(name = "DmExecDmsWorkers.findBySqlSpid", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.sqlSpid = :sqlSpid"),
    @NamedQuery(name = "DmExecDmsWorkers.findByErrorId", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.errorId = :errorId"),
    @NamedQuery(name = "DmExecDmsWorkers.findBySourceInfo", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.sourceInfo = :sourceInfo"),
    @NamedQuery(name = "DmExecDmsWorkers.findByDestinationInfo", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.destinationInfo = :destinationInfo"),
    @NamedQuery(name = "DmExecDmsWorkers.findByCommand", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.command = :command"),
    @NamedQuery(name = "DmExecDmsWorkers.findByComputePoolId", query = "SELECT d FROM DmExecDmsWorkers d WHERE d.computePoolId = :computePoolId")})
public class DmExecDmsWorkers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 32)
    @Column(name = "execution_id")
    private String executionId;
    @Column(name = "step_index")
    private Integer stepIndex;
    @Column(name = "dms_step_index")
    private Integer dmsStepIndex;
    @Column(name = "compute_node_id")
    private Integer computeNodeId;
    @Column(name = "distribution_id")
    private Integer distributionId;
    @Size(max = 32)
    @Column(name = "type")
    private String type;
    @Size(max = 32)
    @Column(name = "status")
    private String status;
    @Column(name = "bytes_per_sec")
    private BigInteger bytesPerSec;
    @Column(name = "bytes_processed")
    private BigInteger bytesProcessed;
    @Column(name = "rows_processed")
    private BigInteger rowsProcessed;
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "end_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "total_elapsed_time")
    private Integer totalElapsedTime;
    @Column(name = "cpu_time")
    private BigInteger cpuTime;
    @Column(name = "query_time")
    private Integer queryTime;
    @Column(name = "buffers_available")
    private Integer buffersAvailable;
    @Column(name = "dms_cpid")
    private Integer dmsCpid;
    @Column(name = "sql_spid")
    private Integer sqlSpid;
    @Size(max = 36)
    @Column(name = "error_id")
    private String errorId;
    @Size(max = 4000)
    @Column(name = "source_info")
    private String sourceInfo;
    @Size(max = 4000)
    @Column(name = "destination_info")
    private String destinationInfo;
    @Size(max = 4000)
    @Column(name = "command")
    private String command;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compute_pool_id")
    private int computePoolId;

    public DmExecDmsWorkers() {
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

    public Integer getDmsStepIndex() {
        return dmsStepIndex;
    }

    public void setDmsStepIndex(Integer dmsStepIndex) {
        this.dmsStepIndex = dmsStepIndex;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigInteger getBytesPerSec() {
        return bytesPerSec;
    }

    public void setBytesPerSec(BigInteger bytesPerSec) {
        this.bytesPerSec = bytesPerSec;
    }

    public BigInteger getBytesProcessed() {
        return bytesProcessed;
    }

    public void setBytesProcessed(BigInteger bytesProcessed) {
        this.bytesProcessed = bytesProcessed;
    }

    public BigInteger getRowsProcessed() {
        return rowsProcessed;
    }

    public void setRowsProcessed(BigInteger rowsProcessed) {
        this.rowsProcessed = rowsProcessed;
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

    public BigInteger getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(BigInteger cpuTime) {
        this.cpuTime = cpuTime;
    }

    public Integer getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Integer queryTime) {
        this.queryTime = queryTime;
    }

    public Integer getBuffersAvailable() {
        return buffersAvailable;
    }

    public void setBuffersAvailable(Integer buffersAvailable) {
        this.buffersAvailable = buffersAvailable;
    }

    public Integer getDmsCpid() {
        return dmsCpid;
    }

    public void setDmsCpid(Integer dmsCpid) {
        this.dmsCpid = dmsCpid;
    }

    public Integer getSqlSpid() {
        return sqlSpid;
    }

    public void setSqlSpid(Integer sqlSpid) {
        this.sqlSpid = sqlSpid;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public String getSourceInfo() {
        return sourceInfo;
    }

    public void setSourceInfo(String sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    public String getDestinationInfo() {
        return destinationInfo;
    }

    public void setDestinationInfo(String destinationInfo) {
        this.destinationInfo = destinationInfo;
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
