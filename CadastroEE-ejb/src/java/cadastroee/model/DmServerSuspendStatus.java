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
@Table(name = "dm_server_suspend_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmServerSuspendStatus.findAll", query = "SELECT d FROM DmServerSuspendStatus d"),
    @NamedQuery(name = "DmServerSuspendStatus.findByDbId", query = "SELECT d FROM DmServerSuspendStatus d WHERE d.dbId = :dbId"),
    @NamedQuery(name = "DmServerSuspendStatus.findByDbName", query = "SELECT d FROM DmServerSuspendStatus d WHERE d.dbName = :dbName"),
    @NamedQuery(name = "DmServerSuspendStatus.findBySuspendSessionId", query = "SELECT d FROM DmServerSuspendStatus d WHERE d.suspendSessionId = :suspendSessionId"),
    @NamedQuery(name = "DmServerSuspendStatus.findBySuspendTimeMs", query = "SELECT d FROM DmServerSuspendStatus d WHERE d.suspendTimeMs = :suspendTimeMs"),
    @NamedQuery(name = "DmServerSuspendStatus.findByIsDiffMapCleared", query = "SELECT d FROM DmServerSuspendStatus d WHERE d.isDiffMapCleared = :isDiffMapCleared"),
    @NamedQuery(name = "DmServerSuspendStatus.findByIsWriteIoFrozen", query = "SELECT d FROM DmServerSuspendStatus d WHERE d.isWriteIoFrozen = :isWriteIoFrozen")})
public class DmServerSuspendStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "db_id")
    private short dbId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "db_name")
    private String dbName;
    @Column(name = "suspend_session_id")
    private Short suspendSessionId;
    @Column(name = "suspend_time_ms")
    private BigInteger suspendTimeMs;
    @Column(name = "is_diff_map_cleared")
    private Boolean isDiffMapCleared;
    @Column(name = "is_write_io_frozen")
    private Boolean isWriteIoFrozen;

    public DmServerSuspendStatus() {
    }

    public short getDbId() {
        return dbId;
    }

    public void setDbId(short dbId) {
        this.dbId = dbId;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public Short getSuspendSessionId() {
        return suspendSessionId;
    }

    public void setSuspendSessionId(Short suspendSessionId) {
        this.suspendSessionId = suspendSessionId;
    }

    public BigInteger getSuspendTimeMs() {
        return suspendTimeMs;
    }

    public void setSuspendTimeMs(BigInteger suspendTimeMs) {
        this.suspendTimeMs = suspendTimeMs;
    }

    public Boolean getIsDiffMapCleared() {
        return isDiffMapCleared;
    }

    public void setIsDiffMapCleared(Boolean isDiffMapCleared) {
        this.isDiffMapCleared = isDiffMapCleared;
    }

    public Boolean getIsWriteIoFrozen() {
        return isWriteIoFrozen;
    }

    public void setIsWriteIoFrozen(Boolean isWriteIoFrozen) {
        this.isWriteIoFrozen = isWriteIoFrozen;
    }
    
}
