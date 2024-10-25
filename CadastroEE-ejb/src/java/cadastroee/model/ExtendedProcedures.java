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
@Table(name = "extended_procedures")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExtendedProcedures.findAll", query = "SELECT e FROM ExtendedProcedures e"),
    @NamedQuery(name = "ExtendedProcedures.findByName", query = "SELECT e FROM ExtendedProcedures e WHERE e.name = :name"),
    @NamedQuery(name = "ExtendedProcedures.findByObjectId", query = "SELECT e FROM ExtendedProcedures e WHERE e.objectId = :objectId"),
    @NamedQuery(name = "ExtendedProcedures.findByPrincipalId", query = "SELECT e FROM ExtendedProcedures e WHERE e.principalId = :principalId"),
    @NamedQuery(name = "ExtendedProcedures.findBySchemaId", query = "SELECT e FROM ExtendedProcedures e WHERE e.schemaId = :schemaId"),
    @NamedQuery(name = "ExtendedProcedures.findByParentObjectId", query = "SELECT e FROM ExtendedProcedures e WHERE e.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "ExtendedProcedures.findByType", query = "SELECT e FROM ExtendedProcedures e WHERE e.type = :type"),
    @NamedQuery(name = "ExtendedProcedures.findByTypeDesc", query = "SELECT e FROM ExtendedProcedures e WHERE e.typeDesc = :typeDesc"),
    @NamedQuery(name = "ExtendedProcedures.findByCreateDate", query = "SELECT e FROM ExtendedProcedures e WHERE e.createDate = :createDate"),
    @NamedQuery(name = "ExtendedProcedures.findByModifyDate", query = "SELECT e FROM ExtendedProcedures e WHERE e.modifyDate = :modifyDate"),
    @NamedQuery(name = "ExtendedProcedures.findByIsMsShipped", query = "SELECT e FROM ExtendedProcedures e WHERE e.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "ExtendedProcedures.findByIsPublished", query = "SELECT e FROM ExtendedProcedures e WHERE e.isPublished = :isPublished"),
    @NamedQuery(name = "ExtendedProcedures.findByIsSchemaPublished", query = "SELECT e FROM ExtendedProcedures e WHERE e.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "ExtendedProcedures.findByDllName", query = "SELECT e FROM ExtendedProcedures e WHERE e.dllName = :dllName")})
public class ExtendedProcedures implements Serializable {

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
    @Size(max = 260)
    @Column(name = "dll_name")
    private String dllName;

    public ExtendedProcedures() {
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

    public String getDllName() {
        return dllName;
    }

    public void setDllName(String dllName) {
        this.dllName = dllName;
    }
    
}
