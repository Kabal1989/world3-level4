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
@Table(name = "dm_xe_objects")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXeObjects.findAll", query = "SELECT d FROM DmXeObjects d"),
    @NamedQuery(name = "DmXeObjects.findByName", query = "SELECT d FROM DmXeObjects d WHERE d.name = :name"),
    @NamedQuery(name = "DmXeObjects.findByObjectType", query = "SELECT d FROM DmXeObjects d WHERE d.objectType = :objectType"),
    @NamedQuery(name = "DmXeObjects.findByPackageGuid", query = "SELECT d FROM DmXeObjects d WHERE d.packageGuid = :packageGuid"),
    @NamedQuery(name = "DmXeObjects.findByDescription", query = "SELECT d FROM DmXeObjects d WHERE d.description = :description"),
    @NamedQuery(name = "DmXeObjects.findByCapabilities", query = "SELECT d FROM DmXeObjects d WHERE d.capabilities = :capabilities"),
    @NamedQuery(name = "DmXeObjects.findByCapabilitiesDesc", query = "SELECT d FROM DmXeObjects d WHERE d.capabilitiesDesc = :capabilitiesDesc"),
    @NamedQuery(name = "DmXeObjects.findByTypeName", query = "SELECT d FROM DmXeObjects d WHERE d.typeName = :typeName"),
    @NamedQuery(name = "DmXeObjects.findByTypePackageGuid", query = "SELECT d FROM DmXeObjects d WHERE d.typePackageGuid = :typePackageGuid"),
    @NamedQuery(name = "DmXeObjects.findByTypeSize", query = "SELECT d FROM DmXeObjects d WHERE d.typeSize = :typeSize")})
public class DmXeObjects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "object_type")
    private String objectType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "package_guid")
    private String packageGuid;
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
    @Size(max = 256)
    @Column(name = "type_name")
    private String typeName;
    @Size(max = 36)
    @Column(name = "type_package_guid")
    private String typePackageGuid;
    @Column(name = "type_size")
    private Integer typeSize;

    public DmXeObjects() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getPackageGuid() {
        return packageGuid;
    }

    public void setPackageGuid(String packageGuid) {
        this.packageGuid = packageGuid;
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

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypePackageGuid() {
        return typePackageGuid;
    }

    public void setTypePackageGuid(String typePackageGuid) {
        this.typePackageGuid = typePackageGuid;
    }

    public Integer getTypeSize() {
        return typeSize;
    }

    public void setTypeSize(Integer typeSize) {
        this.typeSize = typeSize;
    }
    
}
