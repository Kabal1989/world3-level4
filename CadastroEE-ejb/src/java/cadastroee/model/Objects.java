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
@Table(name = "objects")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Objects.findAll", query = "SELECT o FROM Objects o"),
    @NamedQuery(name = "Objects.findByName", query = "SELECT o FROM Objects o WHERE o.name = :name"),
    @NamedQuery(name = "Objects.findByObjectId", query = "SELECT o FROM Objects o WHERE o.objectId = :objectId"),
    @NamedQuery(name = "Objects.findByPrincipalId", query = "SELECT o FROM Objects o WHERE o.principalId = :principalId"),
    @NamedQuery(name = "Objects.findBySchemaId", query = "SELECT o FROM Objects o WHERE o.schemaId = :schemaId"),
    @NamedQuery(name = "Objects.findByParentObjectId", query = "SELECT o FROM Objects o WHERE o.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "Objects.findByType", query = "SELECT o FROM Objects o WHERE o.type = :type"),
    @NamedQuery(name = "Objects.findByTypeDesc", query = "SELECT o FROM Objects o WHERE o.typeDesc = :typeDesc"),
    @NamedQuery(name = "Objects.findByCreateDate", query = "SELECT o FROM Objects o WHERE o.createDate = :createDate"),
    @NamedQuery(name = "Objects.findByModifyDate", query = "SELECT o FROM Objects o WHERE o.modifyDate = :modifyDate"),
    @NamedQuery(name = "Objects.findByIsMsShipped", query = "SELECT o FROM Objects o WHERE o.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "Objects.findByIsPublished", query = "SELECT o FROM Objects o WHERE o.isPublished = :isPublished"),
    @NamedQuery(name = "Objects.findByIsSchemaPublished", query = "SELECT o FROM Objects o WHERE o.isSchemaPublished = :isSchemaPublished")})
public class Objects implements Serializable {

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

    public Objects() {
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
    
}
