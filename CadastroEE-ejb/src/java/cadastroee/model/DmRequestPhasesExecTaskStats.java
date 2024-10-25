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
@Table(name = "dm_request_phases_exec_task_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmRequestPhasesExecTaskStats.findAll", query = "SELECT d FROM DmRequestPhasesExecTaskStats d"),
    @NamedQuery(name = "DmRequestPhasesExecTaskStats.findByDistRequestId", query = "SELECT d FROM DmRequestPhasesExecTaskStats d WHERE d.distRequestId = :distRequestId"),
    @NamedQuery(name = "DmRequestPhasesExecTaskStats.findById", query = "SELECT d FROM DmRequestPhasesExecTaskStats d WHERE d.id = :id"),
    @NamedQuery(name = "DmRequestPhasesExecTaskStats.findByMinTimeMs", query = "SELECT d FROM DmRequestPhasesExecTaskStats d WHERE d.minTimeMs = :minTimeMs"),
    @NamedQuery(name = "DmRequestPhasesExecTaskStats.findByMaxTimeMs", query = "SELECT d FROM DmRequestPhasesExecTaskStats d WHERE d.maxTimeMs = :maxTimeMs"),
    @NamedQuery(name = "DmRequestPhasesExecTaskStats.findByAvgTimeMs", query = "SELECT d FROM DmRequestPhasesExecTaskStats d WHERE d.avgTimeMs = :avgTimeMs"),
    @NamedQuery(name = "DmRequestPhasesExecTaskStats.findByStdevTimeMs", query = "SELECT d FROM DmRequestPhasesExecTaskStats d WHERE d.stdevTimeMs = :stdevTimeMs"),
    @NamedQuery(name = "DmRequestPhasesExecTaskStats.findByTotalBytesProcessed", query = "SELECT d FROM DmRequestPhasesExecTaskStats d WHERE d.totalBytesProcessed = :totalBytesProcessed"),
    @NamedQuery(name = "DmRequestPhasesExecTaskStats.findByMinRows", query = "SELECT d FROM DmRequestPhasesExecTaskStats d WHERE d.minRows = :minRows"),
    @NamedQuery(name = "DmRequestPhasesExecTaskStats.findByMaxRows", query = "SELECT d FROM DmRequestPhasesExecTaskStats d WHERE d.maxRows = :maxRows"),
    @NamedQuery(name = "DmRequestPhasesExecTaskStats.findByAvgRows", query = "SELECT d FROM DmRequestPhasesExecTaskStats d WHERE d.avgRows = :avgRows"),
    @NamedQuery(name = "DmRequestPhasesExecTaskStats.findByStdevRows", query = "SELECT d FROM DmRequestPhasesExecTaskStats d WHERE d.stdevRows = :stdevRows"),
    @NamedQuery(name = "DmRequestPhasesExecTaskStats.findByTotalRows", query = "SELECT d FROM DmRequestPhasesExecTaskStats d WHERE d.totalRows = :totalRows"),
    @NamedQuery(name = "DmRequestPhasesExecTaskStats.findByErrorId", query = "SELECT d FROM DmRequestPhasesExecTaskStats d WHERE d.errorId = :errorId")})
public class DmRequestPhasesExecTaskStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "dist_request_id")
    private String distRequestId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "id")
    private String id;
    @Column(name = "min_time_ms")
    private BigInteger minTimeMs;
    @Column(name = "max_time_ms")
    private BigInteger maxTimeMs;
    @Column(name = "avg_time_ms")
    private BigInteger avgTimeMs;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "stdev_time_ms")
    private Double stdevTimeMs;
    @Column(name = "total_bytes_processed")
    private BigInteger totalBytesProcessed;
    @Column(name = "min_rows")
    private BigInteger minRows;
    @Column(name = "max_rows")
    private BigInteger maxRows;
    @Column(name = "avg_rows")
    private BigInteger avgRows;
    @Column(name = "stdev_rows")
    private Double stdevRows;
    @Column(name = "total_rows")
    private BigInteger totalRows;
    @Size(max = 30)
    @Column(name = "error_id")
    private String errorId;

    public DmRequestPhasesExecTaskStats() {
    }

    public String getDistRequestId() {
        return distRequestId;
    }

    public void setDistRequestId(String distRequestId) {
        this.distRequestId = distRequestId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigInteger getMinTimeMs() {
        return minTimeMs;
    }

    public void setMinTimeMs(BigInteger minTimeMs) {
        this.minTimeMs = minTimeMs;
    }

    public BigInteger getMaxTimeMs() {
        return maxTimeMs;
    }

    public void setMaxTimeMs(BigInteger maxTimeMs) {
        this.maxTimeMs = maxTimeMs;
    }

    public BigInteger getAvgTimeMs() {
        return avgTimeMs;
    }

    public void setAvgTimeMs(BigInteger avgTimeMs) {
        this.avgTimeMs = avgTimeMs;
    }

    public Double getStdevTimeMs() {
        return stdevTimeMs;
    }

    public void setStdevTimeMs(Double stdevTimeMs) {
        this.stdevTimeMs = stdevTimeMs;
    }

    public BigInteger getTotalBytesProcessed() {
        return totalBytesProcessed;
    }

    public void setTotalBytesProcessed(BigInteger totalBytesProcessed) {
        this.totalBytesProcessed = totalBytesProcessed;
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

    public BigInteger getAvgRows() {
        return avgRows;
    }

    public void setAvgRows(BigInteger avgRows) {
        this.avgRows = avgRows;
    }

    public Double getStdevRows() {
        return stdevRows;
    }

    public void setStdevRows(Double stdevRows) {
        this.stdevRows = stdevRows;
    }

    public BigInteger getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(BigInteger totalRows) {
        this.totalRows = totalRows;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }
    
}
