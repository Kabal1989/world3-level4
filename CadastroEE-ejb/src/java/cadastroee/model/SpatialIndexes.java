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
@Table(name = "spatial_indexes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SpatialIndexes.findAll", query = "SELECT s FROM SpatialIndexes s"),
    @NamedQuery(name = "SpatialIndexes.findByObjectId", query = "SELECT s FROM SpatialIndexes s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "SpatialIndexes.findByName", query = "SELECT s FROM SpatialIndexes s WHERE s.name = :name"),
    @NamedQuery(name = "SpatialIndexes.findByIndexId", query = "SELECT s FROM SpatialIndexes s WHERE s.indexId = :indexId"),
    @NamedQuery(name = "SpatialIndexes.findByType", query = "SELECT s FROM SpatialIndexes s WHERE s.type = :type"),
    @NamedQuery(name = "SpatialIndexes.findByTypeDesc", query = "SELECT s FROM SpatialIndexes s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "SpatialIndexes.findByIsUnique", query = "SELECT s FROM SpatialIndexes s WHERE s.isUnique = :isUnique"),
    @NamedQuery(name = "SpatialIndexes.findByDataSpaceId", query = "SELECT s FROM SpatialIndexes s WHERE s.dataSpaceId = :dataSpaceId"),
    @NamedQuery(name = "SpatialIndexes.findByIgnoreDupKey", query = "SELECT s FROM SpatialIndexes s WHERE s.ignoreDupKey = :ignoreDupKey"),
    @NamedQuery(name = "SpatialIndexes.findByIsPrimaryKey", query = "SELECT s FROM SpatialIndexes s WHERE s.isPrimaryKey = :isPrimaryKey"),
    @NamedQuery(name = "SpatialIndexes.findByIsUniqueConstraint", query = "SELECT s FROM SpatialIndexes s WHERE s.isUniqueConstraint = :isUniqueConstraint"),
    @NamedQuery(name = "SpatialIndexes.findByFillFactor", query = "SELECT s FROM SpatialIndexes s WHERE s.fillFactor = :fillFactor"),
    @NamedQuery(name = "SpatialIndexes.findByIsPadded", query = "SELECT s FROM SpatialIndexes s WHERE s.isPadded = :isPadded"),
    @NamedQuery(name = "SpatialIndexes.findByIsDisabled", query = "SELECT s FROM SpatialIndexes s WHERE s.isDisabled = :isDisabled"),
    @NamedQuery(name = "SpatialIndexes.findByIsHypothetical", query = "SELECT s FROM SpatialIndexes s WHERE s.isHypothetical = :isHypothetical"),
    @NamedQuery(name = "SpatialIndexes.findByIsIgnoredInOptimization", query = "SELECT s FROM SpatialIndexes s WHERE s.isIgnoredInOptimization = :isIgnoredInOptimization"),
    @NamedQuery(name = "SpatialIndexes.findByAllowRowLocks", query = "SELECT s FROM SpatialIndexes s WHERE s.allowRowLocks = :allowRowLocks"),
    @NamedQuery(name = "SpatialIndexes.findByAllowPageLocks", query = "SELECT s FROM SpatialIndexes s WHERE s.allowPageLocks = :allowPageLocks"),
    @NamedQuery(name = "SpatialIndexes.findBySpatialIndexType", query = "SELECT s FROM SpatialIndexes s WHERE s.spatialIndexType = :spatialIndexType"),
    @NamedQuery(name = "SpatialIndexes.findBySpatialIndexTypeDesc", query = "SELECT s FROM SpatialIndexes s WHERE s.spatialIndexTypeDesc = :spatialIndexTypeDesc"),
    @NamedQuery(name = "SpatialIndexes.findByTessellationScheme", query = "SELECT s FROM SpatialIndexes s WHERE s.tessellationScheme = :tessellationScheme"),
    @NamedQuery(name = "SpatialIndexes.findByHasFilter", query = "SELECT s FROM SpatialIndexes s WHERE s.hasFilter = :hasFilter"),
    @NamedQuery(name = "SpatialIndexes.findByFilterDefinition", query = "SELECT s FROM SpatialIndexes s WHERE s.filterDefinition = :filterDefinition"),
    @NamedQuery(name = "SpatialIndexes.findByAutoCreated", query = "SELECT s FROM SpatialIndexes s WHERE s.autoCreated = :autoCreated")})
public class SpatialIndexes implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "spatial_index_type")
    private int spatialIndexType;
    @Size(max = 60)
    @Column(name = "spatial_index_type_desc")
    private String spatialIndexTypeDesc;
    @Size(max = 60)
    @Column(name = "tessellation_scheme")
    private String tessellationScheme;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_filter")
    private boolean hasFilter;
    @Size(max = 2147483647)
    @Column(name = "filter_definition")
    private String filterDefinition;
    @Column(name = "auto_created")
    private Boolean autoCreated;

    public SpatialIndexes() {
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

    public int getSpatialIndexType() {
        return spatialIndexType;
    }

    public void setSpatialIndexType(int spatialIndexType) {
        this.spatialIndexType = spatialIndexType;
    }

    public String getSpatialIndexTypeDesc() {
        return spatialIndexTypeDesc;
    }

    public void setSpatialIndexTypeDesc(String spatialIndexTypeDesc) {
        this.spatialIndexTypeDesc = spatialIndexTypeDesc;
    }

    public String getTessellationScheme() {
        return tessellationScheme;
    }

    public void setTessellationScheme(String tessellationScheme) {
        this.tessellationScheme = tessellationScheme;
    }

    public boolean getHasFilter() {
        return hasFilter;
    }

    public void setHasFilter(boolean hasFilter) {
        this.hasFilter = hasFilter;
    }

    public String getFilterDefinition() {
        return filterDefinition;
    }

    public void setFilterDefinition(String filterDefinition) {
        this.filterDefinition = filterDefinition;
    }

    public Boolean getAutoCreated() {
        return autoCreated;
    }

    public void setAutoCreated(Boolean autoCreated) {
        this.autoCreated = autoCreated;
    }
    
}
