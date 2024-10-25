/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_db_xtp_checkpoint_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbXtpCheckpointStats.findAll", query = "SELECT d FROM DmDbXtpCheckpointStats d"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByLastLsnProcessed", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.lastLsnProcessed = :lastLsnProcessed"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByEndOfLogLsn", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.endOfLogLsn = :endOfLogLsn"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByBytesToEndOfLog", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.bytesToEndOfLog = :bytesToEndOfLog"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByLogConsumptionRate", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.logConsumptionRate = :logConsumptionRate"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByActiveScanTimeInMs", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.activeScanTimeInMs = :activeScanTimeInMs"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByTotalWaitTimeInMs", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.totalWaitTimeInMs = :totalWaitTimeInMs"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByWaitsForIoCount", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.waitsForIoCount = :waitsForIoCount"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByIoWaitTimeInMs", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.ioWaitTimeInMs = :ioWaitTimeInMs"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByWaitsForNewLogCount", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.waitsForNewLogCount = :waitsForNewLogCount"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByNewLogWaitTimeInMs", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.newLogWaitTimeInMs = :newLogWaitTimeInMs"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByIdleAttemptsCount", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.idleAttemptsCount = :idleAttemptsCount"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByTxSegmentsDispatchedCount", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.txSegmentsDispatchedCount = :txSegmentsDispatchedCount"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findBySegmentBytesDispatched", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.segmentBytesDispatched = :segmentBytesDispatched"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByBytesSerialized", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.bytesSerialized = :bytesSerialized"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findBySerializerUserTimeInMs", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.serializerUserTimeInMs = :serializerUserTimeInMs"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findBySerializerKernelTimeInMs", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.serializerKernelTimeInMs = :serializerKernelTimeInMs"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByXtpLogBytesConsumed", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.xtpLogBytesConsumed = :xtpLogBytesConsumed"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByCheckpointsClosed", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.checkpointsClosed = :checkpointsClosed"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByLastClosedCheckpointTs", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.lastClosedCheckpointTs = :lastClosedCheckpointTs"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByHardenedRecoveryLsn", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.hardenedRecoveryLsn = :hardenedRecoveryLsn"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByHardenedRootFileGuid", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.hardenedRootFileGuid = :hardenedRootFileGuid"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByHardenedRootFileWatermark", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.hardenedRootFileWatermark = :hardenedRootFileWatermark"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByHardenedTruncationLsn", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.hardenedTruncationLsn = :hardenedTruncationLsn"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByLogBytesSinceLastClose", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.logBytesSinceLastClose = :logBytesSinceLastClose"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByTimeSinceLastCloseInMs", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.timeSinceLastCloseInMs = :timeSinceLastCloseInMs"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByCurrentCheckpointId", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.currentCheckpointId = :currentCheckpointId"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByCurrentCheckpointSegmentCount", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.currentCheckpointSegmentCount = :currentCheckpointSegmentCount"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByRecoveryLsnCandidate", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.recoveryLsnCandidate = :recoveryLsnCandidate"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByOutstandingCheckpointCount", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.outstandingCheckpointCount = :outstandingCheckpointCount"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByClosingCheckpointId", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.closingCheckpointId = :closingCheckpointId"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByRecoveryCheckpointId", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.recoveryCheckpointId = :recoveryCheckpointId"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByRecoveryCheckpointTs", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.recoveryCheckpointTs = :recoveryCheckpointTs"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByBootstrapRecoveryLsn", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.bootstrapRecoveryLsn = :bootstrapRecoveryLsn"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByBootstrapRootFileGuid", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.bootstrapRootFileGuid = :bootstrapRootFileGuid"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByInternalErrorCode", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.internalErrorCode = :internalErrorCode"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByTailCachePageCount", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.tailCachePageCount = :tailCachePageCount"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByTailCacheMaxPageCount", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.tailCacheMaxPageCount = :tailCacheMaxPageCount"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByTailCacheMinNeededLsn", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.tailCacheMinNeededLsn = :tailCacheMinNeededLsn"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByMergeOutstandingMerges", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.mergeOutstandingMerges = :mergeOutstandingMerges"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByMergeStatsNumberOfMerges", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.mergeStatsNumberOfMerges = :mergeStatsNumberOfMerges"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByMergeStatsLogBlocksMerged", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.mergeStatsLogBlocksMerged = :mergeStatsLogBlocksMerged"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByMergeStatsBytesMerged", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.mergeStatsBytesMerged = :mergeStatsBytesMerged"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByMergeStatsUserTime", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.mergeStatsUserTime = :mergeStatsUserTime"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByMergeStatsKernelTime", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.mergeStatsKernelTime = :mergeStatsKernelTime"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByBytesOfLargeDataSerialized", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.bytesOfLargeDataSerialized = :bytesOfLargeDataSerialized"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByClosedCheckpointEpochValue", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.closedCheckpointEpochValue = :closedCheckpointEpochValue"),
    @NamedQuery(name = "DmDbXtpCheckpointStats.findByDbInCheckpointOnlyMode", query = "SELECT d FROM DmDbXtpCheckpointStats d WHERE d.dbInCheckpointOnlyMode = :dbInCheckpointOnlyMode")})
public class DmDbXtpCheckpointStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "last_lsn_processed")
    private BigInteger lastLsnProcessed;
    @Column(name = "end_of_log_lsn")
    private BigInteger endOfLogLsn;
    @Column(name = "bytes_to_end_of_log")
    private BigInteger bytesToEndOfLog;
    @Column(name = "log_consumption_rate")
    private BigInteger logConsumptionRate;
    @Column(name = "active_scan_time_in_ms")
    private BigInteger activeScanTimeInMs;
    @Column(name = "total_wait_time_in_ms")
    private BigInteger totalWaitTimeInMs;
    @Column(name = "waits_for_io_count")
    private BigInteger waitsForIoCount;
    @Column(name = "io_wait_time_in_ms")
    private BigInteger ioWaitTimeInMs;
    @Column(name = "waits_for_new_log_count")
    private BigInteger waitsForNewLogCount;
    @Column(name = "new_log_wait_time_in_ms")
    private BigInteger newLogWaitTimeInMs;
    @Column(name = "idle_attempts_count")
    private BigInteger idleAttemptsCount;
    @Column(name = "tx_segments_dispatched_count")
    private BigInteger txSegmentsDispatchedCount;
    @Column(name = "segment_bytes_dispatched")
    private BigInteger segmentBytesDispatched;
    @Column(name = "bytes_serialized")
    private BigInteger bytesSerialized;
    @Column(name = "serializer_user_time_in_ms")
    private BigInteger serializerUserTimeInMs;
    @Column(name = "serializer_kernel_time_in_ms")
    private BigInteger serializerKernelTimeInMs;
    @Column(name = "xtp_log_bytes_consumed")
    private BigInteger xtpLogBytesConsumed;
    @Column(name = "checkpoints_closed")
    private BigInteger checkpointsClosed;
    @Column(name = "last_closed_checkpoint_ts")
    private BigInteger lastClosedCheckpointTs;
    @Column(name = "hardened_recovery_lsn")
    private BigInteger hardenedRecoveryLsn;
    @Size(max = 36)
    @Column(name = "hardened_root_file_guid")
    private String hardenedRootFileGuid;
    @Column(name = "hardened_root_file_watermark")
    private BigInteger hardenedRootFileWatermark;
    @Column(name = "hardened_truncation_lsn")
    private BigInteger hardenedTruncationLsn;
    @Column(name = "log_bytes_since_last_close")
    private BigInteger logBytesSinceLastClose;
    @Column(name = "time_since_last_close_in_ms")
    private BigInteger timeSinceLastCloseInMs;
    @Column(name = "current_checkpoint_id")
    private BigInteger currentCheckpointId;
    @Column(name = "current_checkpoint_segment_count")
    private BigInteger currentCheckpointSegmentCount;
    @Column(name = "recovery_lsn_candidate")
    private BigInteger recoveryLsnCandidate;
    @Column(name = "outstanding_checkpoint_count")
    private BigInteger outstandingCheckpointCount;
    @Column(name = "closing_checkpoint_id")
    private BigInteger closingCheckpointId;
    @Column(name = "recovery_checkpoint_id")
    private BigInteger recoveryCheckpointId;
    @Column(name = "recovery_checkpoint_ts")
    private BigInteger recoveryCheckpointTs;
    @Column(name = "bootstrap_recovery_lsn")
    private BigInteger bootstrapRecoveryLsn;
    @Size(max = 36)
    @Column(name = "bootstrap_root_file_guid")
    private String bootstrapRootFileGuid;
    @Column(name = "internal_error_code")
    private BigInteger internalErrorCode;
    @Column(name = "tail_cache_page_count")
    private BigInteger tailCachePageCount;
    @Column(name = "tail_cache_max_page_count")
    private BigInteger tailCacheMaxPageCount;
    @Column(name = "tail_cache_min_needed_lsn")
    private BigInteger tailCacheMinNeededLsn;
    @Column(name = "merge_outstanding_merges")
    private BigInteger mergeOutstandingMerges;
    @Column(name = "merge_stats_number_of_merges")
    private BigInteger mergeStatsNumberOfMerges;
    @Column(name = "merge_stats_log_blocks_merged")
    private BigInteger mergeStatsLogBlocksMerged;
    @Column(name = "merge_stats_bytes_merged")
    private BigInteger mergeStatsBytesMerged;
    @Column(name = "merge_stats_user_time")
    private BigInteger mergeStatsUserTime;
    @Column(name = "merge_stats_kernel_time")
    private BigInteger mergeStatsKernelTime;
    @Column(name = "bytes_of_large_data_serialized")
    private BigInteger bytesOfLargeDataSerialized;
    @Column(name = "closed_checkpoint_epoch_value")
    private BigInteger closedCheckpointEpochValue;
    @Column(name = "db_in_checkpoint_only_mode")
    private Boolean dbInCheckpointOnlyMode;

    public DmDbXtpCheckpointStats() {
    }

    public BigInteger getLastLsnProcessed() {
        return lastLsnProcessed;
    }

    public void setLastLsnProcessed(BigInteger lastLsnProcessed) {
        this.lastLsnProcessed = lastLsnProcessed;
    }

    public BigInteger getEndOfLogLsn() {
        return endOfLogLsn;
    }

    public void setEndOfLogLsn(BigInteger endOfLogLsn) {
        this.endOfLogLsn = endOfLogLsn;
    }

    public BigInteger getBytesToEndOfLog() {
        return bytesToEndOfLog;
    }

    public void setBytesToEndOfLog(BigInteger bytesToEndOfLog) {
        this.bytesToEndOfLog = bytesToEndOfLog;
    }

    public BigInteger getLogConsumptionRate() {
        return logConsumptionRate;
    }

    public void setLogConsumptionRate(BigInteger logConsumptionRate) {
        this.logConsumptionRate = logConsumptionRate;
    }

    public BigInteger getActiveScanTimeInMs() {
        return activeScanTimeInMs;
    }

    public void setActiveScanTimeInMs(BigInteger activeScanTimeInMs) {
        this.activeScanTimeInMs = activeScanTimeInMs;
    }

    public BigInteger getTotalWaitTimeInMs() {
        return totalWaitTimeInMs;
    }

    public void setTotalWaitTimeInMs(BigInteger totalWaitTimeInMs) {
        this.totalWaitTimeInMs = totalWaitTimeInMs;
    }

    public BigInteger getWaitsForIoCount() {
        return waitsForIoCount;
    }

    public void setWaitsForIoCount(BigInteger waitsForIoCount) {
        this.waitsForIoCount = waitsForIoCount;
    }

    public BigInteger getIoWaitTimeInMs() {
        return ioWaitTimeInMs;
    }

    public void setIoWaitTimeInMs(BigInteger ioWaitTimeInMs) {
        this.ioWaitTimeInMs = ioWaitTimeInMs;
    }

    public BigInteger getWaitsForNewLogCount() {
        return waitsForNewLogCount;
    }

    public void setWaitsForNewLogCount(BigInteger waitsForNewLogCount) {
        this.waitsForNewLogCount = waitsForNewLogCount;
    }

    public BigInteger getNewLogWaitTimeInMs() {
        return newLogWaitTimeInMs;
    }

    public void setNewLogWaitTimeInMs(BigInteger newLogWaitTimeInMs) {
        this.newLogWaitTimeInMs = newLogWaitTimeInMs;
    }

    public BigInteger getIdleAttemptsCount() {
        return idleAttemptsCount;
    }

    public void setIdleAttemptsCount(BigInteger idleAttemptsCount) {
        this.idleAttemptsCount = idleAttemptsCount;
    }

    public BigInteger getTxSegmentsDispatchedCount() {
        return txSegmentsDispatchedCount;
    }

    public void setTxSegmentsDispatchedCount(BigInteger txSegmentsDispatchedCount) {
        this.txSegmentsDispatchedCount = txSegmentsDispatchedCount;
    }

    public BigInteger getSegmentBytesDispatched() {
        return segmentBytesDispatched;
    }

    public void setSegmentBytesDispatched(BigInteger segmentBytesDispatched) {
        this.segmentBytesDispatched = segmentBytesDispatched;
    }

    public BigInteger getBytesSerialized() {
        return bytesSerialized;
    }

    public void setBytesSerialized(BigInteger bytesSerialized) {
        this.bytesSerialized = bytesSerialized;
    }

    public BigInteger getSerializerUserTimeInMs() {
        return serializerUserTimeInMs;
    }

    public void setSerializerUserTimeInMs(BigInteger serializerUserTimeInMs) {
        this.serializerUserTimeInMs = serializerUserTimeInMs;
    }

    public BigInteger getSerializerKernelTimeInMs() {
        return serializerKernelTimeInMs;
    }

    public void setSerializerKernelTimeInMs(BigInteger serializerKernelTimeInMs) {
        this.serializerKernelTimeInMs = serializerKernelTimeInMs;
    }

    public BigInteger getXtpLogBytesConsumed() {
        return xtpLogBytesConsumed;
    }

    public void setXtpLogBytesConsumed(BigInteger xtpLogBytesConsumed) {
        this.xtpLogBytesConsumed = xtpLogBytesConsumed;
    }

    public BigInteger getCheckpointsClosed() {
        return checkpointsClosed;
    }

    public void setCheckpointsClosed(BigInteger checkpointsClosed) {
        this.checkpointsClosed = checkpointsClosed;
    }

    public BigInteger getLastClosedCheckpointTs() {
        return lastClosedCheckpointTs;
    }

    public void setLastClosedCheckpointTs(BigInteger lastClosedCheckpointTs) {
        this.lastClosedCheckpointTs = lastClosedCheckpointTs;
    }

    public BigInteger getHardenedRecoveryLsn() {
        return hardenedRecoveryLsn;
    }

    public void setHardenedRecoveryLsn(BigInteger hardenedRecoveryLsn) {
        this.hardenedRecoveryLsn = hardenedRecoveryLsn;
    }

    public String getHardenedRootFileGuid() {
        return hardenedRootFileGuid;
    }

    public void setHardenedRootFileGuid(String hardenedRootFileGuid) {
        this.hardenedRootFileGuid = hardenedRootFileGuid;
    }

    public BigInteger getHardenedRootFileWatermark() {
        return hardenedRootFileWatermark;
    }

    public void setHardenedRootFileWatermark(BigInteger hardenedRootFileWatermark) {
        this.hardenedRootFileWatermark = hardenedRootFileWatermark;
    }

    public BigInteger getHardenedTruncationLsn() {
        return hardenedTruncationLsn;
    }

    public void setHardenedTruncationLsn(BigInteger hardenedTruncationLsn) {
        this.hardenedTruncationLsn = hardenedTruncationLsn;
    }

    public BigInteger getLogBytesSinceLastClose() {
        return logBytesSinceLastClose;
    }

    public void setLogBytesSinceLastClose(BigInteger logBytesSinceLastClose) {
        this.logBytesSinceLastClose = logBytesSinceLastClose;
    }

    public BigInteger getTimeSinceLastCloseInMs() {
        return timeSinceLastCloseInMs;
    }

    public void setTimeSinceLastCloseInMs(BigInteger timeSinceLastCloseInMs) {
        this.timeSinceLastCloseInMs = timeSinceLastCloseInMs;
    }

    public BigInteger getCurrentCheckpointId() {
        return currentCheckpointId;
    }

    public void setCurrentCheckpointId(BigInteger currentCheckpointId) {
        this.currentCheckpointId = currentCheckpointId;
    }

    public BigInteger getCurrentCheckpointSegmentCount() {
        return currentCheckpointSegmentCount;
    }

    public void setCurrentCheckpointSegmentCount(BigInteger currentCheckpointSegmentCount) {
        this.currentCheckpointSegmentCount = currentCheckpointSegmentCount;
    }

    public BigInteger getRecoveryLsnCandidate() {
        return recoveryLsnCandidate;
    }

    public void setRecoveryLsnCandidate(BigInteger recoveryLsnCandidate) {
        this.recoveryLsnCandidate = recoveryLsnCandidate;
    }

    public BigInteger getOutstandingCheckpointCount() {
        return outstandingCheckpointCount;
    }

    public void setOutstandingCheckpointCount(BigInteger outstandingCheckpointCount) {
        this.outstandingCheckpointCount = outstandingCheckpointCount;
    }

    public BigInteger getClosingCheckpointId() {
        return closingCheckpointId;
    }

    public void setClosingCheckpointId(BigInteger closingCheckpointId) {
        this.closingCheckpointId = closingCheckpointId;
    }

    public BigInteger getRecoveryCheckpointId() {
        return recoveryCheckpointId;
    }

    public void setRecoveryCheckpointId(BigInteger recoveryCheckpointId) {
        this.recoveryCheckpointId = recoveryCheckpointId;
    }

    public BigInteger getRecoveryCheckpointTs() {
        return recoveryCheckpointTs;
    }

    public void setRecoveryCheckpointTs(BigInteger recoveryCheckpointTs) {
        this.recoveryCheckpointTs = recoveryCheckpointTs;
    }

    public BigInteger getBootstrapRecoveryLsn() {
        return bootstrapRecoveryLsn;
    }

    public void setBootstrapRecoveryLsn(BigInteger bootstrapRecoveryLsn) {
        this.bootstrapRecoveryLsn = bootstrapRecoveryLsn;
    }

    public String getBootstrapRootFileGuid() {
        return bootstrapRootFileGuid;
    }

    public void setBootstrapRootFileGuid(String bootstrapRootFileGuid) {
        this.bootstrapRootFileGuid = bootstrapRootFileGuid;
    }

    public BigInteger getInternalErrorCode() {
        return internalErrorCode;
    }

    public void setInternalErrorCode(BigInteger internalErrorCode) {
        this.internalErrorCode = internalErrorCode;
    }

    public BigInteger getTailCachePageCount() {
        return tailCachePageCount;
    }

    public void setTailCachePageCount(BigInteger tailCachePageCount) {
        this.tailCachePageCount = tailCachePageCount;
    }

    public BigInteger getTailCacheMaxPageCount() {
        return tailCacheMaxPageCount;
    }

    public void setTailCacheMaxPageCount(BigInteger tailCacheMaxPageCount) {
        this.tailCacheMaxPageCount = tailCacheMaxPageCount;
    }

    public BigInteger getTailCacheMinNeededLsn() {
        return tailCacheMinNeededLsn;
    }

    public void setTailCacheMinNeededLsn(BigInteger tailCacheMinNeededLsn) {
        this.tailCacheMinNeededLsn = tailCacheMinNeededLsn;
    }

    public BigInteger getMergeOutstandingMerges() {
        return mergeOutstandingMerges;
    }

    public void setMergeOutstandingMerges(BigInteger mergeOutstandingMerges) {
        this.mergeOutstandingMerges = mergeOutstandingMerges;
    }

    public BigInteger getMergeStatsNumberOfMerges() {
        return mergeStatsNumberOfMerges;
    }

    public void setMergeStatsNumberOfMerges(BigInteger mergeStatsNumberOfMerges) {
        this.mergeStatsNumberOfMerges = mergeStatsNumberOfMerges;
    }

    public BigInteger getMergeStatsLogBlocksMerged() {
        return mergeStatsLogBlocksMerged;
    }

    public void setMergeStatsLogBlocksMerged(BigInteger mergeStatsLogBlocksMerged) {
        this.mergeStatsLogBlocksMerged = mergeStatsLogBlocksMerged;
    }

    public BigInteger getMergeStatsBytesMerged() {
        return mergeStatsBytesMerged;
    }

    public void setMergeStatsBytesMerged(BigInteger mergeStatsBytesMerged) {
        this.mergeStatsBytesMerged = mergeStatsBytesMerged;
    }

    public BigInteger getMergeStatsUserTime() {
        return mergeStatsUserTime;
    }

    public void setMergeStatsUserTime(BigInteger mergeStatsUserTime) {
        this.mergeStatsUserTime = mergeStatsUserTime;
    }

    public BigInteger getMergeStatsKernelTime() {
        return mergeStatsKernelTime;
    }

    public void setMergeStatsKernelTime(BigInteger mergeStatsKernelTime) {
        this.mergeStatsKernelTime = mergeStatsKernelTime;
    }

    public BigInteger getBytesOfLargeDataSerialized() {
        return bytesOfLargeDataSerialized;
    }

    public void setBytesOfLargeDataSerialized(BigInteger bytesOfLargeDataSerialized) {
        this.bytesOfLargeDataSerialized = bytesOfLargeDataSerialized;
    }

    public BigInteger getClosedCheckpointEpochValue() {
        return closedCheckpointEpochValue;
    }

    public void setClosedCheckpointEpochValue(BigInteger closedCheckpointEpochValue) {
        this.closedCheckpointEpochValue = closedCheckpointEpochValue;
    }

    public Boolean getDbInCheckpointOnlyMode() {
        return dbInCheckpointOnlyMode;
    }

    public void setDbInCheckpointOnlyMode(Boolean dbInCheckpointOnlyMode) {
        this.dbInCheckpointOnlyMode = dbInCheckpointOnlyMode;
    }
    
}
