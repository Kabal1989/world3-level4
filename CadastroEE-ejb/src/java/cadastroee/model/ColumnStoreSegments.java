/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "column_store_segments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ColumnStoreSegments.findAll", query = "SELECT c FROM ColumnStoreSegments c"),
    @NamedQuery(name = "ColumnStoreSegments.findByPartitionId", query = "SELECT c FROM ColumnStoreSegments c WHERE c.partitionId = :partitionId"),
    @NamedQuery(name = "ColumnStoreSegments.findByHobtId", query = "SELECT c FROM ColumnStoreSegments c WHERE c.hobtId = :hobtId"),
    @NamedQuery(name = "ColumnStoreSegments.findByColumnId", query = "SELECT c FROM ColumnStoreSegments c WHERE c.columnId = :columnId"),
    @NamedQuery(name = "ColumnStoreSegments.findBySegmentId", query = "SELECT c FROM ColumnStoreSegments c WHERE c.segmentId = :segmentId"),
    @NamedQuery(name = "ColumnStoreSegments.findByVersion", query = "SELECT c FROM ColumnStoreSegments c WHERE c.version = :version"),
    @NamedQuery(name = "ColumnStoreSegments.findByEncodingType", query = "SELECT c FROM ColumnStoreSegments c WHERE c.encodingType = :encodingType"),
    @NamedQuery(name = "ColumnStoreSegments.findByRowCount", query = "SELECT c FROM ColumnStoreSegments c WHERE c.rowCount = :rowCount"),
    @NamedQuery(name = "ColumnStoreSegments.findByHasNulls", query = "SELECT c FROM ColumnStoreSegments c WHERE c.hasNulls = :hasNulls"),
    @NamedQuery(name = "ColumnStoreSegments.findByBaseId", query = "SELECT c FROM ColumnStoreSegments c WHERE c.baseId = :baseId"),
    @NamedQuery(name = "ColumnStoreSegments.findByMagnitude", query = "SELECT c FROM ColumnStoreSegments c WHERE c.magnitude = :magnitude"),
    @NamedQuery(name = "ColumnStoreSegments.findByPrimaryDictionaryId", query = "SELECT c FROM ColumnStoreSegments c WHERE c.primaryDictionaryId = :primaryDictionaryId"),
    @NamedQuery(name = "ColumnStoreSegments.findBySecondaryDictionaryId", query = "SELECT c FROM ColumnStoreSegments c WHERE c.secondaryDictionaryId = :secondaryDictionaryId"),
    @NamedQuery(name = "ColumnStoreSegments.findByMinDataId", query = "SELECT c FROM ColumnStoreSegments c WHERE c.minDataId = :minDataId"),
    @NamedQuery(name = "ColumnStoreSegments.findByMaxDataId", query = "SELECT c FROM ColumnStoreSegments c WHERE c.maxDataId = :maxDataId"),
    @NamedQuery(name = "ColumnStoreSegments.findByNullValue", query = "SELECT c FROM ColumnStoreSegments c WHERE c.nullValue = :nullValue"),
    @NamedQuery(name = "ColumnStoreSegments.findByOnDiskSize", query = "SELECT c FROM ColumnStoreSegments c WHERE c.onDiskSize = :onDiskSize"),
    @NamedQuery(name = "ColumnStoreSegments.findByCollationId", query = "SELECT c FROM ColumnStoreSegments c WHERE c.collationId = :collationId")})
public class ColumnStoreSegments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "partition_id")
    private BigInteger partitionId;
    @Column(name = "hobt_id")
    private BigInteger hobtId;
    @Column(name = "column_id")
    private Integer columnId;
    @Column(name = "segment_id")
    private Integer segmentId;
    @Column(name = "version")
    private Integer version;
    @Column(name = "encoding_type")
    private Integer encodingType;
    @Column(name = "row_count")
    private Integer rowCount;
    @Column(name = "has_nulls")
    private Integer hasNulls;
    @Column(name = "base_id")
    private BigInteger baseId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "magnitude")
    private Double magnitude;
    @Column(name = "primary_dictionary_id")
    private Integer primaryDictionaryId;
    @Column(name = "secondary_dictionary_id")
    private Integer secondaryDictionaryId;
    @Column(name = "min_data_id")
    private BigInteger minDataId;
    @Column(name = "max_data_id")
    private BigInteger maxDataId;
    @Column(name = "null_value")
    private BigInteger nullValue;
    @Column(name = "on_disk_size")
    private BigInteger onDiskSize;
    @Column(name = "collation_id")
    private Integer collationId;
    @Lob
    @Column(name = "min_deep_data")
    private byte[] minDeepData;
    @Lob
    @Column(name = "max_deep_data")
    private byte[] maxDeepData;

    public ColumnStoreSegments() {
    }

    public BigInteger getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(BigInteger partitionId) {
        this.partitionId = partitionId;
    }

    public BigInteger getHobtId() {
        return hobtId;
    }

    public void setHobtId(BigInteger hobtId) {
        this.hobtId = hobtId;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Integer getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(Integer segmentId) {
        this.segmentId = segmentId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getEncodingType() {
        return encodingType;
    }

    public void setEncodingType(Integer encodingType) {
        this.encodingType = encodingType;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getHasNulls() {
        return hasNulls;
    }

    public void setHasNulls(Integer hasNulls) {
        this.hasNulls = hasNulls;
    }

    public BigInteger getBaseId() {
        return baseId;
    }

    public void setBaseId(BigInteger baseId) {
        this.baseId = baseId;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Double magnitude) {
        this.magnitude = magnitude;
    }

    public Integer getPrimaryDictionaryId() {
        return primaryDictionaryId;
    }

    public void setPrimaryDictionaryId(Integer primaryDictionaryId) {
        this.primaryDictionaryId = primaryDictionaryId;
    }

    public Integer getSecondaryDictionaryId() {
        return secondaryDictionaryId;
    }

    public void setSecondaryDictionaryId(Integer secondaryDictionaryId) {
        this.secondaryDictionaryId = secondaryDictionaryId;
    }

    public BigInteger getMinDataId() {
        return minDataId;
    }

    public void setMinDataId(BigInteger minDataId) {
        this.minDataId = minDataId;
    }

    public BigInteger getMaxDataId() {
        return maxDataId;
    }

    public void setMaxDataId(BigInteger maxDataId) {
        this.maxDataId = maxDataId;
    }

    public BigInteger getNullValue() {
        return nullValue;
    }

    public void setNullValue(BigInteger nullValue) {
        this.nullValue = nullValue;
    }

    public BigInteger getOnDiskSize() {
        return onDiskSize;
    }

    public void setOnDiskSize(BigInteger onDiskSize) {
        this.onDiskSize = onDiskSize;
    }

    public Integer getCollationId() {
        return collationId;
    }

    public void setCollationId(Integer collationId) {
        this.collationId = collationId;
    }

    public byte[] getMinDeepData() {
        return minDeepData;
    }

    public void setMinDeepData(byte[] minDeepData) {
        this.minDeepData = minDeepData;
    }

    public byte[] getMaxDeepData() {
        return maxDeepData;
    }

    public void setMaxDeepData(byte[] maxDeepData) {
        this.maxDeepData = maxDeepData;
    }
    
}
