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
@Table(name = "PARAMETERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parameters_1.findAll", query = "SELECT p FROM Parameters_1 p"),
    @NamedQuery(name = "Parameters_1.findBySpecificCatalog", query = "SELECT p FROM Parameters_1 p WHERE p.specificCatalog = :specificCatalog"),
    @NamedQuery(name = "Parameters_1.findBySpecificSchema", query = "SELECT p FROM Parameters_1 p WHERE p.specificSchema = :specificSchema"),
    @NamedQuery(name = "Parameters_1.findBySpecificName", query = "SELECT p FROM Parameters_1 p WHERE p.specificName = :specificName"),
    @NamedQuery(name = "Parameters_1.findByOrdinalPosition", query = "SELECT p FROM Parameters_1 p WHERE p.ordinalPosition = :ordinalPosition"),
    @NamedQuery(name = "Parameters_1.findByParameterMode", query = "SELECT p FROM Parameters_1 p WHERE p.parameterMode = :parameterMode"),
    @NamedQuery(name = "Parameters_1.findByIsResult", query = "SELECT p FROM Parameters_1 p WHERE p.isResult = :isResult"),
    @NamedQuery(name = "Parameters_1.findByAsLocator", query = "SELECT p FROM Parameters_1 p WHERE p.asLocator = :asLocator"),
    @NamedQuery(name = "Parameters_1.findByParameterName", query = "SELECT p FROM Parameters_1 p WHERE p.parameterName = :parameterName"),
    @NamedQuery(name = "Parameters_1.findByDataType", query = "SELECT p FROM Parameters_1 p WHERE p.dataType = :dataType"),
    @NamedQuery(name = "Parameters_1.findByCharacterMaximumLength", query = "SELECT p FROM Parameters_1 p WHERE p.characterMaximumLength = :characterMaximumLength"),
    @NamedQuery(name = "Parameters_1.findByCharacterOctetLength", query = "SELECT p FROM Parameters_1 p WHERE p.characterOctetLength = :characterOctetLength"),
    @NamedQuery(name = "Parameters_1.findByCollationCatalog", query = "SELECT p FROM Parameters_1 p WHERE p.collationCatalog = :collationCatalog"),
    @NamedQuery(name = "Parameters_1.findByCollationSchema", query = "SELECT p FROM Parameters_1 p WHERE p.collationSchema = :collationSchema"),
    @NamedQuery(name = "Parameters_1.findByCollationName", query = "SELECT p FROM Parameters_1 p WHERE p.collationName = :collationName"),
    @NamedQuery(name = "Parameters_1.findByCharacterSetCatalog", query = "SELECT p FROM Parameters_1 p WHERE p.characterSetCatalog = :characterSetCatalog"),
    @NamedQuery(name = "Parameters_1.findByCharacterSetSchema", query = "SELECT p FROM Parameters_1 p WHERE p.characterSetSchema = :characterSetSchema"),
    @NamedQuery(name = "Parameters_1.findByCharacterSetName", query = "SELECT p FROM Parameters_1 p WHERE p.characterSetName = :characterSetName"),
    @NamedQuery(name = "Parameters_1.findByNumericPrecision", query = "SELECT p FROM Parameters_1 p WHERE p.numericPrecision = :numericPrecision"),
    @NamedQuery(name = "Parameters_1.findByNumericPrecisionRadix", query = "SELECT p FROM Parameters_1 p WHERE p.numericPrecisionRadix = :numericPrecisionRadix"),
    @NamedQuery(name = "Parameters_1.findByNumericScale", query = "SELECT p FROM Parameters_1 p WHERE p.numericScale = :numericScale"),
    @NamedQuery(name = "Parameters_1.findByDatetimePrecision", query = "SELECT p FROM Parameters_1 p WHERE p.datetimePrecision = :datetimePrecision"),
    @NamedQuery(name = "Parameters_1.findByIntervalType", query = "SELECT p FROM Parameters_1 p WHERE p.intervalType = :intervalType"),
    @NamedQuery(name = "Parameters_1.findByIntervalPrecision", query = "SELECT p FROM Parameters_1 p WHERE p.intervalPrecision = :intervalPrecision"),
    @NamedQuery(name = "Parameters_1.findByUserDefinedTypeCatalog", query = "SELECT p FROM Parameters_1 p WHERE p.userDefinedTypeCatalog = :userDefinedTypeCatalog"),
    @NamedQuery(name = "Parameters_1.findByUserDefinedTypeSchema", query = "SELECT p FROM Parameters_1 p WHERE p.userDefinedTypeSchema = :userDefinedTypeSchema"),
    @NamedQuery(name = "Parameters_1.findByUserDefinedTypeName", query = "SELECT p FROM Parameters_1 p WHERE p.userDefinedTypeName = :userDefinedTypeName"),
    @NamedQuery(name = "Parameters_1.findByScopeCatalog", query = "SELECT p FROM Parameters_1 p WHERE p.scopeCatalog = :scopeCatalog"),
    @NamedQuery(name = "Parameters_1.findByScopeSchema", query = "SELECT p FROM Parameters_1 p WHERE p.scopeSchema = :scopeSchema"),
    @NamedQuery(name = "Parameters_1.findByScopeName", query = "SELECT p FROM Parameters_1 p WHERE p.scopeName = :scopeName"),
    @NamedQuery(name = "Parameters_1.findByObjectId", query = "SELECT p FROM Parameters_1 p WHERE p.objectId = :objectId"),
    @NamedQuery(name = "Parameters_1.findByName", query = "SELECT p FROM Parameters_1 p WHERE p.name = :name"),
    @NamedQuery(name = "Parameters_1.findByParameterId", query = "SELECT p FROM Parameters_1 p WHERE p.parameterId = :parameterId"),
    @NamedQuery(name = "Parameters_1.findBySystemTypeId", query = "SELECT p FROM Parameters_1 p WHERE p.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "Parameters_1.findByUserTypeId", query = "SELECT p FROM Parameters_1 p WHERE p.userTypeId = :userTypeId"),
    @NamedQuery(name = "Parameters_1.findByMaxLength", query = "SELECT p FROM Parameters_1 p WHERE p.maxLength = :maxLength"),
    @NamedQuery(name = "Parameters_1.findByPrecision", query = "SELECT p FROM Parameters_1 p WHERE p.precision = :precision"),
    @NamedQuery(name = "Parameters_1.findByScale", query = "SELECT p FROM Parameters_1 p WHERE p.scale = :scale"),
    @NamedQuery(name = "Parameters_1.findByIsOutput", query = "SELECT p FROM Parameters_1 p WHERE p.isOutput = :isOutput"),
    @NamedQuery(name = "Parameters_1.findByIsCursorRef", query = "SELECT p FROM Parameters_1 p WHERE p.isCursorRef = :isCursorRef"),
    @NamedQuery(name = "Parameters_1.findByHasDefaultValue", query = "SELECT p FROM Parameters_1 p WHERE p.hasDefaultValue = :hasDefaultValue"),
    @NamedQuery(name = "Parameters_1.findByIsXmlDocument", query = "SELECT p FROM Parameters_1 p WHERE p.isXmlDocument = :isXmlDocument"),
    @NamedQuery(name = "Parameters_1.findByDefaultValue", query = "SELECT p FROM Parameters_1 p WHERE p.defaultValue = :defaultValue"),
    @NamedQuery(name = "Parameters_1.findByXmlCollectionId", query = "SELECT p FROM Parameters_1 p WHERE p.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "Parameters_1.findByIsReadonly", query = "SELECT p FROM Parameters_1 p WHERE p.isReadonly = :isReadonly"),
    @NamedQuery(name = "Parameters_1.findByIsNullable", query = "SELECT p FROM Parameters_1 p WHERE p.isNullable = :isNullable"),
    @NamedQuery(name = "Parameters_1.findByEncryptionType", query = "SELECT p FROM Parameters_1 p WHERE p.encryptionType = :encryptionType"),
    @NamedQuery(name = "Parameters_1.findByEncryptionTypeDesc", query = "SELECT p FROM Parameters_1 p WHERE p.encryptionTypeDesc = :encryptionTypeDesc"),
    @NamedQuery(name = "Parameters_1.findByEncryptionAlgorithmName", query = "SELECT p FROM Parameters_1 p WHERE p.encryptionAlgorithmName = :encryptionAlgorithmName"),
    @NamedQuery(name = "Parameters_1.findByColumnEncryptionKeyId", query = "SELECT p FROM Parameters_1 p WHERE p.columnEncryptionKeyId = :columnEncryptionKeyId"),
    @NamedQuery(name = "Parameters_1.findByColumnEncryptionKeyDatabaseName", query = "SELECT p FROM Parameters_1 p WHERE p.columnEncryptionKeyDatabaseName = :columnEncryptionKeyDatabaseName")})
@Entity
@Table(name = "parameters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parameters_1.findAll", query = "SELECT p FROM Parameters_1 p"),
    @NamedQuery(name = "Parameters_1.findBySpecificCatalog", query = "SELECT p FROM Parameters_1 p WHERE p.specificCatalog = :specificCatalog"),
    @NamedQuery(name = "Parameters_1.findBySpecificSchema", query = "SELECT p FROM Parameters_1 p WHERE p.specificSchema = :specificSchema"),
    @NamedQuery(name = "Parameters_1.findBySpecificName", query = "SELECT p FROM Parameters_1 p WHERE p.specificName = :specificName"),
    @NamedQuery(name = "Parameters_1.findByOrdinalPosition", query = "SELECT p FROM Parameters_1 p WHERE p.ordinalPosition = :ordinalPosition"),
    @NamedQuery(name = "Parameters_1.findByParameterMode", query = "SELECT p FROM Parameters_1 p WHERE p.parameterMode = :parameterMode"),
    @NamedQuery(name = "Parameters_1.findByIsResult", query = "SELECT p FROM Parameters_1 p WHERE p.isResult = :isResult"),
    @NamedQuery(name = "Parameters_1.findByAsLocator", query = "SELECT p FROM Parameters_1 p WHERE p.asLocator = :asLocator"),
    @NamedQuery(name = "Parameters_1.findByParameterName", query = "SELECT p FROM Parameters_1 p WHERE p.parameterName = :parameterName"),
    @NamedQuery(name = "Parameters_1.findByDataType", query = "SELECT p FROM Parameters_1 p WHERE p.dataType = :dataType"),
    @NamedQuery(name = "Parameters_1.findByCharacterMaximumLength", query = "SELECT p FROM Parameters_1 p WHERE p.characterMaximumLength = :characterMaximumLength"),
    @NamedQuery(name = "Parameters_1.findByCharacterOctetLength", query = "SELECT p FROM Parameters_1 p WHERE p.characterOctetLength = :characterOctetLength"),
    @NamedQuery(name = "Parameters_1.findByCollationCatalog", query = "SELECT p FROM Parameters_1 p WHERE p.collationCatalog = :collationCatalog"),
    @NamedQuery(name = "Parameters_1.findByCollationSchema", query = "SELECT p FROM Parameters_1 p WHERE p.collationSchema = :collationSchema"),
    @NamedQuery(name = "Parameters_1.findByCollationName", query = "SELECT p FROM Parameters_1 p WHERE p.collationName = :collationName"),
    @NamedQuery(name = "Parameters_1.findByCharacterSetCatalog", query = "SELECT p FROM Parameters_1 p WHERE p.characterSetCatalog = :characterSetCatalog"),
    @NamedQuery(name = "Parameters_1.findByCharacterSetSchema", query = "SELECT p FROM Parameters_1 p WHERE p.characterSetSchema = :characterSetSchema"),
    @NamedQuery(name = "Parameters_1.findByCharacterSetName", query = "SELECT p FROM Parameters_1 p WHERE p.characterSetName = :characterSetName"),
    @NamedQuery(name = "Parameters_1.findByNumericPrecision", query = "SELECT p FROM Parameters_1 p WHERE p.numericPrecision = :numericPrecision"),
    @NamedQuery(name = "Parameters_1.findByNumericPrecisionRadix", query = "SELECT p FROM Parameters_1 p WHERE p.numericPrecisionRadix = :numericPrecisionRadix"),
    @NamedQuery(name = "Parameters_1.findByNumericScale", query = "SELECT p FROM Parameters_1 p WHERE p.numericScale = :numericScale"),
    @NamedQuery(name = "Parameters_1.findByDatetimePrecision", query = "SELECT p FROM Parameters_1 p WHERE p.datetimePrecision = :datetimePrecision"),
    @NamedQuery(name = "Parameters_1.findByIntervalType", query = "SELECT p FROM Parameters_1 p WHERE p.intervalType = :intervalType"),
    @NamedQuery(name = "Parameters_1.findByIntervalPrecision", query = "SELECT p FROM Parameters_1 p WHERE p.intervalPrecision = :intervalPrecision"),
    @NamedQuery(name = "Parameters_1.findByUserDefinedTypeCatalog", query = "SELECT p FROM Parameters_1 p WHERE p.userDefinedTypeCatalog = :userDefinedTypeCatalog"),
    @NamedQuery(name = "Parameters_1.findByUserDefinedTypeSchema", query = "SELECT p FROM Parameters_1 p WHERE p.userDefinedTypeSchema = :userDefinedTypeSchema"),
    @NamedQuery(name = "Parameters_1.findByUserDefinedTypeName", query = "SELECT p FROM Parameters_1 p WHERE p.userDefinedTypeName = :userDefinedTypeName"),
    @NamedQuery(name = "Parameters_1.findByScopeCatalog", query = "SELECT p FROM Parameters_1 p WHERE p.scopeCatalog = :scopeCatalog"),
    @NamedQuery(name = "Parameters_1.findByScopeSchema", query = "SELECT p FROM Parameters_1 p WHERE p.scopeSchema = :scopeSchema"),
    @NamedQuery(name = "Parameters_1.findByScopeName", query = "SELECT p FROM Parameters_1 p WHERE p.scopeName = :scopeName"),
    @NamedQuery(name = "Parameters_1.findByObjectId", query = "SELECT p FROM Parameters_1 p WHERE p.objectId = :objectId"),
    @NamedQuery(name = "Parameters_1.findByName", query = "SELECT p FROM Parameters_1 p WHERE p.name = :name"),
    @NamedQuery(name = "Parameters_1.findByParameterId", query = "SELECT p FROM Parameters_1 p WHERE p.parameterId = :parameterId"),
    @NamedQuery(name = "Parameters_1.findBySystemTypeId", query = "SELECT p FROM Parameters_1 p WHERE p.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "Parameters_1.findByUserTypeId", query = "SELECT p FROM Parameters_1 p WHERE p.userTypeId = :userTypeId"),
    @NamedQuery(name = "Parameters_1.findByMaxLength", query = "SELECT p FROM Parameters_1 p WHERE p.maxLength = :maxLength"),
    @NamedQuery(name = "Parameters_1.findByPrecision", query = "SELECT p FROM Parameters_1 p WHERE p.precision = :precision"),
    @NamedQuery(name = "Parameters_1.findByScale", query = "SELECT p FROM Parameters_1 p WHERE p.scale = :scale"),
    @NamedQuery(name = "Parameters_1.findByIsOutput", query = "SELECT p FROM Parameters_1 p WHERE p.isOutput = :isOutput"),
    @NamedQuery(name = "Parameters_1.findByIsCursorRef", query = "SELECT p FROM Parameters_1 p WHERE p.isCursorRef = :isCursorRef"),
    @NamedQuery(name = "Parameters_1.findByHasDefaultValue", query = "SELECT p FROM Parameters_1 p WHERE p.hasDefaultValue = :hasDefaultValue"),
    @NamedQuery(name = "Parameters_1.findByIsXmlDocument", query = "SELECT p FROM Parameters_1 p WHERE p.isXmlDocument = :isXmlDocument"),
    @NamedQuery(name = "Parameters_1.findByDefaultValue", query = "SELECT p FROM Parameters_1 p WHERE p.defaultValue = :defaultValue"),
    @NamedQuery(name = "Parameters_1.findByXmlCollectionId", query = "SELECT p FROM Parameters_1 p WHERE p.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "Parameters_1.findByIsReadonly", query = "SELECT p FROM Parameters_1 p WHERE p.isReadonly = :isReadonly"),
    @NamedQuery(name = "Parameters_1.findByIsNullable", query = "SELECT p FROM Parameters_1 p WHERE p.isNullable = :isNullable"),
    @NamedQuery(name = "Parameters_1.findByEncryptionType", query = "SELECT p FROM Parameters_1 p WHERE p.encryptionType = :encryptionType"),
    @NamedQuery(name = "Parameters_1.findByEncryptionTypeDesc", query = "SELECT p FROM Parameters_1 p WHERE p.encryptionTypeDesc = :encryptionTypeDesc"),
    @NamedQuery(name = "Parameters_1.findByEncryptionAlgorithmName", query = "SELECT p FROM Parameters_1 p WHERE p.encryptionAlgorithmName = :encryptionAlgorithmName"),
    @NamedQuery(name = "Parameters_1.findByColumnEncryptionKeyId", query = "SELECT p FROM Parameters_1 p WHERE p.columnEncryptionKeyId = :columnEncryptionKeyId"),
    @NamedQuery(name = "Parameters_1.findByColumnEncryptionKeyDatabaseName", query = "SELECT p FROM Parameters_1 p WHERE p.columnEncryptionKeyDatabaseName = :columnEncryptionKeyDatabaseName")})
public class Parameters_1 implements Serializable, Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDINAL_POSITION")
    private int ordinalPosition;
    @Size(max = 10)
    @Column(name = "PARAMETER_MODE")
    private String parameterMode;
    @Size(max = 10)
    @Column(name = "IS_RESULT")
    private String isResult;
    @Size(max = 10)
    @Column(name = "AS_LOCATOR")
    private String asLocator;
    @Size(max = 128)
    @Column(name = "PARAMETER_NAME")
    private String parameterName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
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
    @Column(name = "USER_DEFINED_TYPE_CATALOG")
    private String userDefinedTypeCatalog;
    @Size(max = 128)
    @Column(name = "USER_DEFINED_TYPE_SCHEMA")
    private String userDefinedTypeSchema;
    @Size(max = 128)
    @Column(name = "USER_DEFINED_TYPE_NAME")
    private String userDefinedTypeName;
    @Size(max = 128)
    @Column(name = "SCOPE_CATALOG")
    private String scopeCatalog;
    @Size(max = 128)
    @Column(name = "SCOPE_SCHEMA")
    private String scopeSchema;
    @Size(max = 128)
    @Column(name = "SCOPE_NAME")
    private String scopeName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parameter_id")
    private int parameterId;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_output")
    private boolean isOutput;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_cursor_ref")
    private boolean isCursorRef;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_default_value")
    private boolean hasDefaultValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_xml_document")
    private boolean isXmlDocument;
    @Column(name = "default_value")
    private Serializable defaultValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_collection_id")
    private int xmlCollectionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_readonly")
    private boolean isReadonly;
    @Column(name = "is_nullable")
    private Boolean isNullable;
    @Column(name = "encryption_type")
    private Integer encryptionType;
    @Size(max = 64)
    @Column(name = "encryption_type_desc")
    private String encryptionTypeDesc;
    @Size(max = 128)
    @Column(name = "encryption_algorithm_name")
    private String encryptionAlgorithmName;
    @Column(name = "column_encryption_key_id")
    private Integer columnEncryptionKeyId;
    @Size(max = 128)
    @Column(name = "column_encryption_key_database_name")
    private String columnEncryptionKeyDatabaseName;

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDINAL_POSITION")
    private int ordinalPosition;
    @Size(max = 10)
    @Column(name = "PARAMETER_MODE")
    private String parameterMode;
    @Size(max = 10)
    @Column(name = "IS_RESULT")
    private String isResult;
    @Size(max = 10)
    @Column(name = "AS_LOCATOR")
    private String asLocator;
    @Size(max = 128)
    @Column(name = "PARAMETER_NAME")
    private String parameterName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
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
    @Column(name = "USER_DEFINED_TYPE_CATALOG")
    private String userDefinedTypeCatalog;
    @Size(max = 128)
    @Column(name = "USER_DEFINED_TYPE_SCHEMA")
    private String userDefinedTypeSchema;
    @Size(max = 128)
    @Column(name = "USER_DEFINED_TYPE_NAME")
    private String userDefinedTypeName;
    @Size(max = 128)
    @Column(name = "SCOPE_CATALOG")
    private String scopeCatalog;
    @Size(max = 128)
    @Column(name = "SCOPE_SCHEMA")
    private String scopeSchema;
    @Size(max = 128)
    @Column(name = "SCOPE_NAME")
    private String scopeName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parameter_id")
    private int parameterId;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_output")
    private boolean isOutput;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_cursor_ref")
    private boolean isCursorRef;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_default_value")
    private boolean hasDefaultValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_xml_document")
    private boolean isXmlDocument;
    @Column(name = "default_value")
    private Serializable defaultValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_collection_id")
    private int xmlCollectionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_readonly")
    private boolean isReadonly;
    @Column(name = "is_nullable")
    private Boolean isNullable;
    @Column(name = "encryption_type")
    private Integer encryptionType;
    @Size(max = 64)
    @Column(name = "encryption_type_desc")
    private String encryptionTypeDesc;
    @Size(max = 128)
    @Column(name = "encryption_algorithm_name")
    private String encryptionAlgorithmName;
    @Column(name = "column_encryption_key_id")
    private Integer columnEncryptionKeyId;
    @Size(max = 128)
    @Column(name = "column_encryption_key_database_name")
    private String columnEncryptionKeyDatabaseName;

    public Parameters_1() {
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

    public int getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(int ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getParameterMode() {
        return parameterMode;
    }

    public void setParameterMode(String parameterMode) {
        this.parameterMode = parameterMode;
    }

    public String getIsResult() {
        return isResult;
    }

    public void setIsResult(String isResult) {
        this.isResult = isResult;
    }

    public String getAsLocator() {
        return asLocator;
    }

    public void setAsLocator(String asLocator) {
        this.asLocator = asLocator;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
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

    public String getUserDefinedTypeCatalog() {
        return userDefinedTypeCatalog;
    }

    public void setUserDefinedTypeCatalog(String userDefinedTypeCatalog) {
        this.userDefinedTypeCatalog = userDefinedTypeCatalog;
    }

    public String getUserDefinedTypeSchema() {
        return userDefinedTypeSchema;
    }

    public void setUserDefinedTypeSchema(String userDefinedTypeSchema) {
        this.userDefinedTypeSchema = userDefinedTypeSchema;
    }

    public String getUserDefinedTypeName() {
        return userDefinedTypeName;
    }

    public void setUserDefinedTypeName(String userDefinedTypeName) {
        this.userDefinedTypeName = userDefinedTypeName;
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

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParameterId() {
        return parameterId;
    }

    public void setParameterId(int parameterId) {
        this.parameterId = parameterId;
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

    public boolean getIsOutput() {
        return isOutput;
    }

    public void setIsOutput(boolean isOutput) {
        this.isOutput = isOutput;
    }

    public boolean getIsCursorRef() {
        return isCursorRef;
    }

    public void setIsCursorRef(boolean isCursorRef) {
        this.isCursorRef = isCursorRef;
    }

    public boolean getHasDefaultValue() {
        return hasDefaultValue;
    }

    public void setHasDefaultValue(boolean hasDefaultValue) {
        this.hasDefaultValue = hasDefaultValue;
    }

    public boolean getIsXmlDocument() {
        return isXmlDocument;
    }

    public void setIsXmlDocument(boolean isXmlDocument) {
        this.isXmlDocument = isXmlDocument;
    }

    public Serializable getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Serializable defaultValue) {
        this.defaultValue = defaultValue;
    }

    public int getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(int xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }

    public boolean getIsReadonly() {
        return isReadonly;
    }

    public void setIsReadonly(boolean isReadonly) {
        this.isReadonly = isReadonly;
    }

    public Boolean getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(Boolean isNullable) {
        this.isNullable = isNullable;
    }

    public Integer getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(Integer encryptionType) {
        this.encryptionType = encryptionType;
    }

    public String getEncryptionTypeDesc() {
        return encryptionTypeDesc;
    }

    public void setEncryptionTypeDesc(String encryptionTypeDesc) {
        this.encryptionTypeDesc = encryptionTypeDesc;
    }

    public String getEncryptionAlgorithmName() {
        return encryptionAlgorithmName;
    }

    public void setEncryptionAlgorithmName(String encryptionAlgorithmName) {
        this.encryptionAlgorithmName = encryptionAlgorithmName;
    }

    public Integer getColumnEncryptionKeyId() {
        return columnEncryptionKeyId;
    }

    public void setColumnEncryptionKeyId(Integer columnEncryptionKeyId) {
        this.columnEncryptionKeyId = columnEncryptionKeyId;
    }

    public String getColumnEncryptionKeyDatabaseName() {
        return columnEncryptionKeyDatabaseName;
    }

    public void setColumnEncryptionKeyDatabaseName(String columnEncryptionKeyDatabaseName) {
        this.columnEncryptionKeyDatabaseName = columnEncryptionKeyDatabaseName;
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

    public int getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(int ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getParameterMode() {
        return parameterMode;
    }

    public void setParameterMode(String parameterMode) {
        this.parameterMode = parameterMode;
    }

    public String getIsResult() {
        return isResult;
    }

    public void setIsResult(String isResult) {
        this.isResult = isResult;
    }

    public String getAsLocator() {
        return asLocator;
    }

    public void setAsLocator(String asLocator) {
        this.asLocator = asLocator;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
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

    public String getUserDefinedTypeCatalog() {
        return userDefinedTypeCatalog;
    }

    public void setUserDefinedTypeCatalog(String userDefinedTypeCatalog) {
        this.userDefinedTypeCatalog = userDefinedTypeCatalog;
    }

    public String getUserDefinedTypeSchema() {
        return userDefinedTypeSchema;
    }

    public void setUserDefinedTypeSchema(String userDefinedTypeSchema) {
        this.userDefinedTypeSchema = userDefinedTypeSchema;
    }

    public String getUserDefinedTypeName() {
        return userDefinedTypeName;
    }

    public void setUserDefinedTypeName(String userDefinedTypeName) {
        this.userDefinedTypeName = userDefinedTypeName;
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

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParameterId() {
        return parameterId;
    }

    public void setParameterId(int parameterId) {
        this.parameterId = parameterId;
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

    public boolean getIsOutput() {
        return isOutput;
    }

    public void setIsOutput(boolean isOutput) {
        this.isOutput = isOutput;
    }

    public boolean getIsCursorRef() {
        return isCursorRef;
    }

    public void setIsCursorRef(boolean isCursorRef) {
        this.isCursorRef = isCursorRef;
    }

    public boolean getHasDefaultValue() {
        return hasDefaultValue;
    }

    public void setHasDefaultValue(boolean hasDefaultValue) {
        this.hasDefaultValue = hasDefaultValue;
    }

    public boolean getIsXmlDocument() {
        return isXmlDocument;
    }

    public void setIsXmlDocument(boolean isXmlDocument) {
        this.isXmlDocument = isXmlDocument;
    }

    public Serializable getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Serializable defaultValue) {
        this.defaultValue = defaultValue;
    }

    public int getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(int xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }

    public boolean getIsReadonly() {
        return isReadonly;
    }

    public void setIsReadonly(boolean isReadonly) {
        this.isReadonly = isReadonly;
    }

    public Boolean getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(Boolean isNullable) {
        this.isNullable = isNullable;
    }

    public Integer getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(Integer encryptionType) {
        this.encryptionType = encryptionType;
    }

    public String getEncryptionTypeDesc() {
        return encryptionTypeDesc;
    }

    public void setEncryptionTypeDesc(String encryptionTypeDesc) {
        this.encryptionTypeDesc = encryptionTypeDesc;
    }

    public String getEncryptionAlgorithmName() {
        return encryptionAlgorithmName;
    }

    public void setEncryptionAlgorithmName(String encryptionAlgorithmName) {
        this.encryptionAlgorithmName = encryptionAlgorithmName;
    }

    public Integer getColumnEncryptionKeyId() {
        return columnEncryptionKeyId;
    }

    public void setColumnEncryptionKeyId(Integer columnEncryptionKeyId) {
        this.columnEncryptionKeyId = columnEncryptionKeyId;
    }

    public String getColumnEncryptionKeyDatabaseName() {
        return columnEncryptionKeyDatabaseName;
    }

    public void setColumnEncryptionKeyDatabaseName(String columnEncryptionKeyDatabaseName) {
        this.columnEncryptionKeyDatabaseName = columnEncryptionKeyDatabaseName;
    }
    
}
