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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_logpool_hashentries")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmLogpoolHashentries.findAll", query = "SELECT d FROM DmLogpoolHashentries d"),
    @NamedQuery(name = "DmLogpoolHashentries.findByBucketNo", query = "SELECT d FROM DmLogpoolHashentries d WHERE d.bucketNo = :bucketNo"),
    @NamedQuery(name = "DmLogpoolHashentries.findByDatabaseId", query = "SELECT d FROM DmLogpoolHashentries d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmLogpoolHashentries.findByRecoveryUnitId", query = "SELECT d FROM DmLogpoolHashentries d WHERE d.recoveryUnitId = :recoveryUnitId"),
    @NamedQuery(name = "DmLogpoolHashentries.findByLogBlockId", query = "SELECT d FROM DmLogpoolHashentries d WHERE d.logBlockId = :logBlockId")})
public class DmLogpoolHashentries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bucket_no")
    private int bucketNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recovery_unit_id")
    private int recoveryUnitId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "log_block_id")
    private long logBlockId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "cache_buffer")
    private byte[] cacheBuffer;

    public DmLogpoolHashentries() {
    }

    public int getBucketNo() {
        return bucketNo;
    }

    public void setBucketNo(int bucketNo) {
        this.bucketNo = bucketNo;
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public int getRecoveryUnitId() {
        return recoveryUnitId;
    }

    public void setRecoveryUnitId(int recoveryUnitId) {
        this.recoveryUnitId = recoveryUnitId;
    }

    public long getLogBlockId() {
        return logBlockId;
    }

    public void setLogBlockId(long logBlockId) {
        this.logBlockId = logBlockId;
    }

    public byte[] getCacheBuffer() {
        return cacheBuffer;
    }

    public void setCacheBuffer(byte[] cacheBuffer) {
        this.cacheBuffer = cacheBuffer;
    }
    
}
