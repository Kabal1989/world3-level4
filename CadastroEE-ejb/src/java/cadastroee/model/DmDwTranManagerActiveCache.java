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
@Table(name = "dm_dw_tran_manager_active_cache")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDwTranManagerActiveCache.findAll", query = "SELECT d FROM DmDwTranManagerActiveCache d"),
    @NamedQuery(name = "DmDwTranManagerActiveCache.findByBsn", query = "SELECT d FROM DmDwTranManagerActiveCache d WHERE d.bsn = :bsn"),
    @NamedQuery(name = "DmDwTranManagerActiveCache.findByTag", query = "SELECT d FROM DmDwTranManagerActiveCache d WHERE d.tag = :tag"),
    @NamedQuery(name = "DmDwTranManagerActiveCache.findByResourceManagerId", query = "SELECT d FROM DmDwTranManagerActiveCache d WHERE d.resourceManagerId = :resourceManagerId")})
public class DmDwTranManagerActiveCache implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bsn")
    private long bsn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tag")
    private short tag;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "resource_manager_id")
    private String resourceManagerId;

    public DmDwTranManagerActiveCache() {
    }

    public long getBsn() {
        return bsn;
    }

    public void setBsn(long bsn) {
        this.bsn = bsn;
    }

    public short getTag() {
        return tag;
    }

    public void setTag(short tag) {
        this.tag = tag;
    }

    public String getResourceManagerId() {
        return resourceManagerId;
    }

    public void setResourceManagerId(String resourceManagerId) {
        this.resourceManagerId = resourceManagerId;
    }
    
}
