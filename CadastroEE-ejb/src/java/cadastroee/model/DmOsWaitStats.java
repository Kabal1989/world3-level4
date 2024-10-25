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
@Table(name = "dm_os_wait_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsWaitStats.findAll", query = "SELECT d FROM DmOsWaitStats d"),
    @NamedQuery(name = "DmOsWaitStats.findByWaitType", query = "SELECT d FROM DmOsWaitStats d WHERE d.waitType = :waitType"),
    @NamedQuery(name = "DmOsWaitStats.findByWaitingTasksCount", query = "SELECT d FROM DmOsWaitStats d WHERE d.waitingTasksCount = :waitingTasksCount"),
    @NamedQuery(name = "DmOsWaitStats.findByWaitTimeMs", query = "SELECT d FROM DmOsWaitStats d WHERE d.waitTimeMs = :waitTimeMs"),
    @NamedQuery(name = "DmOsWaitStats.findByMaxWaitTimeMs", query = "SELECT d FROM DmOsWaitStats d WHERE d.maxWaitTimeMs = :maxWaitTimeMs"),
    @NamedQuery(name = "DmOsWaitStats.findBySignalWaitTimeMs", query = "SELECT d FROM DmOsWaitStats d WHERE d.signalWaitTimeMs = :signalWaitTimeMs")})
public class DmOsWaitStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "wait_type")
    private String waitType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "waiting_tasks_count")
    private long waitingTasksCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wait_time_ms")
    private long waitTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_wait_time_ms")
    private long maxWaitTimeMs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "signal_wait_time_ms")
    private long signalWaitTimeMs;

    public DmOsWaitStats() {
    }

    public String getWaitType() {
        return waitType;
    }

    public void setWaitType(String waitType) {
        this.waitType = waitType;
    }

    public long getWaitingTasksCount() {
        return waitingTasksCount;
    }

    public void setWaitingTasksCount(long waitingTasksCount) {
        this.waitingTasksCount = waitingTasksCount;
    }

    public long getWaitTimeMs() {
        return waitTimeMs;
    }

    public void setWaitTimeMs(long waitTimeMs) {
        this.waitTimeMs = waitTimeMs;
    }

    public long getMaxWaitTimeMs() {
        return maxWaitTimeMs;
    }

    public void setMaxWaitTimeMs(long maxWaitTimeMs) {
        this.maxWaitTimeMs = maxWaitTimeMs;
    }

    public long getSignalWaitTimeMs() {
        return signalWaitTimeMs;
    }

    public void setSignalWaitTimeMs(long signalWaitTimeMs) {
        this.signalWaitTimeMs = signalWaitTimeMs;
    }
    
}
