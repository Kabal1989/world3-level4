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
@Table(name = "tcp_endpoints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TcpEndpoints.findAll", query = "SELECT t FROM TcpEndpoints t"),
    @NamedQuery(name = "TcpEndpoints.findByName", query = "SELECT t FROM TcpEndpoints t WHERE t.name = :name"),
    @NamedQuery(name = "TcpEndpoints.findByEndpointId", query = "SELECT t FROM TcpEndpoints t WHERE t.endpointId = :endpointId"),
    @NamedQuery(name = "TcpEndpoints.findByPrincipalId", query = "SELECT t FROM TcpEndpoints t WHERE t.principalId = :principalId"),
    @NamedQuery(name = "TcpEndpoints.findByProtocol", query = "SELECT t FROM TcpEndpoints t WHERE t.protocol = :protocol"),
    @NamedQuery(name = "TcpEndpoints.findByProtocolDesc", query = "SELECT t FROM TcpEndpoints t WHERE t.protocolDesc = :protocolDesc"),
    @NamedQuery(name = "TcpEndpoints.findByType", query = "SELECT t FROM TcpEndpoints t WHERE t.type = :type"),
    @NamedQuery(name = "TcpEndpoints.findByTypeDesc", query = "SELECT t FROM TcpEndpoints t WHERE t.typeDesc = :typeDesc"),
    @NamedQuery(name = "TcpEndpoints.findByState", query = "SELECT t FROM TcpEndpoints t WHERE t.state = :state"),
    @NamedQuery(name = "TcpEndpoints.findByStateDesc", query = "SELECT t FROM TcpEndpoints t WHERE t.stateDesc = :stateDesc"),
    @NamedQuery(name = "TcpEndpoints.findByIsAdminEndpoint", query = "SELECT t FROM TcpEndpoints t WHERE t.isAdminEndpoint = :isAdminEndpoint"),
    @NamedQuery(name = "TcpEndpoints.findByPort", query = "SELECT t FROM TcpEndpoints t WHERE t.port = :port"),
    @NamedQuery(name = "TcpEndpoints.findByIsDynamicPort", query = "SELECT t FROM TcpEndpoints t WHERE t.isDynamicPort = :isDynamicPort"),
    @NamedQuery(name = "TcpEndpoints.findByIpAddress", query = "SELECT t FROM TcpEndpoints t WHERE t.ipAddress = :ipAddress")})
public class TcpEndpoints implements Serializable {

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
    @Column(name = "port")
    private int port;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_dynamic_port")
    private boolean isDynamicPort;
    @Size(max = 45)
    @Column(name = "ip_address")
    private String ipAddress;

    public TcpEndpoints() {
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

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean getIsDynamicPort() {
        return isDynamicPort;
    }

    public void setIsDynamicPort(boolean isDynamicPort) {
        this.isDynamicPort = isDynamicPort;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
}
