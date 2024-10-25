/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_tran_persistent_version_store_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findAll", query = "SELECT d FROM DmTranPersistentVersionStoreStats d"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByDatabaseId", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByPvsFilegroupId", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.pvsFilegroupId = :pvsFilegroupId"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByPersistentVersionStoreSizeKb", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.persistentVersionStoreSizeKb = :persistentVersionStoreSizeKb"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByOnlineIndexVersionStoreSizeKb", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.onlineIndexVersionStoreSizeKb = :onlineIndexVersionStoreSizeKb"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByCurrentAbortedTransactionCount", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.currentAbortedTransactionCount = :currentAbortedTransactionCount"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByOldestActiveTransactionId", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.oldestActiveTransactionId = :oldestActiveTransactionId"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByOldestAbortedTransactionId", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.oldestAbortedTransactionId = :oldestAbortedTransactionId"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByMinTransactionTimestamp", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.minTransactionTimestamp = :minTransactionTimestamp"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByOnlineIndexMinTransactionTimestamp", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.onlineIndexMinTransactionTimestamp = :onlineIndexMinTransactionTimestamp"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findBySecondaryLowWaterMark", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.secondaryLowWaterMark = :secondaryLowWaterMark"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByOffrowVersionCleanerStartTime", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.offrowVersionCleanerStartTime = :offrowVersionCleanerStartTime"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByOffrowVersionCleanerEndTime", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.offrowVersionCleanerEndTime = :offrowVersionCleanerEndTime"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByAbortedVersionCleanerStartTime", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.abortedVersionCleanerStartTime = :abortedVersionCleanerStartTime"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByAbortedVersionCleanerEndTime", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.abortedVersionCleanerEndTime = :abortedVersionCleanerEndTime"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByPvsOffRowPageSkippedLowWaterMark", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.pvsOffRowPageSkippedLowWaterMark = :pvsOffRowPageSkippedLowWaterMark"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByPvsOffRowPageSkippedTransactionNotCleaned", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.pvsOffRowPageSkippedTransactionNotCleaned = :pvsOffRowPageSkippedTransactionNotCleaned"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByPvsOffRowPageSkippedOldestActiveXdesid", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.pvsOffRowPageSkippedOldestActiveXdesid = :pvsOffRowPageSkippedOldestActiveXdesid"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByPvsOffRowPageSkippedMinUsefulXts", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.pvsOffRowPageSkippedMinUsefulXts = :pvsOffRowPageSkippedMinUsefulXts"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByPvsOffRowPageSkippedOldestSnapshot", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.pvsOffRowPageSkippedOldestSnapshot = :pvsOffRowPageSkippedOldestSnapshot"),
    @NamedQuery(name = "DmTranPersistentVersionStoreStats.findByPvsOffRowPageSkippedOldestAbortedXdesid", query = "SELECT d FROM DmTranPersistentVersionStoreStats d WHERE d.pvsOffRowPageSkippedOldestAbortedXdesid = :pvsOffRowPageSkippedOldestAbortedXdesid")})
public class DmTranPersistentVersionStoreStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Column(name = "pvs_filegroup_id")
    private Short pvsFilegroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "persistent_version_store_size_kb")
    private long persistentVersionStoreSizeKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "online_index_version_store_size_kb")
    private long onlineIndexVersionStoreSizeKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "current_aborted_transaction_count")
    private long currentAbortedTransactionCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oldest_active_transaction_id")
    private long oldestActiveTransactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oldest_aborted_transaction_id")
    private long oldestAbortedTransactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_transaction_timestamp")
    private long minTransactionTimestamp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "online_index_min_transaction_timestamp")
    private long onlineIndexMinTransactionTimestamp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "secondary_low_water_mark")
    private long secondaryLowWaterMark;
    @Column(name = "offrow_version_cleaner_start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date offrowVersionCleanerStartTime;
    @Column(name = "offrow_version_cleaner_end_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date offrowVersionCleanerEndTime;
    @Column(name = "aborted_version_cleaner_start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date abortedVersionCleanerStartTime;
    @Column(name = "aborted_version_cleaner_end_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date abortedVersionCleanerEndTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pvs_off_row_page_skipped_low_water_mark")
    private long pvsOffRowPageSkippedLowWaterMark;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pvs_off_row_page_skipped_transaction_not_cleaned")
    private long pvsOffRowPageSkippedTransactionNotCleaned;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pvs_off_row_page_skipped_oldest_active_xdesid")
    private long pvsOffRowPageSkippedOldestActiveXdesid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pvs_off_row_page_skipped_min_useful_xts")
    private long pvsOffRowPageSkippedMinUsefulXts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pvs_off_row_page_skipped_oldest_snapshot")
    private long pvsOffRowPageSkippedOldestSnapshot;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pvs_off_row_page_skipped_oldest_aborted_xdesid")
    private long pvsOffRowPageSkippedOldestAbortedXdesid;

    public DmTranPersistentVersionStoreStats() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public Short getPvsFilegroupId() {
        return pvsFilegroupId;
    }

    public void setPvsFilegroupId(Short pvsFilegroupId) {
        this.pvsFilegroupId = pvsFilegroupId;
    }

    public long getPersistentVersionStoreSizeKb() {
        return persistentVersionStoreSizeKb;
    }

    public void setPersistentVersionStoreSizeKb(long persistentVersionStoreSizeKb) {
        this.persistentVersionStoreSizeKb = persistentVersionStoreSizeKb;
    }

    public long getOnlineIndexVersionStoreSizeKb() {
        return onlineIndexVersionStoreSizeKb;
    }

    public void setOnlineIndexVersionStoreSizeKb(long onlineIndexVersionStoreSizeKb) {
        this.onlineIndexVersionStoreSizeKb = onlineIndexVersionStoreSizeKb;
    }

    public long getCurrentAbortedTransactionCount() {
        return currentAbortedTransactionCount;
    }

    public void setCurrentAbortedTransactionCount(long currentAbortedTransactionCount) {
        this.currentAbortedTransactionCount = currentAbortedTransactionCount;
    }

    public long getOldestActiveTransactionId() {
        return oldestActiveTransactionId;
    }

    public void setOldestActiveTransactionId(long oldestActiveTransactionId) {
        this.oldestActiveTransactionId = oldestActiveTransactionId;
    }

    public long getOldestAbortedTransactionId() {
        return oldestAbortedTransactionId;
    }

    public void setOldestAbortedTransactionId(long oldestAbortedTransactionId) {
        this.oldestAbortedTransactionId = oldestAbortedTransactionId;
    }

    public long getMinTransactionTimestamp() {
        return minTransactionTimestamp;
    }

    public void setMinTransactionTimestamp(long minTransactionTimestamp) {
        this.minTransactionTimestamp = minTransactionTimestamp;
    }

    public long getOnlineIndexMinTransactionTimestamp() {
        return onlineIndexMinTransactionTimestamp;
    }

    public void setOnlineIndexMinTransactionTimestamp(long onlineIndexMinTransactionTimestamp) {
        this.onlineIndexMinTransactionTimestamp = onlineIndexMinTransactionTimestamp;
    }

    public long getSecondaryLowWaterMark() {
        return secondaryLowWaterMark;
    }

    public void setSecondaryLowWaterMark(long secondaryLowWaterMark) {
        this.secondaryLowWaterMark = secondaryLowWaterMark;
    }

    public Date getOffrowVersionCleanerStartTime() {
        return offrowVersionCleanerStartTime;
    }

    public void setOffrowVersionCleanerStartTime(Date offrowVersionCleanerStartTime) {
        this.offrowVersionCleanerStartTime = offrowVersionCleanerStartTime;
    }

    public Date getOffrowVersionCleanerEndTime() {
        return offrowVersionCleanerEndTime;
    }

    public void setOffrowVersionCleanerEndTime(Date offrowVersionCleanerEndTime) {
        this.offrowVersionCleanerEndTime = offrowVersionCleanerEndTime;
    }

    public Date getAbortedVersionCleanerStartTime() {
        return abortedVersionCleanerStartTime;
    }

    public void setAbortedVersionCleanerStartTime(Date abortedVersionCleanerStartTime) {
        this.abortedVersionCleanerStartTime = abortedVersionCleanerStartTime;
    }

    public Date getAbortedVersionCleanerEndTime() {
        return abortedVersionCleanerEndTime;
    }

    public void setAbortedVersionCleanerEndTime(Date abortedVersionCleanerEndTime) {
        this.abortedVersionCleanerEndTime = abortedVersionCleanerEndTime;
    }

    public long getPvsOffRowPageSkippedLowWaterMark() {
        return pvsOffRowPageSkippedLowWaterMark;
    }

    public void setPvsOffRowPageSkippedLowWaterMark(long pvsOffRowPageSkippedLowWaterMark) {
        this.pvsOffRowPageSkippedLowWaterMark = pvsOffRowPageSkippedLowWaterMark;
    }

    public long getPvsOffRowPageSkippedTransactionNotCleaned() {
        return pvsOffRowPageSkippedTransactionNotCleaned;
    }

    public void setPvsOffRowPageSkippedTransactionNotCleaned(long pvsOffRowPageSkippedTransactionNotCleaned) {
        this.pvsOffRowPageSkippedTransactionNotCleaned = pvsOffRowPageSkippedTransactionNotCleaned;
    }

    public long getPvsOffRowPageSkippedOldestActiveXdesid() {
        return pvsOffRowPageSkippedOldestActiveXdesid;
    }

    public void setPvsOffRowPageSkippedOldestActiveXdesid(long pvsOffRowPageSkippedOldestActiveXdesid) {
        this.pvsOffRowPageSkippedOldestActiveXdesid = pvsOffRowPageSkippedOldestActiveXdesid;
    }

    public long getPvsOffRowPageSkippedMinUsefulXts() {
        return pvsOffRowPageSkippedMinUsefulXts;
    }

    public void setPvsOffRowPageSkippedMinUsefulXts(long pvsOffRowPageSkippedMinUsefulXts) {
        this.pvsOffRowPageSkippedMinUsefulXts = pvsOffRowPageSkippedMinUsefulXts;
    }

    public long getPvsOffRowPageSkippedOldestSnapshot() {
        return pvsOffRowPageSkippedOldestSnapshot;
    }

    public void setPvsOffRowPageSkippedOldestSnapshot(long pvsOffRowPageSkippedOldestSnapshot) {
        this.pvsOffRowPageSkippedOldestSnapshot = pvsOffRowPageSkippedOldestSnapshot;
    }

    public long getPvsOffRowPageSkippedOldestAbortedXdesid() {
        return pvsOffRowPageSkippedOldestAbortedXdesid;
    }

    public void setPvsOffRowPageSkippedOldestAbortedXdesid(long pvsOffRowPageSkippedOldestAbortedXdesid) {
        this.pvsOffRowPageSkippedOldestAbortedXdesid = pvsOffRowPageSkippedOldestAbortedXdesid;
    }
    
}
