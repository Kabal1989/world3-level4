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
@Table(name = "service_broker_endpoints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiceBrokerEndpoints.findAll", query = "SELECT s FROM ServiceBrokerEndpoints s"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByName", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.name = :name"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByEndpointId", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.endpointId = :endpointId"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByPrincipalId", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByProtocol", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.protocol = :protocol"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByProtocolDesc", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.protocolDesc = :protocolDesc"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByType", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.type = :type"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByTypeDesc", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByState", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.state = :state"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByStateDesc", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.stateDesc = :stateDesc"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByIsAdminEndpoint", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.isAdminEndpoint = :isAdminEndpoint"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByIsMessageForwardingEnabled", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.isMessageForwardingEnabled = :isMessageForwardingEnabled"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByMessageForwardingSize", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.messageForwardingSize = :messageForwardingSize"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByConnectionAuth", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.connectionAuth = :connectionAuth"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByConnectionAuthDesc", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.connectionAuthDesc = :connectionAuthDesc"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByCertificateId", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.certificateId = :certificateId"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByEncryptionAlgorithm", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.encryptionAlgorithm = :encryptionAlgorithm"),
    @NamedQuery(name = "ServiceBrokerEndpoints.findByEncryptionAlgorithmDesc", query = "SELECT s FROM ServiceBrokerEndpoints s WHERE s.encryptionAlgorithmDesc = :encryptionAlgorithmDesc")})
public class ServiceBrokerEndpoints implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_message_forwarding_enabled")
    private boolean isMessageForwardingEnabled;
    @Basic(optional = false)
    @NotNull
    @Column(name = "message_forwarding_size")
    private int messageForwardingSize;
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

    public ServiceBrokerEndpoints() {
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

    public boolean getIsMessageForwardingEnabled() {
        return isMessageForwardingEnabled;
    }

    public void setIsMessageForwardingEnabled(boolean isMessageForwardingEnabled) {
        this.isMessageForwardingEnabled = isMessageForwardingEnabled;
    }

    public int getMessageForwardingSize() {
        return messageForwardingSize;
    }

    public void setMessageForwardingSize(int messageForwardingSize) {
        this.messageForwardingSize = messageForwardingSize;
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
