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
@Table(name = "index_resumable_operations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IndexResumableOperations.findAll", query = "SELECT i FROM IndexResumableOperations i"),
    @NamedQuery(name = "IndexResumableOperations.findByObjectId", query = "SELECT i FROM IndexResumableOperations i WHERE i.objectId = :objectId"),
    @NamedQuery(name = "IndexResumableOperations.findByIndexId", query = "SELECT i FROM IndexResumableOperations i WHERE i.indexId = :indexId"),
    @NamedQuery(name = "IndexResumableOperations.findByName", query = "SELECT i FROM IndexResumableOperations i WHERE i.name = :name"),
    @NamedQuery(name = "IndexResumableOperations.findBySqlText", query = "SELECT i FROM IndexResumableOperations i WHERE i.sqlText = :sqlText"),
    @NamedQuery(name = "IndexResumableOperations.findByLastMaxDopUsed", query = "SELECT i FROM IndexResumableOperations i WHERE i.lastMaxDopUsed = :lastMaxDopUsed"),
    @NamedQuery(name = "IndexResumableOperations.findByPartitionNumber", query = "SELECT i FROM IndexResumableOperations i WHERE i.partitionNumber = :partitionNumber"),
    @NamedQuery(name = "IndexResumableOperations.findByState", query = "SELECT i FROM IndexResumableOperations i WHERE i.state = :state"),
    @NamedQuery(name = "IndexResumableOperations.findByStateDesc", query = "SELECT i FROM IndexResumableOperations i WHERE i.stateDesc = :stateDesc"),
    @NamedQuery(name = "IndexResumableOperations.findByStartTime", query = "SELECT i FROM IndexResumableOperations i WHERE i.startTime = :startTime"),
    @NamedQuery(name = "IndexResumableOperations.findByLastPauseTime", query = "SELECT i FROM IndexResumableOperations i WHERE i.lastPauseTime = :lastPauseTime"),
    @NamedQuery(name = "IndexResumableOperations.findByTotalExecutionTime", query = "SELECT i FROM IndexResumableOperations i WHERE i.totalExecutionTime = :totalExecutionTime"),
    @NamedQuery(name = "IndexResumableOperations.findByPercentComplete", query = "SELECT i FROM IndexResumableOperations i WHERE i.percentComplete = :percentComplete"),
    @NamedQuery(name = "IndexResumableOperations.findByPageCount", query = "SELECT i FROM IndexResumableOperations i WHERE i.pageCount = :pageCount")})
public class IndexResumableOperations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_id")
    private int indexId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 2147483647)
    @Column(name = "sql_text")
    private String sqlText;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_max_dop_used")
    private short lastMaxDopUsed;
    @Column(name = "partition_number")
    private Integer partitionNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state")
    private short state;
    @Size(max = 60)
    @Column(name = "state_desc")
    private String stateDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "last_pause_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastPauseTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_execution_time")
    private int totalExecutionTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "percent_complete")
    private double percentComplete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "page_count")
    private long pageCount;

    public IndexResumableOperations() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    public short getLastMaxDopUsed() {
        return lastMaxDopUsed;
    }

    public void setLastMaxDopUsed(short lastMaxDopUsed) {
        this.lastMaxDopUsed = lastMaxDopUsed;
    }

    public Integer getPartitionNumber() {
        return partitionNumber;
    }

    public void setPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getLastPauseTime() {
        return lastPauseTime;
    }

    public void setLastPauseTime(Date lastPauseTime) {
        this.lastPauseTime = lastPauseTime;
    }

    public int getTotalExecutionTime() {
        return totalExecutionTime;
    }

    public void setTotalExecutionTime(int totalExecutionTime) {
        this.totalExecutionTime = totalExecutionTime;
    }

    public double getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(double percentComplete) {
        this.percentComplete = percentComplete;
    }

    public long getPageCount() {
        return pageCount;
    }

    public void setPageCount(long pageCount) {
        this.pageCount = pageCount;
    }
    
}
