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
@Table(name = "data_spaces")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DataSpaces.findAll", query = "SELECT d FROM DataSpaces d"),
    @NamedQuery(name = "DataSpaces.findByName", query = "SELECT d FROM DataSpaces d WHERE d.name = :name"),
    @NamedQuery(name = "DataSpaces.findByDataSpaceId", query = "SELECT d FROM DataSpaces d WHERE d.dataSpaceId = :dataSpaceId"),
    @NamedQuery(name = "DataSpaces.findByType", query = "SELECT d FROM DataSpaces d WHERE d.type = :type"),
    @NamedQuery(name = "DataSpaces.findByTypeDesc", query = "SELECT d FROM DataSpaces d WHERE d.typeDesc = :typeDesc"),
    @NamedQuery(name = "DataSpaces.findByIsDefault", query = "SELECT d FROM DataSpaces d WHERE d.isDefault = :isDefault"),
    @NamedQuery(name = "DataSpaces.findByIsSystem", query = "SELECT d FROM DataSpaces d WHERE d.isSystem = :isSystem")})
public class DataSpaces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_space_id")
    private int dataSpaceId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "type")
    private String type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_default")
    private boolean isDefault;
    @Column(name = "is_system")
    private Boolean isSystem;

    public DataSpaces() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDataSpaceId() {
        return dataSpaceId;
    }

    public void setDataSpaceId(int dataSpaceId) {
        this.dataSpaceId = dataSpaceId;
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

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }
    
}
