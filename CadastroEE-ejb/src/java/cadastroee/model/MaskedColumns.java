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
@Table(name = "masked_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MaskedColumns.findAll", query = "SELECT m FROM MaskedColumns m"),
    @NamedQuery(name = "MaskedColumns.findByObjectId", query = "SELECT m FROM MaskedColumns m WHERE m.objectId = :objectId"),
    @NamedQuery(name = "MaskedColumns.findByName", query = "SELECT m FROM MaskedColumns m WHERE m.name = :name"),
    @NamedQuery(name = "MaskedColumns.findByColumnId", query = "SELECT m FROM MaskedColumns m WHERE m.columnId = :columnId"),
    @NamedQuery(name = "MaskedColumns.findBySystemTypeId", query = "SELECT m FROM MaskedColumns m WHERE m.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "MaskedColumns.findByUserTypeId", query = "SELECT m FROM MaskedColumns m WHERE m.userTypeId = :userTypeId"),
    @NamedQuery(name = "MaskedColumns.findByMaxLength", query = "SELECT m FROM MaskedColumns m WHERE m.maxLength = :maxLength"),
    @NamedQuery(name = "MaskedColumns.findByPrecision", query = "SELECT m FROM MaskedColumns m WHERE m.precision = :precision"),
    @NamedQuery(name = "MaskedColumns.findByScale", query = "SELECT m FROM MaskedColumns m WHERE m.scale = :scale"),
    @NamedQuery(name = "MaskedColumns.findByCollationName", query = "SELECT m FROM MaskedColumns m WHERE m.collationName = :collationName"),
    @NamedQuery(name = "MaskedColumns.findByIsNullable", query = "SELECT m FROM MaskedColumns m WHERE m.isNullable = :isNullable"),
    @NamedQuery(name = "MaskedColumns.findByIsAnsiPadded", query = "SELECT m FROM MaskedColumns m WHERE m.isAnsiPadded = :isAnsiPadded"),
    @NamedQuery(name = "MaskedColumns.findByIsRowguidcol", query = "SELECT m FROM MaskedColumns m WHERE m.isRowguidcol = :isRowguidcol"),
    @NamedQuery(name = "MaskedColumns.findByIsIdentity", query = "SELECT m FROM MaskedColumns m WHERE m.isIdentity = :isIdentity"),
    @NamedQuery(name = "MaskedColumns.findByIsFilestream", query = "SELECT m FROM MaskedColumns m WHERE m.isFilestream = :isFilestream"),
    @NamedQuery(name = "MaskedColumns.findByIsReplicated", query = "SELECT m FROM MaskedColumns m WHERE m.isReplicated = :isReplicated"),
    @NamedQuery(name = "MaskedColumns.findByIsNonSqlSubscribed", query = "SELECT m FROM MaskedColumns m WHERE m.isNonSqlSubscribed = :isNonSqlSubscribed"),
    @NamedQuery(name = "MaskedColumns.findByIsMergePublished", query = "SELECT m FROM MaskedColumns m WHERE m.isMergePublished = :isMergePublished"),
    @NamedQuery(name = "MaskedColumns.findByIsDtsReplicated", query = "SELECT m FROM MaskedColumns m WHERE m.isDtsReplicated = :isDtsReplicated"),
    @NamedQuery(name = "MaskedColumns.findByIsXmlDocument", query = "SELECT m FROM MaskedColumns m WHERE m.isXmlDocument = :isXmlDocument"),
    @NamedQuery(name = "MaskedColumns.findByXmlCollectionId", query = "SELECT m FROM MaskedColumns m WHERE m.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "MaskedColumns.findByDefaultObjectId", query = "SELECT m FROM MaskedColumns m WHERE m.defaultObjectId = :defaultObjectId"),
    @NamedQuery(name = "MaskedColumns.findByRuleObjectId", query = "SELECT m FROM MaskedColumns m WHERE m.ruleObjectId = :ruleObjectId"),
    @NamedQuery(name = "MaskedColumns.findByDefinition", query = "SELECT m FROM MaskedColumns m WHERE m.definition = :definition"),
    @NamedQuery(name = "MaskedColumns.findByUsesDatabaseCollation", query = "SELECT m FROM MaskedColumns m WHERE m.usesDatabaseCollation = :usesDatabaseCollation"),
    @NamedQuery(name = "MaskedColumns.findByIsPersisted", query = "SELECT m FROM MaskedColumns m WHERE m.isPersisted = :isPersisted"),
    @NamedQuery(name = "MaskedColumns.findByIsComputed", query = "SELECT m FROM MaskedColumns m WHERE m.isComputed = :isComputed"),
    @NamedQuery(name = "MaskedColumns.findByIsSparse", query = "SELECT m FROM MaskedColumns m WHERE m.isSparse = :isSparse"),
    @NamedQuery(name = "MaskedColumns.findByIsColumnSet", query = "SELECT m FROM MaskedColumns m WHERE m.isColumnSet = :isColumnSet"),
    @NamedQuery(name = "MaskedColumns.findByGeneratedAlwaysType", query = "SELECT m FROM MaskedColumns m WHERE m.generatedAlwaysType = :generatedAlwaysType"),
    @NamedQuery(name = "MaskedColumns.findByGeneratedAlwaysTypeDesc", query = "SELECT m FROM MaskedColumns m WHERE m.generatedAlwaysTypeDesc = :generatedAlwaysTypeDesc"),
    @NamedQuery(name = "MaskedColumns.findByEncryptionType", query = "SELECT m FROM MaskedColumns m WHERE m.encryptionType = :encryptionType"),
    @NamedQuery(name = "MaskedColumns.findByEncryptionTypeDesc", query = "SELECT m FROM MaskedColumns m WHERE m.encryptionTypeDesc = :encryptionTypeDesc"),
    @NamedQuery(name = "MaskedColumns.findByEncryptionAlgorithmName", query = "SELECT m FROM MaskedColumns m WHERE m.encryptionAlgorithmName = :encryptionAlgorithmName"),
    @NamedQuery(name = "MaskedColumns.findByColumnEncryptionKeyId", query = "SELECT m FROM MaskedColumns m WHERE m.columnEncryptionKeyId = :columnEncryptionKeyId"),
    @NamedQuery(name = "MaskedColumns.findByColumnEncryptionKeyDatabaseName", query = "SELECT m FROM MaskedColumns m WHERE m.columnEncryptionKeyDatabaseName = :columnEncryptionKeyDatabaseName"),
    @NamedQuery(name = "MaskedColumns.findByIsHidden", query = "SELECT m FROM MaskedColumns m WHERE m.isHidden = :isHidden"),
    @NamedQuery(name = "MaskedColumns.findByIsMasked", query = "SELECT m FROM MaskedColumns m WHERE m.isMasked = :isMasked"),
    @NamedQuery(name = "MaskedColumns.findByMaskingFunction", query = "SELECT m FROM MaskedColumns m WHERE m.maskingFunction = :maskingFunction"),
    @NamedQuery(name = "MaskedColumns.findByGraphType", query = "SELECT m FROM MaskedColumns m WHERE m.graphType = :graphType"),
    @NamedQuery(name = "MaskedColumns.findByGraphTypeDesc", query = "SELECT m FROM MaskedColumns m WHERE m.graphTypeDesc = :graphTypeDesc"),
    @NamedQuery(name = "MaskedColumns.findByIsDataDeletionFilterColumn", query = "SELECT m FROM MaskedColumns m WHERE m.isDataDeletionFilterColumn = :isDataDeletionFilterColumn"),
    @NamedQuery(name = "MaskedColumns.findByLedgerViewColumnType", query = "SELECT m FROM MaskedColumns m WHERE m.ledgerViewColumnType = :ledgerViewColumnType"),
    @NamedQuery(name = "MaskedColumns.findByLedgerViewColumnTypeDesc", query = "SELECT m FROM MaskedColumns m WHERE m.ledgerViewColumnTypeDesc = :ledgerViewColumnTypeDesc"),
    @NamedQuery(name = "MaskedColumns.findByIsDroppedLedgerColumn", query = "SELECT m FROM MaskedColumns m WHERE m.isDroppedLedgerColumn = :isDroppedLedgerColumn")})
public class MaskedColumns implements Serializable {

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
    @Size(max = 2147483647)
    @Column(name = "definition")
    private String definition;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uses_database_collation")
    private boolean usesDatabaseCollation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_persisted")
    private boolean isPersisted;
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
    @Column(name = "is_masked")
    private Boolean isMasked;
    @Size(max = 4000)
    @Column(name = "masking_function")
    private String maskingFunction;
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

    public MaskedColumns() {
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

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public boolean getUsesDatabaseCollation() {
        return usesDatabaseCollation;
    }

    public void setUsesDatabaseCollation(boolean usesDatabaseCollation) {
        this.usesDatabaseCollation = usesDatabaseCollation;
    }

    public boolean getIsPersisted() {
        return isPersisted;
    }

    public void setIsPersisted(boolean isPersisted) {
        this.isPersisted = isPersisted;
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

    public Boolean getIsMasked() {
        return isMasked;
    }

    public void setIsMasked(Boolean isMasked) {
        this.isMasked = isMasked;
    }

    public String getMaskingFunction() {
        return maskingFunction;
    }

    public void setMaskingFunction(String maskingFunction) {
        this.maskingFunction = maskingFunction;
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
