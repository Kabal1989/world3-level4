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
@Table(name = "dm_exec_sessions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecSessions.findAll", query = "SELECT d FROM DmExecSessions d"),
    @NamedQuery(name = "DmExecSessions.findBySessionId", query = "SELECT d FROM DmExecSessions d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmExecSessions.findByLoginTime", query = "SELECT d FROM DmExecSessions d WHERE d.loginTime = :loginTime"),
    @NamedQuery(name = "DmExecSessions.findByHostName", query = "SELECT d FROM DmExecSessions d WHERE d.hostName = :hostName"),
    @NamedQuery(name = "DmExecSessions.findByProgramName", query = "SELECT d FROM DmExecSessions d WHERE d.programName = :programName"),
    @NamedQuery(name = "DmExecSessions.findByHostProcessId", query = "SELECT d FROM DmExecSessions d WHERE d.hostProcessId = :hostProcessId"),
    @NamedQuery(name = "DmExecSessions.findByClientVersion", query = "SELECT d FROM DmExecSessions d WHERE d.clientVersion = :clientVersion"),
    @NamedQuery(name = "DmExecSessions.findByClientInterfaceName", query = "SELECT d FROM DmExecSessions d WHERE d.clientInterfaceName = :clientInterfaceName"),
    @NamedQuery(name = "DmExecSessions.findByLoginName", query = "SELECT d FROM DmExecSessions d WHERE d.loginName = :loginName"),
    @NamedQuery(name = "DmExecSessions.findByNtDomain", query = "SELECT d FROM DmExecSessions d WHERE d.ntDomain = :ntDomain"),
    @NamedQuery(name = "DmExecSessions.findByNtUserName", query = "SELECT d FROM DmExecSessions d WHERE d.ntUserName = :ntUserName"),
    @NamedQuery(name = "DmExecSessions.findByStatus", query = "SELECT d FROM DmExecSessions d WHERE d.status = :status"),
    @NamedQuery(name = "DmExecSessions.findByCpuTime", query = "SELECT d FROM DmExecSessions d WHERE d.cpuTime = :cpuTime"),
    @NamedQuery(name = "DmExecSessions.findByMemoryUsage", query = "SELECT d FROM DmExecSessions d WHERE d.memoryUsage = :memoryUsage"),
    @NamedQuery(name = "DmExecSessions.findByTotalScheduledTime", query = "SELECT d FROM DmExecSessions d WHERE d.totalScheduledTime = :totalScheduledTime"),
    @NamedQuery(name = "DmExecSessions.findByTotalElapsedTime", query = "SELECT d FROM DmExecSessions d WHERE d.totalElapsedTime = :totalElapsedTime"),
    @NamedQuery(name = "DmExecSessions.findByEndpointId", query = "SELECT d FROM DmExecSessions d WHERE d.endpointId = :endpointId"),
    @NamedQuery(name = "DmExecSessions.findByLastRequestStartTime", query = "SELECT d FROM DmExecSessions d WHERE d.lastRequestStartTime = :lastRequestStartTime"),
    @NamedQuery(name = "DmExecSessions.findByLastRequestEndTime", query = "SELECT d FROM DmExecSessions d WHERE d.lastRequestEndTime = :lastRequestEndTime"),
    @NamedQuery(name = "DmExecSessions.findByReads", query = "SELECT d FROM DmExecSessions d WHERE d.reads = :reads"),
    @NamedQuery(name = "DmExecSessions.findByWrites", query = "SELECT d FROM DmExecSessions d WHERE d.writes = :writes"),
    @NamedQuery(name = "DmExecSessions.findByLogicalReads", query = "SELECT d FROM DmExecSessions d WHERE d.logicalReads = :logicalReads"),
    @NamedQuery(name = "DmExecSessions.findByIsUserProcess", query = "SELECT d FROM DmExecSessions d WHERE d.isUserProcess = :isUserProcess"),
    @NamedQuery(name = "DmExecSessions.findByTextSize", query = "SELECT d FROM DmExecSessions d WHERE d.textSize = :textSize"),
    @NamedQuery(name = "DmExecSessions.findByLanguage", query = "SELECT d FROM DmExecSessions d WHERE d.language = :language"),
    @NamedQuery(name = "DmExecSessions.findByDateFormat", query = "SELECT d FROM DmExecSessions d WHERE d.dateFormat = :dateFormat"),
    @NamedQuery(name = "DmExecSessions.findByDateFirst", query = "SELECT d FROM DmExecSessions d WHERE d.dateFirst = :dateFirst"),
    @NamedQuery(name = "DmExecSessions.findByQuotedIdentifier", query = "SELECT d FROM DmExecSessions d WHERE d.quotedIdentifier = :quotedIdentifier"),
    @NamedQuery(name = "DmExecSessions.findByArithabort", query = "SELECT d FROM DmExecSessions d WHERE d.arithabort = :arithabort"),
    @NamedQuery(name = "DmExecSessions.findByAnsiNullDfltOn", query = "SELECT d FROM DmExecSessions d WHERE d.ansiNullDfltOn = :ansiNullDfltOn"),
    @NamedQuery(name = "DmExecSessions.findByAnsiDefaults", query = "SELECT d FROM DmExecSessions d WHERE d.ansiDefaults = :ansiDefaults"),
    @NamedQuery(name = "DmExecSessions.findByAnsiWarnings", query = "SELECT d FROM DmExecSessions d WHERE d.ansiWarnings = :ansiWarnings"),
    @NamedQuery(name = "DmExecSessions.findByAnsiPadding", query = "SELECT d FROM DmExecSessions d WHERE d.ansiPadding = :ansiPadding"),
    @NamedQuery(name = "DmExecSessions.findByAnsiNulls", query = "SELECT d FROM DmExecSessions d WHERE d.ansiNulls = :ansiNulls"),
    @NamedQuery(name = "DmExecSessions.findByConcatNullYieldsNull", query = "SELECT d FROM DmExecSessions d WHERE d.concatNullYieldsNull = :concatNullYieldsNull"),
    @NamedQuery(name = "DmExecSessions.findByTransactionIsolationLevel", query = "SELECT d FROM DmExecSessions d WHERE d.transactionIsolationLevel = :transactionIsolationLevel"),
    @NamedQuery(name = "DmExecSessions.findByLockTimeout", query = "SELECT d FROM DmExecSessions d WHERE d.lockTimeout = :lockTimeout"),
    @NamedQuery(name = "DmExecSessions.findByDeadlockPriority", query = "SELECT d FROM DmExecSessions d WHERE d.deadlockPriority = :deadlockPriority"),
    @NamedQuery(name = "DmExecSessions.findByRowCount", query = "SELECT d FROM DmExecSessions d WHERE d.rowCount = :rowCount"),
    @NamedQuery(name = "DmExecSessions.findByPrevError", query = "SELECT d FROM DmExecSessions d WHERE d.prevError = :prevError"),
    @NamedQuery(name = "DmExecSessions.findByOriginalLoginName", query = "SELECT d FROM DmExecSessions d WHERE d.originalLoginName = :originalLoginName"),
    @NamedQuery(name = "DmExecSessions.findByLastSuccessfulLogon", query = "SELECT d FROM DmExecSessions d WHERE d.lastSuccessfulLogon = :lastSuccessfulLogon"),
    @NamedQuery(name = "DmExecSessions.findByLastUnsuccessfulLogon", query = "SELECT d FROM DmExecSessions d WHERE d.lastUnsuccessfulLogon = :lastUnsuccessfulLogon"),
    @NamedQuery(name = "DmExecSessions.findByUnsuccessfulLogons", query = "SELECT d FROM DmExecSessions d WHERE d.unsuccessfulLogons = :unsuccessfulLogons"),
    @NamedQuery(name = "DmExecSessions.findByGroupId", query = "SELECT d FROM DmExecSessions d WHERE d.groupId = :groupId"),
    @NamedQuery(name = "DmExecSessions.findByDatabaseId", query = "SELECT d FROM DmExecSessions d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmExecSessions.findByAuthenticatingDatabaseId", query = "SELECT d FROM DmExecSessions d WHERE d.authenticatingDatabaseId = :authenticatingDatabaseId"),
    @NamedQuery(name = "DmExecSessions.findByOpenTransactionCount", query = "SELECT d FROM DmExecSessions d WHERE d.openTransactionCount = :openTransactionCount"),
    @NamedQuery(name = "DmExecSessions.findByPageServerReads", query = "SELECT d FROM DmExecSessions d WHERE d.pageServerReads = :pageServerReads"),
    @NamedQuery(name = "DmExecSessions.findByContainedAvailabilityGroupId", query = "SELECT d FROM DmExecSessions d WHERE d.containedAvailabilityGroupId = :containedAvailabilityGroupId")})
public class DmExecSessions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "session_id")
    private short sessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "login_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginTime;
    @Size(max = 128)
    @Column(name = "host_name")
    private String hostName;
    @Size(max = 128)
    @Column(name = "program_name")
    private String programName;
    @Column(name = "host_process_id")
    private Integer hostProcessId;
    @Column(name = "client_version")
    private Integer clientVersion;
    @Size(max = 32)
    @Column(name = "client_interface_name")
    private String clientInterfaceName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "security_id")
    private byte[] securityId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "login_name")
    private String loginName;
    @Size(max = 128)
    @Column(name = "nt_domain")
    private String ntDomain;
    @Size(max = 128)
    @Column(name = "nt_user_name")
    private String ntUserName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "status")
    private String status;
    @Lob
    @Column(name = "context_info")
    private byte[] contextInfo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cpu_time")
    private int cpuTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "memory_usage")
    private int memoryUsage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_scheduled_time")
    private int totalScheduledTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_elapsed_time")
    private int totalElapsedTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "endpoint_id")
    private int endpointId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_request_start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastRequestStartTime;
    @Column(name = "last_request_end_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastRequestEndTime;
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
    @Column(name = "is_user_process")
    private boolean isUserProcess;
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
    @Lob
    @Column(name = "original_security_id")
    private byte[] originalSecurityId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "original_login_name")
    private String originalLoginName;
    @Column(name = "last_successful_logon")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSuccessfulLogon;
    @Column(name = "last_unsuccessful_logon")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUnsuccessfulLogon;
    @Column(name = "unsuccessful_logons")
    private BigInteger unsuccessfulLogons;
    @Basic(optional = false)
    @NotNull
    @Column(name = "group_id")
    private int groupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private short databaseId;
    @Column(name = "authenticating_database_id")
    private Integer authenticatingDatabaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "open_transaction_count")
    private int openTransactionCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "page_server_reads")
    private long pageServerReads;
    @Size(max = 36)
    @Column(name = "contained_availability_group_id")
    private String containedAvailabilityGroupId;

    public DmExecSessions() {
    }

    public short getSessionId() {
        return sessionId;
    }

    public void setSessionId(short sessionId) {
        this.sessionId = sessionId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public Integer getHostProcessId() {
        return hostProcessId;
    }

    public void setHostProcessId(Integer hostProcessId) {
        this.hostProcessId = hostProcessId;
    }

    public Integer getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(Integer clientVersion) {
        this.clientVersion = clientVersion;
    }

    public String getClientInterfaceName() {
        return clientInterfaceName;
    }

    public void setClientInterfaceName(String clientInterfaceName) {
        this.clientInterfaceName = clientInterfaceName;
    }

    public byte[] getSecurityId() {
        return securityId;
    }

    public void setSecurityId(byte[] securityId) {
        this.securityId = securityId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getNtDomain() {
        return ntDomain;
    }

    public void setNtDomain(String ntDomain) {
        this.ntDomain = ntDomain;
    }

    public String getNtUserName() {
        return ntUserName;
    }

    public void setNtUserName(String ntUserName) {
        this.ntUserName = ntUserName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getContextInfo() {
        return contextInfo;
    }

    public void setContextInfo(byte[] contextInfo) {
        this.contextInfo = contextInfo;
    }

    public int getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(int cpuTime) {
        this.cpuTime = cpuTime;
    }

    public int getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(int memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public int getTotalScheduledTime() {
        return totalScheduledTime;
    }

    public void setTotalScheduledTime(int totalScheduledTime) {
        this.totalScheduledTime = totalScheduledTime;
    }

    public int getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(int totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public int getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(int endpointId) {
        this.endpointId = endpointId;
    }

    public Date getLastRequestStartTime() {
        return lastRequestStartTime;
    }

    public void setLastRequestStartTime(Date lastRequestStartTime) {
        this.lastRequestStartTime = lastRequestStartTime;
    }

    public Date getLastRequestEndTime() {
        return lastRequestEndTime;
    }

    public void setLastRequestEndTime(Date lastRequestEndTime) {
        this.lastRequestEndTime = lastRequestEndTime;
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

    public boolean getIsUserProcess() {
        return isUserProcess;
    }

    public void setIsUserProcess(boolean isUserProcess) {
        this.isUserProcess = isUserProcess;
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

    public byte[] getOriginalSecurityId() {
        return originalSecurityId;
    }

    public void setOriginalSecurityId(byte[] originalSecurityId) {
        this.originalSecurityId = originalSecurityId;
    }

    public String getOriginalLoginName() {
        return originalLoginName;
    }

    public void setOriginalLoginName(String originalLoginName) {
        this.originalLoginName = originalLoginName;
    }

    public Date getLastSuccessfulLogon() {
        return lastSuccessfulLogon;
    }

    public void setLastSuccessfulLogon(Date lastSuccessfulLogon) {
        this.lastSuccessfulLogon = lastSuccessfulLogon;
    }

    public Date getLastUnsuccessfulLogon() {
        return lastUnsuccessfulLogon;
    }

    public void setLastUnsuccessfulLogon(Date lastUnsuccessfulLogon) {
        this.lastUnsuccessfulLogon = lastUnsuccessfulLogon;
    }

    public BigInteger getUnsuccessfulLogons() {
        return unsuccessfulLogons;
    }

    public void setUnsuccessfulLogons(BigInteger unsuccessfulLogons) {
        this.unsuccessfulLogons = unsuccessfulLogons;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(short databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getAuthenticatingDatabaseId() {
        return authenticatingDatabaseId;
    }

    public void setAuthenticatingDatabaseId(Integer authenticatingDatabaseId) {
        this.authenticatingDatabaseId = authenticatingDatabaseId;
    }

    public int getOpenTransactionCount() {
        return openTransactionCount;
    }

    public void setOpenTransactionCount(int openTransactionCount) {
        this.openTransactionCount = openTransactionCount;
    }

    public long getPageServerReads() {
        return pageServerReads;
    }

    public void setPageServerReads(long pageServerReads) {
        this.pageServerReads = pageServerReads;
    }

    public String getContainedAvailabilityGroupId() {
        return containedAvailabilityGroupId;
    }

    public void setContainedAvailabilityGroupId(String containedAvailabilityGroupId) {
        this.containedAvailabilityGroupId = containedAvailabilityGroupId;
    }
    
}
