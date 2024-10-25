/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
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
@Table(name = "dm_db_xtp_transactions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbXtpTransactions.findAll", query = "SELECT d FROM DmDbXtpTransactions d"),
    @NamedQuery(name = "DmDbXtpTransactions.findByNodeId", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.nodeId = :nodeId"),
    @NamedQuery(name = "DmDbXtpTransactions.findByXtpTransactionId", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.xtpTransactionId = :xtpTransactionId"),
    @NamedQuery(name = "DmDbXtpTransactions.findByTransactionId", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.transactionId = :transactionId"),
    @NamedQuery(name = "DmDbXtpTransactions.findBySessionId", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmDbXtpTransactions.findByBeginTsn", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.beginTsn = :beginTsn"),
    @NamedQuery(name = "DmDbXtpTransactions.findByEndTsn", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.endTsn = :endTsn"),
    @NamedQuery(name = "DmDbXtpTransactions.findByState", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.state = :state"),
    @NamedQuery(name = "DmDbXtpTransactions.findByStateDesc", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.stateDesc = :stateDesc"),
    @NamedQuery(name = "DmDbXtpTransactions.findByResult", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.result = :result"),
    @NamedQuery(name = "DmDbXtpTransactions.findByResultDesc", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.resultDesc = :resultDesc"),
    @NamedQuery(name = "DmDbXtpTransactions.findByXtpParentTransactionNodeId", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.xtpParentTransactionNodeId = :xtpParentTransactionNodeId"),
    @NamedQuery(name = "DmDbXtpTransactions.findByXtpParentTransactionId", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.xtpParentTransactionId = :xtpParentTransactionId"),
    @NamedQuery(name = "DmDbXtpTransactions.findByLastError", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.lastError = :lastError"),
    @NamedQuery(name = "DmDbXtpTransactions.findByIsSpeculative", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.isSpeculative = :isSpeculative"),
    @NamedQuery(name = "DmDbXtpTransactions.findByIsPrepared", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.isPrepared = :isPrepared"),
    @NamedQuery(name = "DmDbXtpTransactions.findByIsDelayedDurability", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.isDelayedDurability = :isDelayedDurability"),
    @NamedQuery(name = "DmDbXtpTransactions.findByThreadId", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.threadId = :threadId"),
    @NamedQuery(name = "DmDbXtpTransactions.findByReadSetRowCount", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.readSetRowCount = :readSetRowCount"),
    @NamedQuery(name = "DmDbXtpTransactions.findByWriteSetRowCount", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.writeSetRowCount = :writeSetRowCount"),
    @NamedQuery(name = "DmDbXtpTransactions.findByScanSetCount", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.scanSetCount = :scanSetCount"),
    @NamedQuery(name = "DmDbXtpTransactions.findBySavepointGarbageCount", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.savepointGarbageCount = :savepointGarbageCount"),
    @NamedQuery(name = "DmDbXtpTransactions.findByLogBytesRequired", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.logBytesRequired = :logBytesRequired"),
    @NamedQuery(name = "DmDbXtpTransactions.findByCountOfAllocations", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.countOfAllocations = :countOfAllocations"),
    @NamedQuery(name = "DmDbXtpTransactions.findByAllocatedBytes", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.allocatedBytes = :allocatedBytes"),
    @NamedQuery(name = "DmDbXtpTransactions.findByReservedBytes", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.reservedBytes = :reservedBytes"),
    @NamedQuery(name = "DmDbXtpTransactions.findByCommitDependencyCount", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.commitDependencyCount = :commitDependencyCount"),
    @NamedQuery(name = "DmDbXtpTransactions.findByCommitDependencyTotalAttemptCount", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.commitDependencyTotalAttemptCount = :commitDependencyTotalAttemptCount"),
    @NamedQuery(name = "DmDbXtpTransactions.findByScanArea", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.scanArea = :scanArea"),
    @NamedQuery(name = "DmDbXtpTransactions.findByScanAreaDesc", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.scanAreaDesc = :scanAreaDesc"),
    @NamedQuery(name = "DmDbXtpTransactions.findByScanLocation", query = "SELECT d FROM DmDbXtpTransactions d WHERE d.scanLocation = :scanLocation")})
public class DmDbXtpTransactions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "node_id")
    private short nodeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xtp_transaction_id")
    private long xtpTransactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_id")
    private long transactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "session_id")
    private short sessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "begin_tsn")
    private long beginTsn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "end_tsn")
    private long endTsn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state")
    private int state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "state_desc")
    private String stateDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "result")
    private int result;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "result_desc")
    private String resultDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xtp_parent_transaction_node_id")
    private short xtpParentTransactionNodeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xtp_parent_transaction_id")
    private long xtpParentTransactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_error")
    private int lastError;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_speculative")
    private boolean isSpeculative;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_prepared")
    private boolean isPrepared;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_delayed_durability")
    private boolean isDelayedDurability;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_address")
    private byte[] memoryAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "database_address")
    private byte[] databaseAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "thread_id")
    private int threadId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "read_set_row_count")
    private int readSetRowCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "write_set_row_count")
    private int writeSetRowCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scan_set_count")
    private int scanSetCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "savepoint_garbage_count")
    private int savepointGarbageCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "log_bytes_required")
    private long logBytesRequired;
    @Basic(optional = false)
    @NotNull
    @Column(name = "count_of_allocations")
    private int countOfAllocations;
    @Basic(optional = false)
    @NotNull
    @Column(name = "allocated_bytes")
    private int allocatedBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reserved_bytes")
    private int reservedBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "commit_dependency_count")
    private int commitDependencyCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "commit_dependency_total_attempt_count")
    private int commitDependencyTotalAttemptCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scan_area")
    private int scanArea;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "scan_area_desc")
    private String scanAreaDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scan_location")
    private int scanLocation;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "dependent_1_address")
    private byte[] dependent1Address;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "dependent_2_address")
    private byte[] dependent2Address;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "dependent_3_address")
    private byte[] dependent3Address;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "dependent_4_address")
    private byte[] dependent4Address;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "dependent_5_address")
    private byte[] dependent5Address;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "dependent_6_address")
    private byte[] dependent6Address;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "dependent_7_address")
    private byte[] dependent7Address;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "dependent_8_address")
    private byte[] dependent8Address;

    public DmDbXtpTransactions() {
    }

    public short getNodeId() {
        return nodeId;
    }

    public void setNodeId(short nodeId) {
        this.nodeId = nodeId;
    }

    public long getXtpTransactionId() {
        return xtpTransactionId;
    }

    public void setXtpTransactionId(long xtpTransactionId) {
        this.xtpTransactionId = xtpTransactionId;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public short getSessionId() {
        return sessionId;
    }

    public void setSessionId(short sessionId) {
        this.sessionId = sessionId;
    }

    public long getBeginTsn() {
        return beginTsn;
    }

    public void setBeginTsn(long beginTsn) {
        this.beginTsn = beginTsn;
    }

    public long getEndTsn() {
        return endTsn;
    }

    public void setEndTsn(long endTsn) {
        this.endTsn = endTsn;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public short getXtpParentTransactionNodeId() {
        return xtpParentTransactionNodeId;
    }

    public void setXtpParentTransactionNodeId(short xtpParentTransactionNodeId) {
        this.xtpParentTransactionNodeId = xtpParentTransactionNodeId;
    }

    public long getXtpParentTransactionId() {
        return xtpParentTransactionId;
    }

    public void setXtpParentTransactionId(long xtpParentTransactionId) {
        this.xtpParentTransactionId = xtpParentTransactionId;
    }

    public int getLastError() {
        return lastError;
    }

    public void setLastError(int lastError) {
        this.lastError = lastError;
    }

    public boolean getIsSpeculative() {
        return isSpeculative;
    }

    public void setIsSpeculative(boolean isSpeculative) {
        this.isSpeculative = isSpeculative;
    }

    public boolean getIsPrepared() {
        return isPrepared;
    }

    public void setIsPrepared(boolean isPrepared) {
        this.isPrepared = isPrepared;
    }

    public boolean getIsDelayedDurability() {
        return isDelayedDurability;
    }

    public void setIsDelayedDurability(boolean isDelayedDurability) {
        this.isDelayedDurability = isDelayedDurability;
    }

    public byte[] getMemoryAddress() {
        return memoryAddress;
    }

    public void setMemoryAddress(byte[] memoryAddress) {
        this.memoryAddress = memoryAddress;
    }

    public byte[] getDatabaseAddress() {
        return databaseAddress;
    }

    public void setDatabaseAddress(byte[] databaseAddress) {
        this.databaseAddress = databaseAddress;
    }

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    public int getReadSetRowCount() {
        return readSetRowCount;
    }

    public void setReadSetRowCount(int readSetRowCount) {
        this.readSetRowCount = readSetRowCount;
    }

    public int getWriteSetRowCount() {
        return writeSetRowCount;
    }

    public void setWriteSetRowCount(int writeSetRowCount) {
        this.writeSetRowCount = writeSetRowCount;
    }

    public int getScanSetCount() {
        return scanSetCount;
    }

    public void setScanSetCount(int scanSetCount) {
        this.scanSetCount = scanSetCount;
    }

    public int getSavepointGarbageCount() {
        return savepointGarbageCount;
    }

    public void setSavepointGarbageCount(int savepointGarbageCount) {
        this.savepointGarbageCount = savepointGarbageCount;
    }

    public long getLogBytesRequired() {
        return logBytesRequired;
    }

    public void setLogBytesRequired(long logBytesRequired) {
        this.logBytesRequired = logBytesRequired;
    }

    public int getCountOfAllocations() {
        return countOfAllocations;
    }

    public void setCountOfAllocations(int countOfAllocations) {
        this.countOfAllocations = countOfAllocations;
    }

    public int getAllocatedBytes() {
        return allocatedBytes;
    }

    public void setAllocatedBytes(int allocatedBytes) {
        this.allocatedBytes = allocatedBytes;
    }

    public int getReservedBytes() {
        return reservedBytes;
    }

    public void setReservedBytes(int reservedBytes) {
        this.reservedBytes = reservedBytes;
    }

    public int getCommitDependencyCount() {
        return commitDependencyCount;
    }

    public void setCommitDependencyCount(int commitDependencyCount) {
        this.commitDependencyCount = commitDependencyCount;
    }

    public int getCommitDependencyTotalAttemptCount() {
        return commitDependencyTotalAttemptCount;
    }

    public void setCommitDependencyTotalAttemptCount(int commitDependencyTotalAttemptCount) {
        this.commitDependencyTotalAttemptCount = commitDependencyTotalAttemptCount;
    }

    public int getScanArea() {
        return scanArea;
    }

    public void setScanArea(int scanArea) {
        this.scanArea = scanArea;
    }

    public String getScanAreaDesc() {
        return scanAreaDesc;
    }

    public void setScanAreaDesc(String scanAreaDesc) {
        this.scanAreaDesc = scanAreaDesc;
    }

    public int getScanLocation() {
        return scanLocation;
    }

    public void setScanLocation(int scanLocation) {
        this.scanLocation = scanLocation;
    }

    public byte[] getDependent1Address() {
        return dependent1Address;
    }

    public void setDependent1Address(byte[] dependent1Address) {
        this.dependent1Address = dependent1Address;
    }

    public byte[] getDependent2Address() {
        return dependent2Address;
    }

    public void setDependent2Address(byte[] dependent2Address) {
        this.dependent2Address = dependent2Address;
    }

    public byte[] getDependent3Address() {
        return dependent3Address;
    }

    public void setDependent3Address(byte[] dependent3Address) {
        this.dependent3Address = dependent3Address;
    }

    public byte[] getDependent4Address() {
        return dependent4Address;
    }

    public void setDependent4Address(byte[] dependent4Address) {
        this.dependent4Address = dependent4Address;
    }

    public byte[] getDependent5Address() {
        return dependent5Address;
    }

    public void setDependent5Address(byte[] dependent5Address) {
        this.dependent5Address = dependent5Address;
    }

    public byte[] getDependent6Address() {
        return dependent6Address;
    }

    public void setDependent6Address(byte[] dependent6Address) {
        this.dependent6Address = dependent6Address;
    }

    public byte[] getDependent7Address() {
        return dependent7Address;
    }

    public void setDependent7Address(byte[] dependent7Address) {
        this.dependent7Address = dependent7Address;
    }

    public byte[] getDependent8Address() {
        return dependent8Address;
    }

    public void setDependent8Address(byte[] dependent8Address) {
        this.dependent8Address = dependent8Address;
    }
    
}
