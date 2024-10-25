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
@Table(name = "cryptographic_providers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CryptographicProviders.findAll", query = "SELECT c FROM CryptographicProviders c"),
    @NamedQuery(name = "CryptographicProviders.findByProviderId", query = "SELECT c FROM CryptographicProviders c WHERE c.providerId = :providerId"),
    @NamedQuery(name = "CryptographicProviders.findByName", query = "SELECT c FROM CryptographicProviders c WHERE c.name = :name"),
    @NamedQuery(name = "CryptographicProviders.findByGuid", query = "SELECT c FROM CryptographicProviders c WHERE c.guid = :guid"),
    @NamedQuery(name = "CryptographicProviders.findByVersion", query = "SELECT c FROM CryptographicProviders c WHERE c.version = :version"),
    @NamedQuery(name = "CryptographicProviders.findByDllPath", query = "SELECT c FROM CryptographicProviders c WHERE c.dllPath = :dllPath"),
    @NamedQuery(name = "CryptographicProviders.findByIsEnabled", query = "SELECT c FROM CryptographicProviders c WHERE c.isEnabled = :isEnabled")})
public class CryptographicProviders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "provider_id")
    private int providerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 36)
    @Column(name = "guid")
    private String guid;
    @Size(max = 24)
    @Column(name = "version")
    private String version;
    @Size(max = 520)
    @Column(name = "dll_path")
    private String dllPath;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_enabled")
    private boolean isEnabled;

    public CryptographicProviders() {
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDllPath() {
        return dllPath;
    }

    public void setDllPath(String dllPath) {
        this.dllPath = dllPath;
    }

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }
    
}
