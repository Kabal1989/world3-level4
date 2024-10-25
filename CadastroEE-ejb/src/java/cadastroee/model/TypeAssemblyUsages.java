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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "type_assembly_usages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeAssemblyUsages.findAll", query = "SELECT t FROM TypeAssemblyUsages t"),
    @NamedQuery(name = "TypeAssemblyUsages.findByUserTypeId", query = "SELECT t FROM TypeAssemblyUsages t WHERE t.userTypeId = :userTypeId"),
    @NamedQuery(name = "TypeAssemblyUsages.findByAssemblyId", query = "SELECT t FROM TypeAssemblyUsages t WHERE t.assemblyId = :assemblyId")})
public class TypeAssemblyUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_type_id")
    private int userTypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "assembly_id")
    private int assemblyId;

    public TypeAssemblyUsages() {
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public int getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(int assemblyId) {
        this.assemblyId = assemblyId;
    }
    
}
