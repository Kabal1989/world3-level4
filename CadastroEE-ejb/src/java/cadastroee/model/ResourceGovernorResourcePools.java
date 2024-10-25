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
@Table(name = "resource_governor_resource_pools")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResourceGovernorResourcePools.findAll", query = "SELECT r FROM ResourceGovernorResourcePools r"),
    @NamedQuery(name = "ResourceGovernorResourcePools.findByPoolId", query = "SELECT r FROM ResourceGovernorResourcePools r WHERE r.poolId = :poolId"),
    @NamedQuery(name = "ResourceGovernorResourcePools.findByName", query = "SELECT r FROM ResourceGovernorResourcePools r WHERE r.name = :name"),
    @NamedQuery(name = "ResourceGovernorResourcePools.findByMinCpuPercent", query = "SELECT r FROM ResourceGovernorResourcePools r WHERE r.minCpuPercent = :minCpuPercent"),
    @NamedQuery(name = "ResourceGovernorResourcePools.findByMaxCpuPercent", query = "SELECT r FROM ResourceGovernorResourcePools r WHERE r.maxCpuPercent = :maxCpuPercent"),
    @NamedQuery(name = "ResourceGovernorResourcePools.findByMinMemoryPercent", query = "SELECT r FROM ResourceGovernorResourcePools r WHERE r.minMemoryPercent = :minMemoryPercent"),
    @NamedQuery(name = "ResourceGovernorResourcePools.findByMaxMemoryPercent", query = "SELECT r FROM ResourceGovernorResourcePools r WHERE r.maxMemoryPercent = :maxMemoryPercent"),
    @NamedQuery(name = "ResourceGovernorResourcePools.findByCapCpuPercent", query = "SELECT r FROM ResourceGovernorResourcePools r WHERE r.capCpuPercent = :capCpuPercent"),
    @NamedQuery(name = "ResourceGovernorResourcePools.findByMinIopsPerVolume", query = "SELECT r FROM ResourceGovernorResourcePools r WHERE r.minIopsPerVolume = :minIopsPerVolume"),
    @NamedQuery(name = "ResourceGovernorResourcePools.findByMaxIopsPerVolume", query = "SELECT r FROM ResourceGovernorResourcePools r WHERE r.maxIopsPerVolume = :maxIopsPerVolume")})
public class ResourceGovernorResourcePools implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pool_id")
    private int poolId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_cpu_percent")
    private int minCpuPercent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_cpu_percent")
    private int maxCpuPercent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_memory_percent")
    private int minMemoryPercent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_memory_percent")
    private int maxMemoryPercent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cap_cpu_percent")
    private int capCpuPercent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_iops_per_volume")
    private int minIopsPerVolume;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_iops_per_volume")
    private int maxIopsPerVolume;

    public ResourceGovernorResourcePools() {
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinCpuPercent() {
        return minCpuPercent;
    }

    public void setMinCpuPercent(int minCpuPercent) {
        this.minCpuPercent = minCpuPercent;
    }

    public int getMaxCpuPercent() {
        return maxCpuPercent;
    }

    public void setMaxCpuPercent(int maxCpuPercent) {
        this.maxCpuPercent = maxCpuPercent;
    }

    public int getMinMemoryPercent() {
        return minMemoryPercent;
    }

    public void setMinMemoryPercent(int minMemoryPercent) {
        this.minMemoryPercent = minMemoryPercent;
    }

    public int getMaxMemoryPercent() {
        return maxMemoryPercent;
    }

    public void setMaxMemoryPercent(int maxMemoryPercent) {
        this.maxMemoryPercent = maxMemoryPercent;
    }

    public int getCapCpuPercent() {
        return capCpuPercent;
    }

    public void setCapCpuPercent(int capCpuPercent) {
        this.capCpuPercent = capCpuPercent;
    }

    public int getMinIopsPerVolume() {
        return minIopsPerVolume;
    }

    public void setMinIopsPerVolume(int minIopsPerVolume) {
        this.minIopsPerVolume = minIopsPerVolume;
    }

    public int getMaxIopsPerVolume() {
        return maxIopsPerVolume;
    }

    public void setMaxIopsPerVolume(int maxIopsPerVolume) {
        this.maxIopsPerVolume = maxIopsPerVolume;
    }
    
}
