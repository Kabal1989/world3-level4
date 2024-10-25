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
@Table(name = "internal_partitions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InternalPartitions.findAll", query = "SELECT i FROM InternalPartitions i"),
    @NamedQuery(name = "InternalPartitions.findByPartitionId", query = "SELECT i FROM InternalPartitions i WHERE i.partitionId = :partitionId"),
    @NamedQuery(name = "InternalPartitions.findByObjectId", query = "SELECT i FROM InternalPartitions i WHERE i.objectId = :objectId"),
    @NamedQuery(name = "InternalPartitions.findByIndexId", query = "SELECT i FROM InternalPartitions i WHERE i.indexId = :indexId"),
    @NamedQuery(name = "InternalPartitions.findByPartitionNumber", query = "SELECT i FROM InternalPartitions i WHERE i.partitionNumber = :partitionNumber"),
    @NamedQuery(name = "InternalPartitions.findByHobtId", query = "SELECT i FROM InternalPartitions i WHERE i.hobtId = :hobtId"),
    @NamedQuery(name = "InternalPartitions.findByInternalObjectType", query = "SELECT i FROM InternalPartitions i WHERE i.internalObjectType = :internalObjectType"),
    @NamedQuery(name = "InternalPartitions.findByInternalObjectTypeDesc", query = "SELECT i FROM InternalPartitions i WHERE i.internalObjectTypeDesc = :internalObjectTypeDesc"),
    @NamedQuery(name = "InternalPartitions.findByRowGroupId", query = "SELECT i FROM InternalPartitions i WHERE i.rowGroupId = :rowGroupId"),
    @NamedQuery(name = "InternalPartitions.findByRows", query = "SELECT i FROM InternalPartitions i WHERE i.rows = :rows"),
    @NamedQuery(name = "InternalPartitions.findByDataCompression", query = "SELECT i FROM InternalPartitions i WHERE i.dataCompression = :dataCompression"),
    @NamedQuery(name = "InternalPartitions.findByDataCompressionDesc", query = "SELECT i FROM InternalPartitions i WHERE i.dataCompressionDesc = :dataCompressionDesc"),
    @NamedQuery(name = "InternalPartitions.findByXmlCompression", query = "SELECT i FROM InternalPartitions i WHERE i.xmlCompression = :xmlCompression"),
    @NamedQuery(name = "InternalPartitions.findByXmlCompressionDesc", query = "SELECT i FROM InternalPartitions i WHERE i.xmlCompressionDesc = :xmlCompressionDesc")})
public class InternalPartitions implements Serializable {

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
    @Column(name = "hobt_id")
    private long hobtId;
    @Column(name = "internal_object_type")
    private Short internalObjectType;
    @Size(max = 60)
    @Column(name = "internal_object_type_desc")
    private String internalObjectTypeDesc;
    @Column(name = "row_group_id")
    private Integer rowGroupId;
    @Column(name = "rows")
    private BigInteger rows;
    @Column(name = "data_compression")
    private Short dataCompression;
    @Size(max = 60)
    @Column(name = "data_compression_desc")
    private String dataCompressionDesc;
    @Column(name = "xml_compression")
    private Boolean xmlCompression;
    @Size(max = 3)
    @Column(name = "xml_compression_desc")
    private String xmlCompressionDesc;

    public InternalPartitions() {
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

    public long getHobtId() {
        return hobtId;
    }

    public void setHobtId(long hobtId) {
        this.hobtId = hobtId;
    }

    public Short getInternalObjectType() {
        return internalObjectType;
    }

    public void setInternalObjectType(Short internalObjectType) {
        this.internalObjectType = internalObjectType;
    }

    public String getInternalObjectTypeDesc() {
        return internalObjectTypeDesc;
    }

    public void setInternalObjectTypeDesc(String internalObjectTypeDesc) {
        this.internalObjectTypeDesc = internalObjectTypeDesc;
    }

    public Integer getRowGroupId() {
        return rowGroupId;
    }

    public void setRowGroupId(Integer rowGroupId) {
        this.rowGroupId = rowGroupId;
    }

    public BigInteger getRows() {
        return rows;
    }

    public void setRows(BigInteger rows) {
        this.rows = rows;
    }

    public Short getDataCompression() {
        return dataCompression;
    }

    public void setDataCompression(Short dataCompression) {
        this.dataCompression = dataCompression;
    }

    public String getDataCompressionDesc() {
        return dataCompressionDesc;
    }

    public void setDataCompressionDesc(String dataCompressionDesc) {
        this.dataCompressionDesc = dataCompressionDesc;
    }

    public Boolean getXmlCompression() {
        return xmlCompression;
    }

    public void setXmlCompression(Boolean xmlCompression) {
        this.xmlCompression = xmlCompression;
    }

    public String getXmlCompressionDesc() {
        return xmlCompressionDesc;
    }

    public void setXmlCompressionDesc(String xmlCompressionDesc) {
        this.xmlCompressionDesc = xmlCompressionDesc;
    }
    
}
