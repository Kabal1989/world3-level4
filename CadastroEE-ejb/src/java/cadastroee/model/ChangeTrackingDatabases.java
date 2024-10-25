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
@Table(name = "change_tracking_databases")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChangeTrackingDatabases.findAll", query = "SELECT c FROM ChangeTrackingDatabases c"),
    @NamedQuery(name = "ChangeTrackingDatabases.findByDatabaseId", query = "SELECT c FROM ChangeTrackingDatabases c WHERE c.databaseId = :databaseId"),
    @NamedQuery(name = "ChangeTrackingDatabases.findByIsAutoCleanupOn", query = "SELECT c FROM ChangeTrackingDatabases c WHERE c.isAutoCleanupOn = :isAutoCleanupOn"),
    @NamedQuery(name = "ChangeTrackingDatabases.findByRetentionPeriod", query = "SELECT c FROM ChangeTrackingDatabases c WHERE c.retentionPeriod = :retentionPeriod"),
    @NamedQuery(name = "ChangeTrackingDatabases.findByRetentionPeriodUnits", query = "SELECT c FROM ChangeTrackingDatabases c WHERE c.retentionPeriodUnits = :retentionPeriodUnits"),
    @NamedQuery(name = "ChangeTrackingDatabases.findByRetentionPeriodUnitsDesc", query = "SELECT c FROM ChangeTrackingDatabases c WHERE c.retentionPeriodUnitsDesc = :retentionPeriodUnitsDesc"),
    @NamedQuery(name = "ChangeTrackingDatabases.findByMaxCleanupVersion", query = "SELECT c FROM ChangeTrackingDatabases c WHERE c.maxCleanupVersion = :maxCleanupVersion")})
public class ChangeTrackingDatabases implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Column(name = "is_auto_cleanup_on")
    private Short isAutoCleanupOn;
    @Column(name = "retention_period")
    private Integer retentionPeriod;
    @Column(name = "retention_period_units")
    private Short retentionPeriodUnits;
    @Size(max = 60)
    @Column(name = "retention_period_units_desc")
    private String retentionPeriodUnitsDesc;
    @Column(name = "max_cleanup_version")
    private BigInteger maxCleanupVersion;

    public ChangeTrackingDatabases() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public Short getIsAutoCleanupOn() {
        return isAutoCleanupOn;
    }

    public void setIsAutoCleanupOn(Short isAutoCleanupOn) {
        this.isAutoCleanupOn = isAutoCleanupOn;
    }

    public Integer getRetentionPeriod() {
        return retentionPeriod;
    }

    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    public Short getRetentionPeriodUnits() {
        return retentionPeriodUnits;
    }

    public void setRetentionPeriodUnits(Short retentionPeriodUnits) {
        this.retentionPeriodUnits = retentionPeriodUnits;
    }

    public String getRetentionPeriodUnitsDesc() {
        return retentionPeriodUnitsDesc;
    }

    public void setRetentionPeriodUnitsDesc(String retentionPeriodUnitsDesc) {
        this.retentionPeriodUnitsDesc = retentionPeriodUnitsDesc;
    }

    public BigInteger getMaxCleanupVersion() {
        return maxCleanupVersion;
    }

    public void setMaxCleanupVersion(BigInteger maxCleanupVersion) {
        this.maxCleanupVersion = maxCleanupVersion;
    }
    
}
