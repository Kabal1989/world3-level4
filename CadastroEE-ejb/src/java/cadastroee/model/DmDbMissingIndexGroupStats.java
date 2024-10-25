/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "dm_db_missing_index_group_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findAll", query = "SELECT d FROM DmDbMissingIndexGroupStats d"),
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findByGroupHandle", query = "SELECT d FROM DmDbMissingIndexGroupStats d WHERE d.groupHandle = :groupHandle"),
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findByUniqueCompiles", query = "SELECT d FROM DmDbMissingIndexGroupStats d WHERE d.uniqueCompiles = :uniqueCompiles"),
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findByUserSeeks", query = "SELECT d FROM DmDbMissingIndexGroupStats d WHERE d.userSeeks = :userSeeks"),
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findByUserScans", query = "SELECT d FROM DmDbMissingIndexGroupStats d WHERE d.userScans = :userScans"),
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findByLastUserSeek", query = "SELECT d FROM DmDbMissingIndexGroupStats d WHERE d.lastUserSeek = :lastUserSeek"),
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findByLastUserScan", query = "SELECT d FROM DmDbMissingIndexGroupStats d WHERE d.lastUserScan = :lastUserScan"),
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findByAvgTotalUserCost", query = "SELECT d FROM DmDbMissingIndexGroupStats d WHERE d.avgTotalUserCost = :avgTotalUserCost"),
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findByAvgUserImpact", query = "SELECT d FROM DmDbMissingIndexGroupStats d WHERE d.avgUserImpact = :avgUserImpact"),
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findBySystemSeeks", query = "SELECT d FROM DmDbMissingIndexGroupStats d WHERE d.systemSeeks = :systemSeeks"),
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findBySystemScans", query = "SELECT d FROM DmDbMissingIndexGroupStats d WHERE d.systemScans = :systemScans"),
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findByLastSystemSeek", query = "SELECT d FROM DmDbMissingIndexGroupStats d WHERE d.lastSystemSeek = :lastSystemSeek"),
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findByLastSystemScan", query = "SELECT d FROM DmDbMissingIndexGroupStats d WHERE d.lastSystemScan = :lastSystemScan"),
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findByAvgTotalSystemCost", query = "SELECT d FROM DmDbMissingIndexGroupStats d WHERE d.avgTotalSystemCost = :avgTotalSystemCost"),
    @NamedQuery(name = "DmDbMissingIndexGroupStats.findByAvgSystemImpact", query = "SELECT d FROM DmDbMissingIndexGroupStats d WHERE d.avgSystemImpact = :avgSystemImpact")})
public class DmDbMissingIndexGroupStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "group_handle")
    private int groupHandle;
    @Column(name = "unique_compiles")
    private BigInteger uniqueCompiles;
    @Column(name = "user_seeks")
    private BigInteger userSeeks;
    @Column(name = "user_scans")
    private BigInteger userScans;
    @Column(name = "last_user_seek")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUserSeek;
    @Column(name = "last_user_scan")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUserScan;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "avg_total_user_cost")
    private Double avgTotalUserCost;
    @Column(name = "avg_user_impact")
    private Double avgUserImpact;
    @Column(name = "system_seeks")
    private BigInteger systemSeeks;
    @Column(name = "system_scans")
    private BigInteger systemScans;
    @Column(name = "last_system_seek")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSystemSeek;
    @Column(name = "last_system_scan")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSystemScan;
    @Column(name = "avg_total_system_cost")
    private Double avgTotalSystemCost;
    @Column(name = "avg_system_impact")
    private Double avgSystemImpact;

    public DmDbMissingIndexGroupStats() {
    }

    public int getGroupHandle() {
        return groupHandle;
    }

    public void setGroupHandle(int groupHandle) {
        this.groupHandle = groupHandle;
    }

    public BigInteger getUniqueCompiles() {
        return uniqueCompiles;
    }

    public void setUniqueCompiles(BigInteger uniqueCompiles) {
        this.uniqueCompiles = uniqueCompiles;
    }

    public BigInteger getUserSeeks() {
        return userSeeks;
    }

    public void setUserSeeks(BigInteger userSeeks) {
        this.userSeeks = userSeeks;
    }

    public BigInteger getUserScans() {
        return userScans;
    }

    public void setUserScans(BigInteger userScans) {
        this.userScans = userScans;
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

    public Double getAvgTotalUserCost() {
        return avgTotalUserCost;
    }

    public void setAvgTotalUserCost(Double avgTotalUserCost) {
        this.avgTotalUserCost = avgTotalUserCost;
    }

    public Double getAvgUserImpact() {
        return avgUserImpact;
    }

    public void setAvgUserImpact(Double avgUserImpact) {
        this.avgUserImpact = avgUserImpact;
    }

    public BigInteger getSystemSeeks() {
        return systemSeeks;
    }

    public void setSystemSeeks(BigInteger systemSeeks) {
        this.systemSeeks = systemSeeks;
    }

    public BigInteger getSystemScans() {
        return systemScans;
    }

    public void setSystemScans(BigInteger systemScans) {
        this.systemScans = systemScans;
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

    public Double getAvgTotalSystemCost() {
        return avgTotalSystemCost;
    }

    public void setAvgTotalSystemCost(Double avgTotalSystemCost) {
        this.avgTotalSystemCost = avgTotalSystemCost;
    }

    public Double getAvgSystemImpact() {
        return avgSystemImpact;
    }

    public void setAvgSystemImpact(Double avgSystemImpact) {
        this.avgSystemImpact = avgSystemImpact;
    }
    
}
