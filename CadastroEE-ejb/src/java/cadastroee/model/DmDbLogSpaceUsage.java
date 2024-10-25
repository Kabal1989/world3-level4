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
@Table(name = "dm_db_log_space_usage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbLogSpaceUsage.findAll", query = "SELECT d FROM DmDbLogSpaceUsage d"),
    @NamedQuery(name = "DmDbLogSpaceUsage.findByDatabaseId", query = "SELECT d FROM DmDbLogSpaceUsage d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmDbLogSpaceUsage.findByTotalLogSizeInBytes", query = "SELECT d FROM DmDbLogSpaceUsage d WHERE d.totalLogSizeInBytes = :totalLogSizeInBytes"),
    @NamedQuery(name = "DmDbLogSpaceUsage.findByUsedLogSpaceInBytes", query = "SELECT d FROM DmDbLogSpaceUsage d WHERE d.usedLogSpaceInBytes = :usedLogSpaceInBytes"),
    @NamedQuery(name = "DmDbLogSpaceUsage.findByUsedLogSpaceInPercent", query = "SELECT d FROM DmDbLogSpaceUsage d WHERE d.usedLogSpaceInPercent = :usedLogSpaceInPercent"),
    @NamedQuery(name = "DmDbLogSpaceUsage.findByLogSpaceInBytesSinceLastBackup", query = "SELECT d FROM DmDbLogSpaceUsage d WHERE d.logSpaceInBytesSinceLastBackup = :logSpaceInBytesSinceLastBackup")})
public class DmDbLogSpaceUsage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "database_id")
    private Integer databaseId;
    @Column(name = "total_log_size_in_bytes")
    private BigInteger totalLogSizeInBytes;
    @Column(name = "used_log_space_in_bytes")
    private BigInteger usedLogSpaceInBytes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "used_log_space_in_percent")
    private Float usedLogSpaceInPercent;
    @Column(name = "log_space_in_bytes_since_last_backup")
    private BigInteger logSpaceInBytesSinceLastBackup;

    public DmDbLogSpaceUsage() {
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public BigInteger getTotalLogSizeInBytes() {
        return totalLogSizeInBytes;
    }

    public void setTotalLogSizeInBytes(BigInteger totalLogSizeInBytes) {
        this.totalLogSizeInBytes = totalLogSizeInBytes;
    }

    public BigInteger getUsedLogSpaceInBytes() {
        return usedLogSpaceInBytes;
    }

    public void setUsedLogSpaceInBytes(BigInteger usedLogSpaceInBytes) {
        this.usedLogSpaceInBytes = usedLogSpaceInBytes;
    }

    public Float getUsedLogSpaceInPercent() {
        return usedLogSpaceInPercent;
    }

    public void setUsedLogSpaceInPercent(Float usedLogSpaceInPercent) {
        this.usedLogSpaceInPercent = usedLogSpaceInPercent;
    }

    public BigInteger getLogSpaceInBytesSinceLastBackup() {
        return logSpaceInBytesSinceLastBackup;
    }

    public void setLogSpaceInBytesSinceLastBackup(BigInteger logSpaceInBytesSinceLastBackup) {
        this.logSpaceInBytesSinceLastBackup = logSpaceInBytesSinceLastBackup;
    }
    
}
