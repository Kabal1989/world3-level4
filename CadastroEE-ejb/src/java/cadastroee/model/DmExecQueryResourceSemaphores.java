/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_exec_query_resource_semaphores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecQueryResourceSemaphores.findAll", query = "SELECT d FROM DmExecQueryResourceSemaphores d"),
    @NamedQuery(name = "DmExecQueryResourceSemaphores.findByResourceSemaphoreId", query = "SELECT d FROM DmExecQueryResourceSemaphores d WHERE d.resourceSemaphoreId = :resourceSemaphoreId"),
    @NamedQuery(name = "DmExecQueryResourceSemaphores.findByTargetMemoryKb", query = "SELECT d FROM DmExecQueryResourceSemaphores d WHERE d.targetMemoryKb = :targetMemoryKb"),
    @NamedQuery(name = "DmExecQueryResourceSemaphores.findByMaxTargetMemoryKb", query = "SELECT d FROM DmExecQueryResourceSemaphores d WHERE d.maxTargetMemoryKb = :maxTargetMemoryKb"),
    @NamedQuery(name = "DmExecQueryResourceSemaphores.findByTotalMemoryKb", query = "SELECT d FROM DmExecQueryResourceSemaphores d WHERE d.totalMemoryKb = :totalMemoryKb"),
    @NamedQuery(name = "DmExecQueryResourceSemaphores.findByAvailableMemoryKb", query = "SELECT d FROM DmExecQueryResourceSemaphores d WHERE d.availableMemoryKb = :availableMemoryKb"),
    @NamedQuery(name = "DmExecQueryResourceSemaphores.findByGrantedMemoryKb", query = "SELECT d FROM DmExecQueryResourceSemaphores d WHERE d.grantedMemoryKb = :grantedMemoryKb"),
    @NamedQuery(name = "DmExecQueryResourceSemaphores.findByUsedMemoryKb", query = "SELECT d FROM DmExecQueryResourceSemaphores d WHERE d.usedMemoryKb = :usedMemoryKb"),
    @NamedQuery(name = "DmExecQueryResourceSemaphores.findByGranteeCount", query = "SELECT d FROM DmExecQueryResourceSemaphores d WHERE d.granteeCount = :granteeCount"),
    @NamedQuery(name = "DmExecQueryResourceSemaphores.findByWaiterCount", query = "SELECT d FROM DmExecQueryResourceSemaphores d WHERE d.waiterCount = :waiterCount"),
    @NamedQuery(name = "DmExecQueryResourceSemaphores.findByTimeoutErrorCount", query = "SELECT d FROM DmExecQueryResourceSemaphores d WHERE d.timeoutErrorCount = :timeoutErrorCount"),
    @NamedQuery(name = "DmExecQueryResourceSemaphores.findByForcedGrantCount", query = "SELECT d FROM DmExecQueryResourceSemaphores d WHERE d.forcedGrantCount = :forcedGrantCount"),
    @NamedQuery(name = "DmExecQueryResourceSemaphores.findByPoolId", query = "SELECT d FROM DmExecQueryResourceSemaphores d WHERE d.poolId = :poolId")})
public class DmExecQueryResourceSemaphores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "resource_semaphore_id")
    private Short resourceSemaphoreId;
    @Column(name = "target_memory_kb")
    private BigInteger targetMemoryKb;
    @Column(name = "max_target_memory_kb")
    private BigInteger maxTargetMemoryKb;
    @Column(name = "total_memory_kb")
    private BigInteger totalMemoryKb;
    @Column(name = "available_memory_kb")
    private BigInteger availableMemoryKb;
    @Column(name = "granted_memory_kb")
    private BigInteger grantedMemoryKb;
    @Column(name = "used_memory_kb")
    private BigInteger usedMemoryKb;
    @Column(name = "grantee_count")
    private Integer granteeCount;
    @Column(name = "waiter_count")
    private Integer waiterCount;
    @Column(name = "timeout_error_count")
    private BigInteger timeoutErrorCount;
    @Column(name = "forced_grant_count")
    private BigInteger forcedGrantCount;
    @Column(name = "pool_id")
    private Integer poolId;

    public DmExecQueryResourceSemaphores() {
    }

    public Short getResourceSemaphoreId() {
        return resourceSemaphoreId;
    }

    public void setResourceSemaphoreId(Short resourceSemaphoreId) {
        this.resourceSemaphoreId = resourceSemaphoreId;
    }

    public BigInteger getTargetMemoryKb() {
        return targetMemoryKb;
    }

    public void setTargetMemoryKb(BigInteger targetMemoryKb) {
        this.targetMemoryKb = targetMemoryKb;
    }

    public BigInteger getMaxTargetMemoryKb() {
        return maxTargetMemoryKb;
    }

    public void setMaxTargetMemoryKb(BigInteger maxTargetMemoryKb) {
        this.maxTargetMemoryKb = maxTargetMemoryKb;
    }

    public BigInteger getTotalMemoryKb() {
        return totalMemoryKb;
    }

    public void setTotalMemoryKb(BigInteger totalMemoryKb) {
        this.totalMemoryKb = totalMemoryKb;
    }

    public BigInteger getAvailableMemoryKb() {
        return availableMemoryKb;
    }

    public void setAvailableMemoryKb(BigInteger availableMemoryKb) {
        this.availableMemoryKb = availableMemoryKb;
    }

    public BigInteger getGrantedMemoryKb() {
        return grantedMemoryKb;
    }

    public void setGrantedMemoryKb(BigInteger grantedMemoryKb) {
        this.grantedMemoryKb = grantedMemoryKb;
    }

    public BigInteger getUsedMemoryKb() {
        return usedMemoryKb;
    }

    public void setUsedMemoryKb(BigInteger usedMemoryKb) {
        this.usedMemoryKb = usedMemoryKb;
    }

    public Integer getGranteeCount() {
        return granteeCount;
    }

    public void setGranteeCount(Integer granteeCount) {
        this.granteeCount = granteeCount;
    }

    public Integer getWaiterCount() {
        return waiterCount;
    }

    public void setWaiterCount(Integer waiterCount) {
        this.waiterCount = waiterCount;
    }

    public BigInteger getTimeoutErrorCount() {
        return timeoutErrorCount;
    }

    public void setTimeoutErrorCount(BigInteger timeoutErrorCount) {
        this.timeoutErrorCount = timeoutErrorCount;
    }

    public BigInteger getForcedGrantCount() {
        return forcedGrantCount;
    }

    public void setForcedGrantCount(BigInteger forcedGrantCount) {
        this.forcedGrantCount = forcedGrantCount;
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }
    
}
