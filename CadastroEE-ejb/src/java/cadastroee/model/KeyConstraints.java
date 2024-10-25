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
@Table(name = "key_constraints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KeyConstraints.findAll", query = "SELECT k FROM KeyConstraints k"),
    @NamedQuery(name = "KeyConstraints.findByName", query = "SELECT k FROM KeyConstraints k WHERE k.name = :name"),
    @NamedQuery(name = "KeyConstraints.findByObjectId", query = "SELECT k FROM KeyConstraints k WHERE k.objectId = :objectId"),
    @NamedQuery(name = "KeyConstraints.findByPrincipalId", query = "SELECT k FROM KeyConstraints k WHERE k.principalId = :principalId"),
    @NamedQuery(name = "KeyConstraints.findBySchemaId", query = "SELECT k FROM KeyConstraints k WHERE k.schemaId = :schemaId"),
    @NamedQuery(name = "KeyConstraints.findByParentObjectId", query = "SELECT k FROM KeyConstraints k WHERE k.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "KeyConstraints.findByType", query = "SELECT k FROM KeyConstraints k WHERE k.type = :type"),
    @NamedQuery(name = "KeyConstraints.findByTypeDesc", query = "SELECT k FROM KeyConstraints k WHERE k.typeDesc = :typeDesc"),
    @NamedQuery(name = "KeyConstraints.findByCreateDate", query = "SELECT k FROM KeyConstraints k WHERE k.createDate = :createDate"),
    @NamedQuery(name = "KeyConstraints.findByModifyDate", query = "SELECT k FROM KeyConstraints k WHERE k.modifyDate = :modifyDate"),
    @NamedQuery(name = "KeyConstraints.findByIsMsShipped", query = "SELECT k FROM KeyConstraints k WHERE k.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "KeyConstraints.findByIsPublished", query = "SELECT k FROM KeyConstraints k WHERE k.isPublished = :isPublished"),
    @NamedQuery(name = "KeyConstraints.findByIsSchemaPublished", query = "SELECT k FROM KeyConstraints k WHERE k.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "KeyConstraints.findByUniqueIndexId", query = "SELECT k FROM KeyConstraints k WHERE k.uniqueIndexId = :uniqueIndexId"),
    @NamedQuery(name = "KeyConstraints.findByIsSystemNamed", query = "SELECT k FROM KeyConstraints k WHERE k.isSystemNamed = :isSystemNamed"),
    @NamedQuery(name = "KeyConstraints.findByIsEnforced", query = "SELECT k FROM KeyConstraints k WHERE k.isEnforced = :isEnforced")})
public class KeyConstraints implements Serializable {

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
    @Column(name = "unique_index_id")
    private Integer uniqueIndexId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_system_named")
    private boolean isSystemNamed;
    @Column(name = "is_enforced")
    private Boolean isEnforced;

    public KeyConstraints() {
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

    public Integer getUniqueIndexId() {
        return uniqueIndexId;
    }

    public void setUniqueIndexId(Integer uniqueIndexId) {
        this.uniqueIndexId = uniqueIndexId;
    }

    public boolean getIsSystemNamed() {
        return isSystemNamed;
    }

    public void setIsSystemNamed(boolean isSystemNamed) {
        this.isSystemNamed = isSystemNamed;
    }

    public Boolean getIsEnforced() {
        return isEnforced;
    }

    public void setIsEnforced(Boolean isEnforced) {
        this.isEnforced = isEnforced;
    }
    
}
