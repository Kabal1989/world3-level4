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
@Table(name = "dm_os_memory_pools")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsMemoryPools.findAll", query = "SELECT d FROM DmOsMemoryPools d"),
    @NamedQuery(name = "DmOsMemoryPools.findByPoolId", query = "SELECT d FROM DmOsMemoryPools d WHERE d.poolId = :poolId"),
    @NamedQuery(name = "DmOsMemoryPools.findByType", query = "SELECT d FROM DmOsMemoryPools d WHERE d.type = :type"),
    @NamedQuery(name = "DmOsMemoryPools.findByName", query = "SELECT d FROM DmOsMemoryPools d WHERE d.name = :name"),
    @NamedQuery(name = "DmOsMemoryPools.findByMaxFreeEntriesCount", query = "SELECT d FROM DmOsMemoryPools d WHERE d.maxFreeEntriesCount = :maxFreeEntriesCount"),
    @NamedQuery(name = "DmOsMemoryPools.findByFreeEntriesCount", query = "SELECT d FROM DmOsMemoryPools d WHERE d.freeEntriesCount = :freeEntriesCount"),
    @NamedQuery(name = "DmOsMemoryPools.findByRemovedInAllRoundsCount", query = "SELECT d FROM DmOsMemoryPools d WHERE d.removedInAllRoundsCount = :removedInAllRoundsCount")})
public class DmOsMemoryPools implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_pool_address")
    private byte[] memoryPoolAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pool_id")
    private int poolId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_free_entries_count")
    private long maxFreeEntriesCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "free_entries_count")
    private long freeEntriesCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "removed_in_all_rounds_count")
    private long removedInAllRoundsCount;

    public DmOsMemoryPools() {
    }

    public byte[] getMemoryPoolAddress() {
        return memoryPoolAddress;
    }

    public void setMemoryPoolAddress(byte[] memoryPoolAddress) {
        this.memoryPoolAddress = memoryPoolAddress;
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMaxFreeEntriesCount() {
        return maxFreeEntriesCount;
    }

    public void setMaxFreeEntriesCount(long maxFreeEntriesCount) {
        this.maxFreeEntriesCount = maxFreeEntriesCount;
    }

    public long getFreeEntriesCount() {
        return freeEntriesCount;
    }

    public void setFreeEntriesCount(long freeEntriesCount) {
        this.freeEntriesCount = freeEntriesCount;
    }

    public long getRemovedInAllRoundsCount() {
        return removedInAllRoundsCount;
    }

    public void setRemovedInAllRoundsCount(long removedInAllRoundsCount) {
        this.removedInAllRoundsCount = removedInAllRoundsCount;
    }
    
}
