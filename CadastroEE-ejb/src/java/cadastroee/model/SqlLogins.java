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
@Table(name = "sql_logins")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SqlLogins.findAll", query = "SELECT s FROM SqlLogins s"),
    @NamedQuery(name = "SqlLogins.findByName", query = "SELECT s FROM SqlLogins s WHERE s.name = :name"),
    @NamedQuery(name = "SqlLogins.findByPrincipalId", query = "SELECT s FROM SqlLogins s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "SqlLogins.findByType", query = "SELECT s FROM SqlLogins s WHERE s.type = :type"),
    @NamedQuery(name = "SqlLogins.findByTypeDesc", query = "SELECT s FROM SqlLogins s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "SqlLogins.findByIsDisabled", query = "SELECT s FROM SqlLogins s WHERE s.isDisabled = :isDisabled"),
    @NamedQuery(name = "SqlLogins.findByCreateDate", query = "SELECT s FROM SqlLogins s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "SqlLogins.findByModifyDate", query = "SELECT s FROM SqlLogins s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "SqlLogins.findByDefaultDatabaseName", query = "SELECT s FROM SqlLogins s WHERE s.defaultDatabaseName = :defaultDatabaseName"),
    @NamedQuery(name = "SqlLogins.findByDefaultLanguageName", query = "SELECT s FROM SqlLogins s WHERE s.defaultLanguageName = :defaultLanguageName"),
    @NamedQuery(name = "SqlLogins.findByCredentialId", query = "SELECT s FROM SqlLogins s WHERE s.credentialId = :credentialId"),
    @NamedQuery(name = "SqlLogins.findByIsPolicyChecked", query = "SELECT s FROM SqlLogins s WHERE s.isPolicyChecked = :isPolicyChecked"),
    @NamedQuery(name = "SqlLogins.findByIsExpirationChecked", query = "SELECT s FROM SqlLogins s WHERE s.isExpirationChecked = :isExpirationChecked")})
public class SqlLogins implements Serializable {

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
    @Column(name = "is_policy_checked")
    private Boolean isPolicyChecked;
    @Column(name = "is_expiration_checked")
    private Boolean isExpirationChecked;
    @Lob
    @Column(name = "password_hash")
    private byte[] passwordHash;

    public SqlLogins() {
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

    public Boolean getIsPolicyChecked() {
        return isPolicyChecked;
    }

    public void setIsPolicyChecked(Boolean isPolicyChecked) {
        this.isPolicyChecked = isPolicyChecked;
    }

    public Boolean getIsExpirationChecked() {
        return isExpirationChecked;
    }

    public void setIsExpirationChecked(Boolean isExpirationChecked) {
        this.isExpirationChecked = isExpirationChecked;
    }

    public byte[] getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(byte[] passwordHash) {
        this.passwordHash = passwordHash;
    }
    
}
