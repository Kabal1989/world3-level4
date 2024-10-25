/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "external_libraries_installed")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalLibrariesInstalled.findAll", query = "SELECT e FROM ExternalLibrariesInstalled e"),
    @NamedQuery(name = "ExternalLibrariesInstalled.findByDbId", query = "SELECT e FROM ExternalLibrariesInstalled e WHERE e.dbId = :dbId"),
    @NamedQuery(name = "ExternalLibrariesInstalled.findByPrincipalId", query = "SELECT e FROM ExternalLibrariesInstalled e WHERE e.principalId = :principalId"),
    @NamedQuery(name = "ExternalLibrariesInstalled.findByLanguageId", query = "SELECT e FROM ExternalLibrariesInstalled e WHERE e.languageId = :languageId"),
    @NamedQuery(name = "ExternalLibrariesInstalled.findByExternalLibraryId", query = "SELECT e FROM ExternalLibrariesInstalled e WHERE e.externalLibraryId = :externalLibraryId"),
    @NamedQuery(name = "ExternalLibrariesInstalled.findByName", query = "SELECT e FROM ExternalLibrariesInstalled e WHERE e.name = :name")})
public class ExternalLibrariesInstalled implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "db_id")
    private int dbId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "principal_id")
    private int principalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_library_id")
    private int externalLibraryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "mdversion")
    private byte[] mdversion;

    public ExternalLibrariesInstalled() {
    }

    public int getDbId() {
        return dbId;
    }

    public void setDbId(int dbId) {
        this.dbId = dbId;
    }

    public int getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(int principalId) {
        this.principalId = principalId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
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

    public byte[] getMdversion() {
        return mdversion;
    }

    public void setMdversion(byte[] mdversion) {
        this.mdversion = mdversion;
    }
    
}
