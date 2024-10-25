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
@Table(name = "service_queues")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiceQueues.findAll", query = "SELECT s FROM ServiceQueues s"),
    @NamedQuery(name = "ServiceQueues.findByName", query = "SELECT s FROM ServiceQueues s WHERE s.name = :name"),
    @NamedQuery(name = "ServiceQueues.findByObjectId", query = "SELECT s FROM ServiceQueues s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "ServiceQueues.findByPrincipalId", query = "SELECT s FROM ServiceQueues s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "ServiceQueues.findBySchemaId", query = "SELECT s FROM ServiceQueues s WHERE s.schemaId = :schemaId"),
    @NamedQuery(name = "ServiceQueues.findByParentObjectId", query = "SELECT s FROM ServiceQueues s WHERE s.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "ServiceQueues.findByType", query = "SELECT s FROM ServiceQueues s WHERE s.type = :type"),
    @NamedQuery(name = "ServiceQueues.findByTypeDesc", query = "SELECT s FROM ServiceQueues s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "ServiceQueues.findByCreateDate", query = "SELECT s FROM ServiceQueues s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "ServiceQueues.findByModifyDate", query = "SELECT s FROM ServiceQueues s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "ServiceQueues.findByIsMsShipped", query = "SELECT s FROM ServiceQueues s WHERE s.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "ServiceQueues.findByIsPublished", query = "SELECT s FROM ServiceQueues s WHERE s.isPublished = :isPublished"),
    @NamedQuery(name = "ServiceQueues.findByIsSchemaPublished", query = "SELECT s FROM ServiceQueues s WHERE s.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "ServiceQueues.findByMaxReaders", query = "SELECT s FROM ServiceQueues s WHERE s.maxReaders = :maxReaders"),
    @NamedQuery(name = "ServiceQueues.findByActivationProcedure", query = "SELECT s FROM ServiceQueues s WHERE s.activationProcedure = :activationProcedure"),
    @NamedQuery(name = "ServiceQueues.findByExecuteAsPrincipalId", query = "SELECT s FROM ServiceQueues s WHERE s.executeAsPrincipalId = :executeAsPrincipalId"),
    @NamedQuery(name = "ServiceQueues.findByIsActivationEnabled", query = "SELECT s FROM ServiceQueues s WHERE s.isActivationEnabled = :isActivationEnabled"),
    @NamedQuery(name = "ServiceQueues.findByIsReceiveEnabled", query = "SELECT s FROM ServiceQueues s WHERE s.isReceiveEnabled = :isReceiveEnabled"),
    @NamedQuery(name = "ServiceQueues.findByIsEnqueueEnabled", query = "SELECT s FROM ServiceQueues s WHERE s.isEnqueueEnabled = :isEnqueueEnabled"),
    @NamedQuery(name = "ServiceQueues.findByIsRetentionEnabled", query = "SELECT s FROM ServiceQueues s WHERE s.isRetentionEnabled = :isRetentionEnabled"),
    @NamedQuery(name = "ServiceQueues.findByIsPoisonMessageHandlingEnabled", query = "SELECT s FROM ServiceQueues s WHERE s.isPoisonMessageHandlingEnabled = :isPoisonMessageHandlingEnabled")})
public class ServiceQueues implements Serializable {

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
    @Column(name = "max_readers")
    private Short maxReaders;
    @Size(max = 776)
    @Column(name = "activation_procedure")
    private String activationProcedure;
    @Column(name = "execute_as_principal_id")
    private Integer executeAsPrincipalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_activation_enabled")
    private boolean isActivationEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_receive_enabled")
    private boolean isReceiveEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_enqueue_enabled")
    private boolean isEnqueueEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_retention_enabled")
    private boolean isRetentionEnabled;
    @Column(name = "is_poison_message_handling_enabled")
    private Boolean isPoisonMessageHandlingEnabled;

    public ServiceQueues() {
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

    public Short getMaxReaders() {
        return maxReaders;
    }

    public void setMaxReaders(Short maxReaders) {
        this.maxReaders = maxReaders;
    }

    public String getActivationProcedure() {
        return activationProcedure;
    }

    public void setActivationProcedure(String activationProcedure) {
        this.activationProcedure = activationProcedure;
    }

    public Integer getExecuteAsPrincipalId() {
        return executeAsPrincipalId;
    }

    public void setExecuteAsPrincipalId(Integer executeAsPrincipalId) {
        this.executeAsPrincipalId = executeAsPrincipalId;
    }

    public boolean getIsActivationEnabled() {
        return isActivationEnabled;
    }

    public void setIsActivationEnabled(boolean isActivationEnabled) {
        this.isActivationEnabled = isActivationEnabled;
    }

    public boolean getIsReceiveEnabled() {
        return isReceiveEnabled;
    }

    public void setIsReceiveEnabled(boolean isReceiveEnabled) {
        this.isReceiveEnabled = isReceiveEnabled;
    }

    public boolean getIsEnqueueEnabled() {
        return isEnqueueEnabled;
    }

    public void setIsEnqueueEnabled(boolean isEnqueueEnabled) {
        this.isEnqueueEnabled = isEnqueueEnabled;
    }

    public boolean getIsRetentionEnabled() {
        return isRetentionEnabled;
    }

    public void setIsRetentionEnabled(boolean isRetentionEnabled) {
        this.isRetentionEnabled = isRetentionEnabled;
    }

    public Boolean getIsPoisonMessageHandlingEnabled() {
        return isPoisonMessageHandlingEnabled;
    }

    public void setIsPoisonMessageHandlingEnabled(Boolean isPoisonMessageHandlingEnabled) {
        this.isPoisonMessageHandlingEnabled = isPoisonMessageHandlingEnabled;
    }
    
}
