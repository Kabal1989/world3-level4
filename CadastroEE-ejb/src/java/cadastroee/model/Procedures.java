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
@Table(name = "procedures")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Procedures.findAll", query = "SELECT p FROM Procedures p"),
    @NamedQuery(name = "Procedures.findByName", query = "SELECT p FROM Procedures p WHERE p.name = :name"),
    @NamedQuery(name = "Procedures.findByObjectId", query = "SELECT p FROM Procedures p WHERE p.objectId = :objectId"),
    @NamedQuery(name = "Procedures.findByPrincipalId", query = "SELECT p FROM Procedures p WHERE p.principalId = :principalId"),
    @NamedQuery(name = "Procedures.findBySchemaId", query = "SELECT p FROM Procedures p WHERE p.schemaId = :schemaId"),
    @NamedQuery(name = "Procedures.findByParentObjectId", query = "SELECT p FROM Procedures p WHERE p.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "Procedures.findByType", query = "SELECT p FROM Procedures p WHERE p.type = :type"),
    @NamedQuery(name = "Procedures.findByTypeDesc", query = "SELECT p FROM Procedures p WHERE p.typeDesc = :typeDesc"),
    @NamedQuery(name = "Procedures.findByCreateDate", query = "SELECT p FROM Procedures p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "Procedures.findByModifyDate", query = "SELECT p FROM Procedures p WHERE p.modifyDate = :modifyDate"),
    @NamedQuery(name = "Procedures.findByIsMsShipped", query = "SELECT p FROM Procedures p WHERE p.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "Procedures.findByIsPublished", query = "SELECT p FROM Procedures p WHERE p.isPublished = :isPublished"),
    @NamedQuery(name = "Procedures.findByIsSchemaPublished", query = "SELECT p FROM Procedures p WHERE p.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "Procedures.findByIsAutoExecuted", query = "SELECT p FROM Procedures p WHERE p.isAutoExecuted = :isAutoExecuted"),
    @NamedQuery(name = "Procedures.findByIsExecutionReplicated", query = "SELECT p FROM Procedures p WHERE p.isExecutionReplicated = :isExecutionReplicated"),
    @NamedQuery(name = "Procedures.findByIsReplSerializableOnly", query = "SELECT p FROM Procedures p WHERE p.isReplSerializableOnly = :isReplSerializableOnly"),
    @NamedQuery(name = "Procedures.findBySkipsReplConstraints", query = "SELECT p FROM Procedures p WHERE p.skipsReplConstraints = :skipsReplConstraints")})
public class Procedures implements Serializable {

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
    @Column(name = "is_auto_executed")
    private boolean isAutoExecuted;
    @Column(name = "is_execution_replicated")
    private Boolean isExecutionReplicated;
    @Column(name = "is_repl_serializable_only")
    private Boolean isReplSerializableOnly;
    @Column(name = "skips_repl_constraints")
    private Boolean skipsReplConstraints;

    public Procedures() {
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

    public boolean getIsAutoExecuted() {
        return isAutoExecuted;
    }

    public void setIsAutoExecuted(boolean isAutoExecuted) {
        this.isAutoExecuted = isAutoExecuted;
    }

    public Boolean getIsExecutionReplicated() {
        return isExecutionReplicated;
    }

    public void setIsExecutionReplicated(Boolean isExecutionReplicated) {
        this.isExecutionReplicated = isExecutionReplicated;
    }

    public Boolean getIsReplSerializableOnly() {
        return isReplSerializableOnly;
    }

    public void setIsReplSerializableOnly(Boolean isReplSerializableOnly) {
        this.isReplSerializableOnly = isReplSerializableOnly;
    }

    public Boolean getSkipsReplConstraints() {
        return skipsReplConstraints;
    }

    public void setSkipsReplConstraints(Boolean skipsReplConstraints) {
        this.skipsReplConstraints = skipsReplConstraints;
    }
    
}
