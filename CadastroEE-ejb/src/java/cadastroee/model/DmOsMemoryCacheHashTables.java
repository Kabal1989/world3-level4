/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "dm_os_memory_cache_hash_tables")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsMemoryCacheHashTables.findAll", query = "SELECT d FROM DmOsMemoryCacheHashTables d"),
    @NamedQuery(name = "DmOsMemoryCacheHashTables.findByName", query = "SELECT d FROM DmOsMemoryCacheHashTables d WHERE d.name = :name"),
    @NamedQuery(name = "DmOsMemoryCacheHashTables.findByType", query = "SELECT d FROM DmOsMemoryCacheHashTables d WHERE d.type = :type"),
    @NamedQuery(name = "DmOsMemoryCacheHashTables.findByTableLevel", query = "SELECT d FROM DmOsMemoryCacheHashTables d WHERE d.tableLevel = :tableLevel"),
    @NamedQuery(name = "DmOsMemoryCacheHashTables.findByBucketsCount", query = "SELECT d FROM DmOsMemoryCacheHashTables d WHERE d.bucketsCount = :bucketsCount"),
    @NamedQuery(name = "DmOsMemoryCacheHashTables.findByBucketsInUseCount", query = "SELECT d FROM DmOsMemoryCacheHashTables d WHERE d.bucketsInUseCount = :bucketsInUseCount"),
    @NamedQuery(name = "DmOsMemoryCacheHashTables.findByBucketsMinLength", query = "SELECT d FROM DmOsMemoryCacheHashTables d WHERE d.bucketsMinLength = :bucketsMinLength"),
    @NamedQuery(name = "DmOsMemoryCacheHashTables.findByBucketsMaxLength", query = "SELECT d FROM DmOsMemoryCacheHashTables d WHERE d.bucketsMaxLength = :bucketsMaxLength"),
    @NamedQuery(name = "DmOsMemoryCacheHashTables.findByBucketsAvgLength", query = "SELECT d FROM DmOsMemoryCacheHashTables d WHERE d.bucketsAvgLength = :bucketsAvgLength"),
    @NamedQuery(name = "DmOsMemoryCacheHashTables.findByBucketsMaxLengthEver", query = "SELECT d FROM DmOsMemoryCacheHashTables d WHERE d.bucketsMaxLengthEver = :bucketsMaxLengthEver"),
    @NamedQuery(name = "DmOsMemoryCacheHashTables.findByHitsCount", query = "SELECT d FROM DmOsMemoryCacheHashTables d WHERE d.hitsCount = :hitsCount"),
    @NamedQuery(name = "DmOsMemoryCacheHashTables.findByMissesCount", query = "SELECT d FROM DmOsMemoryCacheHashTables d WHERE d.missesCount = :missesCount"),
    @NamedQuery(name = "DmOsMemoryCacheHashTables.findByBucketsAvgScanHitLength", query = "SELECT d FROM DmOsMemoryCacheHashTables d WHERE d.bucketsAvgScanHitLength = :bucketsAvgScanHitLength"),
    @NamedQuery(name = "DmOsMemoryCacheHashTables.findByBucketsAvgScanMissLength", query = "SELECT d FROM DmOsMemoryCacheHashTables d WHERE d.bucketsAvgScanMissLength = :bucketsAvgScanMissLength")})
public class DmOsMemoryCacheHashTables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "cache_address")
    private byte[] cacheAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "table_level")
    private int tableLevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buckets_count")
    private int bucketsCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buckets_in_use_count")
    private int bucketsInUseCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buckets_min_length")
    private int bucketsMinLength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buckets_max_length")
    private int bucketsMaxLength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buckets_avg_length")
    private int bucketsAvgLength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buckets_max_length_ever")
    private int bucketsMaxLengthEver;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hits_count")
    private long hitsCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "misses_count")
    private long missesCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buckets_avg_scan_hit_length")
    private int bucketsAvgScanHitLength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buckets_avg_scan_miss_length")
    private int bucketsAvgScanMissLength;

    public DmOsMemoryCacheHashTables() {
    }

    public byte[] getCacheAddress() {
        return cacheAddress;
    }

    public void setCacheAddress(byte[] cacheAddress) {
        this.cacheAddress = cacheAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTableLevel() {
        return tableLevel;
    }

    public void setTableLevel(int tableLevel) {
        this.tableLevel = tableLevel;
    }

    public int getBucketsCount() {
        return bucketsCount;
    }

    public void setBucketsCount(int bucketsCount) {
        this.bucketsCount = bucketsCount;
    }

    public int getBucketsInUseCount() {
        return bucketsInUseCount;
    }

    public void setBucketsInUseCount(int bucketsInUseCount) {
        this.bucketsInUseCount = bucketsInUseCount;
    }

    public int getBucketsMinLength() {
        return bucketsMinLength;
    }

    public void setBucketsMinLength(int bucketsMinLength) {
        this.bucketsMinLength = bucketsMinLength;
    }

    public int getBucketsMaxLength() {
        return bucketsMaxLength;
    }

    public void setBucketsMaxLength(int bucketsMaxLength) {
        this.bucketsMaxLength = bucketsMaxLength;
    }

    public int getBucketsAvgLength() {
        return bucketsAvgLength;
    }

    public void setBucketsAvgLength(int bucketsAvgLength) {
        this.bucketsAvgLength = bucketsAvgLength;
    }

    public int getBucketsMaxLengthEver() {
        return bucketsMaxLengthEver;
    }

    public void setBucketsMaxLengthEver(int bucketsMaxLengthEver) {
        this.bucketsMaxLengthEver = bucketsMaxLengthEver;
    }

    public long getHitsCount() {
        return hitsCount;
    }

    public void setHitsCount(long hitsCount) {
        this.hitsCount = hitsCount;
    }

    public long getMissesCount() {
        return missesCount;
    }

    public void setMissesCount(long missesCount) {
        this.missesCount = missesCount;
    }

    public int getBucketsAvgScanHitLength() {
        return bucketsAvgScanHitLength;
    }

    public void setBucketsAvgScanHitLength(int bucketsAvgScanHitLength) {
        this.bucketsAvgScanHitLength = bucketsAvgScanHitLength;
    }

    public int getBucketsAvgScanMissLength() {
        return bucketsAvgScanMissLength;
    }

    public void setBucketsAvgScanMissLength(int bucketsAvgScanMissLength) {
        this.bucketsAvgScanMissLength = bucketsAvgScanMissLength;
    }
    
}
