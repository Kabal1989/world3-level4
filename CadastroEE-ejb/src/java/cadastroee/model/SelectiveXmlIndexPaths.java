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
@Table(name = "selective_xml_index_paths")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SelectiveXmlIndexPaths.findAll", query = "SELECT s FROM SelectiveXmlIndexPaths s"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByObjectId", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByIndexId", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.indexId = :indexId"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByPathId", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.pathId = :pathId"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByPath", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.path = :path"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByName", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.name = :name"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByPathType", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.pathType = :pathType"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByPathTypeDesc", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.pathTypeDesc = :pathTypeDesc"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByXmlComponentId", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.xmlComponentId = :xmlComponentId"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByXqueryTypeDescription", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.xqueryTypeDescription = :xqueryTypeDescription"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByIsXqueryTypeInferred", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.isXqueryTypeInferred = :isXqueryTypeInferred"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByXqueryMaxLength", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.xqueryMaxLength = :xqueryMaxLength"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByIsXqueryMaxLengthInferred", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.isXqueryMaxLengthInferred = :isXqueryMaxLengthInferred"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByIsNode", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.isNode = :isNode"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findBySystemTypeId", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByUserTypeId", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.userTypeId = :userTypeId"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByMaxLength", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.maxLength = :maxLength"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByPrecision", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.precision = :precision"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByScale", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.scale = :scale"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByCollationName", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.collationName = :collationName"),
    @NamedQuery(name = "SelectiveXmlIndexPaths.findByIsSingleton", query = "SELECT s FROM SelectiveXmlIndexPaths s WHERE s.isSingleton = :isSingleton")})
public class SelectiveXmlIndexPaths implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_id")
    private int indexId;
    @Column(name = "path_id")
    private Integer pathId;
    @Size(max = 4000)
    @Column(name = "path")
    private String path;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "path_type")
    private Short pathType;
    @Size(max = 128)
    @Column(name = "path_type_desc")
    private String pathTypeDesc;
    @Column(name = "xml_component_id")
    private Integer xmlComponentId;
    @Size(max = 4000)
    @Column(name = "xquery_type_description")
    private String xqueryTypeDescription;
    @Column(name = "is_xquery_type_inferred")
    private Boolean isXqueryTypeInferred;
    @Column(name = "xquery_max_length")
    private Integer xqueryMaxLength;
    @Column(name = "is_xquery_max_length_inferred")
    private Boolean isXqueryMaxLengthInferred;
    @Column(name = "is_node")
    private Boolean isNode;
    @Column(name = "system_type_id")
    private Short systemTypeId;
    @Column(name = "user_type_id")
    private Short userTypeId;
    @Column(name = "max_length")
    private Short maxLength;
    @Column(name = "precision")
    private Short precision;
    @Column(name = "scale")
    private Short scale;
    @Size(max = 128)
    @Column(name = "collation_name")
    private String collationName;
    @Column(name = "is_singleton")
    private Boolean isSingleton;

    public SelectiveXmlIndexPaths() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public Integer getPathId() {
        return pathId;
    }

    public void setPathId(Integer pathId) {
        this.pathId = pathId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getPathType() {
        return pathType;
    }

    public void setPathType(Short pathType) {
        this.pathType = pathType;
    }

    public String getPathTypeDesc() {
        return pathTypeDesc;
    }

    public void setPathTypeDesc(String pathTypeDesc) {
        this.pathTypeDesc = pathTypeDesc;
    }

    public Integer getXmlComponentId() {
        return xmlComponentId;
    }

    public void setXmlComponentId(Integer xmlComponentId) {
        this.xmlComponentId = xmlComponentId;
    }

    public String getXqueryTypeDescription() {
        return xqueryTypeDescription;
    }

    public void setXqueryTypeDescription(String xqueryTypeDescription) {
        this.xqueryTypeDescription = xqueryTypeDescription;
    }

    public Boolean getIsXqueryTypeInferred() {
        return isXqueryTypeInferred;
    }

    public void setIsXqueryTypeInferred(Boolean isXqueryTypeInferred) {
        this.isXqueryTypeInferred = isXqueryTypeInferred;
    }

    public Integer getXqueryMaxLength() {
        return xqueryMaxLength;
    }

    public void setXqueryMaxLength(Integer xqueryMaxLength) {
        this.xqueryMaxLength = xqueryMaxLength;
    }

    public Boolean getIsXqueryMaxLengthInferred() {
        return isXqueryMaxLengthInferred;
    }

    public void setIsXqueryMaxLengthInferred(Boolean isXqueryMaxLengthInferred) {
        this.isXqueryMaxLengthInferred = isXqueryMaxLengthInferred;
    }

    public Boolean getIsNode() {
        return isNode;
    }

    public void setIsNode(Boolean isNode) {
        this.isNode = isNode;
    }

    public Short getSystemTypeId() {
        return systemTypeId;
    }

    public void setSystemTypeId(Short systemTypeId) {
        this.systemTypeId = systemTypeId;
    }

    public Short getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Short userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Short getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Short maxLength) {
        this.maxLength = maxLength;
    }

    public Short getPrecision() {
        return precision;
    }

    public void setPrecision(Short precision) {
        this.precision = precision;
    }

    public Short getScale() {
        return scale;
    }

    public void setScale(Short scale) {
        this.scale = scale;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    public Boolean getIsSingleton() {
        return isSingleton;
    }

    public void setIsSingleton(Boolean isSingleton) {
        this.isSingleton = isSingleton;
    }
    
}
