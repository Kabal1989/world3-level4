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
@Table(name = "check_constraints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CheckConstraints_1.findAll", query = "SELECT c FROM CheckConstraints_1 c"),
    @NamedQuery(name = "CheckConstraints_1.findByConstraintCatalog", query = "SELECT c FROM CheckConstraints_1 c WHERE c.constraintCatalog = :constraintCatalog"),
    @NamedQuery(name = "CheckConstraints_1.findByConstraintSchema", query = "SELECT c FROM CheckConstraints_1 c WHERE c.constraintSchema = :constraintSchema"),
    @NamedQuery(name = "CheckConstraints_1.findByConstraintName", query = "SELECT c FROM CheckConstraints_1 c WHERE c.constraintName = :constraintName"),
    @NamedQuery(name = "CheckConstraints_1.findByCheckClause", query = "SELECT c FROM CheckConstraints_1 c WHERE c.checkClause = :checkClause"),
    @NamedQuery(name = "CheckConstraints_1.findByName", query = "SELECT c FROM CheckConstraints_1 c WHERE c.name = :name"),
    @NamedQuery(name = "CheckConstraints_1.findByObjectId", query = "SELECT c FROM CheckConstraints_1 c WHERE c.objectId = :objectId"),
    @NamedQuery(name = "CheckConstraints_1.findByPrincipalId", query = "SELECT c FROM CheckConstraints_1 c WHERE c.principalId = :principalId"),
    @NamedQuery(name = "CheckConstraints_1.findBySchemaId", query = "SELECT c FROM CheckConstraints_1 c WHERE c.schemaId = :schemaId"),
    @NamedQuery(name = "CheckConstraints_1.findByParentObjectId", query = "SELECT c FROM CheckConstraints_1 c WHERE c.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "CheckConstraints_1.findByType", query = "SELECT c FROM CheckConstraints_1 c WHERE c.type = :type"),
    @NamedQuery(name = "CheckConstraints_1.findByTypeDesc", query = "SELECT c FROM CheckConstraints_1 c WHERE c.typeDesc = :typeDesc"),
    @NamedQuery(name = "CheckConstraints_1.findByCreateDate", query = "SELECT c FROM CheckConstraints_1 c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "CheckConstraints_1.findByModifyDate", query = "SELECT c FROM CheckConstraints_1 c WHERE c.modifyDate = :modifyDate"),
    @NamedQuery(name = "CheckConstraints_1.findByIsMsShipped", query = "SELECT c FROM CheckConstraints_1 c WHERE c.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "CheckConstraints_1.findByIsPublished", query = "SELECT c FROM CheckConstraints_1 c WHERE c.isPublished = :isPublished"),
    @NamedQuery(name = "CheckConstraints_1.findByIsSchemaPublished", query = "SELECT c FROM CheckConstraints_1 c WHERE c.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "CheckConstraints_1.findByIsDisabled", query = "SELECT c FROM CheckConstraints_1 c WHERE c.isDisabled = :isDisabled"),
    @NamedQuery(name = "CheckConstraints_1.findByIsNotForReplication", query = "SELECT c FROM CheckConstraints_1 c WHERE c.isNotForReplication = :isNotForReplication"),
    @NamedQuery(name = "CheckConstraints_1.findByIsNotTrusted", query = "SELECT c FROM CheckConstraints_1 c WHERE c.isNotTrusted = :isNotTrusted"),
    @NamedQuery(name = "CheckConstraints_1.findByParentColumnId", query = "SELECT c FROM CheckConstraints_1 c WHERE c.parentColumnId = :parentColumnId"),
    @NamedQuery(name = "CheckConstraints_1.findByDefinition", query = "SELECT c FROM CheckConstraints_1 c WHERE c.definition = :definition"),
    @NamedQuery(name = "CheckConstraints_1.findByUsesDatabaseCollation", query = "SELECT c FROM CheckConstraints_1 c WHERE c.usesDatabaseCollation = :usesDatabaseCollation"),
    @NamedQuery(name = "CheckConstraints_1.findByIsSystemNamed", query = "SELECT c FROM CheckConstraints_1 c WHERE c.isSystemNamed = :isSystemNamed")})
@Entity
@Table(name = "CHECK_CONSTRAINTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CheckConstraints_1.findAll", query = "SELECT c FROM CheckConstraints_1 c"),
    @NamedQuery(name = "CheckConstraints_1.findByConstraintCatalog", query = "SELECT c FROM CheckConstraints_1 c WHERE c.constraintCatalog = :constraintCatalog"),
    @NamedQuery(name = "CheckConstraints_1.findByConstraintSchema", query = "SELECT c FROM CheckConstraints_1 c WHERE c.constraintSchema = :constraintSchema"),
    @NamedQuery(name = "CheckConstraints_1.findByConstraintName", query = "SELECT c FROM CheckConstraints_1 c WHERE c.constraintName = :constraintName"),
    @NamedQuery(name = "CheckConstraints_1.findByCheckClause", query = "SELECT c FROM CheckConstraints_1 c WHERE c.checkClause = :checkClause"),
    @NamedQuery(name = "CheckConstraints_1.findByName", query = "SELECT c FROM CheckConstraints_1 c WHERE c.name = :name"),
    @NamedQuery(name = "CheckConstraints_1.findByObjectId", query = "SELECT c FROM CheckConstraints_1 c WHERE c.objectId = :objectId"),
    @NamedQuery(name = "CheckConstraints_1.findByPrincipalId", query = "SELECT c FROM CheckConstraints_1 c WHERE c.principalId = :principalId"),
    @NamedQuery(name = "CheckConstraints_1.findBySchemaId", query = "SELECT c FROM CheckConstraints_1 c WHERE c.schemaId = :schemaId"),
    @NamedQuery(name = "CheckConstraints_1.findByParentObjectId", query = "SELECT c FROM CheckConstraints_1 c WHERE c.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "CheckConstraints_1.findByType", query = "SELECT c FROM CheckConstraints_1 c WHERE c.type = :type"),
    @NamedQuery(name = "CheckConstraints_1.findByTypeDesc", query = "SELECT c FROM CheckConstraints_1 c WHERE c.typeDesc = :typeDesc"),
    @NamedQuery(name = "CheckConstraints_1.findByCreateDate", query = "SELECT c FROM CheckConstraints_1 c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "CheckConstraints_1.findByModifyDate", query = "SELECT c FROM CheckConstraints_1 c WHERE c.modifyDate = :modifyDate"),
    @NamedQuery(name = "CheckConstraints_1.findByIsMsShipped", query = "SELECT c FROM CheckConstraints_1 c WHERE c.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "CheckConstraints_1.findByIsPublished", query = "SELECT c FROM CheckConstraints_1 c WHERE c.isPublished = :isPublished"),
    @NamedQuery(name = "CheckConstraints_1.findByIsSchemaPublished", query = "SELECT c FROM CheckConstraints_1 c WHERE c.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "CheckConstraints_1.findByIsDisabled", query = "SELECT c FROM CheckConstraints_1 c WHERE c.isDisabled = :isDisabled"),
    @NamedQuery(name = "CheckConstraints_1.findByIsNotForReplication", query = "SELECT c FROM CheckConstraints_1 c WHERE c.isNotForReplication = :isNotForReplication"),
    @NamedQuery(name = "CheckConstraints_1.findByIsNotTrusted", query = "SELECT c FROM CheckConstraints_1 c WHERE c.isNotTrusted = :isNotTrusted"),
    @NamedQuery(name = "CheckConstraints_1.findByParentColumnId", query = "SELECT c FROM CheckConstraints_1 c WHERE c.parentColumnId = :parentColumnId"),
    @NamedQuery(name = "CheckConstraints_1.findByDefinition", query = "SELECT c FROM CheckConstraints_1 c WHERE c.definition = :definition"),
    @NamedQuery(name = "CheckConstraints_1.findByUsesDatabaseCollation", query = "SELECT c FROM CheckConstraints_1 c WHERE c.usesDatabaseCollation = :usesDatabaseCollation"),
    @NamedQuery(name = "CheckConstraints_1.findByIsSystemNamed", query = "SELECT c FROM CheckConstraints_1 c WHERE c.isSystemNamed = :isSystemNamed")})
public class CheckConstraints_1 implements Serializable, Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "CONSTRAINT_CATALOG")
    private String constraintCatalog;
    @Size(max = 128)
    @Column(name = "CONSTRAINT_SCHEMA")
    private String constraintSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;
    @Size(max = 4000)
    @Column(name = "CHECK_CLAUSE")
    private String checkClause;
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
    @Column(name = "is_not_for_replication")
    private boolean isNotForReplication;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_not_trusted")
    private boolean isNotTrusted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_column_id")
    private int parentColumnId;
    @Size(max = 2147483647)
    @Column(name = "definition")
    private String definition;
    @Column(name = "uses_database_collation")
    private Boolean usesDatabaseCollation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_system_named")
    private boolean isSystemNamed;

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "CONSTRAINT_CATALOG")
    private String constraintCatalog;
    @Size(max = 128)
    @Column(name = "CONSTRAINT_SCHEMA")
    private String constraintSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;
    @Size(max = 4000)
    @Column(name = "CHECK_CLAUSE")
    private String checkClause;
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
    @Column(name = "is_not_for_replication")
    private boolean isNotForReplication;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_not_trusted")
    private boolean isNotTrusted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_column_id")
    private int parentColumnId;
    @Size(max = 2147483647)
    @Column(name = "definition")
    private String definition;
    @Column(name = "uses_database_collation")
    private Boolean usesDatabaseCollation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_system_named")
    private boolean isSystemNamed;

    public CheckConstraints_1() {
    }

    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    public String getConstraintSchema() {
        return constraintSchema;
    }

    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getCheckClause() {
        return checkClause;
    }

    public void setCheckClause(String checkClause) {
        this.checkClause = checkClause;
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

    public int getParentColumnId() {
        return parentColumnId;
    }

    public void setParentColumnId(int parentColumnId) {
        this.parentColumnId = parentColumnId;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Boolean getUsesDatabaseCollation() {
        return usesDatabaseCollation;
    }

    public void setUsesDatabaseCollation(Boolean usesDatabaseCollation) {
        this.usesDatabaseCollation = usesDatabaseCollation;
    }

    public boolean getIsSystemNamed() {
        return isSystemNamed;
    }

    public void setIsSystemNamed(boolean isSystemNamed) {
        this.isSystemNamed = isSystemNamed;
    }

    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    public String getConstraintSchema() {
        return constraintSchema;
    }

    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getCheckClause() {
        return checkClause;
    }

    public void setCheckClause(String checkClause) {
        this.checkClause = checkClause;
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

    public int getParentColumnId() {
        return parentColumnId;
    }

    public void setParentColumnId(int parentColumnId) {
        this.parentColumnId = parentColumnId;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Boolean getUsesDatabaseCollation() {
        return usesDatabaseCollation;
    }

    public void setUsesDatabaseCollation(Boolean usesDatabaseCollation) {
        this.usesDatabaseCollation = usesDatabaseCollation;
    }

    public boolean getIsSystemNamed() {
        return isSystemNamed;
    }

    public void setIsSystemNamed(boolean isSystemNamed) {
        this.isSystemNamed = isSystemNamed;
    }
    
}
