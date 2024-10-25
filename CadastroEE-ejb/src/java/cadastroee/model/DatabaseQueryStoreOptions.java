/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "database_query_store_options")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseQueryStoreOptions.findAll", query = "SELECT d FROM DatabaseQueryStoreOptions d"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByDesiredState", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.desiredState = :desiredState"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByDesiredStateDesc", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.desiredStateDesc = :desiredStateDesc"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByActualState", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.actualState = :actualState"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByActualStateDesc", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.actualStateDesc = :actualStateDesc"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByReadonlyReason", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.readonlyReason = :readonlyReason"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByCurrentStorageSizeMb", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.currentStorageSizeMb = :currentStorageSizeMb"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByFlushIntervalSeconds", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.flushIntervalSeconds = :flushIntervalSeconds"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByIntervalLengthMinutes", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.intervalLengthMinutes = :intervalLengthMinutes"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByMaxStorageSizeMb", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.maxStorageSizeMb = :maxStorageSizeMb"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByStaleQueryThresholdDays", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.staleQueryThresholdDays = :staleQueryThresholdDays"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByMaxPlansPerQuery", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.maxPlansPerQuery = :maxPlansPerQuery"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByQueryCaptureMode", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.queryCaptureMode = :queryCaptureMode"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByQueryCaptureModeDesc", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.queryCaptureModeDesc = :queryCaptureModeDesc"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByCapturePolicyExecutionCount", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.capturePolicyExecutionCount = :capturePolicyExecutionCount"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByCapturePolicyTotalCompileCpuTimeMs", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.capturePolicyTotalCompileCpuTimeMs = :capturePolicyTotalCompileCpuTimeMs"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByCapturePolicyTotalExecutionCpuTimeMs", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.capturePolicyTotalExecutionCpuTimeMs = :capturePolicyTotalExecutionCpuTimeMs"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByCapturePolicyStaleThresholdHours", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.capturePolicyStaleThresholdHours = :capturePolicyStaleThresholdHours"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findBySizeBasedCleanupMode", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.sizeBasedCleanupMode = :sizeBasedCleanupMode"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findBySizeBasedCleanupModeDesc", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.sizeBasedCleanupModeDesc = :sizeBasedCleanupModeDesc"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByWaitStatsCaptureMode", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.waitStatsCaptureMode = :waitStatsCaptureMode"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByWaitStatsCaptureModeDesc", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.waitStatsCaptureModeDesc = :waitStatsCaptureModeDesc"),
    @NamedQuery(name = "DatabaseQueryStoreOptions.findByActualStateAdditionalInfo", query = "SELECT d FROM DatabaseQueryStoreOptions d WHERE d.actualStateAdditionalInfo = :actualStateAdditionalInfo")})
public class DatabaseQueryStoreOptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "desired_state")
    private short desiredState;
    @Size(max = 60)
    @Column(name = "desired_state_desc")
    private String desiredStateDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "actual_state")
    private short actualState;
    @Size(max = 60)
    @Column(name = "actual_state_desc")
    private String actualStateDesc;
    @Column(name = "readonly_reason")
    private Integer readonlyReason;
    @Column(name = "current_storage_size_mb")
    private BigInteger currentStorageSizeMb;
    @Column(name = "flush_interval_seconds")
    private BigInteger flushIntervalSeconds;
    @Column(name = "interval_length_minutes")
    private BigInteger intervalLengthMinutes;
    @Column(name = "max_storage_size_mb")
    private BigInteger maxStorageSizeMb;
    @Column(name = "stale_query_threshold_days")
    private BigInteger staleQueryThresholdDays;
    @Column(name = "max_plans_per_query")
    private BigInteger maxPlansPerQuery;
    @Basic(optional = false)
    @NotNull
    @Column(name = "query_capture_mode")
    private short queryCaptureMode;
    @Size(max = 60)
    @Column(name = "query_capture_mode_desc")
    private String queryCaptureModeDesc;
    @Column(name = "capture_policy_execution_count")
    private Integer capturePolicyExecutionCount;
    @Column(name = "capture_policy_total_compile_cpu_time_ms")
    private BigInteger capturePolicyTotalCompileCpuTimeMs;
    @Column(name = "capture_policy_total_execution_cpu_time_ms")
    private BigInteger capturePolicyTotalExecutionCpuTimeMs;
    @Column(name = "capture_policy_stale_threshold_hours")
    private Integer capturePolicyStaleThresholdHours;
    @Basic(optional = false)
    @NotNull
    @Column(name = "size_based_cleanup_mode")
    private short sizeBasedCleanupMode;
    @Size(max = 60)
    @Column(name = "size_based_cleanup_mode_desc")
    private String sizeBasedCleanupModeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wait_stats_capture_mode")
    private short waitStatsCaptureMode;
    @Size(max = 60)
    @Column(name = "wait_stats_capture_mode_desc")
    private String waitStatsCaptureModeDesc;
    @Size(max = 4000)
    @Column(name = "actual_state_additional_info")
    private String actualStateAdditionalInfo;

    public DatabaseQueryStoreOptions() {
    }

    public short getDesiredState() {
        return desiredState;
    }

    public void setDesiredState(short desiredState) {
        this.desiredState = desiredState;
    }

    public String getDesiredStateDesc() {
        return desiredStateDesc;
    }

    public void setDesiredStateDesc(String desiredStateDesc) {
        this.desiredStateDesc = desiredStateDesc;
    }

    public short getActualState() {
        return actualState;
    }

    public void setActualState(short actualState) {
        this.actualState = actualState;
    }

    public String getActualStateDesc() {
        return actualStateDesc;
    }

    public void setActualStateDesc(String actualStateDesc) {
        this.actualStateDesc = actualStateDesc;
    }

    public Integer getReadonlyReason() {
        return readonlyReason;
    }

    public void setReadonlyReason(Integer readonlyReason) {
        this.readonlyReason = readonlyReason;
    }

    public BigInteger getCurrentStorageSizeMb() {
        return currentStorageSizeMb;
    }

    public void setCurrentStorageSizeMb(BigInteger currentStorageSizeMb) {
        this.currentStorageSizeMb = currentStorageSizeMb;
    }

    public BigInteger getFlushIntervalSeconds() {
        return flushIntervalSeconds;
    }

    public void setFlushIntervalSeconds(BigInteger flushIntervalSeconds) {
        this.flushIntervalSeconds = flushIntervalSeconds;
    }

    public BigInteger getIntervalLengthMinutes() {
        return intervalLengthMinutes;
    }

    public void setIntervalLengthMinutes(BigInteger intervalLengthMinutes) {
        this.intervalLengthMinutes = intervalLengthMinutes;
    }

    public BigInteger getMaxStorageSizeMb() {
        return maxStorageSizeMb;
    }

    public void setMaxStorageSizeMb(BigInteger maxStorageSizeMb) {
        this.maxStorageSizeMb = maxStorageSizeMb;
    }

    public BigInteger getStaleQueryThresholdDays() {
        return staleQueryThresholdDays;
    }

    public void setStaleQueryThresholdDays(BigInteger staleQueryThresholdDays) {
        this.staleQueryThresholdDays = staleQueryThresholdDays;
    }

    public BigInteger getMaxPlansPerQuery() {
        return maxPlansPerQuery;
    }

    public void setMaxPlansPerQuery(BigInteger maxPlansPerQuery) {
        this.maxPlansPerQuery = maxPlansPerQuery;
    }

    public short getQueryCaptureMode() {
        return queryCaptureMode;
    }

    public void setQueryCaptureMode(short queryCaptureMode) {
        this.queryCaptureMode = queryCaptureMode;
    }

    public String getQueryCaptureModeDesc() {
        return queryCaptureModeDesc;
    }

    public void setQueryCaptureModeDesc(String queryCaptureModeDesc) {
        this.queryCaptureModeDesc = queryCaptureModeDesc;
    }

    public Integer getCapturePolicyExecutionCount() {
        return capturePolicyExecutionCount;
    }

    public void setCapturePolicyExecutionCount(Integer capturePolicyExecutionCount) {
        this.capturePolicyExecutionCount = capturePolicyExecutionCount;
    }

    public BigInteger getCapturePolicyTotalCompileCpuTimeMs() {
        return capturePolicyTotalCompileCpuTimeMs;
    }

    public void setCapturePolicyTotalCompileCpuTimeMs(BigInteger capturePolicyTotalCompileCpuTimeMs) {
        this.capturePolicyTotalCompileCpuTimeMs = capturePolicyTotalCompileCpuTimeMs;
    }

    public BigInteger getCapturePolicyTotalExecutionCpuTimeMs() {
        return capturePolicyTotalExecutionCpuTimeMs;
    }

    public void setCapturePolicyTotalExecutionCpuTimeMs(BigInteger capturePolicyTotalExecutionCpuTimeMs) {
        this.capturePolicyTotalExecutionCpuTimeMs = capturePolicyTotalExecutionCpuTimeMs;
    }

    public Integer getCapturePolicyStaleThresholdHours() {
        return capturePolicyStaleThresholdHours;
    }

    public void setCapturePolicyStaleThresholdHours(Integer capturePolicyStaleThresholdHours) {
        this.capturePolicyStaleThresholdHours = capturePolicyStaleThresholdHours;
    }

    public short getSizeBasedCleanupMode() {
        return sizeBasedCleanupMode;
    }

    public void setSizeBasedCleanupMode(short sizeBasedCleanupMode) {
        this.sizeBasedCleanupMode = sizeBasedCleanupMode;
    }

    public String getSizeBasedCleanupModeDesc() {
        return sizeBasedCleanupModeDesc;
    }

    public void setSizeBasedCleanupModeDesc(String sizeBasedCleanupModeDesc) {
        this.sizeBasedCleanupModeDesc = sizeBasedCleanupModeDesc;
    }

    public short getWaitStatsCaptureMode() {
        return waitStatsCaptureMode;
    }

    public void setWaitStatsCaptureMode(short waitStatsCaptureMode) {
        this.waitStatsCaptureMode = waitStatsCaptureMode;
    }

    public String getWaitStatsCaptureModeDesc() {
        return waitStatsCaptureModeDesc;
    }

    public void setWaitStatsCaptureModeDesc(String waitStatsCaptureModeDesc) {
        this.waitStatsCaptureModeDesc = waitStatsCaptureModeDesc;
    }

    public String getActualStateAdditionalInfo() {
        return actualStateAdditionalInfo;
    }

    public void setActualStateAdditionalInfo(String actualStateAdditionalInfo) {
        this.actualStateAdditionalInfo = actualStateAdditionalInfo;
    }
    
}
