/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kabal
 */
@Entity
@Table(name = "dm_database_encryption_keys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findAll", query = "SELECT d FROM DmDatabaseEncryptionKeys d"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findByDatabaseId", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findByEncryptionState", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.encryptionState = :encryptionState"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findByCreateDate", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.createDate = :createDate"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findByRegenerateDate", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.regenerateDate = :regenerateDate"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findByModifyDate", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.modifyDate = :modifyDate"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findBySetDate", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.setDate = :setDate"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findByOpenedDate", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.openedDate = :openedDate"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findByKeyAlgorithm", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.keyAlgorithm = :keyAlgorithm"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findByKeyLength", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.keyLength = :keyLength"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findByEncryptorType", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.encryptorType = :encryptorType"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findByPercentComplete", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.percentComplete = :percentComplete"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findByEncryptionStateDesc", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.encryptionStateDesc = :encryptionStateDesc"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findByEncryptionScanState", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.encryptionScanState = :encryptionScanState"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findByEncryptionScanStateDesc", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.encryptionScanStateDesc = :encryptionScanStateDesc"),
    @NamedQuery(name = "DmDatabaseEncryptionKeys.findByEncryptionScanModifyDate", query = "SELECT d FROM DmDatabaseEncryptionKeys d WHERE d.encryptionScanModifyDate = :encryptionScanModifyDate")})
public class DmDatabaseEncryptionKeys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "database_id")
    private Integer databaseId;
    @Column(name = "encryption_state")
    private Integer encryptionState;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "regenerate_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date regenerateDate;
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Column(name = "set_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date setDate;
    @Column(name = "opened_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date openedDate;
    @Size(max = 128)
    @Column(name = "key_algorithm")
    private String keyAlgorithm;
    @Column(name = "key_length")
    private Integer keyLength;
    @Lob
    @Column(name = "encryptor_thumbprint")
    private byte[] encryptorThumbprint;
    @Size(max = 128)
    @Column(name = "encryptor_type")
    private String encryptorType;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "percent_complete")
    private Float percentComplete;
    @Size(max = 128)
    @Column(name = "encryption_state_desc")
    private String encryptionStateDesc;
    @Column(name = "encryption_scan_state")
    private Integer encryptionScanState;
    @Size(max = 128)
    @Column(name = "encryption_scan_state_desc")
    private String encryptionScanStateDesc;
    @Column(name = "encryption_scan_modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date encryptionScanModifyDate;

    public DmDatabaseEncryptionKeys() {
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getEncryptionState() {
        return encryptionState;
    }

    public void setEncryptionState(Integer encryptionState) {
        this.encryptionState = encryptionState;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getRegenerateDate() {
        return regenerateDate;
    }

    public void setRegenerateDate(Date regenerateDate) {
        this.regenerateDate = regenerateDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Date getSetDate() {
        return setDate;
    }

    public void setSetDate(Date setDate) {
        this.setDate = setDate;
    }

    public Date getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(Date openedDate) {
        this.openedDate = openedDate;
    }

    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    public Integer getKeyLength() {
        return keyLength;
    }

    public void setKeyLength(Integer keyLength) {
        this.keyLength = keyLength;
    }

    public byte[] getEncryptorThumbprint() {
        return encryptorThumbprint;
    }

    public void setEncryptorThumbprint(byte[] encryptorThumbprint) {
        this.encryptorThumbprint = encryptorThumbprint;
    }

    public String getEncryptorType() {
        return encryptorType;
    }

    public void setEncryptorType(String encryptorType) {
        this.encryptorType = encryptorType;
    }

    public Float getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(Float percentComplete) {
        this.percentComplete = percentComplete;
    }

    public String getEncryptionStateDesc() {
        return encryptionStateDesc;
    }

    public void setEncryptionStateDesc(String encryptionStateDesc) {
        this.encryptionStateDesc = encryptionStateDesc;
    }

    public Integer getEncryptionScanState() {
        return encryptionScanState;
    }

    public void setEncryptionScanState(Integer encryptionScanState) {
        this.encryptionScanState = encryptionScanState;
    }

    public String getEncryptionScanStateDesc() {
        return encryptionScanStateDesc;
    }

    public void setEncryptionScanStateDesc(String encryptionScanStateDesc) {
        this.encryptionScanStateDesc = encryptionScanStateDesc;
    }

    public Date getEncryptionScanModifyDate() {
        return encryptionScanModifyDate;
    }

    public void setEncryptionScanModifyDate(Date encryptionScanModifyDate) {
        this.encryptionScanModifyDate = encryptionScanModifyDate;
    }
    
}
