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
@Table(name = "dm_os_memory_brokers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsMemoryBrokers.findAll", query = "SELECT d FROM DmOsMemoryBrokers d"),
    @NamedQuery(name = "DmOsMemoryBrokers.findByPoolId", query = "SELECT d FROM DmOsMemoryBrokers d WHERE d.poolId = :poolId"),
    @NamedQuery(name = "DmOsMemoryBrokers.findByMemoryBrokerType", query = "SELECT d FROM DmOsMemoryBrokers d WHERE d.memoryBrokerType = :memoryBrokerType"),
    @NamedQuery(name = "DmOsMemoryBrokers.findByAllocationsKb", query = "SELECT d FROM DmOsMemoryBrokers d WHERE d.allocationsKb = :allocationsKb"),
    @NamedQuery(name = "DmOsMemoryBrokers.findByAllocationsKbPerSec", query = "SELECT d FROM DmOsMemoryBrokers d WHERE d.allocationsKbPerSec = :allocationsKbPerSec"),
    @NamedQuery(name = "DmOsMemoryBrokers.findByPredictedAllocationsKb", query = "SELECT d FROM DmOsMemoryBrokers d WHERE d.predictedAllocationsKb = :predictedAllocationsKb"),
    @NamedQuery(name = "DmOsMemoryBrokers.findByTargetAllocationsKb", query = "SELECT d FROM DmOsMemoryBrokers d WHERE d.targetAllocationsKb = :targetAllocationsKb"),
    @NamedQuery(name = "DmOsMemoryBrokers.findByFutureAllocationsKb", query = "SELECT d FROM DmOsMemoryBrokers d WHERE d.futureAllocationsKb = :futureAllocationsKb"),
    @NamedQuery(name = "DmOsMemoryBrokers.findByOverallLimitKb", query = "SELECT d FROM DmOsMemoryBrokers d WHERE d.overallLimitKb = :overallLimitKb"),
    @NamedQuery(name = "DmOsMemoryBrokers.findByLastNotification", query = "SELECT d FROM DmOsMemoryBrokers d WHERE d.lastNotification = :lastNotification")})
public class DmOsMemoryBrokers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pool_id")
    private int poolId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "memory_broker_type")
    private String memoryBrokerType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "allocations_kb")
    private long allocationsKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "allocations_kb_per_sec")
    private long allocationsKbPerSec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "predicted_allocations_kb")
    private long predictedAllocationsKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "target_allocations_kb")
    private long targetAllocationsKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "future_allocations_kb")
    private long futureAllocationsKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "overall_limit_kb")
    private long overallLimitKb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "last_notification")
    private String lastNotification;

    public DmOsMemoryBrokers() {
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public String getMemoryBrokerType() {
        return memoryBrokerType;
    }

    public void setMemoryBrokerType(String memoryBrokerType) {
        this.memoryBrokerType = memoryBrokerType;
    }

    public long getAllocationsKb() {
        return allocationsKb;
    }

    public void setAllocationsKb(long allocationsKb) {
        this.allocationsKb = allocationsKb;
    }

    public long getAllocationsKbPerSec() {
        return allocationsKbPerSec;
    }

    public void setAllocationsKbPerSec(long allocationsKbPerSec) {
        this.allocationsKbPerSec = allocationsKbPerSec;
    }

    public long getPredictedAllocationsKb() {
        return predictedAllocationsKb;
    }

    public void setPredictedAllocationsKb(long predictedAllocationsKb) {
        this.predictedAllocationsKb = predictedAllocationsKb;
    }

    public long getTargetAllocationsKb() {
        return targetAllocationsKb;
    }

    public void setTargetAllocationsKb(long targetAllocationsKb) {
        this.targetAllocationsKb = targetAllocationsKb;
    }

    public long getFutureAllocationsKb() {
        return futureAllocationsKb;
    }

    public void setFutureAllocationsKb(long futureAllocationsKb) {
        this.futureAllocationsKb = futureAllocationsKb;
    }

    public long getOverallLimitKb() {
        return overallLimitKb;
    }

    public void setOverallLimitKb(long overallLimitKb) {
        this.overallLimitKb = overallLimitKb;
    }

    public String getLastNotification() {
        return lastNotification;
    }

    public void setLastNotification(String lastNotification) {
        this.lastNotification = lastNotification;
    }
    
}
