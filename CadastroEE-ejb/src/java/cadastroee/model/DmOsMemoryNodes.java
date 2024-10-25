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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_os_memory_nodes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsMemoryNodes.findAll", query = "SELECT d FROM DmOsMemoryNodes d"),
    @NamedQuery(name = "DmOsMemoryNodes.findByMemoryNodeId", query = "SELECT d FROM DmOsMemoryNodes d WHERE d.memoryNodeId = :memoryNodeId"),
    @NamedQuery(name = "DmOsMemoryNodes.findByVirtualAddressSpaceReservedKb", query = "SELECT d FROM DmOsMemoryNodes d WHERE d.virtualAddressSpaceReservedKb = :virtualAddressSpaceReservedKb"),
    @NamedQuery(name = "DmOsMemoryNodes.findByVirtualAddressSpaceCommittedKb", query = "SELECT d FROM DmOsMemoryNodes d WHERE d.virtualAddressSpaceCommittedKb = :virtualAddressSpaceCommittedKb"),
    @NamedQuery(name = "DmOsMemoryNodes.findByLockedPageAllocationsKb", query = "SELECT d FROM DmOsMemoryNodes d WHERE d.lockedPageAllocationsKb = :lockedPageAllocationsKb"),
    @NamedQuery(name = "DmOsMemoryNodes.findByPagesKb", query = "SELECT d FROM DmOsMemoryNodes d WHERE d.pagesKb = :pagesKb"),
    @NamedQuery(name = "DmOsMemoryNodes.findBySharedMemoryReservedKb", query = "SELECT d FROM DmOsMemoryNodes d WHERE d.sharedMemoryReservedKb = :sharedMemoryReservedKb"),
    @NamedQuery(name = "DmOsMemoryNodes.findBySharedMemoryCommittedKb", query = "SELECT d FROM DmOsMemoryNodes d WHERE d.sharedMemoryCommittedKb = :sharedMemoryCommittedKb"),
    @NamedQuery(name = "DmOsMemoryNodes.findByCpuAffinityMask", query = "SELECT d FROM DmOsMemoryNodes d WHERE d.cpuAffinityMask = :cpuAffinityMask"),
    @NamedQuery(name = "DmOsMemoryNodes.findByOnlineSchedulerMask", query = "SELECT d FROM DmOsMemoryNodes d WHERE d.onlineSchedulerMask = :onlineSchedulerMask"),
    @NamedQuery(name = "DmOsMemoryNodes.findByProcessorGroup", query = "SELECT d FROM DmOsMemoryNodes d WHERE d.processorGroup = :processorGroup"),
    @NamedQuery(name = "DmOsMemoryNodes.findByForeignCommittedKb", query = "SELECT d FROM DmOsMemoryNodes d WHERE d.foreignCommittedKb = :foreignCommittedKb"),
    @NamedQuery(name = "DmOsMemoryNodes.findByTargetKb", query = "SELECT d FROM DmOsMemoryNodes d WHERE d.targetKb = :targetKb")})
public class DmOsMemoryNodes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "memory_node_id")
    private short memoryNodeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtual_address_space_reserved_kb")
    private long virtualAddressSpaceReservedKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtual_address_space_committed_kb")
    private long virtualAddressSpaceCommittedKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "locked_page_allocations_kb")
    private long lockedPageAllocationsKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pages_kb")
    private long pagesKb;
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
    @Column(name = "cpu_affinity_mask")
    private long cpuAffinityMask;
    @Basic(optional = false)
    @NotNull
    @Column(name = "online_scheduler_mask")
    private long onlineSchedulerMask;
    @Basic(optional = false)
    @NotNull
    @Column(name = "processor_group")
    private short processorGroup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "foreign_committed_kb")
    private long foreignCommittedKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "target_kb")
    private long targetKb;

    public DmOsMemoryNodes() {
    }

    public short getMemoryNodeId() {
        return memoryNodeId;
    }

    public void setMemoryNodeId(short memoryNodeId) {
        this.memoryNodeId = memoryNodeId;
    }

    public long getVirtualAddressSpaceReservedKb() {
        return virtualAddressSpaceReservedKb;
    }

    public void setVirtualAddressSpaceReservedKb(long virtualAddressSpaceReservedKb) {
        this.virtualAddressSpaceReservedKb = virtualAddressSpaceReservedKb;
    }

    public long getVirtualAddressSpaceCommittedKb() {
        return virtualAddressSpaceCommittedKb;
    }

    public void setVirtualAddressSpaceCommittedKb(long virtualAddressSpaceCommittedKb) {
        this.virtualAddressSpaceCommittedKb = virtualAddressSpaceCommittedKb;
    }

    public long getLockedPageAllocationsKb() {
        return lockedPageAllocationsKb;
    }

    public void setLockedPageAllocationsKb(long lockedPageAllocationsKb) {
        this.lockedPageAllocationsKb = lockedPageAllocationsKb;
    }

    public long getPagesKb() {
        return pagesKb;
    }

    public void setPagesKb(long pagesKb) {
        this.pagesKb = pagesKb;
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

    public long getCpuAffinityMask() {
        return cpuAffinityMask;
    }

    public void setCpuAffinityMask(long cpuAffinityMask) {
        this.cpuAffinityMask = cpuAffinityMask;
    }

    public long getOnlineSchedulerMask() {
        return onlineSchedulerMask;
    }

    public void setOnlineSchedulerMask(long onlineSchedulerMask) {
        this.onlineSchedulerMask = onlineSchedulerMask;
    }

    public short getProcessorGroup() {
        return processorGroup;
    }

    public void setProcessorGroup(short processorGroup) {
        this.processorGroup = processorGroup;
    }

    public long getForeignCommittedKb() {
        return foreignCommittedKb;
    }

    public void setForeignCommittedKb(long foreignCommittedKb) {
        this.foreignCommittedKb = foreignCommittedKb;
    }

    public long getTargetKb() {
        return targetKb;
    }

    public void setTargetKb(long targetKb) {
        this.targetKb = targetKb;
    }
    
}
