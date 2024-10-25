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
@Table(name = "external_libraries")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalLibraries.findAll", query = "SELECT e FROM ExternalLibraries e"),
    @NamedQuery(name = "ExternalLibraries.findByExternalLibraryId", query = "SELECT e FROM ExternalLibraries e WHERE e.externalLibraryId = :externalLibraryId"),
    @NamedQuery(name = "ExternalLibraries.findByName", query = "SELECT e FROM ExternalLibraries e WHERE e.name = :name"),
    @NamedQuery(name = "ExternalLibraries.findByPrincipalId", query = "SELECT e FROM ExternalLibraries e WHERE e.principalId = :principalId"),
    @NamedQuery(name = "ExternalLibraries.findByLanguage", query = "SELECT e FROM ExternalLibraries e WHERE e.language = :language"),
    @NamedQuery(name = "ExternalLibraries.findByScope", query = "SELECT e FROM ExternalLibraries e WHERE e.scope = :scope"),
    @NamedQuery(name = "ExternalLibraries.findByScopeDesc", query = "SELECT e FROM ExternalLibraries e WHERE e.scopeDesc = :scopeDesc")})
public class ExternalLibraries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_library_id")
    private int externalLibraryId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "principal_id")
    private Integer principalId;
    @Size(max = 128)
    @Column(name = "language")
    private String language;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scope")
    private int scope;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "scope_desc")
    private String scopeDesc;

    public ExternalLibraries() {
    }

    public int getExternalLibraryId() {
        return externalLibraryId;
    }

    public void setExternalLibraryId(int externalLibraryId) {
        this.externalLibraryId = externalLibraryId;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    public String getScopeDesc() {
        return scopeDesc;
    }

    public void setScopeDesc(String scopeDesc) {
        this.scopeDesc = scopeDesc;
    }
    
}
