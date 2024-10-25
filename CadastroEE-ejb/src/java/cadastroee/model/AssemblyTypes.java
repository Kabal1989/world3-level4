/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "assembly_types")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AssemblyTypes.findAll", query = "SELECT a FROM AssemblyTypes a"),
    @NamedQuery(name = "AssemblyTypes.findByName", query = "SELECT a FROM AssemblyTypes a WHERE a.name = :name"),
    @NamedQuery(name = "AssemblyTypes.findBySystemTypeId", query = "SELECT a FROM AssemblyTypes a WHERE a.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "AssemblyTypes.findByUserTypeId", query = "SELECT a FROM AssemblyTypes a WHERE a.userTypeId = :userTypeId"),
    @NamedQuery(name = "AssemblyTypes.findBySchemaId", query = "SELECT a FROM AssemblyTypes a WHERE a.schemaId = :schemaId"),
    @NamedQuery(name = "AssemblyTypes.findByPrincipalId", query = "SELECT a FROM AssemblyTypes a WHERE a.principalId = :principalId"),
    @NamedQuery(name = "AssemblyTypes.findByMaxLength", query = "SELECT a FROM AssemblyTypes a WHERE a.maxLength = :maxLength"),
    @NamedQuery(name = "AssemblyTypes.findByPrecision", query = "SELECT a FROM AssemblyTypes a WHERE a.precision = :precision"),
    @NamedQuery(name = "AssemblyTypes.findByScale", query = "SELECT a FROM AssemblyTypes a WHERE a.scale = :scale"),
    @NamedQuery(name = "AssemblyTypes.findByCollationName", query = "SELECT a FROM AssemblyTypes a WHERE a.collationName = :collationName"),
    @NamedQuery(name = "AssemblyTypes.findByIsNullable", query = "SELECT a FROM AssemblyTypes a WHERE a.isNullable = :isNullable"),
    @NamedQuery(name = "AssemblyTypes.findByIsUserDefined", query = "SELECT a FROM AssemblyTypes a WHERE a.isUserDefined = :isUserDefined"),
    @NamedQuery(name = "AssemblyTypes.findByIsAssemblyType", query = "SELECT a FROM AssemblyTypes a WHERE a.isAssemblyType = :isAssemblyType"),
    @NamedQuery(name = "AssemblyTypes.findByDefaultObjectId", query = "SELECT a FROM AssemblyTypes a WHERE a.defaultObjectId = :defaultObjectId"),
    @NamedQuery(name = "AssemblyTypes.findByRuleObjectId", query = "SELECT a FROM AssemblyTypes a WHERE a.ruleObjectId = :ruleObjectId"),
    @NamedQuery(name = "AssemblyTypes.findByAssemblyId", query = "SELECT a FROM AssemblyTypes a WHERE a.assemblyId = :assemblyId"),
    @NamedQuery(name = "AssemblyTypes.findByAssemblyClass", query = "SELECT a FROM AssemblyTypes a WHERE a.assemblyClass = :assemblyClass"),
    @NamedQuery(name = "AssemblyTypes.findByIsBinaryOrdered", query = "SELECT a FROM AssemblyTypes a WHERE a.isBinaryOrdered = :isBinaryOrdered"),
    @NamedQuery(name = "AssemblyTypes.findByIsFixedLength", query = "SELECT a FROM AssemblyTypes a WHERE a.isFixedLength = :isFixedLength"),
    @NamedQuery(name = "AssemblyTypes.findByProgId", query = "SELECT a FROM AssemblyTypes a WHERE a.progId = :progId"),
    @NamedQuery(name = "AssemblyTypes.findByAssemblyQualifiedName", query = "SELECT a FROM AssemblyTypes a WHERE a.assemblyQualifiedName = :assemblyQualifiedName"),
    @NamedQuery(name = "AssemblyTypes.findByIsTableType", query = "SELECT a FROM AssemblyTypes a WHERE a.isTableType = :isTableType")})
public class AssemblyTypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_type_id")
    private short systemTypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_type_id")
    private int userTypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "schema_id")
    private int schemaId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_length")
    private short maxLength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precision")
    private short precision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scale")
    private short scale;
    @Size(max = 128)
    @Column(name = "collation_name")
    private String collationName;
    @Column(name = "is_nullable")
    private Boolean isNullable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_user_defined")
    private boolean isUserDefined;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_assembly_type")
    private boolean isAssemblyType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "default_object_id")
    private int defaultObjectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rule_object_id")
    private int ruleObjectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "assembly_id")
    private int assemblyId;
    @Size(max = 128)
    @Column(name = "assembly_class")
    private String assemblyClass;
    @Column(name = "is_binary_ordered")
    private Boolean isBinaryOrdered;
    @Column(name = "is_fixed_length")
    private Boolean isFixedLength;
    @Size(max = 40)
    @Column(name = "prog_id")
    private String progId;
    @Size(max = 4000)
    @Column(name = "assembly_qualified_name")
    private String assemblyQualifiedName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_table_type")
    private boolean isTableType;

    public AssemblyTypes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getSystemTypeId() {
        return systemTypeId;
    }

    public void setSystemTypeId(short systemTypeId) {
        this.systemTypeId = systemTypeId;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public int getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(int schemaId) {
        this.schemaId = schemaId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public short getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(short maxLength) {
        this.maxLength = maxLength;
    }

    public short getPrecision() {
        return precision;
    }

    public void setPrecision(short precision) {
        this.precision = precision;
    }

    public short getScale() {
        return scale;
    }

    public void setScale(short scale) {
        this.scale = scale;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    public Boolean getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(Boolean isNullable) {
        this.isNullable = isNullable;
    }

    public boolean getIsUserDefined() {
        return isUserDefined;
    }

    public void setIsUserDefined(boolean isUserDefined) {
        this.isUserDefined = isUserDefined;
    }

    public boolean getIsAssemblyType() {
        return isAssemblyType;
    }

    public void setIsAssemblyType(boolean isAssemblyType) {
        this.isAssemblyType = isAssemblyType;
    }

    public int getDefaultObjectId() {
        return defaultObjectId;
    }

    public void setDefaultObjectId(int defaultObjectId) {
        this.defaultObjectId = defaultObjectId;
    }

    public int getRuleObjectId() {
        return ruleObjectId;
    }

    public void setRuleObjectId(int ruleObjectId) {
        this.ruleObjectId = ruleObjectId;
    }

    public int getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(int assemblyId) {
        this.assemblyId = assemblyId;
    }

    public String getAssemblyClass() {
        return assemblyClass;
    }

    public void setAssemblyClass(String assemblyClass) {
        this.assemblyClass = assemblyClass;
    }

    public Boolean getIsBinaryOrdered() {
        return isBinaryOrdered;
    }

    public void setIsBinaryOrdered(Boolean isBinaryOrdered) {
        this.isBinaryOrdered = isBinaryOrdered;
    }

    public Boolean getIsFixedLength() {
        return isFixedLength;
    }

    public void setIsFixedLength(Boolean isFixedLength) {
        this.isFixedLength = isFixedLength;
    }

    public String getProgId() {
        return progId;
    }

    public void setProgId(String progId) {
        this.progId = progId;
    }

    public String getAssemblyQualifiedName() {
        return assemblyQualifiedName;
    }

    public void setAssemblyQualifiedName(String assemblyQualifiedName) {
        this.assemblyQualifiedName = assemblyQualifiedName;
    }

    public boolean getIsTableType() {
        return isTableType;
    }

    public void setIsTableType(boolean isTableType) {
        this.isTableType = isTableType;
    }
    
}
