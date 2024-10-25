/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "dm_tran_locks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranLocks.findAll", query = "SELECT d FROM DmTranLocks d"),
    @NamedQuery(name = "DmTranLocks.findByResourceType", query = "SELECT d FROM DmTranLocks d WHERE d.resourceType = :resourceType"),
    @NamedQuery(name = "DmTranLocks.findByResourceSubtype", query = "SELECT d FROM DmTranLocks d WHERE d.resourceSubtype = :resourceSubtype"),
    @NamedQuery(name = "DmTranLocks.findByResourceDatabaseId", query = "SELECT d FROM DmTranLocks d WHERE d.resourceDatabaseId = :resourceDatabaseId"),
    @NamedQuery(name = "DmTranLocks.findByResourceDescription", query = "SELECT d FROM DmTranLocks d WHERE d.resourceDescription = :resourceDescription"),
    @NamedQuery(name = "DmTranLocks.findByResourceAssociatedEntityId", query = "SELECT d FROM DmTranLocks d WHERE d.resourceAssociatedEntityId = :resourceAssociatedEntityId"),
    @NamedQuery(name = "DmTranLocks.findByResourceLockPartition", query = "SELECT d FROM DmTranLocks d WHERE d.resourceLockPartition = :resourceLockPartition"),
    @NamedQuery(name = "DmTranLocks.findByRequestMode", query = "SELECT d FROM DmTranLocks d WHERE d.requestMode = :requestMode"),
    @NamedQuery(name = "DmTranLocks.findByRequestType", query = "SELECT d FROM DmTranLocks d WHERE d.requestType = :requestType"),
    @NamedQuery(name = "DmTranLocks.findByRequestStatus", query = "SELECT d FROM DmTranLocks d WHERE d.requestStatus = :requestStatus"),
    @NamedQuery(name = "DmTranLocks.findByRequestReferenceCount", query = "SELECT d FROM DmTranLocks d WHERE d.requestReferenceCount = :requestReferenceCount"),
    @NamedQuery(name = "DmTranLocks.findByRequestLifetime", query = "SELECT d FROM DmTranLocks d WHERE d.requestLifetime = :requestLifetime"),
    @NamedQuery(name = "DmTranLocks.findByRequestSessionId", query = "SELECT d FROM DmTranLocks d WHERE d.requestSessionId = :requestSessionId"),
    @NamedQuery(name = "DmTranLocks.findByRequestExecContextId", query = "SELECT d FROM DmTranLocks d WHERE d.requestExecContextId = :requestExecContextId"),
    @NamedQuery(name = "DmTranLocks.findByRequestRequestId", query = "SELECT d FROM DmTranLocks d WHERE d.requestRequestId = :requestRequestId"),
    @NamedQuery(name = "DmTranLocks.findByRequestOwnerType", query = "SELECT d FROM DmTranLocks d WHERE d.requestOwnerType = :requestOwnerType"),
    @NamedQuery(name = "DmTranLocks.findByRequestOwnerId", query = "SELECT d FROM DmTranLocks d WHERE d.requestOwnerId = :requestOwnerId"),
    @NamedQuery(name = "DmTranLocks.findByRequestOwnerGuid", query = "SELECT d FROM DmTranLocks d WHERE d.requestOwnerGuid = :requestOwnerGuid"),
    @NamedQuery(name = "DmTranLocks.findByRequestOwnerLockspaceId", query = "SELECT d FROM DmTranLocks d WHERE d.requestOwnerLockspaceId = :requestOwnerLockspaceId")})
public class DmTranLocks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "resource_type")
    private String resourceType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "resource_subtype")
    private String resourceSubtype;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resource_database_id")
    private int resourceDatabaseId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "resource_description")
    private String resourceDescription;
    @Column(name = "resource_associated_entity_id")
    private BigInteger resourceAssociatedEntityId;
    @Column(name = "resource_lock_partition")
    private Integer resourceLockPartition;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "request_mode")
    private String requestMode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "request_type")
    private String requestType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "request_status")
    private String requestStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_reference_count")
    private short requestReferenceCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_lifetime")
    private int requestLifetime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_session_id")
    private int requestSessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_exec_context_id")
    private int requestExecContextId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "request_request_id")
    private int requestRequestId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "request_owner_type")
    private String requestOwnerType;
    @Column(name = "request_owner_id")
    private BigInteger requestOwnerId;
    @Size(max = 36)
    @Column(name = "request_owner_guid")
    private String requestOwnerGuid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "request_owner_lockspace_id")
    private String requestOwnerLockspaceId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "lock_owner_address")
    private byte[] lockOwnerAddress;

    public DmTranLocks() {
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceSubtype() {
        return resourceSubtype;
    }

    public void setResourceSubtype(String resourceSubtype) {
        this.resourceSubtype = resourceSubtype;
    }

    public int getResourceDatabaseId() {
        return resourceDatabaseId;
    }

    public void setResourceDatabaseId(int resourceDatabaseId) {
        this.resourceDatabaseId = resourceDatabaseId;
    }

    public String getResourceDescription() {
        return resourceDescription;
    }

    public void setResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
    }

    public BigInteger getResourceAssociatedEntityId() {
        return resourceAssociatedEntityId;
    }

    public void setResourceAssociatedEntityId(BigInteger resourceAssociatedEntityId) {
        this.resourceAssociatedEntityId = resourceAssociatedEntityId;
    }

    public Integer getResourceLockPartition() {
        return resourceLockPartition;
    }

    public void setResourceLockPartition(Integer resourceLockPartition) {
        this.resourceLockPartition = resourceLockPartition;
    }

    public String getRequestMode() {
        return requestMode;
    }

    public void setRequestMode(String requestMode) {
        this.requestMode = requestMode;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public short getRequestReferenceCount() {
        return requestReferenceCount;
    }

    public void setRequestReferenceCount(short requestReferenceCount) {
        this.requestReferenceCount = requestReferenceCount;
    }

    public int getRequestLifetime() {
        return requestLifetime;
    }

    public void setRequestLifetime(int requestLifetime) {
        this.requestLifetime = requestLifetime;
    }

    public int getRequestSessionId() {
        return requestSessionId;
    }

    public void setRequestSessionId(int requestSessionId) {
        this.requestSessionId = requestSessionId;
    }

    public int getRequestExecContextId() {
        return requestExecContextId;
    }

    public void setRequestExecContextId(int requestExecContextId) {
        this.requestExecContextId = requestExecContextId;
    }

    public int getRequestRequestId() {
        return requestRequestId;
    }

    public void setRequestRequestId(int requestRequestId) {
        this.requestRequestId = requestRequestId;
    }

    public String getRequestOwnerType() {
        return requestOwnerType;
    }

    public void setRequestOwnerType(String requestOwnerType) {
        this.requestOwnerType = requestOwnerType;
    }

    public BigInteger getRequestOwnerId() {
        return requestOwnerId;
    }

    public void setRequestOwnerId(BigInteger requestOwnerId) {
        this.requestOwnerId = requestOwnerId;
    }

    public String getRequestOwnerGuid() {
        return requestOwnerGuid;
    }

    public void setRequestOwnerGuid(String requestOwnerGuid) {
        this.requestOwnerGuid = requestOwnerGuid;
    }

    public String getRequestOwnerLockspaceId() {
        return requestOwnerLockspaceId;
    }

    public void setRequestOwnerLockspaceId(String requestOwnerLockspaceId) {
        this.requestOwnerLockspaceId = requestOwnerLockspaceId;
    }

    public byte[] getLockOwnerAddress() {
        return lockOwnerAddress;
    }

    public void setLockOwnerAddress(byte[] lockOwnerAddress) {
        this.lockOwnerAddress = lockOwnerAddress;
    }
    
}
