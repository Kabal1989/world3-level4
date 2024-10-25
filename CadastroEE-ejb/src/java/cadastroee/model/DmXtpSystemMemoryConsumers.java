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
@Table(name = "dm_xtp_system_memory_consumers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXtpSystemMemoryConsumers.findAll", query = "SELECT d FROM DmXtpSystemMemoryConsumers d"),
    @NamedQuery(name = "DmXtpSystemMemoryConsumers.findByMemoryConsumerId", query = "SELECT d FROM DmXtpSystemMemoryConsumers d WHERE d.memoryConsumerId = :memoryConsumerId"),
    @NamedQuery(name = "DmXtpSystemMemoryConsumers.findByMemoryConsumerType", query = "SELECT d FROM DmXtpSystemMemoryConsumers d WHERE d.memoryConsumerType = :memoryConsumerType"),
    @NamedQuery(name = "DmXtpSystemMemoryConsumers.findByMemoryConsumerTypeDesc", query = "SELECT d FROM DmXtpSystemMemoryConsumers d WHERE d.memoryConsumerTypeDesc = :memoryConsumerTypeDesc"),
    @NamedQuery(name = "DmXtpSystemMemoryConsumers.findByMemoryConsumerDesc", query = "SELECT d FROM DmXtpSystemMemoryConsumers d WHERE d.memoryConsumerDesc = :memoryConsumerDesc"),
    @NamedQuery(name = "DmXtpSystemMemoryConsumers.findByLookasideId", query = "SELECT d FROM DmXtpSystemMemoryConsumers d WHERE d.lookasideId = :lookasideId"),
    @NamedQuery(name = "DmXtpSystemMemoryConsumers.findByAllocatedBytes", query = "SELECT d FROM DmXtpSystemMemoryConsumers d WHERE d.allocatedBytes = :allocatedBytes"),
    @NamedQuery(name = "DmXtpSystemMemoryConsumers.findByUsedBytes", query = "SELECT d FROM DmXtpSystemMemoryConsumers d WHERE d.usedBytes = :usedBytes"),
    @NamedQuery(name = "DmXtpSystemMemoryConsumers.findByAllocationCount", query = "SELECT d FROM DmXtpSystemMemoryConsumers d WHERE d.allocationCount = :allocationCount"),
    @NamedQuery(name = "DmXtpSystemMemoryConsumers.findByPartitionCount", query = "SELECT d FROM DmXtpSystemMemoryConsumers d WHERE d.partitionCount = :partitionCount"),
    @NamedQuery(name = "DmXtpSystemMemoryConsumers.findBySizeclassCount", query = "SELECT d FROM DmXtpSystemMemoryConsumers d WHERE d.sizeclassCount = :sizeclassCount"),
    @NamedQuery(name = "DmXtpSystemMemoryConsumers.findByMinSizeclass", query = "SELECT d FROM DmXtpSystemMemoryConsumers d WHERE d.minSizeclass = :minSizeclass"),
    @NamedQuery(name = "DmXtpSystemMemoryConsumers.findByMaxSizeclass", query = "SELECT d FROM DmXtpSystemMemoryConsumers d WHERE d.maxSizeclass = :maxSizeclass")})
public class DmXtpSystemMemoryConsumers implements Serializable {

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
    @Column(name = "lookaside_id")
    private BigInteger lookasideId;
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

    public DmXtpSystemMemoryConsumers() {
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

    public BigInteger getLookasideId() {
        return lookasideId;
    }

    public void setLookasideId(BigInteger lookasideId) {
        this.lookasideId = lookasideId;
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
