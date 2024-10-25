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
@Table(name = "foreign_keys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ForeignKeys.findAll", query = "SELECT f FROM ForeignKeys f"),
    @NamedQuery(name = "ForeignKeys.findByName", query = "SELECT f FROM ForeignKeys f WHERE f.name = :name"),
    @NamedQuery(name = "ForeignKeys.findByObjectId", query = "SELECT f FROM ForeignKeys f WHERE f.objectId = :objectId"),
    @NamedQuery(name = "ForeignKeys.findByPrincipalId", query = "SELECT f FROM ForeignKeys f WHERE f.principalId = :principalId"),
    @NamedQuery(name = "ForeignKeys.findBySchemaId", query = "SELECT f FROM ForeignKeys f WHERE f.schemaId = :schemaId"),
    @NamedQuery(name = "ForeignKeys.findByParentObjectId", query = "SELECT f FROM ForeignKeys f WHERE f.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "ForeignKeys.findByType", query = "SELECT f FROM ForeignKeys f WHERE f.type = :type"),
    @NamedQuery(name = "ForeignKeys.findByTypeDesc", query = "SELECT f FROM ForeignKeys f WHERE f.typeDesc = :typeDesc"),
    @NamedQuery(name = "ForeignKeys.findByCreateDate", query = "SELECT f FROM ForeignKeys f WHERE f.createDate = :createDate"),
    @NamedQuery(name = "ForeignKeys.findByModifyDate", query = "SELECT f FROM ForeignKeys f WHERE f.modifyDate = :modifyDate"),
    @NamedQuery(name = "ForeignKeys.findByIsMsShipped", query = "SELECT f FROM ForeignKeys f WHERE f.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "ForeignKeys.findByIsPublished", query = "SELECT f FROM ForeignKeys f WHERE f.isPublished = :isPublished"),
    @NamedQuery(name = "ForeignKeys.findByIsSchemaPublished", query = "SELECT f FROM ForeignKeys f WHERE f.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "ForeignKeys.findByReferencedObjectId", query = "SELECT f FROM ForeignKeys f WHERE f.referencedObjectId = :referencedObjectId"),
    @NamedQuery(name = "ForeignKeys.findByKeyIndexId", query = "SELECT f FROM ForeignKeys f WHERE f.keyIndexId = :keyIndexId"),
    @NamedQuery(name = "ForeignKeys.findByIsDisabled", query = "SELECT f FROM ForeignKeys f WHERE f.isDisabled = :isDisabled"),
    @NamedQuery(name = "ForeignKeys.findByIsNotForReplication", query = "SELECT f FROM ForeignKeys f WHERE f.isNotForReplication = :isNotForReplication"),
    @NamedQuery(name = "ForeignKeys.findByIsNotTrusted", query = "SELECT f FROM ForeignKeys f WHERE f.isNotTrusted = :isNotTrusted"),
    @NamedQuery(name = "ForeignKeys.findByDeleteReferentialAction", query = "SELECT f FROM ForeignKeys f WHERE f.deleteReferentialAction = :deleteReferentialAction"),
    @NamedQuery(name = "ForeignKeys.findByDeleteReferentialActionDesc", query = "SELECT f FROM ForeignKeys f WHERE f.deleteReferentialActionDesc = :deleteReferentialActionDesc"),
    @NamedQuery(name = "ForeignKeys.findByUpdateReferentialAction", query = "SELECT f FROM ForeignKeys f WHERE f.updateReferentialAction = :updateReferentialAction"),
    @NamedQuery(name = "ForeignKeys.findByUpdateReferentialActionDesc", query = "SELECT f FROM ForeignKeys f WHERE f.updateReferentialActionDesc = :updateReferentialActionDesc"),
    @NamedQuery(name = "ForeignKeys.findByIsSystemNamed", query = "SELECT f FROM ForeignKeys f WHERE f.isSystemNamed = :isSystemNamed")})
public class ForeignKeys implements Serializable {

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
    @Column(name = "referenced_object_id")
    private Integer referencedObjectId;
    @Column(name = "key_index_id")
    private Integer keyIndexId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_disabled")
    private boolean isDisabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_not_for_replication")
    private boolean isNotForReplication;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_not_trusted")
    private boolean isNotTrusted;
    @Column(name = "delete_referential_action")
    private Short deleteReferentialAction;
    @Size(max = 60)
    @Column(name = "delete_referential_action_desc")
    private String deleteReferentialActionDesc;
    @Column(name = "update_referential_action")
    private Short updateReferentialAction;
    @Size(max = 60)
    @Column(name = "update_referential_action_desc")
    private String updateReferentialActionDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_system_named")
    private boolean isSystemNamed;

    public ForeignKeys() {
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

    public Integer getReferencedObjectId() {
        return referencedObjectId;
    }

    public void setReferencedObjectId(Integer referencedObjectId) {
        this.referencedObjectId = referencedObjectId;
    }

    public Integer getKeyIndexId() {
        return keyIndexId;
    }

    public void setKeyIndexId(Integer keyIndexId) {
        this.keyIndexId = keyIndexId;
    }

    public boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public boolean getIsNotForReplication() {
        return isNotForReplication;
    }

    public void setIsNotForReplication(boolean isNotForReplication) {
        this.isNotForReplication = isNotForReplication;
    }

    public boolean getIsNotTrusted() {
        return isNotTrusted;
    }

    public void setIsNotTrusted(boolean isNotTrusted) {
        this.isNotTrusted = isNotTrusted;
    }

    public Short getDeleteReferentialAction() {
        return deleteReferentialAction;
    }

    public void setDeleteReferentialAction(Short deleteReferentialAction) {
        this.deleteReferentialAction = deleteReferentialAction;
    }

    public String getDeleteReferentialActionDesc() {
        return deleteReferentialActionDesc;
    }

    public void setDeleteReferentialActionDesc(String deleteReferentialActionDesc) {
        this.deleteReferentialActionDesc = deleteReferentialActionDesc;
    }

    public Short getUpdateReferentialAction() {
        return updateReferentialAction;
    }

    public void setUpdateReferentialAction(Short updateReferentialAction) {
        this.updateReferentialAction = updateReferentialAction;
    }

    public String getUpdateReferentialActionDesc() {
        return updateReferentialActionDesc;
    }

    public void setUpdateReferentialActionDesc(String updateReferentialActionDesc) {
        this.updateReferentialActionDesc = updateReferentialActionDesc;
    }

    public boolean getIsSystemNamed() {
        return isSystemNamed;
    }

    public void setIsSystemNamed(boolean isSystemNamed) {
        this.isSystemNamed = isSystemNamed;
    }
    
}
