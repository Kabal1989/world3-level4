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
@Table(name = "sysusers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysusers.findAll", query = "SELECT s FROM Sysusers s"),
    @NamedQuery(name = "Sysusers.findByUid", query = "SELECT s FROM Sysusers s WHERE s.uid = :uid"),
    @NamedQuery(name = "Sysusers.findByStatus", query = "SELECT s FROM Sysusers s WHERE s.status = :status"),
    @NamedQuery(name = "Sysusers.findByName", query = "SELECT s FROM Sysusers s WHERE s.name = :name"),
    @NamedQuery(name = "Sysusers.findByCreatedate", query = "SELECT s FROM Sysusers s WHERE s.createdate = :createdate"),
    @NamedQuery(name = "Sysusers.findByUpdatedate", query = "SELECT s FROM Sysusers s WHERE s.updatedate = :updatedate"),
    @NamedQuery(name = "Sysusers.findByAltuid", query = "SELECT s FROM Sysusers s WHERE s.altuid = :altuid"),
    @NamedQuery(name = "Sysusers.findByGid", query = "SELECT s FROM Sysusers s WHERE s.gid = :gid"),
    @NamedQuery(name = "Sysusers.findByEnviron", query = "SELECT s FROM Sysusers s WHERE s.environ = :environ"),
    @NamedQuery(name = "Sysusers.findByHasdbaccess", query = "SELECT s FROM Sysusers s WHERE s.hasdbaccess = :hasdbaccess"),
    @NamedQuery(name = "Sysusers.findByIslogin", query = "SELECT s FROM Sysusers s WHERE s.islogin = :islogin"),
    @NamedQuery(name = "Sysusers.findByIsntname", query = "SELECT s FROM Sysusers s WHERE s.isntname = :isntname"),
    @NamedQuery(name = "Sysusers.findByIsntgroup", query = "SELECT s FROM Sysusers s WHERE s.isntgroup = :isntgroup"),
    @NamedQuery(name = "Sysusers.findByIsntuser", query = "SELECT s FROM Sysusers s WHERE s.isntuser = :isntuser"),
    @NamedQuery(name = "Sysusers.findByIssqluser", query = "SELECT s FROM Sysusers s WHERE s.issqluser = :issqluser"),
    @NamedQuery(name = "Sysusers.findByIsaliased", query = "SELECT s FROM Sysusers s WHERE s.isaliased = :isaliased"),
    @NamedQuery(name = "Sysusers.findByIssqlrole", query = "SELECT s FROM Sysusers s WHERE s.issqlrole = :issqlrole"),
    @NamedQuery(name = "Sysusers.findByIsapprole", query = "SELECT s FROM Sysusers s WHERE s.isapprole = :isapprole")})
public class Sysusers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "uid")
    private Short uid;
    @Column(name = "status")
    private Short status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Lob
    @Column(name = "roles")
    private byte[] roles;
    @Basic(optional = false)
    @NotNull
    @Column(name = "createdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "updatedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedate;
    @Column(name = "altuid")
    private Short altuid;
    @Lob
    @Column(name = "password")
    private byte[] password;
    @Column(name = "gid")
    private Short gid;
    @Size(max = 255)
    @Column(name = "environ")
    private String environ;
    @Column(name = "hasdbaccess")
    private Integer hasdbaccess;
    @Column(name = "islogin")
    private Integer islogin;
    @Column(name = "isntname")
    private Integer isntname;
    @Column(name = "isntgroup")
    private Integer isntgroup;
    @Column(name = "isntuser")
    private Integer isntuser;
    @Column(name = "issqluser")
    private Integer issqluser;
    @Column(name = "isaliased")
    private Integer isaliased;
    @Column(name = "issqlrole")
    private Integer issqlrole;
    @Column(name = "isapprole")
    private Integer isapprole;

    public Sysusers() {
    }

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public byte[] getRoles() {
        return roles;
    }

    public void setRoles(byte[] roles) {
        this.roles = roles;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Short getAltuid() {
        return altuid;
    }

    public void setAltuid(Short altuid) {
        this.altuid = altuid;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public Short getGid() {
        return gid;
    }

    public void setGid(Short gid) {
        this.gid = gid;
    }

    public String getEnviron() {
        return environ;
    }

    public void setEnviron(String environ) {
        this.environ = environ;
    }

    public Integer getHasdbaccess() {
        return hasdbaccess;
    }

    public void setHasdbaccess(Integer hasdbaccess) {
        this.hasdbaccess = hasdbaccess;
    }

    public Integer getIslogin() {
        return islogin;
    }

    public void setIslogin(Integer islogin) {
        this.islogin = islogin;
    }

    public Integer getIsntname() {
        return isntname;
    }

    public void setIsntname(Integer isntname) {
        this.isntname = isntname;
    }

    public Integer getIsntgroup() {
        return isntgroup;
    }

    public void setIsntgroup(Integer isntgroup) {
        this.isntgroup = isntgroup;
    }

    public Integer getIsntuser() {
        return isntuser;
    }

    public void setIsntuser(Integer isntuser) {
        this.isntuser = isntuser;
    }

    public Integer getIssqluser() {
        return issqluser;
    }

    public void setIssqluser(Integer issqluser) {
        this.issqluser = issqluser;
    }

    public Integer getIsaliased() {
        return isaliased;
    }

    public void setIsaliased(Integer isaliased) {
        this.isaliased = isaliased;
    }

    public Integer getIssqlrole() {
        return issqlrole;
    }

    public void setIssqlrole(Integer issqlrole) {
        this.issqlrole = issqlrole;
    }

    public Integer getIsapprole() {
        return isapprole;
    }

    public void setIsapprole(Integer isapprole) {
        this.isapprole = isapprole;
    }
    
}
