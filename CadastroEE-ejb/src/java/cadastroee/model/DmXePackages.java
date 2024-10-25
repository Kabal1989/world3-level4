/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "dm_xe_packages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXePackages.findAll", query = "SELECT d FROM DmXePackages d"),
    @NamedQuery(name = "DmXePackages.findByName", query = "SELECT d FROM DmXePackages d WHERE d.name = :name"),
    @NamedQuery(name = "DmXePackages.findByGuid", query = "SELECT d FROM DmXePackages d WHERE d.guid = :guid"),
    @NamedQuery(name = "DmXePackages.findByDescription", query = "SELECT d FROM DmXePackages d WHERE d.description = :description"),
    @NamedQuery(name = "DmXePackages.findByCapabilities", query = "SELECT d FROM DmXePackages d WHERE d.capabilities = :capabilities"),
    @NamedQuery(name = "DmXePackages.findByCapabilitiesDesc", query = "SELECT d FROM DmXePackages d WHERE d.capabilitiesDesc = :capabilitiesDesc"),
    @NamedQuery(name = "DmXePackages.findByModuleGuid", query = "SELECT d FROM DmXePackages d WHERE d.moduleGuid = :moduleGuid")})
public class DmXePackages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "guid")
    private String guid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3072)
    @Column(name = "description")
    private String description;
    @Column(name = "capabilities")
    private Integer capabilities;
    @Size(max = 256)
    @Column(name = "capabilities_desc")
    private String capabilitiesDesc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "module_guid")
    private String moduleGuid;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "module_address")
    private byte[] moduleAddress;

    public DmXePackages() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Integer capabilities) {
        this.capabilities = capabilities;
    }

    public String getCapabilitiesDesc() {
        return capabilitiesDesc;
    }

    public void setCapabilitiesDesc(String capabilitiesDesc) {
        this.capabilitiesDesc = capabilitiesDesc;
    }

    public String getModuleGuid() {
        return moduleGuid;
    }

    public void setModuleGuid(String moduleGuid) {
        this.moduleGuid = moduleGuid;
    }

    public byte[] getModuleAddress() {
        return moduleAddress;
    }

    public void setModuleAddress(byte[] moduleAddress) {
        this.moduleAddress = moduleAddress;
    }
    
}
