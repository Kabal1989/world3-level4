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
@Table(name = "dm_db_rda_schema_update_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbRdaSchemaUpdateStatus.findAll", query = "SELECT d FROM DmDbRdaSchemaUpdateStatus d"),
    @NamedQuery(name = "DmDbRdaSchemaUpdateStatus.findByTableId", query = "SELECT d FROM DmDbRdaSchemaUpdateStatus d WHERE d.tableId = :tableId"),
    @NamedQuery(name = "DmDbRdaSchemaUpdateStatus.findByDatabaseId", query = "SELECT d FROM DmDbRdaSchemaUpdateStatus d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmDbRdaSchemaUpdateStatus.findByTaskId", query = "SELECT d FROM DmDbRdaSchemaUpdateStatus d WHERE d.taskId = :taskId"),
    @NamedQuery(name = "DmDbRdaSchemaUpdateStatus.findByTaskType", query = "SELECT d FROM DmDbRdaSchemaUpdateStatus d WHERE d.taskType = :taskType"),
    @NamedQuery(name = "DmDbRdaSchemaUpdateStatus.findByTaskTypeDesc", query = "SELECT d FROM DmDbRdaSchemaUpdateStatus d WHERE d.taskTypeDesc = :taskTypeDesc"),
    @NamedQuery(name = "DmDbRdaSchemaUpdateStatus.findByTaskState", query = "SELECT d FROM DmDbRdaSchemaUpdateStatus d WHERE d.taskState = :taskState"),
    @NamedQuery(name = "DmDbRdaSchemaUpdateStatus.findByTaskStateDesc", query = "SELECT d FROM DmDbRdaSchemaUpdateStatus d WHERE d.taskStateDesc = :taskStateDesc"),
    @NamedQuery(name = "DmDbRdaSchemaUpdateStatus.findByStartTimeUtc", query = "SELECT d FROM DmDbRdaSchemaUpdateStatus d WHERE d.startTimeUtc = :startTimeUtc"),
    @NamedQuery(name = "DmDbRdaSchemaUpdateStatus.findByEndTimeUtc", query = "SELECT d FROM DmDbRdaSchemaUpdateStatus d WHERE d.endTimeUtc = :endTimeUtc"),
    @NamedQuery(name = "DmDbRdaSchemaUpdateStatus.findByErrorNumber", query = "SELECT d FROM DmDbRdaSchemaUpdateStatus d WHERE d.errorNumber = :errorNumber"),
    @NamedQuery(name = "DmDbRdaSchemaUpdateStatus.findByErrorSeverity", query = "SELECT d FROM DmDbRdaSchemaUpdateStatus d WHERE d.errorSeverity = :errorSeverity"),
    @NamedQuery(name = "DmDbRdaSchemaUpdateStatus.findByErrorState", query = "SELECT d FROM DmDbRdaSchemaUpdateStatus d WHERE d.errorState = :errorState")})
public class DmDbRdaSchemaUpdateStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "table_id")
    private Integer tableId;
    @Column(name = "database_id")
    private Integer databaseId;
    @Column(name = "task_id")
    private BigInteger taskId;
    @Column(name = "task_type")
    private Integer taskType;
    @Size(max = 60)
    @Column(name = "task_type_desc")
    private String taskTypeDesc;
    @Column(name = "task_state")
    private Integer taskState;
    @Size(max = 60)
    @Column(name = "task_state_desc")
    private String taskStateDesc;
    @Column(name = "start_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTimeUtc;
    @Column(name = "end_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTimeUtc;
    @Column(name = "error_number")
    private Integer errorNumber;
    @Column(name = "error_severity")
    private Integer errorSeverity;
    @Column(name = "error_state")
    private Integer errorState;

    public DmDbRdaSchemaUpdateStatus() {
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public BigInteger getTaskId() {
        return taskId;
    }

    public void setTaskId(BigInteger taskId) {
        this.taskId = taskId;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public String getTaskTypeDesc() {
        return taskTypeDesc;
    }

    public void setTaskTypeDesc(String taskTypeDesc) {
        this.taskTypeDesc = taskTypeDesc;
    }

    public Integer getTaskState() {
        return taskState;
    }

    public void setTaskState(Integer taskState) {
        this.taskState = taskState;
    }

    public String getTaskStateDesc() {
        return taskStateDesc;
    }

    public void setTaskStateDesc(String taskStateDesc) {
        this.taskStateDesc = taskStateDesc;
    }

    public Date getStartTimeUtc() {
        return startTimeUtc;
    }

    public void setStartTimeUtc(Date startTimeUtc) {
        this.startTimeUtc = startTimeUtc;
    }

    public Date getEndTimeUtc() {
        return endTimeUtc;
    }

    public void setEndTimeUtc(Date endTimeUtc) {
        this.endTimeUtc = endTimeUtc;
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
    
}
