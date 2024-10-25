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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "server_principal_credentials")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerPrincipalCredentials.findAll", query = "SELECT s FROM ServerPrincipalCredentials s"),
    @NamedQuery(name = "ServerPrincipalCredentials.findByPrincipalId", query = "SELECT s FROM ServerPrincipalCredentials s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "ServerPrincipalCredentials.findByCredentialId", query = "SELECT s FROM ServerPrincipalCredentials s WHERE s.credentialId = :credentialId")})
public class ServerPrincipalCredentials implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "principal_id")
    private int principalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "credential_id")
    private int credentialId;

    public ServerPrincipalCredentials() {
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
    
}
