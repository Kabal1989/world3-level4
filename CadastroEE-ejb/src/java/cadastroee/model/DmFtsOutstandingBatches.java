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
@Table(name = "dm_fts_outstanding_batches")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmFtsOutstandingBatches.findAll", query = "SELECT d FROM DmFtsOutstandingBatches d"),
    @NamedQuery(name = "DmFtsOutstandingBatches.findByDatabaseId", query = "SELECT d FROM DmFtsOutstandingBatches d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmFtsOutstandingBatches.findByCatalogId", query = "SELECT d FROM DmFtsOutstandingBatches d WHERE d.catalogId = :catalogId"),
    @NamedQuery(name = "DmFtsOutstandingBatches.findByTableId", query = "SELECT d FROM DmFtsOutstandingBatches d WHERE d.tableId = :tableId"),
    @NamedQuery(name = "DmFtsOutstandingBatches.findByBatchId", query = "SELECT d FROM DmFtsOutstandingBatches d WHERE d.batchId = :batchId"),
    @NamedQuery(name = "DmFtsOutstandingBatches.findByHrBatch", query = "SELECT d FROM DmFtsOutstandingBatches d WHERE d.hrBatch = :hrBatch"),
    @NamedQuery(name = "DmFtsOutstandingBatches.findByIsRetryBatch", query = "SELECT d FROM DmFtsOutstandingBatches d WHERE d.isRetryBatch = :isRetryBatch"),
    @NamedQuery(name = "DmFtsOutstandingBatches.findByRetryHints", query = "SELECT d FROM DmFtsOutstandingBatches d WHERE d.retryHints = :retryHints"),
    @NamedQuery(name = "DmFtsOutstandingBatches.findByRetryHintsDescription", query = "SELECT d FROM DmFtsOutstandingBatches d WHERE d.retryHintsDescription = :retryHintsDescription"),
    @NamedQuery(name = "DmFtsOutstandingBatches.findByDocFailed", query = "SELECT d FROM DmFtsOutstandingBatches d WHERE d.docFailed = :docFailed")})
public class DmFtsOutstandingBatches implements Serializable {

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
    @Column(name = "batch_id")
    private int batchId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_address")
    private byte[] memoryAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "crawl_memory_address")
    private byte[] crawlMemoryAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memregion_memory_address")
    private byte[] memregionMemoryAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hr_batch")
    private int hrBatch;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_retry_batch")
    private boolean isRetryBatch;
    @Basic(optional = false)
    @NotNull
    @Column(name = "retry_hints")
    private int retryHints;
    @Size(max = 64)
    @Column(name = "retry_hints_description")
    private String retryHintsDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "doc_failed")
    private long docFailed;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "batch_timestamp")
    private byte[] batchTimestamp;

    public DmFtsOutstandingBatches() {
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

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public byte[] getMemoryAddress() {
        return memoryAddress;
    }

    public void setMemoryAddress(byte[] memoryAddress) {
        this.memoryAddress = memoryAddress;
    }

    public byte[] getCrawlMemoryAddress() {
        return crawlMemoryAddress;
    }

    public void setCrawlMemoryAddress(byte[] crawlMemoryAddress) {
        this.crawlMemoryAddress = crawlMemoryAddress;
    }

    public byte[] getMemregionMemoryAddress() {
        return memregionMemoryAddress;
    }

    public void setMemregionMemoryAddress(byte[] memregionMemoryAddress) {
        this.memregionMemoryAddress = memregionMemoryAddress;
    }

    public int getHrBatch() {
        return hrBatch;
    }

    public void setHrBatch(int hrBatch) {
        this.hrBatch = hrBatch;
    }

    public boolean getIsRetryBatch() {
        return isRetryBatch;
    }

    public void setIsRetryBatch(boolean isRetryBatch) {
        this.isRetryBatch = isRetryBatch;
    }

    public int getRetryHints() {
        return retryHints;
    }

    public void setRetryHints(int retryHints) {
        this.retryHints = retryHints;
    }

    public String getRetryHintsDescription() {
        return retryHintsDescription;
    }

    public void setRetryHintsDescription(String retryHintsDescription) {
        this.retryHintsDescription = retryHintsDescription;
    }

    public long getDocFailed() {
        return docFailed;
    }

    public void setDocFailed(long docFailed) {
        this.docFailed = docFailed;
    }

    public byte[] getBatchTimestamp() {
        return batchTimestamp;
    }

    public void setBatchTimestamp(byte[] batchTimestamp) {
        this.batchTimestamp = batchTimestamp;
    }
    
}
