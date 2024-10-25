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
import javax.persistence.Lob;
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
@Table(name = "dm_db_missing_index_group_stats_query")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findAll", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findByGroupHandle", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.groupHandle = :groupHandle"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findByLastStatementStartOffset", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.lastStatementStartOffset = :lastStatementStartOffset"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findByLastStatementEndOffset", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.lastStatementEndOffset = :lastStatementEndOffset"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findByUserSeeks", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.userSeeks = :userSeeks"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findByUserScans", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.userScans = :userScans"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findByLastUserSeek", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.lastUserSeek = :lastUserSeek"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findByLastUserScan", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.lastUserScan = :lastUserScan"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findByAvgTotalUserCost", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.avgTotalUserCost = :avgTotalUserCost"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findByAvgUserImpact", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.avgUserImpact = :avgUserImpact"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findBySystemSeeks", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.systemSeeks = :systemSeeks"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findBySystemScans", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.systemScans = :systemScans"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findByLastSystemSeek", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.lastSystemSeek = :lastSystemSeek"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findByLastSystemScan", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.lastSystemScan = :lastSystemScan"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findByAvgTotalSystemCost", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.avgTotalSystemCost = :avgTotalSystemCost"),
    @NamedQuery(name = "DmDbMissingIndexGroupStatsQuery.findByAvgSystemImpact", query = "SELECT d FROM DmDbMissingIndexGroupStatsQuery d WHERE d.avgSystemImpact = :avgSystemImpact")})
public class DmDbMissingIndexGroupStatsQuery implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "group_handle")
    private int groupHandle;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "query_hash")
    private byte[] queryHash;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "query_plan_hash")
    private byte[] queryPlanHash;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "last_sql_handle")
    private byte[] lastSqlHandle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_statement_start_offset")
    private int lastStatementStartOffset;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_statement_end_offset")
    private int lastStatementEndOffset;
    @Lob
    @Column(name = "last_statement_sql_handle")
    private byte[] lastStatementSqlHandle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_seeks")
    private long userSeeks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_scans")
    private long userScans;
    @Column(name = "last_user_seek")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUserSeek;
    @Column(name = "last_user_scan")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUserScan;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "avg_total_user_cost")
    private Double avgTotalUserCost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "avg_user_impact")
    private double avgUserImpact;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_seeks")
    private long systemSeeks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_scans")
    private long systemScans;
    @Column(name = "last_system_seek")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSystemSeek;
    @Column(name = "last_system_scan")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSystemScan;
    @Column(name = "avg_total_system_cost")
    private Double avgTotalSystemCost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "avg_system_impact")
    private double avgSystemImpact;

    public DmDbMissingIndexGroupStatsQuery() {
    }

    public int getGroupHandle() {
        return groupHandle;
    }

    public void setGroupHandle(int groupHandle) {
        this.groupHandle = groupHandle;
    }

    public byte[] getQueryHash() {
        return queryHash;
    }

    public void setQueryHash(byte[] queryHash) {
        this.queryHash = queryHash;
    }

    public byte[] getQueryPlanHash() {
        return queryPlanHash;
    }

    public void setQueryPlanHash(byte[] queryPlanHash) {
        this.queryPlanHash = queryPlanHash;
    }

    public byte[] getLastSqlHandle() {
        return lastSqlHandle;
    }

    public void setLastSqlHandle(byte[] lastSqlHandle) {
        this.lastSqlHandle = lastSqlHandle;
    }

    public int getLastStatementStartOffset() {
        return lastStatementStartOffset;
    }

    public void setLastStatementStartOffset(int lastStatementStartOffset) {
        this.lastStatementStartOffset = lastStatementStartOffset;
    }

    public int getLastStatementEndOffset() {
        return lastStatementEndOffset;
    }

    public void setLastStatementEndOffset(int lastStatementEndOffset) {
        this.lastStatementEndOffset = lastStatementEndOffset;
    }

    public byte[] getLastStatementSqlHandle() {
        return lastStatementSqlHandle;
    }

    public void setLastStatementSqlHandle(byte[] lastStatementSqlHandle) {
        this.lastStatementSqlHandle = lastStatementSqlHandle;
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

    public double getAvgUserImpact() {
        return avgUserImpact;
    }

    public void setAvgUserImpact(double avgUserImpact) {
        this.avgUserImpact = avgUserImpact;
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

    public double getAvgSystemImpact() {
        return avgSystemImpact;
    }

    public void setAvgSystemImpact(double avgSystemImpact) {
        this.avgSystemImpact = avgSystemImpact;
    }
    
}
