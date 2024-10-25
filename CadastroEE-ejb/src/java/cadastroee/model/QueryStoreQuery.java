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
@Table(name = "query_store_query")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QueryStoreQuery.findAll", query = "SELECT q FROM QueryStoreQuery q"),
    @NamedQuery(name = "QueryStoreQuery.findByQueryId", query = "SELECT q FROM QueryStoreQuery q WHERE q.queryId = :queryId"),
    @NamedQuery(name = "QueryStoreQuery.findByQueryTextId", query = "SELECT q FROM QueryStoreQuery q WHERE q.queryTextId = :queryTextId"),
    @NamedQuery(name = "QueryStoreQuery.findByContextSettingsId", query = "SELECT q FROM QueryStoreQuery q WHERE q.contextSettingsId = :contextSettingsId"),
    @NamedQuery(name = "QueryStoreQuery.findByObjectId", query = "SELECT q FROM QueryStoreQuery q WHERE q.objectId = :objectId"),
    @NamedQuery(name = "QueryStoreQuery.findByIsInternalQuery", query = "SELECT q FROM QueryStoreQuery q WHERE q.isInternalQuery = :isInternalQuery"),
    @NamedQuery(name = "QueryStoreQuery.findByQueryParameterizationType", query = "SELECT q FROM QueryStoreQuery q WHERE q.queryParameterizationType = :queryParameterizationType"),
    @NamedQuery(name = "QueryStoreQuery.findByQueryParameterizationTypeDesc", query = "SELECT q FROM QueryStoreQuery q WHERE q.queryParameterizationTypeDesc = :queryParameterizationTypeDesc"),
    @NamedQuery(name = "QueryStoreQuery.findByInitialCompileStartTime", query = "SELECT q FROM QueryStoreQuery q WHERE q.initialCompileStartTime = :initialCompileStartTime"),
    @NamedQuery(name = "QueryStoreQuery.findByLastCompileStartTime", query = "SELECT q FROM QueryStoreQuery q WHERE q.lastCompileStartTime = :lastCompileStartTime"),
    @NamedQuery(name = "QueryStoreQuery.findByLastExecutionTime", query = "SELECT q FROM QueryStoreQuery q WHERE q.lastExecutionTime = :lastExecutionTime"),
    @NamedQuery(name = "QueryStoreQuery.findByLastCompileBatchOffsetStart", query = "SELECT q FROM QueryStoreQuery q WHERE q.lastCompileBatchOffsetStart = :lastCompileBatchOffsetStart"),
    @NamedQuery(name = "QueryStoreQuery.findByLastCompileBatchOffsetEnd", query = "SELECT q FROM QueryStoreQuery q WHERE q.lastCompileBatchOffsetEnd = :lastCompileBatchOffsetEnd"),
    @NamedQuery(name = "QueryStoreQuery.findByCountCompiles", query = "SELECT q FROM QueryStoreQuery q WHERE q.countCompiles = :countCompiles"),
    @NamedQuery(name = "QueryStoreQuery.findByAvgCompileDuration", query = "SELECT q FROM QueryStoreQuery q WHERE q.avgCompileDuration = :avgCompileDuration"),
    @NamedQuery(name = "QueryStoreQuery.findByLastCompileDuration", query = "SELECT q FROM QueryStoreQuery q WHERE q.lastCompileDuration = :lastCompileDuration"),
    @NamedQuery(name = "QueryStoreQuery.findByAvgBindDuration", query = "SELECT q FROM QueryStoreQuery q WHERE q.avgBindDuration = :avgBindDuration"),
    @NamedQuery(name = "QueryStoreQuery.findByLastBindDuration", query = "SELECT q FROM QueryStoreQuery q WHERE q.lastBindDuration = :lastBindDuration"),
    @NamedQuery(name = "QueryStoreQuery.findByAvgBindCpuTime", query = "SELECT q FROM QueryStoreQuery q WHERE q.avgBindCpuTime = :avgBindCpuTime"),
    @NamedQuery(name = "QueryStoreQuery.findByLastBindCpuTime", query = "SELECT q FROM QueryStoreQuery q WHERE q.lastBindCpuTime = :lastBindCpuTime"),
    @NamedQuery(name = "QueryStoreQuery.findByAvgOptimizeDuration", query = "SELECT q FROM QueryStoreQuery q WHERE q.avgOptimizeDuration = :avgOptimizeDuration"),
    @NamedQuery(name = "QueryStoreQuery.findByLastOptimizeDuration", query = "SELECT q FROM QueryStoreQuery q WHERE q.lastOptimizeDuration = :lastOptimizeDuration"),
    @NamedQuery(name = "QueryStoreQuery.findByAvgOptimizeCpuTime", query = "SELECT q FROM QueryStoreQuery q WHERE q.avgOptimizeCpuTime = :avgOptimizeCpuTime"),
    @NamedQuery(name = "QueryStoreQuery.findByLastOptimizeCpuTime", query = "SELECT q FROM QueryStoreQuery q WHERE q.lastOptimizeCpuTime = :lastOptimizeCpuTime"),
    @NamedQuery(name = "QueryStoreQuery.findByAvgCompileMemoryKb", query = "SELECT q FROM QueryStoreQuery q WHERE q.avgCompileMemoryKb = :avgCompileMemoryKb"),
    @NamedQuery(name = "QueryStoreQuery.findByLastCompileMemoryKb", query = "SELECT q FROM QueryStoreQuery q WHERE q.lastCompileMemoryKb = :lastCompileMemoryKb"),
    @NamedQuery(name = "QueryStoreQuery.findByMaxCompileMemoryKb", query = "SELECT q FROM QueryStoreQuery q WHERE q.maxCompileMemoryKb = :maxCompileMemoryKb"),
    @NamedQuery(name = "QueryStoreQuery.findByIsClouddbInternalQuery", query = "SELECT q FROM QueryStoreQuery q WHERE q.isClouddbInternalQuery = :isClouddbInternalQuery")})
public class QueryStoreQuery implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "query_id")
    private long queryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "query_text_id")
    private long queryTextId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "context_settings_id")
    private long contextSettingsId;
    @Column(name = "object_id")
    private BigInteger objectId;
    @Lob
    @Column(name = "batch_sql_handle")
    private byte[] batchSqlHandle;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "query_hash")
    private byte[] queryHash;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_internal_query")
    private boolean isInternalQuery;
    @Basic(optional = false)
    @NotNull
    @Column(name = "query_parameterization_type")
    private short queryParameterizationType;
    @Size(max = 60)
    @Column(name = "query_parameterization_type_desc")
    private String queryParameterizationTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "initial_compile_start_time")
    private Serializable initialCompileStartTime;
    @Column(name = "last_compile_start_time")
    private Serializable lastCompileStartTime;
    @Column(name = "last_execution_time")
    private Serializable lastExecutionTime;
    @Lob
    @Column(name = "last_compile_batch_sql_handle")
    private byte[] lastCompileBatchSqlHandle;
    @Column(name = "last_compile_batch_offset_start")
    private BigInteger lastCompileBatchOffsetStart;
    @Column(name = "last_compile_batch_offset_end")
    private BigInteger lastCompileBatchOffsetEnd;
    @Column(name = "count_compiles")
    private BigInteger countCompiles;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "avg_compile_duration")
    private Double avgCompileDuration;
    @Column(name = "last_compile_duration")
    private BigInteger lastCompileDuration;
    @Column(name = "avg_bind_duration")
    private Double avgBindDuration;
    @Column(name = "last_bind_duration")
    private BigInteger lastBindDuration;
    @Column(name = "avg_bind_cpu_time")
    private Double avgBindCpuTime;
    @Column(name = "last_bind_cpu_time")
    private BigInteger lastBindCpuTime;
    @Column(name = "avg_optimize_duration")
    private Double avgOptimizeDuration;
    @Column(name = "last_optimize_duration")
    private BigInteger lastOptimizeDuration;
    @Column(name = "avg_optimize_cpu_time")
    private Double avgOptimizeCpuTime;
    @Column(name = "last_optimize_cpu_time")
    private BigInteger lastOptimizeCpuTime;
    @Column(name = "avg_compile_memory_kb")
    private Double avgCompileMemoryKb;
    @Column(name = "last_compile_memory_kb")
    private BigInteger lastCompileMemoryKb;
    @Column(name = "max_compile_memory_kb")
    private BigInteger maxCompileMemoryKb;
    @Column(name = "is_clouddb_internal_query")
    private Boolean isClouddbInternalQuery;

    public QueryStoreQuery() {
    }

    public long getQueryId() {
        return queryId;
    }

    public void setQueryId(long queryId) {
        this.queryId = queryId;
    }

    public long getQueryTextId() {
        return queryTextId;
    }

    public void setQueryTextId(long queryTextId) {
        this.queryTextId = queryTextId;
    }

    public long getContextSettingsId() {
        return contextSettingsId;
    }

    public void setContextSettingsId(long contextSettingsId) {
        this.contextSettingsId = contextSettingsId;
    }

    public BigInteger getObjectId() {
        return objectId;
    }

    public void setObjectId(BigInteger objectId) {
        this.objectId = objectId;
    }

    public byte[] getBatchSqlHandle() {
        return batchSqlHandle;
    }

    public void setBatchSqlHandle(byte[] batchSqlHandle) {
        this.batchSqlHandle = batchSqlHandle;
    }

    public byte[] getQueryHash() {
        return queryHash;
    }

    public void setQueryHash(byte[] queryHash) {
        this.queryHash = queryHash;
    }

    public boolean getIsInternalQuery() {
        return isInternalQuery;
    }

    public void setIsInternalQuery(boolean isInternalQuery) {
        this.isInternalQuery = isInternalQuery;
    }

    public short getQueryParameterizationType() {
        return queryParameterizationType;
    }

    public void setQueryParameterizationType(short queryParameterizationType) {
        this.queryParameterizationType = queryParameterizationType;
    }

    public String getQueryParameterizationTypeDesc() {
        return queryParameterizationTypeDesc;
    }

    public void setQueryParameterizationTypeDesc(String queryParameterizationTypeDesc) {
        this.queryParameterizationTypeDesc = queryParameterizationTypeDesc;
    }

    public Serializable getInitialCompileStartTime() {
        return initialCompileStartTime;
    }

    public void setInitialCompileStartTime(Serializable initialCompileStartTime) {
        this.initialCompileStartTime = initialCompileStartTime;
    }

    public Serializable getLastCompileStartTime() {
        return lastCompileStartTime;
    }

    public void setLastCompileStartTime(Serializable lastCompileStartTime) {
        this.lastCompileStartTime = lastCompileStartTime;
    }

    public Serializable getLastExecutionTime() {
        return lastExecutionTime;
    }

    public void setLastExecutionTime(Serializable lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
    }

    public byte[] getLastCompileBatchSqlHandle() {
        return lastCompileBatchSqlHandle;
    }

    public void setLastCompileBatchSqlHandle(byte[] lastCompileBatchSqlHandle) {
        this.lastCompileBatchSqlHandle = lastCompileBatchSqlHandle;
    }

    public BigInteger getLastCompileBatchOffsetStart() {
        return lastCompileBatchOffsetStart;
    }

    public void setLastCompileBatchOffsetStart(BigInteger lastCompileBatchOffsetStart) {
        this.lastCompileBatchOffsetStart = lastCompileBatchOffsetStart;
    }

    public BigInteger getLastCompileBatchOffsetEnd() {
        return lastCompileBatchOffsetEnd;
    }

    public void setLastCompileBatchOffsetEnd(BigInteger lastCompileBatchOffsetEnd) {
        this.lastCompileBatchOffsetEnd = lastCompileBatchOffsetEnd;
    }

    public BigInteger getCountCompiles() {
        return countCompiles;
    }

    public void setCountCompiles(BigInteger countCompiles) {
        this.countCompiles = countCompiles;
    }

    public Double getAvgCompileDuration() {
        return avgCompileDuration;
    }

    public void setAvgCompileDuration(Double avgCompileDuration) {
        this.avgCompileDuration = avgCompileDuration;
    }

    public BigInteger getLastCompileDuration() {
        return lastCompileDuration;
    }

    public void setLastCompileDuration(BigInteger lastCompileDuration) {
        this.lastCompileDuration = lastCompileDuration;
    }

    public Double getAvgBindDuration() {
        return avgBindDuration;
    }

    public void setAvgBindDuration(Double avgBindDuration) {
        this.avgBindDuration = avgBindDuration;
    }

    public BigInteger getLastBindDuration() {
        return lastBindDuration;
    }

    public void setLastBindDuration(BigInteger lastBindDuration) {
        this.lastBindDuration = lastBindDuration;
    }

    public Double getAvgBindCpuTime() {
        return avgBindCpuTime;
    }

    public void setAvgBindCpuTime(Double avgBindCpuTime) {
        this.avgBindCpuTime = avgBindCpuTime;
    }

    public BigInteger getLastBindCpuTime() {
        return lastBindCpuTime;
    }

    public void setLastBindCpuTime(BigInteger lastBindCpuTime) {
        this.lastBindCpuTime = lastBindCpuTime;
    }

    public Double getAvgOptimizeDuration() {
        return avgOptimizeDuration;
    }

    public void setAvgOptimizeDuration(Double avgOptimizeDuration) {
        this.avgOptimizeDuration = avgOptimizeDuration;
    }

    public BigInteger getLastOptimizeDuration() {
        return lastOptimizeDuration;
    }

    public void setLastOptimizeDuration(BigInteger lastOptimizeDuration) {
        this.lastOptimizeDuration = lastOptimizeDuration;
    }

    public Double getAvgOptimizeCpuTime() {
        return avgOptimizeCpuTime;
    }

    public void setAvgOptimizeCpuTime(Double avgOptimizeCpuTime) {
        this.avgOptimizeCpuTime = avgOptimizeCpuTime;
    }

    public BigInteger getLastOptimizeCpuTime() {
        return lastOptimizeCpuTime;
    }

    public void setLastOptimizeCpuTime(BigInteger lastOptimizeCpuTime) {
        this.lastOptimizeCpuTime = lastOptimizeCpuTime;
    }

    public Double getAvgCompileMemoryKb() {
        return avgCompileMemoryKb;
    }

    public void setAvgCompileMemoryKb(Double avgCompileMemoryKb) {
        this.avgCompileMemoryKb = avgCompileMemoryKb;
    }

    public BigInteger getLastCompileMemoryKb() {
        return lastCompileMemoryKb;
    }

    public void setLastCompileMemoryKb(BigInteger lastCompileMemoryKb) {
        this.lastCompileMemoryKb = lastCompileMemoryKb;
    }

    public BigInteger getMaxCompileMemoryKb() {
        return maxCompileMemoryKb;
    }

    public void setMaxCompileMemoryKb(BigInteger maxCompileMemoryKb) {
        this.maxCompileMemoryKb = maxCompileMemoryKb;
    }

    public Boolean getIsClouddbInternalQuery() {
        return isClouddbInternalQuery;
    }

    public void setIsClouddbInternalQuery(Boolean isClouddbInternalQuery) {
        this.isClouddbInternalQuery = isClouddbInternalQuery;
    }
    
}
