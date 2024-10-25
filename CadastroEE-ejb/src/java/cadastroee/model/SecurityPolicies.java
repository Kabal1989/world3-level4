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
@Table(name = "security_policies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SecurityPolicies.findAll", query = "SELECT s FROM SecurityPolicies s"),
    @NamedQuery(name = "SecurityPolicies.findByName", query = "SELECT s FROM SecurityPolicies s WHERE s.name = :name"),
    @NamedQuery(name = "SecurityPolicies.findByObjectId", query = "SELECT s FROM SecurityPolicies s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "SecurityPolicies.findByPrincipalId", query = "SELECT s FROM SecurityPolicies s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "SecurityPolicies.findBySchemaId", query = "SELECT s FROM SecurityPolicies s WHERE s.schemaId = :schemaId"),
    @NamedQuery(name = "SecurityPolicies.findByParentObjectId", query = "SELECT s FROM SecurityPolicies s WHERE s.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "SecurityPolicies.findByType", query = "SELECT s FROM SecurityPolicies s WHERE s.type = :type"),
    @NamedQuery(name = "SecurityPolicies.findByTypeDesc", query = "SELECT s FROM SecurityPolicies s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "SecurityPolicies.findByCreateDate", query = "SELECT s FROM SecurityPolicies s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "SecurityPolicies.findByModifyDate", query = "SELECT s FROM SecurityPolicies s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "SecurityPolicies.findByIsMsShipped", query = "SELECT s FROM SecurityPolicies s WHERE s.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "SecurityPolicies.findByIsEnabled", query = "SELECT s FROM SecurityPolicies s WHERE s.isEnabled = :isEnabled"),
    @NamedQuery(name = "SecurityPolicies.findByIsNotForReplication", query = "SELECT s FROM SecurityPolicies s WHERE s.isNotForReplication = :isNotForReplication"),
    @NamedQuery(name = "SecurityPolicies.findByUsesDatabaseCollation", query = "SELECT s FROM SecurityPolicies s WHERE s.usesDatabaseCollation = :usesDatabaseCollation"),
    @NamedQuery(name = "SecurityPolicies.findByIsSchemaBound", query = "SELECT s FROM SecurityPolicies s WHERE s.isSchemaBound = :isSchemaBound")})
public class SecurityPolicies implements Serializable {

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
    @Column(name = "is_enabled")
    private boolean isEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_not_for_replication")
    private boolean isNotForReplication;
    @Column(name = "uses_database_collation")
    private Boolean usesDatabaseCollation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_schema_bound")
    private boolean isSchemaBound;

    public SecurityPolicies() {
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

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public boolean getIsNotForReplication() {
        return isNotForReplication;
    }

    public void setIsNotForReplication(boolean isNotForReplication) {
        this.isNotForReplication = isNotForReplication;
    }

    public Boolean getUsesDatabaseCollation() {
        return usesDatabaseCollation;
    }

    public void setUsesDatabaseCollation(Boolean usesDatabaseCollation) {
        this.usesDatabaseCollation = usesDatabaseCollation;
    }

    public boolean getIsSchemaBound() {
        return isSchemaBound;
    }

    public void setIsSchemaBound(boolean isSchemaBound) {
        this.isSchemaBound = isSchemaBound;
    }
    
}
