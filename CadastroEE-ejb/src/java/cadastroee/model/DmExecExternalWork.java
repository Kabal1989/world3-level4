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
@Table(name = "dm_exec_external_work")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecExternalWork.findAll", query = "SELECT d FROM DmExecExternalWork d"),
    @NamedQuery(name = "DmExecExternalWork.findByExecutionId", query = "SELECT d FROM DmExecExternalWork d WHERE d.executionId = :executionId"),
    @NamedQuery(name = "DmExecExternalWork.findByStepIndex", query = "SELECT d FROM DmExecExternalWork d WHERE d.stepIndex = :stepIndex"),
    @NamedQuery(name = "DmExecExternalWork.findByDmsStepIndex", query = "SELECT d FROM DmExecExternalWork d WHERE d.dmsStepIndex = :dmsStepIndex"),
    @NamedQuery(name = "DmExecExternalWork.findByWorkId", query = "SELECT d FROM DmExecExternalWork d WHERE d.workId = :workId"),
    @NamedQuery(name = "DmExecExternalWork.findByComputeNodeId", query = "SELECT d FROM DmExecExternalWork d WHERE d.computeNodeId = :computeNodeId"),
    @NamedQuery(name = "DmExecExternalWork.findByType", query = "SELECT d FROM DmExecExternalWork d WHERE d.type = :type"),
    @NamedQuery(name = "DmExecExternalWork.findByInputName", query = "SELECT d FROM DmExecExternalWork d WHERE d.inputName = :inputName"),
    @NamedQuery(name = "DmExecExternalWork.findByReadLocation", query = "SELECT d FROM DmExecExternalWork d WHERE d.readLocation = :readLocation"),
    @NamedQuery(name = "DmExecExternalWork.findByReadCommand", query = "SELECT d FROM DmExecExternalWork d WHERE d.readCommand = :readCommand"),
    @NamedQuery(name = "DmExecExternalWork.findByBytesProcessed", query = "SELECT d FROM DmExecExternalWork d WHERE d.bytesProcessed = :bytesProcessed"),
    @NamedQuery(name = "DmExecExternalWork.findByLength", query = "SELECT d FROM DmExecExternalWork d WHERE d.length = :length"),
    @NamedQuery(name = "DmExecExternalWork.findByStartTime", query = "SELECT d FROM DmExecExternalWork d WHERE d.startTime = :startTime"),
    @NamedQuery(name = "DmExecExternalWork.findByEndTime", query = "SELECT d FROM DmExecExternalWork d WHERE d.endTime = :endTime"),
    @NamedQuery(name = "DmExecExternalWork.findByTotalElapsedTime", query = "SELECT d FROM DmExecExternalWork d WHERE d.totalElapsedTime = :totalElapsedTime"),
    @NamedQuery(name = "DmExecExternalWork.findByStatus", query = "SELECT d FROM DmExecExternalWork d WHERE d.status = :status"),
    @NamedQuery(name = "DmExecExternalWork.findByComputePoolId", query = "SELECT d FROM DmExecExternalWork d WHERE d.computePoolId = :computePoolId")})
public class DmExecExternalWork implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 32)
    @Column(name = "execution_id")
    private String executionId;
    @Column(name = "step_index")
    private Integer stepIndex;
    @Column(name = "dms_step_index")
    private Integer dmsStepIndex;
    @Column(name = "work_id")
    private Integer workId;
    @Column(name = "compute_node_id")
    private Integer computeNodeId;
    @Size(max = 60)
    @Column(name = "type")
    private String type;
    @Size(max = 4000)
    @Column(name = "input_name")
    private String inputName;
    @Column(name = "read_location")
    private BigInteger readLocation;
    @Size(max = 4000)
    @Column(name = "read_command")
    private String readCommand;
    @Column(name = "bytes_processed")
    private BigInteger bytesProcessed;
    @Column(name = "length")
    private BigInteger length;
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "end_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "total_elapsed_time")
    private Integer totalElapsedTime;
    @Size(max = 32)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compute_pool_id")
    private int computePoolId;

    public DmExecExternalWork() {
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

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Integer getComputeNodeId() {
        return computeNodeId;
    }

    public void setComputeNodeId(Integer computeNodeId) {
        this.computeNodeId = computeNodeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public BigInteger getReadLocation() {
        return readLocation;
    }

    public void setReadLocation(BigInteger readLocation) {
        this.readLocation = readLocation;
    }

    public String getReadCommand() {
        return readCommand;
    }

    public void setReadCommand(String readCommand) {
        this.readCommand = readCommand;
    }

    public BigInteger getBytesProcessed() {
        return bytesProcessed;
    }

    public void setBytesProcessed(BigInteger bytesProcessed) {
        this.bytesProcessed = bytesProcessed;
    }

    public BigInteger getLength() {
        return length;
    }

    public void setLength(BigInteger length) {
        this.length = length;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getComputePoolId() {
        return computePoolId;
    }

    public void setComputePoolId(int computePoolId) {
        this.computePoolId = computePoolId;
    }
    
}
