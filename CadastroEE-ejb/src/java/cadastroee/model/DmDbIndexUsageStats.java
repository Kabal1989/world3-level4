/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_db_index_usage_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbIndexUsageStats.findAll", query = "SELECT d FROM DmDbIndexUsageStats d"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByDatabaseId", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByObjectId", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByIndexId", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.indexId = :indexId"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByUserSeeks", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.userSeeks = :userSeeks"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByUserScans", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.userScans = :userScans"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByUserLookups", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.userLookups = :userLookups"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByUserUpdates", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.userUpdates = :userUpdates"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByLastUserSeek", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.lastUserSeek = :lastUserSeek"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByLastUserScan", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.lastUserScan = :lastUserScan"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByLastUserLookup", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.lastUserLookup = :lastUserLookup"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByLastUserUpdate", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.lastUserUpdate = :lastUserUpdate"),
    @NamedQuery(name = "DmDbIndexUsageStats.findBySystemSeeks", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.systemSeeks = :systemSeeks"),
    @NamedQuery(name = "DmDbIndexUsageStats.findBySystemScans", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.systemScans = :systemScans"),
    @NamedQuery(name = "DmDbIndexUsageStats.findBySystemLookups", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.systemLookups = :systemLookups"),
    @NamedQuery(name = "DmDbIndexUsageStats.findBySystemUpdates", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.systemUpdates = :systemUpdates"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByLastSystemSeek", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.lastSystemSeek = :lastSystemSeek"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByLastSystemScan", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.lastSystemScan = :lastSystemScan"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByLastSystemLookup", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.lastSystemLookup = :lastSystemLookup"),
    @NamedQuery(name = "DmDbIndexUsageStats.findByLastSystemUpdate", query = "SELECT d FROM DmDbIndexUsageStats d WHERE d.lastSystemUpdate = :lastSystemUpdate")})
public class DmDbIndexUsageStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private short databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_id")
    private int indexId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_seeks")
    private long userSeeks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_scans")
    private long userScans;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_lookups")
    private long userLookups;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_updates")
    private long userUpdates;
    @Column(name = "last_user_seek")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUserSeek;
    @Column(name = "last_user_scan")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUserScan;
    @Column(name = "last_user_lookup")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUserLookup;
    @Column(name = "last_user_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUserUpdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_seeks")
    private long systemSeeks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_scans")
    private long systemScans;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_lookups")
    private long systemLookups;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_updates")
    private long systemUpdates;
    @Column(name = "last_system_seek")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSystemSeek;
    @Column(name = "last_system_scan")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSystemScan;
    @Column(name = "last_system_lookup")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSystemLookup;
    @Column(name = "last_system_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSystemUpdate;

    public DmDbIndexUsageStats() {
    }

    public short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(short databaseId) {
        this.databaseId = databaseId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public long getUserSeeks() {
        return userSeeks;
    }

    public void setUserSeeks(long userSeeks) {
        this.userSeeks = userSeeks;
    }

    public long getUserScans() {
        return userScans;
    }

    public void setUserScans(long userScans) {
        this.userScans = userScans;
    }

    public long getUserLookups() {
        return userLookups;
    }

    public void setUserLookups(long userLookups) {
        this.userLookups = userLookups;
    }

    public long getUserUpdates() {
        return userUpdates;
    }

    public void setUserUpdates(long userUpdates) {
        this.userUpdates = userUpdates;
    }

    public Date getLastUserSeek() {
        return lastUserSeek;
    }

    public void setLastUserSeek(Date lastUserSeek) {
        this.lastUserSeek = lastUserSeek;
    }

    public Date getLastUserScan() {
        return lastUserScan;
    }

    public void setLastUserScan(Date lastUserScan) {
        this.lastUserScan = lastUserScan;
    }

    public Date getLastUserLookup() {
        return lastUserLookup;
    }

    public void setLastUserLookup(Date lastUserLookup) {
        this.lastUserLookup = lastUserLookup;
    }

    public Date getLastUserUpdate() {
        return lastUserUpdate;
    }

    public void setLastUserUpdate(Date lastUserUpdate) {
        this.lastUserUpdate = lastUserUpdate;
    }

    public long getSystemSeeks() {
        return systemSeeks;
    }

    public void setSystemSeeks(long systemSeeks) {
        this.systemSeeks = systemSeeks;
    }

    public long getSystemScans() {
        return systemScans;
    }

    public void setSystemScans(long systemScans) {
        this.systemScans = systemScans;
    }

    public long getSystemLookups() {
        return systemLookups;
    }

    public void setSystemLookups(long systemLookups) {
        this.systemLookups = systemLookups;
    }

    public long getSystemUpdates() {
        return systemUpdates;
    }

    public void setSystemUpdates(long systemUpdates) {
        this.systemUpdates = systemUpdates;
    }

    public Date getLastSystemSeek() {
        return lastSystemSeek;
    }

    public void setLastSystemSeek(Date lastSystemSeek) {
        this.lastSystemSeek = lastSystemSeek;
    }

    public Date getLastSystemScan() {
        return lastSystemScan;
    }

    public void setLastSystemScan(Date lastSystemScan) {
        this.lastSystemScan = lastSystemScan;
    }

    public Date getLastSystemLookup() {
        return lastSystemLookup;
    }

    public void setLastSystemLookup(Date lastSystemLookup) {
        this.lastSystemLookup = lastSystemLookup;
    }

    public Date getLastSystemUpdate() {
        return lastSystemUpdate;
    }

    public void setLastSystemUpdate(Date lastSystemUpdate) {
        this.lastSystemUpdate = lastSystemUpdate;
    }
    
}
