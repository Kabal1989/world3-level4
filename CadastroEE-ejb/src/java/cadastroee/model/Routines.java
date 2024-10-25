/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "ROUTINES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Routines.findAll", query = "SELECT r FROM Routines r"),
    @NamedQuery(name = "Routines.findBySpecificCatalog", query = "SELECT r FROM Routines r WHERE r.specificCatalog = :specificCatalog"),
    @NamedQuery(name = "Routines.findBySpecificSchema", query = "SELECT r FROM Routines r WHERE r.specificSchema = :specificSchema"),
    @NamedQuery(name = "Routines.findBySpecificName", query = "SELECT r FROM Routines r WHERE r.specificName = :specificName"),
    @NamedQuery(name = "Routines.findByRoutineCatalog", query = "SELECT r FROM Routines r WHERE r.routineCatalog = :routineCatalog"),
    @NamedQuery(name = "Routines.findByRoutineSchema", query = "SELECT r FROM Routines r WHERE r.routineSchema = :routineSchema"),
    @NamedQuery(name = "Routines.findByRoutineName", query = "SELECT r FROM Routines r WHERE r.routineName = :routineName"),
    @NamedQuery(name = "Routines.findByRoutineType", query = "SELECT r FROM Routines r WHERE r.routineType = :routineType"),
    @NamedQuery(name = "Routines.findByModuleCatalog", query = "SELECT r FROM Routines r WHERE r.moduleCatalog = :moduleCatalog"),
    @NamedQuery(name = "Routines.findByModuleSchema", query = "SELECT r FROM Routines r WHERE r.moduleSchema = :moduleSchema"),
    @NamedQuery(name = "Routines.findByModuleName", query = "SELECT r FROM Routines r WHERE r.moduleName = :moduleName"),
    @NamedQuery(name = "Routines.findByUdtCatalog", query = "SELECT r FROM Routines r WHERE r.udtCatalog = :udtCatalog"),
    @NamedQuery(name = "Routines.findByUdtSchema", query = "SELECT r FROM Routines r WHERE r.udtSchema = :udtSchema"),
    @NamedQuery(name = "Routines.findByUdtName", query = "SELECT r FROM Routines r WHERE r.udtName = :udtName"),
    @NamedQuery(name = "Routines.findByDataType", query = "SELECT r FROM Routines r WHERE r.dataType = :dataType"),
    @NamedQuery(name = "Routines.findByCharacterMaximumLength", query = "SELECT r FROM Routines r WHERE r.characterMaximumLength = :characterMaximumLength"),
    @NamedQuery(name = "Routines.findByCharacterOctetLength", query = "SELECT r FROM Routines r WHERE r.characterOctetLength = :characterOctetLength"),
    @NamedQuery(name = "Routines.findByCollationCatalog", query = "SELECT r FROM Routines r WHERE r.collationCatalog = :collationCatalog"),
    @NamedQuery(name = "Routines.findByCollationSchema", query = "SELECT r FROM Routines r WHERE r.collationSchema = :collationSchema"),
    @NamedQuery(name = "Routines.findByCollationName", query = "SELECT r FROM Routines r WHERE r.collationName = :collationName"),
    @NamedQuery(name = "Routines.findByCharacterSetCatalog", query = "SELECT r FROM Routines r WHERE r.characterSetCatalog = :characterSetCatalog"),
    @NamedQuery(name = "Routines.findByCharacterSetSchema", query = "SELECT r FROM Routines r WHERE r.characterSetSchema = :characterSetSchema"),
    @NamedQuery(name = "Routines.findByCharacterSetName", query = "SELECT r FROM Routines r WHERE r.characterSetName = :characterSetName"),
    @NamedQuery(name = "Routines.findByNumericPrecision", query = "SELECT r FROM Routines r WHERE r.numericPrecision = :numericPrecision"),
    @NamedQuery(name = "Routines.findByNumericPrecisionRadix", query = "SELECT r FROM Routines r WHERE r.numericPrecisionRadix = :numericPrecisionRadix"),
    @NamedQuery(name = "Routines.findByNumericScale", query = "SELECT r FROM Routines r WHERE r.numericScale = :numericScale"),
    @NamedQuery(name = "Routines.findByDatetimePrecision", query = "SELECT r FROM Routines r WHERE r.datetimePrecision = :datetimePrecision"),
    @NamedQuery(name = "Routines.findByIntervalType", query = "SELECT r FROM Routines r WHERE r.intervalType = :intervalType"),
    @NamedQuery(name = "Routines.findByIntervalPrecision", query = "SELECT r FROM Routines r WHERE r.intervalPrecision = :intervalPrecision"),
    @NamedQuery(name = "Routines.findByTypeUdtCatalog", query = "SELECT r FROM Routines r WHERE r.typeUdtCatalog = :typeUdtCatalog"),
    @NamedQuery(name = "Routines.findByTypeUdtSchema", query = "SELECT r FROM Routines r WHERE r.typeUdtSchema = :typeUdtSchema"),
    @NamedQuery(name = "Routines.findByTypeUdtName", query = "SELECT r FROM Routines r WHERE r.typeUdtName = :typeUdtName"),
    @NamedQuery(name = "Routines.findByScopeCatalog", query = "SELECT r FROM Routines r WHERE r.scopeCatalog = :scopeCatalog"),
    @NamedQuery(name = "Routines.findByScopeSchema", query = "SELECT r FROM Routines r WHERE r.scopeSchema = :scopeSchema"),
    @NamedQuery(name = "Routines.findByScopeName", query = "SELECT r FROM Routines r WHERE r.scopeName = :scopeName"),
    @NamedQuery(name = "Routines.findByMaximumCardinality", query = "SELECT r FROM Routines r WHERE r.maximumCardinality = :maximumCardinality"),
    @NamedQuery(name = "Routines.findByDtdIdentifier", query = "SELECT r FROM Routines r WHERE r.dtdIdentifier = :dtdIdentifier"),
    @NamedQuery(name = "Routines.findByRoutineBody", query = "SELECT r FROM Routines r WHERE r.routineBody = :routineBody"),
    @NamedQuery(name = "Routines.findByRoutineDefinition", query = "SELECT r FROM Routines r WHERE r.routineDefinition = :routineDefinition"),
    @NamedQuery(name = "Routines.findByExternalName", query = "SELECT r FROM Routines r WHERE r.externalName = :externalName"),
    @NamedQuery(name = "Routines.findByExternalLanguage", query = "SELECT r FROM Routines r WHERE r.externalLanguage = :externalLanguage"),
    @NamedQuery(name = "Routines.findByParameterStyle", query = "SELECT r FROM Routines r WHERE r.parameterStyle = :parameterStyle"),
    @NamedQuery(name = "Routines.findByIsDeterministic", query = "SELECT r FROM Routines r WHERE r.isDeterministic = :isDeterministic"),
    @NamedQuery(name = "Routines.findBySqlDataAccess", query = "SELECT r FROM Routines r WHERE r.sqlDataAccess = :sqlDataAccess"),
    @NamedQuery(name = "Routines.findByIsNullCall", query = "SELECT r FROM Routines r WHERE r.isNullCall = :isNullCall"),
    @NamedQuery(name = "Routines.findBySqlPath", query = "SELECT r FROM Routines r WHERE r.sqlPath = :sqlPath"),
    @NamedQuery(name = "Routines.findBySchemaLevelRoutine", query = "SELECT r FROM Routines r WHERE r.schemaLevelRoutine = :schemaLevelRoutine"),
    @NamedQuery(name = "Routines.findByMaxDynamicResultSets", query = "SELECT r FROM Routines r WHERE r.maxDynamicResultSets = :maxDynamicResultSets"),
    @NamedQuery(name = "Routines.findByIsUserDefinedCast", query = "SELECT r FROM Routines r WHERE r.isUserDefinedCast = :isUserDefinedCast"),
    @NamedQuery(name = "Routines.findByIsImplicitlyInvocable", query = "SELECT r FROM Routines r WHERE r.isImplicitlyInvocable = :isImplicitlyInvocable"),
    @NamedQuery(name = "Routines.findByCreated", query = "SELECT r FROM Routines r WHERE r.created = :created"),
    @NamedQuery(name = "Routines.findByLastAltered", query = "SELECT r FROM Routines r WHERE r.lastAltered = :lastAltered")})
public class Routines implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "SPECIFIC_CATALOG")
    private String specificCatalog;
    @Size(max = 128)
    @Column(name = "SPECIFIC_SCHEMA")
    private String specificSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "SPECIFIC_NAME")
    private String specificName;
    @Size(max = 128)
    @Column(name = "ROUTINE_CATALOG")
    private String routineCatalog;
    @Size(max = 128)
    @Column(name = "ROUTINE_SCHEMA")
    private String routineSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "ROUTINE_NAME")
    private String routineName;
    @Size(max = 20)
    @Column(name = "ROUTINE_TYPE")
    private String routineType;
    @Size(max = 128)
    @Column(name = "MODULE_CATALOG")
    private String moduleCatalog;
    @Size(max = 128)
    @Column(name = "MODULE_SCHEMA")
    private String moduleSchema;
    @Size(max = 128)
    @Column(name = "MODULE_NAME")
    private String moduleName;
    @Size(max = 128)
    @Column(name = "UDT_CATALOG")
    private String udtCatalog;
    @Size(max = 128)
    @Column(name = "UDT_SCHEMA")
    private String udtSchema;
    @Size(max = 128)
    @Column(name = "UDT_NAME")
    private String udtName;
    @Size(max = 128)
    @Column(name = "DATA_TYPE")
    private String dataType;
    @Column(name = "CHARACTER_MAXIMUM_LENGTH")
    private Integer characterMaximumLength;
    @Column(name = "CHARACTER_OCTET_LENGTH")
    private Integer characterOctetLength;
    @Size(max = 128)
    @Column(name = "COLLATION_CATALOG")
    private String collationCatalog;
    @Size(max = 128)
    @Column(name = "COLLATION_SCHEMA")
    private String collationSchema;
    @Size(max = 128)
    @Column(name = "COLLATION_NAME")
    private String collationName;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_CATALOG")
    private String characterSetCatalog;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_SCHEMA")
    private String characterSetSchema;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;
    @Column(name = "NUMERIC_PRECISION")
    private Short numericPrecision;
    @Column(name = "NUMERIC_PRECISION_RADIX")
    private Short numericPrecisionRadix;
    @Column(name = "NUMERIC_SCALE")
    private Integer numericScale;
    @Column(name = "DATETIME_PRECISION")
    private Short datetimePrecision;
    @Size(max = 30)
    @Column(name = "INTERVAL_TYPE")
    private String intervalType;
    @Column(name = "INTERVAL_PRECISION")
    private Short intervalPrecision;
    @Size(max = 128)
    @Column(name = "TYPE_UDT_CATALOG")
    private String typeUdtCatalog;
    @Size(max = 128)
    @Column(name = "TYPE_UDT_SCHEMA")
    private String typeUdtSchema;
    @Size(max = 128)
    @Column(name = "TYPE_UDT_NAME")
    private String typeUdtName;
    @Size(max = 128)
    @Column(name = "SCOPE_CATALOG")
    private String scopeCatalog;
    @Size(max = 128)
    @Column(name = "SCOPE_SCHEMA")
    private String scopeSchema;
    @Size(max = 128)
    @Column(name = "SCOPE_NAME")
    private String scopeName;
    @Column(name = "MAXIMUM_CARDINALITY")
    private BigInteger maximumCardinality;
    @Size(max = 128)
    @Column(name = "DTD_IDENTIFIER")
    private String dtdIdentifier;
    @Size(max = 30)
    @Column(name = "ROUTINE_BODY")
    private String routineBody;
    @Size(max = 4000)
    @Column(name = "ROUTINE_DEFINITION")
    private String routineDefinition;
    @Size(max = 128)
    @Column(name = "EXTERNAL_NAME")
    private String externalName;
    @Size(max = 30)
    @Column(name = "EXTERNAL_LANGUAGE")
    private String externalLanguage;
    @Size(max = 30)
    @Column(name = "PARAMETER_STYLE")
    private String parameterStyle;
    @Size(max = 10)
    @Column(name = "IS_DETERMINISTIC")
    private String isDeterministic;
    @Size(max = 30)
    @Column(name = "SQL_DATA_ACCESS")
    private String sqlDataAccess;
    @Size(max = 10)
    @Column(name = "IS_NULL_CALL")
    private String isNullCall;
    @Size(max = 128)
    @Column(name = "SQL_PATH")
    private String sqlPath;
    @Size(max = 10)
    @Column(name = "SCHEMA_LEVEL_ROUTINE")
    private String schemaLevelRoutine;
    @Column(name = "MAX_DYNAMIC_RESULT_SETS")
    private Short maxDynamicResultSets;
    @Size(max = 10)
    @Column(name = "IS_USER_DEFINED_CAST")
    private String isUserDefinedCast;
    @Size(max = 10)
    @Column(name = "IS_IMPLICITLY_INVOCABLE")
    private String isImplicitlyInvocable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LAST_ALTERED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastAltered;

    public Routines() {
    }

    public String getSpecificCatalog() {
        return specificCatalog;
    }

    public void setSpecificCatalog(String specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    public String getSpecificSchema() {
        return specificSchema;
    }

    public void setSpecificSchema(String specificSchema) {
        this.specificSchema = specificSchema;
    }

    public String getSpecificName() {
        return specificName;
    }

    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    public String getRoutineCatalog() {
        return routineCatalog;
    }

    public void setRoutineCatalog(String routineCatalog) {
        this.routineCatalog = routineCatalog;
    }

    public String getRoutineSchema() {
        return routineSchema;
    }

    public void setRoutineSchema(String routineSchema) {
        this.routineSchema = routineSchema;
    }

    public String getRoutineName() {
        return routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    public String getRoutineType() {
        return routineType;
    }

    public void setRoutineType(String routineType) {
        this.routineType = routineType;
    }

    public String getModuleCatalog() {
        return moduleCatalog;
    }

    public void setModuleCatalog(String moduleCatalog) {
        this.moduleCatalog = moduleCatalog;
    }

    public String getModuleSchema() {
        return moduleSchema;
    }

    public void setModuleSchema(String moduleSchema) {
        this.moduleSchema = moduleSchema;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getUdtCatalog() {
        return udtCatalog;
    }

    public void setUdtCatalog(String udtCatalog) {
        this.udtCatalog = udtCatalog;
    }

    public String getUdtSchema() {
        return udtSchema;
    }

    public void setUdtSchema(String udtSchema) {
        this.udtSchema = udtSchema;
    }

    public String getUdtName() {
        return udtName;
    }

    public void setUdtName(String udtName) {
        this.udtName = udtName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getCharacterMaximumLength() {
        return characterMaximumLength;
    }

    public void setCharacterMaximumLength(Integer characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    public Integer getCharacterOctetLength() {
        return characterOctetLength;
    }

    public void setCharacterOctetLength(Integer characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    public String getCollationCatalog() {
        return collationCatalog;
    }

    public void setCollationCatalog(String collationCatalog) {
        this.collationCatalog = collationCatalog;
    }

    public String getCollationSchema() {
        return collationSchema;
    }

    public void setCollationSchema(String collationSchema) {
        this.collationSchema = collationSchema;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    public String getCharacterSetCatalog() {
        return characterSetCatalog;
    }

    public void setCharacterSetCatalog(String characterSetCatalog) {
        this.characterSetCatalog = characterSetCatalog;
    }

    public String getCharacterSetSchema() {
        return characterSetSchema;
    }

    public void setCharacterSetSchema(String characterSetSchema) {
        this.characterSetSchema = characterSetSchema;
    }

    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public Short getNumericPrecision() {
        return numericPrecision;
    }

    public void setNumericPrecision(Short numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    public Short getNumericPrecisionRadix() {
        return numericPrecisionRadix;
    }

    public void setNumericPrecisionRadix(Short numericPrecisionRadix) {
        this.numericPrecisionRadix = numericPrecisionRadix;
    }

    public Integer getNumericScale() {
        return numericScale;
    }

    public void setNumericScale(Integer numericScale) {
        this.numericScale = numericScale;
    }

    public Short getDatetimePrecision() {
        return datetimePrecision;
    }

    public void setDatetimePrecision(Short datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    public String getIntervalType() {
        return intervalType;
    }

    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType;
    }

    public Short getIntervalPrecision() {
        return intervalPrecision;
    }

    public void setIntervalPrecision(Short intervalPrecision) {
        this.intervalPrecision = intervalPrecision;
    }

    public String getTypeUdtCatalog() {
        return typeUdtCatalog;
    }

    public void setTypeUdtCatalog(String typeUdtCatalog) {
        this.typeUdtCatalog = typeUdtCatalog;
    }

    public String getTypeUdtSchema() {
        return typeUdtSchema;
    }

    public void setTypeUdtSchema(String typeUdtSchema) {
        this.typeUdtSchema = typeUdtSchema;
    }

    public String getTypeUdtName() {
        return typeUdtName;
    }

    public void setTypeUdtName(String typeUdtName) {
        this.typeUdtName = typeUdtName;
    }

    public String getScopeCatalog() {
        return scopeCatalog;
    }

    public void setScopeCatalog(String scopeCatalog) {
        this.scopeCatalog = scopeCatalog;
    }

    public String getScopeSchema() {
        return scopeSchema;
    }

    public void setScopeSchema(String scopeSchema) {
        this.scopeSchema = scopeSchema;
    }

    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    public BigInteger getMaximumCardinality() {
        return maximumCardinality;
    }

    public void setMaximumCardinality(BigInteger maximumCardinality) {
        this.maximumCardinality = maximumCardinality;
    }

    public String getDtdIdentifier() {
        return dtdIdentifier;
    }

    public void setDtdIdentifier(String dtdIdentifier) {
        this.dtdIdentifier = dtdIdentifier;
    }

    public String getRoutineBody() {
        return routineBody;
    }

    public void setRoutineBody(String routineBody) {
        this.routineBody = routineBody;
    }

    public String getRoutineDefinition() {
        return routineDefinition;
    }

    public void setRoutineDefinition(String routineDefinition) {
        this.routineDefinition = routineDefinition;
    }

    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName;
    }

    public String getExternalLanguage() {
        return externalLanguage;
    }

    public void setExternalLanguage(String externalLanguage) {
        this.externalLanguage = externalLanguage;
    }

    public String getParameterStyle() {
        return parameterStyle;
    }

    public void setParameterStyle(String parameterStyle) {
        this.parameterStyle = parameterStyle;
    }

    public String getIsDeterministic() {
        return isDeterministic;
    }

    public void setIsDeterministic(String isDeterministic) {
        this.isDeterministic = isDeterministic;
    }

    public String getSqlDataAccess() {
        return sqlDataAccess;
    }

    public void setSqlDataAccess(String sqlDataAccess) {
        this.sqlDataAccess = sqlDataAccess;
    }

    public String getIsNullCall() {
        return isNullCall;
    }

    public void setIsNullCall(String isNullCall) {
        this.isNullCall = isNullCall;
    }

    public String getSqlPath() {
        return sqlPath;
    }

    public void setSqlPath(String sqlPath) {
        this.sqlPath = sqlPath;
    }

    public String getSchemaLevelRoutine() {
        return schemaLevelRoutine;
    }

    public void setSchemaLevelRoutine(String schemaLevelRoutine) {
        this.schemaLevelRoutine = schemaLevelRoutine;
    }

    public Short getMaxDynamicResultSets() {
        return maxDynamicResultSets;
    }

    public void setMaxDynamicResultSets(Short maxDynamicResultSets) {
        this.maxDynamicResultSets = maxDynamicResultSets;
    }

    public String getIsUserDefinedCast() {
        return isUserDefinedCast;
    }

    public void setIsUserDefinedCast(String isUserDefinedCast) {
        this.isUserDefinedCast = isUserDefinedCast;
    }

    public String getIsImplicitlyInvocable() {
        return isImplicitlyInvocable;
    }

    public void setIsImplicitlyInvocable(String isImplicitlyInvocable) {
        this.isImplicitlyInvocable = isImplicitlyInvocable;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastAltered() {
        return lastAltered;
    }

    public void setLastAltered(Date lastAltered) {
        this.lastAltered = lastAltered;
    }
    
}
