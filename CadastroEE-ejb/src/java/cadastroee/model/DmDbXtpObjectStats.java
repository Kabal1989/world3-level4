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
@Table(name = "dm_db_xtp_object_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbXtpObjectStats.findAll", query = "SELECT d FROM DmDbXtpObjectStats d"),
    @NamedQuery(name = "DmDbXtpObjectStats.findByObjectId", query = "SELECT d FROM DmDbXtpObjectStats d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDbXtpObjectStats.findByXtpObjectId", query = "SELECT d FROM DmDbXtpObjectStats d WHERE d.xtpObjectId = :xtpObjectId"),
    @NamedQuery(name = "DmDbXtpObjectStats.findByRowInsertAttempts", query = "SELECT d FROM DmDbXtpObjectStats d WHERE d.rowInsertAttempts = :rowInsertAttempts"),
    @NamedQuery(name = "DmDbXtpObjectStats.findByRowUpdateAttempts", query = "SELECT d FROM DmDbXtpObjectStats d WHERE d.rowUpdateAttempts = :rowUpdateAttempts"),
    @NamedQuery(name = "DmDbXtpObjectStats.findByRowDeleteAttempts", query = "SELECT d FROM DmDbXtpObjectStats d WHERE d.rowDeleteAttempts = :rowDeleteAttempts"),
    @NamedQuery(name = "DmDbXtpObjectStats.findByWriteConflicts", query = "SELECT d FROM DmDbXtpObjectStats d WHERE d.writeConflicts = :writeConflicts"),
    @NamedQuery(name = "DmDbXtpObjectStats.findByUniqueConstraintViolations", query = "SELECT d FROM DmDbXtpObjectStats d WHERE d.uniqueConstraintViolations = :uniqueConstraintViolations")})
public class DmDbXtpObjectStats implements Serializable {

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
    @Column(name = "row_insert_attempts")
    private long rowInsertAttempts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "row_update_attempts")
    private long rowUpdateAttempts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "row_delete_attempts")
    private long rowDeleteAttempts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "write_conflicts")
    private long writeConflicts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "unique_constraint_violations")
    private long uniqueConstraintViolations;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "object_address")
    private byte[] objectAddress;

    public DmDbXtpObjectStats() {
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

    public long getRowInsertAttempts() {
        return rowInsertAttempts;
    }

    public void setRowInsertAttempts(long rowInsertAttempts) {
        this.rowInsertAttempts = rowInsertAttempts;
    }

    public long getRowUpdateAttempts() {
        return rowUpdateAttempts;
    }

    public void setRowUpdateAttempts(long rowUpdateAttempts) {
        this.rowUpdateAttempts = rowUpdateAttempts;
    }

    public long getRowDeleteAttempts() {
        return rowDeleteAttempts;
    }

    public void setRowDeleteAttempts(long rowDeleteAttempts) {
        this.rowDeleteAttempts = rowDeleteAttempts;
    }

    public long getWriteConflicts() {
        return writeConflicts;
    }

    public void setWriteConflicts(long writeConflicts) {
        this.writeConflicts = writeConflicts;
    }

    public long getUniqueConstraintViolations() {
        return uniqueConstraintViolations;
    }

    public void setUniqueConstraintViolations(long uniqueConstraintViolations) {
        this.uniqueConstraintViolations = uniqueConstraintViolations;
    }

    public byte[] getObjectAddress() {
        return objectAddress;
    }

    public void setObjectAddress(byte[] objectAddress) {
        this.objectAddress = objectAddress;
    }
    
}
