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
@Table(name = "dm_fts_memory_pools")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmFtsMemoryPools.findAll", query = "SELECT d FROM DmFtsMemoryPools d"),
    @NamedQuery(name = "DmFtsMemoryPools.findByPoolId", query = "SELECT d FROM DmFtsMemoryPools d WHERE d.poolId = :poolId"),
    @NamedQuery(name = "DmFtsMemoryPools.findByBufferSize", query = "SELECT d FROM DmFtsMemoryPools d WHERE d.bufferSize = :bufferSize"),
    @NamedQuery(name = "DmFtsMemoryPools.findByMinBufferLimit", query = "SELECT d FROM DmFtsMemoryPools d WHERE d.minBufferLimit = :minBufferLimit"),
    @NamedQuery(name = "DmFtsMemoryPools.findByMaxBufferLimit", query = "SELECT d FROM DmFtsMemoryPools d WHERE d.maxBufferLimit = :maxBufferLimit"),
    @NamedQuery(name = "DmFtsMemoryPools.findByBufferCount", query = "SELECT d FROM DmFtsMemoryPools d WHERE d.bufferCount = :bufferCount")})
public class DmFtsMemoryPools implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pool_id")
    private int poolId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buffer_size")
    private int bufferSize;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_buffer_limit")
    private int minBufferLimit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_buffer_limit")
    private int maxBufferLimit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buffer_count")
    private int bufferCount;

    public DmFtsMemoryPools() {
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public int getBufferSize() {
        return bufferSize;
    }

    public void setBufferSize(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    public int getMinBufferLimit() {
        return minBufferLimit;
    }

    public void setMinBufferLimit(int minBufferLimit) {
        this.minBufferLimit = minBufferLimit;
    }

    public int getMaxBufferLimit() {
        return maxBufferLimit;
    }

    public void setMaxBufferLimit(int maxBufferLimit) {
        this.maxBufferLimit = maxBufferLimit;
    }

    public int getBufferCount() {
        return bufferCount;
    }

    public void setBufferCount(int bufferCount) {
        this.bufferCount = bufferCount;
    }
    
}
