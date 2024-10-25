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
@Table(name = "dm_xe_object_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXeObjectColumns.findAll", query = "SELECT d FROM DmXeObjectColumns d"),
    @NamedQuery(name = "DmXeObjectColumns.findByName", query = "SELECT d FROM DmXeObjectColumns d WHERE d.name = :name"),
    @NamedQuery(name = "DmXeObjectColumns.findByColumnId", query = "SELECT d FROM DmXeObjectColumns d WHERE d.columnId = :columnId"),
    @NamedQuery(name = "DmXeObjectColumns.findByObjectName", query = "SELECT d FROM DmXeObjectColumns d WHERE d.objectName = :objectName"),
    @NamedQuery(name = "DmXeObjectColumns.findByObjectPackageGuid", query = "SELECT d FROM DmXeObjectColumns d WHERE d.objectPackageGuid = :objectPackageGuid"),
    @NamedQuery(name = "DmXeObjectColumns.findByTypeName", query = "SELECT d FROM DmXeObjectColumns d WHERE d.typeName = :typeName"),
    @NamedQuery(name = "DmXeObjectColumns.findByTypePackageGuid", query = "SELECT d FROM DmXeObjectColumns d WHERE d.typePackageGuid = :typePackageGuid"),
    @NamedQuery(name = "DmXeObjectColumns.findByColumnType", query = "SELECT d FROM DmXeObjectColumns d WHERE d.columnType = :columnType"),
    @NamedQuery(name = "DmXeObjectColumns.findByColumnValue", query = "SELECT d FROM DmXeObjectColumns d WHERE d.columnValue = :columnValue"),
    @NamedQuery(name = "DmXeObjectColumns.findByCapabilities", query = "SELECT d FROM DmXeObjectColumns d WHERE d.capabilities = :capabilities"),
    @NamedQuery(name = "DmXeObjectColumns.findByCapabilitiesDesc", query = "SELECT d FROM DmXeObjectColumns d WHERE d.capabilitiesDesc = :capabilitiesDesc"),
    @NamedQuery(name = "DmXeObjectColumns.findByDescription", query = "SELECT d FROM DmXeObjectColumns d WHERE d.description = :description")})
public class DmXeObjectColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_id")
    private int columnId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "object_name")
    private String objectName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "object_package_guid")
    private String objectPackageGuid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "type_name")
    private String typeName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "type_package_guid")
    private String typePackageGuid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "column_type")
    private String columnType;
    @Size(max = 256)
    @Column(name = "column_value")
    private String columnValue;
    @Column(name = "capabilities")
    private Integer capabilities;
    @Size(max = 256)
    @Column(name = "capabilities_desc")
    private String capabilitiesDesc;
    @Size(max = 3072)
    @Column(name = "description")
    private String description;

    public DmXeObjectColumns() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectPackageGuid() {
        return objectPackageGuid;
    }

    public void setObjectPackageGuid(String objectPackageGuid) {
        this.objectPackageGuid = objectPackageGuid;
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

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getColumnValue() {
        return columnValue;
    }

    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
