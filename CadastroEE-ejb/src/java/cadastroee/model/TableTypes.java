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
@Table(name = "table_types")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TableTypes.findAll", query = "SELECT t FROM TableTypes t"),
    @NamedQuery(name = "TableTypes.findByName", query = "SELECT t FROM TableTypes t WHERE t.name = :name"),
    @NamedQuery(name = "TableTypes.findBySystemTypeId", query = "SELECT t FROM TableTypes t WHERE t.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "TableTypes.findByUserTypeId", query = "SELECT t FROM TableTypes t WHERE t.userTypeId = :userTypeId"),
    @NamedQuery(name = "TableTypes.findBySchemaId", query = "SELECT t FROM TableTypes t WHERE t.schemaId = :schemaId"),
    @NamedQuery(name = "TableTypes.findByPrincipalId", query = "SELECT t FROM TableTypes t WHERE t.principalId = :principalId"),
    @NamedQuery(name = "TableTypes.findByMaxLength", query = "SELECT t FROM TableTypes t WHERE t.maxLength = :maxLength"),
    @NamedQuery(name = "TableTypes.findByPrecision", query = "SELECT t FROM TableTypes t WHERE t.precision = :precision"),
    @NamedQuery(name = "TableTypes.findByScale", query = "SELECT t FROM TableTypes t WHERE t.scale = :scale"),
    @NamedQuery(name = "TableTypes.findByCollationName", query = "SELECT t FROM TableTypes t WHERE t.collationName = :collationName"),
    @NamedQuery(name = "TableTypes.findByIsNullable", query = "SELECT t FROM TableTypes t WHERE t.isNullable = :isNullable"),
    @NamedQuery(name = "TableTypes.findByIsUserDefined", query = "SELECT t FROM TableTypes t WHERE t.isUserDefined = :isUserDefined"),
    @NamedQuery(name = "TableTypes.findByIsAssemblyType", query = "SELECT t FROM TableTypes t WHERE t.isAssemblyType = :isAssemblyType"),
    @NamedQuery(name = "TableTypes.findByDefaultObjectId", query = "SELECT t FROM TableTypes t WHERE t.defaultObjectId = :defaultObjectId"),
    @NamedQuery(name = "TableTypes.findByRuleObjectId", query = "SELECT t FROM TableTypes t WHERE t.ruleObjectId = :ruleObjectId"),
    @NamedQuery(name = "TableTypes.findByIsTableType", query = "SELECT t FROM TableTypes t WHERE t.isTableType = :isTableType"),
    @NamedQuery(name = "TableTypes.findByTypeTableObjectId", query = "SELECT t FROM TableTypes t WHERE t.typeTableObjectId = :typeTableObjectId"),
    @NamedQuery(name = "TableTypes.findByIsMemoryOptimized", query = "SELECT t FROM TableTypes t WHERE t.isMemoryOptimized = :isMemoryOptimized")})
public class TableTypes implements Serializable {

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
    @Column(name = "is_table_type")
    private boolean isTableType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type_table_object_id")
    private int typeTableObjectId;
    @Column(name = "is_memory_optimized")
    private Boolean isMemoryOptimized;

    public TableTypes() {
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

    public boolean getIsTableType() {
        return isTableType;
    }

    public void setIsTableType(boolean isTableType) {
        this.isTableType = isTableType;
    }

    public int getTypeTableObjectId() {
        return typeTableObjectId;
    }

    public void setTypeTableObjectId(int typeTableObjectId) {
        this.typeTableObjectId = typeTableObjectId;
    }

    public Boolean getIsMemoryOptimized() {
        return isMemoryOptimized;
    }

    public void setIsMemoryOptimized(Boolean isMemoryOptimized) {
        this.isMemoryOptimized = isMemoryOptimized;
    }
    
}
