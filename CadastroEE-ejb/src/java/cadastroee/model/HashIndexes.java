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
@Table(name = "hash_indexes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HashIndexes.findAll", query = "SELECT h FROM HashIndexes h"),
    @NamedQuery(name = "HashIndexes.findByObjectId", query = "SELECT h FROM HashIndexes h WHERE h.objectId = :objectId"),
    @NamedQuery(name = "HashIndexes.findByName", query = "SELECT h FROM HashIndexes h WHERE h.name = :name"),
    @NamedQuery(name = "HashIndexes.findByIndexId", query = "SELECT h FROM HashIndexes h WHERE h.indexId = :indexId"),
    @NamedQuery(name = "HashIndexes.findByType", query = "SELECT h FROM HashIndexes h WHERE h.type = :type"),
    @NamedQuery(name = "HashIndexes.findByTypeDesc", query = "SELECT h FROM HashIndexes h WHERE h.typeDesc = :typeDesc"),
    @NamedQuery(name = "HashIndexes.findByIsUnique", query = "SELECT h FROM HashIndexes h WHERE h.isUnique = :isUnique"),
    @NamedQuery(name = "HashIndexes.findByDataSpaceId", query = "SELECT h FROM HashIndexes h WHERE h.dataSpaceId = :dataSpaceId"),
    @NamedQuery(name = "HashIndexes.findByIgnoreDupKey", query = "SELECT h FROM HashIndexes h WHERE h.ignoreDupKey = :ignoreDupKey"),
    @NamedQuery(name = "HashIndexes.findByIsPrimaryKey", query = "SELECT h FROM HashIndexes h WHERE h.isPrimaryKey = :isPrimaryKey"),
    @NamedQuery(name = "HashIndexes.findByIsUniqueConstraint", query = "SELECT h FROM HashIndexes h WHERE h.isUniqueConstraint = :isUniqueConstraint"),
    @NamedQuery(name = "HashIndexes.findByFillFactor", query = "SELECT h FROM HashIndexes h WHERE h.fillFactor = :fillFactor"),
    @NamedQuery(name = "HashIndexes.findByIsPadded", query = "SELECT h FROM HashIndexes h WHERE h.isPadded = :isPadded"),
    @NamedQuery(name = "HashIndexes.findByIsDisabled", query = "SELECT h FROM HashIndexes h WHERE h.isDisabled = :isDisabled"),
    @NamedQuery(name = "HashIndexes.findByIsHypothetical", query = "SELECT h FROM HashIndexes h WHERE h.isHypothetical = :isHypothetical"),
    @NamedQuery(name = "HashIndexes.findByIsIgnoredInOptimization", query = "SELECT h FROM HashIndexes h WHERE h.isIgnoredInOptimization = :isIgnoredInOptimization"),
    @NamedQuery(name = "HashIndexes.findByAllowRowLocks", query = "SELECT h FROM HashIndexes h WHERE h.allowRowLocks = :allowRowLocks"),
    @NamedQuery(name = "HashIndexes.findByAllowPageLocks", query = "SELECT h FROM HashIndexes h WHERE h.allowPageLocks = :allowPageLocks"),
    @NamedQuery(name = "HashIndexes.findByHasFilter", query = "SELECT h FROM HashIndexes h WHERE h.hasFilter = :hasFilter"),
    @NamedQuery(name = "HashIndexes.findByFilterDefinition", query = "SELECT h FROM HashIndexes h WHERE h.filterDefinition = :filterDefinition"),
    @NamedQuery(name = "HashIndexes.findByBucketCount", query = "SELECT h FROM HashIndexes h WHERE h.bucketCount = :bucketCount"),
    @NamedQuery(name = "HashIndexes.findByAutoCreated", query = "SELECT h FROM HashIndexes h WHERE h.autoCreated = :autoCreated")})
public class HashIndexes implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_space_id")
    private int dataSpaceId;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "bucket_count")
    private int bucketCount;
    @Column(name = "auto_created")
    private Boolean autoCreated;

    public HashIndexes() {
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

    public int getDataSpaceId() {
        return dataSpaceId;
    }

    public void setDataSpaceId(int dataSpaceId) {
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

    public int getBucketCount() {
        return bucketCount;
    }

    public void setBucketCount(int bucketCount) {
        this.bucketCount = bucketCount;
    }

    public Boolean getAutoCreated() {
        return autoCreated;
    }

    public void setAutoCreated(Boolean autoCreated) {
        this.autoCreated = autoCreated;
    }
    
}
