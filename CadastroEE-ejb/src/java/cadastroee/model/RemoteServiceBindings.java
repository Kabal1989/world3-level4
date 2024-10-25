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
@Table(name = "remote_service_bindings")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RemoteServiceBindings.findAll", query = "SELECT r FROM RemoteServiceBindings r"),
    @NamedQuery(name = "RemoteServiceBindings.findByName", query = "SELECT r FROM RemoteServiceBindings r WHERE r.name = :name"),
    @NamedQuery(name = "RemoteServiceBindings.findByRemoteServiceBindingId", query = "SELECT r FROM RemoteServiceBindings r WHERE r.remoteServiceBindingId = :remoteServiceBindingId"),
    @NamedQuery(name = "RemoteServiceBindings.findByPrincipalId", query = "SELECT r FROM RemoteServiceBindings r WHERE r.principalId = :principalId"),
    @NamedQuery(name = "RemoteServiceBindings.findByRemoteServiceName", query = "SELECT r FROM RemoteServiceBindings r WHERE r.remoteServiceName = :remoteServiceName"),
    @NamedQuery(name = "RemoteServiceBindings.findByServiceContractId", query = "SELECT r FROM RemoteServiceBindings r WHERE r.serviceContractId = :serviceContractId"),
    @NamedQuery(name = "RemoteServiceBindings.findByRemotePrincipalId", query = "SELECT r FROM RemoteServiceBindings r WHERE r.remotePrincipalId = :remotePrincipalId"),
    @NamedQuery(name = "RemoteServiceBindings.findByIsAnonymousOn", query = "SELECT r FROM RemoteServiceBindings r WHERE r.isAnonymousOn = :isAnonymousOn")})
public class RemoteServiceBindings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "remote_service_binding_id")
    private int remoteServiceBindingId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Size(max = 256)
    @Column(name = "remote_service_name")
    private String remoteServiceName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_contract_id")
    private int serviceContractId;
    @Column(name = "remote_principal_id")
    private Integer remotePrincipalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_anonymous_on")
    private boolean isAnonymousOn;

    public RemoteServiceBindings() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRemoteServiceBindingId() {
        return remoteServiceBindingId;
    }

    public void setRemoteServiceBindingId(int remoteServiceBindingId) {
        this.remoteServiceBindingId = remoteServiceBindingId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public String getRemoteServiceName() {
        return remoteServiceName;
    }

    public void setRemoteServiceName(String remoteServiceName) {
        this.remoteServiceName = remoteServiceName;
    }

    public int getServiceContractId() {
        return serviceContractId;
    }

    public void setServiceContractId(int serviceContractId) {
        this.serviceContractId = serviceContractId;
    }

    public Integer getRemotePrincipalId() {
        return remotePrincipalId;
    }

    public void setRemotePrincipalId(Integer remotePrincipalId) {
        this.remotePrincipalId = remotePrincipalId;
    }

    public boolean getIsAnonymousOn() {
        return isAnonymousOn;
    }

    public void setIsAnonymousOn(boolean isAnonymousOn) {
        this.isAnonymousOn = isAnonymousOn;
    }
    
}
