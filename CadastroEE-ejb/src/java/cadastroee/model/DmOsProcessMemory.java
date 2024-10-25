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
@Table(name = "dm_os_process_memory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsProcessMemory.findAll", query = "SELECT d FROM DmOsProcessMemory d"),
    @NamedQuery(name = "DmOsProcessMemory.findByPhysicalMemoryInUseKb", query = "SELECT d FROM DmOsProcessMemory d WHERE d.physicalMemoryInUseKb = :physicalMemoryInUseKb"),
    @NamedQuery(name = "DmOsProcessMemory.findByLargePageAllocationsKb", query = "SELECT d FROM DmOsProcessMemory d WHERE d.largePageAllocationsKb = :largePageAllocationsKb"),
    @NamedQuery(name = "DmOsProcessMemory.findByLockedPageAllocationsKb", query = "SELECT d FROM DmOsProcessMemory d WHERE d.lockedPageAllocationsKb = :lockedPageAllocationsKb"),
    @NamedQuery(name = "DmOsProcessMemory.findByTotalVirtualAddressSpaceKb", query = "SELECT d FROM DmOsProcessMemory d WHERE d.totalVirtualAddressSpaceKb = :totalVirtualAddressSpaceKb"),
    @NamedQuery(name = "DmOsProcessMemory.findByVirtualAddressSpaceReservedKb", query = "SELECT d FROM DmOsProcessMemory d WHERE d.virtualAddressSpaceReservedKb = :virtualAddressSpaceReservedKb"),
    @NamedQuery(name = "DmOsProcessMemory.findByVirtualAddressSpaceCommittedKb", query = "SELECT d FROM DmOsProcessMemory d WHERE d.virtualAddressSpaceCommittedKb = :virtualAddressSpaceCommittedKb"),
    @NamedQuery(name = "DmOsProcessMemory.findByVirtualAddressSpaceAvailableKb", query = "SELECT d FROM DmOsProcessMemory d WHERE d.virtualAddressSpaceAvailableKb = :virtualAddressSpaceAvailableKb"),
    @NamedQuery(name = "DmOsProcessMemory.findByPageFaultCount", query = "SELECT d FROM DmOsProcessMemory d WHERE d.pageFaultCount = :pageFaultCount"),
    @NamedQuery(name = "DmOsProcessMemory.findByMemoryUtilizationPercentage", query = "SELECT d FROM DmOsProcessMemory d WHERE d.memoryUtilizationPercentage = :memoryUtilizationPercentage"),
    @NamedQuery(name = "DmOsProcessMemory.findByAvailableCommitLimitKb", query = "SELECT d FROM DmOsProcessMemory d WHERE d.availableCommitLimitKb = :availableCommitLimitKb"),
    @NamedQuery(name = "DmOsProcessMemory.findByProcessPhysicalMemoryLow", query = "SELECT d FROM DmOsProcessMemory d WHERE d.processPhysicalMemoryLow = :processPhysicalMemoryLow"),
    @NamedQuery(name = "DmOsProcessMemory.findByProcessVirtualMemoryLow", query = "SELECT d FROM DmOsProcessMemory d WHERE d.processVirtualMemoryLow = :processVirtualMemoryLow")})
public class DmOsProcessMemory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "physical_memory_in_use_kb")
    private long physicalMemoryInUseKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "large_page_allocations_kb")
    private long largePageAllocationsKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "locked_page_allocations_kb")
    private long lockedPageAllocationsKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_virtual_address_space_kb")
    private long totalVirtualAddressSpaceKb;
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
    @Column(name = "virtual_address_space_available_kb")
    private long virtualAddressSpaceAvailableKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "page_fault_count")
    private long pageFaultCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "memory_utilization_percentage")
    private int memoryUtilizationPercentage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "available_commit_limit_kb")
    private long availableCommitLimitKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "process_physical_memory_low")
    private boolean processPhysicalMemoryLow;
    @Basic(optional = false)
    @NotNull
    @Column(name = "process_virtual_memory_low")
    private boolean processVirtualMemoryLow;

    public DmOsProcessMemory() {
    }

    public long getPhysicalMemoryInUseKb() {
        return physicalMemoryInUseKb;
    }

    public void setPhysicalMemoryInUseKb(long physicalMemoryInUseKb) {
        this.physicalMemoryInUseKb = physicalMemoryInUseKb;
    }

    public long getLargePageAllocationsKb() {
        return largePageAllocationsKb;
    }

    public void setLargePageAllocationsKb(long largePageAllocationsKb) {
        this.largePageAllocationsKb = largePageAllocationsKb;
    }

    public long getLockedPageAllocationsKb() {
        return lockedPageAllocationsKb;
    }

    public void setLockedPageAllocationsKb(long lockedPageAllocationsKb) {
        this.lockedPageAllocationsKb = lockedPageAllocationsKb;
    }

    public long getTotalVirtualAddressSpaceKb() {
        return totalVirtualAddressSpaceKb;
    }

    public void setTotalVirtualAddressSpaceKb(long totalVirtualAddressSpaceKb) {
        this.totalVirtualAddressSpaceKb = totalVirtualAddressSpaceKb;
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

    public long getVirtualAddressSpaceAvailableKb() {
        return virtualAddressSpaceAvailableKb;
    }

    public void setVirtualAddressSpaceAvailableKb(long virtualAddressSpaceAvailableKb) {
        this.virtualAddressSpaceAvailableKb = virtualAddressSpaceAvailableKb;
    }

    public long getPageFaultCount() {
        return pageFaultCount;
    }

    public void setPageFaultCount(long pageFaultCount) {
        this.pageFaultCount = pageFaultCount;
    }

    public int getMemoryUtilizationPercentage() {
        return memoryUtilizationPercentage;
    }

    public void setMemoryUtilizationPercentage(int memoryUtilizationPercentage) {
        this.memoryUtilizationPercentage = memoryUtilizationPercentage;
    }

    public long getAvailableCommitLimitKb() {
        return availableCommitLimitKb;
    }

    public void setAvailableCommitLimitKb(long availableCommitLimitKb) {
        this.availableCommitLimitKb = availableCommitLimitKb;
    }

    public boolean getProcessPhysicalMemoryLow() {
        return processPhysicalMemoryLow;
    }

    public void setProcessPhysicalMemoryLow(boolean processPhysicalMemoryLow) {
        this.processPhysicalMemoryLow = processPhysicalMemoryLow;
    }

    public boolean getProcessVirtualMemoryLow() {
        return processVirtualMemoryLow;
    }

    public void setProcessVirtualMemoryLow(boolean processVirtualMemoryLow) {
        this.processVirtualMemoryLow = processVirtualMemoryLow;
    }
    
}
