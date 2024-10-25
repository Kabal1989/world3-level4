/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_clr_loaded_assemblies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmClrLoadedAssemblies.findAll", query = "SELECT d FROM DmClrLoadedAssemblies d"),
    @NamedQuery(name = "DmClrLoadedAssemblies.findByAssemblyId", query = "SELECT d FROM DmClrLoadedAssemblies d WHERE d.assemblyId = :assemblyId"),
    @NamedQuery(name = "DmClrLoadedAssemblies.findByLoadTime", query = "SELECT d FROM DmClrLoadedAssemblies d WHERE d.loadTime = :loadTime")})
public class DmClrLoadedAssemblies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "assembly_id")
    private Integer assemblyId;
    @Lob
    @Column(name = "appdomain_address")
    private byte[] appdomainAddress;
    @Column(name = "load_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loadTime;

    public DmClrLoadedAssemblies() {
    }

    public Integer getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(Integer assemblyId) {
        this.assemblyId = assemblyId;
    }

    public byte[] getAppdomainAddress() {
        return appdomainAddress;
    }

    public void setAppdomainAddress(byte[] appdomainAddress) {
        this.appdomainAddress = appdomainAddress;
    }

    public Date getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(Date loadTime) {
        this.loadTime = loadTime;
    }
    
}
