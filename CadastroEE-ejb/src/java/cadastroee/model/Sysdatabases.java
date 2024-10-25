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
@Table(name = "sysdatabases")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysdatabases.findAll", query = "SELECT s FROM Sysdatabases s"),
    @NamedQuery(name = "Sysdatabases.findByName", query = "SELECT s FROM Sysdatabases s WHERE s.name = :name"),
    @NamedQuery(name = "Sysdatabases.findByDbid", query = "SELECT s FROM Sysdatabases s WHERE s.dbid = :dbid"),
    @NamedQuery(name = "Sysdatabases.findByMode", query = "SELECT s FROM Sysdatabases s WHERE s.mode = :mode"),
    @NamedQuery(name = "Sysdatabases.findByStatus", query = "SELECT s FROM Sysdatabases s WHERE s.status = :status"),
    @NamedQuery(name = "Sysdatabases.findByStatus2", query = "SELECT s FROM Sysdatabases s WHERE s.status2 = :status2"),
    @NamedQuery(name = "Sysdatabases.findByCrdate", query = "SELECT s FROM Sysdatabases s WHERE s.crdate = :crdate"),
    @NamedQuery(name = "Sysdatabases.findByReserved", query = "SELECT s FROM Sysdatabases s WHERE s.reserved = :reserved"),
    @NamedQuery(name = "Sysdatabases.findByCategory", query = "SELECT s FROM Sysdatabases s WHERE s.category = :category"),
    @NamedQuery(name = "Sysdatabases.findByCmptlevel", query = "SELECT s FROM Sysdatabases s WHERE s.cmptlevel = :cmptlevel"),
    @NamedQuery(name = "Sysdatabases.findByFilename", query = "SELECT s FROM Sysdatabases s WHERE s.filename = :filename"),
    @NamedQuery(name = "Sysdatabases.findByVersion", query = "SELECT s FROM Sysdatabases s WHERE s.version = :version")})
public class Sysdatabases implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "dbid")
    private Short dbid;
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Column(name = "mode")
    private Short mode;
    @Column(name = "status")
    private Integer status;
    @Column(name = "status2")
    private Integer status2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "crdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdate;
    @Column(name = "reserved")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reserved;
    @Column(name = "category")
    private Integer category;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cmptlevel")
    private short cmptlevel;
    @Size(max = 260)
    @Column(name = "filename")
    private String filename;
    @Column(name = "version")
    private Short version;

    public Sysdatabases() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getDbid() {
        return dbid;
    }

    public void setDbid(Short dbid) {
        this.dbid = dbid;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public Short getMode() {
        return mode;
    }

    public void setMode(Short mode) {
        this.mode = mode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus2() {
        return status2;
    }

    public void setStatus2(Integer status2) {
        this.status2 = status2;
    }

    public Date getCrdate() {
        return crdate;
    }

    public void setCrdate(Date crdate) {
        this.crdate = crdate;
    }

    public Date getReserved() {
        return reserved;
    }

    public void setReserved(Date reserved) {
        this.reserved = reserved;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public short getCmptlevel() {
        return cmptlevel;
    }

    public void setCmptlevel(short cmptlevel) {
        this.cmptlevel = cmptlevel;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }
    
}
