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
@Table(name = "database_mirroring_endpoints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseMirroringEndpoints.findAll", query = "SELECT d FROM DatabaseMirroringEndpoints d"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByName", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.name = :name"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByEndpointId", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.endpointId = :endpointId"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByPrincipalId", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.principalId = :principalId"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByProtocol", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.protocol = :protocol"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByProtocolDesc", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.protocolDesc = :protocolDesc"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByType", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.type = :type"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByTypeDesc", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.typeDesc = :typeDesc"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByState", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.state = :state"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByStateDesc", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.stateDesc = :stateDesc"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByIsAdminEndpoint", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.isAdminEndpoint = :isAdminEndpoint"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByRole", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.role = :role"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByRoleDesc", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.roleDesc = :roleDesc"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByIsEncryptionEnabled", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.isEncryptionEnabled = :isEncryptionEnabled"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByConnectionAuth", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.connectionAuth = :connectionAuth"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByConnectionAuthDesc", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.connectionAuthDesc = :connectionAuthDesc"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByCertificateId", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.certificateId = :certificateId"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByEncryptionAlgorithm", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.encryptionAlgorithm = :encryptionAlgorithm"),
    @NamedQuery(name = "DatabaseMirroringEndpoints.findByEncryptionAlgorithmDesc", query = "SELECT d FROM DatabaseMirroringEndpoints d WHERE d.encryptionAlgorithmDesc = :encryptionAlgorithmDesc")})
public class DatabaseMirroringEndpoints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "endpoint_id")
    private int endpointId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "protocol")
    private short protocol;
    @Size(max = 60)
    @Column(name = "protocol_desc")
    private String protocolDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "state")
    private Short state;
    @Size(max = 60)
    @Column(name = "state_desc")
    private String stateDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_admin_endpoint")
    private boolean isAdminEndpoint;
    @Column(name = "role")
    private Short role;
    @Size(max = 60)
    @Column(name = "role_desc")
    private String roleDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_encryption_enabled")
    private boolean isEncryptionEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "connection_auth")
    private short connectionAuth;
    @Size(max = 60)
    @Column(name = "connection_auth_desc")
    private String connectionAuthDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "certificate_id")
    private int certificateId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "encryption_algorithm")
    private short encryptionAlgorithm;
    @Size(max = 60)
    @Column(name = "encryption_algorithm_desc")
    private String encryptionAlgorithmDesc;

    public DatabaseMirroringEndpoints() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(int endpointId) {
        this.endpointId = endpointId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public short getProtocol() {
        return protocol;
    }

    public void setProtocol(short protocol) {
        this.protocol = protocol;
    }

    public String getProtocolDesc() {
        return protocolDesc;
    }

    public void setProtocolDesc(String protocolDesc) {
        this.protocolDesc = protocolDesc;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public boolean getIsAdminEndpoint() {
        return isAdminEndpoint;
    }

    public void setIsAdminEndpoint(boolean isAdminEndpoint) {
        this.isAdminEndpoint = isAdminEndpoint;
    }

    public Short getRole() {
        return role;
    }

    public void setRole(Short role) {
        this.role = role;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public boolean getIsEncryptionEnabled() {
        return isEncryptionEnabled;
    }

    public void setIsEncryptionEnabled(boolean isEncryptionEnabled) {
        this.isEncryptionEnabled = isEncryptionEnabled;
    }

    public short getConnectionAuth() {
        return connectionAuth;
    }

    public void setConnectionAuth(short connectionAuth) {
        this.connectionAuth = connectionAuth;
    }

    public String getConnectionAuthDesc() {
        return connectionAuthDesc;
    }

    public void setConnectionAuthDesc(String connectionAuthDesc) {
        this.connectionAuthDesc = connectionAuthDesc;
    }

    public int getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }

    public short getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    public void setEncryptionAlgorithm(short encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public String getEncryptionAlgorithmDesc() {
        return encryptionAlgorithmDesc;
    }

    public void setEncryptionAlgorithmDesc(String encryptionAlgorithmDesc) {
        this.encryptionAlgorithmDesc = encryptionAlgorithmDesc;
    }
    
}
