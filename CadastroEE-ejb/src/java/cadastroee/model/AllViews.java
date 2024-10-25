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
@Table(name = "all_views")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AllViews.findAll", query = "SELECT a FROM AllViews a"),
    @NamedQuery(name = "AllViews.findByName", query = "SELECT a FROM AllViews a WHERE a.name = :name"),
    @NamedQuery(name = "AllViews.findByObjectId", query = "SELECT a FROM AllViews a WHERE a.objectId = :objectId"),
    @NamedQuery(name = "AllViews.findByPrincipalId", query = "SELECT a FROM AllViews a WHERE a.principalId = :principalId"),
    @NamedQuery(name = "AllViews.findBySchemaId", query = "SELECT a FROM AllViews a WHERE a.schemaId = :schemaId"),
    @NamedQuery(name = "AllViews.findByParentObjectId", query = "SELECT a FROM AllViews a WHERE a.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "AllViews.findByType", query = "SELECT a FROM AllViews a WHERE a.type = :type"),
    @NamedQuery(name = "AllViews.findByTypeDesc", query = "SELECT a FROM AllViews a WHERE a.typeDesc = :typeDesc"),
    @NamedQuery(name = "AllViews.findByCreateDate", query = "SELECT a FROM AllViews a WHERE a.createDate = :createDate"),
    @NamedQuery(name = "AllViews.findByModifyDate", query = "SELECT a FROM AllViews a WHERE a.modifyDate = :modifyDate"),
    @NamedQuery(name = "AllViews.findByIsMsShipped", query = "SELECT a FROM AllViews a WHERE a.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "AllViews.findByIsPublished", query = "SELECT a FROM AllViews a WHERE a.isPublished = :isPublished"),
    @NamedQuery(name = "AllViews.findByIsSchemaPublished", query = "SELECT a FROM AllViews a WHERE a.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "AllViews.findByIsReplicated", query = "SELECT a FROM AllViews a WHERE a.isReplicated = :isReplicated"),
    @NamedQuery(name = "AllViews.findByHasReplicationFilter", query = "SELECT a FROM AllViews a WHERE a.hasReplicationFilter = :hasReplicationFilter"),
    @NamedQuery(name = "AllViews.findByHasOpaqueMetadata", query = "SELECT a FROM AllViews a WHERE a.hasOpaqueMetadata = :hasOpaqueMetadata"),
    @NamedQuery(name = "AllViews.findByHasUncheckedAssemblyData", query = "SELECT a FROM AllViews a WHERE a.hasUncheckedAssemblyData = :hasUncheckedAssemblyData"),
    @NamedQuery(name = "AllViews.findByWithCheckOption", query = "SELECT a FROM AllViews a WHERE a.withCheckOption = :withCheckOption"),
    @NamedQuery(name = "AllViews.findByIsDateCorrelationView", query = "SELECT a FROM AllViews a WHERE a.isDateCorrelationView = :isDateCorrelationView"),
    @NamedQuery(name = "AllViews.findByIsTrackedByCdc", query = "SELECT a FROM AllViews a WHERE a.isTrackedByCdc = :isTrackedByCdc"),
    @NamedQuery(name = "AllViews.findByHasSnapshot", query = "SELECT a FROM AllViews a WHERE a.hasSnapshot = :hasSnapshot"),
    @NamedQuery(name = "AllViews.findByLedgerViewType", query = "SELECT a FROM AllViews a WHERE a.ledgerViewType = :ledgerViewType"),
    @NamedQuery(name = "AllViews.findByLedgerViewTypeDesc", query = "SELECT a FROM AllViews a WHERE a.ledgerViewTypeDesc = :ledgerViewTypeDesc"),
    @NamedQuery(name = "AllViews.findByIsDroppedLedgerView", query = "SELECT a FROM AllViews a WHERE a.isDroppedLedgerView = :isDroppedLedgerView")})
public class AllViews implements Serializable {

    private static final long serialVersionUID = 1L;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
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
    @Column(name = "is_ms_shipped")
    private Boolean isMsShipped;
    @Column(name = "is_published")
    private Boolean isPublished;
    @Column(name = "is_schema_published")
    private Boolean isSchemaPublished;
    @Column(name = "is_replicated")
    private Boolean isReplicated;
    @Column(name = "has_replication_filter")
    private Boolean hasReplicationFilter;
    @Column(name = "has_opaque_metadata")
    private Boolean hasOpaqueMetadata;
    @Column(name = "has_unchecked_assembly_data")
    private Boolean hasUncheckedAssemblyData;
    @Column(name = "with_check_option")
    private Boolean withCheckOption;
    @Column(name = "is_date_correlation_view")
    private Boolean isDateCorrelationView;
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

    public AllViews() {
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

    public Boolean getIsMsShipped() {
        return isMsShipped;
    }

    public void setIsMsShipped(Boolean isMsShipped) {
        this.isMsShipped = isMsShipped;
    }

    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    public Boolean getIsSchemaPublished() {
        return isSchemaPublished;
    }

    public void setIsSchemaPublished(Boolean isSchemaPublished) {
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

    public Boolean getHasOpaqueMetadata() {
        return hasOpaqueMetadata;
    }

    public void setHasOpaqueMetadata(Boolean hasOpaqueMetadata) {
        this.hasOpaqueMetadata = hasOpaqueMetadata;
    }

    public Boolean getHasUncheckedAssemblyData() {
        return hasUncheckedAssemblyData;
    }

    public void setHasUncheckedAssemblyData(Boolean hasUncheckedAssemblyData) {
        this.hasUncheckedAssemblyData = hasUncheckedAssemblyData;
    }

    public Boolean getWithCheckOption() {
        return withCheckOption;
    }

    public void setWithCheckOption(Boolean withCheckOption) {
        this.withCheckOption = withCheckOption;
    }

    public Boolean getIsDateCorrelationView() {
        return isDateCorrelationView;
    }

    public void setIsDateCorrelationView(Boolean isDateCorrelationView) {
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
