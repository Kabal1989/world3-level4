/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_db_xtp_hash_index_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbXtpHashIndexStats.findAll", query = "SELECT d FROM DmDbXtpHashIndexStats d"),
    @NamedQuery(name = "DmDbXtpHashIndexStats.findByObjectId", query = "SELECT d FROM DmDbXtpHashIndexStats d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDbXtpHashIndexStats.findByXtpObjectId", query = "SELECT d FROM DmDbXtpHashIndexStats d WHERE d.xtpObjectId = :xtpObjectId"),
    @NamedQuery(name = "DmDbXtpHashIndexStats.findByIndexId", query = "SELECT d FROM DmDbXtpHashIndexStats d WHERE d.indexId = :indexId"),
    @NamedQuery(name = "DmDbXtpHashIndexStats.findByTotalBucketCount", query = "SELECT d FROM DmDbXtpHashIndexStats d WHERE d.totalBucketCount = :totalBucketCount"),
    @NamedQuery(name = "DmDbXtpHashIndexStats.findByEmptyBucketCount", query = "SELECT d FROM DmDbXtpHashIndexStats d WHERE d.emptyBucketCount = :emptyBucketCount"),
    @NamedQuery(name = "DmDbXtpHashIndexStats.findByAvgChainLength", query = "SELECT d FROM DmDbXtpHashIndexStats d WHERE d.avgChainLength = :avgChainLength"),
    @NamedQuery(name = "DmDbXtpHashIndexStats.findByMaxChainLength", query = "SELECT d FROM DmDbXtpHashIndexStats d WHERE d.maxChainLength = :maxChainLength")})
public class DmDbXtpHashIndexStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xtp_object_id")
    private int xtpObjectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_id")
    private int indexId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_bucket_count")
    private long totalBucketCount;
    @Column(name = "empty_bucket_count")
    private BigInteger emptyBucketCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "avg_chain_length")
    private long avgChainLength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_chain_length")
    private long maxChainLength;

    public DmDbXtpHashIndexStats() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getXtpObjectId() {
        return xtpObjectId;
    }

    public void setXtpObjectId(int xtpObjectId) {
        this.xtpObjectId = xtpObjectId;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public long getTotalBucketCount() {
        return totalBucketCount;
    }

    public void setTotalBucketCount(long totalBucketCount) {
        this.totalBucketCount = totalBucketCount;
    }

    public BigInteger getEmptyBucketCount() {
        return emptyBucketCount;
    }

    public void setEmptyBucketCount(BigInteger emptyBucketCount) {
        this.emptyBucketCount = emptyBucketCount;
    }

    public long getAvgChainLength() {
        return avgChainLength;
    }

    public void setAvgChainLength(long avgChainLength) {
        this.avgChainLength = avgChainLength;
    }

    public long getMaxChainLength() {
        return maxChainLength;
    }

    public void setMaxChainLength(long maxChainLength) {
        this.maxChainLength = maxChainLength;
    }
    
}
