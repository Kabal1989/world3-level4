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
@Table(name = "sysfulltextcatalogs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysfulltextcatalogs.findAll", query = "SELECT s FROM Sysfulltextcatalogs s"),
    @NamedQuery(name = "Sysfulltextcatalogs.findByFtcatid", query = "SELECT s FROM Sysfulltextcatalogs s WHERE s.ftcatid = :ftcatid"),
    @NamedQuery(name = "Sysfulltextcatalogs.findByName", query = "SELECT s FROM Sysfulltextcatalogs s WHERE s.name = :name"),
    @NamedQuery(name = "Sysfulltextcatalogs.findByStatus", query = "SELECT s FROM Sysfulltextcatalogs s WHERE s.status = :status"),
    @NamedQuery(name = "Sysfulltextcatalogs.findByPath", query = "SELECT s FROM Sysfulltextcatalogs s WHERE s.path = :path")})
public class Sysfulltextcatalogs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "ftcatid")
    private Short ftcatid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private Short status;
    @Size(max = 260)
    @Column(name = "path")
    private String path;

    public Sysfulltextcatalogs() {
    }

    public Short getFtcatid() {
        return ftcatid;
    }

    public void setFtcatid(Short ftcatid) {
        this.ftcatid = ftcatid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
}
