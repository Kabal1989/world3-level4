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
@Table(name = "synonyms")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Synonyms.findAll", query = "SELECT s FROM Synonyms s"),
    @NamedQuery(name = "Synonyms.findByName", query = "SELECT s FROM Synonyms s WHERE s.name = :name"),
    @NamedQuery(name = "Synonyms.findByObjectId", query = "SELECT s FROM Synonyms s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "Synonyms.findByPrincipalId", query = "SELECT s FROM Synonyms s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "Synonyms.findBySchemaId", query = "SELECT s FROM Synonyms s WHERE s.schemaId = :schemaId"),
    @NamedQuery(name = "Synonyms.findByParentObjectId", query = "SELECT s FROM Synonyms s WHERE s.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "Synonyms.findByType", query = "SELECT s FROM Synonyms s WHERE s.type = :type"),
    @NamedQuery(name = "Synonyms.findByTypeDesc", query = "SELECT s FROM Synonyms s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "Synonyms.findByCreateDate", query = "SELECT s FROM Synonyms s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "Synonyms.findByModifyDate", query = "SELECT s FROM Synonyms s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "Synonyms.findByIsMsShipped", query = "SELECT s FROM Synonyms s WHERE s.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "Synonyms.findByIsPublished", query = "SELECT s FROM Synonyms s WHERE s.isPublished = :isPublished"),
    @NamedQuery(name = "Synonyms.findByIsSchemaPublished", query = "SELECT s FROM Synonyms s WHERE s.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "Synonyms.findByBaseObjectName", query = "SELECT s FROM Synonyms s WHERE s.baseObjectName = :baseObjectName")})
public class Synonyms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "schema_id")
    private int schemaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_object_id")
    private int parentObjectId;
    @Size(max = 2)
    @Column(name = "type")
    private String type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_ms_shipped")
    private boolean isMsShipped;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_published")
    private boolean isPublished;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_schema_published")
    private boolean isSchemaPublished;
    @Size(max = 1035)
    @Column(name = "base_object_name")
    private String baseObjectName;

    public Synonyms() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public int getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(int schemaId) {
        this.schemaId = schemaId;
    }

    public int getParentObjectId() {
        return parentObjectId;
    }

    public void setParentObjectId(int parentObjectId) {
        this.parentObjectId = parentObjectId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
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

    public boolean getIsMsShipped() {
        return isMsShipped;
    }

    public void setIsMsShipped(boolean isMsShipped) {
        this.isMsShipped = isMsShipped;
    }

    public boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(boolean isPublished) {
        this.isPublished = isPublished;
    }

    public boolean getIsSchemaPublished() {
        return isSchemaPublished;
    }

    public void setIsSchemaPublished(boolean isSchemaPublished) {
        this.isSchemaPublished = isSchemaPublished;
    }

    public String getBaseObjectName() {
        return baseObjectName;
    }

    public void setBaseObjectName(String baseObjectName) {
        this.baseObjectName = baseObjectName;
    }
    
}
