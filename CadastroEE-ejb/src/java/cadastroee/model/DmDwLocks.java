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
@Table(name = "dm_dw_locks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDwLocks.findAll", query = "SELECT d FROM DmDwLocks d"),
    @NamedQuery(name = "DmDwLocks.findByResourceEntityId", query = "SELECT d FROM DmDwLocks d WHERE d.resourceEntityId = :resourceEntityId"),
    @NamedQuery(name = "DmDwLocks.findByResourceType", query = "SELECT d FROM DmDwLocks d WHERE d.resourceType = :resourceType"),
    @NamedQuery(name = "DmDwLocks.findByRequestMode", query = "SELECT d FROM DmDwLocks d WHERE d.requestMode = :requestMode"),
    @NamedQuery(name = "DmDwLocks.findByRequestStatus", query = "SELECT d FROM DmDwLocks d WHERE d.requestStatus = :requestStatus"),
    @NamedQuery(name = "DmDwLocks.findByResourceDatabaseId", query = "SELECT d FROM DmDwLocks d WHERE d.resourceDatabaseId = :resourceDatabaseId"),
    @NamedQuery(name = "DmDwLocks.findByRequestTime", query = "SELECT d FROM DmDwLocks d WHERE d.requestTime = :requestTime"),
    @NamedQuery(name = "DmDwLocks.findByAcquireTime", query = "SELECT d FROM DmDwLocks d WHERE d.acquireTime = :acquireTime"),
    @NamedQuery(name = "DmDwLocks.findByRequestId", query = "SELECT d FROM DmDwLocks d WHERE d.requestId = :requestId"),
    @NamedQuery(name = "DmDwLocks.findBySessionId", query = "SELECT d FROM DmDwLocks d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmDwLocks.findByPoolId", query = "SELECT d FROM DmDwLocks d WHERE d.poolId = :poolId"),
    @NamedQuery(name = "DmDwLocks.findByTransactionId", query = "SELECT d FROM DmDwLocks d WHERE d.transactionId = :transactionId"),
    @NamedQuery(name = "DmDwLocks.findByIsUserTransaction", query = "SELECT d FROM DmDwLocks d WHERE d.isUserTransaction = :isUserTransaction")})
public class DmDwLocks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resource_entity_id")
    private long resourceEntityId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "resource_type")
    private String resourceType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "request_mode")
    private String requestMode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "request_status")
    private String requestStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resource_database_id")
    private int resourceDatabaseId;
    @Column(name = "request_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestTime;
    @Column(name = "acquire_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date acquireTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "request_id")
    private String requestId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "session_id")
    private int sessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pool_id")
    private int poolId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_id")
    private long transactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_user_transaction")
    private boolean isUserTransaction;

    public DmDwLocks() {
    }

    public long getResourceEntityId() {
        return resourceEntityId;
    }

    public void setResourceEntityId(long resourceEntityId) {
        this.resourceEntityId = resourceEntityId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getRequestMode() {
        return requestMode;
    }

    public void setRequestMode(String requestMode) {
        this.requestMode = requestMode;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public int getResourceDatabaseId() {
        return resourceDatabaseId;
    }

    public void setResourceDatabaseId(int resourceDatabaseId) {
        this.resourceDatabaseId = resourceDatabaseId;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public Date getAcquireTime() {
        return acquireTime;
    }

    public void setAcquireTime(Date acquireTime) {
        this.acquireTime = acquireTime;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public boolean getIsUserTransaction() {
        return isUserTransaction;
    }

    public void setIsUserTransaction(boolean isUserTransaction) {
        this.isUserTransaction = isUserTransaction;
    }
    
}
