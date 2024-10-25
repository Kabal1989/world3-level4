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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_clr_appdomains")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmClrAppdomains.findAll", query = "SELECT d FROM DmClrAppdomains d"),
    @NamedQuery(name = "DmClrAppdomains.findByAppdomainId", query = "SELECT d FROM DmClrAppdomains d WHERE d.appdomainId = :appdomainId"),
    @NamedQuery(name = "DmClrAppdomains.findByAppdomainName", query = "SELECT d FROM DmClrAppdomains d WHERE d.appdomainName = :appdomainName"),
    @NamedQuery(name = "DmClrAppdomains.findByCreationTime", query = "SELECT d FROM DmClrAppdomains d WHERE d.creationTime = :creationTime"),
    @NamedQuery(name = "DmClrAppdomains.findByDbId", query = "SELECT d FROM DmClrAppdomains d WHERE d.dbId = :dbId"),
    @NamedQuery(name = "DmClrAppdomains.findByUserId", query = "SELECT d FROM DmClrAppdomains d WHERE d.userId = :userId"),
    @NamedQuery(name = "DmClrAppdomains.findByState", query = "SELECT d FROM DmClrAppdomains d WHERE d.state = :state"),
    @NamedQuery(name = "DmClrAppdomains.findByStrongRefcount", query = "SELECT d FROM DmClrAppdomains d WHERE d.strongRefcount = :strongRefcount"),
    @NamedQuery(name = "DmClrAppdomains.findByWeakRefcount", query = "SELECT d FROM DmClrAppdomains d WHERE d.weakRefcount = :weakRefcount"),
    @NamedQuery(name = "DmClrAppdomains.findByCost", query = "SELECT d FROM DmClrAppdomains d WHERE d.cost = :cost"),
    @NamedQuery(name = "DmClrAppdomains.findByValue", query = "SELECT d FROM DmClrAppdomains d WHERE d.value = :value"),
    @NamedQuery(name = "DmClrAppdomains.findByCompatibilityLevel", query = "SELECT d FROM DmClrAppdomains d WHERE d.compatibilityLevel = :compatibilityLevel"),
    @NamedQuery(name = "DmClrAppdomains.findByTotalProcessorTimeMs", query = "SELECT d FROM DmClrAppdomains d WHERE d.totalProcessorTimeMs = :totalProcessorTimeMs"),
    @NamedQuery(name = "DmClrAppdomains.findByTotalAllocatedMemoryKb", query = "SELECT d FROM DmClrAppdomains d WHERE d.totalAllocatedMemoryKb = :totalAllocatedMemoryKb"),
    @NamedQuery(name = "DmClrAppdomains.findBySurvivedMemoryKb", query = "SELECT d FROM DmClrAppdomains d WHERE d.survivedMemoryKb = :survivedMemoryKb")})
public class DmClrAppdomains implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "appdomain_address")
    private byte[] appdomainAddress;
    @Column(name = "appdomain_id")
    private Integer appdomainId;
    @Size(max = 386)
    @Column(name = "appdomain_name")
    private String appdomainName;
    @Column(name = "creation_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationTime;
    @Column(name = "db_id")
    private Integer dbId;
    @Column(name = "user_id")
    private Integer userId;
    @Size(max = 128)
    @Column(name = "state")
    private String state;
    @Column(name = "strong_refcount")
    private Integer strongRefcount;
    @Column(name = "weak_refcount")
    private Integer weakRefcount;
    @Column(name = "cost")
    private Integer cost;
    @Column(name = "value")
    private Integer value;
    @Column(name = "compatibility_level")
    private Integer compatibilityLevel;
    @Column(name = "total_processor_time_ms")
    private BigInteger totalProcessorTimeMs;
    @Column(name = "total_allocated_memory_kb")
    private BigInteger totalAllocatedMemoryKb;
    @Column(name = "survived_memory_kb")
    private BigInteger survivedMemoryKb;

    public DmClrAppdomains() {
    }

    public byte[] getAppdomainAddress() {
        return appdomainAddress;
    }

    public void setAppdomainAddress(byte[] appdomainAddress) {
        this.appdomainAddress = appdomainAddress;
    }

    public Integer getAppdomainId() {
        return appdomainId;
    }

    public void setAppdomainId(Integer appdomainId) {
        this.appdomainId = appdomainId;
    }

    public String getAppdomainName() {
        return appdomainName;
    }

    public void setAppdomainName(String appdomainName) {
        this.appdomainName = appdomainName;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getDbId() {
        return dbId;
    }

    public void setDbId(Integer dbId) {
        this.dbId = dbId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getStrongRefcount() {
        return strongRefcount;
    }

    public void setStrongRefcount(Integer strongRefcount) {
        this.strongRefcount = strongRefcount;
    }

    public Integer getWeakRefcount() {
        return weakRefcount;
    }

    public void setWeakRefcount(Integer weakRefcount) {
        this.weakRefcount = weakRefcount;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getCompatibilityLevel() {
        return compatibilityLevel;
    }

    public void setCompatibilityLevel(Integer compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
    }

    public BigInteger getTotalProcessorTimeMs() {
        return totalProcessorTimeMs;
    }

    public void setTotalProcessorTimeMs(BigInteger totalProcessorTimeMs) {
        this.totalProcessorTimeMs = totalProcessorTimeMs;
    }

    public BigInteger getTotalAllocatedMemoryKb() {
        return totalAllocatedMemoryKb;
    }

    public void setTotalAllocatedMemoryKb(BigInteger totalAllocatedMemoryKb) {
        this.totalAllocatedMemoryKb = totalAllocatedMemoryKb;
    }

    public BigInteger getSurvivedMemoryKb() {
        return survivedMemoryKb;
    }

    public void setSurvivedMemoryKb(BigInteger survivedMemoryKb) {
        this.survivedMemoryKb = survivedMemoryKb;
    }
    
}
