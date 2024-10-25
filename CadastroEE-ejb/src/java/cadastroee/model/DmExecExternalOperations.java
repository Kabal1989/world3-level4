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
@Table(name = "dm_exec_external_operations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecExternalOperations.findAll", query = "SELECT d FROM DmExecExternalOperations d"),
    @NamedQuery(name = "DmExecExternalOperations.findByExecutionId", query = "SELECT d FROM DmExecExternalOperations d WHERE d.executionId = :executionId"),
    @NamedQuery(name = "DmExecExternalOperations.findByStepIndex", query = "SELECT d FROM DmExecExternalOperations d WHERE d.stepIndex = :stepIndex"),
    @NamedQuery(name = "DmExecExternalOperations.findByOperationType", query = "SELECT d FROM DmExecExternalOperations d WHERE d.operationType = :operationType"),
    @NamedQuery(name = "DmExecExternalOperations.findByOperationName", query = "SELECT d FROM DmExecExternalOperations d WHERE d.operationName = :operationName"),
    @NamedQuery(name = "DmExecExternalOperations.findByMapProgress", query = "SELECT d FROM DmExecExternalOperations d WHERE d.mapProgress = :mapProgress"),
    @NamedQuery(name = "DmExecExternalOperations.findByReduceProgress", query = "SELECT d FROM DmExecExternalOperations d WHERE d.reduceProgress = :reduceProgress"),
    @NamedQuery(name = "DmExecExternalOperations.findByComputePoolId", query = "SELECT d FROM DmExecExternalOperations d WHERE d.computePoolId = :computePoolId")})
public class DmExecExternalOperations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 32)
    @Column(name = "execution_id")
    private String executionId;
    @Column(name = "step_index")
    private Integer stepIndex;
    @Size(max = 128)
    @Column(name = "operation_type")
    private String operationType;
    @Size(max = 4000)
    @Column(name = "operation_name")
    private String operationName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "map_progress")
    private Double mapProgress;
    @Column(name = "reduce_progress")
    private Double reduceProgress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compute_pool_id")
    private int computePoolId;

    public DmExecExternalOperations() {
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

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Double getMapProgress() {
        return mapProgress;
    }

    public void setMapProgress(Double mapProgress) {
        this.mapProgress = mapProgress;
    }

    public Double getReduceProgress() {
        return reduceProgress;
    }

    public void setReduceProgress(Double reduceProgress) {
        this.reduceProgress = reduceProgress;
    }

    public int getComputePoolId() {
        return computePoolId;
    }

    public void setComputePoolId(int computePoolId) {
        this.computePoolId = computePoolId;
    }
    
}
