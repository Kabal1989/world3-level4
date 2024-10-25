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
@Table(name = "dm_column_store_object_pool")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmColumnStoreObjectPool.findAll", query = "SELECT d FROM DmColumnStoreObjectPool d"),
    @NamedQuery(name = "DmColumnStoreObjectPool.findByDatabaseId", query = "SELECT d FROM DmColumnStoreObjectPool d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmColumnStoreObjectPool.findByObjectId", query = "SELECT d FROM DmColumnStoreObjectPool d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmColumnStoreObjectPool.findByIndexId", query = "SELECT d FROM DmColumnStoreObjectPool d WHERE d.indexId = :indexId"),
    @NamedQuery(name = "DmColumnStoreObjectPool.findByPartitionNumber", query = "SELECT d FROM DmColumnStoreObjectPool d WHERE d.partitionNumber = :partitionNumber"),
    @NamedQuery(name = "DmColumnStoreObjectPool.findByColumnId", query = "SELECT d FROM DmColumnStoreObjectPool d WHERE d.columnId = :columnId"),
    @NamedQuery(name = "DmColumnStoreObjectPool.findByRowGroupId", query = "SELECT d FROM DmColumnStoreObjectPool d WHERE d.rowGroupId = :rowGroupId"),
    @NamedQuery(name = "DmColumnStoreObjectPool.findByObjectType", query = "SELECT d FROM DmColumnStoreObjectPool d WHERE d.objectType = :objectType"),
    @NamedQuery(name = "DmColumnStoreObjectPool.findByObjectTypeDesc", query = "SELECT d FROM DmColumnStoreObjectPool d WHERE d.objectTypeDesc = :objectTypeDesc"),
    @NamedQuery(name = "DmColumnStoreObjectPool.findByAccessCount", query = "SELECT d FROM DmColumnStoreObjectPool d WHERE d.accessCount = :accessCount"),
    @NamedQuery(name = "DmColumnStoreObjectPool.findByMemoryUsedInBytes", query = "SELECT d FROM DmColumnStoreObjectPool d WHERE d.memoryUsedInBytes = :memoryUsedInBytes"),
    @NamedQuery(name = "DmColumnStoreObjectPool.findByObjectLoadTime", query = "SELECT d FROM DmColumnStoreObjectPool d WHERE d.objectLoadTime = :objectLoadTime")})
public class DmColumnStoreObjectPool implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
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
    @Column(name = "column_id")
    private Integer columnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "row_group_id")
    private int rowGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_type")
    private int objectType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "object_type_desc")
    private String objectTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "access_count")
    private long accessCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "memory_used_in_bytes")
    private long memoryUsedInBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_load_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date objectLoadTime;

    public DmColumnStoreObjectPool() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
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

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public int getRowGroupId() {
        return rowGroupId;
    }

    public void setRowGroupId(int rowGroupId) {
        this.rowGroupId = rowGroupId;
    }

    public int getObjectType() {
        return objectType;
    }

    public void setObjectType(int objectType) {
        this.objectType = objectType;
    }

    public String getObjectTypeDesc() {
        return objectTypeDesc;
    }

    public void setObjectTypeDesc(String objectTypeDesc) {
        this.objectTypeDesc = objectTypeDesc;
    }

    public long getAccessCount() {
        return accessCount;
    }

    public void setAccessCount(long accessCount) {
        this.accessCount = accessCount;
    }

    public long getMemoryUsedInBytes() {
        return memoryUsedInBytes;
    }

    public void setMemoryUsedInBytes(long memoryUsedInBytes) {
        this.memoryUsedInBytes = memoryUsedInBytes;
    }

    public Date getObjectLoadTime() {
        return objectLoadTime;
    }

    public void setObjectLoadTime(Date objectLoadTime) {
        this.objectLoadTime = objectLoadTime;
    }
    
}
