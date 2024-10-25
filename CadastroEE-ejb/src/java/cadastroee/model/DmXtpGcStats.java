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
@Table(name = "dm_xtp_gc_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXtpGcStats.findAll", query = "SELECT d FROM DmXtpGcStats d"),
    @NamedQuery(name = "DmXtpGcStats.findByRowsExamined", query = "SELECT d FROM DmXtpGcStats d WHERE d.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "DmXtpGcStats.findByRowsNoSweepNeeded", query = "SELECT d FROM DmXtpGcStats d WHERE d.rowsNoSweepNeeded = :rowsNoSweepNeeded"),
    @NamedQuery(name = "DmXtpGcStats.findByRowsFirstInBucket", query = "SELECT d FROM DmXtpGcStats d WHERE d.rowsFirstInBucket = :rowsFirstInBucket"),
    @NamedQuery(name = "DmXtpGcStats.findByRowsFirstInBucketRemoved", query = "SELECT d FROM DmXtpGcStats d WHERE d.rowsFirstInBucketRemoved = :rowsFirstInBucketRemoved"),
    @NamedQuery(name = "DmXtpGcStats.findByRowsMarkedForUnlink", query = "SELECT d FROM DmXtpGcStats d WHERE d.rowsMarkedForUnlink = :rowsMarkedForUnlink"),
    @NamedQuery(name = "DmXtpGcStats.findByParallelAssistCount", query = "SELECT d FROM DmXtpGcStats d WHERE d.parallelAssistCount = :parallelAssistCount"),
    @NamedQuery(name = "DmXtpGcStats.findByIdleWorkerCount", query = "SELECT d FROM DmXtpGcStats d WHERE d.idleWorkerCount = :idleWorkerCount"),
    @NamedQuery(name = "DmXtpGcStats.findBySweepScansStarted", query = "SELECT d FROM DmXtpGcStats d WHERE d.sweepScansStarted = :sweepScansStarted"),
    @NamedQuery(name = "DmXtpGcStats.findBySweepScanRetries", query = "SELECT d FROM DmXtpGcStats d WHERE d.sweepScanRetries = :sweepScanRetries"),
    @NamedQuery(name = "DmXtpGcStats.findBySweepRowsTouched", query = "SELECT d FROM DmXtpGcStats d WHERE d.sweepRowsTouched = :sweepRowsTouched"),
    @NamedQuery(name = "DmXtpGcStats.findBySweepRowsExpiring", query = "SELECT d FROM DmXtpGcStats d WHERE d.sweepRowsExpiring = :sweepRowsExpiring"),
    @NamedQuery(name = "DmXtpGcStats.findBySweepRowsExpired", query = "SELECT d FROM DmXtpGcStats d WHERE d.sweepRowsExpired = :sweepRowsExpired"),
    @NamedQuery(name = "DmXtpGcStats.findBySweepRowsExpiredRemoved", query = "SELECT d FROM DmXtpGcStats d WHERE d.sweepRowsExpiredRemoved = :sweepRowsExpiredRemoved")})
public class DmXtpGcStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_examined")
    private long rowsExamined;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_no_sweep_needed")
    private long rowsNoSweepNeeded;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_first_in_bucket")
    private long rowsFirstInBucket;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_first_in_bucket_removed")
    private long rowsFirstInBucketRemoved;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_marked_for_unlink")
    private long rowsMarkedForUnlink;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parallel_assist_count")
    private long parallelAssistCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idle_worker_count")
    private long idleWorkerCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sweep_scans_started")
    private long sweepScansStarted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sweep_scan_retries")
    private long sweepScanRetries;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sweep_rows_touched")
    private long sweepRowsTouched;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sweep_rows_expiring")
    private long sweepRowsExpiring;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sweep_rows_expired")
    private long sweepRowsExpired;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sweep_rows_expired_removed")
    private long sweepRowsExpiredRemoved;

    public DmXtpGcStats() {
    }

    public long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public long getRowsNoSweepNeeded() {
        return rowsNoSweepNeeded;
    }

    public void setRowsNoSweepNeeded(long rowsNoSweepNeeded) {
        this.rowsNoSweepNeeded = rowsNoSweepNeeded;
    }

    public long getRowsFirstInBucket() {
        return rowsFirstInBucket;
    }

    public void setRowsFirstInBucket(long rowsFirstInBucket) {
        this.rowsFirstInBucket = rowsFirstInBucket;
    }

    public long getRowsFirstInBucketRemoved() {
        return rowsFirstInBucketRemoved;
    }

    public void setRowsFirstInBucketRemoved(long rowsFirstInBucketRemoved) {
        this.rowsFirstInBucketRemoved = rowsFirstInBucketRemoved;
    }

    public long getRowsMarkedForUnlink() {
        return rowsMarkedForUnlink;
    }

    public void setRowsMarkedForUnlink(long rowsMarkedForUnlink) {
        this.rowsMarkedForUnlink = rowsMarkedForUnlink;
    }

    public long getParallelAssistCount() {
        return parallelAssistCount;
    }

    public void setParallelAssistCount(long parallelAssistCount) {
        this.parallelAssistCount = parallelAssistCount;
    }

    public long getIdleWorkerCount() {
        return idleWorkerCount;
    }

    public void setIdleWorkerCount(long idleWorkerCount) {
        this.idleWorkerCount = idleWorkerCount;
    }

    public long getSweepScansStarted() {
        return sweepScansStarted;
    }

    public void setSweepScansStarted(long sweepScansStarted) {
        this.sweepScansStarted = sweepScansStarted;
    }

    public long getSweepScanRetries() {
        return sweepScanRetries;
    }

    public void setSweepScanRetries(long sweepScanRetries) {
        this.sweepScanRetries = sweepScanRetries;
    }

    public long getSweepRowsTouched() {
        return sweepRowsTouched;
    }

    public void setSweepRowsTouched(long sweepRowsTouched) {
        this.sweepRowsTouched = sweepRowsTouched;
    }

    public long getSweepRowsExpiring() {
        return sweepRowsExpiring;
    }

    public void setSweepRowsExpiring(long sweepRowsExpiring) {
        this.sweepRowsExpiring = sweepRowsExpiring;
    }

    public long getSweepRowsExpired() {
        return sweepRowsExpired;
    }

    public void setSweepRowsExpired(long sweepRowsExpired) {
        this.sweepRowsExpired = sweepRowsExpired;
    }

    public long getSweepRowsExpiredRemoved() {
        return sweepRowsExpiredRemoved;
    }

    public void setSweepRowsExpiredRemoved(long sweepRowsExpiredRemoved) {
        this.sweepRowsExpiredRemoved = sweepRowsExpiredRemoved;
    }
    
}
