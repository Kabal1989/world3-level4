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
@Table(name = "dm_pal_processes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmPalProcesses.findAll", query = "SELECT d FROM DmPalProcesses d"),
    @NamedQuery(name = "DmPalProcesses.findByProcessId", query = "SELECT d FROM DmPalProcesses d WHERE d.processId = :processId"),
    @NamedQuery(name = "DmPalProcesses.findByProcessName", query = "SELECT d FROM DmPalProcesses d WHERE d.processName = :processName"),
    @NamedQuery(name = "DmPalProcesses.findByProcessorTime", query = "SELECT d FROM DmPalProcesses d WHERE d.processorTime = :processorTime"),
    @NamedQuery(name = "DmPalProcesses.findByUserTime", query = "SELECT d FROM DmPalProcesses d WHERE d.userTime = :userTime"),
    @NamedQuery(name = "DmPalProcesses.findByPrivilegedTime", query = "SELECT d FROM DmPalProcesses d WHERE d.privilegedTime = :privilegedTime"),
    @NamedQuery(name = "DmPalProcesses.findByVirtualBytesPeak", query = "SELECT d FROM DmPalProcesses d WHERE d.virtualBytesPeak = :virtualBytesPeak"),
    @NamedQuery(name = "DmPalProcesses.findByVirtualBytes", query = "SELECT d FROM DmPalProcesses d WHERE d.virtualBytes = :virtualBytes"),
    @NamedQuery(name = "DmPalProcesses.findByWorkingSetPeak", query = "SELECT d FROM DmPalProcesses d WHERE d.workingSetPeak = :workingSetPeak"),
    @NamedQuery(name = "DmPalProcesses.findByWorkingSet", query = "SELECT d FROM DmPalProcesses d WHERE d.workingSet = :workingSet"),
    @NamedQuery(name = "DmPalProcesses.findByPageFileBytesPeak", query = "SELECT d FROM DmPalProcesses d WHERE d.pageFileBytesPeak = :pageFileBytesPeak"),
    @NamedQuery(name = "DmPalProcesses.findByPageFileBytes", query = "SELECT d FROM DmPalProcesses d WHERE d.pageFileBytes = :pageFileBytes"),
    @NamedQuery(name = "DmPalProcesses.findByPrivateBytes", query = "SELECT d FROM DmPalProcesses d WHERE d.privateBytes = :privateBytes"),
    @NamedQuery(name = "DmPalProcesses.findByThreadCount", query = "SELECT d FROM DmPalProcesses d WHERE d.threadCount = :threadCount"),
    @NamedQuery(name = "DmPalProcesses.findByElapsedTime", query = "SELECT d FROM DmPalProcesses d WHERE d.elapsedTime = :elapsedTime"),
    @NamedQuery(name = "DmPalProcesses.findByPoolPagedBytes", query = "SELECT d FROM DmPalProcesses d WHERE d.poolPagedBytes = :poolPagedBytes"),
    @NamedQuery(name = "DmPalProcesses.findByHandleCount", query = "SELECT d FROM DmPalProcesses d WHERE d.handleCount = :handleCount"),
    @NamedQuery(name = "DmPalProcesses.findByIoReadOperations", query = "SELECT d FROM DmPalProcesses d WHERE d.ioReadOperations = :ioReadOperations"),
    @NamedQuery(name = "DmPalProcesses.findByIoWriteOperations", query = "SELECT d FROM DmPalProcesses d WHERE d.ioWriteOperations = :ioWriteOperations"),
    @NamedQuery(name = "DmPalProcesses.findByIoReadBytes", query = "SELECT d FROM DmPalProcesses d WHERE d.ioReadBytes = :ioReadBytes"),
    @NamedQuery(name = "DmPalProcesses.findByIoWriteBytes", query = "SELECT d FROM DmPalProcesses d WHERE d.ioWriteBytes = :ioWriteBytes"),
    @NamedQuery(name = "DmPalProcesses.findByWorkingSetPrivate", query = "SELECT d FROM DmPalProcesses d WHERE d.workingSetPrivate = :workingSetPrivate")})
public class DmPalProcesses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "process_id")
    private long processId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "process_name")
    private String processName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "processor_time")
    private long processorTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_time")
    private long userTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "privileged_time")
    private long privilegedTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtual_bytes_peak")
    private long virtualBytesPeak;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtual_bytes")
    private long virtualBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "working_set_peak")
    private long workingSetPeak;
    @Basic(optional = false)
    @NotNull
    @Column(name = "working_set")
    private long workingSet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "page_file_bytes_peak")
    private long pageFileBytesPeak;
    @Basic(optional = false)
    @NotNull
    @Column(name = "page_file_bytes")
    private long pageFileBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "private_bytes")
    private long privateBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "thread_count")
    private long threadCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "elapsed_time")
    private long elapsedTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pool_paged_bytes")
    private long poolPagedBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "handle_count")
    private long handleCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "io_read_operations")
    private long ioReadOperations;
    @Basic(optional = false)
    @NotNull
    @Column(name = "io_write_operations")
    private long ioWriteOperations;
    @Basic(optional = false)
    @NotNull
    @Column(name = "io_read_bytes")
    private long ioReadBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "io_write_bytes")
    private long ioWriteBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "working_set_private")
    private long workingSetPrivate;

    public DmPalProcesses() {
    }

    public long getProcessId() {
        return processId;
    }

    public void setProcessId(long processId) {
        this.processId = processId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public long getProcessorTime() {
        return processorTime;
    }

    public void setProcessorTime(long processorTime) {
        this.processorTime = processorTime;
    }

    public long getUserTime() {
        return userTime;
    }

    public void setUserTime(long userTime) {
        this.userTime = userTime;
    }

    public long getPrivilegedTime() {
        return privilegedTime;
    }

    public void setPrivilegedTime(long privilegedTime) {
        this.privilegedTime = privilegedTime;
    }

    public long getVirtualBytesPeak() {
        return virtualBytesPeak;
    }

    public void setVirtualBytesPeak(long virtualBytesPeak) {
        this.virtualBytesPeak = virtualBytesPeak;
    }

    public long getVirtualBytes() {
        return virtualBytes;
    }

    public void setVirtualBytes(long virtualBytes) {
        this.virtualBytes = virtualBytes;
    }

    public long getWorkingSetPeak() {
        return workingSetPeak;
    }

    public void setWorkingSetPeak(long workingSetPeak) {
        this.workingSetPeak = workingSetPeak;
    }

    public long getWorkingSet() {
        return workingSet;
    }

    public void setWorkingSet(long workingSet) {
        this.workingSet = workingSet;
    }

    public long getPageFileBytesPeak() {
        return pageFileBytesPeak;
    }

    public void setPageFileBytesPeak(long pageFileBytesPeak) {
        this.pageFileBytesPeak = pageFileBytesPeak;
    }

    public long getPageFileBytes() {
        return pageFileBytes;
    }

    public void setPageFileBytes(long pageFileBytes) {
        this.pageFileBytes = pageFileBytes;
    }

    public long getPrivateBytes() {
        return privateBytes;
    }

    public void setPrivateBytes(long privateBytes) {
        this.privateBytes = privateBytes;
    }

    public long getThreadCount() {
        return threadCount;
    }

    public void setThreadCount(long threadCount) {
        this.threadCount = threadCount;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public long getPoolPagedBytes() {
        return poolPagedBytes;
    }

    public void setPoolPagedBytes(long poolPagedBytes) {
        this.poolPagedBytes = poolPagedBytes;
    }

    public long getHandleCount() {
        return handleCount;
    }

    public void setHandleCount(long handleCount) {
        this.handleCount = handleCount;
    }

    public long getIoReadOperations() {
        return ioReadOperations;
    }

    public void setIoReadOperations(long ioReadOperations) {
        this.ioReadOperations = ioReadOperations;
    }

    public long getIoWriteOperations() {
        return ioWriteOperations;
    }

    public void setIoWriteOperations(long ioWriteOperations) {
        this.ioWriteOperations = ioWriteOperations;
    }

    public long getIoReadBytes() {
        return ioReadBytes;
    }

    public void setIoReadBytes(long ioReadBytes) {
        this.ioReadBytes = ioReadBytes;
    }

    public long getIoWriteBytes() {
        return ioWriteBytes;
    }

    public void setIoWriteBytes(long ioWriteBytes) {
        this.ioWriteBytes = ioWriteBytes;
    }

    public long getWorkingSetPrivate() {
        return workingSetPrivate;
    }

    public void setWorkingSetPrivate(long workingSetPrivate) {
        this.workingSetPrivate = workingSetPrivate;
    }
    
}
