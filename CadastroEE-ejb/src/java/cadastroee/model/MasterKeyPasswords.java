/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "master_key_passwords")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MasterKeyPasswords.findAll", query = "SELECT m FROM MasterKeyPasswords m"),
    @NamedQuery(name = "MasterKeyPasswords.findByCredentialId", query = "SELECT m FROM MasterKeyPasswords m WHERE m.credentialId = :credentialId"),
    @NamedQuery(name = "MasterKeyPasswords.findByFamilyGuid", query = "SELECT m FROM MasterKeyPasswords m WHERE m.familyGuid = :familyGuid")})
public class MasterKeyPasswords implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "credential_id")
    private int credentialId;
    @Size(max = 36)
    @Column(name = "family_guid")
    private String familyGuid;

    public MasterKeyPasswords() {
    }

    public int getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(int credentialId) {
        this.credentialId = credentialId;
    }

    public String getFamilyGuid() {
        return familyGuid;
    }

    public void setFamilyGuid(String familyGuid) {
        this.familyGuid = familyGuid;
    }
    
}
