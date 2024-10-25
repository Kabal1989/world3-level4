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
@Table(name = "edge_constraints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EdgeConstraints.findAll", query = "SELECT e FROM EdgeConstraints e"),
    @NamedQuery(name = "EdgeConstraints.findByName", query = "SELECT e FROM EdgeConstraints e WHERE e.name = :name"),
    @NamedQuery(name = "EdgeConstraints.findByObjectId", query = "SELECT e FROM EdgeConstraints e WHERE e.objectId = :objectId"),
    @NamedQuery(name = "EdgeConstraints.findByPrincipalId", query = "SELECT e FROM EdgeConstraints e WHERE e.principalId = :principalId"),
    @NamedQuery(name = "EdgeConstraints.findBySchemaId", query = "SELECT e FROM EdgeConstraints e WHERE e.schemaId = :schemaId"),
    @NamedQuery(name = "EdgeConstraints.findByParentObjectId", query = "SELECT e FROM EdgeConstraints e WHERE e.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "EdgeConstraints.findByType", query = "SELECT e FROM EdgeConstraints e WHERE e.type = :type"),
    @NamedQuery(name = "EdgeConstraints.findByTypeDesc", query = "SELECT e FROM EdgeConstraints e WHERE e.typeDesc = :typeDesc"),
    @NamedQuery(name = "EdgeConstraints.findByCreateDate", query = "SELECT e FROM EdgeConstraints e WHERE e.createDate = :createDate"),
    @NamedQuery(name = "EdgeConstraints.findByModifyDate", query = "SELECT e FROM EdgeConstraints e WHERE e.modifyDate = :modifyDate"),
    @NamedQuery(name = "EdgeConstraints.findByIsMsShipped", query = "SELECT e FROM EdgeConstraints e WHERE e.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "EdgeConstraints.findByIsPublished", query = "SELECT e FROM EdgeConstraints e WHERE e.isPublished = :isPublished"),
    @NamedQuery(name = "EdgeConstraints.findByIsSchemaPublished", query = "SELECT e FROM EdgeConstraints e WHERE e.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "EdgeConstraints.findByIsDisabled", query = "SELECT e FROM EdgeConstraints e WHERE e.isDisabled = :isDisabled"),
    @NamedQuery(name = "EdgeConstraints.findByIsNotTrusted", query = "SELECT e FROM EdgeConstraints e WHERE e.isNotTrusted = :isNotTrusted"),
    @NamedQuery(name = "EdgeConstraints.findByIsSystemNamed", query = "SELECT e FROM EdgeConstraints e WHERE e.isSystemNamed = :isSystemNamed"),
    @NamedQuery(name = "EdgeConstraints.findByDeleteReferentialAction", query = "SELECT e FROM EdgeConstraints e WHERE e.deleteReferentialAction = :deleteReferentialAction"),
    @NamedQuery(name = "EdgeConstraints.findByDeleteReferentialActionDesc", query = "SELECT e FROM EdgeConstraints e WHERE e.deleteReferentialActionDesc = :deleteReferentialActionDesc")})
public class EdgeConstraints implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_disabled")
    private boolean isDisabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_not_trusted")
    private boolean isNotTrusted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_system_named")
    private boolean isSystemNamed;
    @Column(name = "delete_referential_action")
    private Short deleteReferentialAction;
    @Size(max = 60)
    @Column(name = "delete_referential_action_desc")
    private String deleteReferentialActionDesc;

    public EdgeConstraints() {
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

    public boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public boolean getIsNotTrusted() {
        return isNotTrusted;
    }

    public void setIsNotTrusted(boolean isNotTrusted) {
        this.isNotTrusted = isNotTrusted;
    }

    public boolean getIsSystemNamed() {
        return isSystemNamed;
    }

    public void setIsSystemNamed(boolean isSystemNamed) {
        this.isSystemNamed = isSystemNamed;
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
    
}
