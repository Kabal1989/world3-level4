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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_server_audit_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmServerAuditStatus.findAll", query = "SELECT d FROM DmServerAuditStatus d"),
    @NamedQuery(name = "DmServerAuditStatus.findByAuditId", query = "SELECT d FROM DmServerAuditStatus d WHERE d.auditId = :auditId"),
    @NamedQuery(name = "DmServerAuditStatus.findByName", query = "SELECT d FROM DmServerAuditStatus d WHERE d.name = :name"),
    @NamedQuery(name = "DmServerAuditStatus.findByStatus", query = "SELECT d FROM DmServerAuditStatus d WHERE d.status = :status"),
    @NamedQuery(name = "DmServerAuditStatus.findByStatusDesc", query = "SELECT d FROM DmServerAuditStatus d WHERE d.statusDesc = :statusDesc"),
    @NamedQuery(name = "DmServerAuditStatus.findByStatusTime", query = "SELECT d FROM DmServerAuditStatus d WHERE d.statusTime = :statusTime"),
    @NamedQuery(name = "DmServerAuditStatus.findByAuditFilePath", query = "SELECT d FROM DmServerAuditStatus d WHERE d.auditFilePath = :auditFilePath"),
    @NamedQuery(name = "DmServerAuditStatus.findByAuditFileSize", query = "SELECT d FROM DmServerAuditStatus d WHERE d.auditFileSize = :auditFileSize")})
public class DmServerAuditStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "audit_id")
    private int auditId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private short status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "status_desc")
    private String statusDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusTime;
    @Lob
    @Column(name = "event_session_address")
    private byte[] eventSessionAddress;
    @Size(max = 256)
    @Column(name = "audit_file_path")
    private String auditFilePath;
    @Column(name = "audit_file_size")
    private BigInteger auditFileSize;

    public DmServerAuditStatus() {
    }

    public int getAuditId() {
        return auditId;
    }

    public void setAuditId(int auditId) {
        this.auditId = auditId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public Date getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(Date statusTime) {
        this.statusTime = statusTime;
    }

    public byte[] getEventSessionAddress() {
        return eventSessionAddress;
    }

    public void setEventSessionAddress(byte[] eventSessionAddress) {
        this.eventSessionAddress = eventSessionAddress;
    }

    public String getAuditFilePath() {
        return auditFilePath;
    }

    public void setAuditFilePath(String auditFilePath) {
        this.auditFilePath = auditFilePath;
    }

    public BigInteger getAuditFileSize() {
        return auditFileSize;
    }

    public void setAuditFileSize(BigInteger auditFileSize) {
        this.auditFileSize = auditFileSize;
    }
    
}
