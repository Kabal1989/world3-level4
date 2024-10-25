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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_request_phases_task_group_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmRequestPhasesTaskGroupStats.findAll", query = "SELECT d FROM DmRequestPhasesTaskGroupStats d"),
    @NamedQuery(name = "DmRequestPhasesTaskGroupStats.findByDistRequestId", query = "SELECT d FROM DmRequestPhasesTaskGroupStats d WHERE d.distRequestId = :distRequestId"),
    @NamedQuery(name = "DmRequestPhasesTaskGroupStats.findById", query = "SELECT d FROM DmRequestPhasesTaskGroupStats d WHERE d.id = :id"),
    @NamedQuery(name = "DmRequestPhasesTaskGroupStats.findByDistStatementId", query = "SELECT d FROM DmRequestPhasesTaskGroupStats d WHERE d.distStatementId = :distStatementId"),
    @NamedQuery(name = "DmRequestPhasesTaskGroupStats.findByStateDesc", query = "SELECT d FROM DmRequestPhasesTaskGroupStats d WHERE d.stateDesc = :stateDesc"),
    @NamedQuery(name = "DmRequestPhasesTaskGroupStats.findByStartTime", query = "SELECT d FROM DmRequestPhasesTaskGroupStats d WHERE d.startTime = :startTime"),
    @NamedQuery(name = "DmRequestPhasesTaskGroupStats.findByEndTime", query = "SELECT d FROM DmRequestPhasesTaskGroupStats d WHERE d.endTime = :endTime"),
    @NamedQuery(name = "DmRequestPhasesTaskGroupStats.findByInputDop", query = "SELECT d FROM DmRequestPhasesTaskGroupStats d WHERE d.inputDop = :inputDop"),
    @NamedQuery(name = "DmRequestPhasesTaskGroupStats.findByOutputDop", query = "SELECT d FROM DmRequestPhasesTaskGroupStats d WHERE d.outputDop = :outputDop"),
    @NamedQuery(name = "DmRequestPhasesTaskGroupStats.findByOperationType", query = "SELECT d FROM DmRequestPhasesTaskGroupStats d WHERE d.operationType = :operationType"),
    @NamedQuery(name = "DmRequestPhasesTaskGroupStats.findByTaskRetries", query = "SELECT d FROM DmRequestPhasesTaskGroupStats d WHERE d.taskRetries = :taskRetries"),
    @NamedQuery(name = "DmRequestPhasesTaskGroupStats.findByParentIds", query = "SELECT d FROM DmRequestPhasesTaskGroupStats d WHERE d.parentIds = :parentIds")})
public class DmRequestPhasesTaskGroupStats implements Serializable {

    private static final long serialVersionUID = 1L;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "dist_statement_id")
    private String distStatementId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "state_desc")
    private String stateDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_time")
    private long startTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "end_time")
    private long endTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "input_dop")
    private int inputDop;
    @Basic(optional = false)
    @NotNull
    @Column(name = "output_dop")
    private int outputDop;
    @Size(max = 30)
    @Column(name = "operation_type")
    private String operationType;
    @Column(name = "task_retries")
    private Integer taskRetries;
    @Size(max = 30)
    @Column(name = "parent_ids")
    private String parentIds;

    public DmRequestPhasesTaskGroupStats() {
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

    public String getDistStatementId() {
        return distStatementId;
    }

    public void setDistStatementId(String distStatementId) {
        this.distStatementId = distStatementId;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
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
    
}
