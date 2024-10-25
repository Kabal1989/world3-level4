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
@Table(name = "internal_tables")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InternalTables.findAll", query = "SELECT i FROM InternalTables i"),
    @NamedQuery(name = "InternalTables.findByName", query = "SELECT i FROM InternalTables i WHERE i.name = :name"),
    @NamedQuery(name = "InternalTables.findByObjectId", query = "SELECT i FROM InternalTables i WHERE i.objectId = :objectId"),
    @NamedQuery(name = "InternalTables.findByPrincipalId", query = "SELECT i FROM InternalTables i WHERE i.principalId = :principalId"),
    @NamedQuery(name = "InternalTables.findBySchemaId", query = "SELECT i FROM InternalTables i WHERE i.schemaId = :schemaId"),
    @NamedQuery(name = "InternalTables.findByParentObjectId", query = "SELECT i FROM InternalTables i WHERE i.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "InternalTables.findByType", query = "SELECT i FROM InternalTables i WHERE i.type = :type"),
    @NamedQuery(name = "InternalTables.findByTypeDesc", query = "SELECT i FROM InternalTables i WHERE i.typeDesc = :typeDesc"),
    @NamedQuery(name = "InternalTables.findByCreateDate", query = "SELECT i FROM InternalTables i WHERE i.createDate = :createDate"),
    @NamedQuery(name = "InternalTables.findByModifyDate", query = "SELECT i FROM InternalTables i WHERE i.modifyDate = :modifyDate"),
    @NamedQuery(name = "InternalTables.findByIsMsShipped", query = "SELECT i FROM InternalTables i WHERE i.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "InternalTables.findByIsPublished", query = "SELECT i FROM InternalTables i WHERE i.isPublished = :isPublished"),
    @NamedQuery(name = "InternalTables.findByIsSchemaPublished", query = "SELECT i FROM InternalTables i WHERE i.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "InternalTables.findByInternalType", query = "SELECT i FROM InternalTables i WHERE i.internalType = :internalType"),
    @NamedQuery(name = "InternalTables.findByInternalTypeDesc", query = "SELECT i FROM InternalTables i WHERE i.internalTypeDesc = :internalTypeDesc"),
    @NamedQuery(name = "InternalTables.findByParentId", query = "SELECT i FROM InternalTables i WHERE i.parentId = :parentId"),
    @NamedQuery(name = "InternalTables.findByParentMinorId", query = "SELECT i FROM InternalTables i WHERE i.parentMinorId = :parentMinorId"),
    @NamedQuery(name = "InternalTables.findByLobDataSpaceId", query = "SELECT i FROM InternalTables i WHERE i.lobDataSpaceId = :lobDataSpaceId"),
    @NamedQuery(name = "InternalTables.findByFilestreamDataSpaceId", query = "SELECT i FROM InternalTables i WHERE i.filestreamDataSpaceId = :filestreamDataSpaceId")})
public class InternalTables implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
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
    @Column(name = "is_ms_shipped")
    private Boolean isMsShipped;
    @Column(name = "is_published")
    private Boolean isPublished;
    @Column(name = "is_schema_published")
    private Boolean isSchemaPublished;
    @Column(name = "internal_type")
    private Short internalType;
    @Size(max = 60)
    @Column(name = "internal_type_desc")
    private String internalTypeDesc;
    @Column(name = "parent_id")
    private Integer parentId;
    @Column(name = "parent_minor_id")
    private Integer parentMinorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lob_data_space_id")
    private int lobDataSpaceId;
    @Column(name = "filestream_data_space_id")
    private Integer filestreamDataSpaceId;

    public InternalTables() {
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

    public Boolean getIsMsShipped() {
        return isMsShipped;
    }

    public void setIsMsShipped(Boolean isMsShipped) {
        this.isMsShipped = isMsShipped;
    }

    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    public Boolean getIsSchemaPublished() {
        return isSchemaPublished;
    }

    public void setIsSchemaPublished(Boolean isSchemaPublished) {
        this.isSchemaPublished = isSchemaPublished;
    }

    public Short getInternalType() {
        return internalType;
    }

    public void setInternalType(Short internalType) {
        this.internalType = internalType;
    }

    public String getInternalTypeDesc() {
        return internalTypeDesc;
    }

    public void setInternalTypeDesc(String internalTypeDesc) {
        this.internalTypeDesc = internalTypeDesc;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getParentMinorId() {
        return parentMinorId;
    }

    public void setParentMinorId(Integer parentMinorId) {
        this.parentMinorId = parentMinorId;
    }

    public int getLobDataSpaceId() {
        return lobDataSpaceId;
    }

    public void setLobDataSpaceId(int lobDataSpaceId) {
        this.lobDataSpaceId = lobDataSpaceId;
    }

    public Integer getFilestreamDataSpaceId() {
        return filestreamDataSpaceId;
    }

    public void setFilestreamDataSpaceId(Integer filestreamDataSpaceId) {
        this.filestreamDataSpaceId = filestreamDataSpaceId;
    }
    
}
