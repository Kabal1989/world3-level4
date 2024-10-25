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
@Table(name = "partition_schemes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PartitionSchemes.findAll", query = "SELECT p FROM PartitionSchemes p"),
    @NamedQuery(name = "PartitionSchemes.findByName", query = "SELECT p FROM PartitionSchemes p WHERE p.name = :name"),
    @NamedQuery(name = "PartitionSchemes.findByDataSpaceId", query = "SELECT p FROM PartitionSchemes p WHERE p.dataSpaceId = :dataSpaceId"),
    @NamedQuery(name = "PartitionSchemes.findByType", query = "SELECT p FROM PartitionSchemes p WHERE p.type = :type"),
    @NamedQuery(name = "PartitionSchemes.findByTypeDesc", query = "SELECT p FROM PartitionSchemes p WHERE p.typeDesc = :typeDesc"),
    @NamedQuery(name = "PartitionSchemes.findByIsDefault", query = "SELECT p FROM PartitionSchemes p WHERE p.isDefault = :isDefault"),
    @NamedQuery(name = "PartitionSchemes.findByIsSystem", query = "SELECT p FROM PartitionSchemes p WHERE p.isSystem = :isSystem"),
    @NamedQuery(name = "PartitionSchemes.findByFunctionId", query = "SELECT p FROM PartitionSchemes p WHERE p.functionId = :functionId")})
public class PartitionSchemes implements Serializable {

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
    @Column(name = "is_default")
    private Boolean isDefault;
    @Column(name = "is_system")
    private Boolean isSystem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "function_id")
    private int functionId;

    public PartitionSchemes() {
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

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public int getFunctionId() {
        return functionId;
    }

    public void setFunctionId(int functionId) {
        this.functionId = functionId;
    }
    
}
