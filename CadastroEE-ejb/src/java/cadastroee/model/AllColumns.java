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
@Table(name = "all_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AllColumns.findAll", query = "SELECT a FROM AllColumns a"),
    @NamedQuery(name = "AllColumns.findByObjectId", query = "SELECT a FROM AllColumns a WHERE a.objectId = :objectId"),
    @NamedQuery(name = "AllColumns.findByName", query = "SELECT a FROM AllColumns a WHERE a.name = :name"),
    @NamedQuery(name = "AllColumns.findByColumnId", query = "SELECT a FROM AllColumns a WHERE a.columnId = :columnId"),
    @NamedQuery(name = "AllColumns.findBySystemTypeId", query = "SELECT a FROM AllColumns a WHERE a.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "AllColumns.findByUserTypeId", query = "SELECT a FROM AllColumns a WHERE a.userTypeId = :userTypeId"),
    @NamedQuery(name = "AllColumns.findByMaxLength", query = "SELECT a FROM AllColumns a WHERE a.maxLength = :maxLength"),
    @NamedQuery(name = "AllColumns.findByPrecision", query = "SELECT a FROM AllColumns a WHERE a.precision = :precision"),
    @NamedQuery(name = "AllColumns.findByScale", query = "SELECT a FROM AllColumns a WHERE a.scale = :scale"),
    @NamedQuery(name = "AllColumns.findByCollationName", query = "SELECT a FROM AllColumns a WHERE a.collationName = :collationName"),
    @NamedQuery(name = "AllColumns.findByIsNullable", query = "SELECT a FROM AllColumns a WHERE a.isNullable = :isNullable"),
    @NamedQuery(name = "AllColumns.findByIsAnsiPadded", query = "SELECT a FROM AllColumns a WHERE a.isAnsiPadded = :isAnsiPadded"),
    @NamedQuery(name = "AllColumns.findByIsRowguidcol", query = "SELECT a FROM AllColumns a WHERE a.isRowguidcol = :isRowguidcol"),
    @NamedQuery(name = "AllColumns.findByIsIdentity", query = "SELECT a FROM AllColumns a WHERE a.isIdentity = :isIdentity"),
    @NamedQuery(name = "AllColumns.findByIsComputed", query = "SELECT a FROM AllColumns a WHERE a.isComputed = :isComputed"),
    @NamedQuery(name = "AllColumns.findByIsFilestream", query = "SELECT a FROM AllColumns a WHERE a.isFilestream = :isFilestream"),
    @NamedQuery(name = "AllColumns.findByIsReplicated", query = "SELECT a FROM AllColumns a WHERE a.isReplicated = :isReplicated"),
    @NamedQuery(name = "AllColumns.findByIsNonSqlSubscribed", query = "SELECT a FROM AllColumns a WHERE a.isNonSqlSubscribed = :isNonSqlSubscribed"),
    @NamedQuery(name = "AllColumns.findByIsMergePublished", query = "SELECT a FROM AllColumns a WHERE a.isMergePublished = :isMergePublished"),
    @NamedQuery(name = "AllColumns.findByIsDtsReplicated", query = "SELECT a FROM AllColumns a WHERE a.isDtsReplicated = :isDtsReplicated"),
    @NamedQuery(name = "AllColumns.findByIsXmlDocument", query = "SELECT a FROM AllColumns a WHERE a.isXmlDocument = :isXmlDocument"),
    @NamedQuery(name = "AllColumns.findByXmlCollectionId", query = "SELECT a FROM AllColumns a WHERE a.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "AllColumns.findByDefaultObjectId", query = "SELECT a FROM AllColumns a WHERE a.defaultObjectId = :defaultObjectId"),
    @NamedQuery(name = "AllColumns.findByRuleObjectId", query = "SELECT a FROM AllColumns a WHERE a.ruleObjectId = :ruleObjectId"),
    @NamedQuery(name = "AllColumns.findByIsSparse", query = "SELECT a FROM AllColumns a WHERE a.isSparse = :isSparse"),
    @NamedQuery(name = "AllColumns.findByIsColumnSet", query = "SELECT a FROM AllColumns a WHERE a.isColumnSet = :isColumnSet"),
    @NamedQuery(name = "AllColumns.findByGeneratedAlwaysType", query = "SELECT a FROM AllColumns a WHERE a.generatedAlwaysType = :generatedAlwaysType"),
    @NamedQuery(name = "AllColumns.findByGeneratedAlwaysTypeDesc", query = "SELECT a FROM AllColumns a WHERE a.generatedAlwaysTypeDesc = :generatedAlwaysTypeDesc"),
    @NamedQuery(name = "AllColumns.findByEncryptionType", query = "SELECT a FROM AllColumns a WHERE a.encryptionType = :encryptionType"),
    @NamedQuery(name = "AllColumns.findByEncryptionTypeDesc", query = "SELECT a FROM AllColumns a WHERE a.encryptionTypeDesc = :encryptionTypeDesc"),
    @NamedQuery(name = "AllColumns.findByEncryptionAlgorithmName", query = "SELECT a FROM AllColumns a WHERE a.encryptionAlgorithmName = :encryptionAlgorithmName"),
    @NamedQuery(name = "AllColumns.findByColumnEncryptionKeyId", query = "SELECT a FROM AllColumns a WHERE a.columnEncryptionKeyId = :columnEncryptionKeyId"),
    @NamedQuery(name = "AllColumns.findByColumnEncryptionKeyDatabaseName", query = "SELECT a FROM AllColumns a WHERE a.columnEncryptionKeyDatabaseName = :columnEncryptionKeyDatabaseName"),
    @NamedQuery(name = "AllColumns.findByIsHidden", query = "SELECT a FROM AllColumns a WHERE a.isHidden = :isHidden"),
    @NamedQuery(name = "AllColumns.findByIsMasked", query = "SELECT a FROM AllColumns a WHERE a.isMasked = :isMasked"),
    @NamedQuery(name = "AllColumns.findByGraphType", query = "SELECT a FROM AllColumns a WHERE a.graphType = :graphType"),
    @NamedQuery(name = "AllColumns.findByGraphTypeDesc", query = "SELECT a FROM AllColumns a WHERE a.graphTypeDesc = :graphTypeDesc"),
    @NamedQuery(name = "AllColumns.findByIsDataDeletionFilterColumn", query = "SELECT a FROM AllColumns a WHERE a.isDataDeletionFilterColumn = :isDataDeletionFilterColumn"),
    @NamedQuery(name = "AllColumns.findByLedgerViewColumnType", query = "SELECT a FROM AllColumns a WHERE a.ledgerViewColumnType = :ledgerViewColumnType"),
    @NamedQuery(name = "AllColumns.findByLedgerViewColumnTypeDesc", query = "SELECT a FROM AllColumns a WHERE a.ledgerViewColumnTypeDesc = :ledgerViewColumnTypeDesc"),
    @NamedQuery(name = "AllColumns.findByIsDroppedLedgerColumn", query = "SELECT a FROM AllColumns a WHERE a.isDroppedLedgerColumn = :isDroppedLedgerColumn")})
public class AllColumns implements Serializable {

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

    public AllColumns() {
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
