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
@Table(name = "configurations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Configurations.findAll", query = "SELECT c FROM Configurations c"),
    @NamedQuery(name = "Configurations.findByConfigurationId", query = "SELECT c FROM Configurations c WHERE c.configurationId = :configurationId"),
    @NamedQuery(name = "Configurations.findByName", query = "SELECT c FROM Configurations c WHERE c.name = :name"),
    @NamedQuery(name = "Configurations.findByValue", query = "SELECT c FROM Configurations c WHERE c.value = :value"),
    @NamedQuery(name = "Configurations.findByMinimum", query = "SELECT c FROM Configurations c WHERE c.minimum = :minimum"),
    @NamedQuery(name = "Configurations.findByMaximum", query = "SELECT c FROM Configurations c WHERE c.maximum = :maximum"),
    @NamedQuery(name = "Configurations.findByValueInUse", query = "SELECT c FROM Configurations c WHERE c.valueInUse = :valueInUse"),
    @NamedQuery(name = "Configurations.findByDescription", query = "SELECT c FROM Configurations c WHERE c.description = :description"),
    @NamedQuery(name = "Configurations.findByIsDynamic", query = "SELECT c FROM Configurations c WHERE c.isDynamic = :isDynamic"),
    @NamedQuery(name = "Configurations.findByIsAdvanced", query = "SELECT c FROM Configurations c WHERE c.isAdvanced = :isAdvanced")})
public class Configurations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "configuration_id")
    private int configurationId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private Serializable value;
    @Column(name = "minimum")
    private Serializable minimum;
    @Column(name = "maximum")
    private Serializable maximum;
    @Column(name = "value_in_use")
    private Serializable valueInUse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_dynamic")
    private boolean isDynamic;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_advanced")
    private boolean isAdvanced;

    public Configurations() {
    }

    public int getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(int configurationId) {
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

    public Serializable getMinimum() {
        return minimum;
    }

    public void setMinimum(Serializable minimum) {
        this.minimum = minimum;
    }

    public Serializable getMaximum() {
        return maximum;
    }

    public void setMaximum(Serializable maximum) {
        this.maximum = maximum;
    }

    public Serializable getValueInUse() {
        return valueInUse;
    }

    public void setValueInUse(Serializable valueInUse) {
        this.valueInUse = valueInUse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsDynamic() {
        return isDynamic;
    }

    public void setIsDynamic(boolean isDynamic) {
        this.isDynamic = isDynamic;
    }

    public boolean getIsAdvanced() {
        return isAdvanced;
    }

    public void setIsAdvanced(boolean isAdvanced) {
        this.isAdvanced = isAdvanced;
    }
    
}
