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
@Table(name = "dm_distributed_exchange_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDistributedExchangeStats.findAll", query = "SELECT d FROM DmDistributedExchangeStats d"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByRequestId", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.requestId = :requestId"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByStepIndex", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.stepIndex = :stepIndex"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByDmsStepIndex", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.dmsStepIndex = :dmsStepIndex"),
    @NamedQuery(name = "DmDistributedExchangeStats.findBySourceDistributionId", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.sourceDistributionId = :sourceDistributionId"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByDestinationDistributionId", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.destinationDistributionId = :destinationDistributionId"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByType", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.type = :type"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByStatus", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.status = :status"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByBytesPerSec", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.bytesPerSec = :bytesPerSec"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByBytesProcessed", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.bytesProcessed = :bytesProcessed"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByRowsProcessed", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.rowsProcessed = :rowsProcessed"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByStartTime", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.startTime = :startTime"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByEndTime", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.endTime = :endTime"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByTotalElapsedTime", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.totalElapsedTime = :totalElapsedTime"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByCpuTime", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.cpuTime = :cpuTime"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByQueryTime", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.queryTime = :queryTime"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByBuffersAvailable", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.buffersAvailable = :buffersAvailable"),
    @NamedQuery(name = "DmDistributedExchangeStats.findBySqlSpid", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.sqlSpid = :sqlSpid"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByDmsCpid", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.dmsCpid = :dmsCpid"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByErrorId", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.errorId = :errorId"),
    @NamedQuery(name = "DmDistributedExchangeStats.findBySourceInfo", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.sourceInfo = :sourceInfo"),
    @NamedQuery(name = "DmDistributedExchangeStats.findByDestinationInfo", query = "SELECT d FROM DmDistributedExchangeStats d WHERE d.destinationInfo = :destinationInfo")})
public class DmDistributedExchangeStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 32)
    @Column(name = "request_id")
    private String requestId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "step_index")
    private int stepIndex;
    @Column(name = "dms_step_index")
    private Integer dmsStepIndex;
    @Basic(optional = false)
    @NotNull
    @Column(name = "source_distribution_id")
    private int sourceDistributionId;
    @Column(name = "destination_distribution_id")
    private Integer destinationDistributionId;
    @Size(max = 32)
    @Column(name = "type")
    private String type;
    @Size(max = 32)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bytes_per_sec")
    private long bytesPerSec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bytes_processed")
    private long bytesProcessed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_processed")
    private long rowsProcessed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "end_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_elapsed_time")
    private int totalElapsedTime;
    @Column(name = "cpu_time")
    private BigInteger cpuTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "query_time")
    private int queryTime;
    @Column(name = "buffers_available")
    private Integer buffersAvailable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sql_spid")
    private int sqlSpid;
    @Column(name = "dms_cpid")
    private Integer dmsCpid;
    @Size(max = 36)
    @Column(name = "error_id")
    private String errorId;
    @Size(max = 4000)
    @Column(name = "source_info")
    private String sourceInfo;
    @Size(max = 4000)
    @Column(name = "destination_info")
    private String destinationInfo;

    public DmDistributedExchangeStats() {
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public int getStepIndex() {
        return stepIndex;
    }

    public void setStepIndex(int stepIndex) {
        this.stepIndex = stepIndex;
    }

    public Integer getDmsStepIndex() {
        return dmsStepIndex;
    }

    public void setDmsStepIndex(Integer dmsStepIndex) {
        this.dmsStepIndex = dmsStepIndex;
    }

    public int getSourceDistributionId() {
        return sourceDistributionId;
    }

    public void setSourceDistributionId(int sourceDistributionId) {
        this.sourceDistributionId = sourceDistributionId;
    }

    public Integer getDestinationDistributionId() {
        return destinationDistributionId;
    }

    public void setDestinationDistributionId(Integer destinationDistributionId) {
        this.destinationDistributionId = destinationDistributionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getBytesPerSec() {
        return bytesPerSec;
    }

    public void setBytesPerSec(long bytesPerSec) {
        this.bytesPerSec = bytesPerSec;
    }

    public long getBytesProcessed() {
        return bytesProcessed;
    }

    public void setBytesProcessed(long bytesProcessed) {
        this.bytesProcessed = bytesProcessed;
    }

    public long getRowsProcessed() {
        return rowsProcessed;
    }

    public void setRowsProcessed(long rowsProcessed) {
        this.rowsProcessed = rowsProcessed;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(int totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public BigInteger getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(BigInteger cpuTime) {
        this.cpuTime = cpuTime;
    }

    public int getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(int queryTime) {
        this.queryTime = queryTime;
    }

    public Integer getBuffersAvailable() {
        return buffersAvailable;
    }

    public void setBuffersAvailable(Integer buffersAvailable) {
        this.buffersAvailable = buffersAvailable;
    }

    public int getSqlSpid() {
        return sqlSpid;
    }

    public void setSqlSpid(int sqlSpid) {
        this.sqlSpid = sqlSpid;
    }

    public Integer getDmsCpid() {
        return dmsCpid;
    }

    public void setDmsCpid(Integer dmsCpid) {
        this.dmsCpid = dmsCpid;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public String getSourceInfo() {
        return sourceInfo;
    }

    public void setSourceInfo(String sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    public String getDestinationInfo() {
        return destinationInfo;
    }

    public void setDestinationInfo(String destinationInfo) {
        this.destinationInfo = destinationInfo;
    }
    
}
