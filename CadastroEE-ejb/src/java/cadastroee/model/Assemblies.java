/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "assemblies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Assemblies.findAll", query = "SELECT a FROM Assemblies a"),
    @NamedQuery(name = "Assemblies.findByName", query = "SELECT a FROM Assemblies a WHERE a.name = :name"),
    @NamedQuery(name = "Assemblies.findByPrincipalId", query = "SELECT a FROM Assemblies a WHERE a.principalId = :principalId"),
    @NamedQuery(name = "Assemblies.findByAssemblyId", query = "SELECT a FROM Assemblies a WHERE a.assemblyId = :assemblyId"),
    @NamedQuery(name = "Assemblies.findByClrName", query = "SELECT a FROM Assemblies a WHERE a.clrName = :clrName"),
    @NamedQuery(name = "Assemblies.findByPermissionSet", query = "SELECT a FROM Assemblies a WHERE a.permissionSet = :permissionSet"),
    @NamedQuery(name = "Assemblies.findByPermissionSetDesc", query = "SELECT a FROM Assemblies a WHERE a.permissionSetDesc = :permissionSetDesc"),
    @NamedQuery(name = "Assemblies.findByIsVisible", query = "SELECT a FROM Assemblies a WHERE a.isVisible = :isVisible"),
    @NamedQuery(name = "Assemblies.findByCreateDate", query = "SELECT a FROM Assemblies a WHERE a.createDate = :createDate"),
    @NamedQuery(name = "Assemblies.findByModifyDate", query = "SELECT a FROM Assemblies a WHERE a.modifyDate = :modifyDate"),
    @NamedQuery(name = "Assemblies.findByIsUserDefined", query = "SELECT a FROM Assemblies a WHERE a.isUserDefined = :isUserDefined")})
public class Assemblies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "assembly_id")
    private int assemblyId;
    @Size(max = 4000)
    @Column(name = "clr_name")
    private String clrName;
    @Column(name = "permission_set")
    private Short permissionSet;
    @Size(max = 60)
    @Column(name = "permission_set_desc")
    private String permissionSetDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_visible")
    private boolean isVisible;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Column(name = "is_user_defined")
    private Boolean isUserDefined;

    public Assemblies() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public int getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(int assemblyId) {
        this.assemblyId = assemblyId;
    }

    public String getClrName() {
        return clrName;
    }

    public void setClrName(String clrName) {
        this.clrName = clrName;
    }

    public Short getPermissionSet() {
        return permissionSet;
    }

    public void setPermissionSet(Short permissionSet) {
        this.permissionSet = permissionSet;
    }

    public String getPermissionSetDesc() {
        return permissionSetDesc;
    }

    public void setPermissionSetDesc(String permissionSetDesc) {
        this.permissionSetDesc = permissionSetDesc;
    }

    public boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Boolean getIsUserDefined() {
        return isUserDefined;
    }

    public void setIsUserDefined(Boolean isUserDefined) {
        this.isUserDefined = isUserDefined;
    }
    
}
