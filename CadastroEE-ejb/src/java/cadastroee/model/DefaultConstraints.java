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
@Table(name = "default_constraints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DefaultConstraints.findAll", query = "SELECT d FROM DefaultConstraints d"),
    @NamedQuery(name = "DefaultConstraints.findByName", query = "SELECT d FROM DefaultConstraints d WHERE d.name = :name"),
    @NamedQuery(name = "DefaultConstraints.findByObjectId", query = "SELECT d FROM DefaultConstraints d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DefaultConstraints.findByPrincipalId", query = "SELECT d FROM DefaultConstraints d WHERE d.principalId = :principalId"),
    @NamedQuery(name = "DefaultConstraints.findBySchemaId", query = "SELECT d FROM DefaultConstraints d WHERE d.schemaId = :schemaId"),
    @NamedQuery(name = "DefaultConstraints.findByParentObjectId", query = "SELECT d FROM DefaultConstraints d WHERE d.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "DefaultConstraints.findByType", query = "SELECT d FROM DefaultConstraints d WHERE d.type = :type"),
    @NamedQuery(name = "DefaultConstraints.findByTypeDesc", query = "SELECT d FROM DefaultConstraints d WHERE d.typeDesc = :typeDesc"),
    @NamedQuery(name = "DefaultConstraints.findByCreateDate", query = "SELECT d FROM DefaultConstraints d WHERE d.createDate = :createDate"),
    @NamedQuery(name = "DefaultConstraints.findByModifyDate", query = "SELECT d FROM DefaultConstraints d WHERE d.modifyDate = :modifyDate"),
    @NamedQuery(name = "DefaultConstraints.findByIsMsShipped", query = "SELECT d FROM DefaultConstraints d WHERE d.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "DefaultConstraints.findByIsPublished", query = "SELECT d FROM DefaultConstraints d WHERE d.isPublished = :isPublished"),
    @NamedQuery(name = "DefaultConstraints.findByIsSchemaPublished", query = "SELECT d FROM DefaultConstraints d WHERE d.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "DefaultConstraints.findByParentColumnId", query = "SELECT d FROM DefaultConstraints d WHERE d.parentColumnId = :parentColumnId"),
    @NamedQuery(name = "DefaultConstraints.findByDefinition", query = "SELECT d FROM DefaultConstraints d WHERE d.definition = :definition"),
    @NamedQuery(name = "DefaultConstraints.findByIsSystemNamed", query = "SELECT d FROM DefaultConstraints d WHERE d.isSystemNamed = :isSystemNamed")})
public class DefaultConstraints implements Serializable {

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
    @Column(name = "parent_column_id")
    private int parentColumnId;
    @Size(max = 2147483647)
    @Column(name = "definition")
    private String definition;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_system_named")
    private boolean isSystemNamed;

    public DefaultConstraints() {
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

    public boolean getIsSystemNamed() {
        return isSystemNamed;
    }

    public void setIsSystemNamed(boolean isSystemNamed) {
        this.isSystemNamed = isSystemNamed;
    }
    
}
