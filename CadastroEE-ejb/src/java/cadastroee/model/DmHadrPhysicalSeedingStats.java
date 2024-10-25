/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_hadr_physical_seeding_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findAll", query = "SELECT d FROM DmHadrPhysicalSeedingStats d"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByLocalPhysicalSeedingId", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.localPhysicalSeedingId = :localPhysicalSeedingId"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByRemotePhysicalSeedingId", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.remotePhysicalSeedingId = :remotePhysicalSeedingId"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByLocalDatabaseId", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.localDatabaseId = :localDatabaseId"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByLocalDatabaseName", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.localDatabaseName = :localDatabaseName"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByRemoteMachineName", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.remoteMachineName = :remoteMachineName"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByRoleDesc", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.roleDesc = :roleDesc"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByInternalStateDesc", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.internalStateDesc = :internalStateDesc"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByTransferRateBytesPerSecond", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.transferRateBytesPerSecond = :transferRateBytesPerSecond"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByTransferredSizeBytes", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.transferredSizeBytes = :transferredSizeBytes"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByDatabaseSizeBytes", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.databaseSizeBytes = :databaseSizeBytes"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByStartTimeUtc", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.startTimeUtc = :startTimeUtc"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByEndTimeUtc", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.endTimeUtc = :endTimeUtc"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByEstimateTimeCompleteUtc", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.estimateTimeCompleteUtc = :estimateTimeCompleteUtc"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByTotalDiskIoWaitTimeMs", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.totalDiskIoWaitTimeMs = :totalDiskIoWaitTimeMs"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByTotalNetworkWaitTimeMs", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.totalNetworkWaitTimeMs = :totalNetworkWaitTimeMs"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByFailureCode", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.failureCode = :failureCode"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByFailureMessage", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.failureMessage = :failureMessage"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByFailureTimeUtc", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.failureTimeUtc = :failureTimeUtc"),
    @NamedQuery(name = "DmHadrPhysicalSeedingStats.findByIsCompressionEnabled", query = "SELECT d FROM DmHadrPhysicalSeedingStats d WHERE d.isCompressionEnabled = :isCompressionEnabled")})
public class DmHadrPhysicalSeedingStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "local_physical_seeding_id")
    private String localPhysicalSeedingId;
    @Size(max = 36)
    @Column(name = "remote_physical_seeding_id")
    private String remotePhysicalSeedingId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "local_database_id")
    private int localDatabaseId;
    @Size(max = 128)
    @Column(name = "local_database_name")
    private String localDatabaseName;
    @Size(max = 128)
    @Column(name = "remote_machine_name")
    private String remoteMachineName;
    @Size(max = 128)
    @Column(name = "role_desc")
    private String roleDesc;
    @Size(max = 128)
    @Column(name = "internal_state_desc")
    private String internalStateDesc;
    @Column(name = "transfer_rate_bytes_per_second")
    private BigInteger transferRateBytesPerSecond;
    @Column(name = "transferred_size_bytes")
    private BigInteger transferredSizeBytes;
    @Column(name = "database_size_bytes")
    private BigInteger databaseSizeBytes;
    @Column(name = "start_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTimeUtc;
    @Column(name = "end_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTimeUtc;
    @Column(name = "estimate_time_complete_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimateTimeCompleteUtc;
    @Column(name = "total_disk_io_wait_time_ms")
    private BigInteger totalDiskIoWaitTimeMs;
    @Column(name = "total_network_wait_time_ms")
    private BigInteger totalNetworkWaitTimeMs;
    @Column(name = "failure_code")
    private Integer failureCode;
    @Size(max = 128)
    @Column(name = "failure_message")
    private String failureMessage;
    @Column(name = "failure_time_utc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date failureTimeUtc;
    @Column(name = "is_compression_enabled")
    private Boolean isCompressionEnabled;

    public DmHadrPhysicalSeedingStats() {
    }

    public String getLocalPhysicalSeedingId() {
        return localPhysicalSeedingId;
    }

    public void setLocalPhysicalSeedingId(String localPhysicalSeedingId) {
        this.localPhysicalSeedingId = localPhysicalSeedingId;
    }

    public String getRemotePhysicalSeedingId() {
        return remotePhysicalSeedingId;
    }

    public void setRemotePhysicalSeedingId(String remotePhysicalSeedingId) {
        this.remotePhysicalSeedingId = remotePhysicalSeedingId;
    }

    public int getLocalDatabaseId() {
        return localDatabaseId;
    }

    public void setLocalDatabaseId(int localDatabaseId) {
        this.localDatabaseId = localDatabaseId;
    }

    public String getLocalDatabaseName() {
        return localDatabaseName;
    }

    public void setLocalDatabaseName(String localDatabaseName) {
        this.localDatabaseName = localDatabaseName;
    }

    public String getRemoteMachineName() {
        return remoteMachineName;
    }

    public void setRemoteMachineName(String remoteMachineName) {
        this.remoteMachineName = remoteMachineName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getInternalStateDesc() {
        return internalStateDesc;
    }

    public void setInternalStateDesc(String internalStateDesc) {
        this.internalStateDesc = internalStateDesc;
    }

    public BigInteger getTransferRateBytesPerSecond() {
        return transferRateBytesPerSecond;
    }

    public void setTransferRateBytesPerSecond(BigInteger transferRateBytesPerSecond) {
        this.transferRateBytesPerSecond = transferRateBytesPerSecond;
    }

    public BigInteger getTransferredSizeBytes() {
        return transferredSizeBytes;
    }

    public void setTransferredSizeBytes(BigInteger transferredSizeBytes) {
        this.transferredSizeBytes = transferredSizeBytes;
    }

    public BigInteger getDatabaseSizeBytes() {
        return databaseSizeBytes;
    }

    public void setDatabaseSizeBytes(BigInteger databaseSizeBytes) {
        this.databaseSizeBytes = databaseSizeBytes;
    }

    public Date getStartTimeUtc() {
        return startTimeUtc;
    }

    public void setStartTimeUtc(Date startTimeUtc) {
        this.startTimeUtc = startTimeUtc;
    }

    public Date getEndTimeUtc() {
        return endTimeUtc;
    }

    public void setEndTimeUtc(Date endTimeUtc) {
        this.endTimeUtc = endTimeUtc;
    }

    public Date getEstimateTimeCompleteUtc() {
        return estimateTimeCompleteUtc;
    }

    public void setEstimateTimeCompleteUtc(Date estimateTimeCompleteUtc) {
        this.estimateTimeCompleteUtc = estimateTimeCompleteUtc;
    }

    public BigInteger getTotalDiskIoWaitTimeMs() {
        return totalDiskIoWaitTimeMs;
    }

    public void setTotalDiskIoWaitTimeMs(BigInteger totalDiskIoWaitTimeMs) {
        this.totalDiskIoWaitTimeMs = totalDiskIoWaitTimeMs;
    }

    public BigInteger getTotalNetworkWaitTimeMs() {
        return totalNetworkWaitTimeMs;
    }

    public void setTotalNetworkWaitTimeMs(BigInteger totalNetworkWaitTimeMs) {
        this.totalNetworkWaitTimeMs = totalNetworkWaitTimeMs;
    }

    public Integer getFailureCode() {
        return failureCode;
    }

    public void setFailureCode(Integer failureCode) {
        this.failureCode = failureCode;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    public Date getFailureTimeUtc() {
        return failureTimeUtc;
    }

    public void setFailureTimeUtc(Date failureTimeUtc) {
        this.failureTimeUtc = failureTimeUtc;
    }

    public Boolean getIsCompressionEnabled() {
        return isCompressionEnabled;
    }

    public void setIsCompressionEnabled(Boolean isCompressionEnabled) {
        this.isCompressionEnabled = isCompressionEnabled;
    }
    
}
