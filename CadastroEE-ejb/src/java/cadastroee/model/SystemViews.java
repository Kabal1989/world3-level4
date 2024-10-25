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
@Table(name = "system_views")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SystemViews.findAll", query = "SELECT s FROM SystemViews s"),
    @NamedQuery(name = "SystemViews.findByName", query = "SELECT s FROM SystemViews s WHERE s.name = :name"),
    @NamedQuery(name = "SystemViews.findByObjectId", query = "SELECT s FROM SystemViews s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "SystemViews.findByPrincipalId", query = "SELECT s FROM SystemViews s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "SystemViews.findBySchemaId", query = "SELECT s FROM SystemViews s WHERE s.schemaId = :schemaId"),
    @NamedQuery(name = "SystemViews.findByParentObjectId", query = "SELECT s FROM SystemViews s WHERE s.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "SystemViews.findByType", query = "SELECT s FROM SystemViews s WHERE s.type = :type"),
    @NamedQuery(name = "SystemViews.findByTypeDesc", query = "SELECT s FROM SystemViews s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "SystemViews.findByCreateDate", query = "SELECT s FROM SystemViews s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "SystemViews.findByModifyDate", query = "SELECT s FROM SystemViews s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "SystemViews.findByIsMsShipped", query = "SELECT s FROM SystemViews s WHERE s.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "SystemViews.findByIsPublished", query = "SELECT s FROM SystemViews s WHERE s.isPublished = :isPublished"),
    @NamedQuery(name = "SystemViews.findByIsSchemaPublished", query = "SELECT s FROM SystemViews s WHERE s.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "SystemViews.findByIsReplicated", query = "SELECT s FROM SystemViews s WHERE s.isReplicated = :isReplicated"),
    @NamedQuery(name = "SystemViews.findByHasReplicationFilter", query = "SELECT s FROM SystemViews s WHERE s.hasReplicationFilter = :hasReplicationFilter"),
    @NamedQuery(name = "SystemViews.findByHasOpaqueMetadata", query = "SELECT s FROM SystemViews s WHERE s.hasOpaqueMetadata = :hasOpaqueMetadata"),
    @NamedQuery(name = "SystemViews.findByHasUncheckedAssemblyData", query = "SELECT s FROM SystemViews s WHERE s.hasUncheckedAssemblyData = :hasUncheckedAssemblyData"),
    @NamedQuery(name = "SystemViews.findByWithCheckOption", query = "SELECT s FROM SystemViews s WHERE s.withCheckOption = :withCheckOption"),
    @NamedQuery(name = "SystemViews.findByIsDateCorrelationView", query = "SELECT s FROM SystemViews s WHERE s.isDateCorrelationView = :isDateCorrelationView"),
    @NamedQuery(name = "SystemViews.findByIsTrackedByCdc", query = "SELECT s FROM SystemViews s WHERE s.isTrackedByCdc = :isTrackedByCdc"),
    @NamedQuery(name = "SystemViews.findByHasSnapshot", query = "SELECT s FROM SystemViews s WHERE s.hasSnapshot = :hasSnapshot"),
    @NamedQuery(name = "SystemViews.findByLedgerViewType", query = "SELECT s FROM SystemViews s WHERE s.ledgerViewType = :ledgerViewType"),
    @NamedQuery(name = "SystemViews.findByLedgerViewTypeDesc", query = "SELECT s FROM SystemViews s WHERE s.ledgerViewTypeDesc = :ledgerViewTypeDesc"),
    @NamedQuery(name = "SystemViews.findByIsDroppedLedgerView", query = "SELECT s FROM SystemViews s WHERE s.isDroppedLedgerView = :isDroppedLedgerView")})
public class SystemViews implements Serializable {

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
    @Column(name = "parent_object_id")
    private Integer parentObjectId;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_replicated")
    private boolean isReplicated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_replication_filter")
    private boolean hasReplicationFilter;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_tracked_by_cdc")
    private boolean isTrackedByCdc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_snapshot")
    private boolean hasSnapshot;
    @Column(name = "ledger_view_type")
    private Short ledgerViewType;
    @Size(max = 60)
    @Column(name = "ledger_view_type_desc")
    private String ledgerViewTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_dropped_ledger_view")
    private boolean isDroppedLedgerView;

    public SystemViews() {
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

    public Integer getParentObjectId() {
        return parentObjectId;
    }

    public void setParentObjectId(Integer parentObjectId) {
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

    public boolean getIsReplicated() {
        return isReplicated;
    }

    public void setIsReplicated(boolean isReplicated) {
        this.isReplicated = isReplicated;
    }

    public boolean getHasReplicationFilter() {
        return hasReplicationFilter;
    }

    public void setHasReplicationFilter(boolean hasReplicationFilter) {
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

    public boolean getIsTrackedByCdc() {
        return isTrackedByCdc;
    }

    public void setIsTrackedByCdc(boolean isTrackedByCdc) {
        this.isTrackedByCdc = isTrackedByCdc;
    }

    public boolean getHasSnapshot() {
        return hasSnapshot;
    }

    public void setHasSnapshot(boolean hasSnapshot) {
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

    public boolean getIsDroppedLedgerView() {
        return isDroppedLedgerView;
    }

    public void setIsDroppedLedgerView(boolean isDroppedLedgerView) {
        this.isDroppedLedgerView = isDroppedLedgerView;
    }
    
}
