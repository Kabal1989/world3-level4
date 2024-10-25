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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_exec_query_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecQueryStats.findAll", query = "SELECT d FROM DmExecQueryStats d"),
    @NamedQuery(name = "DmExecQueryStats.findByStatementStartOffset", query = "SELECT d FROM DmExecQueryStats d WHERE d.statementStartOffset = :statementStartOffset"),
    @NamedQuery(name = "DmExecQueryStats.findByStatementEndOffset", query = "SELECT d FROM DmExecQueryStats d WHERE d.statementEndOffset = :statementEndOffset"),
    @NamedQuery(name = "DmExecQueryStats.findByPlanGenerationNum", query = "SELECT d FROM DmExecQueryStats d WHERE d.planGenerationNum = :planGenerationNum"),
    @NamedQuery(name = "DmExecQueryStats.findByCreationTime", query = "SELECT d FROM DmExecQueryStats d WHERE d.creationTime = :creationTime"),
    @NamedQuery(name = "DmExecQueryStats.findByLastExecutionTime", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastExecutionTime = :lastExecutionTime"),
    @NamedQuery(name = "DmExecQueryStats.findByExecutionCount", query = "SELECT d FROM DmExecQueryStats d WHERE d.executionCount = :executionCount"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalWorkerTime", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalWorkerTime = :totalWorkerTime"),
    @NamedQuery(name = "DmExecQueryStats.findByLastWorkerTime", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastWorkerTime = :lastWorkerTime"),
    @NamedQuery(name = "DmExecQueryStats.findByMinWorkerTime", query = "SELECT d FROM DmExecQueryStats d WHERE d.minWorkerTime = :minWorkerTime"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxWorkerTime", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxWorkerTime = :maxWorkerTime"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalPhysicalReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalPhysicalReads = :totalPhysicalReads"),
    @NamedQuery(name = "DmExecQueryStats.findByLastPhysicalReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastPhysicalReads = :lastPhysicalReads"),
    @NamedQuery(name = "DmExecQueryStats.findByMinPhysicalReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.minPhysicalReads = :minPhysicalReads"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxPhysicalReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxPhysicalReads = :maxPhysicalReads"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalLogicalWrites", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalLogicalWrites = :totalLogicalWrites"),
    @NamedQuery(name = "DmExecQueryStats.findByLastLogicalWrites", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastLogicalWrites = :lastLogicalWrites"),
    @NamedQuery(name = "DmExecQueryStats.findByMinLogicalWrites", query = "SELECT d FROM DmExecQueryStats d WHERE d.minLogicalWrites = :minLogicalWrites"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxLogicalWrites", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxLogicalWrites = :maxLogicalWrites"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalLogicalReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalLogicalReads = :totalLogicalReads"),
    @NamedQuery(name = "DmExecQueryStats.findByLastLogicalReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastLogicalReads = :lastLogicalReads"),
    @NamedQuery(name = "DmExecQueryStats.findByMinLogicalReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.minLogicalReads = :minLogicalReads"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxLogicalReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxLogicalReads = :maxLogicalReads"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalClrTime", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalClrTime = :totalClrTime"),
    @NamedQuery(name = "DmExecQueryStats.findByLastClrTime", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastClrTime = :lastClrTime"),
    @NamedQuery(name = "DmExecQueryStats.findByMinClrTime", query = "SELECT d FROM DmExecQueryStats d WHERE d.minClrTime = :minClrTime"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxClrTime", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxClrTime = :maxClrTime"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalElapsedTime", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalElapsedTime = :totalElapsedTime"),
    @NamedQuery(name = "DmExecQueryStats.findByLastElapsedTime", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastElapsedTime = :lastElapsedTime"),
    @NamedQuery(name = "DmExecQueryStats.findByMinElapsedTime", query = "SELECT d FROM DmExecQueryStats d WHERE d.minElapsedTime = :minElapsedTime"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxElapsedTime", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxElapsedTime = :maxElapsedTime"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalRows", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalRows = :totalRows"),
    @NamedQuery(name = "DmExecQueryStats.findByLastRows", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastRows = :lastRows"),
    @NamedQuery(name = "DmExecQueryStats.findByMinRows", query = "SELECT d FROM DmExecQueryStats d WHERE d.minRows = :minRows"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxRows", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxRows = :maxRows"),
    @NamedQuery(name = "DmExecQueryStats.findByStatementContextId", query = "SELECT d FROM DmExecQueryStats d WHERE d.statementContextId = :statementContextId"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalDop", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalDop = :totalDop"),
    @NamedQuery(name = "DmExecQueryStats.findByLastDop", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastDop = :lastDop"),
    @NamedQuery(name = "DmExecQueryStats.findByMinDop", query = "SELECT d FROM DmExecQueryStats d WHERE d.minDop = :minDop"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxDop", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxDop = :maxDop"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalGrantKb", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalGrantKb = :totalGrantKb"),
    @NamedQuery(name = "DmExecQueryStats.findByLastGrantKb", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastGrantKb = :lastGrantKb"),
    @NamedQuery(name = "DmExecQueryStats.findByMinGrantKb", query = "SELECT d FROM DmExecQueryStats d WHERE d.minGrantKb = :minGrantKb"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxGrantKb", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxGrantKb = :maxGrantKb"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalUsedGrantKb", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalUsedGrantKb = :totalUsedGrantKb"),
    @NamedQuery(name = "DmExecQueryStats.findByLastUsedGrantKb", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastUsedGrantKb = :lastUsedGrantKb"),
    @NamedQuery(name = "DmExecQueryStats.findByMinUsedGrantKb", query = "SELECT d FROM DmExecQueryStats d WHERE d.minUsedGrantKb = :minUsedGrantKb"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxUsedGrantKb", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxUsedGrantKb = :maxUsedGrantKb"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalIdealGrantKb", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalIdealGrantKb = :totalIdealGrantKb"),
    @NamedQuery(name = "DmExecQueryStats.findByLastIdealGrantKb", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastIdealGrantKb = :lastIdealGrantKb"),
    @NamedQuery(name = "DmExecQueryStats.findByMinIdealGrantKb", query = "SELECT d FROM DmExecQueryStats d WHERE d.minIdealGrantKb = :minIdealGrantKb"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxIdealGrantKb", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxIdealGrantKb = :maxIdealGrantKb"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalReservedThreads", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalReservedThreads = :totalReservedThreads"),
    @NamedQuery(name = "DmExecQueryStats.findByLastReservedThreads", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastReservedThreads = :lastReservedThreads"),
    @NamedQuery(name = "DmExecQueryStats.findByMinReservedThreads", query = "SELECT d FROM DmExecQueryStats d WHERE d.minReservedThreads = :minReservedThreads"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxReservedThreads", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxReservedThreads = :maxReservedThreads"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalUsedThreads", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalUsedThreads = :totalUsedThreads"),
    @NamedQuery(name = "DmExecQueryStats.findByLastUsedThreads", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastUsedThreads = :lastUsedThreads"),
    @NamedQuery(name = "DmExecQueryStats.findByMinUsedThreads", query = "SELECT d FROM DmExecQueryStats d WHERE d.minUsedThreads = :minUsedThreads"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxUsedThreads", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxUsedThreads = :maxUsedThreads"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalColumnstoreSegmentReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalColumnstoreSegmentReads = :totalColumnstoreSegmentReads"),
    @NamedQuery(name = "DmExecQueryStats.findByLastColumnstoreSegmentReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastColumnstoreSegmentReads = :lastColumnstoreSegmentReads"),
    @NamedQuery(name = "DmExecQueryStats.findByMinColumnstoreSegmentReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.minColumnstoreSegmentReads = :minColumnstoreSegmentReads"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxColumnstoreSegmentReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxColumnstoreSegmentReads = :maxColumnstoreSegmentReads"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalColumnstoreSegmentSkips", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalColumnstoreSegmentSkips = :totalColumnstoreSegmentSkips"),
    @NamedQuery(name = "DmExecQueryStats.findByLastColumnstoreSegmentSkips", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastColumnstoreSegmentSkips = :lastColumnstoreSegmentSkips"),
    @NamedQuery(name = "DmExecQueryStats.findByMinColumnstoreSegmentSkips", query = "SELECT d FROM DmExecQueryStats d WHERE d.minColumnstoreSegmentSkips = :minColumnstoreSegmentSkips"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxColumnstoreSegmentSkips", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxColumnstoreSegmentSkips = :maxColumnstoreSegmentSkips"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalSpills", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalSpills = :totalSpills"),
    @NamedQuery(name = "DmExecQueryStats.findByLastSpills", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastSpills = :lastSpills"),
    @NamedQuery(name = "DmExecQueryStats.findByMinSpills", query = "SELECT d FROM DmExecQueryStats d WHERE d.minSpills = :minSpills"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxSpills", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxSpills = :maxSpills"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalNumPhysicalReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalNumPhysicalReads = :totalNumPhysicalReads"),
    @NamedQuery(name = "DmExecQueryStats.findByLastNumPhysicalReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastNumPhysicalReads = :lastNumPhysicalReads"),
    @NamedQuery(name = "DmExecQueryStats.findByMinNumPhysicalReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.minNumPhysicalReads = :minNumPhysicalReads"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxNumPhysicalReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxNumPhysicalReads = :maxNumPhysicalReads"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalPageServerReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalPageServerReads = :totalPageServerReads"),
    @NamedQuery(name = "DmExecQueryStats.findByLastPageServerReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastPageServerReads = :lastPageServerReads"),
    @NamedQuery(name = "DmExecQueryStats.findByMinPageServerReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.minPageServerReads = :minPageServerReads"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxPageServerReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxPageServerReads = :maxPageServerReads"),
    @NamedQuery(name = "DmExecQueryStats.findByTotalNumPageServerReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.totalNumPageServerReads = :totalNumPageServerReads"),
    @NamedQuery(name = "DmExecQueryStats.findByLastNumPageServerReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.lastNumPageServerReads = :lastNumPageServerReads"),
    @NamedQuery(name = "DmExecQueryStats.findByMinNumPageServerReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.minNumPageServerReads = :minNumPageServerReads"),
    @NamedQuery(name = "DmExecQueryStats.findByMaxNumPageServerReads", query = "SELECT d FROM DmExecQueryStats d WHERE d.maxNumPageServerReads = :maxNumPageServerReads")})
public class DmExecQueryStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "sql_handle")
    private byte[] sqlHandle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "statement_start_offset")
    private int statementStartOffset;
    @Basic(optional = false)
    @NotNull
    @Column(name = "statement_end_offset")
    private int statementEndOffset;
    @Column(name = "plan_generation_num")
    private BigInteger planGenerationNum;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "plan_handle")
    private byte[] planHandle;
    @Column(name = "creation_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationTime;
    @Column(name = "last_execution_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastExecutionTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "execution_count")
    private long executionCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_worker_time")
    private long totalWorkerTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_worker_time")
    private long lastWorkerTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_worker_time")
    private long minWorkerTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_worker_time")
    private long maxWorkerTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_physical_reads")
    private long totalPhysicalReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_physical_reads")
    private long lastPhysicalReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_physical_reads")
    private long minPhysicalReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_physical_reads")
    private long maxPhysicalReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_logical_writes")
    private long totalLogicalWrites;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_logical_writes")
    private long lastLogicalWrites;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_logical_writes")
    private long minLogicalWrites;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_logical_writes")
    private long maxLogicalWrites;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_logical_reads")
    private long totalLogicalReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_logical_reads")
    private long lastLogicalReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_logical_reads")
    private long minLogicalReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_logical_reads")
    private long maxLogicalReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_clr_time")
    private long totalClrTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_clr_time")
    private long lastClrTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_clr_time")
    private long minClrTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_clr_time")
    private long maxClrTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_elapsed_time")
    private long totalElapsedTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_elapsed_time")
    private long lastElapsedTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_elapsed_time")
    private long minElapsedTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_elapsed_time")
    private long maxElapsedTime;
    @Lob
    @Column(name = "query_hash")
    private byte[] queryHash;
    @Lob
    @Column(name = "query_plan_hash")
    private byte[] queryPlanHash;
    @Column(name = "total_rows")
    private BigInteger totalRows;
    @Column(name = "last_rows")
    private BigInteger lastRows;
    @Column(name = "min_rows")
    private BigInteger minRows;
    @Column(name = "max_rows")
    private BigInteger maxRows;
    @Lob
    @Column(name = "statement_sql_handle")
    private byte[] statementSqlHandle;
    @Column(name = "statement_context_id")
    private BigInteger statementContextId;
    @Column(name = "total_dop")
    private BigInteger totalDop;
    @Column(name = "last_dop")
    private BigInteger lastDop;
    @Column(name = "min_dop")
    private BigInteger minDop;
    @Column(name = "max_dop")
    private BigInteger maxDop;
    @Column(name = "total_grant_kb")
    private BigInteger totalGrantKb;
    @Column(name = "last_grant_kb")
    private BigInteger lastGrantKb;
    @Column(name = "min_grant_kb")
    private BigInteger minGrantKb;
    @Column(name = "max_grant_kb")
    private BigInteger maxGrantKb;
    @Column(name = "total_used_grant_kb")
    private BigInteger totalUsedGrantKb;
    @Column(name = "last_used_grant_kb")
    private BigInteger lastUsedGrantKb;
    @Column(name = "min_used_grant_kb")
    private BigInteger minUsedGrantKb;
    @Column(name = "max_used_grant_kb")
    private BigInteger maxUsedGrantKb;
    @Column(name = "total_ideal_grant_kb")
    private BigInteger totalIdealGrantKb;
    @Column(name = "last_ideal_grant_kb")
    private BigInteger lastIdealGrantKb;
    @Column(name = "min_ideal_grant_kb")
    private BigInteger minIdealGrantKb;
    @Column(name = "max_ideal_grant_kb")
    private BigInteger maxIdealGrantKb;
    @Column(name = "total_reserved_threads")
    private BigInteger totalReservedThreads;
    @Column(name = "last_reserved_threads")
    private BigInteger lastReservedThreads;
    @Column(name = "min_reserved_threads")
    private BigInteger minReservedThreads;
    @Column(name = "max_reserved_threads")
    private BigInteger maxReservedThreads;
    @Column(name = "total_used_threads")
    private BigInteger totalUsedThreads;
    @Column(name = "last_used_threads")
    private BigInteger lastUsedThreads;
    @Column(name = "min_used_threads")
    private BigInteger minUsedThreads;
    @Column(name = "max_used_threads")
    private BigInteger maxUsedThreads;
    @Column(name = "total_columnstore_segment_reads")
    private BigInteger totalColumnstoreSegmentReads;
    @Column(name = "last_columnstore_segment_reads")
    private BigInteger lastColumnstoreSegmentReads;
    @Column(name = "min_columnstore_segment_reads")
    private BigInteger minColumnstoreSegmentReads;
    @Column(name = "max_columnstore_segment_reads")
    private BigInteger maxColumnstoreSegmentReads;
    @Column(name = "total_columnstore_segment_skips")
    private BigInteger totalColumnstoreSegmentSkips;
    @Column(name = "last_columnstore_segment_skips")
    private BigInteger lastColumnstoreSegmentSkips;
    @Column(name = "min_columnstore_segment_skips")
    private BigInteger minColumnstoreSegmentSkips;
    @Column(name = "max_columnstore_segment_skips")
    private BigInteger maxColumnstoreSegmentSkips;
    @Column(name = "total_spills")
    private BigInteger totalSpills;
    @Column(name = "last_spills")
    private BigInteger lastSpills;
    @Column(name = "min_spills")
    private BigInteger minSpills;
    @Column(name = "max_spills")
    private BigInteger maxSpills;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_num_physical_reads")
    private long totalNumPhysicalReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_num_physical_reads")
    private long lastNumPhysicalReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_num_physical_reads")
    private long minNumPhysicalReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_num_physical_reads")
    private long maxNumPhysicalReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_page_server_reads")
    private long totalPageServerReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_page_server_reads")
    private long lastPageServerReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_page_server_reads")
    private long minPageServerReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_page_server_reads")
    private long maxPageServerReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_num_page_server_reads")
    private long totalNumPageServerReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_num_page_server_reads")
    private long lastNumPageServerReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_num_page_server_reads")
    private long minNumPageServerReads;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_num_page_server_reads")
    private long maxNumPageServerReads;

    public DmExecQueryStats() {
    }

    public byte[] getSqlHandle() {
        return sqlHandle;
    }

    public void setSqlHandle(byte[] sqlHandle) {
        this.sqlHandle = sqlHandle;
    }

    public int getStatementStartOffset() {
        return statementStartOffset;
    }

    public void setStatementStartOffset(int statementStartOffset) {
        this.statementStartOffset = statementStartOffset;
    }

    public int getStatementEndOffset() {
        return statementEndOffset;
    }

    public void setStatementEndOffset(int statementEndOffset) {
        this.statementEndOffset = statementEndOffset;
    }

    public BigInteger getPlanGenerationNum() {
        return planGenerationNum;
    }

    public void setPlanGenerationNum(BigInteger planGenerationNum) {
        this.planGenerationNum = planGenerationNum;
    }

    public byte[] getPlanHandle() {
        return planHandle;
    }

    public void setPlanHandle(byte[] planHandle) {
        this.planHandle = planHandle;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getLastExecutionTime() {
        return lastExecutionTime;
    }

    public void setLastExecutionTime(Date lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
    }

    public long getExecutionCount() {
        return executionCount;
    }

    public void setExecutionCount(long executionCount) {
        this.executionCount = executionCount;
    }

    public long getTotalWorkerTime() {
        return totalWorkerTime;
    }

    public void setTotalWorkerTime(long totalWorkerTime) {
        this.totalWorkerTime = totalWorkerTime;
    }

    public long getLastWorkerTime() {
        return lastWorkerTime;
    }

    public void setLastWorkerTime(long lastWorkerTime) {
        this.lastWorkerTime = lastWorkerTime;
    }

    public long getMinWorkerTime() {
        return minWorkerTime;
    }

    public void setMinWorkerTime(long minWorkerTime) {
        this.minWorkerTime = minWorkerTime;
    }

    public long getMaxWorkerTime() {
        return maxWorkerTime;
    }

    public void setMaxWorkerTime(long maxWorkerTime) {
        this.maxWorkerTime = maxWorkerTime;
    }

    public long getTotalPhysicalReads() {
        return totalPhysicalReads;
    }

    public void setTotalPhysicalReads(long totalPhysicalReads) {
        this.totalPhysicalReads = totalPhysicalReads;
    }

    public long getLastPhysicalReads() {
        return lastPhysicalReads;
    }

    public void setLastPhysicalReads(long lastPhysicalReads) {
        this.lastPhysicalReads = lastPhysicalReads;
    }

    public long getMinPhysicalReads() {
        return minPhysicalReads;
    }

    public void setMinPhysicalReads(long minPhysicalReads) {
        this.minPhysicalReads = minPhysicalReads;
    }

    public long getMaxPhysicalReads() {
        return maxPhysicalReads;
    }

    public void setMaxPhysicalReads(long maxPhysicalReads) {
        this.maxPhysicalReads = maxPhysicalReads;
    }

    public long getTotalLogicalWrites() {
        return totalLogicalWrites;
    }

    public void setTotalLogicalWrites(long totalLogicalWrites) {
        this.totalLogicalWrites = totalLogicalWrites;
    }

    public long getLastLogicalWrites() {
        return lastLogicalWrites;
    }

    public void setLastLogicalWrites(long lastLogicalWrites) {
        this.lastLogicalWrites = lastLogicalWrites;
    }

    public long getMinLogicalWrites() {
        return minLogicalWrites;
    }

    public void setMinLogicalWrites(long minLogicalWrites) {
        this.minLogicalWrites = minLogicalWrites;
    }

    public long getMaxLogicalWrites() {
        return maxLogicalWrites;
    }

    public void setMaxLogicalWrites(long maxLogicalWrites) {
        this.maxLogicalWrites = maxLogicalWrites;
    }

    public long getTotalLogicalReads() {
        return totalLogicalReads;
    }

    public void setTotalLogicalReads(long totalLogicalReads) {
        this.totalLogicalReads = totalLogicalReads;
    }

    public long getLastLogicalReads() {
        return lastLogicalReads;
    }

    public void setLastLogicalReads(long lastLogicalReads) {
        this.lastLogicalReads = lastLogicalReads;
    }

    public long getMinLogicalReads() {
        return minLogicalReads;
    }

    public void setMinLogicalReads(long minLogicalReads) {
        this.minLogicalReads = minLogicalReads;
    }

    public long getMaxLogicalReads() {
        return maxLogicalReads;
    }

    public void setMaxLogicalReads(long maxLogicalReads) {
        this.maxLogicalReads = maxLogicalReads;
    }

    public long getTotalClrTime() {
        return totalClrTime;
    }

    public void setTotalClrTime(long totalClrTime) {
        this.totalClrTime = totalClrTime;
    }

    public long getLastClrTime() {
        return lastClrTime;
    }

    public void setLastClrTime(long lastClrTime) {
        this.lastClrTime = lastClrTime;
    }

    public long getMinClrTime() {
        return minClrTime;
    }

    public void setMinClrTime(long minClrTime) {
        this.minClrTime = minClrTime;
    }

    public long getMaxClrTime() {
        return maxClrTime;
    }

    public void setMaxClrTime(long maxClrTime) {
        this.maxClrTime = maxClrTime;
    }

    public long getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(long totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public long getLastElapsedTime() {
        return lastElapsedTime;
    }

    public void setLastElapsedTime(long lastElapsedTime) {
        this.lastElapsedTime = lastElapsedTime;
    }

    public long getMinElapsedTime() {
        return minElapsedTime;
    }

    public void setMinElapsedTime(long minElapsedTime) {
        this.minElapsedTime = minElapsedTime;
    }

    public long getMaxElapsedTime() {
        return maxElapsedTime;
    }

    public void setMaxElapsedTime(long maxElapsedTime) {
        this.maxElapsedTime = maxElapsedTime;
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

    public BigInteger getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(BigInteger totalRows) {
        this.totalRows = totalRows;
    }

    public BigInteger getLastRows() {
        return lastRows;
    }

    public void setLastRows(BigInteger lastRows) {
        this.lastRows = lastRows;
    }

    public BigInteger getMinRows() {
        return minRows;
    }

    public void setMinRows(BigInteger minRows) {
        this.minRows = minRows;
    }

    public BigInteger getMaxRows() {
        return maxRows;
    }

    public void setMaxRows(BigInteger maxRows) {
        this.maxRows = maxRows;
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

    public BigInteger getTotalDop() {
        return totalDop;
    }

    public void setTotalDop(BigInteger totalDop) {
        this.totalDop = totalDop;
    }

    public BigInteger getLastDop() {
        return lastDop;
    }

    public void setLastDop(BigInteger lastDop) {
        this.lastDop = lastDop;
    }

    public BigInteger getMinDop() {
        return minDop;
    }

    public void setMinDop(BigInteger minDop) {
        this.minDop = minDop;
    }

    public BigInteger getMaxDop() {
        return maxDop;
    }

    public void setMaxDop(BigInteger maxDop) {
        this.maxDop = maxDop;
    }

    public BigInteger getTotalGrantKb() {
        return totalGrantKb;
    }

    public void setTotalGrantKb(BigInteger totalGrantKb) {
        this.totalGrantKb = totalGrantKb;
    }

    public BigInteger getLastGrantKb() {
        return lastGrantKb;
    }

    public void setLastGrantKb(BigInteger lastGrantKb) {
        this.lastGrantKb = lastGrantKb;
    }

    public BigInteger getMinGrantKb() {
        return minGrantKb;
    }

    public void setMinGrantKb(BigInteger minGrantKb) {
        this.minGrantKb = minGrantKb;
    }

    public BigInteger getMaxGrantKb() {
        return maxGrantKb;
    }

    public void setMaxGrantKb(BigInteger maxGrantKb) {
        this.maxGrantKb = maxGrantKb;
    }

    public BigInteger getTotalUsedGrantKb() {
        return totalUsedGrantKb;
    }

    public void setTotalUsedGrantKb(BigInteger totalUsedGrantKb) {
        this.totalUsedGrantKb = totalUsedGrantKb;
    }

    public BigInteger getLastUsedGrantKb() {
        return lastUsedGrantKb;
    }

    public void setLastUsedGrantKb(BigInteger lastUsedGrantKb) {
        this.lastUsedGrantKb = lastUsedGrantKb;
    }

    public BigInteger getMinUsedGrantKb() {
        return minUsedGrantKb;
    }

    public void setMinUsedGrantKb(BigInteger minUsedGrantKb) {
        this.minUsedGrantKb = minUsedGrantKb;
    }

    public BigInteger getMaxUsedGrantKb() {
        return maxUsedGrantKb;
    }

    public void setMaxUsedGrantKb(BigInteger maxUsedGrantKb) {
        this.maxUsedGrantKb = maxUsedGrantKb;
    }

    public BigInteger getTotalIdealGrantKb() {
        return totalIdealGrantKb;
    }

    public void setTotalIdealGrantKb(BigInteger totalIdealGrantKb) {
        this.totalIdealGrantKb = totalIdealGrantKb;
    }

    public BigInteger getLastIdealGrantKb() {
        return lastIdealGrantKb;
    }

    public void setLastIdealGrantKb(BigInteger lastIdealGrantKb) {
        this.lastIdealGrantKb = lastIdealGrantKb;
    }

    public BigInteger getMinIdealGrantKb() {
        return minIdealGrantKb;
    }

    public void setMinIdealGrantKb(BigInteger minIdealGrantKb) {
        this.minIdealGrantKb = minIdealGrantKb;
    }

    public BigInteger getMaxIdealGrantKb() {
        return maxIdealGrantKb;
    }

    public void setMaxIdealGrantKb(BigInteger maxIdealGrantKb) {
        this.maxIdealGrantKb = maxIdealGrantKb;
    }

    public BigInteger getTotalReservedThreads() {
        return totalReservedThreads;
    }

    public void setTotalReservedThreads(BigInteger totalReservedThreads) {
        this.totalReservedThreads = totalReservedThreads;
    }

    public BigInteger getLastReservedThreads() {
        return lastReservedThreads;
    }

    public void setLastReservedThreads(BigInteger lastReservedThreads) {
        this.lastReservedThreads = lastReservedThreads;
    }

    public BigInteger getMinReservedThreads() {
        return minReservedThreads;
    }

    public void setMinReservedThreads(BigInteger minReservedThreads) {
        this.minReservedThreads = minReservedThreads;
    }

    public BigInteger getMaxReservedThreads() {
        return maxReservedThreads;
    }

    public void setMaxReservedThreads(BigInteger maxReservedThreads) {
        this.maxReservedThreads = maxReservedThreads;
    }

    public BigInteger getTotalUsedThreads() {
        return totalUsedThreads;
    }

    public void setTotalUsedThreads(BigInteger totalUsedThreads) {
        this.totalUsedThreads = totalUsedThreads;
    }

    public BigInteger getLastUsedThreads() {
        return lastUsedThreads;
    }

    public void setLastUsedThreads(BigInteger lastUsedThreads) {
        this.lastUsedThreads = lastUsedThreads;
    }

    public BigInteger getMinUsedThreads() {
        return minUsedThreads;
    }

    public void setMinUsedThreads(BigInteger minUsedThreads) {
        this.minUsedThreads = minUsedThreads;
    }

    public BigInteger getMaxUsedThreads() {
        return maxUsedThreads;
    }

    public void setMaxUsedThreads(BigInteger maxUsedThreads) {
        this.maxUsedThreads = maxUsedThreads;
    }

    public BigInteger getTotalColumnstoreSegmentReads() {
        return totalColumnstoreSegmentReads;
    }

    public void setTotalColumnstoreSegmentReads(BigInteger totalColumnstoreSegmentReads) {
        this.totalColumnstoreSegmentReads = totalColumnstoreSegmentReads;
    }

    public BigInteger getLastColumnstoreSegmentReads() {
        return lastColumnstoreSegmentReads;
    }

    public void setLastColumnstoreSegmentReads(BigInteger lastColumnstoreSegmentReads) {
        this.lastColumnstoreSegmentReads = lastColumnstoreSegmentReads;
    }

    public BigInteger getMinColumnstoreSegmentReads() {
        return minColumnstoreSegmentReads;
    }

    public void setMinColumnstoreSegmentReads(BigInteger minColumnstoreSegmentReads) {
        this.minColumnstoreSegmentReads = minColumnstoreSegmentReads;
    }

    public BigInteger getMaxColumnstoreSegmentReads() {
        return maxColumnstoreSegmentReads;
    }

    public void setMaxColumnstoreSegmentReads(BigInteger maxColumnstoreSegmentReads) {
        this.maxColumnstoreSegmentReads = maxColumnstoreSegmentReads;
    }

    public BigInteger getTotalColumnstoreSegmentSkips() {
        return totalColumnstoreSegmentSkips;
    }

    public void setTotalColumnstoreSegmentSkips(BigInteger totalColumnstoreSegmentSkips) {
        this.totalColumnstoreSegmentSkips = totalColumnstoreSegmentSkips;
    }

    public BigInteger getLastColumnstoreSegmentSkips() {
        return lastColumnstoreSegmentSkips;
    }

    public void setLastColumnstoreSegmentSkips(BigInteger lastColumnstoreSegmentSkips) {
        this.lastColumnstoreSegmentSkips = lastColumnstoreSegmentSkips;
    }

    public BigInteger getMinColumnstoreSegmentSkips() {
        return minColumnstoreSegmentSkips;
    }

    public void setMinColumnstoreSegmentSkips(BigInteger minColumnstoreSegmentSkips) {
        this.minColumnstoreSegmentSkips = minColumnstoreSegmentSkips;
    }

    public BigInteger getMaxColumnstoreSegmentSkips() {
        return maxColumnstoreSegmentSkips;
    }

    public void setMaxColumnstoreSegmentSkips(BigInteger maxColumnstoreSegmentSkips) {
        this.maxColumnstoreSegmentSkips = maxColumnstoreSegmentSkips;
    }

    public BigInteger getTotalSpills() {
        return totalSpills;
    }

    public void setTotalSpills(BigInteger totalSpills) {
        this.totalSpills = totalSpills;
    }

    public BigInteger getLastSpills() {
        return lastSpills;
    }

    public void setLastSpills(BigInteger lastSpills) {
        this.lastSpills = lastSpills;
    }

    public BigInteger getMinSpills() {
        return minSpills;
    }

    public void setMinSpills(BigInteger minSpills) {
        this.minSpills = minSpills;
    }

    public BigInteger getMaxSpills() {
        return maxSpills;
    }

    public void setMaxSpills(BigInteger maxSpills) {
        this.maxSpills = maxSpills;
    }

    public long getTotalNumPhysicalReads() {
        return totalNumPhysicalReads;
    }

    public void setTotalNumPhysicalReads(long totalNumPhysicalReads) {
        this.totalNumPhysicalReads = totalNumPhysicalReads;
    }

    public long getLastNumPhysicalReads() {
        return lastNumPhysicalReads;
    }

    public void setLastNumPhysicalReads(long lastNumPhysicalReads) {
        this.lastNumPhysicalReads = lastNumPhysicalReads;
    }

    public long getMinNumPhysicalReads() {
        return minNumPhysicalReads;
    }

    public void setMinNumPhysicalReads(long minNumPhysicalReads) {
        this.minNumPhysicalReads = minNumPhysicalReads;
    }

    public long getMaxNumPhysicalReads() {
        return maxNumPhysicalReads;
    }

    public void setMaxNumPhysicalReads(long maxNumPhysicalReads) {
        this.maxNumPhysicalReads = maxNumPhysicalReads;
    }

    public long getTotalPageServerReads() {
        return totalPageServerReads;
    }

    public void setTotalPageServerReads(long totalPageServerReads) {
        this.totalPageServerReads = totalPageServerReads;
    }

    public long getLastPageServerReads() {
        return lastPageServerReads;
    }

    public void setLastPageServerReads(long lastPageServerReads) {
        this.lastPageServerReads = lastPageServerReads;
    }

    public long getMinPageServerReads() {
        return minPageServerReads;
    }

    public void setMinPageServerReads(long minPageServerReads) {
        this.minPageServerReads = minPageServerReads;
    }

    public long getMaxPageServerReads() {
        return maxPageServerReads;
    }

    public void setMaxPageServerReads(long maxPageServerReads) {
        this.maxPageServerReads = maxPageServerReads;
    }

    public long getTotalNumPageServerReads() {
        return totalNumPageServerReads;
    }

    public void setTotalNumPageServerReads(long totalNumPageServerReads) {
        this.totalNumPageServerReads = totalNumPageServerReads;
    }

    public long getLastNumPageServerReads() {
        return lastNumPageServerReads;
    }

    public void setLastNumPageServerReads(long lastNumPageServerReads) {
        this.lastNumPageServerReads = lastNumPageServerReads;
    }

    public long getMinNumPageServerReads() {
        return minNumPageServerReads;
    }

    public void setMinNumPageServerReads(long minNumPageServerReads) {
        this.minNumPageServerReads = minNumPageServerReads;
    }

    public long getMaxNumPageServerReads() {
        return maxNumPageServerReads;
    }

    public void setMaxNumPageServerReads(long maxNumPageServerReads) {
        this.maxNumPageServerReads = maxNumPageServerReads;
    }
    
}
