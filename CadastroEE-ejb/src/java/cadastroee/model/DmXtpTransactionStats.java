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
@Table(name = "dm_xtp_transaction_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXtpTransactionStats.findAll", query = "SELECT d FROM DmXtpTransactionStats d"),
    @NamedQuery(name = "DmXtpTransactionStats.findByTotalCount", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.totalCount = :totalCount"),
    @NamedQuery(name = "DmXtpTransactionStats.findByReadOnlyCount", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.readOnlyCount = :readOnlyCount"),
    @NamedQuery(name = "DmXtpTransactionStats.findByTotalAborts", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.totalAborts = :totalAborts"),
    @NamedQuery(name = "DmXtpTransactionStats.findBySystemAborts", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.systemAborts = :systemAborts"),
    @NamedQuery(name = "DmXtpTransactionStats.findByValidationFailures", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.validationFailures = :validationFailures"),
    @NamedQuery(name = "DmXtpTransactionStats.findByDependenciesTaken", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.dependenciesTaken = :dependenciesTaken"),
    @NamedQuery(name = "DmXtpTransactionStats.findByDependenciesFailed", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.dependenciesFailed = :dependenciesFailed"),
    @NamedQuery(name = "DmXtpTransactionStats.findBySavepointCreate", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.savepointCreate = :savepointCreate"),
    @NamedQuery(name = "DmXtpTransactionStats.findBySavepointRollbacks", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.savepointRollbacks = :savepointRollbacks"),
    @NamedQuery(name = "DmXtpTransactionStats.findBySavepointRefreshes", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.savepointRefreshes = :savepointRefreshes"),
    @NamedQuery(name = "DmXtpTransactionStats.findByLogBytesWritten", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.logBytesWritten = :logBytesWritten"),
    @NamedQuery(name = "DmXtpTransactionStats.findByLogIOcount", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.logIOcount = :logIOcount"),
    @NamedQuery(name = "DmXtpTransactionStats.findByPhantomScansStarted", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.phantomScansStarted = :phantomScansStarted"),
    @NamedQuery(name = "DmXtpTransactionStats.findByPhantomScansRetries", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.phantomScansRetries = :phantomScansRetries"),
    @NamedQuery(name = "DmXtpTransactionStats.findByPhantomRowsTouched", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.phantomRowsTouched = :phantomRowsTouched"),
    @NamedQuery(name = "DmXtpTransactionStats.findByPhantomRowsExpiring", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.phantomRowsExpiring = :phantomRowsExpiring"),
    @NamedQuery(name = "DmXtpTransactionStats.findByPhantomRowsExpired", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.phantomRowsExpired = :phantomRowsExpired"),
    @NamedQuery(name = "DmXtpTransactionStats.findByPhantomRowsExpiredRemoved", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.phantomRowsExpiredRemoved = :phantomRowsExpiredRemoved"),
    @NamedQuery(name = "DmXtpTransactionStats.findByScansStarted", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.scansStarted = :scansStarted"),
    @NamedQuery(name = "DmXtpTransactionStats.findByScansRetried", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.scansRetried = :scansRetried"),
    @NamedQuery(name = "DmXtpTransactionStats.findByRowsReturned", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.rowsReturned = :rowsReturned"),
    @NamedQuery(name = "DmXtpTransactionStats.findByRowsTouched", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.rowsTouched = :rowsTouched"),
    @NamedQuery(name = "DmXtpTransactionStats.findByRowsExpiring", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.rowsExpiring = :rowsExpiring"),
    @NamedQuery(name = "DmXtpTransactionStats.findByRowsExpired", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.rowsExpired = :rowsExpired"),
    @NamedQuery(name = "DmXtpTransactionStats.findByRowsExpiredRemoved", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.rowsExpiredRemoved = :rowsExpiredRemoved"),
    @NamedQuery(name = "DmXtpTransactionStats.findByRowInsertAttempts", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.rowInsertAttempts = :rowInsertAttempts"),
    @NamedQuery(name = "DmXtpTransactionStats.findByRowUpdateAttempts", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.rowUpdateAttempts = :rowUpdateAttempts"),
    @NamedQuery(name = "DmXtpTransactionStats.findByRowDeleteAttempts", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.rowDeleteAttempts = :rowDeleteAttempts"),
    @NamedQuery(name = "DmXtpTransactionStats.findByWriteConflicts", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.writeConflicts = :writeConflicts"),
    @NamedQuery(name = "DmXtpTransactionStats.findByUniqueConstraintViolations", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.uniqueConstraintViolations = :uniqueConstraintViolations"),
    @NamedQuery(name = "DmXtpTransactionStats.findByDropTableMemoryAttempts", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.dropTableMemoryAttempts = :dropTableMemoryAttempts"),
    @NamedQuery(name = "DmXtpTransactionStats.findByDropTableMemoryFailures", query = "SELECT d FROM DmXtpTransactionStats d WHERE d.dropTableMemoryFailures = :dropTableMemoryFailures")})
public class DmXtpTransactionStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_count")
    private long totalCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "read_only_count")
    private long readOnlyCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_aborts")
    private long totalAborts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_aborts")
    private long systemAborts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "validation_failures")
    private long validationFailures;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dependencies_taken")
    private long dependenciesTaken;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dependencies_failed")
    private long dependenciesFailed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "savepoint_create")
    private long savepointCreate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "savepoint_rollbacks")
    private long savepointRollbacks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "savepoint_refreshes")
    private long savepointRefreshes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "log_bytes_written")
    private long logBytesWritten;
    @Basic(optional = false)
    @NotNull
    @Column(name = "log_IO_count")
    private long logIOcount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phantom_scans_started")
    private long phantomScansStarted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phantom_scans_retries")
    private long phantomScansRetries;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phantom_rows_touched")
    private long phantomRowsTouched;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phantom_rows_expiring")
    private long phantomRowsExpiring;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phantom_rows_expired")
    private long phantomRowsExpired;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phantom_rows_expired_removed")
    private long phantomRowsExpiredRemoved;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scans_started")
    private long scansStarted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scans_retried")
    private long scansRetried;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_returned")
    private long rowsReturned;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_touched")
    private long rowsTouched;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_expiring")
    private long rowsExpiring;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_expired")
    private long rowsExpired;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_expired_removed")
    private long rowsExpiredRemoved;
    @Basic(optional = false)
    @NotNull
    @Column(name = "row_insert_attempts")
    private long rowInsertAttempts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "row_update_attempts")
    private long rowUpdateAttempts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "row_delete_attempts")
    private long rowDeleteAttempts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "write_conflicts")
    private long writeConflicts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "unique_constraint_violations")
    private long uniqueConstraintViolations;
    @Basic(optional = false)
    @NotNull
    @Column(name = "drop_table_memory_attempts")
    private long dropTableMemoryAttempts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "drop_table_memory_failures")
    private long dropTableMemoryFailures;

    public DmXtpTransactionStats() {
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public long getReadOnlyCount() {
        return readOnlyCount;
    }

    public void setReadOnlyCount(long readOnlyCount) {
        this.readOnlyCount = readOnlyCount;
    }

    public long getTotalAborts() {
        return totalAborts;
    }

    public void setTotalAborts(long totalAborts) {
        this.totalAborts = totalAborts;
    }

    public long getSystemAborts() {
        return systemAborts;
    }

    public void setSystemAborts(long systemAborts) {
        this.systemAborts = systemAborts;
    }

    public long getValidationFailures() {
        return validationFailures;
    }

    public void setValidationFailures(long validationFailures) {
        this.validationFailures = validationFailures;
    }

    public long getDependenciesTaken() {
        return dependenciesTaken;
    }

    public void setDependenciesTaken(long dependenciesTaken) {
        this.dependenciesTaken = dependenciesTaken;
    }

    public long getDependenciesFailed() {
        return dependenciesFailed;
    }

    public void setDependenciesFailed(long dependenciesFailed) {
        this.dependenciesFailed = dependenciesFailed;
    }

    public long getSavepointCreate() {
        return savepointCreate;
    }

    public void setSavepointCreate(long savepointCreate) {
        this.savepointCreate = savepointCreate;
    }

    public long getSavepointRollbacks() {
        return savepointRollbacks;
    }

    public void setSavepointRollbacks(long savepointRollbacks) {
        this.savepointRollbacks = savepointRollbacks;
    }

    public long getSavepointRefreshes() {
        return savepointRefreshes;
    }

    public void setSavepointRefreshes(long savepointRefreshes) {
        this.savepointRefreshes = savepointRefreshes;
    }

    public long getLogBytesWritten() {
        return logBytesWritten;
    }

    public void setLogBytesWritten(long logBytesWritten) {
        this.logBytesWritten = logBytesWritten;
    }

    public long getLogIOcount() {
        return logIOcount;
    }

    public void setLogIOcount(long logIOcount) {
        this.logIOcount = logIOcount;
    }

    public long getPhantomScansStarted() {
        return phantomScansStarted;
    }

    public void setPhantomScansStarted(long phantomScansStarted) {
        this.phantomScansStarted = phantomScansStarted;
    }

    public long getPhantomScansRetries() {
        return phantomScansRetries;
    }

    public void setPhantomScansRetries(long phantomScansRetries) {
        this.phantomScansRetries = phantomScansRetries;
    }

    public long getPhantomRowsTouched() {
        return phantomRowsTouched;
    }

    public void setPhantomRowsTouched(long phantomRowsTouched) {
        this.phantomRowsTouched = phantomRowsTouched;
    }

    public long getPhantomRowsExpiring() {
        return phantomRowsExpiring;
    }

    public void setPhantomRowsExpiring(long phantomRowsExpiring) {
        this.phantomRowsExpiring = phantomRowsExpiring;
    }

    public long getPhantomRowsExpired() {
        return phantomRowsExpired;
    }

    public void setPhantomRowsExpired(long phantomRowsExpired) {
        this.phantomRowsExpired = phantomRowsExpired;
    }

    public long getPhantomRowsExpiredRemoved() {
        return phantomRowsExpiredRemoved;
    }

    public void setPhantomRowsExpiredRemoved(long phantomRowsExpiredRemoved) {
        this.phantomRowsExpiredRemoved = phantomRowsExpiredRemoved;
    }

    public long getScansStarted() {
        return scansStarted;
    }

    public void setScansStarted(long scansStarted) {
        this.scansStarted = scansStarted;
    }

    public long getScansRetried() {
        return scansRetried;
    }

    public void setScansRetried(long scansRetried) {
        this.scansRetried = scansRetried;
    }

    public long getRowsReturned() {
        return rowsReturned;
    }

    public void setRowsReturned(long rowsReturned) {
        this.rowsReturned = rowsReturned;
    }

    public long getRowsTouched() {
        return rowsTouched;
    }

    public void setRowsTouched(long rowsTouched) {
        this.rowsTouched = rowsTouched;
    }

    public long getRowsExpiring() {
        return rowsExpiring;
    }

    public void setRowsExpiring(long rowsExpiring) {
        this.rowsExpiring = rowsExpiring;
    }

    public long getRowsExpired() {
        return rowsExpired;
    }

    public void setRowsExpired(long rowsExpired) {
        this.rowsExpired = rowsExpired;
    }

    public long getRowsExpiredRemoved() {
        return rowsExpiredRemoved;
    }

    public void setRowsExpiredRemoved(long rowsExpiredRemoved) {
        this.rowsExpiredRemoved = rowsExpiredRemoved;
    }

    public long getRowInsertAttempts() {
        return rowInsertAttempts;
    }

    public void setRowInsertAttempts(long rowInsertAttempts) {
        this.rowInsertAttempts = rowInsertAttempts;
    }

    public long getRowUpdateAttempts() {
        return rowUpdateAttempts;
    }

    public void setRowUpdateAttempts(long rowUpdateAttempts) {
        this.rowUpdateAttempts = rowUpdateAttempts;
    }

    public long getRowDeleteAttempts() {
        return rowDeleteAttempts;
    }

    public void setRowDeleteAttempts(long rowDeleteAttempts) {
        this.rowDeleteAttempts = rowDeleteAttempts;
    }

    public long getWriteConflicts() {
        return writeConflicts;
    }

    public void setWriteConflicts(long writeConflicts) {
        this.writeConflicts = writeConflicts;
    }

    public long getUniqueConstraintViolations() {
        return uniqueConstraintViolations;
    }

    public void setUniqueConstraintViolations(long uniqueConstraintViolations) {
        this.uniqueConstraintViolations = uniqueConstraintViolations;
    }

    public long getDropTableMemoryAttempts() {
        return dropTableMemoryAttempts;
    }

    public void setDropTableMemoryAttempts(long dropTableMemoryAttempts) {
        this.dropTableMemoryAttempts = dropTableMemoryAttempts;
    }

    public long getDropTableMemoryFailures() {
        return dropTableMemoryFailures;
    }

    public void setDropTableMemoryFailures(long dropTableMemoryFailures) {
        this.dropTableMemoryFailures = dropTableMemoryFailures;
    }
    
}
