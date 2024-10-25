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
@Table(name = "COLUMNS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Columns_1.findAll", query = "SELECT c FROM Columns_1 c"),
    @NamedQuery(name = "Columns_1.findByTableCatalog", query = "SELECT c FROM Columns_1 c WHERE c.tableCatalog = :tableCatalog"),
    @NamedQuery(name = "Columns_1.findByTableSchema", query = "SELECT c FROM Columns_1 c WHERE c.tableSchema = :tableSchema"),
    @NamedQuery(name = "Columns_1.findByTableName", query = "SELECT c FROM Columns_1 c WHERE c.tableName = :tableName"),
    @NamedQuery(name = "Columns_1.findByColumnName", query = "SELECT c FROM Columns_1 c WHERE c.columnName = :columnName"),
    @NamedQuery(name = "Columns_1.findByOrdinalPosition", query = "SELECT c FROM Columns_1 c WHERE c.ordinalPosition = :ordinalPosition"),
    @NamedQuery(name = "Columns_1.findByColumnDefault", query = "SELECT c FROM Columns_1 c WHERE c.columnDefault = :columnDefault"),
    @NamedQuery(name = "Columns_1.findByIsNullable", query = "SELECT c FROM Columns_1 c WHERE c.isNullable = :isNullable"),
    @NamedQuery(name = "Columns_1.findByDataType", query = "SELECT c FROM Columns_1 c WHERE c.dataType = :dataType"),
    @NamedQuery(name = "Columns_1.findByCharacterMaximumLength", query = "SELECT c FROM Columns_1 c WHERE c.characterMaximumLength = :characterMaximumLength"),
    @NamedQuery(name = "Columns_1.findByCharacterOctetLength", query = "SELECT c FROM Columns_1 c WHERE c.characterOctetLength = :characterOctetLength"),
    @NamedQuery(name = "Columns_1.findByNumericPrecision", query = "SELECT c FROM Columns_1 c WHERE c.numericPrecision = :numericPrecision"),
    @NamedQuery(name = "Columns_1.findByNumericPrecisionRadix", query = "SELECT c FROM Columns_1 c WHERE c.numericPrecisionRadix = :numericPrecisionRadix"),
    @NamedQuery(name = "Columns_1.findByNumericScale", query = "SELECT c FROM Columns_1 c WHERE c.numericScale = :numericScale"),
    @NamedQuery(name = "Columns_1.findByDatetimePrecision", query = "SELECT c FROM Columns_1 c WHERE c.datetimePrecision = :datetimePrecision"),
    @NamedQuery(name = "Columns_1.findByCharacterSetCatalog", query = "SELECT c FROM Columns_1 c WHERE c.characterSetCatalog = :characterSetCatalog"),
    @NamedQuery(name = "Columns_1.findByCharacterSetSchema", query = "SELECT c FROM Columns_1 c WHERE c.characterSetSchema = :characterSetSchema"),
    @NamedQuery(name = "Columns_1.findByCharacterSetName", query = "SELECT c FROM Columns_1 c WHERE c.characterSetName = :characterSetName"),
    @NamedQuery(name = "Columns_1.findByCollationCatalog", query = "SELECT c FROM Columns_1 c WHERE c.collationCatalog = :collationCatalog"),
    @NamedQuery(name = "Columns_1.findByCollationSchema", query = "SELECT c FROM Columns_1 c WHERE c.collationSchema = :collationSchema"),
    @NamedQuery(name = "Columns_1.findByCollationName", query = "SELECT c FROM Columns_1 c WHERE c.collationName = :collationName"),
    @NamedQuery(name = "Columns_1.findByDomainCatalog", query = "SELECT c FROM Columns_1 c WHERE c.domainCatalog = :domainCatalog"),
    @NamedQuery(name = "Columns_1.findByDomainSchema", query = "SELECT c FROM Columns_1 c WHERE c.domainSchema = :domainSchema"),
    @NamedQuery(name = "Columns_1.findByDomainName", query = "SELECT c FROM Columns_1 c WHERE c.domainName = :domainName"),
    @NamedQuery(name = "Columns_1.findByObjectId", query = "SELECT c FROM Columns_1 c WHERE c.objectId = :objectId"),
    @NamedQuery(name = "Columns_1.findByName", query = "SELECT c FROM Columns_1 c WHERE c.name = :name"),
    @NamedQuery(name = "Columns_1.findByColumnId", query = "SELECT c FROM Columns_1 c WHERE c.columnId = :columnId"),
    @NamedQuery(name = "Columns_1.findBySystemTypeId", query = "SELECT c FROM Columns_1 c WHERE c.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "Columns_1.findByUserTypeId", query = "SELECT c FROM Columns_1 c WHERE c.userTypeId = :userTypeId"),
    @NamedQuery(name = "Columns_1.findByMaxLength", query = "SELECT c FROM Columns_1 c WHERE c.maxLength = :maxLength"),
    @NamedQuery(name = "Columns_1.findByPrecision", query = "SELECT c FROM Columns_1 c WHERE c.precision = :precision"),
    @NamedQuery(name = "Columns_1.findByScale", query = "SELECT c FROM Columns_1 c WHERE c.scale = :scale"),
    @NamedQuery(name = "Columns_1.findByCollationName1", query = "SELECT c FROM Columns_1 c WHERE c.collationName1 = :collationName1"),
    @NamedQuery(name = "Columns_1.findByIsNullable1", query = "SELECT c FROM Columns_1 c WHERE c.isNullable1 = :isNullable1"),
    @NamedQuery(name = "Columns_1.findByIsAnsiPadded", query = "SELECT c FROM Columns_1 c WHERE c.isAnsiPadded = :isAnsiPadded"),
    @NamedQuery(name = "Columns_1.findByIsRowguidcol", query = "SELECT c FROM Columns_1 c WHERE c.isRowguidcol = :isRowguidcol"),
    @NamedQuery(name = "Columns_1.findByIsIdentity", query = "SELECT c FROM Columns_1 c WHERE c.isIdentity = :isIdentity"),
    @NamedQuery(name = "Columns_1.findByIsComputed", query = "SELECT c FROM Columns_1 c WHERE c.isComputed = :isComputed"),
    @NamedQuery(name = "Columns_1.findByIsFilestream", query = "SELECT c FROM Columns_1 c WHERE c.isFilestream = :isFilestream"),
    @NamedQuery(name = "Columns_1.findByIsReplicated", query = "SELECT c FROM Columns_1 c WHERE c.isReplicated = :isReplicated"),
    @NamedQuery(name = "Columns_1.findByIsNonSqlSubscribed", query = "SELECT c FROM Columns_1 c WHERE c.isNonSqlSubscribed = :isNonSqlSubscribed"),
    @NamedQuery(name = "Columns_1.findByIsMergePublished", query = "SELECT c FROM Columns_1 c WHERE c.isMergePublished = :isMergePublished"),
    @NamedQuery(name = "Columns_1.findByIsDtsReplicated", query = "SELECT c FROM Columns_1 c WHERE c.isDtsReplicated = :isDtsReplicated"),
    @NamedQuery(name = "Columns_1.findByIsXmlDocument", query = "SELECT c FROM Columns_1 c WHERE c.isXmlDocument = :isXmlDocument"),
    @NamedQuery(name = "Columns_1.findByXmlCollectionId", query = "SELECT c FROM Columns_1 c WHERE c.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "Columns_1.findByDefaultObjectId", query = "SELECT c FROM Columns_1 c WHERE c.defaultObjectId = :defaultObjectId"),
    @NamedQuery(name = "Columns_1.findByRuleObjectId", query = "SELECT c FROM Columns_1 c WHERE c.ruleObjectId = :ruleObjectId"),
    @NamedQuery(name = "Columns_1.findByIsSparse", query = "SELECT c FROM Columns_1 c WHERE c.isSparse = :isSparse"),
    @NamedQuery(name = "Columns_1.findByIsColumnSet", query = "SELECT c FROM Columns_1 c WHERE c.isColumnSet = :isColumnSet"),
    @NamedQuery(name = "Columns_1.findByGeneratedAlwaysType", query = "SELECT c FROM Columns_1 c WHERE c.generatedAlwaysType = :generatedAlwaysType"),
    @NamedQuery(name = "Columns_1.findByGeneratedAlwaysTypeDesc", query = "SELECT c FROM Columns_1 c WHERE c.generatedAlwaysTypeDesc = :generatedAlwaysTypeDesc"),
    @NamedQuery(name = "Columns_1.findByEncryptionType", query = "SELECT c FROM Columns_1 c WHERE c.encryptionType = :encryptionType"),
    @NamedQuery(name = "Columns_1.findByEncryptionTypeDesc", query = "SELECT c FROM Columns_1 c WHERE c.encryptionTypeDesc = :encryptionTypeDesc"),
    @NamedQuery(name = "Columns_1.findByEncryptionAlgorithmName", query = "SELECT c FROM Columns_1 c WHERE c.encryptionAlgorithmName = :encryptionAlgorithmName"),
    @NamedQuery(name = "Columns_1.findByColumnEncryptionKeyId", query = "SELECT c FROM Columns_1 c WHERE c.columnEncryptionKeyId = :columnEncryptionKeyId"),
    @NamedQuery(name = "Columns_1.findByColumnEncryptionKeyDatabaseName", query = "SELECT c FROM Columns_1 c WHERE c.columnEncryptionKeyDatabaseName = :columnEncryptionKeyDatabaseName"),
    @NamedQuery(name = "Columns_1.findByIsHidden", query = "SELECT c FROM Columns_1 c WHERE c.isHidden = :isHidden"),
    @NamedQuery(name = "Columns_1.findByIsMasked", query = "SELECT c FROM Columns_1 c WHERE c.isMasked = :isMasked"),
    @NamedQuery(name = "Columns_1.findByGraphType", query = "SELECT c FROM Columns_1 c WHERE c.graphType = :graphType"),
    @NamedQuery(name = "Columns_1.findByGraphTypeDesc", query = "SELECT c FROM Columns_1 c WHERE c.graphTypeDesc = :graphTypeDesc"),
    @NamedQuery(name = "Columns_1.findByIsDataDeletionFilterColumn", query = "SELECT c FROM Columns_1 c WHERE c.isDataDeletionFilterColumn = :isDataDeletionFilterColumn"),
    @NamedQuery(name = "Columns_1.findByLedgerViewColumnType", query = "SELECT c FROM Columns_1 c WHERE c.ledgerViewColumnType = :ledgerViewColumnType"),
    @NamedQuery(name = "Columns_1.findByLedgerViewColumnTypeDesc", query = "SELECT c FROM Columns_1 c WHERE c.ledgerViewColumnTypeDesc = :ledgerViewColumnTypeDesc"),
    @NamedQuery(name = "Columns_1.findByIsDroppedLedgerColumn", query = "SELECT c FROM Columns_1 c WHERE c.isDroppedLedgerColumn = :isDroppedLedgerColumn")})
@Entity
@Table(name = "columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Columns_1.findAll", query = "SELECT c FROM Columns_1 c"),
    @NamedQuery(name = "Columns_1.findByTableCatalog", query = "SELECT c FROM Columns_1 c WHERE c.tableCatalog = :tableCatalog"),
    @NamedQuery(name = "Columns_1.findByTableSchema", query = "SELECT c FROM Columns_1 c WHERE c.tableSchema = :tableSchema"),
    @NamedQuery(name = "Columns_1.findByTableName", query = "SELECT c FROM Columns_1 c WHERE c.tableName = :tableName"),
    @NamedQuery(name = "Columns_1.findByColumnName", query = "SELECT c FROM Columns_1 c WHERE c.columnName = :columnName"),
    @NamedQuery(name = "Columns_1.findByOrdinalPosition", query = "SELECT c FROM Columns_1 c WHERE c.ordinalPosition = :ordinalPosition"),
    @NamedQuery(name = "Columns_1.findByColumnDefault", query = "SELECT c FROM Columns_1 c WHERE c.columnDefault = :columnDefault"),
    @NamedQuery(name = "Columns_1.findByIsNullable", query = "SELECT c FROM Columns_1 c WHERE c.isNullable = :isNullable"),
    @NamedQuery(name = "Columns_1.findByDataType", query = "SELECT c FROM Columns_1 c WHERE c.dataType = :dataType"),
    @NamedQuery(name = "Columns_1.findByCharacterMaximumLength", query = "SELECT c FROM Columns_1 c WHERE c.characterMaximumLength = :characterMaximumLength"),
    @NamedQuery(name = "Columns_1.findByCharacterOctetLength", query = "SELECT c FROM Columns_1 c WHERE c.characterOctetLength = :characterOctetLength"),
    @NamedQuery(name = "Columns_1.findByNumericPrecision", query = "SELECT c FROM Columns_1 c WHERE c.numericPrecision = :numericPrecision"),
    @NamedQuery(name = "Columns_1.findByNumericPrecisionRadix", query = "SELECT c FROM Columns_1 c WHERE c.numericPrecisionRadix = :numericPrecisionRadix"),
    @NamedQuery(name = "Columns_1.findByNumericScale", query = "SELECT c FROM Columns_1 c WHERE c.numericScale = :numericScale"),
    @NamedQuery(name = "Columns_1.findByDatetimePrecision", query = "SELECT c FROM Columns_1 c WHERE c.datetimePrecision = :datetimePrecision"),
    @NamedQuery(name = "Columns_1.findByCharacterSetCatalog", query = "SELECT c FROM Columns_1 c WHERE c.characterSetCatalog = :characterSetCatalog"),
    @NamedQuery(name = "Columns_1.findByCharacterSetSchema", query = "SELECT c FROM Columns_1 c WHERE c.characterSetSchema = :characterSetSchema"),
    @NamedQuery(name = "Columns_1.findByCharacterSetName", query = "SELECT c FROM Columns_1 c WHERE c.characterSetName = :characterSetName"),
    @NamedQuery(name = "Columns_1.findByCollationCatalog", query = "SELECT c FROM Columns_1 c WHERE c.collationCatalog = :collationCatalog"),
    @NamedQuery(name = "Columns_1.findByCollationSchema", query = "SELECT c FROM Columns_1 c WHERE c.collationSchema = :collationSchema"),
    @NamedQuery(name = "Columns_1.findByCollationName", query = "SELECT c FROM Columns_1 c WHERE c.collationName = :collationName"),
    @NamedQuery(name = "Columns_1.findByDomainCatalog", query = "SELECT c FROM Columns_1 c WHERE c.domainCatalog = :domainCatalog"),
    @NamedQuery(name = "Columns_1.findByDomainSchema", query = "SELECT c FROM Columns_1 c WHERE c.domainSchema = :domainSchema"),
    @NamedQuery(name = "Columns_1.findByDomainName", query = "SELECT c FROM Columns_1 c WHERE c.domainName = :domainName"),
    @NamedQuery(name = "Columns_1.findByObjectId", query = "SELECT c FROM Columns_1 c WHERE c.objectId = :objectId"),
    @NamedQuery(name = "Columns_1.findByName", query = "SELECT c FROM Columns_1 c WHERE c.name = :name"),
    @NamedQuery(name = "Columns_1.findByColumnId", query = "SELECT c FROM Columns_1 c WHERE c.columnId = :columnId"),
    @NamedQuery(name = "Columns_1.findBySystemTypeId", query = "SELECT c FROM Columns_1 c WHERE c.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "Columns_1.findByUserTypeId", query = "SELECT c FROM Columns_1 c WHERE c.userTypeId = :userTypeId"),
    @NamedQuery(name = "Columns_1.findByMaxLength", query = "SELECT c FROM Columns_1 c WHERE c.maxLength = :maxLength"),
    @NamedQuery(name = "Columns_1.findByPrecision", query = "SELECT c FROM Columns_1 c WHERE c.precision = :precision"),
    @NamedQuery(name = "Columns_1.findByScale", query = "SELECT c FROM Columns_1 c WHERE c.scale = :scale"),
    @NamedQuery(name = "Columns_1.findByCollationName1", query = "SELECT c FROM Columns_1 c WHERE c.collationName1 = :collationName1"),
    @NamedQuery(name = "Columns_1.findByIsNullable1", query = "SELECT c FROM Columns_1 c WHERE c.isNullable1 = :isNullable1"),
    @NamedQuery(name = "Columns_1.findByIsAnsiPadded", query = "SELECT c FROM Columns_1 c WHERE c.isAnsiPadded = :isAnsiPadded"),
    @NamedQuery(name = "Columns_1.findByIsRowguidcol", query = "SELECT c FROM Columns_1 c WHERE c.isRowguidcol = :isRowguidcol"),
    @NamedQuery(name = "Columns_1.findByIsIdentity", query = "SELECT c FROM Columns_1 c WHERE c.isIdentity = :isIdentity"),
    @NamedQuery(name = "Columns_1.findByIsComputed", query = "SELECT c FROM Columns_1 c WHERE c.isComputed = :isComputed"),
    @NamedQuery(name = "Columns_1.findByIsFilestream", query = "SELECT c FROM Columns_1 c WHERE c.isFilestream = :isFilestream"),
    @NamedQuery(name = "Columns_1.findByIsReplicated", query = "SELECT c FROM Columns_1 c WHERE c.isReplicated = :isReplicated"),
    @NamedQuery(name = "Columns_1.findByIsNonSqlSubscribed", query = "SELECT c FROM Columns_1 c WHERE c.isNonSqlSubscribed = :isNonSqlSubscribed"),
    @NamedQuery(name = "Columns_1.findByIsMergePublished", query = "SELECT c FROM Columns_1 c WHERE c.isMergePublished = :isMergePublished"),
    @NamedQuery(name = "Columns_1.findByIsDtsReplicated", query = "SELECT c FROM Columns_1 c WHERE c.isDtsReplicated = :isDtsReplicated"),
    @NamedQuery(name = "Columns_1.findByIsXmlDocument", query = "SELECT c FROM Columns_1 c WHERE c.isXmlDocument = :isXmlDocument"),
    @NamedQuery(name = "Columns_1.findByXmlCollectionId", query = "SELECT c FROM Columns_1 c WHERE c.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "Columns_1.findByDefaultObjectId", query = "SELECT c FROM Columns_1 c WHERE c.defaultObjectId = :defaultObjectId"),
    @NamedQuery(name = "Columns_1.findByRuleObjectId", query = "SELECT c FROM Columns_1 c WHERE c.ruleObjectId = :ruleObjectId"),
    @NamedQuery(name = "Columns_1.findByIsSparse", query = "SELECT c FROM Columns_1 c WHERE c.isSparse = :isSparse"),
    @NamedQuery(name = "Columns_1.findByIsColumnSet", query = "SELECT c FROM Columns_1 c WHERE c.isColumnSet = :isColumnSet"),
    @NamedQuery(name = "Columns_1.findByGeneratedAlwaysType", query = "SELECT c FROM Columns_1 c WHERE c.generatedAlwaysType = :generatedAlwaysType"),
    @NamedQuery(name = "Columns_1.findByGeneratedAlwaysTypeDesc", query = "SELECT c FROM Columns_1 c WHERE c.generatedAlwaysTypeDesc = :generatedAlwaysTypeDesc"),
    @NamedQuery(name = "Columns_1.findByEncryptionType", query = "SELECT c FROM Columns_1 c WHERE c.encryptionType = :encryptionType"),
    @NamedQuery(name = "Columns_1.findByEncryptionTypeDesc", query = "SELECT c FROM Columns_1 c WHERE c.encryptionTypeDesc = :encryptionTypeDesc"),
    @NamedQuery(name = "Columns_1.findByEncryptionAlgorithmName", query = "SELECT c FROM Columns_1 c WHERE c.encryptionAlgorithmName = :encryptionAlgorithmName"),
    @NamedQuery(name = "Columns_1.findByColumnEncryptionKeyId", query = "SELECT c FROM Columns_1 c WHERE c.columnEncryptionKeyId = :columnEncryptionKeyId"),
    @NamedQuery(name = "Columns_1.findByColumnEncryptionKeyDatabaseName", query = "SELECT c FROM Columns_1 c WHERE c.columnEncryptionKeyDatabaseName = :columnEncryptionKeyDatabaseName"),
    @NamedQuery(name = "Columns_1.findByIsHidden", query = "SELECT c FROM Columns_1 c WHERE c.isHidden = :isHidden"),
    @NamedQuery(name = "Columns_1.findByIsMasked", query = "SELECT c FROM Columns_1 c WHERE c.isMasked = :isMasked"),
    @NamedQuery(name = "Columns_1.findByGraphType", query = "SELECT c FROM Columns_1 c WHERE c.graphType = :graphType"),
    @NamedQuery(name = "Columns_1.findByGraphTypeDesc", query = "SELECT c FROM Columns_1 c WHERE c.graphTypeDesc = :graphTypeDesc"),
    @NamedQuery(name = "Columns_1.findByIsDataDeletionFilterColumn", query = "SELECT c FROM Columns_1 c WHERE c.isDataDeletionFilterColumn = :isDataDeletionFilterColumn"),
    @NamedQuery(name = "Columns_1.findByLedgerViewColumnType", query = "SELECT c FROM Columns_1 c WHERE c.ledgerViewColumnType = :ledgerViewColumnType"),
    @NamedQuery(name = "Columns_1.findByLedgerViewColumnTypeDesc", query = "SELECT c FROM Columns_1 c WHERE c.ledgerViewColumnTypeDesc = :ledgerViewColumnTypeDesc"),
    @NamedQuery(name = "Columns_1.findByIsDroppedLedgerColumn", query = "SELECT c FROM Columns_1 c WHERE c.isDroppedLedgerColumn = :isDroppedLedgerColumn")})
public class Columns_1 implements Serializable, Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;
    @Size(max = 128)
    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Size(max = 128)
    @Column(name = "COLUMN_NAME")
    private String columnName;
    @Column(name = "ORDINAL_POSITION")
    private Integer ordinalPosition;
    @Size(max = 4000)
    @Column(name = "COLUMN_DEFAULT")
    private String columnDefault;
    @Size(max = 3)
    @Column(name = "IS_NULLABLE")
    private String isNullable;
    @Size(max = 128)
    @Column(name = "DATA_TYPE")
    private String dataType;
    @Column(name = "CHARACTER_MAXIMUM_LENGTH")
    private Integer characterMaximumLength;
    @Column(name = "CHARACTER_OCTET_LENGTH")
    private Integer characterOctetLength;
    @Column(name = "NUMERIC_PRECISION")
    private Short numericPrecision;
    @Column(name = "NUMERIC_PRECISION_RADIX")
    private Short numericPrecisionRadix;
    @Column(name = "NUMERIC_SCALE")
    private Integer numericScale;
    @Column(name = "DATETIME_PRECISION")
    private Short datetimePrecision;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_CATALOG")
    private String characterSetCatalog;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_SCHEMA")
    private String characterSetSchema;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;
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
    @Column(name = "DOMAIN_CATALOG")
    private String domainCatalog;
    @Size(max = 128)
    @Column(name = "DOMAIN_SCHEMA")
    private String domainSchema;
    @Size(max = 128)
    @Column(name = "DOMAIN_NAME")
    private String domainName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_id")
    private int columnId;
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
    @Size(max = 128)
    @Column(name = "collation_name")
    private String collationName1;
    @Column(name = "is_nullable")
    private Boolean isNullable1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_ansi_padded")
    private boolean isAnsiPadded;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_rowguidcol")
    private boolean isRowguidcol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_identity")
    private boolean isIdentity;
    @Column(name = "is_computed")
    private Boolean isComputed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_filestream")
    private boolean isFilestream;
    @Column(name = "is_replicated")
    private Boolean isReplicated;
    @Column(name = "is_non_sql_subscribed")
    private Boolean isNonSqlSubscribed;
    @Column(name = "is_merge_published")
    private Boolean isMergePublished;
    @Column(name = "is_dts_replicated")
    private Boolean isDtsReplicated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_xml_document")
    private boolean isXmlDocument;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_collection_id")
    private int xmlCollectionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "default_object_id")
    private int defaultObjectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rule_object_id")
    private int ruleObjectId;
    @Column(name = "is_sparse")
    private Boolean isSparse;
    @Column(name = "is_column_set")
    private Boolean isColumnSet;
    @Column(name = "generated_always_type")
    private Short generatedAlwaysType;
    @Size(max = 60)
    @Column(name = "generated_always_type_desc")
    private String generatedAlwaysTypeDesc;
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
    @Column(name = "is_hidden")
    private Boolean isHidden;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_masked")
    private boolean isMasked;
    @Column(name = "graph_type")
    private Integer graphType;
    @Size(max = 60)
    @Column(name = "graph_type_desc")
    private String graphTypeDesc;
    @Column(name = "is_data_deletion_filter_column")
    private Boolean isDataDeletionFilterColumn;
    @Column(name = "ledger_view_column_type")
    private Integer ledgerViewColumnType;
    @Size(max = 60)
    @Column(name = "ledger_view_column_type_desc")
    private String ledgerViewColumnTypeDesc;
    @Column(name = "is_dropped_ledger_column")
    private Boolean isDroppedLedgerColumn;

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;
    @Size(max = 128)
    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Size(max = 128)
    @Column(name = "COLUMN_NAME")
    private String columnName;
    @Column(name = "ORDINAL_POSITION")
    private Integer ordinalPosition;
    @Size(max = 4000)
    @Column(name = "COLUMN_DEFAULT")
    private String columnDefault;
    @Size(max = 3)
    @Column(name = "IS_NULLABLE")
    private String isNullable;
    @Size(max = 128)
    @Column(name = "DATA_TYPE")
    private String dataType;
    @Column(name = "CHARACTER_MAXIMUM_LENGTH")
    private Integer characterMaximumLength;
    @Column(name = "CHARACTER_OCTET_LENGTH")
    private Integer characterOctetLength;
    @Column(name = "NUMERIC_PRECISION")
    private Short numericPrecision;
    @Column(name = "NUMERIC_PRECISION_RADIX")
    private Short numericPrecisionRadix;
    @Column(name = "NUMERIC_SCALE")
    private Integer numericScale;
    @Column(name = "DATETIME_PRECISION")
    private Short datetimePrecision;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_CATALOG")
    private String characterSetCatalog;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_SCHEMA")
    private String characterSetSchema;
    @Size(max = 128)
    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;
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
    @Column(name = "DOMAIN_CATALOG")
    private String domainCatalog;
    @Size(max = 128)
    @Column(name = "DOMAIN_SCHEMA")
    private String domainSchema;
    @Size(max = 128)
    @Column(name = "DOMAIN_NAME")
    private String domainName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_id")
    private int columnId;
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
    @Size(max = 128)
    @Column(name = "collation_name")
    private String collationName1;
    @Column(name = "is_nullable")
    private Boolean isNullable1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_ansi_padded")
    private boolean isAnsiPadded;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_rowguidcol")
    private boolean isRowguidcol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_identity")
    private boolean isIdentity;
    @Column(name = "is_computed")
    private Boolean isComputed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_filestream")
    private boolean isFilestream;
    @Column(name = "is_replicated")
    private Boolean isReplicated;
    @Column(name = "is_non_sql_subscribed")
    private Boolean isNonSqlSubscribed;
    @Column(name = "is_merge_published")
    private Boolean isMergePublished;
    @Column(name = "is_dts_replicated")
    private Boolean isDtsReplicated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_xml_document")
    private boolean isXmlDocument;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_collection_id")
    private int xmlCollectionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "default_object_id")
    private int defaultObjectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rule_object_id")
    private int ruleObjectId;
    @Column(name = "is_sparse")
    private Boolean isSparse;
    @Column(name = "is_column_set")
    private Boolean isColumnSet;
    @Column(name = "generated_always_type")
    private Short generatedAlwaysType;
    @Size(max = 60)
    @Column(name = "generated_always_type_desc")
    private String generatedAlwaysTypeDesc;
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
    @Column(name = "is_hidden")
    private Boolean isHidden;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_masked")
    private boolean isMasked;
    @Column(name = "graph_type")
    private Integer graphType;
    @Size(max = 60)
    @Column(name = "graph_type_desc")
    private String graphTypeDesc;
    @Column(name = "is_data_deletion_filter_column")
    private Boolean isDataDeletionFilterColumn;
    @Column(name = "ledger_view_column_type")
    private Integer ledgerViewColumnType;
    @Size(max = 60)
    @Column(name = "ledger_view_column_type_desc")
    private String ledgerViewColumnTypeDesc;
    @Column(name = "is_dropped_ledger_column")
    private Boolean isDroppedLedgerColumn;

    public Columns_1() {
    }

    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getColumnDefault() {
        return columnDefault;
    }

    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
    }

    public String getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
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

    public String getDomainCatalog() {
        return domainCatalog;
    }

    public void setDomainCatalog(String domainCatalog) {
        this.domainCatalog = domainCatalog;
    }

    public String getDomainSchema() {
        return domainSchema;
    }

    public void setDomainSchema(String domainSchema) {
        this.domainSchema = domainSchema;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
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

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
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

    public String getCollationName1() {
        return collationName1;
    }

    public void setCollationName1(String collationName1) {
        this.collationName1 = collationName1;
    }

    public Boolean getIsNullable1() {
        return isNullable1;
    }

    public void setIsNullable1(Boolean isNullable1) {
        this.isNullable1 = isNullable1;
    }

    public boolean getIsAnsiPadded() {
        return isAnsiPadded;
    }

    public void setIsAnsiPadded(boolean isAnsiPadded) {
        this.isAnsiPadded = isAnsiPadded;
    }

    public boolean getIsRowguidcol() {
        return isRowguidcol;
    }

    public void setIsRowguidcol(boolean isRowguidcol) {
        this.isRowguidcol = isRowguidcol;
    }

    public boolean getIsIdentity() {
        return isIdentity;
    }

    public void setIsIdentity(boolean isIdentity) {
        this.isIdentity = isIdentity;
    }

    public Boolean getIsComputed() {
        return isComputed;
    }

    public void setIsComputed(Boolean isComputed) {
        this.isComputed = isComputed;
    }

    public boolean getIsFilestream() {
        return isFilestream;
    }

    public void setIsFilestream(boolean isFilestream) {
        this.isFilestream = isFilestream;
    }

    public Boolean getIsReplicated() {
        return isReplicated;
    }

    public void setIsReplicated(Boolean isReplicated) {
        this.isReplicated = isReplicated;
    }

    public Boolean getIsNonSqlSubscribed() {
        return isNonSqlSubscribed;
    }

    public void setIsNonSqlSubscribed(Boolean isNonSqlSubscribed) {
        this.isNonSqlSubscribed = isNonSqlSubscribed;
    }

    public Boolean getIsMergePublished() {
        return isMergePublished;
    }

    public void setIsMergePublished(Boolean isMergePublished) {
        this.isMergePublished = isMergePublished;
    }

    public Boolean getIsDtsReplicated() {
        return isDtsReplicated;
    }

    public void setIsDtsReplicated(Boolean isDtsReplicated) {
        this.isDtsReplicated = isDtsReplicated;
    }

    public boolean getIsXmlDocument() {
        return isXmlDocument;
    }

    public void setIsXmlDocument(boolean isXmlDocument) {
        this.isXmlDocument = isXmlDocument;
    }

    public int getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(int xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
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

    public Boolean getIsSparse() {
        return isSparse;
    }

    public void setIsSparse(Boolean isSparse) {
        this.isSparse = isSparse;
    }

    public Boolean getIsColumnSet() {
        return isColumnSet;
    }

    public void setIsColumnSet(Boolean isColumnSet) {
        this.isColumnSet = isColumnSet;
    }

    public Short getGeneratedAlwaysType() {
        return generatedAlwaysType;
    }

    public void setGeneratedAlwaysType(Short generatedAlwaysType) {
        this.generatedAlwaysType = generatedAlwaysType;
    }

    public String getGeneratedAlwaysTypeDesc() {
        return generatedAlwaysTypeDesc;
    }

    public void setGeneratedAlwaysTypeDesc(String generatedAlwaysTypeDesc) {
        this.generatedAlwaysTypeDesc = generatedAlwaysTypeDesc;
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

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public boolean getIsMasked() {
        return isMasked;
    }

    public void setIsMasked(boolean isMasked) {
        this.isMasked = isMasked;
    }

    public Integer getGraphType() {
        return graphType;
    }

    public void setGraphType(Integer graphType) {
        this.graphType = graphType;
    }

    public String getGraphTypeDesc() {
        return graphTypeDesc;
    }

    public void setGraphTypeDesc(String graphTypeDesc) {
        this.graphTypeDesc = graphTypeDesc;
    }

    public Boolean getIsDataDeletionFilterColumn() {
        return isDataDeletionFilterColumn;
    }

    public void setIsDataDeletionFilterColumn(Boolean isDataDeletionFilterColumn) {
        this.isDataDeletionFilterColumn = isDataDeletionFilterColumn;
    }

    public Integer getLedgerViewColumnType() {
        return ledgerViewColumnType;
    }

    public void setLedgerViewColumnType(Integer ledgerViewColumnType) {
        this.ledgerViewColumnType = ledgerViewColumnType;
    }

    public String getLedgerViewColumnTypeDesc() {
        return ledgerViewColumnTypeDesc;
    }

    public void setLedgerViewColumnTypeDesc(String ledgerViewColumnTypeDesc) {
        this.ledgerViewColumnTypeDesc = ledgerViewColumnTypeDesc;
    }

    public Boolean getIsDroppedLedgerColumn() {
        return isDroppedLedgerColumn;
    }

    public void setIsDroppedLedgerColumn(Boolean isDroppedLedgerColumn) {
        this.isDroppedLedgerColumn = isDroppedLedgerColumn;
    }

    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getColumnDefault() {
        return columnDefault;
    }

    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
    }

    public String getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
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

    public String getDomainCatalog() {
        return domainCatalog;
    }

    public void setDomainCatalog(String domainCatalog) {
        this.domainCatalog = domainCatalog;
    }

    public String getDomainSchema() {
        return domainSchema;
    }

    public void setDomainSchema(String domainSchema) {
        this.domainSchema = domainSchema;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
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

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
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

    public String getCollationName1() {
        return collationName1;
    }

    public void setCollationName1(String collationName1) {
        this.collationName1 = collationName1;
    }

    public Boolean getIsNullable1() {
        return isNullable1;
    }

    public void setIsNullable1(Boolean isNullable1) {
        this.isNullable1 = isNullable1;
    }

    public boolean getIsAnsiPadded() {
        return isAnsiPadded;
    }

    public void setIsAnsiPadded(boolean isAnsiPadded) {
        this.isAnsiPadded = isAnsiPadded;
    }

    public boolean getIsRowguidcol() {
        return isRowguidcol;
    }

    public void setIsRowguidcol(boolean isRowguidcol) {
        this.isRowguidcol = isRowguidcol;
    }

    public boolean getIsIdentity() {
        return isIdentity;
    }

    public void setIsIdentity(boolean isIdentity) {
        this.isIdentity = isIdentity;
    }

    public Boolean getIsComputed() {
        return isComputed;
    }

    public void setIsComputed(Boolean isComputed) {
        this.isComputed = isComputed;
    }

    public boolean getIsFilestream() {
        return isFilestream;
    }

    public void setIsFilestream(boolean isFilestream) {
        this.isFilestream = isFilestream;
    }

    public Boolean getIsReplicated() {
        return isReplicated;
    }

    public void setIsReplicated(Boolean isReplicated) {
        this.isReplicated = isReplicated;
    }

    public Boolean getIsNonSqlSubscribed() {
        return isNonSqlSubscribed;
    }

    public void setIsNonSqlSubscribed(Boolean isNonSqlSubscribed) {
        this.isNonSqlSubscribed = isNonSqlSubscribed;
    }

    public Boolean getIsMergePublished() {
        return isMergePublished;
    }

    public void setIsMergePublished(Boolean isMergePublished) {
        this.isMergePublished = isMergePublished;
    }

    public Boolean getIsDtsReplicated() {
        return isDtsReplicated;
    }

    public void setIsDtsReplicated(Boolean isDtsReplicated) {
        this.isDtsReplicated = isDtsReplicated;
    }

    public boolean getIsXmlDocument() {
        return isXmlDocument;
    }

    public void setIsXmlDocument(boolean isXmlDocument) {
        this.isXmlDocument = isXmlDocument;
    }

    public int getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(int xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
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

    public Boolean getIsSparse() {
        return isSparse;
    }

    public void setIsSparse(Boolean isSparse) {
        this.isSparse = isSparse;
    }

    public Boolean getIsColumnSet() {
        return isColumnSet;
    }

    public void setIsColumnSet(Boolean isColumnSet) {
        this.isColumnSet = isColumnSet;
    }

    public Short getGeneratedAlwaysType() {
        return generatedAlwaysType;
    }

    public void setGeneratedAlwaysType(Short generatedAlwaysType) {
        this.generatedAlwaysType = generatedAlwaysType;
    }

    public String getGeneratedAlwaysTypeDesc() {
        return generatedAlwaysTypeDesc;
    }

    public void setGeneratedAlwaysTypeDesc(String generatedAlwaysTypeDesc) {
        this.generatedAlwaysTypeDesc = generatedAlwaysTypeDesc;
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

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public boolean getIsMasked() {
        return isMasked;
    }

    public void setIsMasked(boolean isMasked) {
        this.isMasked = isMasked;
    }

    public Integer getGraphType() {
        return graphType;
    }

    public void setGraphType(Integer graphType) {
        this.graphType = graphType;
    }

    public String getGraphTypeDesc() {
        return graphTypeDesc;
    }

    public void setGraphTypeDesc(String graphTypeDesc) {
        this.graphTypeDesc = graphTypeDesc;
    }

    public Boolean getIsDataDeletionFilterColumn() {
        return isDataDeletionFilterColumn;
    }

    public void setIsDataDeletionFilterColumn(Boolean isDataDeletionFilterColumn) {
        this.isDataDeletionFilterColumn = isDataDeletionFilterColumn;
    }

    public Integer getLedgerViewColumnType() {
        return ledgerViewColumnType;
    }

    public void setLedgerViewColumnType(Integer ledgerViewColumnType) {
        this.ledgerViewColumnType = ledgerViewColumnType;
    }

    public String getLedgerViewColumnTypeDesc() {
        return ledgerViewColumnTypeDesc;
    }

    public void setLedgerViewColumnTypeDesc(String ledgerViewColumnTypeDesc) {
        this.ledgerViewColumnTypeDesc = ledgerViewColumnTypeDesc;
    }

    public Boolean getIsDroppedLedgerColumn() {
        return isDroppedLedgerColumn;
    }

    public void setIsDroppedLedgerColumn(Boolean isDroppedLedgerColumn) {
        this.isDroppedLedgerColumn = isDroppedLedgerColumn;
    }
    
}
