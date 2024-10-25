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
@Table(name = "dm_db_column_store_row_group_physical_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findAll", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByObjectId", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByIndexId", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.indexId = :indexId"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByPartitionNumber", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.partitionNumber = :partitionNumber"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByRowGroupId", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.rowGroupId = :rowGroupId"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByDeltaStoreHobtId", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.deltaStoreHobtId = :deltaStoreHobtId"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByState", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.state = :state"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByStateDesc", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.stateDesc = :stateDesc"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByTotalRows", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.totalRows = :totalRows"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByDeletedRows", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.deletedRows = :deletedRows"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findBySizeInBytes", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.sizeInBytes = :sizeInBytes"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByTrimReason", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.trimReason = :trimReason"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByTrimReasonDesc", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.trimReasonDesc = :trimReasonDesc"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByTransitionToCompressedState", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.transitionToCompressedState = :transitionToCompressedState"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByTransitionToCompressedStateDesc", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.transitionToCompressedStateDesc = :transitionToCompressedStateDesc"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByHasVertipaqOptimization", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.hasVertipaqOptimization = :hasVertipaqOptimization"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByGeneration", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.generation = :generation"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByCreatedTime", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.createdTime = :createdTime"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupPhysicalStats.findByClosedTime", query = "SELECT d FROM DmDbColumnStoreRowGroupPhysicalStats d WHERE d.closedTime = :closedTime")})
public class DmDbColumnStoreRowGroupPhysicalStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "object_id")
    private Integer objectId;
    @Column(name = "index_id")
    private Integer indexId;
    @Column(name = "partition_number")
    private Integer partitionNumber;
    @Column(name = "row_group_id")
    private Integer rowGroupId;
    @Column(name = "delta_store_hobt_id")
    private BigInteger deltaStoreHobtId;
    @Column(name = "state")
    private Short state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "state_desc")
    private String stateDesc;
    @Column(name = "total_rows")
    private BigInteger totalRows;
    @Column(name = "deleted_rows")
    private BigInteger deletedRows;
    @Column(name = "size_in_bytes")
    private BigInteger sizeInBytes;
    @Column(name = "trim_reason")
    private Short trimReason;
    @Size(max = 60)
    @Column(name = "trim_reason_desc")
    private String trimReasonDesc;
    @Column(name = "transition_to_compressed_state")
    private Short transitionToCompressedState;
    @Size(max = 60)
    @Column(name = "transition_to_compressed_state_desc")
    private String transitionToCompressedStateDesc;
    @Column(name = "has_vertipaq_optimization")
    private Boolean hasVertipaqOptimization;
    @Column(name = "generation")
    private BigInteger generation;
    @Column(name = "created_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @Column(name = "closed_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date closedTime;

    public DmDbColumnStoreRowGroupPhysicalStats() {
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public Integer getPartitionNumber() {
        return partitionNumber;
    }

    public void setPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    public Integer getRowGroupId() {
        return rowGroupId;
    }

    public void setRowGroupId(Integer rowGroupId) {
        this.rowGroupId = rowGroupId;
    }

    public BigInteger getDeltaStoreHobtId() {
        return deltaStoreHobtId;
    }

    public void setDeltaStoreHobtId(BigInteger deltaStoreHobtId) {
        this.deltaStoreHobtId = deltaStoreHobtId;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public BigInteger getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(BigInteger totalRows) {
        this.totalRows = totalRows;
    }

    public BigInteger getDeletedRows() {
        return deletedRows;
    }

    public void setDeletedRows(BigInteger deletedRows) {
        this.deletedRows = deletedRows;
    }

    public BigInteger getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(BigInteger sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public Short getTrimReason() {
        return trimReason;
    }

    public void setTrimReason(Short trimReason) {
        this.trimReason = trimReason;
    }

    public String getTrimReasonDesc() {
        return trimReasonDesc;
    }

    public void setTrimReasonDesc(String trimReasonDesc) {
        this.trimReasonDesc = trimReasonDesc;
    }

    public Short getTransitionToCompressedState() {
        return transitionToCompressedState;
    }

    public void setTransitionToCompressedState(Short transitionToCompressedState) {
        this.transitionToCompressedState = transitionToCompressedState;
    }

    public String getTransitionToCompressedStateDesc() {
        return transitionToCompressedStateDesc;
    }

    public void setTransitionToCompressedStateDesc(String transitionToCompressedStateDesc) {
        this.transitionToCompressedStateDesc = transitionToCompressedStateDesc;
    }

    public Boolean getHasVertipaqOptimization() {
        return hasVertipaqOptimization;
    }

    public void setHasVertipaqOptimization(Boolean hasVertipaqOptimization) {
        this.hasVertipaqOptimization = hasVertipaqOptimization;
    }

    public BigInteger getGeneration() {
        return generation;
    }

    public void setGeneration(BigInteger generation) {
        this.generation = generation;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getClosedTime() {
        return closedTime;
    }

    public void setClosedTime(Date closedTime) {
        this.closedTime = closedTime;
    }
    
}
