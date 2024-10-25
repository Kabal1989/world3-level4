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
@Table(name = "sysobjects")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysobjects.findAll", query = "SELECT s FROM Sysobjects s"),
    @NamedQuery(name = "Sysobjects.findByName", query = "SELECT s FROM Sysobjects s WHERE s.name = :name"),
    @NamedQuery(name = "Sysobjects.findById", query = "SELECT s FROM Sysobjects s WHERE s.id = :id"),
    @NamedQuery(name = "Sysobjects.findByXtype", query = "SELECT s FROM Sysobjects s WHERE s.xtype = :xtype"),
    @NamedQuery(name = "Sysobjects.findByUid", query = "SELECT s FROM Sysobjects s WHERE s.uid = :uid"),
    @NamedQuery(name = "Sysobjects.findByInfo", query = "SELECT s FROM Sysobjects s WHERE s.info = :info"),
    @NamedQuery(name = "Sysobjects.findByStatus", query = "SELECT s FROM Sysobjects s WHERE s.status = :status"),
    @NamedQuery(name = "Sysobjects.findByBaseSchemaVer", query = "SELECT s FROM Sysobjects s WHERE s.baseSchemaVer = :baseSchemaVer"),
    @NamedQuery(name = "Sysobjects.findByReplinfo", query = "SELECT s FROM Sysobjects s WHERE s.replinfo = :replinfo"),
    @NamedQuery(name = "Sysobjects.findByParentObj", query = "SELECT s FROM Sysobjects s WHERE s.parentObj = :parentObj"),
    @NamedQuery(name = "Sysobjects.findByCrdate", query = "SELECT s FROM Sysobjects s WHERE s.crdate = :crdate"),
    @NamedQuery(name = "Sysobjects.findByFtcatid", query = "SELECT s FROM Sysobjects s WHERE s.ftcatid = :ftcatid"),
    @NamedQuery(name = "Sysobjects.findBySchemaVer", query = "SELECT s FROM Sysobjects s WHERE s.schemaVer = :schemaVer"),
    @NamedQuery(name = "Sysobjects.findByStatsSchemaVer", query = "SELECT s FROM Sysobjects s WHERE s.statsSchemaVer = :statsSchemaVer"),
    @NamedQuery(name = "Sysobjects.findByType", query = "SELECT s FROM Sysobjects s WHERE s.type = :type"),
    @NamedQuery(name = "Sysobjects.findByUserstat", query = "SELECT s FROM Sysobjects s WHERE s.userstat = :userstat"),
    @NamedQuery(name = "Sysobjects.findBySysstat", query = "SELECT s FROM Sysobjects s WHERE s.sysstat = :sysstat"),
    @NamedQuery(name = "Sysobjects.findByIndexdel", query = "SELECT s FROM Sysobjects s WHERE s.indexdel = :indexdel"),
    @NamedQuery(name = "Sysobjects.findByRefdate", query = "SELECT s FROM Sysobjects s WHERE s.refdate = :refdate"),
    @NamedQuery(name = "Sysobjects.findByVersion", query = "SELECT s FROM Sysobjects s WHERE s.version = :version"),
    @NamedQuery(name = "Sysobjects.findByDeltrig", query = "SELECT s FROM Sysobjects s WHERE s.deltrig = :deltrig"),
    @NamedQuery(name = "Sysobjects.findByInstrig", query = "SELECT s FROM Sysobjects s WHERE s.instrig = :instrig"),
    @NamedQuery(name = "Sysobjects.findByUpdtrig", query = "SELECT s FROM Sysobjects s WHERE s.updtrig = :updtrig"),
    @NamedQuery(name = "Sysobjects.findBySeltrig", query = "SELECT s FROM Sysobjects s WHERE s.seltrig = :seltrig"),
    @NamedQuery(name = "Sysobjects.findByCategory", query = "SELECT s FROM Sysobjects s WHERE s.category = :category"),
    @NamedQuery(name = "Sysobjects.findByCache", query = "SELECT s FROM Sysobjects s WHERE s.cache = :cache")})
public class Sysobjects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "xtype")
    private String xtype;
    @Column(name = "uid")
    private Short uid;
    @Column(name = "info")
    private Short info;
    @Column(name = "status")
    private Integer status;
    @Column(name = "base_schema_ver")
    private Integer baseSchemaVer;
    @Column(name = "replinfo")
    private Integer replinfo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_obj")
    private int parentObj;
    @Basic(optional = false)
    @NotNull
    @Column(name = "crdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdate;
    @Column(name = "ftcatid")
    private Short ftcatid;
    @Column(name = "schema_ver")
    private Integer schemaVer;
    @Column(name = "stats_schema_ver")
    private Integer statsSchemaVer;
    @Size(max = 2)
    @Column(name = "type")
    private String type;
    @Column(name = "userstat")
    private Short userstat;
    @Column(name = "sysstat")
    private Short sysstat;
    @Column(name = "indexdel")
    private Short indexdel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "refdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date refdate;
    @Column(name = "version")
    private Integer version;
    @Column(name = "deltrig")
    private Integer deltrig;
    @Column(name = "instrig")
    private Integer instrig;
    @Column(name = "updtrig")
    private Integer updtrig;
    @Column(name = "seltrig")
    private Integer seltrig;
    @Column(name = "category")
    private Integer category;
    @Column(name = "cache")
    private Short cache;

    public Sysobjects() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getXtype() {
        return xtype;
    }

    public void setXtype(String xtype) {
        this.xtype = xtype;
    }

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
    }

    public Short getInfo() {
        return info;
    }

    public void setInfo(Short info) {
        this.info = info;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBaseSchemaVer() {
        return baseSchemaVer;
    }

    public void setBaseSchemaVer(Integer baseSchemaVer) {
        this.baseSchemaVer = baseSchemaVer;
    }

    public Integer getReplinfo() {
        return replinfo;
    }

    public void setReplinfo(Integer replinfo) {
        this.replinfo = replinfo;
    }

    public int getParentObj() {
        return parentObj;
    }

    public void setParentObj(int parentObj) {
        this.parentObj = parentObj;
    }

    public Date getCrdate() {
        return crdate;
    }

    public void setCrdate(Date crdate) {
        this.crdate = crdate;
    }

    public Short getFtcatid() {
        return ftcatid;
    }

    public void setFtcatid(Short ftcatid) {
        this.ftcatid = ftcatid;
    }

    public Integer getSchemaVer() {
        return schemaVer;
    }

    public void setSchemaVer(Integer schemaVer) {
        this.schemaVer = schemaVer;
    }

    public Integer getStatsSchemaVer() {
        return statsSchemaVer;
    }

    public void setStatsSchemaVer(Integer statsSchemaVer) {
        this.statsSchemaVer = statsSchemaVer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Short getUserstat() {
        return userstat;
    }

    public void setUserstat(Short userstat) {
        this.userstat = userstat;
    }

    public Short getSysstat() {
        return sysstat;
    }

    public void setSysstat(Short sysstat) {
        this.sysstat = sysstat;
    }

    public Short getIndexdel() {
        return indexdel;
    }

    public void setIndexdel(Short indexdel) {
        this.indexdel = indexdel;
    }

    public Date getRefdate() {
        return refdate;
    }

    public void setRefdate(Date refdate) {
        this.refdate = refdate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getDeltrig() {
        return deltrig;
    }

    public void setDeltrig(Integer deltrig) {
        this.deltrig = deltrig;
    }

    public Integer getInstrig() {
        return instrig;
    }

    public void setInstrig(Integer instrig) {
        this.instrig = instrig;
    }

    public Integer getUpdtrig() {
        return updtrig;
    }

    public void setUpdtrig(Integer updtrig) {
        this.updtrig = updtrig;
    }

    public Integer getSeltrig() {
        return seltrig;
    }

    public void setSeltrig(Integer seltrig) {
        this.seltrig = seltrig;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Short getCache() {
        return cache;
    }

    public void setCache(Short cache) {
        this.cache = cache;
    }
    
}
