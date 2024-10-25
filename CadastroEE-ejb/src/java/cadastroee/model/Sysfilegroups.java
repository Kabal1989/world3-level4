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
@Table(name = "sysfilegroups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysfilegroups.findAll", query = "SELECT s FROM Sysfilegroups s"),
    @NamedQuery(name = "Sysfilegroups.findByGroupid", query = "SELECT s FROM Sysfilegroups s WHERE s.groupid = :groupid"),
    @NamedQuery(name = "Sysfilegroups.findByAllocpolicy", query = "SELECT s FROM Sysfilegroups s WHERE s.allocpolicy = :allocpolicy"),
    @NamedQuery(name = "Sysfilegroups.findByStatus", query = "SELECT s FROM Sysfilegroups s WHERE s.status = :status"),
    @NamedQuery(name = "Sysfilegroups.findByGroupname", query = "SELECT s FROM Sysfilegroups s WHERE s.groupname = :groupname")})
public class Sysfilegroups implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "groupid")
    private Short groupid;
    @Column(name = "allocpolicy")
    private Short allocpolicy;
    @Column(name = "status")
    private Integer status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "groupname")
    private String groupname;

    public Sysfilegroups() {
    }

    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    public Short getAllocpolicy() {
        return allocpolicy;
    }

    public void setAllocpolicy(Short allocpolicy) {
        this.allocpolicy = allocpolicy;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
    
}
