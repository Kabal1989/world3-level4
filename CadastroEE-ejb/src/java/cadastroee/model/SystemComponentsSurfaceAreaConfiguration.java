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
@Table(name = "system_components_surface_area_configuration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SystemComponentsSurfaceAreaConfiguration.findAll", query = "SELECT s FROM SystemComponentsSurfaceAreaConfiguration s"),
    @NamedQuery(name = "SystemComponentsSurfaceAreaConfiguration.findByComponentName", query = "SELECT s FROM SystemComponentsSurfaceAreaConfiguration s WHERE s.componentName = :componentName"),
    @NamedQuery(name = "SystemComponentsSurfaceAreaConfiguration.findByDatabaseName", query = "SELECT s FROM SystemComponentsSurfaceAreaConfiguration s WHERE s.databaseName = :databaseName"),
    @NamedQuery(name = "SystemComponentsSurfaceAreaConfiguration.findBySchemaName", query = "SELECT s FROM SystemComponentsSurfaceAreaConfiguration s WHERE s.schemaName = :schemaName"),
    @NamedQuery(name = "SystemComponentsSurfaceAreaConfiguration.findByObjectName", query = "SELECT s FROM SystemComponentsSurfaceAreaConfiguration s WHERE s.objectName = :objectName"),
    @NamedQuery(name = "SystemComponentsSurfaceAreaConfiguration.findByState", query = "SELECT s FROM SystemComponentsSurfaceAreaConfiguration s WHERE s.state = :state"),
    @NamedQuery(name = "SystemComponentsSurfaceAreaConfiguration.findByType", query = "SELECT s FROM SystemComponentsSurfaceAreaConfiguration s WHERE s.type = :type"),
    @NamedQuery(name = "SystemComponentsSurfaceAreaConfiguration.findByTypeDesc", query = "SELECT s FROM SystemComponentsSurfaceAreaConfiguration s WHERE s.typeDesc = :typeDesc")})
public class SystemComponentsSurfaceAreaConfiguration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "component_name")
    private String componentName;
    @Size(max = 128)
    @Column(name = "database_name")
    private String databaseName;
    @Size(max = 128)
    @Column(name = "schema_name")
    private String schemaName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "object_name")
    private String objectName;
    @Column(name = "state")
    private Short state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "type")
    private String type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;

    public SystemComponentsSurfaceAreaConfiguration() {
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }
    
}
