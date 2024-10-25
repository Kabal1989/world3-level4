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
@Table(name = "views")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Views_1.findAll", query = "SELECT v FROM Views_1 v"),
    @NamedQuery(name = "Views_1.findByTableCatalog", query = "SELECT v FROM Views_1 v WHERE v.tableCatalog = :tableCatalog"),
    @NamedQuery(name = "Views_1.findByTableSchema", query = "SELECT v FROM Views_1 v WHERE v.tableSchema = :tableSchema"),
    @NamedQuery(name = "Views_1.findByTableName", query = "SELECT v FROM Views_1 v WHERE v.tableName = :tableName"),
    @NamedQuery(name = "Views_1.findByViewDefinition", query = "SELECT v FROM Views_1 v WHERE v.viewDefinition = :viewDefinition"),
    @NamedQuery(name = "Views_1.findByCheckOption", query = "SELECT v FROM Views_1 v WHERE v.checkOption = :checkOption"),
    @NamedQuery(name = "Views_1.findByIsUpdatable", query = "SELECT v FROM Views_1 v WHERE v.isUpdatable = :isUpdatable"),
    @NamedQuery(name = "Views_1.findByName", query = "SELECT v FROM Views_1 v WHERE v.name = :name"),
    @NamedQuery(name = "Views_1.findByObjectId", query = "SELECT v FROM Views_1 v WHERE v.objectId = :objectId"),
    @NamedQuery(name = "Views_1.findByPrincipalId", query = "SELECT v FROM Views_1 v WHERE v.principalId = :principalId"),
    @NamedQuery(name = "Views_1.findBySchemaId", query = "SELECT v FROM Views_1 v WHERE v.schemaId = :schemaId"),
    @NamedQuery(name = "Views_1.findByParentObjectId", query = "SELECT v FROM Views_1 v WHERE v.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "Views_1.findByType", query = "SELECT v FROM Views_1 v WHERE v.type = :type"),
    @NamedQuery(name = "Views_1.findByTypeDesc", query = "SELECT v FROM Views_1 v WHERE v.typeDesc = :typeDesc"),
    @NamedQuery(name = "Views_1.findByCreateDate", query = "SELECT v FROM Views_1 v WHERE v.createDate = :createDate"),
    @NamedQuery(name = "Views_1.findByModifyDate", query = "SELECT v FROM Views_1 v WHERE v.modifyDate = :modifyDate"),
    @NamedQuery(name = "Views_1.findByIsMsShipped", query = "SELECT v FROM Views_1 v WHERE v.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "Views_1.findByIsPublished", query = "SELECT v FROM Views_1 v WHERE v.isPublished = :isPublished"),
    @NamedQuery(name = "Views_1.findByIsSchemaPublished", query = "SELECT v FROM Views_1 v WHERE v.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "Views_1.findByIsReplicated", query = "SELECT v FROM Views_1 v WHERE v.isReplicated = :isReplicated"),
    @NamedQuery(name = "Views_1.findByHasReplicationFilter", query = "SELECT v FROM Views_1 v WHERE v.hasReplicationFilter = :hasReplicationFilter"),
    @NamedQuery(name = "Views_1.findByHasOpaqueMetadata", query = "SELECT v FROM Views_1 v WHERE v.hasOpaqueMetadata = :hasOpaqueMetadata"),
    @NamedQuery(name = "Views_1.findByHasUncheckedAssemblyData", query = "SELECT v FROM Views_1 v WHERE v.hasUncheckedAssemblyData = :hasUncheckedAssemblyData"),
    @NamedQuery(name = "Views_1.findByWithCheckOption", query = "SELECT v FROM Views_1 v WHERE v.withCheckOption = :withCheckOption"),
    @NamedQuery(name = "Views_1.findByIsDateCorrelationView", query = "SELECT v FROM Views_1 v WHERE v.isDateCorrelationView = :isDateCorrelationView"),
    @NamedQuery(name = "Views_1.findByIsTrackedByCdc", query = "SELECT v FROM Views_1 v WHERE v.isTrackedByCdc = :isTrackedByCdc"),
    @NamedQuery(name = "Views_1.findByHasSnapshot", query = "SELECT v FROM Views_1 v WHERE v.hasSnapshot = :hasSnapshot"),
    @NamedQuery(name = "Views_1.findByLedgerViewType", query = "SELECT v FROM Views_1 v WHERE v.ledgerViewType = :ledgerViewType"),
    @NamedQuery(name = "Views_1.findByLedgerViewTypeDesc", query = "SELECT v FROM Views_1 v WHERE v.ledgerViewTypeDesc = :ledgerViewTypeDesc"),
    @NamedQuery(name = "Views_1.findByIsDroppedLedgerView", query = "SELECT v FROM Views_1 v WHERE v.isDroppedLedgerView = :isDroppedLedgerView")})
@Entity
@Table(name = "VIEWS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Views_1.findAll", query = "SELECT v FROM Views_1 v"),
    @NamedQuery(name = "Views_1.findByTableCatalog", query = "SELECT v FROM Views_1 v WHERE v.tableCatalog = :tableCatalog"),
    @NamedQuery(name = "Views_1.findByTableSchema", query = "SELECT v FROM Views_1 v WHERE v.tableSchema = :tableSchema"),
    @NamedQuery(name = "Views_1.findByTableName", query = "SELECT v FROM Views_1 v WHERE v.tableName = :tableName"),
    @NamedQuery(name = "Views_1.findByViewDefinition", query = "SELECT v FROM Views_1 v WHERE v.viewDefinition = :viewDefinition"),
    @NamedQuery(name = "Views_1.findByCheckOption", query = "SELECT v FROM Views_1 v WHERE v.checkOption = :checkOption"),
    @NamedQuery(name = "Views_1.findByIsUpdatable", query = "SELECT v FROM Views_1 v WHERE v.isUpdatable = :isUpdatable"),
    @NamedQuery(name = "Views_1.findByName", query = "SELECT v FROM Views_1 v WHERE v.name = :name"),
    @NamedQuery(name = "Views_1.findByObjectId", query = "SELECT v FROM Views_1 v WHERE v.objectId = :objectId"),
    @NamedQuery(name = "Views_1.findByPrincipalId", query = "SELECT v FROM Views_1 v WHERE v.principalId = :principalId"),
    @NamedQuery(name = "Views_1.findBySchemaId", query = "SELECT v FROM Views_1 v WHERE v.schemaId = :schemaId"),
    @NamedQuery(name = "Views_1.findByParentObjectId", query = "SELECT v FROM Views_1 v WHERE v.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "Views_1.findByType", query = "SELECT v FROM Views_1 v WHERE v.type = :type"),
    @NamedQuery(name = "Views_1.findByTypeDesc", query = "SELECT v FROM Views_1 v WHERE v.typeDesc = :typeDesc"),
    @NamedQuery(name = "Views_1.findByCreateDate", query = "SELECT v FROM Views_1 v WHERE v.createDate = :createDate"),
    @NamedQuery(name = "Views_1.findByModifyDate", query = "SELECT v FROM Views_1 v WHERE v.modifyDate = :modifyDate"),
    @NamedQuery(name = "Views_1.findByIsMsShipped", query = "SELECT v FROM Views_1 v WHERE v.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "Views_1.findByIsPublished", query = "SELECT v FROM Views_1 v WHERE v.isPublished = :isPublished"),
    @NamedQuery(name = "Views_1.findByIsSchemaPublished", query = "SELECT v FROM Views_1 v WHERE v.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "Views_1.findByIsReplicated", query = "SELECT v FROM Views_1 v WHERE v.isReplicated = :isReplicated"),
    @NamedQuery(name = "Views_1.findByHasReplicationFilter", query = "SELECT v FROM Views_1 v WHERE v.hasReplicationFilter = :hasReplicationFilter"),
    @NamedQuery(name = "Views_1.findByHasOpaqueMetadata", query = "SELECT v FROM Views_1 v WHERE v.hasOpaqueMetadata = :hasOpaqueMetadata"),
    @NamedQuery(name = "Views_1.findByHasUncheckedAssemblyData", query = "SELECT v FROM Views_1 v WHERE v.hasUncheckedAssemblyData = :hasUncheckedAssemblyData"),
    @NamedQuery(name = "Views_1.findByWithCheckOption", query = "SELECT v FROM Views_1 v WHERE v.withCheckOption = :withCheckOption"),
    @NamedQuery(name = "Views_1.findByIsDateCorrelationView", query = "SELECT v FROM Views_1 v WHERE v.isDateCorrelationView = :isDateCorrelationView"),
    @NamedQuery(name = "Views_1.findByIsTrackedByCdc", query = "SELECT v FROM Views_1 v WHERE v.isTrackedByCdc = :isTrackedByCdc"),
    @NamedQuery(name = "Views_1.findByHasSnapshot", query = "SELECT v FROM Views_1 v WHERE v.hasSnapshot = :hasSnapshot"),
    @NamedQuery(name = "Views_1.findByLedgerViewType", query = "SELECT v FROM Views_1 v WHERE v.ledgerViewType = :ledgerViewType"),
    @NamedQuery(name = "Views_1.findByLedgerViewTypeDesc", query = "SELECT v FROM Views_1 v WHERE v.ledgerViewTypeDesc = :ledgerViewTypeDesc"),
    @NamedQuery(name = "Views_1.findByIsDroppedLedgerView", query = "SELECT v FROM Views_1 v WHERE v.isDroppedLedgerView = :isDroppedLedgerView")})
public class Views_1 implements Serializable, Serializable {

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
    @Size(max = 4000)
    @Column(name = "VIEW_DEFINITION")
    private String viewDefinition;
    @Size(max = 7)
    @Column(name = "CHECK_OPTION")
    private String checkOption;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "IS_UPDATABLE")
    private String isUpdatable;
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
    @Column(name = "is_replicated")
    private Boolean isReplicated;
    @Column(name = "has_replication_filter")
    private Boolean hasReplicationFilter;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_opaque_metadata")
    private boolean hasOpaqueMetadata;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_unchecked_assembly_data")
    private boolean hasUncheckedAssemblyData;
    @Basic(optional = false)
    @NotNull
    @Column(name = "with_check_option")
    private boolean withCheckOption;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_date_correlation_view")
    private boolean isDateCorrelationView;
    @Column(name = "is_tracked_by_cdc")
    private Boolean isTrackedByCdc;
    @Column(name = "has_snapshot")
    private Boolean hasSnapshot;
    @Column(name = "ledger_view_type")
    private Short ledgerViewType;
    @Size(max = 60)
    @Column(name = "ledger_view_type_desc")
    private String ledgerViewTypeDesc;
    @Column(name = "is_dropped_ledger_view")
    private Boolean isDroppedLedgerView;

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
    @Size(max = 4000)
    @Column(name = "VIEW_DEFINITION")
    private String viewDefinition;
    @Size(max = 7)
    @Column(name = "CHECK_OPTION")
    private String checkOption;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "IS_UPDATABLE")
    private String isUpdatable;
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
    @Column(name = "is_replicated")
    private Boolean isReplicated;
    @Column(name = "has_replication_filter")
    private Boolean hasReplicationFilter;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_opaque_metadata")
    private boolean hasOpaqueMetadata;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_unchecked_assembly_data")
    private boolean hasUncheckedAssemblyData;
    @Basic(optional = false)
    @NotNull
    @Column(name = "with_check_option")
    private boolean withCheckOption;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_date_correlation_view")
    private boolean isDateCorrelationView;
    @Column(name = "is_tracked_by_cdc")
    private Boolean isTrackedByCdc;
    @Column(name = "has_snapshot")
    private Boolean hasSnapshot;
    @Column(name = "ledger_view_type")
    private Short ledgerViewType;
    @Size(max = 60)
    @Column(name = "ledger_view_type_desc")
    private String ledgerViewTypeDesc;
    @Column(name = "is_dropped_ledger_view")
    private Boolean isDroppedLedgerView;

    public Views_1() {
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

    public String getViewDefinition() {
        return viewDefinition;
    }

    public void setViewDefinition(String viewDefinition) {
        this.viewDefinition = viewDefinition;
    }

    public String getCheckOption() {
        return checkOption;
    }

    public void setCheckOption(String checkOption) {
        this.checkOption = checkOption;
    }

    public String getIsUpdatable() {
        return isUpdatable;
    }

    public void setIsUpdatable(String isUpdatable) {
        this.isUpdatable = isUpdatable;
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

    public Boolean getIsReplicated() {
        return isReplicated;
    }

    public void setIsReplicated(Boolean isReplicated) {
        this.isReplicated = isReplicated;
    }

    public Boolean getHasReplicationFilter() {
        return hasReplicationFilter;
    }

    public void setHasReplicationFilter(Boolean hasReplicationFilter) {
        this.hasReplicationFilter = hasReplicationFilter;
    }

    public boolean getHasOpaqueMetadata() {
        return hasOpaqueMetadata;
    }

    public void setHasOpaqueMetadata(boolean hasOpaqueMetadata) {
        this.hasOpaqueMetadata = hasOpaqueMetadata;
    }

    public boolean getHasUncheckedAssemblyData() {
        return hasUncheckedAssemblyData;
    }

    public void setHasUncheckedAssemblyData(boolean hasUncheckedAssemblyData) {
        this.hasUncheckedAssemblyData = hasUncheckedAssemblyData;
    }

    public boolean getWithCheckOption() {
        return withCheckOption;
    }

    public void setWithCheckOption(boolean withCheckOption) {
        this.withCheckOption = withCheckOption;
    }

    public boolean getIsDateCorrelationView() {
        return isDateCorrelationView;
    }

    public void setIsDateCorrelationView(boolean isDateCorrelationView) {
        this.isDateCorrelationView = isDateCorrelationView;
    }

    public Boolean getIsTrackedByCdc() {
        return isTrackedByCdc;
    }

    public void setIsTrackedByCdc(Boolean isTrackedByCdc) {
        this.isTrackedByCdc = isTrackedByCdc;
    }

    public Boolean getHasSnapshot() {
        return hasSnapshot;
    }

    public void setHasSnapshot(Boolean hasSnapshot) {
        this.hasSnapshot = hasSnapshot;
    }

    public Short getLedgerViewType() {
        return ledgerViewType;
    }

    public void setLedgerViewType(Short ledgerViewType) {
        this.ledgerViewType = ledgerViewType;
    }

    public String getLedgerViewTypeDesc() {
        return ledgerViewTypeDesc;
    }

    public void setLedgerViewTypeDesc(String ledgerViewTypeDesc) {
        this.ledgerViewTypeDesc = ledgerViewTypeDesc;
    }

    public Boolean getIsDroppedLedgerView() {
        return isDroppedLedgerView;
    }

    public void setIsDroppedLedgerView(Boolean isDroppedLedgerView) {
        this.isDroppedLedgerView = isDroppedLedgerView;
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

    public String getViewDefinition() {
        return viewDefinition;
    }

    public void setViewDefinition(String viewDefinition) {
        this.viewDefinition = viewDefinition;
    }

    public String getCheckOption() {
        return checkOption;
    }

    public void setCheckOption(String checkOption) {
        this.checkOption = checkOption;
    }

    public String getIsUpdatable() {
        return isUpdatable;
    }

    public void setIsUpdatable(String isUpdatable) {
        this.isUpdatable = isUpdatable;
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

    public Boolean getIsReplicated() {
        return isReplicated;
    }

    public void setIsReplicated(Boolean isReplicated) {
        this.isReplicated = isReplicated;
    }

    public Boolean getHasReplicationFilter() {
        return hasReplicationFilter;
    }

    public void setHasReplicationFilter(Boolean hasReplicationFilter) {
        this.hasReplicationFilter = hasReplicationFilter;
    }

    public boolean getHasOpaqueMetadata() {
        return hasOpaqueMetadata;
    }

    public void setHasOpaqueMetadata(boolean hasOpaqueMetadata) {
        this.hasOpaqueMetadata = hasOpaqueMetadata;
    }

    public boolean getHasUncheckedAssemblyData() {
        return hasUncheckedAssemblyData;
    }

    public void setHasUncheckedAssemblyData(boolean hasUncheckedAssemblyData) {
        this.hasUncheckedAssemblyData = hasUncheckedAssemblyData;
    }

    public boolean getWithCheckOption() {
        return withCheckOption;
    }

    public void setWithCheckOption(boolean withCheckOption) {
        this.withCheckOption = withCheckOption;
    }

    public boolean getIsDateCorrelationView() {
        return isDateCorrelationView;
    }

    public void setIsDateCorrelationView(boolean isDateCorrelationView) {
        this.isDateCorrelationView = isDateCorrelationView;
    }

    public Boolean getIsTrackedByCdc() {
        return isTrackedByCdc;
    }

    public void setIsTrackedByCdc(Boolean isTrackedByCdc) {
        this.isTrackedByCdc = isTrackedByCdc;
    }

    public Boolean getHasSnapshot() {
        return hasSnapshot;
    }

    public void setHasSnapshot(Boolean hasSnapshot) {
        this.hasSnapshot = hasSnapshot;
    }

    public Short getLedgerViewType() {
        return ledgerViewType;
    }

    public void setLedgerViewType(Short ledgerViewType) {
        this.ledgerViewType = ledgerViewType;
    }

    public String getLedgerViewTypeDesc() {
        return ledgerViewTypeDesc;
    }

    public void setLedgerViewTypeDesc(String ledgerViewTypeDesc) {
        this.ledgerViewTypeDesc = ledgerViewTypeDesc;
    }

    public Boolean getIsDroppedLedgerView() {
        return isDroppedLedgerView;
    }

    public void setIsDroppedLedgerView(Boolean isDroppedLedgerView) {
        this.isDroppedLedgerView = isDroppedLedgerView;
    }
    
}
