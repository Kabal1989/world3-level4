/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
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
@Table(name = "dm_fts_index_population")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmFtsIndexPopulation.findAll", query = "SELECT d FROM DmFtsIndexPopulation d"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByDatabaseId", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByCatalogId", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.catalogId = :catalogId"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByTableId", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.tableId = :tableId"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByPopulationType", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.populationType = :populationType"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByPopulationTypeDescription", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.populationTypeDescription = :populationTypeDescription"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByIsClusteredIndexScan", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.isClusteredIndexScan = :isClusteredIndexScan"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByRangeCount", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.rangeCount = :rangeCount"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByCompletedRangeCount", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.completedRangeCount = :completedRangeCount"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByOutstandingBatchCount", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.outstandingBatchCount = :outstandingBatchCount"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByStatus", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.status = :status"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByStatusDescription", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.statusDescription = :statusDescription"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByCompletionType", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.completionType = :completionType"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByCompletionTypeDescription", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.completionTypeDescription = :completionTypeDescription"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByWorkerCount", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.workerCount = :workerCount"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByQueuedPopulationType", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.queuedPopulationType = :queuedPopulationType"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByQueuedPopulationTypeDescription", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.queuedPopulationTypeDescription = :queuedPopulationTypeDescription"),
    @NamedQuery(name = "DmFtsIndexPopulation.findByStartTime", query = "SELECT d FROM DmFtsIndexPopulation d WHERE d.startTime = :startTime")})
public class DmFtsIndexPopulation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "catalog_id")
    private int catalogId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "table_id")
    private int tableId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_address")
    private byte[] memoryAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "population_type")
    private int populationType;
    @Size(max = 64)
    @Column(name = "population_type_description")
    private String populationTypeDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_clustered_index_scan")
    private boolean isClusteredIndexScan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "range_count")
    private int rangeCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "completed_range_count")
    private int completedRangeCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "outstanding_batch_count")
    private int outstandingBatchCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @Size(max = 64)
    @Column(name = "status_description")
    private String statusDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "completion_type")
    private int completionType;
    @Size(max = 64)
    @Column(name = "completion_type_description")
    private String completionTypeDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "worker_count")
    private int workerCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "queued_population_type")
    private int queuedPopulationType;
    @Size(max = 64)
    @Column(name = "queued_population_type_description")
    private String queuedPopulationTypeDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "incremental_timestamp")
    private byte[] incrementalTimestamp;

    public DmFtsIndexPopulation() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public byte[] getMemoryAddress() {
        return memoryAddress;
    }

    public void setMemoryAddress(byte[] memoryAddress) {
        this.memoryAddress = memoryAddress;
    }

    public int getPopulationType() {
        return populationType;
    }

    public void setPopulationType(int populationType) {
        this.populationType = populationType;
    }

    public String getPopulationTypeDescription() {
        return populationTypeDescription;
    }

    public void setPopulationTypeDescription(String populationTypeDescription) {
        this.populationTypeDescription = populationTypeDescription;
    }

    public boolean getIsClusteredIndexScan() {
        return isClusteredIndexScan;
    }

    public void setIsClusteredIndexScan(boolean isClusteredIndexScan) {
        this.isClusteredIndexScan = isClusteredIndexScan;
    }

    public int getRangeCount() {
        return rangeCount;
    }

    public void setRangeCount(int rangeCount) {
        this.rangeCount = rangeCount;
    }

    public int getCompletedRangeCount() {
        return completedRangeCount;
    }

    public void setCompletedRangeCount(int completedRangeCount) {
        this.completedRangeCount = completedRangeCount;
    }

    public int getOutstandingBatchCount() {
        return outstandingBatchCount;
    }

    public void setOutstandingBatchCount(int outstandingBatchCount) {
        this.outstandingBatchCount = outstandingBatchCount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public int getCompletionType() {
        return completionType;
    }

    public void setCompletionType(int completionType) {
        this.completionType = completionType;
    }

    public String getCompletionTypeDescription() {
        return completionTypeDescription;
    }

    public void setCompletionTypeDescription(String completionTypeDescription) {
        this.completionTypeDescription = completionTypeDescription;
    }

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }

    public int getQueuedPopulationType() {
        return queuedPopulationType;
    }

    public void setQueuedPopulationType(int queuedPopulationType) {
        this.queuedPopulationType = queuedPopulationType;
    }

    public String getQueuedPopulationTypeDescription() {
        return queuedPopulationTypeDescription;
    }

    public void setQueuedPopulationTypeDescription(String queuedPopulationTypeDescription) {
        this.queuedPopulationTypeDescription = queuedPopulationTypeDescription;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public byte[] getIncrementalTimestamp() {
        return incrementalTimestamp;
    }

    public void setIncrementalTimestamp(byte[] incrementalTimestamp) {
        this.incrementalTimestamp = incrementalTimestamp;
    }
    
}
