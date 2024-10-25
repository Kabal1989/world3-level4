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
@Table(name = "sequences")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sequences_1.findAll", query = "SELECT s FROM Sequences_1 s"),
    @NamedQuery(name = "Sequences_1.findBySequenceCatalog", query = "SELECT s FROM Sequences_1 s WHERE s.sequenceCatalog = :sequenceCatalog"),
    @NamedQuery(name = "Sequences_1.findBySequenceSchema", query = "SELECT s FROM Sequences_1 s WHERE s.sequenceSchema = :sequenceSchema"),
    @NamedQuery(name = "Sequences_1.findBySequenceName", query = "SELECT s FROM Sequences_1 s WHERE s.sequenceName = :sequenceName"),
    @NamedQuery(name = "Sequences_1.findByDataType", query = "SELECT s FROM Sequences_1 s WHERE s.dataType = :dataType"),
    @NamedQuery(name = "Sequences_1.findByNumericPrecision", query = "SELECT s FROM Sequences_1 s WHERE s.numericPrecision = :numericPrecision"),
    @NamedQuery(name = "Sequences_1.findByNumericPrecisionRadix", query = "SELECT s FROM Sequences_1 s WHERE s.numericPrecisionRadix = :numericPrecisionRadix"),
    @NamedQuery(name = "Sequences_1.findByNumericScale", query = "SELECT s FROM Sequences_1 s WHERE s.numericScale = :numericScale"),
    @NamedQuery(name = "Sequences_1.findByStartValue", query = "SELECT s FROM Sequences_1 s WHERE s.startValue = :startValue"),
    @NamedQuery(name = "Sequences_1.findByMinimumValue", query = "SELECT s FROM Sequences_1 s WHERE s.minimumValue = :minimumValue"),
    @NamedQuery(name = "Sequences_1.findByMaximumValue", query = "SELECT s FROM Sequences_1 s WHERE s.maximumValue = :maximumValue"),
    @NamedQuery(name = "Sequences_1.findByIncrement", query = "SELECT s FROM Sequences_1 s WHERE s.increment = :increment"),
    @NamedQuery(name = "Sequences_1.findByCycleOption", query = "SELECT s FROM Sequences_1 s WHERE s.cycleOption = :cycleOption"),
    @NamedQuery(name = "Sequences_1.findByDeclaredDataType", query = "SELECT s FROM Sequences_1 s WHERE s.declaredDataType = :declaredDataType"),
    @NamedQuery(name = "Sequences_1.findByDeclaredNumericPrecision", query = "SELECT s FROM Sequences_1 s WHERE s.declaredNumericPrecision = :declaredNumericPrecision"),
    @NamedQuery(name = "Sequences_1.findByDeclaredNumericScale", query = "SELECT s FROM Sequences_1 s WHERE s.declaredNumericScale = :declaredNumericScale"),
    @NamedQuery(name = "Sequences_1.findByName", query = "SELECT s FROM Sequences_1 s WHERE s.name = :name"),
    @NamedQuery(name = "Sequences_1.findByObjectId", query = "SELECT s FROM Sequences_1 s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "Sequences_1.findByPrincipalId", query = "SELECT s FROM Sequences_1 s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "Sequences_1.findBySchemaId", query = "SELECT s FROM Sequences_1 s WHERE s.schemaId = :schemaId"),
    @NamedQuery(name = "Sequences_1.findByParentObjectId", query = "SELECT s FROM Sequences_1 s WHERE s.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "Sequences_1.findByType", query = "SELECT s FROM Sequences_1 s WHERE s.type = :type"),
    @NamedQuery(name = "Sequences_1.findByTypeDesc", query = "SELECT s FROM Sequences_1 s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "Sequences_1.findByCreateDate", query = "SELECT s FROM Sequences_1 s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "Sequences_1.findByModifyDate", query = "SELECT s FROM Sequences_1 s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "Sequences_1.findByIsMsShipped", query = "SELECT s FROM Sequences_1 s WHERE s.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "Sequences_1.findByIsPublished", query = "SELECT s FROM Sequences_1 s WHERE s.isPublished = :isPublished"),
    @NamedQuery(name = "Sequences_1.findByIsSchemaPublished", query = "SELECT s FROM Sequences_1 s WHERE s.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "Sequences_1.findByStartValue1", query = "SELECT s FROM Sequences_1 s WHERE s.startValue1 = :startValue1"),
    @NamedQuery(name = "Sequences_1.findByIncrement1", query = "SELECT s FROM Sequences_1 s WHERE s.increment1 = :increment1"),
    @NamedQuery(name = "Sequences_1.findByMinimumValue1", query = "SELECT s FROM Sequences_1 s WHERE s.minimumValue1 = :minimumValue1"),
    @NamedQuery(name = "Sequences_1.findByMaximumValue1", query = "SELECT s FROM Sequences_1 s WHERE s.maximumValue1 = :maximumValue1"),
    @NamedQuery(name = "Sequences_1.findByIsCycling", query = "SELECT s FROM Sequences_1 s WHERE s.isCycling = :isCycling"),
    @NamedQuery(name = "Sequences_1.findByIsCached", query = "SELECT s FROM Sequences_1 s WHERE s.isCached = :isCached"),
    @NamedQuery(name = "Sequences_1.findByCacheSize", query = "SELECT s FROM Sequences_1 s WHERE s.cacheSize = :cacheSize"),
    @NamedQuery(name = "Sequences_1.findBySystemTypeId", query = "SELECT s FROM Sequences_1 s WHERE s.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "Sequences_1.findByUserTypeId", query = "SELECT s FROM Sequences_1 s WHERE s.userTypeId = :userTypeId"),
    @NamedQuery(name = "Sequences_1.findByPrecision", query = "SELECT s FROM Sequences_1 s WHERE s.precision = :precision"),
    @NamedQuery(name = "Sequences_1.findByScale", query = "SELECT s FROM Sequences_1 s WHERE s.scale = :scale"),
    @NamedQuery(name = "Sequences_1.findByCurrentValue", query = "SELECT s FROM Sequences_1 s WHERE s.currentValue = :currentValue"),
    @NamedQuery(name = "Sequences_1.findByIsExhausted", query = "SELECT s FROM Sequences_1 s WHERE s.isExhausted = :isExhausted"),
    @NamedQuery(name = "Sequences_1.findByLastUsedValue", query = "SELECT s FROM Sequences_1 s WHERE s.lastUsedValue = :lastUsedValue")})
@Entity
@Table(name = "SEQUENCES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sequences_1.findAll", query = "SELECT s FROM Sequences_1 s"),
    @NamedQuery(name = "Sequences_1.findBySequenceCatalog", query = "SELECT s FROM Sequences_1 s WHERE s.sequenceCatalog = :sequenceCatalog"),
    @NamedQuery(name = "Sequences_1.findBySequenceSchema", query = "SELECT s FROM Sequences_1 s WHERE s.sequenceSchema = :sequenceSchema"),
    @NamedQuery(name = "Sequences_1.findBySequenceName", query = "SELECT s FROM Sequences_1 s WHERE s.sequenceName = :sequenceName"),
    @NamedQuery(name = "Sequences_1.findByDataType", query = "SELECT s FROM Sequences_1 s WHERE s.dataType = :dataType"),
    @NamedQuery(name = "Sequences_1.findByNumericPrecision", query = "SELECT s FROM Sequences_1 s WHERE s.numericPrecision = :numericPrecision"),
    @NamedQuery(name = "Sequences_1.findByNumericPrecisionRadix", query = "SELECT s FROM Sequences_1 s WHERE s.numericPrecisionRadix = :numericPrecisionRadix"),
    @NamedQuery(name = "Sequences_1.findByNumericScale", query = "SELECT s FROM Sequences_1 s WHERE s.numericScale = :numericScale"),
    @NamedQuery(name = "Sequences_1.findByStartValue", query = "SELECT s FROM Sequences_1 s WHERE s.startValue = :startValue"),
    @NamedQuery(name = "Sequences_1.findByMinimumValue", query = "SELECT s FROM Sequences_1 s WHERE s.minimumValue = :minimumValue"),
    @NamedQuery(name = "Sequences_1.findByMaximumValue", query = "SELECT s FROM Sequences_1 s WHERE s.maximumValue = :maximumValue"),
    @NamedQuery(name = "Sequences_1.findByIncrement", query = "SELECT s FROM Sequences_1 s WHERE s.increment = :increment"),
    @NamedQuery(name = "Sequences_1.findByCycleOption", query = "SELECT s FROM Sequences_1 s WHERE s.cycleOption = :cycleOption"),
    @NamedQuery(name = "Sequences_1.findByDeclaredDataType", query = "SELECT s FROM Sequences_1 s WHERE s.declaredDataType = :declaredDataType"),
    @NamedQuery(name = "Sequences_1.findByDeclaredNumericPrecision", query = "SELECT s FROM Sequences_1 s WHERE s.declaredNumericPrecision = :declaredNumericPrecision"),
    @NamedQuery(name = "Sequences_1.findByDeclaredNumericScale", query = "SELECT s FROM Sequences_1 s WHERE s.declaredNumericScale = :declaredNumericScale"),
    @NamedQuery(name = "Sequences_1.findByName", query = "SELECT s FROM Sequences_1 s WHERE s.name = :name"),
    @NamedQuery(name = "Sequences_1.findByObjectId", query = "SELECT s FROM Sequences_1 s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "Sequences_1.findByPrincipalId", query = "SELECT s FROM Sequences_1 s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "Sequences_1.findBySchemaId", query = "SELECT s FROM Sequences_1 s WHERE s.schemaId = :schemaId"),
    @NamedQuery(name = "Sequences_1.findByParentObjectId", query = "SELECT s FROM Sequences_1 s WHERE s.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "Sequences_1.findByType", query = "SELECT s FROM Sequences_1 s WHERE s.type = :type"),
    @NamedQuery(name = "Sequences_1.findByTypeDesc", query = "SELECT s FROM Sequences_1 s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "Sequences_1.findByCreateDate", query = "SELECT s FROM Sequences_1 s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "Sequences_1.findByModifyDate", query = "SELECT s FROM Sequences_1 s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "Sequences_1.findByIsMsShipped", query = "SELECT s FROM Sequences_1 s WHERE s.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "Sequences_1.findByIsPublished", query = "SELECT s FROM Sequences_1 s WHERE s.isPublished = :isPublished"),
    @NamedQuery(name = "Sequences_1.findByIsSchemaPublished", query = "SELECT s FROM Sequences_1 s WHERE s.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "Sequences_1.findByStartValue1", query = "SELECT s FROM Sequences_1 s WHERE s.startValue1 = :startValue1"),
    @NamedQuery(name = "Sequences_1.findByIncrement1", query = "SELECT s FROM Sequences_1 s WHERE s.increment1 = :increment1"),
    @NamedQuery(name = "Sequences_1.findByMinimumValue1", query = "SELECT s FROM Sequences_1 s WHERE s.minimumValue1 = :minimumValue1"),
    @NamedQuery(name = "Sequences_1.findByMaximumValue1", query = "SELECT s FROM Sequences_1 s WHERE s.maximumValue1 = :maximumValue1"),
    @NamedQuery(name = "Sequences_1.findByIsCycling", query = "SELECT s FROM Sequences_1 s WHERE s.isCycling = :isCycling"),
    @NamedQuery(name = "Sequences_1.findByIsCached", query = "SELECT s FROM Sequences_1 s WHERE s.isCached = :isCached"),
    @NamedQuery(name = "Sequences_1.findByCacheSize", query = "SELECT s FROM Sequences_1 s WHERE s.cacheSize = :cacheSize"),
    @NamedQuery(name = "Sequences_1.findBySystemTypeId", query = "SELECT s FROM Sequences_1 s WHERE s.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "Sequences_1.findByUserTypeId", query = "SELECT s FROM Sequences_1 s WHERE s.userTypeId = :userTypeId"),
    @NamedQuery(name = "Sequences_1.findByPrecision", query = "SELECT s FROM Sequences_1 s WHERE s.precision = :precision"),
    @NamedQuery(name = "Sequences_1.findByScale", query = "SELECT s FROM Sequences_1 s WHERE s.scale = :scale"),
    @NamedQuery(name = "Sequences_1.findByCurrentValue", query = "SELECT s FROM Sequences_1 s WHERE s.currentValue = :currentValue"),
    @NamedQuery(name = "Sequences_1.findByIsExhausted", query = "SELECT s FROM Sequences_1 s WHERE s.isExhausted = :isExhausted"),
    @NamedQuery(name = "Sequences_1.findByLastUsedValue", query = "SELECT s FROM Sequences_1 s WHERE s.lastUsedValue = :lastUsedValue")})
public class Sequences_1 implements Serializable, Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "SEQUENCE_CATALOG")
    private String sequenceCatalog;
    @Size(max = 128)
    @Column(name = "SEQUENCE_SCHEMA")
    private String sequenceSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "SEQUENCE_NAME")
    private String sequenceName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "DATA_TYPE")
    private String dataType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERIC_PRECISION")
    private short numericPrecision;
    @Column(name = "NUMERIC_PRECISION_RADIX")
    private Short numericPrecisionRadix;
    @Column(name = "NUMERIC_SCALE")
    private Integer numericScale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "START_VALUE")
    private Serializable startValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MINIMUM_VALUE")
    private Serializable minimumValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MAXIMUM_VALUE")
    private Serializable maximumValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INCREMENT")
    private Serializable increment;
    @Column(name = "CYCLE_OPTION")
    private Boolean cycleOption;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "DECLARED_DATA_TYPE")
    private String declaredDataType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DECLARED_NUMERIC_PRECISION")
    private short declaredNumericPrecision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DECLARED_NUMERIC_SCALE")
    private short declaredNumericScale;
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
    @Column(name = "start_value")
    private Serializable startValue1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "increment")
    private Serializable increment1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "minimum_value")
    private Serializable minimumValue1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "maximum_value")
    private Serializable maximumValue1;
    @Column(name = "is_cycling")
    private Boolean isCycling;
    @Column(name = "is_cached")
    private Boolean isCached;
    @Column(name = "cache_size")
    private Integer cacheSize;
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
    @Column(name = "precision")
    private short precision;
    @Column(name = "scale")
    private Short scale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "current_value")
    private Serializable currentValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_exhausted")
    private boolean isExhausted;
    @Column(name = "last_used_value")
    private Serializable lastUsedValue;

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "SEQUENCE_CATALOG")
    private String sequenceCatalog;
    @Size(max = 128)
    @Column(name = "SEQUENCE_SCHEMA")
    private String sequenceSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "SEQUENCE_NAME")
    private String sequenceName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "DATA_TYPE")
    private String dataType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERIC_PRECISION")
    private short numericPrecision;
    @Column(name = "NUMERIC_PRECISION_RADIX")
    private Short numericPrecisionRadix;
    @Column(name = "NUMERIC_SCALE")
    private Integer numericScale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "START_VALUE")
    private Serializable startValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MINIMUM_VALUE")
    private Serializable minimumValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MAXIMUM_VALUE")
    private Serializable maximumValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INCREMENT")
    private Serializable increment;
    @Column(name = "CYCLE_OPTION")
    private Boolean cycleOption;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "DECLARED_DATA_TYPE")
    private String declaredDataType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DECLARED_NUMERIC_PRECISION")
    private short declaredNumericPrecision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DECLARED_NUMERIC_SCALE")
    private short declaredNumericScale;
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
    @Column(name = "start_value")
    private Serializable startValue1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "increment")
    private Serializable increment1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "minimum_value")
    private Serializable minimumValue1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "maximum_value")
    private Serializable maximumValue1;
    @Column(name = "is_cycling")
    private Boolean isCycling;
    @Column(name = "is_cached")
    private Boolean isCached;
    @Column(name = "cache_size")
    private Integer cacheSize;
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
    @Column(name = "precision")
    private short precision;
    @Column(name = "scale")
    private Short scale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "current_value")
    private Serializable currentValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_exhausted")
    private boolean isExhausted;
    @Column(name = "last_used_value")
    private Serializable lastUsedValue;

    public Sequences_1() {
    }

    public String getSequenceCatalog() {
        return sequenceCatalog;
    }

    public void setSequenceCatalog(String sequenceCatalog) {
        this.sequenceCatalog = sequenceCatalog;
    }

    public String getSequenceSchema() {
        return sequenceSchema;
    }

    public void setSequenceSchema(String sequenceSchema) {
        this.sequenceSchema = sequenceSchema;
    }

    public String getSequenceName() {
        return sequenceName;
    }

    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public short getNumericPrecision() {
        return numericPrecision;
    }

    public void setNumericPrecision(short numericPrecision) {
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

    public Serializable getStartValue() {
        return startValue;
    }

    public void setStartValue(Serializable startValue) {
        this.startValue = startValue;
    }

    public Serializable getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(Serializable minimumValue) {
        this.minimumValue = minimumValue;
    }

    public Serializable getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(Serializable maximumValue) {
        this.maximumValue = maximumValue;
    }

    public Serializable getIncrement() {
        return increment;
    }

    public void setIncrement(Serializable increment) {
        this.increment = increment;
    }

    public Boolean getCycleOption() {
        return cycleOption;
    }

    public void setCycleOption(Boolean cycleOption) {
        this.cycleOption = cycleOption;
    }

    public String getDeclaredDataType() {
        return declaredDataType;
    }

    public void setDeclaredDataType(String declaredDataType) {
        this.declaredDataType = declaredDataType;
    }

    public short getDeclaredNumericPrecision() {
        return declaredNumericPrecision;
    }

    public void setDeclaredNumericPrecision(short declaredNumericPrecision) {
        this.declaredNumericPrecision = declaredNumericPrecision;
    }

    public short getDeclaredNumericScale() {
        return declaredNumericScale;
    }

    public void setDeclaredNumericScale(short declaredNumericScale) {
        this.declaredNumericScale = declaredNumericScale;
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

    public Serializable getStartValue1() {
        return startValue1;
    }

    public void setStartValue1(Serializable startValue1) {
        this.startValue1 = startValue1;
    }

    public Serializable getIncrement1() {
        return increment1;
    }

    public void setIncrement1(Serializable increment1) {
        this.increment1 = increment1;
    }

    public Serializable getMinimumValue1() {
        return minimumValue1;
    }

    public void setMinimumValue1(Serializable minimumValue1) {
        this.minimumValue1 = minimumValue1;
    }

    public Serializable getMaximumValue1() {
        return maximumValue1;
    }

    public void setMaximumValue1(Serializable maximumValue1) {
        this.maximumValue1 = maximumValue1;
    }

    public Boolean getIsCycling() {
        return isCycling;
    }

    public void setIsCycling(Boolean isCycling) {
        this.isCycling = isCycling;
    }

    public Boolean getIsCached() {
        return isCached;
    }

    public void setIsCached(Boolean isCached) {
        this.isCached = isCached;
    }

    public Integer getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(Integer cacheSize) {
        this.cacheSize = cacheSize;
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

    public short getPrecision() {
        return precision;
    }

    public void setPrecision(short precision) {
        this.precision = precision;
    }

    public Short getScale() {
        return scale;
    }

    public void setScale(Short scale) {
        this.scale = scale;
    }

    public Serializable getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Serializable currentValue) {
        this.currentValue = currentValue;
    }

    public boolean getIsExhausted() {
        return isExhausted;
    }

    public void setIsExhausted(boolean isExhausted) {
        this.isExhausted = isExhausted;
    }

    public Serializable getLastUsedValue() {
        return lastUsedValue;
    }

    public void setLastUsedValue(Serializable lastUsedValue) {
        this.lastUsedValue = lastUsedValue;
    }

    public String getSequenceCatalog() {
        return sequenceCatalog;
    }

    public void setSequenceCatalog(String sequenceCatalog) {
        this.sequenceCatalog = sequenceCatalog;
    }

    public String getSequenceSchema() {
        return sequenceSchema;
    }

    public void setSequenceSchema(String sequenceSchema) {
        this.sequenceSchema = sequenceSchema;
    }

    public String getSequenceName() {
        return sequenceName;
    }

    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public short getNumericPrecision() {
        return numericPrecision;
    }

    public void setNumericPrecision(short numericPrecision) {
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

    public Serializable getStartValue() {
        return startValue;
    }

    public void setStartValue(Serializable startValue) {
        this.startValue = startValue;
    }

    public Serializable getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(Serializable minimumValue) {
        this.minimumValue = minimumValue;
    }

    public Serializable getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(Serializable maximumValue) {
        this.maximumValue = maximumValue;
    }

    public Serializable getIncrement() {
        return increment;
    }

    public void setIncrement(Serializable increment) {
        this.increment = increment;
    }

    public Boolean getCycleOption() {
        return cycleOption;
    }

    public void setCycleOption(Boolean cycleOption) {
        this.cycleOption = cycleOption;
    }

    public String getDeclaredDataType() {
        return declaredDataType;
    }

    public void setDeclaredDataType(String declaredDataType) {
        this.declaredDataType = declaredDataType;
    }

    public short getDeclaredNumericPrecision() {
        return declaredNumericPrecision;
    }

    public void setDeclaredNumericPrecision(short declaredNumericPrecision) {
        this.declaredNumericPrecision = declaredNumericPrecision;
    }

    public short getDeclaredNumericScale() {
        return declaredNumericScale;
    }

    public void setDeclaredNumericScale(short declaredNumericScale) {
        this.declaredNumericScale = declaredNumericScale;
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

    public Serializable getStartValue1() {
        return startValue1;
    }

    public void setStartValue1(Serializable startValue1) {
        this.startValue1 = startValue1;
    }

    public Serializable getIncrement1() {
        return increment1;
    }

    public void setIncrement1(Serializable increment1) {
        this.increment1 = increment1;
    }

    public Serializable getMinimumValue1() {
        return minimumValue1;
    }

    public void setMinimumValue1(Serializable minimumValue1) {
        this.minimumValue1 = minimumValue1;
    }

    public Serializable getMaximumValue1() {
        return maximumValue1;
    }

    public void setMaximumValue1(Serializable maximumValue1) {
        this.maximumValue1 = maximumValue1;
    }

    public Boolean getIsCycling() {
        return isCycling;
    }

    public void setIsCycling(Boolean isCycling) {
        this.isCycling = isCycling;
    }

    public Boolean getIsCached() {
        return isCached;
    }

    public void setIsCached(Boolean isCached) {
        this.isCached = isCached;
    }

    public Integer getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(Integer cacheSize) {
        this.cacheSize = cacheSize;
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

    public short getPrecision() {
        return precision;
    }

    public void setPrecision(short precision) {
        this.precision = precision;
    }

    public Short getScale() {
        return scale;
    }

    public void setScale(Short scale) {
        this.scale = scale;
    }

    public Serializable getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Serializable currentValue) {
        this.currentValue = currentValue;
    }

    public boolean getIsExhausted() {
        return isExhausted;
    }

    public void setIsExhausted(boolean isExhausted) {
        this.isExhausted = isExhausted;
    }

    public Serializable getLastUsedValue() {
        return lastUsedValue;
    }

    public void setLastUsedValue(Serializable lastUsedValue) {
        this.lastUsedValue = lastUsedValue;
    }
    
}
