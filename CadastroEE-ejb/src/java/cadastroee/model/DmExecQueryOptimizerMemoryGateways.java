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
@Table(name = "dm_exec_query_optimizer_memory_gateways")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findAll", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByPoolId", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.poolId = :poolId"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByName", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.name = :name"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByMaxCount", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.maxCount = :maxCount"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByActiveCount", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.activeCount = :activeCount"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByWaiterCount", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.waiterCount = :waiterCount"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByThresholdFactor", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.thresholdFactor = :thresholdFactor"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByThreshold", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.threshold = :threshold"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByIsActive", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.isActive = :isActive")})
public class DmExecQueryOptimizerMemoryGateways implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pool_id")
    private int poolId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_count")
    private int maxCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active_count")
    private int activeCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "waiter_count")
    private int waiterCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "threshold_factor")
    private long thresholdFactor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "threshold")
    private long threshold;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_active")
    private boolean isActive;

    public DmExecQueryOptimizerMemoryGateways() {
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public int getActiveCount() {
        return activeCount;
    }

    public void setActiveCount(int activeCount) {
        this.activeCount = activeCount;
    }

    public int getWaiterCount() {
        return waiterCount;
    }

    public void setWaiterCount(int waiterCount) {
        this.waiterCount = waiterCount;
    }

    public long getThresholdFactor() {
        return thresholdFactor;
    }

    public void setThresholdFactor(long thresholdFactor) {
        this.thresholdFactor = thresholdFactor;
    }

    public long getThreshold() {
        return threshold;
    }

    public void setThreshold(long threshold) {
        this.threshold = threshold;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
}
