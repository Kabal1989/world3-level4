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
@Table(name = "server_audit_specifications")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerAuditSpecifications.findAll", query = "SELECT s FROM ServerAuditSpecifications s"),
    @NamedQuery(name = "ServerAuditSpecifications.findByServerSpecificationId", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.serverSpecificationId = :serverSpecificationId"),
    @NamedQuery(name = "ServerAuditSpecifications.findByName", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.name = :name"),
    @NamedQuery(name = "ServerAuditSpecifications.findByCreateDate", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "ServerAuditSpecifications.findByModifyDate", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "ServerAuditSpecifications.findByAuditGuid", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.auditGuid = :auditGuid"),
    @NamedQuery(name = "ServerAuditSpecifications.findByIsStateEnabled", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.isStateEnabled = :isStateEnabled"),
    @NamedQuery(name = "ServerAuditSpecifications.findByIsSessionContextEnabled", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.isSessionContextEnabled = :isSessionContextEnabled"),
    @NamedQuery(name = "ServerAuditSpecifications.findBySessionContextKeys", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.sessionContextKeys = :sessionContextKeys")})
public class ServerAuditSpecifications implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "server_specification_id")
    private int serverSpecificationId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
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
    @Size(max = 36)
    @Column(name = "audit_guid")
    private String auditGuid;
    @Column(name = "is_state_enabled")
    private Boolean isStateEnabled;
    @Column(name = "is_session_context_enabled")
    private Boolean isSessionContextEnabled;
    @Size(max = 2147483647)
    @Column(name = "session_context_keys")
    private String sessionContextKeys;

    public ServerAuditSpecifications() {
    }

    public int getServerSpecificationId() {
        return serverSpecificationId;
    }

    public void setServerSpecificationId(int serverSpecificationId) {
        this.serverSpecificationId = serverSpecificationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAuditGuid() {
        return auditGuid;
    }

    public void setAuditGuid(String auditGuid) {
        this.auditGuid = auditGuid;
    }

    public Boolean getIsStateEnabled() {
        return isStateEnabled;
    }

    public void setIsStateEnabled(Boolean isStateEnabled) {
        this.isStateEnabled = isStateEnabled;
    }

    public Boolean getIsSessionContextEnabled() {
        return isSessionContextEnabled;
    }

    public void setIsSessionContextEnabled(Boolean isSessionContextEnabled) {
        this.isSessionContextEnabled = isSessionContextEnabled;
    }

    public String getSessionContextKeys() {
        return sessionContextKeys;
    }

    public void setSessionContextKeys(String sessionContextKeys) {
        this.sessionContextKeys = sessionContextKeys;
    }
    
}
