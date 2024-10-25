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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_xtp_gc_queue_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXtpGcQueueStats.findAll", query = "SELECT d FROM DmXtpGcQueueStats d"),
    @NamedQuery(name = "DmXtpGcQueueStats.findByQueueId", query = "SELECT d FROM DmXtpGcQueueStats d WHERE d.queueId = :queueId"),
    @NamedQuery(name = "DmXtpGcQueueStats.findByTotalEnqueues", query = "SELECT d FROM DmXtpGcQueueStats d WHERE d.totalEnqueues = :totalEnqueues"),
    @NamedQuery(name = "DmXtpGcQueueStats.findByTotalDequeues", query = "SELECT d FROM DmXtpGcQueueStats d WHERE d.totalDequeues = :totalDequeues"),
    @NamedQuery(name = "DmXtpGcQueueStats.findByCurrentQueueDepth", query = "SELECT d FROM DmXtpGcQueueStats d WHERE d.currentQueueDepth = :currentQueueDepth"),
    @NamedQuery(name = "DmXtpGcQueueStats.findByMaximumQueueDepth", query = "SELECT d FROM DmXtpGcQueueStats d WHERE d.maximumQueueDepth = :maximumQueueDepth"),
    @NamedQuery(name = "DmXtpGcQueueStats.findByLastServiceTicks", query = "SELECT d FROM DmXtpGcQueueStats d WHERE d.lastServiceTicks = :lastServiceTicks")})
public class DmXtpGcQueueStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "queue_id")
    private int queueId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_enqueues")
    private long totalEnqueues;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_dequeues")
    private long totalDequeues;
    @Basic(optional = false)
    @NotNull
    @Column(name = "current_queue_depth")
    private long currentQueueDepth;
    @Basic(optional = false)
    @NotNull
    @Column(name = "maximum_queue_depth")
    private long maximumQueueDepth;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_service_ticks")
    private long lastServiceTicks;

    public DmXtpGcQueueStats() {
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(int queueId) {
        this.queueId = queueId;
    }

    public long getTotalEnqueues() {
        return totalEnqueues;
    }

    public void setTotalEnqueues(long totalEnqueues) {
        this.totalEnqueues = totalEnqueues;
    }

    public long getTotalDequeues() {
        return totalDequeues;
    }

    public void setTotalDequeues(long totalDequeues) {
        this.totalDequeues = totalDequeues;
    }

    public long getCurrentQueueDepth() {
        return currentQueueDepth;
    }

    public void setCurrentQueueDepth(long currentQueueDepth) {
        this.currentQueueDepth = currentQueueDepth;
    }

    public long getMaximumQueueDepth() {
        return maximumQueueDepth;
    }

    public void setMaximumQueueDepth(long maximumQueueDepth) {
        this.maximumQueueDepth = maximumQueueDepth;
    }

    public long getLastServiceTicks() {
        return lastServiceTicks;
    }

    public void setLastServiceTicks(long lastServiceTicks) {
        this.lastServiceTicks = lastServiceTicks;
    }
    
}
