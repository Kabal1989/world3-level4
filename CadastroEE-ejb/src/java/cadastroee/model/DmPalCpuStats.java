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
@Table(name = "dm_pal_cpu_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmPalCpuStats.findAll", query = "SELECT d FROM DmPalCpuStats d"),
    @NamedQuery(name = "DmPalCpuStats.findByUptimeSecs", query = "SELECT d FROM DmPalCpuStats d WHERE d.uptimeSecs = :uptimeSecs"),
    @NamedQuery(name = "DmPalCpuStats.findByLoadavg1min", query = "SELECT d FROM DmPalCpuStats d WHERE d.loadavg1min = :loadavg1min"),
    @NamedQuery(name = "DmPalCpuStats.findByUserTimeCs", query = "SELECT d FROM DmPalCpuStats d WHERE d.userTimeCs = :userTimeCs"),
    @NamedQuery(name = "DmPalCpuStats.findByNiceTimeCs", query = "SELECT d FROM DmPalCpuStats d WHERE d.niceTimeCs = :niceTimeCs"),
    @NamedQuery(name = "DmPalCpuStats.findBySystemTimeCs", query = "SELECT d FROM DmPalCpuStats d WHERE d.systemTimeCs = :systemTimeCs"),
    @NamedQuery(name = "DmPalCpuStats.findByIdleTimeCs", query = "SELECT d FROM DmPalCpuStats d WHERE d.idleTimeCs = :idleTimeCs"),
    @NamedQuery(name = "DmPalCpuStats.findByIowaitTimeCs", query = "SELECT d FROM DmPalCpuStats d WHERE d.iowaitTimeCs = :iowaitTimeCs"),
    @NamedQuery(name = "DmPalCpuStats.findByIrqTimeCs", query = "SELECT d FROM DmPalCpuStats d WHERE d.irqTimeCs = :irqTimeCs"),
    @NamedQuery(name = "DmPalCpuStats.findBySoftirqTimeCs", query = "SELECT d FROM DmPalCpuStats d WHERE d.softirqTimeCs = :softirqTimeCs"),
    @NamedQuery(name = "DmPalCpuStats.findByInterruptCnt", query = "SELECT d FROM DmPalCpuStats d WHERE d.interruptCnt = :interruptCnt"),
    @NamedQuery(name = "DmPalCpuStats.findByCswCnt", query = "SELECT d FROM DmPalCpuStats d WHERE d.cswCnt = :cswCnt"),
    @NamedQuery(name = "DmPalCpuStats.findByBootTimeSecs", query = "SELECT d FROM DmPalCpuStats d WHERE d.bootTimeSecs = :bootTimeSecs"),
    @NamedQuery(name = "DmPalCpuStats.findByTotalForksCnt", query = "SELECT d FROM DmPalCpuStats d WHERE d.totalForksCnt = :totalForksCnt"),
    @NamedQuery(name = "DmPalCpuStats.findByProcRunableCnt", query = "SELECT d FROM DmPalCpuStats d WHERE d.procRunableCnt = :procRunableCnt"),
    @NamedQuery(name = "DmPalCpuStats.findByProcIoblockedCnt", query = "SELECT d FROM DmPalCpuStats d WHERE d.procIoblockedCnt = :procIoblockedCnt"),
    @NamedQuery(name = "DmPalCpuStats.findByC3time", query = "SELECT d FROM DmPalCpuStats d WHERE d.c3time = :c3time"),
    @NamedQuery(name = "DmPalCpuStats.findByC2time", query = "SELECT d FROM DmPalCpuStats d WHERE d.c2time = :c2time"),
    @NamedQuery(name = "DmPalCpuStats.findByC1time", query = "SELECT d FROM DmPalCpuStats d WHERE d.c1time = :c1time"),
    @NamedQuery(name = "DmPalCpuStats.findByC3count", query = "SELECT d FROM DmPalCpuStats d WHERE d.c3count = :c3count"),
    @NamedQuery(name = "DmPalCpuStats.findByC2count", query = "SELECT d FROM DmPalCpuStats d WHERE d.c2count = :c2count"),
    @NamedQuery(name = "DmPalCpuStats.findByC1count", query = "SELECT d FROM DmPalCpuStats d WHERE d.c1count = :c1count")})
public class DmPalCpuStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uptime_secs")
    private double uptimeSecs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "loadavg_1min")
    private double loadavg1min;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_time_cs")
    private long userTimeCs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nice_time_cs")
    private long niceTimeCs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_time_cs")
    private long systemTimeCs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idle_time_cs")
    private long idleTimeCs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iowait_time_cs")
    private long iowaitTimeCs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "irq_time_cs")
    private long irqTimeCs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "softirq_time_cs")
    private long softirqTimeCs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "interrupt_cnt")
    private long interruptCnt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "csw_cnt")
    private long cswCnt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "boot_time_secs")
    private long bootTimeSecs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_forks_cnt")
    private long totalForksCnt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "proc_runable_cnt")
    private long procRunableCnt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "proc_ioblocked_cnt")
    private long procIoblockedCnt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "C3_time")
    private long c3time;
    @Basic(optional = false)
    @NotNull
    @Column(name = "C2_time")
    private long c2time;
    @Basic(optional = false)
    @NotNull
    @Column(name = "C1_time")
    private long c1time;
    @Basic(optional = false)
    @NotNull
    @Column(name = "C3_count")
    private long c3count;
    @Basic(optional = false)
    @NotNull
    @Column(name = "C2_count")
    private long c2count;
    @Basic(optional = false)
    @NotNull
    @Column(name = "C1_count")
    private long c1count;

    public DmPalCpuStats() {
    }

    public double getUptimeSecs() {
        return uptimeSecs;
    }

    public void setUptimeSecs(double uptimeSecs) {
        this.uptimeSecs = uptimeSecs;
    }

    public double getLoadavg1min() {
        return loadavg1min;
    }

    public void setLoadavg1min(double loadavg1min) {
        this.loadavg1min = loadavg1min;
    }

    public long getUserTimeCs() {
        return userTimeCs;
    }

    public void setUserTimeCs(long userTimeCs) {
        this.userTimeCs = userTimeCs;
    }

    public long getNiceTimeCs() {
        return niceTimeCs;
    }

    public void setNiceTimeCs(long niceTimeCs) {
        this.niceTimeCs = niceTimeCs;
    }

    public long getSystemTimeCs() {
        return systemTimeCs;
    }

    public void setSystemTimeCs(long systemTimeCs) {
        this.systemTimeCs = systemTimeCs;
    }

    public long getIdleTimeCs() {
        return idleTimeCs;
    }

    public void setIdleTimeCs(long idleTimeCs) {
        this.idleTimeCs = idleTimeCs;
    }

    public long getIowaitTimeCs() {
        return iowaitTimeCs;
    }

    public void setIowaitTimeCs(long iowaitTimeCs) {
        this.iowaitTimeCs = iowaitTimeCs;
    }

    public long getIrqTimeCs() {
        return irqTimeCs;
    }

    public void setIrqTimeCs(long irqTimeCs) {
        this.irqTimeCs = irqTimeCs;
    }

    public long getSoftirqTimeCs() {
        return softirqTimeCs;
    }

    public void setSoftirqTimeCs(long softirqTimeCs) {
        this.softirqTimeCs = softirqTimeCs;
    }

    public long getInterruptCnt() {
        return interruptCnt;
    }

    public void setInterruptCnt(long interruptCnt) {
        this.interruptCnt = interruptCnt;
    }

    public long getCswCnt() {
        return cswCnt;
    }

    public void setCswCnt(long cswCnt) {
        this.cswCnt = cswCnt;
    }

    public long getBootTimeSecs() {
        return bootTimeSecs;
    }

    public void setBootTimeSecs(long bootTimeSecs) {
        this.bootTimeSecs = bootTimeSecs;
    }

    public long getTotalForksCnt() {
        return totalForksCnt;
    }

    public void setTotalForksCnt(long totalForksCnt) {
        this.totalForksCnt = totalForksCnt;
    }

    public long getProcRunableCnt() {
        return procRunableCnt;
    }

    public void setProcRunableCnt(long procRunableCnt) {
        this.procRunableCnt = procRunableCnt;
    }

    public long getProcIoblockedCnt() {
        return procIoblockedCnt;
    }

    public void setProcIoblockedCnt(long procIoblockedCnt) {
        this.procIoblockedCnt = procIoblockedCnt;
    }

    public long getC3time() {
        return c3time;
    }

    public void setC3time(long c3time) {
        this.c3time = c3time;
    }

    public long getC2time() {
        return c2time;
    }

    public void setC2time(long c2time) {
        this.c2time = c2time;
    }

    public long getC1time() {
        return c1time;
    }

    public void setC1time(long c1time) {
        this.c1time = c1time;
    }

    public long getC3count() {
        return c3count;
    }

    public void setC3count(long c3count) {
        this.c3count = c3count;
    }

    public long getC2count() {
        return c2count;
    }

    public void setC2count(long c2count) {
        this.c2count = c2count;
    }

    public long getC1count() {
        return c1count;
    }

    public void setC1count(long c1count) {
        this.c1count = c1count;
    }
    
}
