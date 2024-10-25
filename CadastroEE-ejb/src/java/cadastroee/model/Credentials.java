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
@Table(name = "credentials")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Credentials.findAll", query = "SELECT c FROM Credentials c"),
    @NamedQuery(name = "Credentials.findByCredentialId", query = "SELECT c FROM Credentials c WHERE c.credentialId = :credentialId"),
    @NamedQuery(name = "Credentials.findByName", query = "SELECT c FROM Credentials c WHERE c.name = :name"),
    @NamedQuery(name = "Credentials.findByCredentialIdentity", query = "SELECT c FROM Credentials c WHERE c.credentialIdentity = :credentialIdentity"),
    @NamedQuery(name = "Credentials.findByCreateDate", query = "SELECT c FROM Credentials c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "Credentials.findByModifyDate", query = "SELECT c FROM Credentials c WHERE c.modifyDate = :modifyDate"),
    @NamedQuery(name = "Credentials.findByTargetType", query = "SELECT c FROM Credentials c WHERE c.targetType = :targetType"),
    @NamedQuery(name = "Credentials.findByTargetId", query = "SELECT c FROM Credentials c WHERE c.targetId = :targetId")})
public class Credentials implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "credential_id")
    private int credentialId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
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

    public Credentials() {
    }

    public int getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(int credentialId) {
        this.credentialId = credentialId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
