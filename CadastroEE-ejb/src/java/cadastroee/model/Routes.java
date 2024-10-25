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
@Table(name = "routes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Routes.findAll", query = "SELECT r FROM Routes r"),
    @NamedQuery(name = "Routes.findByName", query = "SELECT r FROM Routes r WHERE r.name = :name"),
    @NamedQuery(name = "Routes.findByRouteId", query = "SELECT r FROM Routes r WHERE r.routeId = :routeId"),
    @NamedQuery(name = "Routes.findByPrincipalId", query = "SELECT r FROM Routes r WHERE r.principalId = :principalId"),
    @NamedQuery(name = "Routes.findByRemoteServiceName", query = "SELECT r FROM Routes r WHERE r.remoteServiceName = :remoteServiceName"),
    @NamedQuery(name = "Routes.findByBrokerInstance", query = "SELECT r FROM Routes r WHERE r.brokerInstance = :brokerInstance"),
    @NamedQuery(name = "Routes.findByLifetime", query = "SELECT r FROM Routes r WHERE r.lifetime = :lifetime"),
    @NamedQuery(name = "Routes.findByAddress", query = "SELECT r FROM Routes r WHERE r.address = :address"),
    @NamedQuery(name = "Routes.findByMirrorAddress", query = "SELECT r FROM Routes r WHERE r.mirrorAddress = :mirrorAddress")})
public class Routes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "route_id")
    private int routeId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Size(max = 256)
    @Column(name = "remote_service_name")
    private String remoteServiceName;
    @Size(max = 128)
    @Column(name = "broker_instance")
    private String brokerInstance;
    @Column(name = "lifetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lifetime;
    @Size(max = 256)
    @Column(name = "address")
    private String address;
    @Size(max = 256)
    @Column(name = "mirror_address")
    private String mirrorAddress;

    public Routes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
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

    public String getBrokerInstance() {
        return brokerInstance;
    }

    public void setBrokerInstance(String brokerInstance) {
        this.brokerInstance = brokerInstance;
    }

    public Date getLifetime() {
        return lifetime;
    }

    public void setLifetime(Date lifetime) {
        this.lifetime = lifetime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMirrorAddress() {
        return mirrorAddress;
    }

    public void setMirrorAddress(String mirrorAddress) {
        this.mirrorAddress = mirrorAddress;
    }
    
}
