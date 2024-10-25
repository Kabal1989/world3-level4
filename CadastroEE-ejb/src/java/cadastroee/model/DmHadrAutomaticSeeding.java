/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
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
@Table(name = "dm_hadr_automatic_seeding")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrAutomaticSeeding.findAll", query = "SELECT d FROM DmHadrAutomaticSeeding d"),
    @NamedQuery(name = "DmHadrAutomaticSeeding.findByStartTime", query = "SELECT d FROM DmHadrAutomaticSeeding d WHERE d.startTime = :startTime"),
    @NamedQuery(name = "DmHadrAutomaticSeeding.findByCompletionTime", query = "SELECT d FROM DmHadrAutomaticSeeding d WHERE d.completionTime = :completionTime"),
    @NamedQuery(name = "DmHadrAutomaticSeeding.findByAgId", query = "SELECT d FROM DmHadrAutomaticSeeding d WHERE d.agId = :agId"),
    @NamedQuery(name = "DmHadrAutomaticSeeding.findByAgDbId", query = "SELECT d FROM DmHadrAutomaticSeeding d WHERE d.agDbId = :agDbId"),
    @NamedQuery(name = "DmHadrAutomaticSeeding.findByAgRemoteReplicaId", query = "SELECT d FROM DmHadrAutomaticSeeding d WHERE d.agRemoteReplicaId = :agRemoteReplicaId"),
    @NamedQuery(name = "DmHadrAutomaticSeeding.findByOperationId", query = "SELECT d FROM DmHadrAutomaticSeeding d WHERE d.operationId = :operationId"),
    @NamedQuery(name = "DmHadrAutomaticSeeding.findByIsSource", query = "SELECT d FROM DmHadrAutomaticSeeding d WHERE d.isSource = :isSource"),
    @NamedQuery(name = "DmHadrAutomaticSeeding.findByCurrentState", query = "SELECT d FROM DmHadrAutomaticSeeding d WHERE d.currentState = :currentState"),
    @NamedQuery(name = "DmHadrAutomaticSeeding.findByPerformedSeeding", query = "SELECT d FROM DmHadrAutomaticSeeding d WHERE d.performedSeeding = :performedSeeding"),
    @NamedQuery(name = "DmHadrAutomaticSeeding.findByFailureState", query = "SELECT d FROM DmHadrAutomaticSeeding d WHERE d.failureState = :failureState"),
    @NamedQuery(name = "DmHadrAutomaticSeeding.findByFailureStateDesc", query = "SELECT d FROM DmHadrAutomaticSeeding d WHERE d.failureStateDesc = :failureStateDesc"),
    @NamedQuery(name = "DmHadrAutomaticSeeding.findByErrorCode", query = "SELECT d FROM DmHadrAutomaticSeeding d WHERE d.errorCode = :errorCode"),
    @NamedQuery(name = "DmHadrAutomaticSeeding.findByNumberOfAttempts", query = "SELECT d FROM DmHadrAutomaticSeeding d WHERE d.numberOfAttempts = :numberOfAttempts")})
public class DmHadrAutomaticSeeding implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "completion_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date completionTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "ag_id")
    private String agId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "ag_db_id")
    private String agDbId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "ag_remote_replica_id")
    private String agRemoteReplicaId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "operation_id")
    private String operationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_source")
    private boolean isSource;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "current_state")
    private String currentState;
    @Basic(optional = false)
    @NotNull
    @Column(name = "performed_seeding")
    private boolean performedSeeding;
    @Column(name = "failure_state")
    private Integer failureState;
    @Size(max = 4000)
    @Column(name = "failure_state_desc")
    private String failureStateDesc;
    @Column(name = "error_code")
    private Integer errorCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "number_of_attempts")
    private int numberOfAttempts;

    public DmHadrAutomaticSeeding() {
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(Date completionTime) {
        this.completionTime = completionTime;
    }

    public String getAgId() {
        return agId;
    }

    public void setAgId(String agId) {
        this.agId = agId;
    }

    public String getAgDbId() {
        return agDbId;
    }

    public void setAgDbId(String agDbId) {
        this.agDbId = agDbId;
    }

    public String getAgRemoteReplicaId() {
        return agRemoteReplicaId;
    }

    public void setAgRemoteReplicaId(String agRemoteReplicaId) {
        this.agRemoteReplicaId = agRemoteReplicaId;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public boolean getIsSource() {
        return isSource;
    }

    public void setIsSource(boolean isSource) {
        this.isSource = isSource;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public boolean getPerformedSeeding() {
        return performedSeeding;
    }

    public void setPerformedSeeding(boolean performedSeeding) {
        this.performedSeeding = performedSeeding;
    }

    public Integer getFailureState() {
        return failureState;
    }

    public void setFailureState(Integer failureState) {
        this.failureState = failureState;
    }

    public String getFailureStateDesc() {
        return failureStateDesc;
    }

    public void setFailureStateDesc(String failureStateDesc) {
        this.failureStateDesc = failureStateDesc;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void setNumberOfAttempts(int numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }
    
}
