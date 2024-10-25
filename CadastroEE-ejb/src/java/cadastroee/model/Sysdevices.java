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
@Table(name = "sysdevices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysdevices.findAll", query = "SELECT s FROM Sysdevices s"),
    @NamedQuery(name = "Sysdevices.findByName", query = "SELECT s FROM Sysdevices s WHERE s.name = :name"),
    @NamedQuery(name = "Sysdevices.findBySize", query = "SELECT s FROM Sysdevices s WHERE s.size = :size"),
    @NamedQuery(name = "Sysdevices.findByLow", query = "SELECT s FROM Sysdevices s WHERE s.low = :low"),
    @NamedQuery(name = "Sysdevices.findByHigh", query = "SELECT s FROM Sysdevices s WHERE s.high = :high"),
    @NamedQuery(name = "Sysdevices.findByStatus", query = "SELECT s FROM Sysdevices s WHERE s.status = :status"),
    @NamedQuery(name = "Sysdevices.findByCntrltype", query = "SELECT s FROM Sysdevices s WHERE s.cntrltype = :cntrltype"),
    @NamedQuery(name = "Sysdevices.findByPhyname", query = "SELECT s FROM Sysdevices s WHERE s.phyname = :phyname")})
public class Sysdevices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "size")
    private Integer size;
    @Column(name = "low")
    private Integer low;
    @Column(name = "high")
    private Integer high;
    @Column(name = "status")
    private Short status;
    @Column(name = "cntrltype")
    private Short cntrltype;
    @Size(max = 260)
    @Column(name = "phyname")
    private String phyname;

    public Sysdevices() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getCntrltype() {
        return cntrltype;
    }

    public void setCntrltype(Short cntrltype) {
        this.cntrltype = cntrltype;
    }

    public String getPhyname() {
        return phyname;
    }

    public void setPhyname(String phyname) {
        this.phyname = phyname;
    }
    
}
