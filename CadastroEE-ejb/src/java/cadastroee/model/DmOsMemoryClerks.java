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
@Table(name = "dm_os_memory_clerks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsMemoryClerks.findAll", query = "SELECT d FROM DmOsMemoryClerks d"),
    @NamedQuery(name = "DmOsMemoryClerks.findByType", query = "SELECT d FROM DmOsMemoryClerks d WHERE d.type = :type"),
    @NamedQuery(name = "DmOsMemoryClerks.findByName", query = "SELECT d FROM DmOsMemoryClerks d WHERE d.name = :name"),
    @NamedQuery(name = "DmOsMemoryClerks.findByMemoryNodeId", query = "SELECT d FROM DmOsMemoryClerks d WHERE d.memoryNodeId = :memoryNodeId"),
    @NamedQuery(name = "DmOsMemoryClerks.findByPagesKb", query = "SELECT d FROM DmOsMemoryClerks d WHERE d.pagesKb = :pagesKb"),
    @NamedQuery(name = "DmOsMemoryClerks.findByVirtualMemoryReservedKb", query = "SELECT d FROM DmOsMemoryClerks d WHERE d.virtualMemoryReservedKb = :virtualMemoryReservedKb"),
    @NamedQuery(name = "DmOsMemoryClerks.findByVirtualMemoryCommittedKb", query = "SELECT d FROM DmOsMemoryClerks d WHERE d.virtualMemoryCommittedKb = :virtualMemoryCommittedKb"),
    @NamedQuery(name = "DmOsMemoryClerks.findByAweAllocatedKb", query = "SELECT d FROM DmOsMemoryClerks d WHERE d.aweAllocatedKb = :aweAllocatedKb"),
    @NamedQuery(name = "DmOsMemoryClerks.findBySharedMemoryReservedKb", query = "SELECT d FROM DmOsMemoryClerks d WHERE d.sharedMemoryReservedKb = :sharedMemoryReservedKb"),
    @NamedQuery(name = "DmOsMemoryClerks.findBySharedMemoryCommittedKb", query = "SELECT d FROM DmOsMemoryClerks d WHERE d.sharedMemoryCommittedKb = :sharedMemoryCommittedKb"),
    @NamedQuery(name = "DmOsMemoryClerks.findByPageSizeInBytes", query = "SELECT d FROM DmOsMemoryClerks d WHERE d.pageSizeInBytes = :pageSizeInBytes"),
    @NamedQuery(name = "DmOsMemoryClerks.findByParentMemoryBrokerType", query = "SELECT d FROM DmOsMemoryClerks d WHERE d.parentMemoryBrokerType = :parentMemoryBrokerType")})
public class DmOsMemoryClerks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_clerk_address")
    private byte[] memoryClerkAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "memory_node_id")
    private short memoryNodeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pages_kb")
    private long pagesKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtual_memory_reserved_kb")
    private long virtualMemoryReservedKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtual_memory_committed_kb")
    private long virtualMemoryCommittedKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "awe_allocated_kb")
    private long aweAllocatedKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shared_memory_reserved_kb")
    private long sharedMemoryReservedKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shared_memory_committed_kb")
    private long sharedMemoryCommittedKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "page_size_in_bytes")
    private long pageSizeInBytes;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "page_allocator_address")
    private byte[] pageAllocatorAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "host_address")
    private byte[] hostAddress;
    @Size(max = 60)
    @Column(name = "parent_memory_broker_type")
    private String parentMemoryBrokerType;

    public DmOsMemoryClerks() {
    }

    public byte[] getMemoryClerkAddress() {
        return memoryClerkAddress;
    }

    public void setMemoryClerkAddress(byte[] memoryClerkAddress) {
        this.memoryClerkAddress = memoryClerkAddress;
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

    public long getPagesKb() {
        return pagesKb;
    }

    public void setPagesKb(long pagesKb) {
        this.pagesKb = pagesKb;
    }

    public long getVirtualMemoryReservedKb() {
        return virtualMemoryReservedKb;
    }

    public void setVirtualMemoryReservedKb(long virtualMemoryReservedKb) {
        this.virtualMemoryReservedKb = virtualMemoryReservedKb;
    }

    public long getVirtualMemoryCommittedKb() {
        return virtualMemoryCommittedKb;
    }

    public void setVirtualMemoryCommittedKb(long virtualMemoryCommittedKb) {
        this.virtualMemoryCommittedKb = virtualMemoryCommittedKb;
    }

    public long getAweAllocatedKb() {
        return aweAllocatedKb;
    }

    public void setAweAllocatedKb(long aweAllocatedKb) {
        this.aweAllocatedKb = aweAllocatedKb;
    }

    public long getSharedMemoryReservedKb() {
        return sharedMemoryReservedKb;
    }

    public void setSharedMemoryReservedKb(long sharedMemoryReservedKb) {
        this.sharedMemoryReservedKb = sharedMemoryReservedKb;
    }

    public long getSharedMemoryCommittedKb() {
        return sharedMemoryCommittedKb;
    }

    public void setSharedMemoryCommittedKb(long sharedMemoryCommittedKb) {
        this.sharedMemoryCommittedKb = sharedMemoryCommittedKb;
    }

    public long getPageSizeInBytes() {
        return pageSizeInBytes;
    }

    public void setPageSizeInBytes(long pageSizeInBytes) {
        this.pageSizeInBytes = pageSizeInBytes;
    }

    public byte[] getPageAllocatorAddress() {
        return pageAllocatorAddress;
    }

    public void setPageAllocatorAddress(byte[] pageAllocatorAddress) {
        this.pageAllocatorAddress = pageAllocatorAddress;
    }

    public byte[] getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(byte[] hostAddress) {
        this.hostAddress = hostAddress;
    }

    public String getParentMemoryBrokerType() {
        return parentMemoryBrokerType;
    }

    public void setParentMemoryBrokerType(String parentMemoryBrokerType) {
        this.parentMemoryBrokerType = parentMemoryBrokerType;
    }
    
}
