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
@Table(name = "types")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Types.findAll", query = "SELECT t FROM Types t"),
    @NamedQuery(name = "Types.findByName", query = "SELECT t FROM Types t WHERE t.name = :name"),
    @NamedQuery(name = "Types.findBySystemTypeId", query = "SELECT t FROM Types t WHERE t.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "Types.findByUserTypeId", query = "SELECT t FROM Types t WHERE t.userTypeId = :userTypeId"),
    @NamedQuery(name = "Types.findBySchemaId", query = "SELECT t FROM Types t WHERE t.schemaId = :schemaId"),
    @NamedQuery(name = "Types.findByPrincipalId", query = "SELECT t FROM Types t WHERE t.principalId = :principalId"),
    @NamedQuery(name = "Types.findByMaxLength", query = "SELECT t FROM Types t WHERE t.maxLength = :maxLength"),
    @NamedQuery(name = "Types.findByPrecision", query = "SELECT t FROM Types t WHERE t.precision = :precision"),
    @NamedQuery(name = "Types.findByScale", query = "SELECT t FROM Types t WHERE t.scale = :scale"),
    @NamedQuery(name = "Types.findByCollationName", query = "SELECT t FROM Types t WHERE t.collationName = :collationName"),
    @NamedQuery(name = "Types.findByIsNullable", query = "SELECT t FROM Types t WHERE t.isNullable = :isNullable"),
    @NamedQuery(name = "Types.findByIsUserDefined", query = "SELECT t FROM Types t WHERE t.isUserDefined = :isUserDefined"),
    @NamedQuery(name = "Types.findByIsAssemblyType", query = "SELECT t FROM Types t WHERE t.isAssemblyType = :isAssemblyType"),
    @NamedQuery(name = "Types.findByDefaultObjectId", query = "SELECT t FROM Types t WHERE t.defaultObjectId = :defaultObjectId"),
    @NamedQuery(name = "Types.findByRuleObjectId", query = "SELECT t FROM Types t WHERE t.ruleObjectId = :ruleObjectId"),
    @NamedQuery(name = "Types.findByIsTableType", query = "SELECT t FROM Types t WHERE t.isTableType = :isTableType")})
public class Types implements Serializable {

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

    public Types() {
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
    
}
