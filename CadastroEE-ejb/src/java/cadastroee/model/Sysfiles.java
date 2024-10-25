/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
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
@Table(name = "sysfiles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysfiles.findAll", query = "SELECT s FROM Sysfiles s"),
    @NamedQuery(name = "Sysfiles.findByFileid", query = "SELECT s FROM Sysfiles s WHERE s.fileid = :fileid"),
    @NamedQuery(name = "Sysfiles.findByGroupid", query = "SELECT s FROM Sysfiles s WHERE s.groupid = :groupid"),
    @NamedQuery(name = "Sysfiles.findBySize", query = "SELECT s FROM Sysfiles s WHERE s.size = :size"),
    @NamedQuery(name = "Sysfiles.findByMaxsize", query = "SELECT s FROM Sysfiles s WHERE s.maxsize = :maxsize"),
    @NamedQuery(name = "Sysfiles.findByGrowth", query = "SELECT s FROM Sysfiles s WHERE s.growth = :growth"),
    @NamedQuery(name = "Sysfiles.findByStatus", query = "SELECT s FROM Sysfiles s WHERE s.status = :status"),
    @NamedQuery(name = "Sysfiles.findByPerf", query = "SELECT s FROM Sysfiles s WHERE s.perf = :perf"),
    @NamedQuery(name = "Sysfiles.findByName", query = "SELECT s FROM Sysfiles s WHERE s.name = :name"),
    @NamedQuery(name = "Sysfiles.findByFilename", query = "SELECT s FROM Sysfiles s WHERE s.filename = :filename")})
public class Sysfiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "fileid")
    private Short fileid;
    @Column(name = "groupid")
    private Short groupid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "size")
    private int size;
    @Basic(optional = false)
    @NotNull
    @Column(name = "maxsize")
    private int maxsize;
    @Basic(optional = false)
    @NotNull
    @Column(name = "growth")
    private int growth;
    @Column(name = "status")
    private Integer status;
    @Column(name = "perf")
    private Integer perf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 260)
    @Column(name = "filename")
    private String filename;

    public Sysfiles() {
    }

    public Short getFileid() {
        return fileid;
    }

    public void setFileid(Short fileid) {
        this.fileid = fileid;
    }

    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxsize() {
        return maxsize;
    }

    public void setMaxsize(int maxsize) {
        this.maxsize = maxsize;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPerf() {
        return perf;
    }

    public void setPerf(Integer perf) {
        this.perf = perf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    
}
