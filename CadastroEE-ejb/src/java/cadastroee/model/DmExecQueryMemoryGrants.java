/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_exec_query_memory_grants")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecQueryMemoryGrants.findAll", query = "SELECT d FROM DmExecQueryMemoryGrants d"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findBySessionId", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByRequestId", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.requestId = :requestId"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findBySchedulerId", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.schedulerId = :schedulerId"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByDop", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.dop = :dop"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByRequestTime", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.requestTime = :requestTime"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByGrantTime", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.grantTime = :grantTime"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByRequestedMemoryKb", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.requestedMemoryKb = :requestedMemoryKb"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByGrantedMemoryKb", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.grantedMemoryKb = :grantedMemoryKb"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByRequiredMemoryKb", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.requiredMemoryKb = :requiredMemoryKb"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByUsedMemoryKb", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.usedMemoryKb = :usedMemoryKb"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByMaxUsedMemoryKb", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.maxUsedMemoryKb = :maxUsedMemoryKb"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByQueryCost", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.queryCost = :queryCost"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByTimeoutSec", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.timeoutSec = :timeoutSec"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByResourceSemaphoreId", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.resourceSemaphoreId = :resourceSemaphoreId"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByQueueId", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.queueId = :queueId"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByWaitOrder", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.waitOrder = :waitOrder"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByIsNextCandidate", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.isNextCandidate = :isNextCandidate"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByWaitTimeMs", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.waitTimeMs = :waitTimeMs"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByGroupId", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.groupId = :groupId"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByPoolId", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.poolId = :poolId"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByIsSmall", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.isSmall = :isSmall"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByIdealMemoryKb", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.idealMemoryKb = :idealMemoryKb"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByReservedWorkerCount", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.reservedWorkerCount = :reservedWorkerCount"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByUsedWorkerCount", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.usedWorkerCount = :usedWorkerCount"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByMaxUsedWorkerCount", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.maxUsedWorkerCount = :maxUsedWorkerCount"),
    @NamedQuery(name = "DmExecQueryMemoryGrants.findByReservedNodeBitmap", query = "SELECT d FROM DmExecQueryMemoryGrants d WHERE d.reservedNodeBitmap = :reservedNodeBitmap")})
public class DmExecQueryMemoryGrants implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "session_id")
    private Short sessionId;
    @Column(name = "request_id")
    private Integer requestId;
    @Column(name = "scheduler_id")
    private Integer schedulerId;
    @Column(name = "dop")
    private Short dop;
    @Column(name = "request_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestTime;
    @Column(name = "grant_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date grantTime;
    @Column(name = "requested_memory_kb")
    private BigInteger requestedMemoryKb;
    @Column(name = "granted_memory_kb")
    private BigInteger grantedMemoryKb;
    @Column(name = "required_memory_kb")
    private BigInteger requiredMemoryKb;
    @Column(name = "used_memory_kb")
    private BigInteger usedMemoryKb;
    @Column(name = "max_used_memory_kb")
    private BigInteger maxUsedMemoryKb;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "query_cost")
    private Double queryCost;
    @Column(name = "timeout_sec")
    private Integer timeoutSec;
    @Column(name = "resource_semaphore_id")
    private Short resourceSemaphoreId;
    @Column(name = "queue_id")
    private Short queueId;
    @Column(name = "wait_order")
    private Integer waitOrder;
    @Column(name = "is_next_candidate")
    private Boolean isNextCandidate;
    @Column(name = "wait_time_ms")
    private BigInteger waitTimeMs;
    @Lob
    @Column(name = "plan_handle")
    private byte[] planHandle;
    @Lob
    @Column(name = "sql_handle")
    private byte[] sqlHandle;
    @Column(name = "group_id")
    private Integer groupId;
    @Column(name = "pool_id")
    private Integer poolId;
    @Column(name = "is_small")
    private Boolean isSmall;
    @Column(name = "ideal_memory_kb")
    private BigInteger idealMemoryKb;
    @Column(name = "reserved_worker_count")
    private Integer reservedWorkerCount;
    @Column(name = "used_worker_count")
    private Integer usedWorkerCount;
    @Column(name = "max_used_worker_count")
    private Integer maxUsedWorkerCount;
    @Column(name = "reserved_node_bitmap")
    private BigInteger reservedNodeBitmap;

    public DmExecQueryMemoryGrants() {
    }

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Integer getSchedulerId() {
        return schedulerId;
    }

    public void setSchedulerId(Integer schedulerId) {
        this.schedulerId = schedulerId;
    }

    public Short getDop() {
        return dop;
    }

    public void setDop(Short dop) {
        this.dop = dop;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public Date getGrantTime() {
        return grantTime;
    }

    public void setGrantTime(Date grantTime) {
        this.grantTime = grantTime;
    }

    public BigInteger getRequestedMemoryKb() {
        return requestedMemoryKb;
    }

    public void setRequestedMemoryKb(BigInteger requestedMemoryKb) {
        this.requestedMemoryKb = requestedMemoryKb;
    }

    public BigInteger getGrantedMemoryKb() {
        return grantedMemoryKb;
    }

    public void setGrantedMemoryKb(BigInteger grantedMemoryKb) {
        this.grantedMemoryKb = grantedMemoryKb;
    }

    public BigInteger getRequiredMemoryKb() {
        return requiredMemoryKb;
    }

    public void setRequiredMemoryKb(BigInteger requiredMemoryKb) {
        this.requiredMemoryKb = requiredMemoryKb;
    }

    public BigInteger getUsedMemoryKb() {
        return usedMemoryKb;
    }

    public void setUsedMemoryKb(BigInteger usedMemoryKb) {
        this.usedMemoryKb = usedMemoryKb;
    }

    public BigInteger getMaxUsedMemoryKb() {
        return maxUsedMemoryKb;
    }

    public void setMaxUsedMemoryKb(BigInteger maxUsedMemoryKb) {
        this.maxUsedMemoryKb = maxUsedMemoryKb;
    }

    public Double getQueryCost() {
        return queryCost;
    }

    public void setQueryCost(Double queryCost) {
        this.queryCost = queryCost;
    }

    public Integer getTimeoutSec() {
        return timeoutSec;
    }

    public void setTimeoutSec(Integer timeoutSec) {
        this.timeoutSec = timeoutSec;
    }

    public Short getResourceSemaphoreId() {
        return resourceSemaphoreId;
    }

    public void setResourceSemaphoreId(Short resourceSemaphoreId) {
        this.resourceSemaphoreId = resourceSemaphoreId;
    }

    public Short getQueueId() {
        return queueId;
    }

    public void setQueueId(Short queueId) {
        this.queueId = queueId;
    }

    public Integer getWaitOrder() {
        return waitOrder;
    }

    public void setWaitOrder(Integer waitOrder) {
        this.waitOrder = waitOrder;
    }

    public Boolean getIsNextCandidate() {
        return isNextCandidate;
    }

    public void setIsNextCandidate(Boolean isNextCandidate) {
        this.isNextCandidate = isNextCandidate;
    }

    public BigInteger getWaitTimeMs() {
        return waitTimeMs;
    }

    public void setWaitTimeMs(BigInteger waitTimeMs) {
        this.waitTimeMs = waitTimeMs;
    }

    public byte[] getPlanHandle() {
        return planHandle;
    }

    public void setPlanHandle(byte[] planHandle) {
        this.planHandle = planHandle;
    }

    public byte[] getSqlHandle() {
        return sqlHandle;
    }

    public void setSqlHandle(byte[] sqlHandle) {
        this.sqlHandle = sqlHandle;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public Boolean getIsSmall() {
        return isSmall;
    }

    public void setIsSmall(Boolean isSmall) {
        this.isSmall = isSmall;
    }

    public BigInteger getIdealMemoryKb() {
        return idealMemoryKb;
    }

    public void setIdealMemoryKb(BigInteger idealMemoryKb) {
        this.idealMemoryKb = idealMemoryKb;
    }

    public Integer getReservedWorkerCount() {
        return reservedWorkerCount;
    }

    public void setReservedWorkerCount(Integer reservedWorkerCount) {
        this.reservedWorkerCount = reservedWorkerCount;
    }

    public Integer getUsedWorkerCount() {
        return usedWorkerCount;
    }

    public void setUsedWorkerCount(Integer usedWorkerCount) {
        this.usedWorkerCount = usedWorkerCount;
    }

    public Integer getMaxUsedWorkerCount() {
        return maxUsedWorkerCount;
    }

    public void setMaxUsedWorkerCount(Integer maxUsedWorkerCount) {
        this.maxUsedWorkerCount = maxUsedWorkerCount;
    }

    public BigInteger getReservedNodeBitmap() {
        return reservedNodeBitmap;
    }

    public void setReservedNodeBitmap(BigInteger reservedNodeBitmap) {
        this.reservedNodeBitmap = reservedNodeBitmap;
    }
    
}
