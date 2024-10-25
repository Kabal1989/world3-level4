/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_database_external_policy_principals")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDatabaseExternalPolicyPrincipals.findAll", query = "SELECT d FROM DmDatabaseExternalPolicyPrincipals d"),
    @NamedQuery(name = "DmDatabaseExternalPolicyPrincipals.findByAadObjectId", query = "SELECT d FROM DmDatabaseExternalPolicyPrincipals d WHERE d.aadObjectId = :aadObjectId"),
    @NamedQuery(name = "DmDatabaseExternalPolicyPrincipals.findByType", query = "SELECT d FROM DmDatabaseExternalPolicyPrincipals d WHERE d.type = :type"),
    @NamedQuery(name = "DmDatabaseExternalPolicyPrincipals.findByTypeDesc", query = "SELECT d FROM DmDatabaseExternalPolicyPrincipals d WHERE d.typeDesc = :typeDesc"),
    @NamedQuery(name = "DmDatabaseExternalPolicyPrincipals.findByAuthenticationType", query = "SELECT d FROM DmDatabaseExternalPolicyPrincipals d WHERE d.authenticationType = :authenticationType"),
    @NamedQuery(name = "DmDatabaseExternalPolicyPrincipals.findByAuthenticationTypeDesc", query = "SELECT d FROM DmDatabaseExternalPolicyPrincipals d WHERE d.authenticationTypeDesc = :authenticationTypeDesc")})
public class DmDatabaseExternalPolicyPrincipals implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Size(max = 36)
    @Column(name = "aad_object_id")
    private String aadObjectId;
    @Size(max = 2)
    @Column(name = "type")
    private String type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "authentication_type")
    private Integer authenticationType;
    @Size(max = 60)
    @Column(name = "authentication_type_desc")
    private String authenticationTypeDesc;

    public DmDatabaseExternalPolicyPrincipals() {
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public String getAadObjectId() {
        return aadObjectId;
    }

    public void setAadObjectId(String aadObjectId) {
        this.aadObjectId = aadObjectId;
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

    public Integer getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(Integer authenticationType) {
        this.authenticationType = authenticationType;
    }

    public String getAuthenticationTypeDesc() {
        return authenticationTypeDesc;
    }

    public void setAuthenticationTypeDesc(String authenticationTypeDesc) {
        this.authenticationTypeDesc = authenticationTypeDesc;
    }
    
}
