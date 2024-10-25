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
@Table(name = "dm_os_memory_cache_counters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsMemoryCacheCounters.findAll", query = "SELECT d FROM DmOsMemoryCacheCounters d"),
    @NamedQuery(name = "DmOsMemoryCacheCounters.findByName", query = "SELECT d FROM DmOsMemoryCacheCounters d WHERE d.name = :name"),
    @NamedQuery(name = "DmOsMemoryCacheCounters.findByType", query = "SELECT d FROM DmOsMemoryCacheCounters d WHERE d.type = :type"),
    @NamedQuery(name = "DmOsMemoryCacheCounters.findByPagesKb", query = "SELECT d FROM DmOsMemoryCacheCounters d WHERE d.pagesKb = :pagesKb"),
    @NamedQuery(name = "DmOsMemoryCacheCounters.findByPagesInUseKb", query = "SELECT d FROM DmOsMemoryCacheCounters d WHERE d.pagesInUseKb = :pagesInUseKb"),
    @NamedQuery(name = "DmOsMemoryCacheCounters.findByEntriesCount", query = "SELECT d FROM DmOsMemoryCacheCounters d WHERE d.entriesCount = :entriesCount"),
    @NamedQuery(name = "DmOsMemoryCacheCounters.findByEntriesInUseCount", query = "SELECT d FROM DmOsMemoryCacheCounters d WHERE d.entriesInUseCount = :entriesInUseCount")})
public class DmOsMemoryCacheCounters implements Serializable {

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
    @Column(name = "pages_kb")
    private long pagesKb;
    @Column(name = "pages_in_use_kb")
    private BigInteger pagesInUseKb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "entries_count")
    private long entriesCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "entries_in_use_count")
    private long entriesInUseCount;

    public DmOsMemoryCacheCounters() {
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

    public long getPagesKb() {
        return pagesKb;
    }

    public void setPagesKb(long pagesKb) {
        this.pagesKb = pagesKb;
    }

    public BigInteger getPagesInUseKb() {
        return pagesInUseKb;
    }

    public void setPagesInUseKb(BigInteger pagesInUseKb) {
        this.pagesInUseKb = pagesInUseKb;
    }

    public long getEntriesCount() {
        return entriesCount;
    }

    public void setEntriesCount(long entriesCount) {
        this.entriesCount = entriesCount;
    }

    public long getEntriesInUseCount() {
        return entriesInUseCount;
    }

    public void setEntriesInUseCount(long entriesInUseCount) {
        this.entriesInUseCount = entriesInUseCount;
    }
    
}
