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
@Table(name = "dm_db_xtp_checkpoint_internals")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbXtpCheckpointInternals.findAll", query = "SELECT d FROM DmDbXtpCheckpointInternals d"),
    @NamedQuery(name = "DmDbXtpCheckpointInternals.findByCheckpointId", query = "SELECT d FROM DmDbXtpCheckpointInternals d WHERE d.checkpointId = :checkpointId"),
    @NamedQuery(name = "DmDbXtpCheckpointInternals.findByCheckpointTimestamp", query = "SELECT d FROM DmDbXtpCheckpointInternals d WHERE d.checkpointTimestamp = :checkpointTimestamp"),
    @NamedQuery(name = "DmDbXtpCheckpointInternals.findByLastSegmentLsn", query = "SELECT d FROM DmDbXtpCheckpointInternals d WHERE d.lastSegmentLsn = :lastSegmentLsn"),
    @NamedQuery(name = "DmDbXtpCheckpointInternals.findByRecoveryLsn", query = "SELECT d FROM DmDbXtpCheckpointInternals d WHERE d.recoveryLsn = :recoveryLsn"),
    @NamedQuery(name = "DmDbXtpCheckpointInternals.findByIsSynchronized", query = "SELECT d FROM DmDbXtpCheckpointInternals d WHERE d.isSynchronized = :isSynchronized")})
public class DmDbXtpCheckpointInternals implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checkpoint_id")
    private long checkpointId;
    @Column(name = "checkpoint_timestamp")
    private BigInteger checkpointTimestamp;
    @Column(name = "last_segment_lsn")
    private BigInteger lastSegmentLsn;
    @Column(name = "recovery_lsn")
    private BigInteger recoveryLsn;
    @Column(name = "is_synchronized")
    private Boolean isSynchronized;

    public DmDbXtpCheckpointInternals() {
    }

    public long getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(long checkpointId) {
        this.checkpointId = checkpointId;
    }

    public BigInteger getCheckpointTimestamp() {
        return checkpointTimestamp;
    }

    public void setCheckpointTimestamp(BigInteger checkpointTimestamp) {
        this.checkpointTimestamp = checkpointTimestamp;
    }

    public BigInteger getLastSegmentLsn() {
        return lastSegmentLsn;
    }

    public void setLastSegmentLsn(BigInteger lastSegmentLsn) {
        this.lastSegmentLsn = lastSegmentLsn;
    }

    public BigInteger getRecoveryLsn() {
        return recoveryLsn;
    }

    public void setRecoveryLsn(BigInteger recoveryLsn) {
        this.recoveryLsn = recoveryLsn;
    }

    public Boolean getIsSynchronized() {
        return isSynchronized;
    }

    public void setIsSynchronized(Boolean isSynchronized) {
        this.isSynchronized = isSynchronized;
    }
    
}
