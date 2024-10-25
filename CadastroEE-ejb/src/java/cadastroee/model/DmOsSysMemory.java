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
@Table(name = "dm_os_sys_memory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsSysMemory.findAll", query = "SELECT d FROM DmOsSysMemory d"),
    @NamedQuery(name = "DmOsSysMemory.findByTotalPhysicalMemoryKb", query = "SELECT d FROM DmOsSysMemory d WHERE d.totalPhysicalMemoryKb = :totalPhysicalMemoryKb"),
    @NamedQuery(name = "DmOsSysMemory.findByAvailablePhysicalMemoryKb", query = "SELECT d FROM DmOsSysMemory d WHERE d.availablePhysicalMemoryKb = :availablePhysicalMemoryKb"),
    @NamedQuery(name = "DmOsSysMemory.findByTotalPageFileKb", query = "SELECT d FROM DmOsSysMemory d WHERE d.totalPageFileKb = :totalPageFileKb"),
    @NamedQuery(name = "DmOsSysMemory.findByAvailablePageFileKb", query = "SELECT d FROM DmOsSysMemory d WHERE d.availablePageFileKb = :availablePageFileKb"),
    @NamedQuery(name = "DmOsSysMemory.findBySystemCacheKb", query = "SELECT d FROM DmOsSysMemory d WHERE d.systemCacheKb = :systemCacheKb"),
    @NamedQuery(name = "DmOsSysMemory.findByKernelPagedPoolKb", query = "SELECT d FROM DmOsSysMemory d WHERE d.kernelPagedPoolKb = :kernelPagedPoolKb"),
    @NamedQuery(name = "DmOsSysMemory.findByKernelNonpagedPoolKb", query = "SELECT d FROM DmOsSysMemory d WHERE d.kernelNonpagedPoolKb = :kernelNonpagedPoolKb"),
    @NamedQuery(name = "DmOsSysMemory.findBySystemHighMemorySignalState", query = "SELECT d FROM DmOsSysMemory d WHERE d.systemHighMemorySignalState = :systemHighMemorySignalState"),
    @NamedQuery(name = "DmOsSysMemory.findBySystemLowMemorySignalState", query = "SELECT d FROM DmOsSysMemory d WHERE d.systemLowMemorySignalState = :systemLowMemorySignalState"),
    @NamedQuery(name = "DmOsSysMemory.findBySystemMemoryStateDesc", query = "SELECT d FROM DmOsSysMemory d WHERE d.systemMemoryStateDesc = :systemMemoryStateDesc")})
public class DmOsSysMemory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_physical_memory_kb")
    private long totalPhysicalMemoryKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "available_physical_memory_kb")
    private long availablePhysicalMemoryKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_page_file_kb")
    private long totalPageFileKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "available_page_file_kb")
    private long availablePageFileKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_cache_kb")
    private long systemCacheKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kernel_paged_pool_kb")
    private long kernelPagedPoolKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kernel_nonpaged_pool_kb")
    private long kernelNonpagedPoolKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_high_memory_signal_state")
    private boolean systemHighMemorySignalState;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_low_memory_signal_state")
    private boolean systemLowMemorySignalState;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "system_memory_state_desc")
    private String systemMemoryStateDesc;

    public DmOsSysMemory() {
    }

    public long getTotalPhysicalMemoryKb() {
        return totalPhysicalMemoryKb;
    }

    public void setTotalPhysicalMemoryKb(long totalPhysicalMemoryKb) {
        this.totalPhysicalMemoryKb = totalPhysicalMemoryKb;
    }

    public long getAvailablePhysicalMemoryKb() {
        return availablePhysicalMemoryKb;
    }

    public void setAvailablePhysicalMemoryKb(long availablePhysicalMemoryKb) {
        this.availablePhysicalMemoryKb = availablePhysicalMemoryKb;
    }

    public long getTotalPageFileKb() {
        return totalPageFileKb;
    }

    public void setTotalPageFileKb(long totalPageFileKb) {
        this.totalPageFileKb = totalPageFileKb;
    }

    public long getAvailablePageFileKb() {
        return availablePageFileKb;
    }

    public void setAvailablePageFileKb(long availablePageFileKb) {
        this.availablePageFileKb = availablePageFileKb;
    }

    public long getSystemCacheKb() {
        return systemCacheKb;
    }

    public void setSystemCacheKb(long systemCacheKb) {
        this.systemCacheKb = systemCacheKb;
    }

    public long getKernelPagedPoolKb() {
        return kernelPagedPoolKb;
    }

    public void setKernelPagedPoolKb(long kernelPagedPoolKb) {
        this.kernelPagedPoolKb = kernelPagedPoolKb;
    }

    public long getKernelNonpagedPoolKb() {
        return kernelNonpagedPoolKb;
    }

    public void setKernelNonpagedPoolKb(long kernelNonpagedPoolKb) {
        this.kernelNonpagedPoolKb = kernelNonpagedPoolKb;
    }

    public boolean getSystemHighMemorySignalState() {
        return systemHighMemorySignalState;
    }

    public void setSystemHighMemorySignalState(boolean systemHighMemorySignalState) {
        this.systemHighMemorySignalState = systemHighMemorySignalState;
    }

    public boolean getSystemLowMemorySignalState() {
        return systemLowMemorySignalState;
    }

    public void setSystemLowMemorySignalState(boolean systemLowMemorySignalState) {
        this.systemLowMemorySignalState = systemLowMemorySignalState;
    }

    public String getSystemMemoryStateDesc() {
        return systemMemoryStateDesc;
    }

    public void setSystemMemoryStateDesc(String systemMemoryStateDesc) {
        this.systemMemoryStateDesc = systemMemoryStateDesc;
    }
    
}
