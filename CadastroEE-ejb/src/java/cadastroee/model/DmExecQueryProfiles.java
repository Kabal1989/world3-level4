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
import javax.persistence.Lob;
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
@Table(name = "dm_exec_query_profiles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecQueryProfiles.findAll", query = "SELECT d FROM DmExecQueryProfiles d"),
    @NamedQuery(name = "DmExecQueryProfiles.findBySessionId", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmExecQueryProfiles.findByRequestId", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.requestId = :requestId"),
    @NamedQuery(name = "DmExecQueryProfiles.findByPhysicalOperatorName", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.physicalOperatorName = :physicalOperatorName"),
    @NamedQuery(name = "DmExecQueryProfiles.findByNodeId", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.nodeId = :nodeId"),
    @NamedQuery(name = "DmExecQueryProfiles.findByThreadId", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.threadId = :threadId"),
    @NamedQuery(name = "DmExecQueryProfiles.findByRowCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.rowCount = :rowCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByRewindCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.rewindCount = :rewindCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByRebindCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.rebindCount = :rebindCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByEndOfScanCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.endOfScanCount = :endOfScanCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByEstimateRowCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.estimateRowCount = :estimateRowCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByFirstActiveTime", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.firstActiveTime = :firstActiveTime"),
    @NamedQuery(name = "DmExecQueryProfiles.findByLastActiveTime", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.lastActiveTime = :lastActiveTime"),
    @NamedQuery(name = "DmExecQueryProfiles.findByOpenTime", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.openTime = :openTime"),
    @NamedQuery(name = "DmExecQueryProfiles.findByFirstRowTime", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.firstRowTime = :firstRowTime"),
    @NamedQuery(name = "DmExecQueryProfiles.findByLastRowTime", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.lastRowTime = :lastRowTime"),
    @NamedQuery(name = "DmExecQueryProfiles.findByCloseTime", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.closeTime = :closeTime"),
    @NamedQuery(name = "DmExecQueryProfiles.findByElapsedTimeMs", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.elapsedTimeMs = :elapsedTimeMs"),
    @NamedQuery(name = "DmExecQueryProfiles.findByCpuTimeMs", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.cpuTimeMs = :cpuTimeMs"),
    @NamedQuery(name = "DmExecQueryProfiles.findByDatabaseId", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmExecQueryProfiles.findByObjectId", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmExecQueryProfiles.findByIndexId", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.indexId = :indexId"),
    @NamedQuery(name = "DmExecQueryProfiles.findByScanCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.scanCount = :scanCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByLogicalReadCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.logicalReadCount = :logicalReadCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByPhysicalReadCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.physicalReadCount = :physicalReadCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByReadAheadCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.readAheadCount = :readAheadCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByWritePageCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.writePageCount = :writePageCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByLobLogicalReadCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.lobLogicalReadCount = :lobLogicalReadCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByLobPhysicalReadCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.lobPhysicalReadCount = :lobPhysicalReadCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByLobReadAheadCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.lobReadAheadCount = :lobReadAheadCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findBySegmentReadCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.segmentReadCount = :segmentReadCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findBySegmentSkipCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.segmentSkipCount = :segmentSkipCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByActualReadRowCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.actualReadRowCount = :actualReadRowCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByEstimatedReadRowCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.estimatedReadRowCount = :estimatedReadRowCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByPageServerReadCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.pageServerReadCount = :pageServerReadCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByPageServerReadAheadCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.pageServerReadAheadCount = :pageServerReadAheadCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByLobPageServerReadCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.lobPageServerReadCount = :lobPageServerReadCount"),
    @NamedQuery(name = "DmExecQueryProfiles.findByLobPageServerReadAheadCount", query = "SELECT d FROM DmExecQueryProfiles d WHERE d.lobPageServerReadAheadCount = :lobPageServerReadAheadCount")})
public class DmExecQueryProfiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "session_id")
    private Short sessionId;
    @Column(name = "request_id")
    private Integer requestId;
    @Lob
    @Column(name = "sql_handle")
    private byte[] sqlHandle;
    @Lob
    @Column(name = "plan_handle")
    private byte[] planHandle;
    @Size(max = 256)
    @Column(name = "physical_operator_name")
    private String physicalOperatorName;
    @Column(name = "node_id")
    private Integer nodeId;
    @Column(name = "thread_id")
    private Integer threadId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "task_address")
    private byte[] taskAddress;
    @Column(name = "row_count")
    private BigInteger rowCount;
    @Column(name = "rewind_count")
    private BigInteger rewindCount;
    @Column(name = "rebind_count")
    private BigInteger rebindCount;
    @Column(name = "end_of_scan_count")
    private BigInteger endOfScanCount;
    @Column(name = "estimate_row_count")
    private BigInteger estimateRowCount;
    @Column(name = "first_active_time")
    private BigInteger firstActiveTime;
    @Column(name = "last_active_time")
    private BigInteger lastActiveTime;
    @Column(name = "open_time")
    private BigInteger openTime;
    @Column(name = "first_row_time")
    private BigInteger firstRowTime;
    @Column(name = "last_row_time")
    private BigInteger lastRowTime;
    @Column(name = "close_time")
    private BigInteger closeTime;
    @Column(name = "elapsed_time_ms")
    private BigInteger elapsedTimeMs;
    @Column(name = "cpu_time_ms")
    private BigInteger cpuTimeMs;
    @Column(name = "database_id")
    private Short databaseId;
    @Column(name = "object_id")
    private Integer objectId;
    @Column(name = "index_id")
    private Integer indexId;
    @Column(name = "scan_count")
    private BigInteger scanCount;
    @Column(name = "logical_read_count")
    private BigInteger logicalReadCount;
    @Column(name = "physical_read_count")
    private BigInteger physicalReadCount;
    @Column(name = "read_ahead_count")
    private BigInteger readAheadCount;
    @Column(name = "write_page_count")
    private BigInteger writePageCount;
    @Column(name = "lob_logical_read_count")
    private BigInteger lobLogicalReadCount;
    @Column(name = "lob_physical_read_count")
    private BigInteger lobPhysicalReadCount;
    @Column(name = "lob_read_ahead_count")
    private BigInteger lobReadAheadCount;
    @Column(name = "segment_read_count")
    private Integer segmentReadCount;
    @Column(name = "segment_skip_count")
    private Integer segmentSkipCount;
    @Column(name = "actual_read_row_count")
    private BigInteger actualReadRowCount;
    @Column(name = "estimated_read_row_count")
    private BigInteger estimatedReadRowCount;
    @Column(name = "page_server_read_count")
    private BigInteger pageServerReadCount;
    @Column(name = "page_server_read_ahead_count")
    private BigInteger pageServerReadAheadCount;
    @Column(name = "lob_page_server_read_count")
    private BigInteger lobPageServerReadCount;
    @Column(name = "lob_page_server_read_ahead_count")
    private BigInteger lobPageServerReadAheadCount;

    public DmExecQueryProfiles() {
    }

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public byte[] getSqlHandle() {
        return sqlHandle;
    }

    public void setSqlHandle(byte[] sqlHandle) {
        this.sqlHandle = sqlHandle;
    }

    public byte[] getPlanHandle() {
        return planHandle;
    }

    public void setPlanHandle(byte[] planHandle) {
        this.planHandle = planHandle;
    }

    public String getPhysicalOperatorName() {
        return physicalOperatorName;
    }

    public void setPhysicalOperatorName(String physicalOperatorName) {
        this.physicalOperatorName = physicalOperatorName;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }

    public BigInteger getRowCount() {
        return rowCount;
    }

    public void setRowCount(BigInteger rowCount) {
        this.rowCount = rowCount;
    }

    public BigInteger getRewindCount() {
        return rewindCount;
    }

    public void setRewindCount(BigInteger rewindCount) {
        this.rewindCount = rewindCount;
    }

    public BigInteger getRebindCount() {
        return rebindCount;
    }

    public void setRebindCount(BigInteger rebindCount) {
        this.rebindCount = rebindCount;
    }

    public BigInteger getEndOfScanCount() {
        return endOfScanCount;
    }

    public void setEndOfScanCount(BigInteger endOfScanCount) {
        this.endOfScanCount = endOfScanCount;
    }

    public BigInteger getEstimateRowCount() {
        return estimateRowCount;
    }

    public void setEstimateRowCount(BigInteger estimateRowCount) {
        this.estimateRowCount = estimateRowCount;
    }

    public BigInteger getFirstActiveTime() {
        return firstActiveTime;
    }

    public void setFirstActiveTime(BigInteger firstActiveTime) {
        this.firstActiveTime = firstActiveTime;
    }

    public BigInteger getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(BigInteger lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public BigInteger getOpenTime() {
        return openTime;
    }

    public void setOpenTime(BigInteger openTime) {
        this.openTime = openTime;
    }

    public BigInteger getFirstRowTime() {
        return firstRowTime;
    }

    public void setFirstRowTime(BigInteger firstRowTime) {
        this.firstRowTime = firstRowTime;
    }

    public BigInteger getLastRowTime() {
        return lastRowTime;
    }

    public void setLastRowTime(BigInteger lastRowTime) {
        this.lastRowTime = lastRowTime;
    }

    public BigInteger getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(BigInteger closeTime) {
        this.closeTime = closeTime;
    }

    public BigInteger getElapsedTimeMs() {
        return elapsedTimeMs;
    }

    public void setElapsedTimeMs(BigInteger elapsedTimeMs) {
        this.elapsedTimeMs = elapsedTimeMs;
    }

    public BigInteger getCpuTimeMs() {
        return cpuTimeMs;
    }

    public void setCpuTimeMs(BigInteger cpuTimeMs) {
        this.cpuTimeMs = cpuTimeMs;
    }

    public Short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Short databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public BigInteger getScanCount() {
        return scanCount;
    }

    public void setScanCount(BigInteger scanCount) {
        this.scanCount = scanCount;
    }

    public BigInteger getLogicalReadCount() {
        return logicalReadCount;
    }

    public void setLogicalReadCount(BigInteger logicalReadCount) {
        this.logicalReadCount = logicalReadCount;
    }

    public BigInteger getPhysicalReadCount() {
        return physicalReadCount;
    }

    public void setPhysicalReadCount(BigInteger physicalReadCount) {
        this.physicalReadCount = physicalReadCount;
    }

    public BigInteger getReadAheadCount() {
        return readAheadCount;
    }

    public void setReadAheadCount(BigInteger readAheadCount) {
        this.readAheadCount = readAheadCount;
    }

    public BigInteger getWritePageCount() {
        return writePageCount;
    }

    public void setWritePageCount(BigInteger writePageCount) {
        this.writePageCount = writePageCount;
    }

    public BigInteger getLobLogicalReadCount() {
        return lobLogicalReadCount;
    }

    public void setLobLogicalReadCount(BigInteger lobLogicalReadCount) {
        this.lobLogicalReadCount = lobLogicalReadCount;
    }

    public BigInteger getLobPhysicalReadCount() {
        return lobPhysicalReadCount;
    }

    public void setLobPhysicalReadCount(BigInteger lobPhysicalReadCount) {
        this.lobPhysicalReadCount = lobPhysicalReadCount;
    }

    public BigInteger getLobReadAheadCount() {
        return lobReadAheadCount;
    }

    public void setLobReadAheadCount(BigInteger lobReadAheadCount) {
        this.lobReadAheadCount = lobReadAheadCount;
    }

    public Integer getSegmentReadCount() {
        return segmentReadCount;
    }

    public void setSegmentReadCount(Integer segmentReadCount) {
        this.segmentReadCount = segmentReadCount;
    }

    public Integer getSegmentSkipCount() {
        return segmentSkipCount;
    }

    public void setSegmentSkipCount(Integer segmentSkipCount) {
        this.segmentSkipCount = segmentSkipCount;
    }

    public BigInteger getActualReadRowCount() {
        return actualReadRowCount;
    }

    public void setActualReadRowCount(BigInteger actualReadRowCount) {
        this.actualReadRowCount = actualReadRowCount;
    }

    public BigInteger getEstimatedReadRowCount() {
        return estimatedReadRowCount;
    }

    public void setEstimatedReadRowCount(BigInteger estimatedReadRowCount) {
        this.estimatedReadRowCount = estimatedReadRowCount;
    }

    public BigInteger getPageServerReadCount() {
        return pageServerReadCount;
    }

    public void setPageServerReadCount(BigInteger pageServerReadCount) {
        this.pageServerReadCount = pageServerReadCount;
    }

    public BigInteger getPageServerReadAheadCount() {
        return pageServerReadAheadCount;
    }

    public void setPageServerReadAheadCount(BigInteger pageServerReadAheadCount) {
        this.pageServerReadAheadCount = pageServerReadAheadCount;
    }

    public BigInteger getLobPageServerReadCount() {
        return lobPageServerReadCount;
    }

    public void setLobPageServerReadCount(BigInteger lobPageServerReadCount) {
        this.lobPageServerReadCount = lobPageServerReadCount;
    }

    public BigInteger getLobPageServerReadAheadCount() {
        return lobPageServerReadAheadCount;
    }

    public void setLobPageServerReadAheadCount(BigInteger lobPageServerReadAheadCount) {
        this.lobPageServerReadAheadCount = lobPageServerReadAheadCount;
    }
    
}
