/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_cache_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmCacheStats.findAll", query = "SELECT d FROM DmCacheStats d"),
    @NamedQuery(name = "DmCacheStats.findByDistributionId", query = "SELECT d FROM DmCacheStats d WHERE d.distributionId = :distributionId"),
    @NamedQuery(name = "DmCacheStats.findByCacheHit", query = "SELECT d FROM DmCacheStats d WHERE d.cacheHit = :cacheHit"),
    @NamedQuery(name = "DmCacheStats.findByRemoteHit", query = "SELECT d FROM DmCacheStats d WHERE d.remoteHit = :remoteHit"),
    @NamedQuery(name = "DmCacheStats.findByCollectionStartTime", query = "SELECT d FROM DmCacheStats d WHERE d.collectionStartTime = :collectionStartTime"),
    @NamedQuery(name = "DmCacheStats.findByCacheUsed", query = "SELECT d FROM DmCacheStats d WHERE d.cacheUsed = :cacheUsed"),
    @NamedQuery(name = "DmCacheStats.findByCacheAvailable", query = "SELECT d FROM DmCacheStats d WHERE d.cacheAvailable = :cacheAvailable"),
    @NamedQuery(name = "DmCacheStats.findByCacheCapacity", query = "SELECT d FROM DmCacheStats d WHERE d.cacheCapacity = :cacheCapacity")})
public class DmCacheStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "distribution_id")
    private Short distributionId;
    @Column(name = "cache_hit")
    private BigInteger cacheHit;
    @Column(name = "remote_hit")
    private BigInteger remoteHit;
    @Column(name = "collection_start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date collectionStartTime;
    @Column(name = "cache_used")
    private BigInteger cacheUsed;
    @Column(name = "cache_available")
    private BigInteger cacheAvailable;
    @Column(name = "cache_capacity")
    private BigInteger cacheCapacity;

    public DmCacheStats() {
    }

    public Short getDistributionId() {
        return distributionId;
    }

    public void setDistributionId(Short distributionId) {
        this.distributionId = distributionId;
    }

    public BigInteger getCacheHit() {
        return cacheHit;
    }

    public void setCacheHit(BigInteger cacheHit) {
        this.cacheHit = cacheHit;
    }

    public BigInteger getRemoteHit() {
        return remoteHit;
    }

    public void setRemoteHit(BigInteger remoteHit) {
        this.remoteHit = remoteHit;
    }

    public Date getCollectionStartTime() {
        return collectionStartTime;
    }

    public void setCollectionStartTime(Date collectionStartTime) {
        this.collectionStartTime = collectionStartTime;
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
