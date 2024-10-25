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
@Table(name = "server_audits")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerAudits.findAll", query = "SELECT s FROM ServerAudits s"),
    @NamedQuery(name = "ServerAudits.findByAuditId", query = "SELECT s FROM ServerAudits s WHERE s.auditId = :auditId"),
    @NamedQuery(name = "ServerAudits.findByName", query = "SELECT s FROM ServerAudits s WHERE s.name = :name"),
    @NamedQuery(name = "ServerAudits.findByAuditGuid", query = "SELECT s FROM ServerAudits s WHERE s.auditGuid = :auditGuid"),
    @NamedQuery(name = "ServerAudits.findByCreateDate", query = "SELECT s FROM ServerAudits s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "ServerAudits.findByModifyDate", query = "SELECT s FROM ServerAudits s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "ServerAudits.findByPrincipalId", query = "SELECT s FROM ServerAudits s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "ServerAudits.findByType", query = "SELECT s FROM ServerAudits s WHERE s.type = :type"),
    @NamedQuery(name = "ServerAudits.findByTypeDesc", query = "SELECT s FROM ServerAudits s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "ServerAudits.findByOnFailure", query = "SELECT s FROM ServerAudits s WHERE s.onFailure = :onFailure"),
    @NamedQuery(name = "ServerAudits.findByOnFailureDesc", query = "SELECT s FROM ServerAudits s WHERE s.onFailureDesc = :onFailureDesc"),
    @NamedQuery(name = "ServerAudits.findByIsStateEnabled", query = "SELECT s FROM ServerAudits s WHERE s.isStateEnabled = :isStateEnabled"),
    @NamedQuery(name = "ServerAudits.findByQueueDelay", query = "SELECT s FROM ServerAudits s WHERE s.queueDelay = :queueDelay"),
    @NamedQuery(name = "ServerAudits.findByPredicate", query = "SELECT s FROM ServerAudits s WHERE s.predicate = :predicate"),
    @NamedQuery(name = "ServerAudits.findByIsOperatorAudit", query = "SELECT s FROM ServerAudits s WHERE s.isOperatorAudit = :isOperatorAudit")})
public class ServerAudits implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "audit_id")
    private int auditId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 36)
    @Column(name = "audit_guid")
    private String auditGuid;
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
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "type")
    private String type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "on_failure")
    private Short onFailure;
    @Size(max = 60)
    @Column(name = "on_failure_desc")
    private String onFailureDesc;
    @Column(name = "is_state_enabled")
    private Boolean isStateEnabled;
    @Column(name = "queue_delay")
    private Integer queueDelay;
    @Size(max = 3000)
    @Column(name = "predicate")
    private String predicate;
    @Column(name = "is_operator_audit")
    private Boolean isOperatorAudit;

    public ServerAudits() {
    }

    public int getAuditId() {
        return auditId;
    }

    public void setAuditId(int auditId) {
        this.auditId = auditId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuditGuid() {
        return auditGuid;
    }

    public void setAuditGuid(String auditGuid) {
        this.auditGuid = auditGuid;
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

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
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

    public Short getOnFailure() {
        return onFailure;
    }

    public void setOnFailure(Short onFailure) {
        this.onFailure = onFailure;
    }

    public String getOnFailureDesc() {
        return onFailureDesc;
    }

    public void setOnFailureDesc(String onFailureDesc) {
        this.onFailureDesc = onFailureDesc;
    }

    public Boolean getIsStateEnabled() {
        return isStateEnabled;
    }

    public void setIsStateEnabled(Boolean isStateEnabled) {
        this.isStateEnabled = isStateEnabled;
    }

    public Integer getQueueDelay() {
        return queueDelay;
    }

    public void setQueueDelay(Integer queueDelay) {
        this.queueDelay = queueDelay;
    }

    public String getPredicate() {
        return predicate;
    }

    public void setPredicate(String predicate) {
        this.predicate = predicate;
    }

    public Boolean getIsOperatorAudit() {
        return isOperatorAudit;
    }

    public void setIsOperatorAudit(Boolean isOperatorAudit) {
        this.isOperatorAudit = isOperatorAudit;
    }
    
}
