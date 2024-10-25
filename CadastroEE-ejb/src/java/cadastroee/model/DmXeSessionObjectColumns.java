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
@Table(name = "dm_xe_session_object_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmXeSessionObjectColumns.findAll", query = "SELECT d FROM DmXeSessionObjectColumns d"),
    @NamedQuery(name = "DmXeSessionObjectColumns.findByColumnName", query = "SELECT d FROM DmXeSessionObjectColumns d WHERE d.columnName = :columnName"),
    @NamedQuery(name = "DmXeSessionObjectColumns.findByColumnId", query = "SELECT d FROM DmXeSessionObjectColumns d WHERE d.columnId = :columnId"),
    @NamedQuery(name = "DmXeSessionObjectColumns.findByColumnValue", query = "SELECT d FROM DmXeSessionObjectColumns d WHERE d.columnValue = :columnValue"),
    @NamedQuery(name = "DmXeSessionObjectColumns.findByObjectType", query = "SELECT d FROM DmXeSessionObjectColumns d WHERE d.objectType = :objectType"),
    @NamedQuery(name = "DmXeSessionObjectColumns.findByObjectName", query = "SELECT d FROM DmXeSessionObjectColumns d WHERE d.objectName = :objectName"),
    @NamedQuery(name = "DmXeSessionObjectColumns.findByObjectPackageGuid", query = "SELECT d FROM DmXeSessionObjectColumns d WHERE d.objectPackageGuid = :objectPackageGuid")})
public class DmXeSessionObjectColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "event_session_address")
    private byte[] eventSessionAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "column_name")
    private String columnName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_id")
    private int columnId;
    @Size(max = 3072)
    @Column(name = "column_value")
    private String columnValue;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "object_type")
    private String objectType;
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

    public DmXeSessionObjectColumns() {
    }

    public byte[] getEventSessionAddress() {
        return eventSessionAddress;
    }

    public void setEventSessionAddress(byte[] eventSessionAddress) {
        this.eventSessionAddress = eventSessionAddress;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public String getColumnValue() {
        return columnValue;
    }

    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
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
    
}
