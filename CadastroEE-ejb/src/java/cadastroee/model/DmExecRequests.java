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
import javax.persistence.Lob;
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
@Table(name = "dm_exec_requests")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecRequests.findAll", query = "SELECT d FROM DmExecRequests d"),
    @NamedQuery(name = "DmExecRequests.findBySessionId", query = "SELECT d FROM DmExecRequests d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmExecRequests.findByRequestId", query = "SELECT d FROM DmExecRequests d WHERE d.requestId = :requestId"),
    @NamedQuery(name = "DmExecRequests.findByStartTime", query = "SELECT d FROM DmExecRequests d WHERE d.startTime = :startTime"),
    @NamedQuery(name = "DmExecRequests.findByStatus", query = "SELECT d FROM DmExecRequests d WHERE d.status = :status"),
    @NamedQuery(name = "DmExecRequests.findByCommand", query = "SELECT d FROM DmExecRequests d WHERE d.command = :command"),
    @NamedQuery(name = "DmExecRequests.findByStatementStartOffset", query = "SELECT d FROM DmExecRequests d WHERE d.statementStartOffset = :statementStartOffset"),
    @NamedQuery(name = "DmExecRequests.findByStatementEndOffset", query = "SELECT d FROM DmExecRequests d WHERE d.statementEndOffset = :statementEndOffset"),
    @NamedQuery(name = "DmExecRequests.findByDatabaseId", query = "SELECT d FROM DmExecRequests d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmExecRequests.findByUserId", query = "SELECT d FROM DmExecRequests d WHERE d.userId = :userId"),
    @NamedQuery(name = "DmExecRequests.findByConnectionId", query = "SELECT d FROM DmExecRequests d WHERE d.connectionId = :connectionId"),
    @NamedQuery(name = "DmExecRequests.findByBlockingSessionId", query = "SELECT d FROM DmExecRequests d WHERE d.blockingSessionId = :blockingSessionId"),
    @NamedQuery(name = "DmExecRequests.findByWaitType", query = "SELECT d FROM DmExecRequests d WHERE d.waitType = :waitType"),
    @NamedQuery(name = "DmExecRequests.findByWaitTime", query = "SELECT d FROM DmExecRequests d WHERE d.waitTime = :waitTime"),
    @NamedQuery(name = "DmExecRequests.findByLastWaitType", query = "SELECT d FROM DmExecRequests d WHERE d.lastWaitType = :lastWaitType"),
    @NamedQuery(name = "DmExecRequests.findByWaitResource", query = "SELECT d FROM DmExecRequests d WHERE d.waitResource = :waitResource"),
    @NamedQuery(name = "DmExecRequests.findByOpenTransactionCount", query = "SELECT d FROM DmExecRequests d WHERE d.openTransactionCount = :openTransactionCount"),
    @NamedQuery(name = "DmExecRequests.findByOpenResultsetCount", query = "SELECT d FROM DmExecRequests d WHERE d.openResultsetCount = :openResultsetCount"),
    @NamedQuery(name = "DmExecRequests.findByTransactionId", query = "SELECT d FROM DmExecRequests d WHERE d.transactionId = :transactionId"),
    @NamedQuery(name = "DmExecRequests.findByPercentComplete", query = "SELECT d FROM DmExecRequests d WHERE d.percentComplete = :percentComplete"),
    @NamedQuery(name = "DmExecRequests.findByEstimatedCompletionTime", query = "SELECT d FROM DmExecRequests d WHERE d.estimatedCompletionTime = :estimatedCompletionTime"),
    @NamedQuery(name = "DmExecRequests.findByCpuTime", query = "SELECT d FROM DmExecRequests d WHERE d.cpuTime = :cpuTime"),
    @NamedQuery(name = "DmExecRequests.findByTotalElapsedTime", query = "SELECT d FROM DmExecRequests d WHERE d.totalElapsedTime = :totalElapsedTime"),
    @NamedQuery(name = "DmExecRequests.findBySchedulerId", query = "SELECT d FROM DmExecRequests d WHERE d.schedulerId = :schedulerId"),
    @NamedQuery(name = "DmExecRequests.findByReads", query = "SELECT d FROM DmExecRequests d WHERE d.reads = :reads"),
    @NamedQuery(name = "DmExecRequests.findByWrites", query = "SELECT d FROM DmExecRequests d WHERE d.writes = :writes"),
    @NamedQuery(name = "DmExecRequests.findByLogicalReads", query = "SELECT d FROM DmExecRequests d WHERE d.logicalReads = :logicalReads"),
    @NamedQuery(name = "DmExecRequests.findByTextSize", query = "SELECT d FROM DmExecRequests d WHERE d.textSize = :textSize"),
    @NamedQuery(name = "DmExecRequests.findByLanguage", query = "SELECT d FROM DmExecRequests d WHERE d.language = :language"),
    @NamedQuery(name = "DmExecRequests.findByDateFormat", query = "SELECT d FROM DmExecRequests d WHERE d.dateFormat = :dateFormat"),
    @NamedQuery(name = "DmExecRequests.findByDateFirst", query = "SELECT d FROM DmExecRequests d WHERE d.dateFirst = :dateFirst"),
    @NamedQuery(name = "DmExecRequests.findByQuotedIdentifier", query = "SELECT d FROM DmExecRequests d WHERE d.quotedIdentifier = :quotedIdentifier"),
    @NamedQuery(name = "DmExecRequests.findByArithabort", query = "SELECT d FROM DmExecRequests d WHERE d.arithabort = :arithabort"),
    @NamedQuery(name = "DmExecRequests.findByAnsiNullDfltOn", query = "SELECT d FROM DmExecRequests d WHERE d.ansiNullDfltOn = :ansiNullDfltOn"),
    @NamedQuery(name = "DmExecRequests.findByAnsiDefaults", query = "SELECT d FROM DmExecRequests d WHERE d.ansiDefaults = :ansiDefaults"),
    @NamedQuery(name = "DmExecRequests.findByAnsiWarnings", query = "SELECT d FROM DmExecRequests d WHERE d.ansiWarnings = :ansiWarnings"),
    @NamedQuery(name = "DmExecRequests.findByAnsiPadding", query = "SELECT d FROM DmExecRequests d WHERE d.ansiPadding = :ansiPadding"),
    @NamedQuery(name = "DmExecRequests.findByAnsiNulls", query = "SELECT d FROM DmExecRequests d WHERE d.ansiNulls = :ansiNulls"),
    @NamedQuery(name = "DmExecRequests.findByConcatNullYieldsNull", query = "SELECT d FROM DmExecRequests d WHERE d.concatNullYieldsNull = :concatNullYieldsNull"),
    @NamedQuery(name = "DmExecRequests.findByTransactionIsolationLevel", query = "SELECT d FROM DmExecRequests d WHERE d.transactionIsolationLevel = :transactionIsolationLevel"),
    @NamedQuery(name = "DmExecRequests.findByLockTimeout", query = "SELECT d FROM DmExecRequests d WHERE d.lockTimeout = :lockTimeout"),
    @NamedQuery(name = "DmExecRequests.findByDeadlockPriority", query = "SELECT d FROM DmExecRequests d WHERE d.deadlockPriority = :deadlockPriority"),
    @NamedQuery(name = "DmExecRequests.findByRowCount", query = "SELECT d FROM DmExecRequests d WHERE d.rowCount = :rowCount"),
    @NamedQuery(name = "DmExecRequests.findByPrevError", query = "SELECT d FROM DmExecRequests d WHERE d.prevError = :prevError"),
    @NamedQuery(name = "DmExecRequests.findByNestLevel", query = "SELECT d FROM DmExecRequests d WHERE d.nestLevel = :nestLevel"),
    @NamedQuery(name = "DmExecRequests.findByGrantedQueryMemory", query = "SELECT d FROM DmExecRequests d WHERE d.grantedQueryMemory = :grantedQueryMemory"),
    @NamedQuery(name = "DmExecRequests.findByExecutingManagedCode", query = "SELECT d FROM DmExecRequests d WHERE d.executingManagedCode = :executingManagedCode"),
    @NamedQuery(name = "DmExecRequests.findByGroupId", query = "SELECT d FROM DmExecRequests d WHERE d.groupId = :groupId"),
    @NamedQuery(name = "DmExecRequests.findByStatementContextId", query = "SELECT d FROM DmExecRequests d WHERE d.statementContextId = :statementContextId"),
    @NamedQuery(name = "DmExecRequests.findByDop", query = "SELECT d FROM DmExecRequests d WHERE d.dop = :dop"),
    @NamedQuery(name = "DmExecRequests.findByParallelWorkerCount", query = "SELECT d FROM DmExecRequests d WHERE d.parallelWorkerCount = :parallelWorkerCount"),
    @NamedQuery(name = "DmExecRequests.findByExternalScriptRequestId", query = "SELECT d FROM DmExecRequests d WHERE d.externalScriptRequestId = :externalScriptRequestId"),
    @NamedQuery(name = "DmExecRequests.findByIsResumable", query = "SELECT d FROM DmExecRequests d WHERE d.isResumable = :isResumable"),
    @NamedQuery(name = "DmExecRequests.findByPageServerReads", query = "SELECT d FROM DmExecRequests d WHERE d.pageServerReads = :pageServerReads"),
    @NamedQuery(name = "DmExecRequests.findByDistStatementId", query = "SELECT d FROM DmExecRequests d WHERE d.distStatementId = :distStatementId"),
    @NamedQuery(name = "DmExecRequests.findByLabel", query = "SELECT d FROM DmExecRequests d WHERE d.label = :label")})
public class DmExecRequests implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "session_id")
    private short sessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_id")
    private int requestId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "command")
    private String command;
    @Lob
    @Column(name = "sql_handle")
    private byte[] sqlHandle;
    @Column(name = "statement_start_offset")
    private Integer statementStartOffset;
    @Column(name = "statement_end_offset")
    private Integer statementEndOffset;
    @Lob
    @Column(name = "plan_handle")
    private byte[] planHandle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private short databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Size(max = 36)
    @Column(name = "connection_id")
    private String connectionId;
    @Column(name = "blocking_session_id")
    private Short blockingSessionId;
    @Size(max = 60)
    @Column(name = "wait_type")
    private String waitType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wait_time")
    private int waitTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "last_wait_type")
    private String lastWaitType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "wait_resource")
    private String waitResource;
    @Basic(optional = false)
    @NotNull
    @Column(name = "open_transaction_count")
    private int openTransactionCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "open_resultset_count")
    private int openResultsetCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_id")
    private long transactionId;
    @Lob
    @Column(name = "context_info")
    private byte[] contextInfo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "percent_complete")
    private float percentComplete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estimated_completion_time")
    private long estimatedCompletionTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cpu_time")
    private int cpuTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_elapsed_time")
    private int totalElapsedTime;
    @Column(name = "scheduler_id")
    private Integer schedulerId;
    @Lob
    @Column(name = "task_address")
    private byte[] taskAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reads")
    private long reads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "writes")
    private long writes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "logical_reads")
    private long logicalReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "text_size")
    private int textSize;
    @Size(max = 128)
    @Column(name = "language")
    private String language;
    @Size(max = 3)
    @Column(name = "date_format")
    private String dateFormat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_first")
    private short dateFirst;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quoted_identifier")
    private boolean quotedIdentifier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "arithabort")
    private boolean arithabort;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ansi_null_dflt_on")
    private boolean ansiNullDfltOn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ansi_defaults")
    private boolean ansiDefaults;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ansi_warnings")
    private boolean ansiWarnings;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ansi_padding")
    private boolean ansiPadding;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ansi_nulls")
    private boolean ansiNulls;
    @Basic(optional = false)
    @NotNull
    @Column(name = "concat_null_yields_null")
    private boolean concatNullYieldsNull;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_isolation_level")
    private short transactionIsolationLevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lock_timeout")
    private int lockTimeout;
    @Basic(optional = false)
    @NotNull
    @Column(name = "deadlock_priority")
    private int deadlockPriority;
    @Basic(optional = false)
    @NotNull
    @Column(name = "row_count")
    private long rowCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prev_error")
    private int prevError;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nest_level")
    private int nestLevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "granted_query_memory")
    private int grantedQueryMemory;
    @Basic(optional = false)
    @NotNull
    @Column(name = "executing_managed_code")
    private boolean executingManagedCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "group_id")
    private int groupId;
    @Lob
    @Column(name = "query_hash")
    private byte[] queryHash;
    @Lob
    @Column(name = "query_plan_hash")
    private byte[] queryPlanHash;
    @Lob
    @Column(name = "statement_sql_handle")
    private byte[] statementSqlHandle;
    @Column(name = "statement_context_id")
    private BigInteger statementContextId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dop")
    private int dop;
    @Column(name = "parallel_worker_count")
    private Integer parallelWorkerCount;
    @Size(max = 36)
    @Column(name = "external_script_request_id")
    private String externalScriptRequestId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_resumable")
    private boolean isResumable;
    @Lob
    @Column(name = "page_resource")
    private byte[] pageResource;
    @Basic(optional = false)
    @NotNull
    @Column(name = "page_server_reads")
    private long pageServerReads;
    @Size(max = 36)
    @Column(name = "dist_statement_id")
    private String distStatementId;
    @Size(max = 255)
    @Column(name = "label")
    private String label;

    public DmExecRequests() {
    }

    public short getSessionId() {
        return sessionId;
    }

    public void setSessionId(short sessionId) {
        this.sessionId = sessionId;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public byte[] getSqlHandle() {
        return sqlHandle;
    }

    public void setSqlHandle(byte[] sqlHandle) {
        this.sqlHandle = sqlHandle;
    }

    public Integer getStatementStartOffset() {
        return statementStartOffset;
    }

    public void setStatementStartOffset(Integer statementStartOffset) {
        this.statementStartOffset = statementStartOffset;
    }

    public Integer getStatementEndOffset() {
        return statementEndOffset;
    }

    public void setStatementEndOffset(Integer statementEndOffset) {
        this.statementEndOffset = statementEndOffset;
    }

    public byte[] getPlanHandle() {
        return planHandle;
    }

    public void setPlanHandle(byte[] planHandle) {
        this.planHandle = planHandle;
    }

    public short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(short databaseId) {
        this.databaseId = databaseId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public Short getBlockingSessionId() {
        return blockingSessionId;
    }

    public void setBlockingSessionId(Short blockingSessionId) {
        this.blockingSessionId = blockingSessionId;
    }

    public String getWaitType() {
        return waitType;
    }

    public void setWaitType(String waitType) {
        this.waitType = waitType;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public String getLastWaitType() {
        return lastWaitType;
    }

    public void setLastWaitType(String lastWaitType) {
        this.lastWaitType = lastWaitType;
    }

    public String getWaitResource() {
        return waitResource;
    }

    public void setWaitResource(String waitResource) {
        this.waitResource = waitResource;
    }

    public int getOpenTransactionCount() {
        return openTransactionCount;
    }

    public void setOpenTransactionCount(int openTransactionCount) {
        this.openTransactionCount = openTransactionCount;
    }

    public int getOpenResultsetCount() {
        return openResultsetCount;
    }

    public void setOpenResultsetCount(int openResultsetCount) {
        this.openResultsetCount = openResultsetCount;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public byte[] getContextInfo() {
        return contextInfo;
    }

    public void setContextInfo(byte[] contextInfo) {
        this.contextInfo = contextInfo;
    }

    public float getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(float percentComplete) {
        this.percentComplete = percentComplete;
    }

    public long getEstimatedCompletionTime() {
        return estimatedCompletionTime;
    }

    public void setEstimatedCompletionTime(long estimatedCompletionTime) {
        this.estimatedCompletionTime = estimatedCompletionTime;
    }

    public int getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(int cpuTime) {
        this.cpuTime = cpuTime;
    }

    public int getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(int totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public Integer getSchedulerId() {
        return schedulerId;
    }

    public void setSchedulerId(Integer schedulerId) {
        this.schedulerId = schedulerId;
    }

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }

    public long getReads() {
        return reads;
    }

    public void setReads(long reads) {
        this.reads = reads;
    }

    public long getWrites() {
        return writes;
    }

    public void setWrites(long writes) {
        this.writes = writes;
    }

    public long getLogicalReads() {
        return logicalReads;
    }

    public void setLogicalReads(long logicalReads) {
        this.logicalReads = logicalReads;
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public short getDateFirst() {
        return dateFirst;
    }

    public void setDateFirst(short dateFirst) {
        this.dateFirst = dateFirst;
    }

    public boolean getQuotedIdentifier() {
        return quotedIdentifier;
    }

    public void setQuotedIdentifier(boolean quotedIdentifier) {
        this.quotedIdentifier = quotedIdentifier;
    }

    public boolean getArithabort() {
        return arithabort;
    }

    public void setArithabort(boolean arithabort) {
        this.arithabort = arithabort;
    }

    public boolean getAnsiNullDfltOn() {
        return ansiNullDfltOn;
    }

    public void setAnsiNullDfltOn(boolean ansiNullDfltOn) {
        this.ansiNullDfltOn = ansiNullDfltOn;
    }

    public boolean getAnsiDefaults() {
        return ansiDefaults;
    }

    public void setAnsiDefaults(boolean ansiDefaults) {
        this.ansiDefaults = ansiDefaults;
    }

    public boolean getAnsiWarnings() {
        return ansiWarnings;
    }

    public void setAnsiWarnings(boolean ansiWarnings) {
        this.ansiWarnings = ansiWarnings;
    }

    public boolean getAnsiPadding() {
        return ansiPadding;
    }

    public void setAnsiPadding(boolean ansiPadding) {
        this.ansiPadding = ansiPadding;
    }

    public boolean getAnsiNulls() {
        return ansiNulls;
    }

    public void setAnsiNulls(boolean ansiNulls) {
        this.ansiNulls = ansiNulls;
    }

    public boolean getConcatNullYieldsNull() {
        return concatNullYieldsNull;
    }

    public void setConcatNullYieldsNull(boolean concatNullYieldsNull) {
        this.concatNullYieldsNull = concatNullYieldsNull;
    }

    public short getTransactionIsolationLevel() {
        return transactionIsolationLevel;
    }

    public void setTransactionIsolationLevel(short transactionIsolationLevel) {
        this.transactionIsolationLevel = transactionIsolationLevel;
    }

    public int getLockTimeout() {
        return lockTimeout;
    }

    public void setLockTimeout(int lockTimeout) {
        this.lockTimeout = lockTimeout;
    }

    public int getDeadlockPriority() {
        return deadlockPriority;
    }

    public void setDeadlockPriority(int deadlockPriority) {
        this.deadlockPriority = deadlockPriority;
    }

    public long getRowCount() {
        return rowCount;
    }

    public void setRowCount(long rowCount) {
        this.rowCount = rowCount;
    }

    public int getPrevError() {
        return prevError;
    }

    public void setPrevError(int prevError) {
        this.prevError = prevError;
    }

    public int getNestLevel() {
        return nestLevel;
    }

    public void setNestLevel(int nestLevel) {
        this.nestLevel = nestLevel;
    }

    public int getGrantedQueryMemory() {
        return grantedQueryMemory;
    }

    public void setGrantedQueryMemory(int grantedQueryMemory) {
        this.grantedQueryMemory = grantedQueryMemory;
    }

    public boolean getExecutingManagedCode() {
        return executingManagedCode;
    }

    public void setExecutingManagedCode(boolean executingManagedCode) {
        this.executingManagedCode = executingManagedCode;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public byte[] getQueryHash() {
        return queryHash;
    }

    public void setQueryHash(byte[] queryHash) {
        this.queryHash = queryHash;
    }

    public byte[] getQueryPlanHash() {
        return queryPlanHash;
    }

    public void setQueryPlanHash(byte[] queryPlanHash) {
        this.queryPlanHash = queryPlanHash;
    }

    public byte[] getStatementSqlHandle() {
        return statementSqlHandle;
    }

    public void setStatementSqlHandle(byte[] statementSqlHandle) {
        this.statementSqlHandle = statementSqlHandle;
    }

    public BigInteger getStatementContextId() {
        return statementContextId;
    }

    public void setStatementContextId(BigInteger statementContextId) {
        this.statementContextId = statementContextId;
    }

    public int getDop() {
        return dop;
    }

    public void setDop(int dop) {
        this.dop = dop;
    }

    public Integer getParallelWorkerCount() {
        return parallelWorkerCount;
    }

    public void setParallelWorkerCount(Integer parallelWorkerCount) {
        this.parallelWorkerCount = parallelWorkerCount;
    }

    public String getExternalScriptRequestId() {
        return externalScriptRequestId;
    }

    public void setExternalScriptRequestId(String externalScriptRequestId) {
        this.externalScriptRequestId = externalScriptRequestId;
    }

    public boolean getIsResumable() {
        return isResumable;
    }

    public void setIsResumable(boolean isResumable) {
        this.isResumable = isResumable;
    }

    public byte[] getPageResource() {
        return pageResource;
    }

    public void setPageResource(byte[] pageResource) {
        this.pageResource = pageResource;
    }

    public long getPageServerReads() {
        return pageServerReads;
    }

    public void setPageServerReads(long pageServerReads) {
        this.pageServerReads = pageServerReads;
    }

    public String getDistStatementId() {
        return distStatementId;
    }

    public void setDistStatementId(String distStatementId) {
        this.distStatementId = distStatementId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
}
