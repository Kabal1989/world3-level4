/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "dm_db_xtp_memory_consumers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findAll", query = "SELECT d FROM DmDbXtpMemoryConsumers d"),
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findByMemoryConsumerId", query = "SELECT d FROM DmDbXtpMemoryConsumers d WHERE d.memoryConsumerId = :memoryConsumerId"),
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findByMemoryConsumerType", query = "SELECT d FROM DmDbXtpMemoryConsumers d WHERE d.memoryConsumerType = :memoryConsumerType"),
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findByMemoryConsumerTypeDesc", query = "SELECT d FROM DmDbXtpMemoryConsumers d WHERE d.memoryConsumerTypeDesc = :memoryConsumerTypeDesc"),
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findByMemoryConsumerDesc", query = "SELECT d FROM DmDbXtpMemoryConsumers d WHERE d.memoryConsumerDesc = :memoryConsumerDesc"),
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findByObjectId", query = "SELECT d FROM DmDbXtpMemoryConsumers d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findByXtpObjectId", query = "SELECT d FROM DmDbXtpMemoryConsumers d WHERE d.xtpObjectId = :xtpObjectId"),
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findByIndexId", query = "SELECT d FROM DmDbXtpMemoryConsumers d WHERE d.indexId = :indexId"),
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findByAllocatedBytes", query = "SELECT d FROM DmDbXtpMemoryConsumers d WHERE d.allocatedBytes = :allocatedBytes"),
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findByUsedBytes", query = "SELECT d FROM DmDbXtpMemoryConsumers d WHERE d.usedBytes = :usedBytes"),
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findByAllocationCount", query = "SELECT d FROM DmDbXtpMemoryConsumers d WHERE d.allocationCount = :allocationCount"),
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findByPartitionCount", query = "SELECT d FROM DmDbXtpMemoryConsumers d WHERE d.partitionCount = :partitionCount"),
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findBySizeclassCount", query = "SELECT d FROM DmDbXtpMemoryConsumers d WHERE d.sizeclassCount = :sizeclassCount"),
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findByMinSizeclass", query = "SELECT d FROM DmDbXtpMemoryConsumers d WHERE d.minSizeclass = :minSizeclass"),
    @NamedQuery(name = "DmDbXtpMemoryConsumers.findByMaxSizeclass", query = "SELECT d FROM DmDbXtpMemoryConsumers d WHERE d.maxSizeclass = :maxSizeclass")})
public class DmDbXtpMemoryConsumers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "memory_consumer_id")
    private long memoryConsumerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "memory_consumer_type")
    private int memoryConsumerType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "memory_consumer_type_desc")
    private String memoryConsumerTypeDesc;
    @Size(max = 64)
    @Column(name = "memory_consumer_desc")
    private String memoryConsumerDesc;
    @Column(name = "object_id")
    private Integer objectId;
    @Column(name = "xtp_object_id")
    private Integer xtpObjectId;
    @Column(name = "index_id")
    private Integer indexId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "allocated_bytes")
    private long allocatedBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "used_bytes")
    private long usedBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "allocation_count")
    private long allocationCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partition_count")
    private int partitionCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sizeclass_count")
    private int sizeclassCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_sizeclass")
    private int minSizeclass;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_sizeclass")
    private int maxSizeclass;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_consumer_address")
    private byte[] memoryConsumerAddress;

    public DmDbXtpMemoryConsumers() {
    }

    public long getMemoryConsumerId() {
        return memoryConsumerId;
    }

    public void setMemoryConsumerId(long memoryConsumerId) {
        this.memoryConsumerId = memoryConsumerId;
    }

    public int getMemoryConsumerType() {
        return memoryConsumerType;
    }

    public void setMemoryConsumerType(int memoryConsumerType) {
        this.memoryConsumerType = memoryConsumerType;
    }

    public String getMemoryConsumerTypeDesc() {
        return memoryConsumerTypeDesc;
    }

    public void setMemoryConsumerTypeDesc(String memoryConsumerTypeDesc) {
        this.memoryConsumerTypeDesc = memoryConsumerTypeDesc;
    }

    public String getMemoryConsumerDesc() {
        return memoryConsumerDesc;
    }

    public void setMemoryConsumerDesc(String memoryConsumerDesc) {
        this.memoryConsumerDesc = memoryConsumerDesc;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getXtpObjectId() {
        return xtpObjectId;
    }

    public void setXtpObjectId(Integer xtpObjectId) {
        this.xtpObjectId = xtpObjectId;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public long getAllocatedBytes() {
        return allocatedBytes;
    }

    public void setAllocatedBytes(long allocatedBytes) {
        this.allocatedBytes = allocatedBytes;
    }

    public long getUsedBytes() {
        return usedBytes;
    }

    public void setUsedBytes(long usedBytes) {
        this.usedBytes = usedBytes;
    }

    public long getAllocationCount() {
        return allocationCount;
    }

    public void setAllocationCount(long allocationCount) {
        this.allocationCount = allocationCount;
    }

    public int getPartitionCount() {
        return partitionCount;
    }

    public void setPartitionCount(int partitionCount) {
        this.partitionCount = partitionCount;
    }

    public int getSizeclassCount() {
        return sizeclassCount;
    }

    public void setSizeclassCount(int sizeclassCount) {
        this.sizeclassCount = sizeclassCount;
    }

    public int getMinSizeclass() {
        return minSizeclass;
    }

    public void setMinSizeclass(int minSizeclass) {
        this.minSizeclass = minSizeclass;
    }

    public int getMaxSizeclass() {
        return maxSizeclass;
    }

    public void setMaxSizeclass(int maxSizeclass) {
        this.maxSizeclass = maxSizeclass;
    }

    public byte[] getMemoryConsumerAddress() {
        return memoryConsumerAddress;
    }

    public void setMemoryConsumerAddress(byte[] memoryConsumerAddress) {
        this.memoryConsumerAddress = memoryConsumerAddress;
    }
    
}
