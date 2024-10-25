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
import javax.persistence.Lob;
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
@Table(name = "dm_os_memory_objects")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsMemoryObjects.findAll", query = "SELECT d FROM DmOsMemoryObjects d"),
    @NamedQuery(name = "DmOsMemoryObjects.findByPagesInBytes", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.pagesInBytes = :pagesInBytes"),
    @NamedQuery(name = "DmOsMemoryObjects.findByCreationOptions", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.creationOptions = :creationOptions"),
    @NamedQuery(name = "DmOsMemoryObjects.findByBytesUsed", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.bytesUsed = :bytesUsed"),
    @NamedQuery(name = "DmOsMemoryObjects.findByType", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.type = :type"),
    @NamedQuery(name = "DmOsMemoryObjects.findByName", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.name = :name"),
    @NamedQuery(name = "DmOsMemoryObjects.findByMemoryNodeId", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.memoryNodeId = :memoryNodeId"),
    @NamedQuery(name = "DmOsMemoryObjects.findByCreationTime", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.creationTime = :creationTime"),
    @NamedQuery(name = "DmOsMemoryObjects.findByPageSizeInBytes", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.pageSizeInBytes = :pageSizeInBytes"),
    @NamedQuery(name = "DmOsMemoryObjects.findByMaxPagesInBytes", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.maxPagesInBytes = :maxPagesInBytes"),
    @NamedQuery(name = "DmOsMemoryObjects.findBySequenceNum", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.sequenceNum = :sequenceNum"),
    @NamedQuery(name = "DmOsMemoryObjects.findByPartitionType", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.partitionType = :partitionType"),
    @NamedQuery(name = "DmOsMemoryObjects.findByPartitionTypeDesc", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.partitionTypeDesc = :partitionTypeDesc"),
    @NamedQuery(name = "DmOsMemoryObjects.findByContentionFactor", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.contentionFactor = :contentionFactor"),
    @NamedQuery(name = "DmOsMemoryObjects.findByWaitingTasksCount", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.waitingTasksCount = :waitingTasksCount"),
    @NamedQuery(name = "DmOsMemoryObjects.findByExclusiveAccessCount", query = "SELECT d FROM DmOsMemoryObjects d WHERE d.exclusiveAccessCount = :exclusiveAccessCount")})
public class DmOsMemoryObjects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_object_address")
    private byte[] memoryObjectAddress;
    @Lob
    @Column(name = "parent_address")
    private byte[] parentAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pages_in_bytes")
    private long pagesInBytes;
    @Column(name = "creation_options")
    private Integer creationOptions;
    @Column(name = "bytes_used")
    private BigInteger bytesUsed;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "type")
    private String type;
    @Size(max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "memory_node_id")
    private short memoryNodeId;
    @Column(name = "creation_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "page_size_in_bytes")
    private int pageSizeInBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_pages_in_bytes")
    private long maxPagesInBytes;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "page_allocator_address")
    private byte[] pageAllocatorAddress;
    @Lob
    @Column(name = "creation_stack_address")
    private byte[] creationStackAddress;
    @Column(name = "sequence_num")
    private Integer sequenceNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partition_type")
    private int partitionType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "partition_type_desc")
    private String partitionTypeDesc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "contention_factor")
    private Float contentionFactor;
    @Column(name = "waiting_tasks_count")
    private BigInteger waitingTasksCount;
    @Column(name = "exclusive_access_count")
    private BigInteger exclusiveAccessCount;

    public DmOsMemoryObjects() {
    }

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }

    public byte[] getParentAddress() {
        return parentAddress;
    }

    public void setParentAddress(byte[] parentAddress) {
        this.parentAddress = parentAddress;
    }

    public long getPagesInBytes() {
        return pagesInBytes;
    }

    public void setPagesInBytes(long pagesInBytes) {
        this.pagesInBytes = pagesInBytes;
    }

    public Integer getCreationOptions() {
        return creationOptions;
    }

    public void setCreationOptions(Integer creationOptions) {
        this.creationOptions = creationOptions;
    }

    public BigInteger getBytesUsed() {
        return bytesUsed;
    }

    public void setBytesUsed(BigInteger bytesUsed) {
        this.bytesUsed = bytesUsed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getMemoryNodeId() {
        return memoryNodeId;
    }

    public void setMemoryNodeId(short memoryNodeId) {
        this.memoryNodeId = memoryNodeId;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public int getPageSizeInBytes() {
        return pageSizeInBytes;
    }

    public void setPageSizeInBytes(int pageSizeInBytes) {
        this.pageSizeInBytes = pageSizeInBytes;
    }

    public long getMaxPagesInBytes() {
        return maxPagesInBytes;
    }

    public void setMaxPagesInBytes(long maxPagesInBytes) {
        this.maxPagesInBytes = maxPagesInBytes;
    }

    public byte[] getPageAllocatorAddress() {
        return pageAllocatorAddress;
    }

    public void setPageAllocatorAddress(byte[] pageAllocatorAddress) {
        this.pageAllocatorAddress = pageAllocatorAddress;
    }

    public byte[] getCreationStackAddress() {
        return creationStackAddress;
    }

    public void setCreationStackAddress(byte[] creationStackAddress) {
        this.creationStackAddress = creationStackAddress;
    }

    public Integer getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(Integer sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public int getPartitionType() {
        return partitionType;
    }

    public void setPartitionType(int partitionType) {
        this.partitionType = partitionType;
    }

    public String getPartitionTypeDesc() {
        return partitionTypeDesc;
    }

    public void setPartitionTypeDesc(String partitionTypeDesc) {
        this.partitionTypeDesc = partitionTypeDesc;
    }

    public Float getContentionFactor() {
        return contentionFactor;
    }

    public void setContentionFactor(Float contentionFactor) {
        this.contentionFactor = contentionFactor;
    }

    public BigInteger getWaitingTasksCount() {
        return waitingTasksCount;
    }

    public void setWaitingTasksCount(BigInteger waitingTasksCount) {
        this.waitingTasksCount = waitingTasksCount;
    }

    public BigInteger getExclusiveAccessCount() {
        return exclusiveAccessCount;
    }

    public void setExclusiveAccessCount(BigInteger exclusiveAccessCount) {
        this.exclusiveAccessCount = exclusiveAccessCount;
    }
    
}
