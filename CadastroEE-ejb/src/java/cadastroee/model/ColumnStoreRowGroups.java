/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "column_store_row_groups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ColumnStoreRowGroups.findAll", query = "SELECT c FROM ColumnStoreRowGroups c"),
    @NamedQuery(name = "ColumnStoreRowGroups.findByObjectId", query = "SELECT c FROM ColumnStoreRowGroups c WHERE c.objectId = :objectId"),
    @NamedQuery(name = "ColumnStoreRowGroups.findByIndexId", query = "SELECT c FROM ColumnStoreRowGroups c WHERE c.indexId = :indexId"),
    @NamedQuery(name = "ColumnStoreRowGroups.findByPartitionNumber", query = "SELECT c FROM ColumnStoreRowGroups c WHERE c.partitionNumber = :partitionNumber"),
    @NamedQuery(name = "ColumnStoreRowGroups.findByRowGroupId", query = "SELECT c FROM ColumnStoreRowGroups c WHERE c.rowGroupId = :rowGroupId"),
    @NamedQuery(name = "ColumnStoreRowGroups.findByDeltaStoreHobtId", query = "SELECT c FROM ColumnStoreRowGroups c WHERE c.deltaStoreHobtId = :deltaStoreHobtId"),
    @NamedQuery(name = "ColumnStoreRowGroups.findByState", query = "SELECT c FROM ColumnStoreRowGroups c WHERE c.state = :state"),
    @NamedQuery(name = "ColumnStoreRowGroups.findByStateDescription", query = "SELECT c FROM ColumnStoreRowGroups c WHERE c.stateDescription = :stateDescription"),
    @NamedQuery(name = "ColumnStoreRowGroups.findByTotalRows", query = "SELECT c FROM ColumnStoreRowGroups c WHERE c.totalRows = :totalRows"),
    @NamedQuery(name = "ColumnStoreRowGroups.findByDeletedRows", query = "SELECT c FROM ColumnStoreRowGroups c WHERE c.deletedRows = :deletedRows"),
    @NamedQuery(name = "ColumnStoreRowGroups.findBySizeInBytes", query = "SELECT c FROM ColumnStoreRowGroups c WHERE c.sizeInBytes = :sizeInBytes")})
public class ColumnStoreRowGroups implements Serializable {

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
    @Column(name = "state_description")
    private String stateDescription;
    @Column(name = "total_rows")
    private BigInteger totalRows;
    @Column(name = "deleted_rows")
    private BigInteger deletedRows;
    @Column(name = "size_in_bytes")
    private BigInteger sizeInBytes;

    public ColumnStoreRowGroups() {
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

    public String getStateDescription() {
        return stateDescription;
    }

    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
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
    
}
