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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_db_column_store_row_group_operational_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findAll", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findByObjectId", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findByIndexId", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d WHERE d.indexId = :indexId"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findByPartitionNumber", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d WHERE d.partitionNumber = :partitionNumber"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findByRowGroupId", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d WHERE d.rowGroupId = :rowGroupId"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findByIndexScanCount", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d WHERE d.indexScanCount = :indexScanCount"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findByScanCount", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d WHERE d.scanCount = :scanCount"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findByDeleteBufferScanCount", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d WHERE d.deleteBufferScanCount = :deleteBufferScanCount"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findByRowGroupLockCount", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d WHERE d.rowGroupLockCount = :rowGroupLockCount"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findByRowGroupLockWaitCount", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d WHERE d.rowGroupLockWaitCount = :rowGroupLockWaitCount"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findByRowGroupLockWaitInMs", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d WHERE d.rowGroupLockWaitInMs = :rowGroupLockWaitInMs"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findByReturnedRowCount", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d WHERE d.returnedRowCount = :returnedRowCount"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findByReturnedAggregateCount", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d WHERE d.returnedAggregateCount = :returnedAggregateCount"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findByReturnedGroupCount", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d WHERE d.returnedGroupCount = :returnedGroupCount"),
    @NamedQuery(name = "DmDbColumnStoreRowGroupOperationalStats.findByInputGroupbyRowCount", query = "SELECT d FROM DmDbColumnStoreRowGroupOperationalStats d WHERE d.inputGroupbyRowCount = :inputGroupbyRowCount")})
public class DmDbColumnStoreRowGroupOperationalStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_id")
    private int indexId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partition_number")
    private int partitionNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "row_group_id")
    private int rowGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_scan_count")
    private long indexScanCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scan_count")
    private long scanCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "delete_buffer_scan_count")
    private long deleteBufferScanCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "row_group_lock_count")
    private long rowGroupLockCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "row_group_lock_wait_count")
    private long rowGroupLockWaitCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "row_group_lock_wait_in_ms")
    private long rowGroupLockWaitInMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "returned_row_count")
    private long returnedRowCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "returned_aggregate_count")
    private long returnedAggregateCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "returned_group_count")
    private long returnedGroupCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "input_groupby_row_count")
    private long inputGroupbyRowCount;

    public DmDbColumnStoreRowGroupOperationalStats() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public int getPartitionNumber() {
        return partitionNumber;
    }

    public void setPartitionNumber(int partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    public int getRowGroupId() {
        return rowGroupId;
    }

    public void setRowGroupId(int rowGroupId) {
        this.rowGroupId = rowGroupId;
    }

    public long getIndexScanCount() {
        return indexScanCount;
    }

    public void setIndexScanCount(long indexScanCount) {
        this.indexScanCount = indexScanCount;
    }

    public long getScanCount() {
        return scanCount;
    }

    public void setScanCount(long scanCount) {
        this.scanCount = scanCount;
    }

    public long getDeleteBufferScanCount() {
        return deleteBufferScanCount;
    }

    public void setDeleteBufferScanCount(long deleteBufferScanCount) {
        this.deleteBufferScanCount = deleteBufferScanCount;
    }

    public long getRowGroupLockCount() {
        return rowGroupLockCount;
    }

    public void setRowGroupLockCount(long rowGroupLockCount) {
        this.rowGroupLockCount = rowGroupLockCount;
    }

    public long getRowGroupLockWaitCount() {
        return rowGroupLockWaitCount;
    }

    public void setRowGroupLockWaitCount(long rowGroupLockWaitCount) {
        this.rowGroupLockWaitCount = rowGroupLockWaitCount;
    }

    public long getRowGroupLockWaitInMs() {
        return rowGroupLockWaitInMs;
    }

    public void setRowGroupLockWaitInMs(long rowGroupLockWaitInMs) {
        this.rowGroupLockWaitInMs = rowGroupLockWaitInMs;
    }

    public long getReturnedRowCount() {
        return returnedRowCount;
    }

    public void setReturnedRowCount(long returnedRowCount) {
        this.returnedRowCount = returnedRowCount;
    }

    public long getReturnedAggregateCount() {
        return returnedAggregateCount;
    }

    public void setReturnedAggregateCount(long returnedAggregateCount) {
        this.returnedAggregateCount = returnedAggregateCount;
    }

    public long getReturnedGroupCount() {
        return returnedGroupCount;
    }

    public void setReturnedGroupCount(long returnedGroupCount) {
        this.returnedGroupCount = returnedGroupCount;
    }

    public long getInputGroupbyRowCount() {
        return inputGroupbyRowCount;
    }

    public void setInputGroupbyRowCount(long inputGroupbyRowCount) {
        this.inputGroupbyRowCount = inputGroupbyRowCount;
    }
    
}
