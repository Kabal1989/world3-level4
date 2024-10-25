/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_cache_size")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmCacheSize.findAll", query = "SELECT d FROM DmCacheSize d"),
    @NamedQuery(name = "DmCacheSize.findByDistributionId", query = "SELECT d FROM DmCacheSize d WHERE d.distributionId = :distributionId"),
    @NamedQuery(name = "DmCacheSize.findByCacheUsed", query = "SELECT d FROM DmCacheSize d WHERE d.cacheUsed = :cacheUsed"),
    @NamedQuery(name = "DmCacheSize.findByCacheAvailable", query = "SELECT d FROM DmCacheSize d WHERE d.cacheAvailable = :cacheAvailable"),
    @NamedQuery(name = "DmCacheSize.findByCacheCapacity", query = "SELECT d FROM DmCacheSize d WHERE d.cacheCapacity = :cacheCapacity")})
public class DmCacheSize implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "distribution_id")
    private Short distributionId;
    @Column(name = "cache_used")
    private BigInteger cacheUsed;
    @Column(name = "cache_available")
    private BigInteger cacheAvailable;
    @Column(name = "cache_capacity")
    private BigInteger cacheCapacity;

    public DmCacheSize() {
    }

    public Short getDistributionId() {
        return distributionId;
    }

    public void setDistributionId(Short distributionId) {
        this.distributionId = distributionId;
    }

    public BigInteger getCacheUsed() {
        return cacheUsed;
    }

    public void setCacheUsed(BigInteger cacheUsed) {
        this.cacheUsed = cacheUsed;
    }

    public BigInteger getCacheAvailable() {
        return cacheAvailable;
    }

    public void setCacheAvailable(BigInteger cacheAvailable) {
        this.cacheAvailable = cacheAvailable;
    }

    public BigInteger getCacheCapacity() {
        return cacheCapacity;
    }

    public void setCacheCapacity(BigInteger cacheCapacity) {
        this.cacheCapacity = cacheCapacity;
    }
    
}
