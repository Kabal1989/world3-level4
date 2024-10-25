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
@Table(name = "dm_hadr_cluster_networks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrClusterNetworks.findAll", query = "SELECT d FROM DmHadrClusterNetworks d"),
    @NamedQuery(name = "DmHadrClusterNetworks.findByMemberName", query = "SELECT d FROM DmHadrClusterNetworks d WHERE d.memberName = :memberName"),
    @NamedQuery(name = "DmHadrClusterNetworks.findByNetworkSubnetIp", query = "SELECT d FROM DmHadrClusterNetworks d WHERE d.networkSubnetIp = :networkSubnetIp"),
    @NamedQuery(name = "DmHadrClusterNetworks.findByNetworkSubnetIpv4Mask", query = "SELECT d FROM DmHadrClusterNetworks d WHERE d.networkSubnetIpv4Mask = :networkSubnetIpv4Mask"),
    @NamedQuery(name = "DmHadrClusterNetworks.findByNetworkSubnetPrefixLength", query = "SELECT d FROM DmHadrClusterNetworks d WHERE d.networkSubnetPrefixLength = :networkSubnetPrefixLength"),
    @NamedQuery(name = "DmHadrClusterNetworks.findByIsPublic", query = "SELECT d FROM DmHadrClusterNetworks d WHERE d.isPublic = :isPublic"),
    @NamedQuery(name = "DmHadrClusterNetworks.findByIsIpv4", query = "SELECT d FROM DmHadrClusterNetworks d WHERE d.isIpv4 = :isIpv4")})
public class DmHadrClusterNetworks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "member_name")
    private String memberName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "network_subnet_ip")
    private String networkSubnetIp;
    @Size(max = 45)
    @Column(name = "network_subnet_ipv4_mask")
    private String networkSubnetIpv4Mask;
    @Column(name = "network_subnet_prefix_length")
    private Integer networkSubnetPrefixLength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_public")
    private boolean isPublic;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_ipv4")
    private boolean isIpv4;

    public DmHadrClusterNetworks() {
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getNetworkSubnetIp() {
        return networkSubnetIp;
    }

    public void setNetworkSubnetIp(String networkSubnetIp) {
        this.networkSubnetIp = networkSubnetIp;
    }

    public String getNetworkSubnetIpv4Mask() {
        return networkSubnetIpv4Mask;
    }

    public void setNetworkSubnetIpv4Mask(String networkSubnetIpv4Mask) {
        this.networkSubnetIpv4Mask = networkSubnetIpv4Mask;
    }

    public Integer getNetworkSubnetPrefixLength() {
        return networkSubnetPrefixLength;
    }

    public void setNetworkSubnetPrefixLength(Integer networkSubnetPrefixLength) {
        this.networkSubnetPrefixLength = networkSubnetPrefixLength;
    }

    public boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public boolean getIsIpv4() {
        return isIpv4;
    }

    public void setIsIpv4(boolean isIpv4) {
        this.isIpv4 = isIpv4;
    }
    
}
