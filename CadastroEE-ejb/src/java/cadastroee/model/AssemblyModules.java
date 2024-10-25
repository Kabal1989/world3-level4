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
@Table(name = "assembly_modules")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AssemblyModules.findAll", query = "SELECT a FROM AssemblyModules a"),
    @NamedQuery(name = "AssemblyModules.findByObjectId", query = "SELECT a FROM AssemblyModules a WHERE a.objectId = :objectId"),
    @NamedQuery(name = "AssemblyModules.findByAssemblyId", query = "SELECT a FROM AssemblyModules a WHERE a.assemblyId = :assemblyId"),
    @NamedQuery(name = "AssemblyModules.findByAssemblyClass", query = "SELECT a FROM AssemblyModules a WHERE a.assemblyClass = :assemblyClass"),
    @NamedQuery(name = "AssemblyModules.findByAssemblyMethod", query = "SELECT a FROM AssemblyModules a WHERE a.assemblyMethod = :assemblyMethod"),
    @NamedQuery(name = "AssemblyModules.findByNullOnNullInput", query = "SELECT a FROM AssemblyModules a WHERE a.nullOnNullInput = :nullOnNullInput"),
    @NamedQuery(name = "AssemblyModules.findByExecuteAsPrincipalId", query = "SELECT a FROM AssemblyModules a WHERE a.executeAsPrincipalId = :executeAsPrincipalId")})
public class AssemblyModules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "assembly_id")
    private int assemblyId;
    @Size(max = 128)
    @Column(name = "assembly_class")
    private String assemblyClass;
    @Size(max = 128)
    @Column(name = "assembly_method")
    private String assemblyMethod;
    @Column(name = "null_on_null_input")
    private Boolean nullOnNullInput;
    @Column(name = "execute_as_principal_id")
    private Integer executeAsPrincipalId;

    public AssemblyModules() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(int assemblyId) {
        this.assemblyId = assemblyId;
    }

    public String getAssemblyClass() {
        return assemblyClass;
    }

    public void setAssemblyClass(String assemblyClass) {
        this.assemblyClass = assemblyClass;
    }

    public String getAssemblyMethod() {
        return assemblyMethod;
    }

    public void setAssemblyMethod(String assemblyMethod) {
        this.assemblyMethod = assemblyMethod;
    }

    public Boolean getNullOnNullInput() {
        return nullOnNullInput;
    }

    public void setNullOnNullInput(Boolean nullOnNullInput) {
        this.nullOnNullInput = nullOnNullInput;
    }

    public Integer getExecuteAsPrincipalId() {
        return executeAsPrincipalId;
    }

    public void setExecuteAsPrincipalId(Integer executeAsPrincipalId) {
        this.executeAsPrincipalId = executeAsPrincipalId;
    }
    
}
