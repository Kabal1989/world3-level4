/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
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
@Table(name = "query_store_runtime_stats_interval")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QueryStoreRuntimeStatsInterval.findAll", query = "SELECT q FROM QueryStoreRuntimeStatsInterval q"),
    @NamedQuery(name = "QueryStoreRuntimeStatsInterval.findByRuntimeStatsIntervalId", query = "SELECT q FROM QueryStoreRuntimeStatsInterval q WHERE q.runtimeStatsIntervalId = :runtimeStatsIntervalId"),
    @NamedQuery(name = "QueryStoreRuntimeStatsInterval.findByStartTime", query = "SELECT q FROM QueryStoreRuntimeStatsInterval q WHERE q.startTime = :startTime"),
    @NamedQuery(name = "QueryStoreRuntimeStatsInterval.findByEndTime", query = "SELECT q FROM QueryStoreRuntimeStatsInterval q WHERE q.endTime = :endTime"),
    @NamedQuery(name = "QueryStoreRuntimeStatsInterval.findByComment", query = "SELECT q FROM QueryStoreRuntimeStatsInterval q WHERE q.comment = :comment")})
public class QueryStoreRuntimeStatsInterval implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "runtime_stats_interval_id")
    private long runtimeStatsIntervalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_time")
    private Serializable startTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "end_time")
    private Serializable endTime;
    @Size(max = 2147483647)
    @Column(name = "comment")
    private String comment;

    public QueryStoreRuntimeStatsInterval() {
    }

    public long getRuntimeStatsIntervalId() {
        return runtimeStatsIntervalId;
    }

    public void setRuntimeStatsIntervalId(long runtimeStatsIntervalId) {
        this.runtimeStatsIntervalId = runtimeStatsIntervalId;
    }

    public Serializable getStartTime() {
        return startTime;
    }

    public void setStartTime(Serializable startTime) {
        this.startTime = startTime;
    }

    public Serializable getEndTime() {
        return endTime;
    }

    public void setEndTime(Serializable endTime) {
        this.endTime = endTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
}
