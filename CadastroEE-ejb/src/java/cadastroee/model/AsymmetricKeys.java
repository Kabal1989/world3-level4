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
@Table(name = "asymmetric_keys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AsymmetricKeys.findAll", query = "SELECT a FROM AsymmetricKeys a"),
    @NamedQuery(name = "AsymmetricKeys.findByName", query = "SELECT a FROM AsymmetricKeys a WHERE a.name = :name"),
    @NamedQuery(name = "AsymmetricKeys.findByPrincipalId", query = "SELECT a FROM AsymmetricKeys a WHERE a.principalId = :principalId"),
    @NamedQuery(name = "AsymmetricKeys.findByAsymmetricKeyId", query = "SELECT a FROM AsymmetricKeys a WHERE a.asymmetricKeyId = :asymmetricKeyId"),
    @NamedQuery(name = "AsymmetricKeys.findByPvtKeyEncryptionType", query = "SELECT a FROM AsymmetricKeys a WHERE a.pvtKeyEncryptionType = :pvtKeyEncryptionType"),
    @NamedQuery(name = "AsymmetricKeys.findByPvtKeyEncryptionTypeDesc", query = "SELECT a FROM AsymmetricKeys a WHERE a.pvtKeyEncryptionTypeDesc = :pvtKeyEncryptionTypeDesc"),
    @NamedQuery(name = "AsymmetricKeys.findByAlgorithm", query = "SELECT a FROM AsymmetricKeys a WHERE a.algorithm = :algorithm"),
    @NamedQuery(name = "AsymmetricKeys.findByAlgorithmDesc", query = "SELECT a FROM AsymmetricKeys a WHERE a.algorithmDesc = :algorithmDesc"),
    @NamedQuery(name = "AsymmetricKeys.findByKeyLength", query = "SELECT a FROM AsymmetricKeys a WHERE a.keyLength = :keyLength"),
    @NamedQuery(name = "AsymmetricKeys.findByStringSid", query = "SELECT a FROM AsymmetricKeys a WHERE a.stringSid = :stringSid"),
    @NamedQuery(name = "AsymmetricKeys.findByAttestedBy", query = "SELECT a FROM AsymmetricKeys a WHERE a.attestedBy = :attestedBy"),
    @NamedQuery(name = "AsymmetricKeys.findByProviderType", query = "SELECT a FROM AsymmetricKeys a WHERE a.providerType = :providerType"),
    @NamedQuery(name = "AsymmetricKeys.findByCryptographicProviderGuid", query = "SELECT a FROM AsymmetricKeys a WHERE a.cryptographicProviderGuid = :cryptographicProviderGuid"),
    @NamedQuery(name = "AsymmetricKeys.findByCryptographicProviderAlgid", query = "SELECT a FROM AsymmetricKeys a WHERE a.cryptographicProviderAlgid = :cryptographicProviderAlgid")})
public class AsymmetricKeys implements Serializable {

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
    @Column(name = "asymmetric_key_id")
    private int asymmetricKeyId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "pvt_key_encryption_type")
    private String pvtKeyEncryptionType;
    @Size(max = 60)
    @Column(name = "pvt_key_encryption_type_desc")
    private String pvtKeyEncryptionTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "thumbprint")
    private byte[] thumbprint;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "algorithm")
    private String algorithm;
    @Size(max = 60)
    @Column(name = "algorithm_desc")
    private String algorithmDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "key_length")
    private int keyLength;
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Size(max = 128)
    @Column(name = "string_sid")
    private String stringSid;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "public_key")
    private byte[] publicKey;
    @Size(max = 260)
    @Column(name = "attested_by")
    private String attestedBy;
    @Size(max = 60)
    @Column(name = "provider_type")
    private String providerType;
    @Size(max = 36)
    @Column(name = "cryptographic_provider_guid")
    private String cryptographicProviderGuid;
    @Column(name = "cryptographic_provider_algid")
    private Serializable cryptographicProviderAlgid;

    public AsymmetricKeys() {
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

    public int getAsymmetricKeyId() {
        return asymmetricKeyId;
    }

    public void setAsymmetricKeyId(int asymmetricKeyId) {
        this.asymmetricKeyId = asymmetricKeyId;
    }

    public String getPvtKeyEncryptionType() {
        return pvtKeyEncryptionType;
    }

    public void setPvtKeyEncryptionType(String pvtKeyEncryptionType) {
        this.pvtKeyEncryptionType = pvtKeyEncryptionType;
    }

    public String getPvtKeyEncryptionTypeDesc() {
        return pvtKeyEncryptionTypeDesc;
    }

    public void setPvtKeyEncryptionTypeDesc(String pvtKeyEncryptionTypeDesc) {
        this.pvtKeyEncryptionTypeDesc = pvtKeyEncryptionTypeDesc;
    }

    public byte[] getThumbprint() {
        return thumbprint;
    }

    public void setThumbprint(byte[] thumbprint) {
        this.thumbprint = thumbprint;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getAlgorithmDesc() {
        return algorithmDesc;
    }

    public void setAlgorithmDesc(String algorithmDesc) {
        this.algorithmDesc = algorithmDesc;
    }

    public int getKeyLength() {
        return keyLength;
    }

    public void setKeyLength(int keyLength) {
        this.keyLength = keyLength;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public String getStringSid() {
        return stringSid;
    }

    public void setStringSid(String stringSid) {
        this.stringSid = stringSid;
    }

    public byte[] getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(byte[] publicKey) {
        this.publicKey = publicKey;
    }

    public String getAttestedBy() {
        return attestedBy;
    }

    public void setAttestedBy(String attestedBy) {
        this.attestedBy = attestedBy;
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
