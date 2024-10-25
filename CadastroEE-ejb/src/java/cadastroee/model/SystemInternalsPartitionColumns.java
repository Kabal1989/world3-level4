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
@Table(name = "system_internals_partition_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SystemInternalsPartitionColumns.findAll", query = "SELECT s FROM SystemInternalsPartitionColumns s"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByPartitionId", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.partitionId = :partitionId"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByPartitionColumnId", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.partitionColumnId = :partitionColumnId"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByModifiedCount", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.modifiedCount = :modifiedCount"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByMaxInrowLength", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.maxInrowLength = :maxInrowLength"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByIsReplicated", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.isReplicated = :isReplicated"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByIsLoggedForReplication", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.isLoggedForReplication = :isLoggedForReplication"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByIsDropped", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.isDropped = :isDropped"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findBySystemTypeId", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByMaxLength", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.maxLength = :maxLength"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByPrecision", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.precision = :precision"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByScale", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.scale = :scale"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByCollationName", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.collationName = :collationName"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByIsFilestream", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.isFilestream = :isFilestream"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByKeyOrdinal", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.keyOrdinal = :keyOrdinal"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByIsNullable", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.isNullable = :isNullable"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByIsDescendingKey", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.isDescendingKey = :isDescendingKey"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByIsUniqueifier", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.isUniqueifier = :isUniqueifier"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByLeafOffset", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.leafOffset = :leafOffset"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByInternalOffset", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.internalOffset = :internalOffset"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByLeafBitPosition", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.leafBitPosition = :leafBitPosition"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByInternalBitPosition", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.internalBitPosition = :internalBitPosition"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByLeafNullBit", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.leafNullBit = :leafNullBit"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByInternalNullBit", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.internalNullBit = :internalNullBit"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByIsAntiMatter", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.isAntiMatter = :isAntiMatter"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByPartitionColumnGuid", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.partitionColumnGuid = :partitionColumnGuid"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByIsSparse", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.isSparse = :isSparse"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByHasDefault", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.hasDefault = :hasDefault"),
    @NamedQuery(name = "SystemInternalsPartitionColumns.findByDefaultValue", query = "SELECT s FROM SystemInternalsPartitionColumns s WHERE s.defaultValue = :defaultValue")})
public class SystemInternalsPartitionColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partition_id")
    private long partitionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partition_column_id")
    private int partitionColumnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified_count")
    private long modifiedCount;
    @Column(name = "max_inrow_length")
    private Short maxInrowLength;
    @Column(name = "is_replicated")
    private Boolean isReplicated;
    @Column(name = "is_logged_for_replication")
    private Boolean isLoggedForReplication;
    @Column(name = "is_dropped")
    private Boolean isDropped;
    @Column(name = "system_type_id")
    private Short systemTypeId;
    @Column(name = "max_length")
    private Short maxLength;
    @Column(name = "precision")
    private Short precision;
    @Column(name = "scale")
    private Short scale;
    @Size(max = 128)
    @Column(name = "collation_name")
    private String collationName;
    @Column(name = "is_filestream")
    private Boolean isFilestream;
    @Basic(optional = false)
    @NotNull
    @Column(name = "key_ordinal")
    private short keyOrdinal;
    @Column(name = "is_nullable")
    private Boolean isNullable;
    @Column(name = "is_descending_key")
    private Boolean isDescendingKey;
    @Column(name = "is_uniqueifier")
    private Boolean isUniqueifier;
    @Column(name = "leaf_offset")
    private Short leafOffset;
    @Column(name = "internal_offset")
    private Short internalOffset;
    @Column(name = "leaf_bit_position")
    private Short leafBitPosition;
    @Column(name = "internal_bit_position")
    private Short internalBitPosition;
    @Column(name = "leaf_null_bit")
    private Short leafNullBit;
    @Column(name = "internal_null_bit")
    private Short internalNullBit;
    @Column(name = "is_anti_matter")
    private Boolean isAntiMatter;
    @Size(max = 36)
    @Column(name = "partition_column_guid")
    private String partitionColumnGuid;
    @Column(name = "is_sparse")
    private Boolean isSparse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_default")
    private boolean hasDefault;
    @Column(name = "default_value")
    private Serializable defaultValue;

    public SystemInternalsPartitionColumns() {
    }

    public long getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(long partitionId) {
        this.partitionId = partitionId;
    }

    public int getPartitionColumnId() {
        return partitionColumnId;
    }

    public void setPartitionColumnId(int partitionColumnId) {
        this.partitionColumnId = partitionColumnId;
    }

    public long getModifiedCount() {
        return modifiedCount;
    }

    public void setModifiedCount(long modifiedCount) {
        this.modifiedCount = modifiedCount;
    }

    public Short getMaxInrowLength() {
        return maxInrowLength;
    }

    public void setMaxInrowLength(Short maxInrowLength) {
        this.maxInrowLength = maxInrowLength;
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

    public Boolean getIsDropped() {
        return isDropped;
    }

    public void setIsDropped(Boolean isDropped) {
        this.isDropped = isDropped;
    }

    public Short getSystemTypeId() {
        return systemTypeId;
    }

    public void setSystemTypeId(Short systemTypeId) {
        this.systemTypeId = systemTypeId;
    }

    public Short getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Short maxLength) {
        this.maxLength = maxLength;
    }

    public Short getPrecision() {
        return precision;
    }

    public void setPrecision(Short precision) {
        this.precision = precision;
    }

    public Short getScale() {
        return scale;
    }

    public void setScale(Short scale) {
        this.scale = scale;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    public Boolean getIsFilestream() {
        return isFilestream;
    }

    public void setIsFilestream(Boolean isFilestream) {
        this.isFilestream = isFilestream;
    }

    public short getKeyOrdinal() {
        return keyOrdinal;
    }

    public void setKeyOrdinal(short keyOrdinal) {
        this.keyOrdinal = keyOrdinal;
    }

    public Boolean getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(Boolean isNullable) {
        this.isNullable = isNullable;
    }

    public Boolean getIsDescendingKey() {
        return isDescendingKey;
    }

    public void setIsDescendingKey(Boolean isDescendingKey) {
        this.isDescendingKey = isDescendingKey;
    }

    public Boolean getIsUniqueifier() {
        return isUniqueifier;
    }

    public void setIsUniqueifier(Boolean isUniqueifier) {
        this.isUniqueifier = isUniqueifier;
    }

    public Short getLeafOffset() {
        return leafOffset;
    }

    public void setLeafOffset(Short leafOffset) {
        this.leafOffset = leafOffset;
    }

    public Short getInternalOffset() {
        return internalOffset;
    }

    public void setInternalOffset(Short internalOffset) {
        this.internalOffset = internalOffset;
    }

    public Short getLeafBitPosition() {
        return leafBitPosition;
    }

    public void setLeafBitPosition(Short leafBitPosition) {
        this.leafBitPosition = leafBitPosition;
    }

    public Short getInternalBitPosition() {
        return internalBitPosition;
    }

    public void setInternalBitPosition(Short internalBitPosition) {
        this.internalBitPosition = internalBitPosition;
    }

    public Short getLeafNullBit() {
        return leafNullBit;
    }

    public void setLeafNullBit(Short leafNullBit) {
        this.leafNullBit = leafNullBit;
    }

    public Short getInternalNullBit() {
        return internalNullBit;
    }

    public void setInternalNullBit(Short internalNullBit) {
        this.internalNullBit = internalNullBit;
    }

    public Boolean getIsAntiMatter() {
        return isAntiMatter;
    }

    public void setIsAntiMatter(Boolean isAntiMatter) {
        this.isAntiMatter = isAntiMatter;
    }

    public String getPartitionColumnGuid() {
        return partitionColumnGuid;
    }

    public void setPartitionColumnGuid(String partitionColumnGuid) {
        this.partitionColumnGuid = partitionColumnGuid;
    }

    public Boolean getIsSparse() {
        return isSparse;
    }

    public void setIsSparse(Boolean isSparse) {
        this.isSparse = isSparse;
    }

    public boolean getHasDefault() {
        return hasDefault;
    }

    public void setHasDefault(boolean hasDefault) {
        this.hasDefault = hasDefault;
    }

    public Serializable getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Serializable defaultValue) {
        this.defaultValue = defaultValue;
    }
    
}
