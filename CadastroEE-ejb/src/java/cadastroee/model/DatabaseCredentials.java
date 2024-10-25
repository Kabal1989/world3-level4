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
@Table(name = "database_credentials")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseCredentials.findAll", query = "SELECT d FROM DatabaseCredentials d"),
    @NamedQuery(name = "DatabaseCredentials.findByName", query = "SELECT d FROM DatabaseCredentials d WHERE d.name = :name"),
    @NamedQuery(name = "DatabaseCredentials.findByPrincipalId", query = "SELECT d FROM DatabaseCredentials d WHERE d.principalId = :principalId"),
    @NamedQuery(name = "DatabaseCredentials.findByCredentialId", query = "SELECT d FROM DatabaseCredentials d WHERE d.credentialId = :credentialId"),
    @NamedQuery(name = "DatabaseCredentials.findByCredentialIdentity", query = "SELECT d FROM DatabaseCredentials d WHERE d.credentialIdentity = :credentialIdentity"),
    @NamedQuery(name = "DatabaseCredentials.findByCreateDate", query = "SELECT d FROM DatabaseCredentials d WHERE d.createDate = :createDate"),
    @NamedQuery(name = "DatabaseCredentials.findByModifyDate", query = "SELECT d FROM DatabaseCredentials d WHERE d.modifyDate = :modifyDate"),
    @NamedQuery(name = "DatabaseCredentials.findByTargetType", query = "SELECT d FROM DatabaseCredentials d WHERE d.targetType = :targetType"),
    @NamedQuery(name = "DatabaseCredentials.findByTargetId", query = "SELECT d FROM DatabaseCredentials d WHERE d.targetId = :targetId")})
public class DatabaseCredentials implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "credential_id")
    private int credentialId;
    @Size(max = 4000)
    @Column(name = "credential_identity")
    private String credentialIdentity;
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
    @Size(max = 60)
    @Column(name = "target_type")
    private String targetType;
    @Column(name = "target_id")
    private Integer targetId;

    public DatabaseCredentials() {
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

    public int getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(int credentialId) {
        this.credentialId = credentialId;
    }

    public String getCredentialIdentity() {
        return credentialIdentity;
    }

    public void setCredentialIdentity(String credentialIdentity) {
        this.credentialIdentity = credentialIdentity;
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

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }
    
}
