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
@Table(name = "system_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SystemColumns.findAll", query = "SELECT s FROM SystemColumns s"),
    @NamedQuery(name = "SystemColumns.findByObjectId", query = "SELECT s FROM SystemColumns s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "SystemColumns.findByName", query = "SELECT s FROM SystemColumns s WHERE s.name = :name"),
    @NamedQuery(name = "SystemColumns.findByColumnId", query = "SELECT s FROM SystemColumns s WHERE s.columnId = :columnId"),
    @NamedQuery(name = "SystemColumns.findBySystemTypeId", query = "SELECT s FROM SystemColumns s WHERE s.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "SystemColumns.findByUserTypeId", query = "SELECT s FROM SystemColumns s WHERE s.userTypeId = :userTypeId"),
    @NamedQuery(name = "SystemColumns.findByMaxLength", query = "SELECT s FROM SystemColumns s WHERE s.maxLength = :maxLength"),
    @NamedQuery(name = "SystemColumns.findByPrecision", query = "SELECT s FROM SystemColumns s WHERE s.precision = :precision"),
    @NamedQuery(name = "SystemColumns.findByScale", query = "SELECT s FROM SystemColumns s WHERE s.scale = :scale"),
    @NamedQuery(name = "SystemColumns.findByCollationName", query = "SELECT s FROM SystemColumns s WHERE s.collationName = :collationName"),
    @NamedQuery(name = "SystemColumns.findByIsNullable", query = "SELECT s FROM SystemColumns s WHERE s.isNullable = :isNullable"),
    @NamedQuery(name = "SystemColumns.findByIsAnsiPadded", query = "SELECT s FROM SystemColumns s WHERE s.isAnsiPadded = :isAnsiPadded"),
    @NamedQuery(name = "SystemColumns.findByIsRowguidcol", query = "SELECT s FROM SystemColumns s WHERE s.isRowguidcol = :isRowguidcol"),
    @NamedQuery(name = "SystemColumns.findByIsIdentity", query = "SELECT s FROM SystemColumns s WHERE s.isIdentity = :isIdentity"),
    @NamedQuery(name = "SystemColumns.findByIsComputed", query = "SELECT s FROM SystemColumns s WHERE s.isComputed = :isComputed"),
    @NamedQuery(name = "SystemColumns.findByIsFilestream", query = "SELECT s FROM SystemColumns s WHERE s.isFilestream = :isFilestream"),
    @NamedQuery(name = "SystemColumns.findByIsReplicated", query = "SELECT s FROM SystemColumns s WHERE s.isReplicated = :isReplicated"),
    @NamedQuery(name = "SystemColumns.findByIsNonSqlSubscribed", query = "SELECT s FROM SystemColumns s WHERE s.isNonSqlSubscribed = :isNonSqlSubscribed"),
    @NamedQuery(name = "SystemColumns.findByIsMergePublished", query = "SELECT s FROM SystemColumns s WHERE s.isMergePublished = :isMergePublished"),
    @NamedQuery(name = "SystemColumns.findByIsDtsReplicated", query = "SELECT s FROM SystemColumns s WHERE s.isDtsReplicated = :isDtsReplicated"),
    @NamedQuery(name = "SystemColumns.findByIsXmlDocument", query = "SELECT s FROM SystemColumns s WHERE s.isXmlDocument = :isXmlDocument"),
    @NamedQuery(name = "SystemColumns.findByXmlCollectionId", query = "SELECT s FROM SystemColumns s WHERE s.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "SystemColumns.findByDefaultObjectId", query = "SELECT s FROM SystemColumns s WHERE s.defaultObjectId = :defaultObjectId"),
    @NamedQuery(name = "SystemColumns.findByRuleObjectId", query = "SELECT s FROM SystemColumns s WHERE s.ruleObjectId = :ruleObjectId"),
    @NamedQuery(name = "SystemColumns.findByIsSparse", query = "SELECT s FROM SystemColumns s WHERE s.isSparse = :isSparse"),
    @NamedQuery(name = "SystemColumns.findByIsColumnSet", query = "SELECT s FROM SystemColumns s WHERE s.isColumnSet = :isColumnSet"),
    @NamedQuery(name = "SystemColumns.findByGeneratedAlwaysType", query = "SELECT s FROM SystemColumns s WHERE s.generatedAlwaysType = :generatedAlwaysType"),
    @NamedQuery(name = "SystemColumns.findByGeneratedAlwaysTypeDesc", query = "SELECT s FROM SystemColumns s WHERE s.generatedAlwaysTypeDesc = :generatedAlwaysTypeDesc"),
    @NamedQuery(name = "SystemColumns.findByEncryptionType", query = "SELECT s FROM SystemColumns s WHERE s.encryptionType = :encryptionType"),
    @NamedQuery(name = "SystemColumns.findByEncryptionTypeDesc", query = "SELECT s FROM SystemColumns s WHERE s.encryptionTypeDesc = :encryptionTypeDesc"),
    @NamedQuery(name = "SystemColumns.findByEncryptionAlgorithmName", query = "SELECT s FROM SystemColumns s WHERE s.encryptionAlgorithmName = :encryptionAlgorithmName"),
    @NamedQuery(name = "SystemColumns.findByColumnEncryptionKeyId", query = "SELECT s FROM SystemColumns s WHERE s.columnEncryptionKeyId = :columnEncryptionKeyId"),
    @NamedQuery(name = "SystemColumns.findByColumnEncryptionKeyDatabaseName", query = "SELECT s FROM SystemColumns s WHERE s.columnEncryptionKeyDatabaseName = :columnEncryptionKeyDatabaseName"),
    @NamedQuery(name = "SystemColumns.findByIsHidden", query = "SELECT s FROM SystemColumns s WHERE s.isHidden = :isHidden"),
    @NamedQuery(name = "SystemColumns.findByIsMasked", query = "SELECT s FROM SystemColumns s WHERE s.isMasked = :isMasked"),
    @NamedQuery(name = "SystemColumns.findByGraphType", query = "SELECT s FROM SystemColumns s WHERE s.graphType = :graphType"),
    @NamedQuery(name = "SystemColumns.findByGraphTypeDesc", query = "SELECT s FROM SystemColumns s WHERE s.graphTypeDesc = :graphTypeDesc"),
    @NamedQuery(name = "SystemColumns.findByIsDataDeletionFilterColumn", query = "SELECT s FROM SystemColumns s WHERE s.isDataDeletionFilterColumn = :isDataDeletionFilterColumn"),
    @NamedQuery(name = "SystemColumns.findByLedgerViewColumnType", query = "SELECT s FROM SystemColumns s WHERE s.ledgerViewColumnType = :ledgerViewColumnType"),
    @NamedQuery(name = "SystemColumns.findByLedgerViewColumnTypeDesc", query = "SELECT s FROM SystemColumns s WHERE s.ledgerViewColumnTypeDesc = :ledgerViewColumnTypeDesc"),
    @NamedQuery(name = "SystemColumns.findByIsDroppedLedgerColumn", query = "SELECT s FROM SystemColumns s WHERE s.isDroppedLedgerColumn = :isDroppedLedgerColumn")})
public class SystemColumns implements Serializable {

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
    @Column(name = "is_computed")
    private boolean isComputed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_filestream")
    private boolean isFilestream;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_replicated")
    private boolean isReplicated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_non_sql_subscribed")
    private boolean isNonSqlSubscribed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_merge_published")
    private boolean isMergePublished;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_dts_replicated")
    private boolean isDtsReplicated;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_data_deletion_filter_column")
    private boolean isDataDeletionFilterColumn;
    @Column(name = "ledger_view_column_type")
    private Integer ledgerViewColumnType;
    @Size(max = 60)
    @Column(name = "ledger_view_column_type_desc")
    private String ledgerViewColumnTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_dropped_ledger_column")
    private boolean isDroppedLedgerColumn;

    public SystemColumns() {
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

    public boolean getIsComputed() {
        return isComputed;
    }

    public void setIsComputed(boolean isComputed) {
        this.isComputed = isComputed;
    }

    public boolean getIsFilestream() {
        return isFilestream;
    }

    public void setIsFilestream(boolean isFilestream) {
        this.isFilestream = isFilestream;
    }

    public boolean getIsReplicated() {
        return isReplicated;
    }

    public void setIsReplicated(boolean isReplicated) {
        this.isReplicated = isReplicated;
    }

    public boolean getIsNonSqlSubscribed() {
        return isNonSqlSubscribed;
    }

    public void setIsNonSqlSubscribed(boolean isNonSqlSubscribed) {
        this.isNonSqlSubscribed = isNonSqlSubscribed;
    }

    public boolean getIsMergePublished() {
        return isMergePublished;
    }

    public void setIsMergePublished(boolean isMergePublished) {
        this.isMergePublished = isMergePublished;
    }

    public boolean getIsDtsReplicated() {
        return isDtsReplicated;
    }

    public void setIsDtsReplicated(boolean isDtsReplicated) {
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

    public boolean getIsDataDeletionFilterColumn() {
        return isDataDeletionFilterColumn;
    }

    public void setIsDataDeletionFilterColumn(boolean isDataDeletionFilterColumn) {
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

    public boolean getIsDroppedLedgerColumn() {
        return isDroppedLedgerColumn;
    }

    public void setIsDroppedLedgerColumn(boolean isDroppedLedgerColumn) {
        this.isDroppedLedgerColumn = isDroppedLedgerColumn;
    }
    
}
