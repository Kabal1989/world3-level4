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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_logpool_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmLogpoolStats.findAll", query = "SELECT d FROM DmLogpoolStats d"),
    @NamedQuery(name = "DmLogpoolStats.findByHashHitTotalSearchLength", query = "SELECT d FROM DmLogpoolStats d WHERE d.hashHitTotalSearchLength = :hashHitTotalSearchLength"),
    @NamedQuery(name = "DmLogpoolStats.findByHashMissTotalSearchLength", query = "SELECT d FROM DmLogpoolStats d WHERE d.hashMissTotalSearchLength = :hashMissTotalSearchLength"),
    @NamedQuery(name = "DmLogpoolStats.findByHashHits", query = "SELECT d FROM DmLogpoolStats d WHERE d.hashHits = :hashHits"),
    @NamedQuery(name = "DmLogpoolStats.findByHashMisses", query = "SELECT d FROM DmLogpoolStats d WHERE d.hashMisses = :hashMisses"),
    @NamedQuery(name = "DmLogpoolStats.findByHashBucketCount", query = "SELECT d FROM DmLogpoolStats d WHERE d.hashBucketCount = :hashBucketCount"),
    @NamedQuery(name = "DmLogpoolStats.findByMemStatusStamp", query = "SELECT d FROM DmLogpoolStats d WHERE d.memStatusStamp = :memStatusStamp"),
    @NamedQuery(name = "DmLogpoolStats.findByMemStatus", query = "SELECT d FROM DmLogpoolStats d WHERE d.memStatus = :memStatus"),
    @NamedQuery(name = "DmLogpoolStats.findByLogpoolmgrCount", query = "SELECT d FROM DmLogpoolStats d WHERE d.logpoolmgrCount = :logpoolmgrCount"),
    @NamedQuery(name = "DmLogpoolStats.findByTotalPages", query = "SELECT d FROM DmLogpoolStats d WHERE d.totalPages = :totalPages"),
    @NamedQuery(name = "DmLogpoolStats.findByPrivatePages", query = "SELECT d FROM DmLogpoolStats d WHERE d.privatePages = :privatePages")})
public class DmLogpoolStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hash_hit_total_search_length")
    private long hashHitTotalSearchLength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hash_miss_total_search_length")
    private long hashMissTotalSearchLength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hash_hits")
    private long hashHits;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hash_misses")
    private long hashMisses;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hash_bucket_count")
    private int hashBucketCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mem_status_stamp")
    private long memStatusStamp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mem_status")
    private int memStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "logpoolmgr_count")
    private int logpoolmgrCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_pages")
    private long totalPages;
    @Basic(optional = false)
    @NotNull
    @Column(name = "private_pages")
    private long privatePages;

    public DmLogpoolStats() {
    }

    public long getHashHitTotalSearchLength() {
        return hashHitTotalSearchLength;
    }

    public void setHashHitTotalSearchLength(long hashHitTotalSearchLength) {
        this.hashHitTotalSearchLength = hashHitTotalSearchLength;
    }

    public long getHashMissTotalSearchLength() {
        return hashMissTotalSearchLength;
    }

    public void setHashMissTotalSearchLength(long hashMissTotalSearchLength) {
        this.hashMissTotalSearchLength = hashMissTotalSearchLength;
    }

    public long getHashHits() {
        return hashHits;
    }

    public void setHashHits(long hashHits) {
        this.hashHits = hashHits;
    }

    public long getHashMisses() {
        return hashMisses;
    }

    public void setHashMisses(long hashMisses) {
        this.hashMisses = hashMisses;
    }

    public int getHashBucketCount() {
        return hashBucketCount;
    }

    public void setHashBucketCount(int hashBucketCount) {
        this.hashBucketCount = hashBucketCount;
    }

    public long getMemStatusStamp() {
        return memStatusStamp;
    }

    public void setMemStatusStamp(long memStatusStamp) {
        this.memStatusStamp = memStatusStamp;
    }

    public int getMemStatus() {
        return memStatus;
    }

    public void setMemStatus(int memStatus) {
        this.memStatus = memStatus;
    }

    public int getLogpoolmgrCount() {
        return logpoolmgrCount;
    }

    public void setLogpoolmgrCount(int logpoolmgrCount) {
        this.logpoolmgrCount = logpoolmgrCount;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public long getPrivatePages() {
        return privatePages;
    }

    public void setPrivatePages(long privatePages) {
        this.privatePages = privatePages;
    }
    
}
