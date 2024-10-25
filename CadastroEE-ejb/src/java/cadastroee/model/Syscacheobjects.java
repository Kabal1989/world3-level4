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
@Table(name = "syscacheobjects")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syscacheobjects.findAll", query = "SELECT s FROM Syscacheobjects s"),
    @NamedQuery(name = "Syscacheobjects.findByBucketid", query = "SELECT s FROM Syscacheobjects s WHERE s.bucketid = :bucketid"),
    @NamedQuery(name = "Syscacheobjects.findByCacheobjtype", query = "SELECT s FROM Syscacheobjects s WHERE s.cacheobjtype = :cacheobjtype"),
    @NamedQuery(name = "Syscacheobjects.findByObjtype", query = "SELECT s FROM Syscacheobjects s WHERE s.objtype = :objtype"),
    @NamedQuery(name = "Syscacheobjects.findByObjid", query = "SELECT s FROM Syscacheobjects s WHERE s.objid = :objid"),
    @NamedQuery(name = "Syscacheobjects.findByDbid", query = "SELECT s FROM Syscacheobjects s WHERE s.dbid = :dbid"),
    @NamedQuery(name = "Syscacheobjects.findByDbidexec", query = "SELECT s FROM Syscacheobjects s WHERE s.dbidexec = :dbidexec"),
    @NamedQuery(name = "Syscacheobjects.findByUid", query = "SELECT s FROM Syscacheobjects s WHERE s.uid = :uid"),
    @NamedQuery(name = "Syscacheobjects.findByRefcounts", query = "SELECT s FROM Syscacheobjects s WHERE s.refcounts = :refcounts"),
    @NamedQuery(name = "Syscacheobjects.findByUsecounts", query = "SELECT s FROM Syscacheobjects s WHERE s.usecounts = :usecounts"),
    @NamedQuery(name = "Syscacheobjects.findByPagesused", query = "SELECT s FROM Syscacheobjects s WHERE s.pagesused = :pagesused"),
    @NamedQuery(name = "Syscacheobjects.findBySetopts", query = "SELECT s FROM Syscacheobjects s WHERE s.setopts = :setopts"),
    @NamedQuery(name = "Syscacheobjects.findByLangid", query = "SELECT s FROM Syscacheobjects s WHERE s.langid = :langid"),
    @NamedQuery(name = "Syscacheobjects.findByDateformat", query = "SELECT s FROM Syscacheobjects s WHERE s.dateformat = :dateformat"),
    @NamedQuery(name = "Syscacheobjects.findByStatus", query = "SELECT s FROM Syscacheobjects s WHERE s.status = :status"),
    @NamedQuery(name = "Syscacheobjects.findByLasttime", query = "SELECT s FROM Syscacheobjects s WHERE s.lasttime = :lasttime"),
    @NamedQuery(name = "Syscacheobjects.findByMaxexectime", query = "SELECT s FROM Syscacheobjects s WHERE s.maxexectime = :maxexectime"),
    @NamedQuery(name = "Syscacheobjects.findByAvgexectime", query = "SELECT s FROM Syscacheobjects s WHERE s.avgexectime = :avgexectime"),
    @NamedQuery(name = "Syscacheobjects.findByLastreads", query = "SELECT s FROM Syscacheobjects s WHERE s.lastreads = :lastreads"),
    @NamedQuery(name = "Syscacheobjects.findByLastwrites", query = "SELECT s FROM Syscacheobjects s WHERE s.lastwrites = :lastwrites"),
    @NamedQuery(name = "Syscacheobjects.findBySqlbytes", query = "SELECT s FROM Syscacheobjects s WHERE s.sqlbytes = :sqlbytes"),
    @NamedQuery(name = "Syscacheobjects.findBySql", query = "SELECT s FROM Syscacheobjects s WHERE s.sql = :sql")})
public class Syscacheobjects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bucketid")
    private int bucketid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "cacheobjtype")
    private String cacheobjtype;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "objtype")
    private String objtype;
    @Column(name = "objid")
    private Integer objid;
    @Column(name = "dbid")
    private Short dbid;
    @Column(name = "dbidexec")
    private Short dbidexec;
    @Column(name = "uid")
    private Short uid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "refcounts")
    private int refcounts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usecounts")
    private int usecounts;
    @Column(name = "pagesused")
    private Integer pagesused;
    @Column(name = "setopts")
    private Integer setopts;
    @Column(name = "langid")
    private Short langid;
    @Column(name = "dateformat")
    private Short dateformat;
    @Column(name = "status")
    private Integer status;
    @Column(name = "lasttime")
    private BigInteger lasttime;
    @Column(name = "maxexectime")
    private BigInteger maxexectime;
    @Column(name = "avgexectime")
    private BigInteger avgexectime;
    @Column(name = "lastreads")
    private BigInteger lastreads;
    @Column(name = "lastwrites")
    private BigInteger lastwrites;
    @Column(name = "sqlbytes")
    private Integer sqlbytes;
    @Size(max = 3900)
    @Column(name = "sql")
    private String sql;

    public Syscacheobjects() {
    }

    public int getBucketid() {
        return bucketid;
    }

    public void setBucketid(int bucketid) {
        this.bucketid = bucketid;
    }

    public String getCacheobjtype() {
        return cacheobjtype;
    }

    public void setCacheobjtype(String cacheobjtype) {
        this.cacheobjtype = cacheobjtype;
    }

    public String getObjtype() {
        return objtype;
    }

    public void setObjtype(String objtype) {
        this.objtype = objtype;
    }

    public Integer getObjid() {
        return objid;
    }

    public void setObjid(Integer objid) {
        this.objid = objid;
    }

    public Short getDbid() {
        return dbid;
    }

    public void setDbid(Short dbid) {
        this.dbid = dbid;
    }

    public Short getDbidexec() {
        return dbidexec;
    }

    public void setDbidexec(Short dbidexec) {
        this.dbidexec = dbidexec;
    }

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
    }

    public int getRefcounts() {
        return refcounts;
    }

    public void setRefcounts(int refcounts) {
        this.refcounts = refcounts;
    }

    public int getUsecounts() {
        return usecounts;
    }

    public void setUsecounts(int usecounts) {
        this.usecounts = usecounts;
    }

    public Integer getPagesused() {
        return pagesused;
    }

    public void setPagesused(Integer pagesused) {
        this.pagesused = pagesused;
    }

    public Integer getSetopts() {
        return setopts;
    }

    public void setSetopts(Integer setopts) {
        this.setopts = setopts;
    }

    public Short getLangid() {
        return langid;
    }

    public void setLangid(Short langid) {
        this.langid = langid;
    }

    public Short getDateformat() {
        return dateformat;
    }

    public void setDateformat(Short dateformat) {
        this.dateformat = dateformat;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigInteger getLasttime() {
        return lasttime;
    }

    public void setLasttime(BigInteger lasttime) {
        this.lasttime = lasttime;
    }

    public BigInteger getMaxexectime() {
        return maxexectime;
    }

    public void setMaxexectime(BigInteger maxexectime) {
        this.maxexectime = maxexectime;
    }

    public BigInteger getAvgexectime() {
        return avgexectime;
    }

    public void setAvgexectime(BigInteger avgexectime) {
        this.avgexectime = avgexectime;
    }

    public BigInteger getLastreads() {
        return lastreads;
    }

    public void setLastreads(BigInteger lastreads) {
        this.lastreads = lastreads;
    }

    public BigInteger getLastwrites() {
        return lastwrites;
    }

    public void setLastwrites(BigInteger lastwrites) {
        this.lastwrites = lastwrites;
    }

    public Integer getSqlbytes() {
        return sqlbytes;
    }

    public void setSqlbytes(Integer sqlbytes) {
        this.sqlbytes = sqlbytes;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
    
}
