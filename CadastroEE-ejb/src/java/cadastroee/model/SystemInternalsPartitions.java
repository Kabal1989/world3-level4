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
@Table(name = "system_internals_partitions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SystemInternalsPartitions.findAll", query = "SELECT s FROM SystemInternalsPartitions s"),
    @NamedQuery(name = "SystemInternalsPartitions.findByPartitionId", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.partitionId = :partitionId"),
    @NamedQuery(name = "SystemInternalsPartitions.findByObjectId", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "SystemInternalsPartitions.findByIndexId", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.indexId = :indexId"),
    @NamedQuery(name = "SystemInternalsPartitions.findByPartitionNumber", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.partitionNumber = :partitionNumber"),
    @NamedQuery(name = "SystemInternalsPartitions.findByRows", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.rows = :rows"),
    @NamedQuery(name = "SystemInternalsPartitions.findByFilestreamFilegroupId", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.filestreamFilegroupId = :filestreamFilegroupId"),
    @NamedQuery(name = "SystemInternalsPartitions.findByIsOrphaned", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.isOrphaned = :isOrphaned"),
    @NamedQuery(name = "SystemInternalsPartitions.findByDroppedLobColumnState", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.droppedLobColumnState = :droppedLobColumnState"),
    @NamedQuery(name = "SystemInternalsPartitions.findByIsUnique", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.isUnique = :isUnique"),
    @NamedQuery(name = "SystemInternalsPartitions.findByIsReplicated", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.isReplicated = :isReplicated"),
    @NamedQuery(name = "SystemInternalsPartitions.findByIsLoggedForReplication", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.isLoggedForReplication = :isLoggedForReplication"),
    @NamedQuery(name = "SystemInternalsPartitions.findByIsSereplicated", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.isSereplicated = :isSereplicated"),
    @NamedQuery(name = "SystemInternalsPartitions.findByMaxNullBitUsed", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.maxNullBitUsed = :maxNullBitUsed"),
    @NamedQuery(name = "SystemInternalsPartitions.findByMaxLeafLength", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.maxLeafLength = :maxLeafLength"),
    @NamedQuery(name = "SystemInternalsPartitions.findByMinLeafLength", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.minLeafLength = :minLeafLength"),
    @NamedQuery(name = "SystemInternalsPartitions.findByMaxInternalLength", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.maxInternalLength = :maxInternalLength"),
    @NamedQuery(name = "SystemInternalsPartitions.findByMinInternalLength", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.minInternalLength = :minInternalLength"),
    @NamedQuery(name = "SystemInternalsPartitions.findByAllowsNullableKeys", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.allowsNullableKeys = :allowsNullableKeys"),
    @NamedQuery(name = "SystemInternalsPartitions.findByAllowRowLocks", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.allowRowLocks = :allowRowLocks"),
    @NamedQuery(name = "SystemInternalsPartitions.findByAllowPageLocks", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.allowPageLocks = :allowPageLocks"),
    @NamedQuery(name = "SystemInternalsPartitions.findByIsDataRowFormat", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.isDataRowFormat = :isDataRowFormat"),
    @NamedQuery(name = "SystemInternalsPartitions.findByIsNotVersioned", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.isNotVersioned = :isNotVersioned"),
    @NamedQuery(name = "SystemInternalsPartitions.findByFilestreamGuid", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.filestreamGuid = :filestreamGuid"),
    @NamedQuery(name = "SystemInternalsPartitions.findByOwnertype", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.ownertype = :ownertype"),
    @NamedQuery(name = "SystemInternalsPartitions.findByIsColumnstore", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.isColumnstore = :isColumnstore"),
    @NamedQuery(name = "SystemInternalsPartitions.findByOptimizeForSequentialKey", query = "SELECT s FROM SystemInternalsPartitions s WHERE s.optimizeForSequentialKey = :optimizeForSequentialKey")})
public class SystemInternalsPartitions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partition_id")
    private long partitionId;
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
    @Column(name = "rows")
    private long rows;
    @Basic(optional = false)
    @NotNull
    @Column(name = "filestream_filegroup_id")
    private short filestreamFilegroupId;
    @Column(name = "is_orphaned")
    private Boolean isOrphaned;
    @Column(name = "dropped_lob_column_state")
    private Short droppedLobColumnState;
    @Column(name = "is_unique")
    private Boolean isUnique;
    @Column(name = "is_replicated")
    private Boolean isReplicated;
    @Column(name = "is_logged_for_replication")
    private Boolean isLoggedForReplication;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_sereplicated")
    private boolean isSereplicated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_null_bit_used")
    private short maxNullBitUsed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_leaf_length")
    private int maxLeafLength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_leaf_length")
    private short minLeafLength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_internal_length")
    private short maxInternalLength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_internal_length")
    private short minInternalLength;
    @Column(name = "allows_nullable_keys")
    private Boolean allowsNullableKeys;
    @Column(name = "allow_row_locks")
    private Boolean allowRowLocks;
    @Column(name = "allow_page_locks")
    private Boolean allowPageLocks;
    @Column(name = "is_data_row_format")
    private Boolean isDataRowFormat;
    @Column(name = "is_not_versioned")
    private Boolean isNotVersioned;
    @Size(max = 36)
    @Column(name = "filestream_guid")
    private String filestreamGuid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ownertype")
    private short ownertype;
    @Column(name = "is_columnstore")
    private Boolean isColumnstore;
    @Column(name = "optimize_for_sequential_key")
    private Boolean optimizeForSequentialKey;

    public SystemInternalsPartitions() {
    }

    public long getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(long partitionId) {
        this.partitionId = partitionId;
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

    public long getRows() {
        return rows;
    }

    public void setRows(long rows) {
        this.rows = rows;
    }

    public short getFilestreamFilegroupId() {
        return filestreamFilegroupId;
    }

    public void setFilestreamFilegroupId(short filestreamFilegroupId) {
        this.filestreamFilegroupId = filestreamFilegroupId;
    }

    public Boolean getIsOrphaned() {
        return isOrphaned;
    }

    public void setIsOrphaned(Boolean isOrphaned) {
        this.isOrphaned = isOrphaned;
    }

    public Short getDroppedLobColumnState() {
        return droppedLobColumnState;
    }

    public void setDroppedLobColumnState(Short droppedLobColumnState) {
        this.droppedLobColumnState = droppedLobColumnState;
    }

    public Boolean getIsUnique() {
        return isUnique;
    }

    public void setIsUnique(Boolean isUnique) {
        this.isUnique = isUnique;
    }

    public Boolean getIsReplicated() {
        return isReplicated;
    }

    public void setIsReplicated(Boolean isReplicated) {
        this.isReplicated = isReplicated;
    }

    public Boolean getIsLoggedForReplication() {
        return isLoggedForReplication;
    }

    public void setIsLoggedForReplication(Boolean isLoggedForReplication) {
        this.isLoggedForReplication = isLoggedForReplication;
    }

    public boolean getIsSereplicated() {
        return isSereplicated;
    }

    public void setIsSereplicated(boolean isSereplicated) {
        this.isSereplicated = isSereplicated;
    }

    public short getMaxNullBitUsed() {
        return maxNullBitUsed;
    }

    public void setMaxNullBitUsed(short maxNullBitUsed) {
        this.maxNullBitUsed = maxNullBitUsed;
    }

    public int getMaxLeafLength() {
        return maxLeafLength;
    }

    public void setMaxLeafLength(int maxLeafLength) {
        this.maxLeafLength = maxLeafLength;
    }

    public short getMinLeafLength() {
        return minLeafLength;
    }

    public void setMinLeafLength(short minLeafLength) {
        this.minLeafLength = minLeafLength;
    }

    public short getMaxInternalLength() {
        return maxInternalLength;
    }

    public void setMaxInternalLength(short maxInternalLength) {
        this.maxInternalLength = maxInternalLength;
    }

    public short getMinInternalLength() {
        return minInternalLength;
    }

    public void setMinInternalLength(short minInternalLength) {
        this.minInternalLength = minInternalLength;
    }

    public Boolean getAllowsNullableKeys() {
        return allowsNullableKeys;
    }

    public void setAllowsNullableKeys(Boolean allowsNullableKeys) {
        this.allowsNullableKeys = allowsNullableKeys;
    }

    public Boolean getAllowRowLocks() {
        return allowRowLocks;
    }

    public void setAllowRowLocks(Boolean allowRowLocks) {
        this.allowRowLocks = allowRowLocks;
    }

    public Boolean getAllowPageLocks() {
        return allowPageLocks;
    }

    public void setAllowPageLocks(Boolean allowPageLocks) {
        this.allowPageLocks = allowPageLocks;
    }

    public Boolean getIsDataRowFormat() {
        return isDataRowFormat;
    }

    public void setIsDataRowFormat(Boolean isDataRowFormat) {
        this.isDataRowFormat = isDataRowFormat;
    }

    public Boolean getIsNotVersioned() {
        return isNotVersioned;
    }

    public void setIsNotVersioned(Boolean isNotVersioned) {
        this.isNotVersioned = isNotVersioned;
    }

    public String getFilestreamGuid() {
        return filestreamGuid;
    }

    public void setFilestreamGuid(String filestreamGuid) {
        this.filestreamGuid = filestreamGuid;
    }

    public short getOwnertype() {
        return ownertype;
    }

    public void setOwnertype(short ownertype) {
        this.ownertype = ownertype;
    }

    public Boolean getIsColumnstore() {
        return isColumnstore;
    }

    public void setIsColumnstore(Boolean isColumnstore) {
        this.isColumnstore = isColumnstore;
    }

    public Boolean getOptimizeForSequentialKey() {
        return optimizeForSequentialKey;
    }

    public void setOptimizeForSequentialKey(Boolean optimizeForSequentialKey) {
        this.optimizeForSequentialKey = optimizeForSequentialKey;
    }
    
}
