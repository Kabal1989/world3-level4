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
@Table(name = "syslogins")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syslogins.findAll", query = "SELECT s FROM Syslogins s"),
    @NamedQuery(name = "Syslogins.findByStatus", query = "SELECT s FROM Syslogins s WHERE s.status = :status"),
    @NamedQuery(name = "Syslogins.findByCreatedate", query = "SELECT s FROM Syslogins s WHERE s.createdate = :createdate"),
    @NamedQuery(name = "Syslogins.findByUpdatedate", query = "SELECT s FROM Syslogins s WHERE s.updatedate = :updatedate"),
    @NamedQuery(name = "Syslogins.findByAccdate", query = "SELECT s FROM Syslogins s WHERE s.accdate = :accdate"),
    @NamedQuery(name = "Syslogins.findByTotcpu", query = "SELECT s FROM Syslogins s WHERE s.totcpu = :totcpu"),
    @NamedQuery(name = "Syslogins.findByTotio", query = "SELECT s FROM Syslogins s WHERE s.totio = :totio"),
    @NamedQuery(name = "Syslogins.findBySpacelimit", query = "SELECT s FROM Syslogins s WHERE s.spacelimit = :spacelimit"),
    @NamedQuery(name = "Syslogins.findByTimelimit", query = "SELECT s FROM Syslogins s WHERE s.timelimit = :timelimit"),
    @NamedQuery(name = "Syslogins.findByResultlimit", query = "SELECT s FROM Syslogins s WHERE s.resultlimit = :resultlimit"),
    @NamedQuery(name = "Syslogins.findByName", query = "SELECT s FROM Syslogins s WHERE s.name = :name"),
    @NamedQuery(name = "Syslogins.findByDbname", query = "SELECT s FROM Syslogins s WHERE s.dbname = :dbname"),
    @NamedQuery(name = "Syslogins.findByPassword", query = "SELECT s FROM Syslogins s WHERE s.password = :password"),
    @NamedQuery(name = "Syslogins.findByLanguage", query = "SELECT s FROM Syslogins s WHERE s.language = :language"),
    @NamedQuery(name = "Syslogins.findByDenylogin", query = "SELECT s FROM Syslogins s WHERE s.denylogin = :denylogin"),
    @NamedQuery(name = "Syslogins.findByHasaccess", query = "SELECT s FROM Syslogins s WHERE s.hasaccess = :hasaccess"),
    @NamedQuery(name = "Syslogins.findByIsntname", query = "SELECT s FROM Syslogins s WHERE s.isntname = :isntname"),
    @NamedQuery(name = "Syslogins.findByIsntgroup", query = "SELECT s FROM Syslogins s WHERE s.isntgroup = :isntgroup"),
    @NamedQuery(name = "Syslogins.findByIsntuser", query = "SELECT s FROM Syslogins s WHERE s.isntuser = :isntuser"),
    @NamedQuery(name = "Syslogins.findBySysadmin", query = "SELECT s FROM Syslogins s WHERE s.sysadmin = :sysadmin"),
    @NamedQuery(name = "Syslogins.findBySecurityadmin", query = "SELECT s FROM Syslogins s WHERE s.securityadmin = :securityadmin"),
    @NamedQuery(name = "Syslogins.findByServeradmin", query = "SELECT s FROM Syslogins s WHERE s.serveradmin = :serveradmin"),
    @NamedQuery(name = "Syslogins.findBySetupadmin", query = "SELECT s FROM Syslogins s WHERE s.setupadmin = :setupadmin"),
    @NamedQuery(name = "Syslogins.findByProcessadmin", query = "SELECT s FROM Syslogins s WHERE s.processadmin = :processadmin"),
    @NamedQuery(name = "Syslogins.findByDiskadmin", query = "SELECT s FROM Syslogins s WHERE s.diskadmin = :diskadmin"),
    @NamedQuery(name = "Syslogins.findByDbcreator", query = "SELECT s FROM Syslogins s WHERE s.dbcreator = :dbcreator"),
    @NamedQuery(name = "Syslogins.findByBulkadmin", query = "SELECT s FROM Syslogins s WHERE s.bulkadmin = :bulkadmin"),
    @NamedQuery(name = "Syslogins.findByMSServerStateReader", query = "SELECT s FROM Syslogins s WHERE s.mSServerStateReader = :mSServerStateReader"),
    @NamedQuery(name = "Syslogins.findByMSServerStateManager", query = "SELECT s FROM Syslogins s WHERE s.mSServerStateManager = :mSServerStateManager"),
    @NamedQuery(name = "Syslogins.findByMSDefinitionReader", query = "SELECT s FROM Syslogins s WHERE s.mSDefinitionReader = :mSDefinitionReader"),
    @NamedQuery(name = "Syslogins.findByMSDatabaseConnector", query = "SELECT s FROM Syslogins s WHERE s.mSDatabaseConnector = :mSDatabaseConnector"),
    @NamedQuery(name = "Syslogins.findByMSDatabaseManager", query = "SELECT s FROM Syslogins s WHERE s.mSDatabaseManager = :mSDatabaseManager"),
    @NamedQuery(name = "Syslogins.findByMSLoginManager", query = "SELECT s FROM Syslogins s WHERE s.mSLoginManager = :mSLoginManager"),
    @NamedQuery(name = "Syslogins.findByMSSecurityDefinitionReader", query = "SELECT s FROM Syslogins s WHERE s.mSSecurityDefinitionReader = :mSSecurityDefinitionReader"),
    @NamedQuery(name = "Syslogins.findByMSPermissionDefinitionReader", query = "SELECT s FROM Syslogins s WHERE s.mSPermissionDefinitionReader = :mSPermissionDefinitionReader"),
    @NamedQuery(name = "Syslogins.findByMSServerSecurityStateReader", query = "SELECT s FROM Syslogins s WHERE s.mSServerSecurityStateReader = :mSServerSecurityStateReader"),
    @NamedQuery(name = "Syslogins.findByMSServerPermissionStateReader", query = "SELECT s FROM Syslogins s WHERE s.mSServerPermissionStateReader = :mSServerPermissionStateReader"),
    @NamedQuery(name = "Syslogins.findByLoginname", query = "SELECT s FROM Syslogins s WHERE s.loginname = :loginname")})
public class Syslogins implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Column(name = "status")
    private Short status;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "accdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accdate;
    @Column(name = "totcpu")
    private Integer totcpu;
    @Column(name = "totio")
    private Integer totio;
    @Column(name = "spacelimit")
    private Integer spacelimit;
    @Column(name = "timelimit")
    private Integer timelimit;
    @Column(name = "resultlimit")
    private Integer resultlimit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 128)
    @Column(name = "dbname")
    private String dbname;
    @Size(max = 128)
    @Column(name = "password")
    private String password;
    @Size(max = 128)
    @Column(name = "language")
    private String language;
    @Column(name = "denylogin")
    private Integer denylogin;
    @Column(name = "hasaccess")
    private Integer hasaccess;
    @Column(name = "isntname")
    private Integer isntname;
    @Column(name = "isntgroup")
    private Integer isntgroup;
    @Column(name = "isntuser")
    private Integer isntuser;
    @Column(name = "sysadmin")
    private Integer sysadmin;
    @Column(name = "securityadmin")
    private Integer securityadmin;
    @Column(name = "serveradmin")
    private Integer serveradmin;
    @Column(name = "setupadmin")
    private Integer setupadmin;
    @Column(name = "processadmin")
    private Integer processadmin;
    @Column(name = "diskadmin")
    private Integer diskadmin;
    @Column(name = "dbcreator")
    private Integer dbcreator;
    @Column(name = "bulkadmin")
    private Integer bulkadmin;
    @Column(name = "##MS_ServerStateReader##")
    private Integer mSServerStateReader;
    @Column(name = "##MS_ServerStateManager##")
    private Integer mSServerStateManager;
    @Column(name = "##MS_DefinitionReader##")
    private Integer mSDefinitionReader;
    @Column(name = "##MS_DatabaseConnector##")
    private Integer mSDatabaseConnector;
    @Column(name = "##MS_DatabaseManager##")
    private Integer mSDatabaseManager;
    @Column(name = "##MS_LoginManager##")
    private Integer mSLoginManager;
    @Column(name = "##MS_SecurityDefinitionReader##")
    private Integer mSSecurityDefinitionReader;
    @Column(name = "##MS_PermissionDefinitionReader##")
    private Integer mSPermissionDefinitionReader;
    @Column(name = "##MS_ServerSecurityStateReader##")
    private Integer mSServerSecurityStateReader;
    @Column(name = "##MS_ServerPermissionStateReader##")
    private Integer mSServerPermissionStateReader;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "loginname")
    private String loginname;

    public Syslogins() {
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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

    public Date getAccdate() {
        return accdate;
    }

    public void setAccdate(Date accdate) {
        this.accdate = accdate;
    }

    public Integer getTotcpu() {
        return totcpu;
    }

    public void setTotcpu(Integer totcpu) {
        this.totcpu = totcpu;
    }

    public Integer getTotio() {
        return totio;
    }

    public void setTotio(Integer totio) {
        this.totio = totio;
    }

    public Integer getSpacelimit() {
        return spacelimit;
    }

    public void setSpacelimit(Integer spacelimit) {
        this.spacelimit = spacelimit;
    }

    public Integer getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Integer timelimit) {
        this.timelimit = timelimit;
    }

    public Integer getResultlimit() {
        return resultlimit;
    }

    public void setResultlimit(Integer resultlimit) {
        this.resultlimit = resultlimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getDenylogin() {
        return denylogin;
    }

    public void setDenylogin(Integer denylogin) {
        this.denylogin = denylogin;
    }

    public Integer getHasaccess() {
        return hasaccess;
    }

    public void setHasaccess(Integer hasaccess) {
        this.hasaccess = hasaccess;
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

    public Integer getSysadmin() {
        return sysadmin;
    }

    public void setSysadmin(Integer sysadmin) {
        this.sysadmin = sysadmin;
    }

    public Integer getSecurityadmin() {
        return securityadmin;
    }

    public void setSecurityadmin(Integer securityadmin) {
        this.securityadmin = securityadmin;
    }

    public Integer getServeradmin() {
        return serveradmin;
    }

    public void setServeradmin(Integer serveradmin) {
        this.serveradmin = serveradmin;
    }

    public Integer getSetupadmin() {
        return setupadmin;
    }

    public void setSetupadmin(Integer setupadmin) {
        this.setupadmin = setupadmin;
    }

    public Integer getProcessadmin() {
        return processadmin;
    }

    public void setProcessadmin(Integer processadmin) {
        this.processadmin = processadmin;
    }

    public Integer getDiskadmin() {
        return diskadmin;
    }

    public void setDiskadmin(Integer diskadmin) {
        this.diskadmin = diskadmin;
    }

    public Integer getDbcreator() {
        return dbcreator;
    }

    public void setDbcreator(Integer dbcreator) {
        this.dbcreator = dbcreator;
    }

    public Integer getBulkadmin() {
        return bulkadmin;
    }

    public void setBulkadmin(Integer bulkadmin) {
        this.bulkadmin = bulkadmin;
    }

    public Integer getMSServerStateReader() {
        return mSServerStateReader;
    }

    public void setMSServerStateReader(Integer mSServerStateReader) {
        this.mSServerStateReader = mSServerStateReader;
    }

    public Integer getMSServerStateManager() {
        return mSServerStateManager;
    }

    public void setMSServerStateManager(Integer mSServerStateManager) {
        this.mSServerStateManager = mSServerStateManager;
    }

    public Integer getMSDefinitionReader() {
        return mSDefinitionReader;
    }

    public void setMSDefinitionReader(Integer mSDefinitionReader) {
        this.mSDefinitionReader = mSDefinitionReader;
    }

    public Integer getMSDatabaseConnector() {
        return mSDatabaseConnector;
    }

    public void setMSDatabaseConnector(Integer mSDatabaseConnector) {
        this.mSDatabaseConnector = mSDatabaseConnector;
    }

    public Integer getMSDatabaseManager() {
        return mSDatabaseManager;
    }

    public void setMSDatabaseManager(Integer mSDatabaseManager) {
        this.mSDatabaseManager = mSDatabaseManager;
    }

    public Integer getMSLoginManager() {
        return mSLoginManager;
    }

    public void setMSLoginManager(Integer mSLoginManager) {
        this.mSLoginManager = mSLoginManager;
    }

    public Integer getMSSecurityDefinitionReader() {
        return mSSecurityDefinitionReader;
    }

    public void setMSSecurityDefinitionReader(Integer mSSecurityDefinitionReader) {
        this.mSSecurityDefinitionReader = mSSecurityDefinitionReader;
    }

    public Integer getMSPermissionDefinitionReader() {
        return mSPermissionDefinitionReader;
    }

    public void setMSPermissionDefinitionReader(Integer mSPermissionDefinitionReader) {
        this.mSPermissionDefinitionReader = mSPermissionDefinitionReader;
    }

    public Integer getMSServerSecurityStateReader() {
        return mSServerSecurityStateReader;
    }

    public void setMSServerSecurityStateReader(Integer mSServerSecurityStateReader) {
        this.mSServerSecurityStateReader = mSServerSecurityStateReader;
    }

    public Integer getMSServerPermissionStateReader() {
        return mSServerPermissionStateReader;
    }

    public void setMSServerPermissionStateReader(Integer mSServerPermissionStateReader) {
        this.mSServerPermissionStateReader = mSServerPermissionStateReader;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }
    
}
