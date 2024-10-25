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
@Table(name = "dm_server_registry")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmServerRegistry.findAll", query = "SELECT d FROM DmServerRegistry d"),
    @NamedQuery(name = "DmServerRegistry.findByRegistryKey", query = "SELECT d FROM DmServerRegistry d WHERE d.registryKey = :registryKey"),
    @NamedQuery(name = "DmServerRegistry.findByValueName", query = "SELECT d FROM DmServerRegistry d WHERE d.valueName = :valueName"),
    @NamedQuery(name = "DmServerRegistry.findByValueData", query = "SELECT d FROM DmServerRegistry d WHERE d.valueData = :valueData")})
public class DmServerRegistry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 256)
    @Column(name = "registry_key")
    private String registryKey;
    @Size(max = 256)
    @Column(name = "value_name")
    private String valueName;
    @Column(name = "value_data")
    private Serializable valueData;

    public DmServerRegistry() {
    }

    public String getRegistryKey() {
        return registryKey;
    }

    public void setRegistryKey(String registryKey) {
        this.registryKey = registryKey;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public Serializable getValueData() {
        return valueData;
    }

    public void setValueData(Serializable valueData) {
        this.valueData = valueData;
    }
    
}
