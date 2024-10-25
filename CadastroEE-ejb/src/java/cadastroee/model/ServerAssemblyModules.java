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
@Table(name = "server_assembly_modules")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerAssemblyModules.findAll", query = "SELECT s FROM ServerAssemblyModules s"),
    @NamedQuery(name = "ServerAssemblyModules.findByObjectId", query = "SELECT s FROM ServerAssemblyModules s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "ServerAssemblyModules.findByAssemblyId", query = "SELECT s FROM ServerAssemblyModules s WHERE s.assemblyId = :assemblyId"),
    @NamedQuery(name = "ServerAssemblyModules.findByAssemblyClass", query = "SELECT s FROM ServerAssemblyModules s WHERE s.assemblyClass = :assemblyClass"),
    @NamedQuery(name = "ServerAssemblyModules.findByAssemblyMethod", query = "SELECT s FROM ServerAssemblyModules s WHERE s.assemblyMethod = :assemblyMethod"),
    @NamedQuery(name = "ServerAssemblyModules.findByExecuteAsPrincipalId", query = "SELECT s FROM ServerAssemblyModules s WHERE s.executeAsPrincipalId = :executeAsPrincipalId")})
public class ServerAssemblyModules implements Serializable {

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
    @Column(name = "execute_as_principal_id")
    private Integer executeAsPrincipalId;

    public ServerAssemblyModules() {
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

    public Integer getExecuteAsPrincipalId() {
        return executeAsPrincipalId;
    }

    public void setExecuteAsPrincipalId(Integer executeAsPrincipalId) {
        this.executeAsPrincipalId = executeAsPrincipalId;
    }
    
}
