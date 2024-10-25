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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "sysremotelogins")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysremotelogins.findAll", query = "SELECT s FROM Sysremotelogins s"),
    @NamedQuery(name = "Sysremotelogins.findByRemoteserverid", query = "SELECT s FROM Sysremotelogins s WHERE s.remoteserverid = :remoteserverid"),
    @NamedQuery(name = "Sysremotelogins.findByRemoteusername", query = "SELECT s FROM Sysremotelogins s WHERE s.remoteusername = :remoteusername"),
    @NamedQuery(name = "Sysremotelogins.findByStatus", query = "SELECT s FROM Sysremotelogins s WHERE s.status = :status"),
    @NamedQuery(name = "Sysremotelogins.findByChangedate", query = "SELECT s FROM Sysremotelogins s WHERE s.changedate = :changedate")})
public class Sysremotelogins implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "remoteserverid")
    private Short remoteserverid;
    @Size(max = 128)
    @Column(name = "remoteusername")
    private String remoteusername;
    @Column(name = "status")
    private Short status;
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "changedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date changedate;

    public Sysremotelogins() {
    }

    public Short getRemoteserverid() {
        return remoteserverid;
    }

    public void setRemoteserverid(Short remoteserverid) {
        this.remoteserverid = remoteserverid;
    }

    public String getRemoteusername() {
        return remoteusername;
    }

    public void setRemoteusername(String remoteusername) {
        this.remoteusername = remoteusername;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public Date getChangedate() {
        return changedate;
    }

    public void setChangedate(Date changedate) {
        this.changedate = changedate;
    }
    
}
