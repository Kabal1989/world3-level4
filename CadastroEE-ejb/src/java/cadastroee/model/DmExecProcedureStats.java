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
@Table(name = "dm_exec_procedure_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecProcedureStats.findAll", query = "SELECT d FROM DmExecProcedureStats d"),
    @NamedQuery(name = "DmExecProcedureStats.findByDatabaseId", query = "SELECT d FROM DmExecProcedureStats d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmExecProcedureStats.findByObjectId", query = "SELECT d FROM DmExecProcedureStats d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmExecProcedureStats.findByType", query = "SELECT d FROM DmExecProcedureStats d WHERE d.type = :type"),
    @NamedQuery(name = "DmExecProcedureStats.findByTypeDesc", query = "SELECT d FROM DmExecProcedureStats d WHERE d.typeDesc = :typeDesc"),
    @NamedQuery(name = "DmExecProcedureStats.findByCachedTime", query = "SELECT d FROM DmExecProcedureStats d WHERE d.cachedTime = :cachedTime"),
    @NamedQuery(name = "DmExecProcedureStats.findByLastExecutionTime", query = "SELECT d FROM DmExecProcedureStats d WHERE d.lastExecutionTime = :lastExecutionTime"),
    @NamedQuery(name = "DmExecProcedureStats.findByExecutionCount", query = "SELECT d FROM DmExecProcedureStats d WHERE d.executionCount = :executionCount"),
    @NamedQuery(name = "DmExecProcedureStats.findByTotalWorkerTime", query = "SELECT d FROM DmExecProcedureStats d WHERE d.totalWorkerTime = :totalWorkerTime"),
    @NamedQuery(name = "DmExecProcedureStats.findByLastWorkerTime", query = "SELECT d FROM DmExecProcedureStats d WHERE d.lastWorkerTime = :lastWorkerTime"),
    @NamedQuery(name = "DmExecProcedureStats.findByMinWorkerTime", query = "SELECT d FROM DmExecProcedureStats d WHERE d.minWorkerTime = :minWorkerTime"),
    @NamedQuery(name = "DmExecProcedureStats.findByMaxWorkerTime", query = "SELECT d FROM DmExecProcedureStats d WHERE d.maxWorkerTime = :maxWorkerTime"),
    @NamedQuery(name = "DmExecProcedureStats.findByTotalPhysicalReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.totalPhysicalReads = :totalPhysicalReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByLastPhysicalReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.lastPhysicalReads = :lastPhysicalReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByMinPhysicalReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.minPhysicalReads = :minPhysicalReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByMaxPhysicalReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.maxPhysicalReads = :maxPhysicalReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByTotalLogicalWrites", query = "SELECT d FROM DmExecProcedureStats d WHERE d.totalLogicalWrites = :totalLogicalWrites"),
    @NamedQuery(name = "DmExecProcedureStats.findByLastLogicalWrites", query = "SELECT d FROM DmExecProcedureStats d WHERE d.lastLogicalWrites = :lastLogicalWrites"),
    @NamedQuery(name = "DmExecProcedureStats.findByMinLogicalWrites", query = "SELECT d FROM DmExecProcedureStats d WHERE d.minLogicalWrites = :minLogicalWrites"),
    @NamedQuery(name = "DmExecProcedureStats.findByMaxLogicalWrites", query = "SELECT d FROM DmExecProcedureStats d WHERE d.maxLogicalWrites = :maxLogicalWrites"),
    @NamedQuery(name = "DmExecProcedureStats.findByTotalLogicalReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.totalLogicalReads = :totalLogicalReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByLastLogicalReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.lastLogicalReads = :lastLogicalReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByMinLogicalReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.minLogicalReads = :minLogicalReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByMaxLogicalReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.maxLogicalReads = :maxLogicalReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByTotalElapsedTime", query = "SELECT d FROM DmExecProcedureStats d WHERE d.totalElapsedTime = :totalElapsedTime"),
    @NamedQuery(name = "DmExecProcedureStats.findByLastElapsedTime", query = "SELECT d FROM DmExecProcedureStats d WHERE d.lastElapsedTime = :lastElapsedTime"),
    @NamedQuery(name = "DmExecProcedureStats.findByMinElapsedTime", query = "SELECT d FROM DmExecProcedureStats d WHERE d.minElapsedTime = :minElapsedTime"),
    @NamedQuery(name = "DmExecProcedureStats.findByMaxElapsedTime", query = "SELECT d FROM DmExecProcedureStats d WHERE d.maxElapsedTime = :maxElapsedTime"),
    @NamedQuery(name = "DmExecProcedureStats.findByTotalSpills", query = "SELECT d FROM DmExecProcedureStats d WHERE d.totalSpills = :totalSpills"),
    @NamedQuery(name = "DmExecProcedureStats.findByLastSpills", query = "SELECT d FROM DmExecProcedureStats d WHERE d.lastSpills = :lastSpills"),
    @NamedQuery(name = "DmExecProcedureStats.findByMinSpills", query = "SELECT d FROM DmExecProcedureStats d WHERE d.minSpills = :minSpills"),
    @NamedQuery(name = "DmExecProcedureStats.findByMaxSpills", query = "SELECT d FROM DmExecProcedureStats d WHERE d.maxSpills = :maxSpills"),
    @NamedQuery(name = "DmExecProcedureStats.findByTotalNumPhysicalReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.totalNumPhysicalReads = :totalNumPhysicalReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByLastNumPhysicalReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.lastNumPhysicalReads = :lastNumPhysicalReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByMinNumPhysicalReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.minNumPhysicalReads = :minNumPhysicalReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByMaxNumPhysicalReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.maxNumPhysicalReads = :maxNumPhysicalReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByTotalPageServerReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.totalPageServerReads = :totalPageServerReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByLastPageServerReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.lastPageServerReads = :lastPageServerReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByMinPageServerReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.minPageServerReads = :minPageServerReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByMaxPageServerReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.maxPageServerReads = :maxPageServerReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByTotalNumPageServerReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.totalNumPageServerReads = :totalNumPageServerReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByLastNumPageServerReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.lastNumPageServerReads = :lastNumPageServerReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByMinNumPageServerReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.minNumPageServerReads = :minNumPageServerReads"),
    @NamedQuery(name = "DmExecProcedureStats.findByMaxNumPageServerReads", query = "SELECT d FROM DmExecProcedureStats d WHERE d.maxNumPageServerReads = :maxNumPageServerReads")})
public class DmExecProcedureStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Size(max = 2)
    @Column(name = "type")
    private String type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "sql_handle")
    private byte[] sqlHandle;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "plan_handle")
    private byte[] planHandle;
    @Column(name = "cached_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cachedTime;
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

    public DmExecProcedureStats() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
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

    public Date getCachedTime() {
        return cachedTime;
    }

    public void setCachedTime(Date cachedTime) {
        this.cachedTime = cachedTime;
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
