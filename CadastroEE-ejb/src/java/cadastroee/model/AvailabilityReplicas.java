/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "availability_replicas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvailabilityReplicas.findAll", query = "SELECT a FROM AvailabilityReplicas a"),
    @NamedQuery(name = "AvailabilityReplicas.findByReplicaId", query = "SELECT a FROM AvailabilityReplicas a WHERE a.replicaId = :replicaId"),
    @NamedQuery(name = "AvailabilityReplicas.findByGroupId", query = "SELECT a FROM AvailabilityReplicas a WHERE a.groupId = :groupId"),
    @NamedQuery(name = "AvailabilityReplicas.findByReplicaMetadataId", query = "SELECT a FROM AvailabilityReplicas a WHERE a.replicaMetadataId = :replicaMetadataId"),
    @NamedQuery(name = "AvailabilityReplicas.findByReplicaServerName", query = "SELECT a FROM AvailabilityReplicas a WHERE a.replicaServerName = :replicaServerName"),
    @NamedQuery(name = "AvailabilityReplicas.findByEndpointUrl", query = "SELECT a FROM AvailabilityReplicas a WHERE a.endpointUrl = :endpointUrl"),
    @NamedQuery(name = "AvailabilityReplicas.findByAvailabilityMode", query = "SELECT a FROM AvailabilityReplicas a WHERE a.availabilityMode = :availabilityMode"),
    @NamedQuery(name = "AvailabilityReplicas.findByAvailabilityModeDesc", query = "SELECT a FROM AvailabilityReplicas a WHERE a.availabilityModeDesc = :availabilityModeDesc"),
    @NamedQuery(name = "AvailabilityReplicas.findByFailoverMode", query = "SELECT a FROM AvailabilityReplicas a WHERE a.failoverMode = :failoverMode"),
    @NamedQuery(name = "AvailabilityReplicas.findByFailoverModeDesc", query = "SELECT a FROM AvailabilityReplicas a WHERE a.failoverModeDesc = :failoverModeDesc"),
    @NamedQuery(name = "AvailabilityReplicas.findBySessionTimeout", query = "SELECT a FROM AvailabilityReplicas a WHERE a.sessionTimeout = :sessionTimeout"),
    @NamedQuery(name = "AvailabilityReplicas.findByPrimaryRoleAllowConnections", query = "SELECT a FROM AvailabilityReplicas a WHERE a.primaryRoleAllowConnections = :primaryRoleAllowConnections"),
    @NamedQuery(name = "AvailabilityReplicas.findByPrimaryRoleAllowConnectionsDesc", query = "SELECT a FROM AvailabilityReplicas a WHERE a.primaryRoleAllowConnectionsDesc = :primaryRoleAllowConnectionsDesc"),
    @NamedQuery(name = "AvailabilityReplicas.findBySecondaryRoleAllowConnections", query = "SELECT a FROM AvailabilityReplicas a WHERE a.secondaryRoleAllowConnections = :secondaryRoleAllowConnections"),
    @NamedQuery(name = "AvailabilityReplicas.findBySecondaryRoleAllowConnectionsDesc", query = "SELECT a FROM AvailabilityReplicas a WHERE a.secondaryRoleAllowConnectionsDesc = :secondaryRoleAllowConnectionsDesc"),
    @NamedQuery(name = "AvailabilityReplicas.findByCreateDate", query = "SELECT a FROM AvailabilityReplicas a WHERE a.createDate = :createDate"),
    @NamedQuery(name = "AvailabilityReplicas.findByModifyDate", query = "SELECT a FROM AvailabilityReplicas a WHERE a.modifyDate = :modifyDate"),
    @NamedQuery(name = "AvailabilityReplicas.findByBackupPriority", query = "SELECT a FROM AvailabilityReplicas a WHERE a.backupPriority = :backupPriority"),
    @NamedQuery(name = "AvailabilityReplicas.findByReadOnlyRoutingUrl", query = "SELECT a FROM AvailabilityReplicas a WHERE a.readOnlyRoutingUrl = :readOnlyRoutingUrl"),
    @NamedQuery(name = "AvailabilityReplicas.findBySeedingMode", query = "SELECT a FROM AvailabilityReplicas a WHERE a.seedingMode = :seedingMode"),
    @NamedQuery(name = "AvailabilityReplicas.findBySeedingModeDesc", query = "SELECT a FROM AvailabilityReplicas a WHERE a.seedingModeDesc = :seedingModeDesc"),
    @NamedQuery(name = "AvailabilityReplicas.findByReadWriteRoutingUrl", query = "SELECT a FROM AvailabilityReplicas a WHERE a.readWriteRoutingUrl = :readWriteRoutingUrl")})
public class AvailabilityReplicas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 36)
    @Column(name = "replica_id")
    private String replicaId;
    @Size(max = 36)
    @Column(name = "group_id")
    private String groupId;
    @Column(name = "replica_metadata_id")
    private Integer replicaMetadataId;
    @Size(max = 256)
    @Column(name = "replica_server_name")
    private String replicaServerName;
    @Lob
    @Column(name = "owner_sid")
    private byte[] ownerSid;
    @Size(max = 256)
    @Column(name = "endpoint_url")
    private String endpointUrl;
    @Column(name = "availability_mode")
    private Short availabilityMode;
    @Size(max = 60)
    @Column(name = "availability_mode_desc")
    private String availabilityModeDesc;
    @Column(name = "failover_mode")
    private Short failoverMode;
    @Size(max = 60)
    @Column(name = "failover_mode_desc")
    private String failoverModeDesc;
    @Column(name = "session_timeout")
    private Integer sessionTimeout;
    @Column(name = "primary_role_allow_connections")
    private Short primaryRoleAllowConnections;
    @Size(max = 60)
    @Column(name = "primary_role_allow_connections_desc")
    private String primaryRoleAllowConnectionsDesc;
    @Column(name = "secondary_role_allow_connections")
    private Short secondaryRoleAllowConnections;
    @Size(max = 60)
    @Column(name = "secondary_role_allow_connections_desc")
    private String secondaryRoleAllowConnectionsDesc;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Column(name = "backup_priority")
    private Integer backupPriority;
    @Size(max = 256)
    @Column(name = "read_only_routing_url")
    private String readOnlyRoutingUrl;
    @Column(name = "seeding_mode")
    private Short seedingMode;
    @Size(max = 60)
    @Column(name = "seeding_mode_desc")
    private String seedingModeDesc;
    @Size(max = 256)
    @Column(name = "read_write_routing_url")
    private String readWriteRoutingUrl;

    public AvailabilityReplicas() {
    }

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getReplicaMetadataId() {
        return replicaMetadataId;
    }

    public void setReplicaMetadataId(Integer replicaMetadataId) {
        this.replicaMetadataId = replicaMetadataId;
    }

    public String getReplicaServerName() {
        return replicaServerName;
    }

    public void setReplicaServerName(String replicaServerName) {
        this.replicaServerName = replicaServerName;
    }

    public byte[] getOwnerSid() {
        return ownerSid;
    }

    public void setOwnerSid(byte[] ownerSid) {
        this.ownerSid = ownerSid;
    }

    public String getEndpointUrl() {
        return endpointUrl;
    }

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    public Short getAvailabilityMode() {
        return availabilityMode;
    }

    public void setAvailabilityMode(Short availabilityMode) {
        this.availabilityMode = availabilityMode;
    }

    public String getAvailabilityModeDesc() {
        return availabilityModeDesc;
    }

    public void setAvailabilityModeDesc(String availabilityModeDesc) {
        this.availabilityModeDesc = availabilityModeDesc;
    }

    public Short getFailoverMode() {
        return failoverMode;
    }

    public void setFailoverMode(Short failoverMode) {
        this.failoverMode = failoverMode;
    }

    public String getFailoverModeDesc() {
        return failoverModeDesc;
    }

    public void setFailoverModeDesc(String failoverModeDesc) {
        this.failoverModeDesc = failoverModeDesc;
    }

    public Integer getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public Short getPrimaryRoleAllowConnections() {
        return primaryRoleAllowConnections;
    }

    public void setPrimaryRoleAllowConnections(Short primaryRoleAllowConnections) {
        this.primaryRoleAllowConnections = primaryRoleAllowConnections;
    }

    public String getPrimaryRoleAllowConnectionsDesc() {
        return primaryRoleAllowConnectionsDesc;
    }

    public void setPrimaryRoleAllowConnectionsDesc(String primaryRoleAllowConnectionsDesc) {
        this.primaryRoleAllowConnectionsDesc = primaryRoleAllowConnectionsDesc;
    }

    public Short getSecondaryRoleAllowConnections() {
        return secondaryRoleAllowConnections;
    }

    public void setSecondaryRoleAllowConnections(Short secondaryRoleAllowConnections) {
        this.secondaryRoleAllowConnections = secondaryRoleAllowConnections;
    }

    public String getSecondaryRoleAllowConnectionsDesc() {
        return secondaryRoleAllowConnectionsDesc;
    }

    public void setSecondaryRoleAllowConnectionsDesc(String secondaryRoleAllowConnectionsDesc) {
        this.secondaryRoleAllowConnectionsDesc = secondaryRoleAllowConnectionsDesc;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getBackupPriority() {
        return backupPriority;
    }

    public void setBackupPriority(Integer backupPriority) {
        this.backupPriority = backupPriority;
    }

    public String getReadOnlyRoutingUrl() {
        return readOnlyRoutingUrl;
    }

    public void setReadOnlyRoutingUrl(String readOnlyRoutingUrl) {
        this.readOnlyRoutingUrl = readOnlyRoutingUrl;
    }

    public Short getSeedingMode() {
        return seedingMode;
    }

    public void setSeedingMode(Short seedingMode) {
        this.seedingMode = seedingMode;
    }

    public String getSeedingModeDesc() {
        return seedingModeDesc;
    }

    public void setSeedingModeDesc(String seedingModeDesc) {
        this.seedingModeDesc = seedingModeDesc;
    }

    public String getReadWriteRoutingUrl() {
        return readWriteRoutingUrl;
    }

    public void setReadWriteRoutingUrl(String readWriteRoutingUrl) {
        this.readWriteRoutingUrl = readWriteRoutingUrl;
    }
    
}
