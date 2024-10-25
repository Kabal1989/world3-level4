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
@Table(name = "computed_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComputedColumns.findAll", query = "SELECT c FROM ComputedColumns c"),
    @NamedQuery(name = "ComputedColumns.findByObjectId", query = "SELECT c FROM ComputedColumns c WHERE c.objectId = :objectId"),
    @NamedQuery(name = "ComputedColumns.findByName", query = "SELECT c FROM ComputedColumns c WHERE c.name = :name"),
    @NamedQuery(name = "ComputedColumns.findByColumnId", query = "SELECT c FROM ComputedColumns c WHERE c.columnId = :columnId"),
    @NamedQuery(name = "ComputedColumns.findBySystemTypeId", query = "SELECT c FROM ComputedColumns c WHERE c.systemTypeId = :systemTypeId"),
    @NamedQuery(name = "ComputedColumns.findByUserTypeId", query = "SELECT c FROM ComputedColumns c WHERE c.userTypeId = :userTypeId"),
    @NamedQuery(name = "ComputedColumns.findByMaxLength", query = "SELECT c FROM ComputedColumns c WHERE c.maxLength = :maxLength"),
    @NamedQuery(name = "ComputedColumns.findByPrecision", query = "SELECT c FROM ComputedColumns c WHERE c.precision = :precision"),
    @NamedQuery(name = "ComputedColumns.findByScale", query = "SELECT c FROM ComputedColumns c WHERE c.scale = :scale"),
    @NamedQuery(name = "ComputedColumns.findByCollationName", query = "SELECT c FROM ComputedColumns c WHERE c.collationName = :collationName"),
    @NamedQuery(name = "ComputedColumns.findByIsNullable", query = "SELECT c FROM ComputedColumns c WHERE c.isNullable = :isNullable"),
    @NamedQuery(name = "ComputedColumns.findByIsAnsiPadded", query = "SELECT c FROM ComputedColumns c WHERE c.isAnsiPadded = :isAnsiPadded"),
    @NamedQuery(name = "ComputedColumns.findByIsRowguidcol", query = "SELECT c FROM ComputedColumns c WHERE c.isRowguidcol = :isRowguidcol"),
    @NamedQuery(name = "ComputedColumns.findByIsIdentity", query = "SELECT c FROM ComputedColumns c WHERE c.isIdentity = :isIdentity"),
    @NamedQuery(name = "ComputedColumns.findByIsFilestream", query = "SELECT c FROM ComputedColumns c WHERE c.isFilestream = :isFilestream"),
    @NamedQuery(name = "ComputedColumns.findByIsReplicated", query = "SELECT c FROM ComputedColumns c WHERE c.isReplicated = :isReplicated"),
    @NamedQuery(name = "ComputedColumns.findByIsNonSqlSubscribed", query = "SELECT c FROM ComputedColumns c WHERE c.isNonSqlSubscribed = :isNonSqlSubscribed"),
    @NamedQuery(name = "ComputedColumns.findByIsMergePublished", query = "SELECT c FROM ComputedColumns c WHERE c.isMergePublished = :isMergePublished"),
    @NamedQuery(name = "ComputedColumns.findByIsDtsReplicated", query = "SELECT c FROM ComputedColumns c WHERE c.isDtsReplicated = :isDtsReplicated"),
    @NamedQuery(name = "ComputedColumns.findByIsXmlDocument", query = "SELECT c FROM ComputedColumns c WHERE c.isXmlDocument = :isXmlDocument"),
    @NamedQuery(name = "ComputedColumns.findByXmlCollectionId", query = "SELECT c FROM ComputedColumns c WHERE c.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "ComputedColumns.findByDefaultObjectId", query = "SELECT c FROM ComputedColumns c WHERE c.defaultObjectId = :defaultObjectId"),
    @NamedQuery(name = "ComputedColumns.findByRuleObjectId", query = "SELECT c FROM ComputedColumns c WHERE c.ruleObjectId = :ruleObjectId"),
    @NamedQuery(name = "ComputedColumns.findByDefinition", query = "SELECT c FROM ComputedColumns c WHERE c.definition = :definition"),
    @NamedQuery(name = "ComputedColumns.findByUsesDatabaseCollation", query = "SELECT c FROM ComputedColumns c WHERE c.usesDatabaseCollation = :usesDatabaseCollation"),
    @NamedQuery(name = "ComputedColumns.findByIsPersisted", query = "SELECT c FROM ComputedColumns c WHERE c.isPersisted = :isPersisted"),
    @NamedQuery(name = "ComputedColumns.findByIsComputed", query = "SELECT c FROM ComputedColumns c WHERE c.isComputed = :isComputed"),
    @NamedQuery(name = "ComputedColumns.findByIsSparse", query = "SELECT c FROM ComputedColumns c WHERE c.isSparse = :isSparse"),
    @NamedQuery(name = "ComputedColumns.findByIsColumnSet", query = "SELECT c FROM ComputedColumns c WHERE c.isColumnSet = :isColumnSet"),
    @NamedQuery(name = "ComputedColumns.findByGeneratedAlwaysType", query = "SELECT c FROM ComputedColumns c WHERE c.generatedAlwaysType = :generatedAlwaysType"),
    @NamedQuery(name = "ComputedColumns.findByGeneratedAlwaysTypeDesc", query = "SELECT c FROM ComputedColumns c WHERE c.generatedAlwaysTypeDesc = :generatedAlwaysTypeDesc"),
    @NamedQuery(name = "ComputedColumns.findByEncryptionType", query = "SELECT c FROM ComputedColumns c WHERE c.encryptionType = :encryptionType"),
    @NamedQuery(name = "ComputedColumns.findByEncryptionTypeDesc", query = "SELECT c FROM ComputedColumns c WHERE c.encryptionTypeDesc = :encryptionTypeDesc"),
    @NamedQuery(name = "ComputedColumns.findByEncryptionAlgorithmName", query = "SELECT c FROM ComputedColumns c WHERE c.encryptionAlgorithmName = :encryptionAlgorithmName"),
    @NamedQuery(name = "ComputedColumns.findByColumnEncryptionKeyId", query = "SELECT c FROM ComputedColumns c WHERE c.columnEncryptionKeyId = :columnEncryptionKeyId"),
    @NamedQuery(name = "ComputedColumns.findByColumnEncryptionKeyDatabaseName", query = "SELECT c FROM ComputedColumns c WHERE c.columnEncryptionKeyDatabaseName = :columnEncryptionKeyDatabaseName"),
    @NamedQuery(name = "ComputedColumns.findByIsHidden", query = "SELECT c FROM ComputedColumns c WHERE c.isHidden = :isHidden"),
    @NamedQuery(name = "ComputedColumns.findByIsMasked", query = "SELECT c FROM ComputedColumns c WHERE c.isMasked = :isMasked"),
    @NamedQuery(name = "ComputedColumns.findByGraphType", query = "SELECT c FROM ComputedColumns c WHERE c.graphType = :graphType"),
    @NamedQuery(name = "ComputedColumns.findByGraphTypeDesc", query = "SELECT c FROM ComputedColumns c WHERE c.graphTypeDesc = :graphTypeDesc"),
    @NamedQuery(name = "ComputedColumns.findByIsDataDeletionFilterColumn", query = "SELECT c FROM ComputedColumns c WHERE c.isDataDeletionFilterColumn = :isDataDeletionFilterColumn"),
    @NamedQuery(name = "ComputedColumns.findByLedgerViewColumnType", query = "SELECT c FROM ComputedColumns c WHERE c.ledgerViewColumnType = :ledgerViewColumnType"),
    @NamedQuery(name = "ComputedColumns.findByLedgerViewColumnTypeDesc", query = "SELECT c FROM ComputedColumns c WHERE c.ledgerViewColumnTypeDesc = :ledgerViewColumnTypeDesc"),
    @NamedQuery(name = "ComputedColumns.findByIsDroppedLedgerColumn", query = "SELECT c FROM ComputedColumns c WHERE c.isDroppedLedgerColumn = :isDroppedLedgerColumn")})
public class ComputedColumns implements Serializable {

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
    @Column(name = "is_computed")
    private Boolean isComputed;
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

    public ComputedColumns() {
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

    public Boolean getIsComputed() {
        return isComputed;
    }

    public void setIsComputed(Boolean isComputed) {
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
