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
@Table(name = "dm_clr_properties")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmClrProperties.findAll", query = "SELECT d FROM DmClrProperties d"),
    @NamedQuery(name = "DmClrProperties.findByName", query = "SELECT d FROM DmClrProperties d WHERE d.name = :name"),
    @NamedQuery(name = "DmClrProperties.findByValue", query = "SELECT d FROM DmClrProperties d WHERE d.value = :value")})
public class DmClrProperties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 128)
    @Column(name = "value")
    private String value;

    public DmClrProperties() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
