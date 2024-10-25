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
@Table(name = "external_tables")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalTables.findAll", query = "SELECT e FROM ExternalTables e"),
    @NamedQuery(name = "ExternalTables.findByName", query = "SELECT e FROM ExternalTables e WHERE e.name = :name"),
    @NamedQuery(name = "ExternalTables.findByObjectId", query = "SELECT e FROM ExternalTables e WHERE e.objectId = :objectId"),
    @NamedQuery(name = "ExternalTables.findByPrincipalId", query = "SELECT e FROM ExternalTables e WHERE e.principalId = :principalId"),
    @NamedQuery(name = "ExternalTables.findBySchemaId", query = "SELECT e FROM ExternalTables e WHERE e.schemaId = :schemaId"),
    @NamedQuery(name = "ExternalTables.findByParentObjectId", query = "SELECT e FROM ExternalTables e WHERE e.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "ExternalTables.findByType", query = "SELECT e FROM ExternalTables e WHERE e.type = :type"),
    @NamedQuery(name = "ExternalTables.findByTypeDesc", query = "SELECT e FROM ExternalTables e WHERE e.typeDesc = :typeDesc"),
    @NamedQuery(name = "ExternalTables.findByCreateDate", query = "SELECT e FROM ExternalTables e WHERE e.createDate = :createDate"),
    @NamedQuery(name = "ExternalTables.findByModifyDate", query = "SELECT e FROM ExternalTables e WHERE e.modifyDate = :modifyDate"),
    @NamedQuery(name = "ExternalTables.findByIsMsShipped", query = "SELECT e FROM ExternalTables e WHERE e.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "ExternalTables.findByIsPublished", query = "SELECT e FROM ExternalTables e WHERE e.isPublished = :isPublished"),
    @NamedQuery(name = "ExternalTables.findByIsSchemaPublished", query = "SELECT e FROM ExternalTables e WHERE e.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "ExternalTables.findByMaxColumnIdUsed", query = "SELECT e FROM ExternalTables e WHERE e.maxColumnIdUsed = :maxColumnIdUsed"),
    @NamedQuery(name = "ExternalTables.findByUsesAnsiNulls", query = "SELECT e FROM ExternalTables e WHERE e.usesAnsiNulls = :usesAnsiNulls"),
    @NamedQuery(name = "ExternalTables.findByDataSourceId", query = "SELECT e FROM ExternalTables e WHERE e.dataSourceId = :dataSourceId"),
    @NamedQuery(name = "ExternalTables.findByFileFormatId", query = "SELECT e FROM ExternalTables e WHERE e.fileFormatId = :fileFormatId"),
    @NamedQuery(name = "ExternalTables.findByLocation", query = "SELECT e FROM ExternalTables e WHERE e.location = :location"),
    @NamedQuery(name = "ExternalTables.findByRejectType", query = "SELECT e FROM ExternalTables e WHERE e.rejectType = :rejectType"),
    @NamedQuery(name = "ExternalTables.findByRejectValue", query = "SELECT e FROM ExternalTables e WHERE e.rejectValue = :rejectValue"),
    @NamedQuery(name = "ExternalTables.findByRejectSampleValue", query = "SELECT e FROM ExternalTables e WHERE e.rejectSampleValue = :rejectSampleValue"),
    @NamedQuery(name = "ExternalTables.findByDistributionType", query = "SELECT e FROM ExternalTables e WHERE e.distributionType = :distributionType"),
    @NamedQuery(name = "ExternalTables.findByDistributionDesc", query = "SELECT e FROM ExternalTables e WHERE e.distributionDesc = :distributionDesc"),
    @NamedQuery(name = "ExternalTables.findByShardingColId", query = "SELECT e FROM ExternalTables e WHERE e.shardingColId = :shardingColId"),
    @NamedQuery(name = "ExternalTables.findByRemoteSchemaName", query = "SELECT e FROM ExternalTables e WHERE e.remoteSchemaName = :remoteSchemaName"),
    @NamedQuery(name = "ExternalTables.findByRemoteObjectName", query = "SELECT e FROM ExternalTables e WHERE e.remoteObjectName = :remoteObjectName"),
    @NamedQuery(name = "ExternalTables.findByRejectedRowLocation", query = "SELECT e FROM ExternalTables e WHERE e.rejectedRowLocation = :rejectedRowLocation"),
    @NamedQuery(name = "ExternalTables.findByTableOptions", query = "SELECT e FROM ExternalTables e WHERE e.tableOptions = :tableOptions"),
    @NamedQuery(name = "ExternalTables.findByPartitionType", query = "SELECT e FROM ExternalTables e WHERE e.partitionType = :partitionType"),
    @NamedQuery(name = "ExternalTables.findByPartitionDesc", query = "SELECT e FROM ExternalTables e WHERE e.partitionDesc = :partitionDesc")})
public class ExternalTables implements Serializable {

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
    @Column(name = "max_column_id_used")
    private Integer maxColumnIdUsed;
    @Column(name = "uses_ansi_nulls")
    private Boolean usesAnsiNulls;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_source_id")
    private int dataSourceId;
    @Column(name = "file_format_id")
    private Integer fileFormatId;
    @Size(max = 4000)
    @Column(name = "location")
    private String location;
    @Size(max = 20)
    @Column(name = "reject_type")
    private String rejectType;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "reject_value")
    private Double rejectValue;
    @Column(name = "reject_sample_value")
    private Double rejectSampleValue;
    @Column(name = "distribution_type")
    private Short distributionType;
    @Size(max = 120)
    @Column(name = "distribution_desc")
    private String distributionDesc;
    @Column(name = "sharding_col_id")
    private Integer shardingColId;
    @Size(max = 128)
    @Column(name = "remote_schema_name")
    private String remoteSchemaName;
    @Size(max = 128)
    @Column(name = "remote_object_name")
    private String remoteObjectName;
    @Size(max = 4000)
    @Column(name = "rejected_row_location")
    private String rejectedRowLocation;
    @Size(max = 1000)
    @Column(name = "table_options")
    private String tableOptions;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partition_type")
    private int partitionType;
    @Size(max = 60)
    @Column(name = "partition_desc")
    private String partitionDesc;

    public ExternalTables() {
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

    public Integer getMaxColumnIdUsed() {
        return maxColumnIdUsed;
    }

    public void setMaxColumnIdUsed(Integer maxColumnIdUsed) {
        this.maxColumnIdUsed = maxColumnIdUsed;
    }

    public Boolean getUsesAnsiNulls() {
        return usesAnsiNulls;
    }

    public void setUsesAnsiNulls(Boolean usesAnsiNulls) {
        this.usesAnsiNulls = usesAnsiNulls;
    }

    public int getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(int dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public Integer getFileFormatId() {
        return fileFormatId;
    }

    public void setFileFormatId(Integer fileFormatId) {
        this.fileFormatId = fileFormatId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRejectType() {
        return rejectType;
    }

    public void setRejectType(String rejectType) {
        this.rejectType = rejectType;
    }

    public Double getRejectValue() {
        return rejectValue;
    }

    public void setRejectValue(Double rejectValue) {
        this.rejectValue = rejectValue;
    }

    public Double getRejectSampleValue() {
        return rejectSampleValue;
    }

    public void setRejectSampleValue(Double rejectSampleValue) {
        this.rejectSampleValue = rejectSampleValue;
    }

    public Short getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(Short distributionType) {
        this.distributionType = distributionType;
    }

    public String getDistributionDesc() {
        return distributionDesc;
    }

    public void setDistributionDesc(String distributionDesc) {
        this.distributionDesc = distributionDesc;
    }

    public Integer getShardingColId() {
        return shardingColId;
    }

    public void setShardingColId(Integer shardingColId) {
        this.shardingColId = shardingColId;
    }

    public String getRemoteSchemaName() {
        return remoteSchemaName;
    }

    public void setRemoteSchemaName(String remoteSchemaName) {
        this.remoteSchemaName = remoteSchemaName;
    }

    public String getRemoteObjectName() {
        return remoteObjectName;
    }

    public void setRemoteObjectName(String remoteObjectName) {
        this.remoteObjectName = remoteObjectName;
    }

    public String getRejectedRowLocation() {
        return rejectedRowLocation;
    }

    public void setRejectedRowLocation(String rejectedRowLocation) {
        this.rejectedRowLocation = rejectedRowLocation;
    }

    public String getTableOptions() {
        return tableOptions;
    }

    public void setTableOptions(String tableOptions) {
        this.tableOptions = tableOptions;
    }

    public int getPartitionType() {
        return partitionType;
    }

    public void setPartitionType(int partitionType) {
        this.partitionType = partitionType;
    }

    public String getPartitionDesc() {
        return partitionDesc;
    }

    public void setPartitionDesc(String partitionDesc) {
        this.partitionDesc = partitionDesc;
    }
    
}
