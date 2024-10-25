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
@Table(name = "identity_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IdentityColumns.findAll", query = "SELECT i FROM IdentityColumns i"),
    @NamedQuery(name = "IdentityColumns.findByObjectId", query = "SELECT i FROM IdentityColumns i WHERE i.objectId = :objectId"),
    @NamedQuery(name = "IdentityColumns.findByName", query = "SELECT i FROM IdentityColumns i WHERE i.name = :name"),
    @NamedQuery(name = "IdentityColumns.findByColumnId", query = "SELECT i FROM IdentityColumns i WHERE i.columnId = :columnId"),
    @NamedQuery(name = "IdentityColumns.findBySystemTypeId", query = "SELECT i FROM IdentityColumns i WHERE i.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "IdentityColumns.findByUserTypeId", query = "SELECT i FROM IdentityColumns i WHERE i.userTypeId = :userTypeId"),
    @NamedQuery(name = "IdentityColumns.findByMaxLength", query = "SELECT i FROM IdentityColumns i WHERE i.maxLength = :maxLength"),
    @NamedQuery(name = "IdentityColumns.findByPrecision", query = "SELECT i FROM IdentityColumns i WHERE i.precision = :precision"),
    @NamedQuery(name = "IdentityColumns.findByScale", query = "SELECT i FROM IdentityColumns i WHERE i.scale = :scale"),
    @NamedQuery(name = "IdentityColumns.findByCollationName", query = "SELECT i FROM IdentityColumns i WHERE i.collationName = :collationName"),
    @NamedQuery(name = "IdentityColumns.findByIsNullable", query = "SELECT i FROM IdentityColumns i WHERE i.isNullable = :isNullable"),
    @NamedQuery(name = "IdentityColumns.findByIsAnsiPadded", query = "SELECT i FROM IdentityColumns i WHERE i.isAnsiPadded = :isAnsiPadded"),
    @NamedQuery(name = "IdentityColumns.findByIsRowguidcol", query = "SELECT i FROM IdentityColumns i WHERE i.isRowguidcol = :isRowguidcol"),
    @NamedQuery(name = "IdentityColumns.findByIsIdentity", query = "SELECT i FROM IdentityColumns i WHERE i.isIdentity = :isIdentity"),
    @NamedQuery(name = "IdentityColumns.findByIsFilestream", query = "SELECT i FROM IdentityColumns i WHERE i.isFilestream = :isFilestream"),
    @NamedQuery(name = "IdentityColumns.findByIsReplicated", query = "SELECT i FROM IdentityColumns i WHERE i.isReplicated = :isReplicated"),
    @NamedQuery(name = "IdentityColumns.findByIsNonSqlSubscribed", query = "SELECT i FROM IdentityColumns i WHERE i.isNonSqlSubscribed = :isNonSqlSubscribed"),
    @NamedQuery(name = "IdentityColumns.findByIsMergePublished", query = "SELECT i FROM IdentityColumns i WHERE i.isMergePublished = :isMergePublished"),
    @NamedQuery(name = "IdentityColumns.findByIsDtsReplicated", query = "SELECT i FROM IdentityColumns i WHERE i.isDtsReplicated = :isDtsReplicated"),
    @NamedQuery(name = "IdentityColumns.findByIsXmlDocument", query = "SELECT i FROM IdentityColumns i WHERE i.isXmlDocument = :isXmlDocument"),
    @NamedQuery(name = "IdentityColumns.findByXmlCollectionId", query = "SELECT i FROM IdentityColumns i WHERE i.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "IdentityColumns.findByDefaultObjectId", query = "SELECT i FROM IdentityColumns i WHERE i.defaultObjectId = :defaultObjectId"),
    @NamedQuery(name = "IdentityColumns.findByRuleObjectId", query = "SELECT i FROM IdentityColumns i WHERE i.ruleObjectId = :ruleObjectId"),
    @NamedQuery(name = "IdentityColumns.findBySeedValue", query = "SELECT i FROM IdentityColumns i WHERE i.seedValue = :seedValue"),
    @NamedQuery(name = "IdentityColumns.findByIncrementValue", query = "SELECT i FROM IdentityColumns i WHERE i.incrementValue = :incrementValue"),
    @NamedQuery(name = "IdentityColumns.findByLastValue", query = "SELECT i FROM IdentityColumns i WHERE i.lastValue = :lastValue"),
    @NamedQuery(name = "IdentityColumns.findByIsNotForReplication", query = "SELECT i FROM IdentityColumns i WHERE i.isNotForReplication = :isNotForReplication"),
    @NamedQuery(name = "IdentityColumns.findByIsComputed", query = "SELECT i FROM IdentityColumns i WHERE i.isComputed = :isComputed"),
    @NamedQuery(name = "IdentityColumns.findByIsSparse", query = "SELECT i FROM IdentityColumns i WHERE i.isSparse = :isSparse"),
    @NamedQuery(name = "IdentityColumns.findByIsColumnSet", query = "SELECT i FROM IdentityColumns i WHERE i.isColumnSet = :isColumnSet"),
    @NamedQuery(name = "IdentityColumns.findByGeneratedAlwaysType", query = "SELECT i FROM IdentityColumns i WHERE i.generatedAlwaysType = :generatedAlwaysType"),
    @NamedQuery(name = "IdentityColumns.findByGeneratedAlwaysTypeDesc", query = "SELECT i FROM IdentityColumns i WHERE i.generatedAlwaysTypeDesc = :generatedAlwaysTypeDesc"),
    @NamedQuery(name = "IdentityColumns.findByEncryptionType", query = "SELECT i FROM IdentityColumns i WHERE i.encryptionType = :encryptionType"),
    @NamedQuery(name = "IdentityColumns.findByEncryptionTypeDesc", query = "SELECT i FROM IdentityColumns i WHERE i.encryptionTypeDesc = :encryptionTypeDesc"),
    @NamedQuery(name = "IdentityColumns.findByEncryptionAlgorithmName", query = "SELECT i FROM IdentityColumns i WHERE i.encryptionAlgorithmName = :encryptionAlgorithmName"),
    @NamedQuery(name = "IdentityColumns.findByColumnEncryptionKeyId", query = "SELECT i FROM IdentityColumns i WHERE i.columnEncryptionKeyId = :columnEncryptionKeyId"),
    @NamedQuery(name = "IdentityColumns.findByColumnEncryptionKeyDatabaseName", query = "SELECT i FROM IdentityColumns i WHERE i.columnEncryptionKeyDatabaseName = :columnEncryptionKeyDatabaseName"),
    @NamedQuery(name = "IdentityColumns.findByIsHidden", query = "SELECT i FROM IdentityColumns i WHERE i.isHidden = :isHidden"),
    @NamedQuery(name = "IdentityColumns.findByIsMasked", query = "SELECT i FROM IdentityColumns i WHERE i.isMasked = :isMasked"),
    @NamedQuery(name = "IdentityColumns.findByGraphType", query = "SELECT i FROM IdentityColumns i WHERE i.graphType = :graphType"),
    @NamedQuery(name = "IdentityColumns.findByGraphTypeDesc", query = "SELECT i FROM IdentityColumns i WHERE i.graphTypeDesc = :graphTypeDesc"),
    @NamedQuery(name = "IdentityColumns.findByIsDataDeletionFilterColumn", query = "SELECT i FROM IdentityColumns i WHERE i.isDataDeletionFilterColumn = :isDataDeletionFilterColumn"),
    @NamedQuery(name = "IdentityColumns.findByLedgerViewColumnType", query = "SELECT i FROM IdentityColumns i WHERE i.ledgerViewColumnType = :ledgerViewColumnType"),
    @NamedQuery(name = "IdentityColumns.findByLedgerViewColumnTypeDesc", query = "SELECT i FROM IdentityColumns i WHERE i.ledgerViewColumnTypeDesc = :ledgerViewColumnTypeDesc"),
    @NamedQuery(name = "IdentityColumns.findByIsDroppedLedgerColumn", query = "SELECT i FROM IdentityColumns i WHERE i.isDroppedLedgerColumn = :isDroppedLedgerColumn")})
public class IdentityColumns implements Serializable {

    private static final long serialVersionUID = 1L;
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
    private String collationName;
    @Column(name = "is_nullable")
    private Boolean isNullable;
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
    @Column(name = "seed_value")
    private Serializable seedValue;
    @Column(name = "increment_value")
    private Serializable incrementValue;
    @Column(name = "last_value")
    private Serializable lastValue;
    @Column(name = "is_not_for_replication")
    private Boolean isNotForReplication;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_computed")
    private boolean isComputed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_sparse")
    private boolean isSparse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_column_set")
    private boolean isColumnSet;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_hidden")
    private boolean isHidden;
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

    public IdentityColumns() {
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

    public Serializable getSeedValue() {
        return seedValue;
    }

    public void setSeedValue(Serializable seedValue) {
        this.seedValue = seedValue;
    }

    public Serializable getIncrementValue() {
        return incrementValue;
    }

    public void setIncrementValue(Serializable incrementValue) {
        this.incrementValue = incrementValue;
    }

    public Serializable getLastValue() {
        return lastValue;
    }

    public void setLastValue(Serializable lastValue) {
        this.lastValue = lastValue;
    }

    public Boolean getIsNotForReplication() {
        return isNotForReplication;
    }

    public void setIsNotForReplication(Boolean isNotForReplication) {
        this.isNotForReplication = isNotForReplication;
    }

    public boolean getIsComputed() {
        return isComputed;
    }

    public void setIsComputed(boolean isComputed) {
        this.isComputed = isComputed;
    }

    public boolean getIsSparse() {
        return isSparse;
    }

    public void setIsSparse(boolean isSparse) {
        this.isSparse = isSparse;
    }

    public boolean getIsColumnSet() {
        return isColumnSet;
    }

    public void setIsColumnSet(boolean isColumnSet) {
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

    public boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(boolean isHidden) {
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
