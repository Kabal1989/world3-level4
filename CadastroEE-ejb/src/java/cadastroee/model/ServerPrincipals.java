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
import javax.persistence.Lob;
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
@Table(name = "server_principals")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerPrincipals.findAll", query = "SELECT s FROM ServerPrincipals s"),
    @NamedQuery(name = "ServerPrincipals.findByName", query = "SELECT s FROM ServerPrincipals s WHERE s.name = :name"),
    @NamedQuery(name = "ServerPrincipals.findByPrincipalId", query = "SELECT s FROM ServerPrincipals s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "ServerPrincipals.findByType", query = "SELECT s FROM ServerPrincipals s WHERE s.type = :type"),
    @NamedQuery(name = "ServerPrincipals.findByTypeDesc", query = "SELECT s FROM ServerPrincipals s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "ServerPrincipals.findByIsDisabled", query = "SELECT s FROM ServerPrincipals s WHERE s.isDisabled = :isDisabled"),
    @NamedQuery(name = "ServerPrincipals.findByCreateDate", query = "SELECT s FROM ServerPrincipals s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "ServerPrincipals.findByModifyDate", query = "SELECT s FROM ServerPrincipals s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "ServerPrincipals.findByDefaultDatabaseName", query = "SELECT s FROM ServerPrincipals s WHERE s.defaultDatabaseName = :defaultDatabaseName"),
    @NamedQuery(name = "ServerPrincipals.findByDefaultLanguageName", query = "SELECT s FROM ServerPrincipals s WHERE s.defaultLanguageName = :defaultLanguageName"),
    @NamedQuery(name = "ServerPrincipals.findByCredentialId", query = "SELECT s FROM ServerPrincipals s WHERE s.credentialId = :credentialId"),
    @NamedQuery(name = "ServerPrincipals.findByOwningPrincipalId", query = "SELECT s FROM ServerPrincipals s WHERE s.owningPrincipalId = :owningPrincipalId"),
    @NamedQuery(name = "ServerPrincipals.findByIsFixedRole", query = "SELECT s FROM ServerPrincipals s WHERE s.isFixedRole = :isFixedRole"),
    @NamedQuery(name = "ServerPrincipals.findByTenantId", query = "SELECT s FROM ServerPrincipals s WHERE s.tenantId = :tenantId")})
public class ServerPrincipals implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "principal_id")
    private int principalId;
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private Character type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "is_disabled")
    private Boolean isDisabled;
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
    @Size(max = 128)
    @Column(name = "default_database_name")
    private String defaultDatabaseName;
    @Size(max = 128)
    @Column(name = "default_language_name")
    private String defaultLanguageName;
    @Column(name = "credential_id")
    private Integer credentialId;
    @Column(name = "owning_principal_id")
    private Integer owningPrincipalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_fixed_role")
    private boolean isFixedRole;
    @Size(max = 36)
    @Column(name = "tenant_id")
    private String tenantId;

    public ServerPrincipals() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(int principalId) {
        this.principalId = principalId;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
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

    public String getDefaultDatabaseName() {
        return defaultDatabaseName;
    }

    public void setDefaultDatabaseName(String defaultDatabaseName) {
        this.defaultDatabaseName = defaultDatabaseName;
    }

    public String getDefaultLanguageName() {
        return defaultLanguageName;
    }

    public void setDefaultLanguageName(String defaultLanguageName) {
        this.defaultLanguageName = defaultLanguageName;
    }

    public Integer getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(Integer credentialId) {
        this.credentialId = credentialId;
    }

    public Integer getOwningPrincipalId() {
        return owningPrincipalId;
    }

    public void setOwningPrincipalId(Integer owningPrincipalId) {
        this.owningPrincipalId = owningPrincipalId;
    }

    public boolean getIsFixedRole() {
        return isFixedRole;
    }

    public void setIsFixedRole(boolean isFixedRole) {
        this.isFixedRole = isFixedRole;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    
}
