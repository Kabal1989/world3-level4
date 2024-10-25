/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "database_scoped_configurations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseScopedConfigurations.findAll", query = "SELECT d FROM DatabaseScopedConfigurations d"),
    @NamedQuery(name = "DatabaseScopedConfigurations.findByConfigurationId", query = "SELECT d FROM DatabaseScopedConfigurations d WHERE d.configurationId = :configurationId"),
    @NamedQuery(name = "DatabaseScopedConfigurations.findByName", query = "SELECT d FROM DatabaseScopedConfigurations d WHERE d.name = :name"),
    @NamedQuery(name = "DatabaseScopedConfigurations.findByValue", query = "SELECT d FROM DatabaseScopedConfigurations d WHERE d.value = :value"),
    @NamedQuery(name = "DatabaseScopedConfigurations.findByValueForSecondary", query = "SELECT d FROM DatabaseScopedConfigurations d WHERE d.valueForSecondary = :valueForSecondary"),
    @NamedQuery(name = "DatabaseScopedConfigurations.findByIsValueDefault", query = "SELECT d FROM DatabaseScopedConfigurations d WHERE d.isValueDefault = :isValueDefault")})
public class DatabaseScopedConfigurations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "configuration_id")
    private Integer configurationId;
    @Size(max = 60)
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private Serializable value;
    @Column(name = "value_for_secondary")
    private Serializable valueForSecondary;
    @Column(name = "is_value_default")
    private Boolean isValueDefault;

    public DatabaseScopedConfigurations() {
    }

    public Integer getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(Integer configurationId) {
        this.configurationId = configurationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serializable getValue() {
        return value;
    }

    public void setValue(Serializable value) {
        this.value = value;
    }

    public Serializable getValueForSecondary() {
        return valueForSecondary;
    }

    public void setValueForSecondary(Serializable valueForSecondary) {
        this.valueForSecondary = valueForSecondary;
    }

    public Boolean getIsValueDefault() {
        return isValueDefault;
    }

    public void setIsValueDefault(Boolean isValueDefault) {
        this.isValueDefault = isValueDefault;
    }
    
}
