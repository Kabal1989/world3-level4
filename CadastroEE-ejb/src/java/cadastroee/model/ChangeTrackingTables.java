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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "change_tracking_tables")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChangeTrackingTables.findAll", query = "SELECT c FROM ChangeTrackingTables c"),
    @NamedQuery(name = "ChangeTrackingTables.findByObjectId", query = "SELECT c FROM ChangeTrackingTables c WHERE c.objectId = :objectId"),
    @NamedQuery(name = "ChangeTrackingTables.findByIsTrackColumnsUpdatedOn", query = "SELECT c FROM ChangeTrackingTables c WHERE c.isTrackColumnsUpdatedOn = :isTrackColumnsUpdatedOn"),
    @NamedQuery(name = "ChangeTrackingTables.findByMinValidVersion", query = "SELECT c FROM ChangeTrackingTables c WHERE c.minValidVersion = :minValidVersion"),
    @NamedQuery(name = "ChangeTrackingTables.findByBeginVersion", query = "SELECT c FROM ChangeTrackingTables c WHERE c.beginVersion = :beginVersion"),
    @NamedQuery(name = "ChangeTrackingTables.findByCleanupVersion", query = "SELECT c FROM ChangeTrackingTables c WHERE c.cleanupVersion = :cleanupVersion")})
public class ChangeTrackingTables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_track_columns_updated_on")
    private boolean isTrackColumnsUpdatedOn;
    @Column(name = "min_valid_version")
    private BigInteger minValidVersion;
    @Column(name = "begin_version")
    private BigInteger beginVersion;
    @Column(name = "cleanup_version")
    private BigInteger cleanupVersion;

    public ChangeTrackingTables() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public boolean getIsTrackColumnsUpdatedOn() {
        return isTrackColumnsUpdatedOn;
    }

    public void setIsTrackColumnsUpdatedOn(boolean isTrackColumnsUpdatedOn) {
        this.isTrackColumnsUpdatedOn = isTrackColumnsUpdatedOn;
    }

    public BigInteger getMinValidVersion() {
        return minValidVersion;
    }

    public void setMinValidVersion(BigInteger minValidVersion) {
        this.minValidVersion = minValidVersion;
    }

    public BigInteger getBeginVersion() {
        return beginVersion;
    }

    public void setBeginVersion(BigInteger beginVersion) {
        this.beginVersion = beginVersion;
    }

    public BigInteger getCleanupVersion() {
        return cleanupVersion;
    }

    public void setCleanupVersion(BigInteger cleanupVersion) {
        this.cleanupVersion = cleanupVersion;
    }
    
}
