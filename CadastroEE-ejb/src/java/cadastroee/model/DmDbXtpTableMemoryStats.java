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
@Table(name = "dm_db_xtp_table_memory_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbXtpTableMemoryStats.findAll", query = "SELECT d FROM DmDbXtpTableMemoryStats d"),
    @NamedQuery(name = "DmDbXtpTableMemoryStats.findByObjectId", query = "SELECT d FROM DmDbXtpTableMemoryStats d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDbXtpTableMemoryStats.findByMemoryAllocatedForTableKb", query = "SELECT d FROM DmDbXtpTableMemoryStats d WHERE d.memoryAllocatedForTableKb = :memoryAllocatedForTableKb"),
    @NamedQuery(name = "DmDbXtpTableMemoryStats.findByMemoryUsedByTableKb", query = "SELECT d FROM DmDbXtpTableMemoryStats d WHERE d.memoryUsedByTableKb = :memoryUsedByTableKb"),
    @NamedQuery(name = "DmDbXtpTableMemoryStats.findByMemoryAllocatedForIndexesKb", query = "SELECT d FROM DmDbXtpTableMemoryStats d WHERE d.memoryAllocatedForIndexesKb = :memoryAllocatedForIndexesKb"),
    @NamedQuery(name = "DmDbXtpTableMemoryStats.findByMemoryUsedByIndexesKb", query = "SELECT d FROM DmDbXtpTableMemoryStats d WHERE d.memoryUsedByIndexesKb = :memoryUsedByIndexesKb")})
public class DmDbXtpTableMemoryStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "object_id")
    private Integer objectId;
    @Column(name = "memory_allocated_for_table_kb")
    private BigInteger memoryAllocatedForTableKb;
    @Column(name = "memory_used_by_table_kb")
    private BigInteger memoryUsedByTableKb;
    @Column(name = "memory_allocated_for_indexes_kb")
    private BigInteger memoryAllocatedForIndexesKb;
    @Column(name = "memory_used_by_indexes_kb")
    private BigInteger memoryUsedByIndexesKb;

    public DmDbXtpTableMemoryStats() {
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public BigInteger getMemoryAllocatedForTableKb() {
        return memoryAllocatedForTableKb;
    }

    public void setMemoryAllocatedForTableKb(BigInteger memoryAllocatedForTableKb) {
        this.memoryAllocatedForTableKb = memoryAllocatedForTableKb;
    }

    public BigInteger getMemoryUsedByTableKb() {
        return memoryUsedByTableKb;
    }

    public void setMemoryUsedByTableKb(BigInteger memoryUsedByTableKb) {
        this.memoryUsedByTableKb = memoryUsedByTableKb;
    }

    public BigInteger getMemoryAllocatedForIndexesKb() {
        return memoryAllocatedForIndexesKb;
    }

    public void setMemoryAllocatedForIndexesKb(BigInteger memoryAllocatedForIndexesKb) {
        this.memoryAllocatedForIndexesKb = memoryAllocatedForIndexesKb;
    }

    public BigInteger getMemoryUsedByIndexesKb() {
        return memoryUsedByIndexesKb;
    }

    public void setMemoryUsedByIndexesKb(BigInteger memoryUsedByIndexesKb) {
        this.memoryUsedByIndexesKb = memoryUsedByIndexesKb;
    }
    
}
