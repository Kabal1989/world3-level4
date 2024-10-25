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
@Table(name = "dm_os_memory_cache_entries")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsMemoryCacheEntries.findAll", query = "SELECT d FROM DmOsMemoryCacheEntries d"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByName", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.name = :name"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByType", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.type = :type"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByInUseCount", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.inUseCount = :inUseCount"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByIsDirty", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.isDirty = :isDirty"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByDiskIosCount", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.diskIosCount = :diskIosCount"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByContextSwitchesCount", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.contextSwitchesCount = :contextSwitchesCount"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByOriginalCost", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.originalCost = :originalCost"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByCurrentCost", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.currentCost = :currentCost"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByPagesKb", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.pagesKb = :pagesKb"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByEntryData", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.entryData = :entryData"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByPoolId", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.poolId = :poolId"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByTimeToGenerate", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.timeToGenerate = :timeToGenerate"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByUseCount", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.useCount = :useCount"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByAverageTimeBetweenUses", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.averageTimeBetweenUses = :averageTimeBetweenUses"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByTimeSinceLastUse", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.timeSinceLastUse = :timeSinceLastUse"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByProbabilityOfReuse", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.probabilityOfReuse = :probabilityOfReuse"),
    @NamedQuery(name = "DmOsMemoryCacheEntries.findByValue", query = "SELECT d FROM DmOsMemoryCacheEntries d WHERE d.value = :value")})
public class DmOsMemoryCacheEntries implements Serializable {

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
    @Lob
    @Column(name = "entry_address")
    private byte[] entryAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "entry_data_address")
    private byte[] entryDataAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "in_use_count")
    private int inUseCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_dirty")
    private boolean isDirty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "disk_ios_count")
    private int diskIosCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "context_switches_count")
    private int contextSwitchesCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "original_cost")
    private int originalCost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "current_cost")
    private int currentCost;
    @Lob
    @Column(name = "memory_object_address")
    private byte[] memoryObjectAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pages_kb")
    private long pagesKb;
    @Size(max = 3072)
    @Column(name = "entry_data")
    private String entryData;
    @Column(name = "pool_id")
    private Integer poolId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "time_to_generate")
    private Double timeToGenerate;
    @Column(name = "use_count")
    private BigInteger useCount;
    @Column(name = "average_time_between_uses")
    private Double averageTimeBetweenUses;
    @Column(name = "time_since_last_use")
    private Double timeSinceLastUse;
    @Column(name = "probability_of_reuse")
    private Double probabilityOfReuse;
    @Column(name = "value")
    private Double value;

    public DmOsMemoryCacheEntries() {
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

    public byte[] getEntryAddress() {
        return entryAddress;
    }

    public void setEntryAddress(byte[] entryAddress) {
        this.entryAddress = entryAddress;
    }

    public byte[] getEntryDataAddress() {
        return entryDataAddress;
    }

    public void setEntryDataAddress(byte[] entryDataAddress) {
        this.entryDataAddress = entryDataAddress;
    }

    public int getInUseCount() {
        return inUseCount;
    }

    public void setInUseCount(int inUseCount) {
        this.inUseCount = inUseCount;
    }

    public boolean getIsDirty() {
        return isDirty;
    }

    public void setIsDirty(boolean isDirty) {
        this.isDirty = isDirty;
    }

    public int getDiskIosCount() {
        return diskIosCount;
    }

    public void setDiskIosCount(int diskIosCount) {
        this.diskIosCount = diskIosCount;
    }

    public int getContextSwitchesCount() {
        return contextSwitchesCount;
    }

    public void setContextSwitchesCount(int contextSwitchesCount) {
        this.contextSwitchesCount = contextSwitchesCount;
    }

    public int getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(int originalCost) {
        this.originalCost = originalCost;
    }

    public int getCurrentCost() {
        return currentCost;
    }

    public void setCurrentCost(int currentCost) {
        this.currentCost = currentCost;
    }

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }

    public long getPagesKb() {
        return pagesKb;
    }

    public void setPagesKb(long pagesKb) {
        this.pagesKb = pagesKb;
    }

    public String getEntryData() {
        return entryData;
    }

    public void setEntryData(String entryData) {
        this.entryData = entryData;
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public Double getTimeToGenerate() {
        return timeToGenerate;
    }

    public void setTimeToGenerate(Double timeToGenerate) {
        this.timeToGenerate = timeToGenerate;
    }

    public BigInteger getUseCount() {
        return useCount;
    }

    public void setUseCount(BigInteger useCount) {
        this.useCount = useCount;
    }

    public Double getAverageTimeBetweenUses() {
        return averageTimeBetweenUses;
    }

    public void setAverageTimeBetweenUses(Double averageTimeBetweenUses) {
        this.averageTimeBetweenUses = averageTimeBetweenUses;
    }

    public Double getTimeSinceLastUse() {
        return timeSinceLastUse;
    }

    public void setTimeSinceLastUse(Double timeSinceLastUse) {
        this.timeSinceLastUse = timeSinceLastUse;
    }

    public Double getProbabilityOfReuse() {
        return probabilityOfReuse;
    }

    public void setProbabilityOfReuse(Double probabilityOfReuse) {
        this.probabilityOfReuse = probabilityOfReuse;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    
}
