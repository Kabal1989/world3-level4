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
@Table(name = "via_endpoints")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ViaEndpoints.findAll", query = "SELECT v FROM ViaEndpoints v"),
    @NamedQuery(name = "ViaEndpoints.findByName", query = "SELECT v FROM ViaEndpoints v WHERE v.name = :name"),
    @NamedQuery(name = "ViaEndpoints.findByEndpointId", query = "SELECT v FROM ViaEndpoints v WHERE v.endpointId = :endpointId"),
    @NamedQuery(name = "ViaEndpoints.findByPrincipalId", query = "SELECT v FROM ViaEndpoints v WHERE v.principalId = :principalId"),
    @NamedQuery(name = "ViaEndpoints.findByProtocol", query = "SELECT v FROM ViaEndpoints v WHERE v.protocol = :protocol"),
    @NamedQuery(name = "ViaEndpoints.findByProtocolDesc", query = "SELECT v FROM ViaEndpoints v WHERE v.protocolDesc = :protocolDesc"),
    @NamedQuery(name = "ViaEndpoints.findByType", query = "SELECT v FROM ViaEndpoints v WHERE v.type = :type"),
    @NamedQuery(name = "ViaEndpoints.findByTypeDesc", query = "SELECT v FROM ViaEndpoints v WHERE v.typeDesc = :typeDesc"),
    @NamedQuery(name = "ViaEndpoints.findByState", query = "SELECT v FROM ViaEndpoints v WHERE v.state = :state"),
    @NamedQuery(name = "ViaEndpoints.findByStateDesc", query = "SELECT v FROM ViaEndpoints v WHERE v.stateDesc = :stateDesc"),
    @NamedQuery(name = "ViaEndpoints.findByIsAdminEndpoint", query = "SELECT v FROM ViaEndpoints v WHERE v.isAdminEndpoint = :isAdminEndpoint"),
    @NamedQuery(name = "ViaEndpoints.findByDiscriminator", query = "SELECT v FROM ViaEndpoints v WHERE v.discriminator = :discriminator")})
public class ViaEndpoints implements Serializable {

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
    @Size(max = 128)
    @Column(name = "discriminator")
    private String discriminator;

    public ViaEndpoints() {
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

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }
    
}
