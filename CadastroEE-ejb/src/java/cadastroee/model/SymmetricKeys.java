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
@Table(name = "symmetric_keys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SymmetricKeys.findAll", query = "SELECT s FROM SymmetricKeys s"),
    @NamedQuery(name = "SymmetricKeys.findByName", query = "SELECT s FROM SymmetricKeys s WHERE s.name = :name"),
    @NamedQuery(name = "SymmetricKeys.findByPrincipalId", query = "SELECT s FROM SymmetricKeys s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "SymmetricKeys.findBySymmetricKeyId", query = "SELECT s FROM SymmetricKeys s WHERE s.symmetricKeyId = :symmetricKeyId"),
    @NamedQuery(name = "SymmetricKeys.findByKeyLength", query = "SELECT s FROM SymmetricKeys s WHERE s.keyLength = :keyLength"),
    @NamedQuery(name = "SymmetricKeys.findByKeyAlgorithm", query = "SELECT s FROM SymmetricKeys s WHERE s.keyAlgorithm = :keyAlgorithm"),
    @NamedQuery(name = "SymmetricKeys.findByAlgorithmDesc", query = "SELECT s FROM SymmetricKeys s WHERE s.algorithmDesc = :algorithmDesc"),
    @NamedQuery(name = "SymmetricKeys.findByCreateDate", query = "SELECT s FROM SymmetricKeys s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "SymmetricKeys.findByModifyDate", query = "SELECT s FROM SymmetricKeys s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "SymmetricKeys.findByKeyGuid", query = "SELECT s FROM SymmetricKeys s WHERE s.keyGuid = :keyGuid"),
    @NamedQuery(name = "SymmetricKeys.findByKeyThumbprint", query = "SELECT s FROM SymmetricKeys s WHERE s.keyThumbprint = :keyThumbprint"),
    @NamedQuery(name = "SymmetricKeys.findByProviderType", query = "SELECT s FROM SymmetricKeys s WHERE s.providerType = :providerType"),
    @NamedQuery(name = "SymmetricKeys.findByCryptographicProviderGuid", query = "SELECT s FROM SymmetricKeys s WHERE s.cryptographicProviderGuid = :cryptographicProviderGuid"),
    @NamedQuery(name = "SymmetricKeys.findByCryptographicProviderAlgid", query = "SELECT s FROM SymmetricKeys s WHERE s.cryptographicProviderAlgid = :cryptographicProviderAlgid")})
public class SymmetricKeys implements Serializable {

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
    @Column(name = "symmetric_key_id")
    private int symmetricKeyId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "key_length")
    private int keyLength;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "key_algorithm")
    private String keyAlgorithm;
    @Size(max = 60)
    @Column(name = "algorithm_desc")
    private String algorithmDesc;
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
    @Size(max = 36)
    @Column(name = "key_guid")
    private String keyGuid;
    @Column(name = "key_thumbprint")
    private Serializable keyThumbprint;
    @Size(max = 60)
    @Column(name = "provider_type")
    private String providerType;
    @Size(max = 36)
    @Column(name = "cryptographic_provider_guid")
    private String cryptographicProviderGuid;
    @Column(name = "cryptographic_provider_algid")
    private Serializable cryptographicProviderAlgid;

    public SymmetricKeys() {
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

    public int getSymmetricKeyId() {
        return symmetricKeyId;
    }

    public void setSymmetricKeyId(int symmetricKeyId) {
        this.symmetricKeyId = symmetricKeyId;
    }

    public int getKeyLength() {
        return keyLength;
    }

    public void setKeyLength(int keyLength) {
        this.keyLength = keyLength;
    }

    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    public String getAlgorithmDesc() {
        return algorithmDesc;
    }

    public void setAlgorithmDesc(String algorithmDesc) {
        this.algorithmDesc = algorithmDesc;
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

    public String getKeyGuid() {
        return keyGuid;
    }

    public void setKeyGuid(String keyGuid) {
        this.keyGuid = keyGuid;
    }

    public Serializable getKeyThumbprint() {
        return keyThumbprint;
    }

    public void setKeyThumbprint(Serializable keyThumbprint) {
        this.keyThumbprint = keyThumbprint;
    }

    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public String getCryptographicProviderGuid() {
        return cryptographicProviderGuid;
    }

    public void setCryptographicProviderGuid(String cryptographicProviderGuid) {
        this.cryptographicProviderGuid = cryptographicProviderGuid;
    }

    public Serializable getCryptographicProviderAlgid() {
        return cryptographicProviderAlgid;
    }

    public void setCryptographicProviderAlgid(Serializable cryptographicProviderAlgid) {
        this.cryptographicProviderAlgid = cryptographicProviderAlgid;
    }
    
}
