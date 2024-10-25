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
@Table(name = "availability_groups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvailabilityGroups.findAll", query = "SELECT a FROM AvailabilityGroups a"),
    @NamedQuery(name = "AvailabilityGroups.findByGroupId", query = "SELECT a FROM AvailabilityGroups a WHERE a.groupId = :groupId"),
    @NamedQuery(name = "AvailabilityGroups.findByName", query = "SELECT a FROM AvailabilityGroups a WHERE a.name = :name"),
    @NamedQuery(name = "AvailabilityGroups.findByResourceId", query = "SELECT a FROM AvailabilityGroups a WHERE a.resourceId = :resourceId"),
    @NamedQuery(name = "AvailabilityGroups.findByResourceGroupId", query = "SELECT a FROM AvailabilityGroups a WHERE a.resourceGroupId = :resourceGroupId"),
    @NamedQuery(name = "AvailabilityGroups.findByFailureConditionLevel", query = "SELECT a FROM AvailabilityGroups a WHERE a.failureConditionLevel = :failureConditionLevel"),
    @NamedQuery(name = "AvailabilityGroups.findByHealthCheckTimeout", query = "SELECT a FROM AvailabilityGroups a WHERE a.healthCheckTimeout = :healthCheckTimeout"),
    @NamedQuery(name = "AvailabilityGroups.findByAutomatedBackupPreference", query = "SELECT a FROM AvailabilityGroups a WHERE a.automatedBackupPreference = :automatedBackupPreference"),
    @NamedQuery(name = "AvailabilityGroups.findByAutomatedBackupPreferenceDesc", query = "SELECT a FROM AvailabilityGroups a WHERE a.automatedBackupPreferenceDesc = :automatedBackupPreferenceDesc"),
    @NamedQuery(name = "AvailabilityGroups.findByVersion", query = "SELECT a FROM AvailabilityGroups a WHERE a.version = :version"),
    @NamedQuery(name = "AvailabilityGroups.findByBasicFeatures", query = "SELECT a FROM AvailabilityGroups a WHERE a.basicFeatures = :basicFeatures"),
    @NamedQuery(name = "AvailabilityGroups.findByDtcSupport", query = "SELECT a FROM AvailabilityGroups a WHERE a.dtcSupport = :dtcSupport"),
    @NamedQuery(name = "AvailabilityGroups.findByDbFailover", query = "SELECT a FROM AvailabilityGroups a WHERE a.dbFailover = :dbFailover"),
    @NamedQuery(name = "AvailabilityGroups.findByIsDistributed", query = "SELECT a FROM AvailabilityGroups a WHERE a.isDistributed = :isDistributed"),
    @NamedQuery(name = "AvailabilityGroups.findByClusterType", query = "SELECT a FROM AvailabilityGroups a WHERE a.clusterType = :clusterType"),
    @NamedQuery(name = "AvailabilityGroups.findByClusterTypeDesc", query = "SELECT a FROM AvailabilityGroups a WHERE a.clusterTypeDesc = :clusterTypeDesc"),
    @NamedQuery(name = "AvailabilityGroups.findByRequiredSynchronizedSecondariesToCommit", query = "SELECT a FROM AvailabilityGroups a WHERE a.requiredSynchronizedSecondariesToCommit = :requiredSynchronizedSecondariesToCommit"),
    @NamedQuery(name = "AvailabilityGroups.findBySequenceNumber", query = "SELECT a FROM AvailabilityGroups a WHERE a.sequenceNumber = :sequenceNumber"),
    @NamedQuery(name = "AvailabilityGroups.findByIsContained", query = "SELECT a FROM AvailabilityGroups a WHERE a.isContained = :isContained")})
public class AvailabilityGroups implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "group_id")
    private String groupId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 40)
    @Column(name = "resource_id")
    private String resourceId;
    @Size(max = 40)
    @Column(name = "resource_group_id")
    private String resourceGroupId;
    @Column(name = "failure_condition_level")
    private Integer failureConditionLevel;
    @Column(name = "health_check_timeout")
    private Integer healthCheckTimeout;
    @Column(name = "automated_backup_preference")
    private Short automatedBackupPreference;
    @Size(max = 60)
    @Column(name = "automated_backup_preference_desc")
    private String automatedBackupPreferenceDesc;
    @Column(name = "version")
    private Short version;
    @Column(name = "basic_features")
    private Boolean basicFeatures;
    @Column(name = "dtc_support")
    private Boolean dtcSupport;
    @Column(name = "db_failover")
    private Boolean dbFailover;
    @Column(name = "is_distributed")
    private Boolean isDistributed;
    @Column(name = "cluster_type")
    private Short clusterType;
    @Size(max = 60)
    @Column(name = "cluster_type_desc")
    private String clusterTypeDesc;
    @Column(name = "required_synchronized_secondaries_to_commit")
    private Integer requiredSynchronizedSecondariesToCommit;
    @Column(name = "sequence_number")
    private BigInteger sequenceNumber;
    @Column(name = "is_contained")
    private Boolean isContained;

    public AvailabilityGroups() {
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public Integer getFailureConditionLevel() {
        return failureConditionLevel;
    }

    public void setFailureConditionLevel(Integer failureConditionLevel) {
        this.failureConditionLevel = failureConditionLevel;
    }

    public Integer getHealthCheckTimeout() {
        return healthCheckTimeout;
    }

    public void setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
    }

    public Short getAutomatedBackupPreference() {
        return automatedBackupPreference;
    }

    public void setAutomatedBackupPreference(Short automatedBackupPreference) {
        this.automatedBackupPreference = automatedBackupPreference;
    }

    public String getAutomatedBackupPreferenceDesc() {
        return automatedBackupPreferenceDesc;
    }

    public void setAutomatedBackupPreferenceDesc(String automatedBackupPreferenceDesc) {
        this.automatedBackupPreferenceDesc = automatedBackupPreferenceDesc;
    }

    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }

    public Boolean getBasicFeatures() {
        return basicFeatures;
    }

    public void setBasicFeatures(Boolean basicFeatures) {
        this.basicFeatures = basicFeatures;
    }

    public Boolean getDtcSupport() {
        return dtcSupport;
    }

    public void setDtcSupport(Boolean dtcSupport) {
        this.dtcSupport = dtcSupport;
    }

    public Boolean getDbFailover() {
        return dbFailover;
    }

    public void setDbFailover(Boolean dbFailover) {
        this.dbFailover = dbFailover;
    }

    public Boolean getIsDistributed() {
        return isDistributed;
    }

    public void setIsDistributed(Boolean isDistributed) {
        this.isDistributed = isDistributed;
    }

    public Short getClusterType() {
        return clusterType;
    }

    public void setClusterType(Short clusterType) {
        this.clusterType = clusterType;
    }

    public String getClusterTypeDesc() {
        return clusterTypeDesc;
    }

    public void setClusterTypeDesc(String clusterTypeDesc) {
        this.clusterTypeDesc = clusterTypeDesc;
    }

    public Integer getRequiredSynchronizedSecondariesToCommit() {
        return requiredSynchronizedSecondariesToCommit;
    }

    public void setRequiredSynchronizedSecondariesToCommit(Integer requiredSynchronizedSecondariesToCommit) {
        this.requiredSynchronizedSecondariesToCommit = requiredSynchronizedSecondariesToCommit;
    }

    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(BigInteger sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Boolean getIsContained() {
        return isContained;
    }

    public void setIsContained(Boolean isContained) {
        this.isContained = isContained;
    }
    
}
