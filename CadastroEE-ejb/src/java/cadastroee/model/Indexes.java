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
@Table(name = "indexes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Indexes.findAll", query = "SELECT i FROM Indexes i"),
    @NamedQuery(name = "Indexes.findByObjectId", query = "SELECT i FROM Indexes i WHERE i.objectId = :objectId"),
    @NamedQuery(name = "Indexes.findByName", query = "SELECT i FROM Indexes i WHERE i.name = :name"),
    @NamedQuery(name = "Indexes.findByIndexId", query = "SELECT i FROM Indexes i WHERE i.indexId = :indexId"),
    @NamedQuery(name = "Indexes.findByType", query = "SELECT i FROM Indexes i WHERE i.type = :type"),
    @NamedQuery(name = "Indexes.findByTypeDesc", query = "SELECT i FROM Indexes i WHERE i.typeDesc = :typeDesc"),
    @NamedQuery(name = "Indexes.findByIsUnique", query = "SELECT i FROM Indexes i WHERE i.isUnique = :isUnique"),
    @NamedQuery(name = "Indexes.findByDataSpaceId", query = "SELECT i FROM Indexes i WHERE i.dataSpaceId = :dataSpaceId"),
    @NamedQuery(name = "Indexes.findByIgnoreDupKey", query = "SELECT i FROM Indexes i WHERE i.ignoreDupKey = :ignoreDupKey"),
    @NamedQuery(name = "Indexes.findByIsPrimaryKey", query = "SELECT i FROM Indexes i WHERE i.isPrimaryKey = :isPrimaryKey"),
    @NamedQuery(name = "Indexes.findByIsUniqueConstraint", query = "SELECT i FROM Indexes i WHERE i.isUniqueConstraint = :isUniqueConstraint"),
    @NamedQuery(name = "Indexes.findByFillFactor", query = "SELECT i FROM Indexes i WHERE i.fillFactor = :fillFactor"),
    @NamedQuery(name = "Indexes.findByIsPadded", query = "SELECT i FROM Indexes i WHERE i.isPadded = :isPadded"),
    @NamedQuery(name = "Indexes.findByIsDisabled", query = "SELECT i FROM Indexes i WHERE i.isDisabled = :isDisabled"),
    @NamedQuery(name = "Indexes.findByIsHypothetical", query = "SELECT i FROM Indexes i WHERE i.isHypothetical = :isHypothetical"),
    @NamedQuery(name = "Indexes.findByIsIgnoredInOptimization", query = "SELECT i FROM Indexes i WHERE i.isIgnoredInOptimization = :isIgnoredInOptimization"),
    @NamedQuery(name = "Indexes.findByAllowRowLocks", query = "SELECT i FROM Indexes i WHERE i.allowRowLocks = :allowRowLocks"),
    @NamedQuery(name = "Indexes.findByAllowPageLocks", query = "SELECT i FROM Indexes i WHERE i.allowPageLocks = :allowPageLocks"),
    @NamedQuery(name = "Indexes.findByHasFilter", query = "SELECT i FROM Indexes i WHERE i.hasFilter = :hasFilter"),
    @NamedQuery(name = "Indexes.findByFilterDefinition", query = "SELECT i FROM Indexes i WHERE i.filterDefinition = :filterDefinition"),
    @NamedQuery(name = "Indexes.findByCompressionDelay", query = "SELECT i FROM Indexes i WHERE i.compressionDelay = :compressionDelay"),
    @NamedQuery(name = "Indexes.findBySuppressDupKeyMessages", query = "SELECT i FROM Indexes i WHERE i.suppressDupKeyMessages = :suppressDupKeyMessages"),
    @NamedQuery(name = "Indexes.findByAutoCreated", query = "SELECT i FROM Indexes i WHERE i.autoCreated = :autoCreated"),
    @NamedQuery(name = "Indexes.findByOptimizeForSequentialKey", query = "SELECT i FROM Indexes i WHERE i.optimizeForSequentialKey = :optimizeForSequentialKey")})
public class Indexes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_id")
    private int indexId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "is_unique")
    private Boolean isUnique;
    @Column(name = "data_space_id")
    private Integer dataSpaceId;
    @Column(name = "ignore_dup_key")
    private Boolean ignoreDupKey;
    @Column(name = "is_primary_key")
    private Boolean isPrimaryKey;
    @Column(name = "is_unique_constraint")
    private Boolean isUniqueConstraint;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fill_factor")
    private short fillFactor;
    @Column(name = "is_padded")
    private Boolean isPadded;
    @Column(name = "is_disabled")
    private Boolean isDisabled;
    @Column(name = "is_hypothetical")
    private Boolean isHypothetical;
    @Column(name = "is_ignored_in_optimization")
    private Boolean isIgnoredInOptimization;
    @Column(name = "allow_row_locks")
    private Boolean allowRowLocks;
    @Column(name = "allow_page_locks")
    private Boolean allowPageLocks;
    @Column(name = "has_filter")
    private Boolean hasFilter;
    @Size(max = 2147483647)
    @Column(name = "filter_definition")
    private String filterDefinition;
    @Column(name = "compression_delay")
    private Integer compressionDelay;
    @Column(name = "suppress_dup_key_messages")
    private Boolean suppressDupKeyMessages;
    @Column(name = "auto_created")
    private Boolean autoCreated;
    @Column(name = "optimize_for_sequential_key")
    private Boolean optimizeForSequentialKey;

    public Indexes() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Boolean getIsUnique() {
        return isUnique;
    }

    public void setIsUnique(Boolean isUnique) {
        this.isUnique = isUnique;
    }

    public Integer getDataSpaceId() {
        return dataSpaceId;
    }

    public void setDataSpaceId(Integer dataSpaceId) {
        this.dataSpaceId = dataSpaceId;
    }

    public Boolean getIgnoreDupKey() {
        return ignoreDupKey;
    }

    public void setIgnoreDupKey(Boolean ignoreDupKey) {
        this.ignoreDupKey = ignoreDupKey;
    }

    public Boolean getIsPrimaryKey() {
        return isPrimaryKey;
    }

    public void setIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
    }

    public Boolean getIsUniqueConstraint() {
        return isUniqueConstraint;
    }

    public void setIsUniqueConstraint(Boolean isUniqueConstraint) {
        this.isUniqueConstraint = isUniqueConstraint;
    }

    public short getFillFactor() {
        return fillFactor;
    }

    public void setFillFactor(short fillFactor) {
        this.fillFactor = fillFactor;
    }

    public Boolean getIsPadded() {
        return isPadded;
    }

    public void setIsPadded(Boolean isPadded) {
        this.isPadded = isPadded;
    }

    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Boolean getIsHypothetical() {
        return isHypothetical;
    }

    public void setIsHypothetical(Boolean isHypothetical) {
        this.isHypothetical = isHypothetical;
    }

    public Boolean getIsIgnoredInOptimization() {
        return isIgnoredInOptimization;
    }

    public void setIsIgnoredInOptimization(Boolean isIgnoredInOptimization) {
        this.isIgnoredInOptimization = isIgnoredInOptimization;
    }

    public Boolean getAllowRowLocks() {
        return allowRowLocks;
    }

    public void setAllowRowLocks(Boolean allowRowLocks) {
        this.allowRowLocks = allowRowLocks;
    }

    public Boolean getAllowPageLocks() {
        return allowPageLocks;
    }

    public void setAllowPageLocks(Boolean allowPageLocks) {
        this.allowPageLocks = allowPageLocks;
    }

    public Boolean getHasFilter() {
        return hasFilter;
    }

    public void setHasFilter(Boolean hasFilter) {
        this.hasFilter = hasFilter;
    }

    public String getFilterDefinition() {
        return filterDefinition;
    }

    public void setFilterDefinition(String filterDefinition) {
        this.filterDefinition = filterDefinition;
    }

    public Integer getCompressionDelay() {
        return compressionDelay;
    }

    public void setCompressionDelay(Integer compressionDelay) {
        this.compressionDelay = compressionDelay;
    }

    public Boolean getSuppressDupKeyMessages() {
        return suppressDupKeyMessages;
    }

    public void setSuppressDupKeyMessages(Boolean suppressDupKeyMessages) {
        this.suppressDupKeyMessages = suppressDupKeyMessages;
    }

    public Boolean getAutoCreated() {
        return autoCreated;
    }

    public void setAutoCreated(Boolean autoCreated) {
        this.autoCreated = autoCreated;
    }

    public Boolean getOptimizeForSequentialKey() {
        return optimizeForSequentialKey;
    }

    public void setOptimizeForSequentialKey(Boolean optimizeForSequentialKey) {
        this.optimizeForSequentialKey = optimizeForSequentialKey;
    }
    
}
