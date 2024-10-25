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
@Table(name = "xml_indexes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XmlIndexes.findAll", query = "SELECT x FROM XmlIndexes x"),
    @NamedQuery(name = "XmlIndexes.findByObjectId", query = "SELECT x FROM XmlIndexes x WHERE x.objectId = :objectId"),
    @NamedQuery(name = "XmlIndexes.findByName", query = "SELECT x FROM XmlIndexes x WHERE x.name = :name"),
    @NamedQuery(name = "XmlIndexes.findByIndexId", query = "SELECT x FROM XmlIndexes x WHERE x.indexId = :indexId"),
    @NamedQuery(name = "XmlIndexes.findByType", query = "SELECT x FROM XmlIndexes x WHERE x.type = :type"),
    @NamedQuery(name = "XmlIndexes.findByTypeDesc", query = "SELECT x FROM XmlIndexes x WHERE x.typeDesc = :typeDesc"),
    @NamedQuery(name = "XmlIndexes.findByIsUnique", query = "SELECT x FROM XmlIndexes x WHERE x.isUnique = :isUnique"),
    @NamedQuery(name = "XmlIndexes.findByDataSpaceId", query = "SELECT x FROM XmlIndexes x WHERE x.dataSpaceId = :dataSpaceId"),
    @NamedQuery(name = "XmlIndexes.findByIgnoreDupKey", query = "SELECT x FROM XmlIndexes x WHERE x.ignoreDupKey = :ignoreDupKey"),
    @NamedQuery(name = "XmlIndexes.findByIsPrimaryKey", query = "SELECT x FROM XmlIndexes x WHERE x.isPrimaryKey = :isPrimaryKey"),
    @NamedQuery(name = "XmlIndexes.findByIsUniqueConstraint", query = "SELECT x FROM XmlIndexes x WHERE x.isUniqueConstraint = :isUniqueConstraint"),
    @NamedQuery(name = "XmlIndexes.findByFillFactor", query = "SELECT x FROM XmlIndexes x WHERE x.fillFactor = :fillFactor"),
    @NamedQuery(name = "XmlIndexes.findByIsPadded", query = "SELECT x FROM XmlIndexes x WHERE x.isPadded = :isPadded"),
    @NamedQuery(name = "XmlIndexes.findByIsDisabled", query = "SELECT x FROM XmlIndexes x WHERE x.isDisabled = :isDisabled"),
    @NamedQuery(name = "XmlIndexes.findByIsHypothetical", query = "SELECT x FROM XmlIndexes x WHERE x.isHypothetical = :isHypothetical"),
    @NamedQuery(name = "XmlIndexes.findByIsIgnoredInOptimization", query = "SELECT x FROM XmlIndexes x WHERE x.isIgnoredInOptimization = :isIgnoredInOptimization"),
    @NamedQuery(name = "XmlIndexes.findByAllowRowLocks", query = "SELECT x FROM XmlIndexes x WHERE x.allowRowLocks = :allowRowLocks"),
    @NamedQuery(name = "XmlIndexes.findByAllowPageLocks", query = "SELECT x FROM XmlIndexes x WHERE x.allowPageLocks = :allowPageLocks"),
    @NamedQuery(name = "XmlIndexes.findByUsingXmlIndexId", query = "SELECT x FROM XmlIndexes x WHERE x.usingXmlIndexId = :usingXmlIndexId"),
    @NamedQuery(name = "XmlIndexes.findBySecondaryType", query = "SELECT x FROM XmlIndexes x WHERE x.secondaryType = :secondaryType"),
    @NamedQuery(name = "XmlIndexes.findBySecondaryTypeDesc", query = "SELECT x FROM XmlIndexes x WHERE x.secondaryTypeDesc = :secondaryTypeDesc"),
    @NamedQuery(name = "XmlIndexes.findByHasFilter", query = "SELECT x FROM XmlIndexes x WHERE x.hasFilter = :hasFilter"),
    @NamedQuery(name = "XmlIndexes.findByFilterDefinition", query = "SELECT x FROM XmlIndexes x WHERE x.filterDefinition = :filterDefinition"),
    @NamedQuery(name = "XmlIndexes.findByXmlIndexType", query = "SELECT x FROM XmlIndexes x WHERE x.xmlIndexType = :xmlIndexType"),
    @NamedQuery(name = "XmlIndexes.findByXmlIndexTypeDescription", query = "SELECT x FROM XmlIndexes x WHERE x.xmlIndexTypeDescription = :xmlIndexTypeDescription"),
    @NamedQuery(name = "XmlIndexes.findByPathId", query = "SELECT x FROM XmlIndexes x WHERE x.pathId = :pathId"),
    @NamedQuery(name = "XmlIndexes.findByAutoCreated", query = "SELECT x FROM XmlIndexes x WHERE x.autoCreated = :autoCreated")})
public class XmlIndexes implements Serializable {

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
    @Column(name = "using_xml_index_id")
    private Integer usingXmlIndexId;
    @Column(name = "secondary_type")
    private Character secondaryType;
    @Size(max = 60)
    @Column(name = "secondary_type_desc")
    private String secondaryTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_filter")
    private boolean hasFilter;
    @Size(max = 2147483647)
    @Column(name = "filter_definition")
    private String filterDefinition;
    @Column(name = "xml_index_type")
    private Short xmlIndexType;
    @Size(max = 60)
    @Column(name = "xml_index_type_description")
    private String xmlIndexTypeDescription;
    @Column(name = "path_id")
    private Integer pathId;
    @Column(name = "auto_created")
    private Boolean autoCreated;

    public XmlIndexes() {
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

    public Integer getUsingXmlIndexId() {
        return usingXmlIndexId;
    }

    public void setUsingXmlIndexId(Integer usingXmlIndexId) {
        this.usingXmlIndexId = usingXmlIndexId;
    }

    public Character getSecondaryType() {
        return secondaryType;
    }

    public void setSecondaryType(Character secondaryType) {
        this.secondaryType = secondaryType;
    }

    public String getSecondaryTypeDesc() {
        return secondaryTypeDesc;
    }

    public void setSecondaryTypeDesc(String secondaryTypeDesc) {
        this.secondaryTypeDesc = secondaryTypeDesc;
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

    public Short getXmlIndexType() {
        return xmlIndexType;
    }

    public void setXmlIndexType(Short xmlIndexType) {
        this.xmlIndexType = xmlIndexType;
    }

    public String getXmlIndexTypeDescription() {
        return xmlIndexTypeDescription;
    }

    public void setXmlIndexTypeDescription(String xmlIndexTypeDescription) {
        this.xmlIndexTypeDescription = xmlIndexTypeDescription;
    }

    public Integer getPathId() {
        return pathId;
    }

    public void setPathId(Integer pathId) {
        this.pathId = pathId;
    }

    public Boolean getAutoCreated() {
        return autoCreated;
    }

    public void setAutoCreated(Boolean autoCreated) {
        this.autoCreated = autoCreated;
    }
    
}
