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
@Table(name = "external_streaming_jobs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalStreamingJobs.findAll", query = "SELECT e FROM ExternalStreamingJobs e"),
    @NamedQuery(name = "ExternalStreamingJobs.findByName", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.name = :name"),
    @NamedQuery(name = "ExternalStreamingJobs.findByObjectId", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.objectId = :objectId"),
    @NamedQuery(name = "ExternalStreamingJobs.findByPrincipalId", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.principalId = :principalId"),
    @NamedQuery(name = "ExternalStreamingJobs.findBySchemaId", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.schemaId = :schemaId"),
    @NamedQuery(name = "ExternalStreamingJobs.findByParentObjectId", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "ExternalStreamingJobs.findByType", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.type = :type"),
    @NamedQuery(name = "ExternalStreamingJobs.findByTypeDesc", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.typeDesc = :typeDesc"),
    @NamedQuery(name = "ExternalStreamingJobs.findByCreateDate", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.createDate = :createDate"),
    @NamedQuery(name = "ExternalStreamingJobs.findByModifyDate", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.modifyDate = :modifyDate"),
    @NamedQuery(name = "ExternalStreamingJobs.findByIsMsShipped", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "ExternalStreamingJobs.findByIsPublished", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.isPublished = :isPublished"),
    @NamedQuery(name = "ExternalStreamingJobs.findByIsSchemaPublished", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "ExternalStreamingJobs.findByUsesAnsiNulls", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.usesAnsiNulls = :usesAnsiNulls"),
    @NamedQuery(name = "ExternalStreamingJobs.findByStatement", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.statement = :statement"),
    @NamedQuery(name = "ExternalStreamingJobs.findByStatus", query = "SELECT e FROM ExternalStreamingJobs e WHERE e.status = :status")})
public class ExternalStreamingJobs implements Serializable {

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
    @Column(name = "uses_ansi_nulls")
    private Boolean usesAnsiNulls;
    @Size(max = 2147483647)
    @Column(name = "statement")
    private String statement;
    @Column(name = "status")
    private Integer status;

    public ExternalStreamingJobs() {
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

    public Boolean getUsesAnsiNulls() {
        return usesAnsiNulls;
    }

    public void setUsesAnsiNulls(Boolean usesAnsiNulls) {
        this.usesAnsiNulls = usesAnsiNulls;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
}
