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
@Table(name = "dm_db_xtp_index_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbXtpIndexStats.findAll", query = "SELECT d FROM DmDbXtpIndexStats d"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByObjectId", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByXtpObjectId", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.xtpObjectId = :xtpObjectId"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByIndexId", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.indexId = :indexId"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByScansStarted", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.scansStarted = :scansStarted"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByScansRetries", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.scansRetries = :scansRetries"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByRowsReturned", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.rowsReturned = :rowsReturned"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByRowsTouched", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.rowsTouched = :rowsTouched"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByRowsExpiring", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.rowsExpiring = :rowsExpiring"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByRowsExpired", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.rowsExpired = :rowsExpired"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByRowsExpiredRemoved", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.rowsExpiredRemoved = :rowsExpiredRemoved"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByPhantomScansStarted", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.phantomScansStarted = :phantomScansStarted"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByPhantomScansRetries", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.phantomScansRetries = :phantomScansRetries"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByPhantomRowsTouched", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.phantomRowsTouched = :phantomRowsTouched"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByPhantomExpiringRowsEncountered", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.phantomExpiringRowsEncountered = :phantomExpiringRowsEncountered"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByPhantomExpiredRemovedRowsEncountered", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.phantomExpiredRemovedRowsEncountered = :phantomExpiredRemovedRowsEncountered"),
    @NamedQuery(name = "DmDbXtpIndexStats.findByPhantomExpiredRowsRemoved", query = "SELECT d FROM DmDbXtpIndexStats d WHERE d.phantomExpiredRowsRemoved = :phantomExpiredRowsRemoved")})
public class DmDbXtpIndexStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xtp_object_id")
    private int xtpObjectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_id")
    private int indexId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scans_started")
    private long scansStarted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scans_retries")
    private long scansRetries;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_returned")
    private long rowsReturned;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_touched")
    private long rowsTouched;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_expiring")
    private long rowsExpiring;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_expired")
    private long rowsExpired;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rows_expired_removed")
    private long rowsExpiredRemoved;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phantom_scans_started")
    private long phantomScansStarted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phantom_scans_retries")
    private long phantomScansRetries;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phantom_rows_touched")
    private long phantomRowsTouched;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phantom_expiring_rows_encountered")
    private long phantomExpiringRowsEncountered;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phantom_expired_removed_rows_encountered")
    private long phantomExpiredRemovedRowsEncountered;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phantom_expired_rows_removed")
    private long phantomExpiredRowsRemoved;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "object_address")
    private byte[] objectAddress;

    public DmDbXtpIndexStats() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getXtpObjectId() {
        return xtpObjectId;
    }

    public void setXtpObjectId(int xtpObjectId) {
        this.xtpObjectId = xtpObjectId;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public long getScansStarted() {
        return scansStarted;
    }

    public void setScansStarted(long scansStarted) {
        this.scansStarted = scansStarted;
    }

    public long getScansRetries() {
        return scansRetries;
    }

    public void setScansRetries(long scansRetries) {
        this.scansRetries = scansRetries;
    }

    public long getRowsReturned() {
        return rowsReturned;
    }

    public void setRowsReturned(long rowsReturned) {
        this.rowsReturned = rowsReturned;
    }

    public long getRowsTouched() {
        return rowsTouched;
    }

    public void setRowsTouched(long rowsTouched) {
        this.rowsTouched = rowsTouched;
    }

    public long getRowsExpiring() {
        return rowsExpiring;
    }

    public void setRowsExpiring(long rowsExpiring) {
        this.rowsExpiring = rowsExpiring;
    }

    public long getRowsExpired() {
        return rowsExpired;
    }

    public void setRowsExpired(long rowsExpired) {
        this.rowsExpired = rowsExpired;
    }

    public long getRowsExpiredRemoved() {
        return rowsExpiredRemoved;
    }

    public void setRowsExpiredRemoved(long rowsExpiredRemoved) {
        this.rowsExpiredRemoved = rowsExpiredRemoved;
    }

    public long getPhantomScansStarted() {
        return phantomScansStarted;
    }

    public void setPhantomScansStarted(long phantomScansStarted) {
        this.phantomScansStarted = phantomScansStarted;
    }

    public long getPhantomScansRetries() {
        return phantomScansRetries;
    }

    public void setPhantomScansRetries(long phantomScansRetries) {
        this.phantomScansRetries = phantomScansRetries;
    }

    public long getPhantomRowsTouched() {
        return phantomRowsTouched;
    }

    public void setPhantomRowsTouched(long phantomRowsTouched) {
        this.phantomRowsTouched = phantomRowsTouched;
    }

    public long getPhantomExpiringRowsEncountered() {
        return phantomExpiringRowsEncountered;
    }

    public void setPhantomExpiringRowsEncountered(long phantomExpiringRowsEncountered) {
        this.phantomExpiringRowsEncountered = phantomExpiringRowsEncountered;
    }

    public long getPhantomExpiredRemovedRowsEncountered() {
        return phantomExpiredRemovedRowsEncountered;
    }

    public void setPhantomExpiredRemovedRowsEncountered(long phantomExpiredRemovedRowsEncountered) {
        this.phantomExpiredRemovedRowsEncountered = phantomExpiredRemovedRowsEncountered;
    }

    public long getPhantomExpiredRowsRemoved() {
        return phantomExpiredRowsRemoved;
    }

    public void setPhantomExpiredRowsRemoved(long phantomExpiredRowsRemoved) {
        this.phantomExpiredRowsRemoved = phantomExpiredRowsRemoved;
    }

    public byte[] getObjectAddress() {
        return objectAddress;
    }

    public void setObjectAddress(byte[] objectAddress) {
        this.objectAddress = objectAddress;
    }
    
}
