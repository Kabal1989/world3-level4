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
@Table(name = "availability_group_listeners")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvailabilityGroupListeners.findAll", query = "SELECT a FROM AvailabilityGroupListeners a"),
    @NamedQuery(name = "AvailabilityGroupListeners.findByGroupId", query = "SELECT a FROM AvailabilityGroupListeners a WHERE a.groupId = :groupId"),
    @NamedQuery(name = "AvailabilityGroupListeners.findByListenerId", query = "SELECT a FROM AvailabilityGroupListeners a WHERE a.listenerId = :listenerId"),
    @NamedQuery(name = "AvailabilityGroupListeners.findByDnsName", query = "SELECT a FROM AvailabilityGroupListeners a WHERE a.dnsName = :dnsName"),
    @NamedQuery(name = "AvailabilityGroupListeners.findByPort", query = "SELECT a FROM AvailabilityGroupListeners a WHERE a.port = :port"),
    @NamedQuery(name = "AvailabilityGroupListeners.findByIsConformant", query = "SELECT a FROM AvailabilityGroupListeners a WHERE a.isConformant = :isConformant"),
    @NamedQuery(name = "AvailabilityGroupListeners.findByIpConfigurationStringFromCluster", query = "SELECT a FROM AvailabilityGroupListeners a WHERE a.ipConfigurationStringFromCluster = :ipConfigurationStringFromCluster"),
    @NamedQuery(name = "AvailabilityGroupListeners.findByIsDistributedNetworkName", query = "SELECT a FROM AvailabilityGroupListeners a WHERE a.isDistributedNetworkName = :isDistributedNetworkName")})
public class AvailabilityGroupListeners implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "group_id")
    private String groupId;
    @Size(max = 36)
    @Column(name = "listener_id")
    private String listenerId;
    @Size(max = 63)
    @Column(name = "dns_name")
    private String dnsName;
    @Column(name = "port")
    private Integer port;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_conformant")
    private boolean isConformant;
    @Size(max = 4000)
    @Column(name = "ip_configuration_string_from_cluster")
    private String ipConfigurationStringFromCluster;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_distributed_network_name")
    private boolean isDistributedNetworkName;

    public AvailabilityGroupListeners() {
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public String getDnsName() {
        return dnsName;
    }

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public boolean getIsConformant() {
        return isConformant;
    }

    public void setIsConformant(boolean isConformant) {
        this.isConformant = isConformant;
    }

    public String getIpConfigurationStringFromCluster() {
        return ipConfigurationStringFromCluster;
    }

    public void setIpConfigurationStringFromCluster(String ipConfigurationStringFromCluster) {
        this.ipConfigurationStringFromCluster = ipConfigurationStringFromCluster;
    }

    public boolean getIsDistributedNetworkName() {
        return isDistributedNetworkName;
    }

    public void setIsDistributedNetworkName(boolean isDistributedNetworkName) {
        this.isDistributedNetworkName = isDistributedNetworkName;
    }
    
}
