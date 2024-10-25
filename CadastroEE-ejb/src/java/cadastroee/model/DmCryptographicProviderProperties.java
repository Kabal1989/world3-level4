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
@Table(name = "dm_cryptographic_provider_properties")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmCryptographicProviderProperties.findAll", query = "SELECT d FROM DmCryptographicProviderProperties d"),
    @NamedQuery(name = "DmCryptographicProviderProperties.findByProviderId", query = "SELECT d FROM DmCryptographicProviderProperties d WHERE d.providerId = :providerId"),
    @NamedQuery(name = "DmCryptographicProviderProperties.findByGuid", query = "SELECT d FROM DmCryptographicProviderProperties d WHERE d.guid = :guid"),
    @NamedQuery(name = "DmCryptographicProviderProperties.findByProviderVersion", query = "SELECT d FROM DmCryptographicProviderProperties d WHERE d.providerVersion = :providerVersion"),
    @NamedQuery(name = "DmCryptographicProviderProperties.findBySqlcryptVersion", query = "SELECT d FROM DmCryptographicProviderProperties d WHERE d.sqlcryptVersion = :sqlcryptVersion"),
    @NamedQuery(name = "DmCryptographicProviderProperties.findByFriendlyName", query = "SELECT d FROM DmCryptographicProviderProperties d WHERE d.friendlyName = :friendlyName"),
    @NamedQuery(name = "DmCryptographicProviderProperties.findByAuthenticationType", query = "SELECT d FROM DmCryptographicProviderProperties d WHERE d.authenticationType = :authenticationType"),
    @NamedQuery(name = "DmCryptographicProviderProperties.findBySymmetricKeySupport", query = "SELECT d FROM DmCryptographicProviderProperties d WHERE d.symmetricKeySupport = :symmetricKeySupport"),
    @NamedQuery(name = "DmCryptographicProviderProperties.findBySymmetricKeyPersistance", query = "SELECT d FROM DmCryptographicProviderProperties d WHERE d.symmetricKeyPersistance = :symmetricKeyPersistance"),
    @NamedQuery(name = "DmCryptographicProviderProperties.findBySymmetricKeyExport", query = "SELECT d FROM DmCryptographicProviderProperties d WHERE d.symmetricKeyExport = :symmetricKeyExport"),
    @NamedQuery(name = "DmCryptographicProviderProperties.findBySymmetricKeyImport", query = "SELECT d FROM DmCryptographicProviderProperties d WHERE d.symmetricKeyImport = :symmetricKeyImport"),
    @NamedQuery(name = "DmCryptographicProviderProperties.findByAsymmetricKeySupport", query = "SELECT d FROM DmCryptographicProviderProperties d WHERE d.asymmetricKeySupport = :asymmetricKeySupport"),
    @NamedQuery(name = "DmCryptographicProviderProperties.findByAsymmetricKeyPersistance", query = "SELECT d FROM DmCryptographicProviderProperties d WHERE d.asymmetricKeyPersistance = :asymmetricKeyPersistance"),
    @NamedQuery(name = "DmCryptographicProviderProperties.findByAsymmetricKeyExport", query = "SELECT d FROM DmCryptographicProviderProperties d WHERE d.asymmetricKeyExport = :asymmetricKeyExport"),
    @NamedQuery(name = "DmCryptographicProviderProperties.findByAsymmetricKeyImport", query = "SELECT d FROM DmCryptographicProviderProperties d WHERE d.asymmetricKeyImport = :asymmetricKeyImport")})
public class DmCryptographicProviderProperties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "provider_id")
    private Integer providerId;
    @Size(max = 36)
    @Column(name = "guid")
    private String guid;
    @Size(max = 128)
    @Column(name = "provider_version")
    private String providerVersion;
    @Size(max = 128)
    @Column(name = "sqlcrypt_version")
    private String sqlcryptVersion;
    @Size(max = 1024)
    @Column(name = "friendly_name")
    private String friendlyName;
    @Size(max = 128)
    @Column(name = "authentication_type")
    private String authenticationType;
    @Column(name = "symmetric_key_support")
    private Short symmetricKeySupport;
    @Column(name = "symmetric_key_persistance")
    private Short symmetricKeyPersistance;
    @Column(name = "symmetric_key_export")
    private Short symmetricKeyExport;
    @Column(name = "symmetric_key_import")
    private Short symmetricKeyImport;
    @Column(name = "asymmetric_key_support")
    private Short asymmetricKeySupport;
    @Column(name = "asymmetric_key_persistance")
    private Short asymmetricKeyPersistance;
    @Column(name = "asymmetric_key_export")
    private Short asymmetricKeyExport;
    @Column(name = "asymmetric_key_import")
    private Short asymmetricKeyImport;

    public DmCryptographicProviderProperties() {
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getProviderVersion() {
        return providerVersion;
    }

    public void setProviderVersion(String providerVersion) {
        this.providerVersion = providerVersion;
    }

    public String getSqlcryptVersion() {
        return sqlcryptVersion;
    }

    public void setSqlcryptVersion(String sqlcryptVersion) {
        this.sqlcryptVersion = sqlcryptVersion;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public Short getSymmetricKeySupport() {
        return symmetricKeySupport;
    }

    public void setSymmetricKeySupport(Short symmetricKeySupport) {
        this.symmetricKeySupport = symmetricKeySupport;
    }

    public Short getSymmetricKeyPersistance() {
        return symmetricKeyPersistance;
    }

    public void setSymmetricKeyPersistance(Short symmetricKeyPersistance) {
        this.symmetricKeyPersistance = symmetricKeyPersistance;
    }

    public Short getSymmetricKeyExport() {
        return symmetricKeyExport;
    }

    public void setSymmetricKeyExport(Short symmetricKeyExport) {
        this.symmetricKeyExport = symmetricKeyExport;
    }

    public Short getSymmetricKeyImport() {
        return symmetricKeyImport;
    }

    public void setSymmetricKeyImport(Short symmetricKeyImport) {
        this.symmetricKeyImport = symmetricKeyImport;
    }

    public Short getAsymmetricKeySupport() {
        return asymmetricKeySupport;
    }

    public void setAsymmetricKeySupport(Short asymmetricKeySupport) {
        this.asymmetricKeySupport = asymmetricKeySupport;
    }

    public Short getAsymmetricKeyPersistance() {
        return asymmetricKeyPersistance;
    }

    public void setAsymmetricKeyPersistance(Short asymmetricKeyPersistance) {
        this.asymmetricKeyPersistance = asymmetricKeyPersistance;
    }

    public Short getAsymmetricKeyExport() {
        return asymmetricKeyExport;
    }

    public void setAsymmetricKeyExport(Short asymmetricKeyExport) {
        this.asymmetricKeyExport = asymmetricKeyExport;
    }

    public Short getAsymmetricKeyImport() {
        return asymmetricKeyImport;
    }

    public void setAsymmetricKeyImport(Short asymmetricKeyImport) {
        this.asymmetricKeyImport = asymmetricKeyImport;
    }
    
}
