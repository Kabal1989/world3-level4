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
@Table(name = "sysoledbusers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysoledbusers.findAll", query = "SELECT s FROM Sysoledbusers s"),
    @NamedQuery(name = "Sysoledbusers.findByRmtsrvid", query = "SELECT s FROM Sysoledbusers s WHERE s.rmtsrvid = :rmtsrvid"),
    @NamedQuery(name = "Sysoledbusers.findByRmtloginame", query = "SELECT s FROM Sysoledbusers s WHERE s.rmtloginame = :rmtloginame"),
    @NamedQuery(name = "Sysoledbusers.findByRmtpassword", query = "SELECT s FROM Sysoledbusers s WHERE s.rmtpassword = :rmtpassword"),
    @NamedQuery(name = "Sysoledbusers.findByStatus", query = "SELECT s FROM Sysoledbusers s WHERE s.status = :status"),
    @NamedQuery(name = "Sysoledbusers.findByChangedate", query = "SELECT s FROM Sysoledbusers s WHERE s.changedate = :changedate")})
public class Sysoledbusers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "rmtsrvid")
    private Short rmtsrvid;
    @Size(max = 128)
    @Column(name = "rmtloginame")
    private String rmtloginame;
    @Size(max = 128)
    @Column(name = "rmtpassword")
    private String rmtpassword;
    @Lob
    @Column(name = "loginsid")
    private byte[] loginsid;
    @Column(name = "status")
    private Short status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "changedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date changedate;

    public Sysoledbusers() {
    }

    public Short getRmtsrvid() {
        return rmtsrvid;
    }

    public void setRmtsrvid(Short rmtsrvid) {
        this.rmtsrvid = rmtsrvid;
    }

    public String getRmtloginame() {
        return rmtloginame;
    }

    public void setRmtloginame(String rmtloginame) {
        this.rmtloginame = rmtloginame;
    }

    public String getRmtpassword() {
        return rmtpassword;
    }

    public void setRmtpassword(String rmtpassword) {
        this.rmtpassword = rmtpassword;
    }

    public byte[] getLoginsid() {
        return loginsid;
    }

    public void setLoginsid(byte[] loginsid) {
        this.loginsid = loginsid;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getChangedate() {
        return changedate;
    }

    public void setChangedate(Date changedate) {
        this.changedate = changedate;
    }
    
}
