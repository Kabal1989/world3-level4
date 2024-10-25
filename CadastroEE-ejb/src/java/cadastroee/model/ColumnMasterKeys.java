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
import javax.persistence.Lob;
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
@Table(name = "column_master_keys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ColumnMasterKeys.findAll", query = "SELECT c FROM ColumnMasterKeys c"),
    @NamedQuery(name = "ColumnMasterKeys.findByName", query = "SELECT c FROM ColumnMasterKeys c WHERE c.name = :name"),
    @NamedQuery(name = "ColumnMasterKeys.findByColumnMasterKeyId", query = "SELECT c FROM ColumnMasterKeys c WHERE c.columnMasterKeyId = :columnMasterKeyId"),
    @NamedQuery(name = "ColumnMasterKeys.findByCreateDate", query = "SELECT c FROM ColumnMasterKeys c WHERE c.createDate = :createDate"),
    @NamedQuery(name = "ColumnMasterKeys.findByModifyDate", query = "SELECT c FROM ColumnMasterKeys c WHERE c.modifyDate = :modifyDate"),
    @NamedQuery(name = "ColumnMasterKeys.findByKeyStoreProviderName", query = "SELECT c FROM ColumnMasterKeys c WHERE c.keyStoreProviderName = :keyStoreProviderName"),
    @NamedQuery(name = "ColumnMasterKeys.findByKeyPath", query = "SELECT c FROM ColumnMasterKeys c WHERE c.keyPath = :keyPath"),
    @NamedQuery(name = "ColumnMasterKeys.findByAllowEnclaveComputations", query = "SELECT c FROM ColumnMasterKeys c WHERE c.allowEnclaveComputations = :allowEnclaveComputations")})
public class ColumnMasterKeys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_master_key_id")
    private int columnMasterKeyId;
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
    @Size(max = 128)
    @Column(name = "key_store_provider_name")
    private String keyStoreProviderName;
    @Size(max = 4000)
    @Column(name = "key_path")
    private String keyPath;
    @Basic(optional = false)
    @NotNull
    @Column(name = "allow_enclave_computations")
    private int allowEnclaveComputations;
    @Lob
    @Column(name = "signature")
    private byte[] signature;

    public ColumnMasterKeys() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColumnMasterKeyId() {
        return columnMasterKeyId;
    }

    public void setColumnMasterKeyId(int columnMasterKeyId) {
        this.columnMasterKeyId = columnMasterKeyId;
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

    public String getKeyStoreProviderName() {
        return keyStoreProviderName;
    }

    public void setKeyStoreProviderName(String keyStoreProviderName) {
        this.keyStoreProviderName = keyStoreProviderName;
    }

    public String getKeyPath() {
        return keyPath;
    }

    public void setKeyPath(String keyPath) {
        this.keyPath = keyPath;
    }

    public int getAllowEnclaveComputations() {
        return allowEnclaveComputations;
    }

    public void setAllowEnclaveComputations(int allowEnclaveComputations) {
        this.allowEnclaveComputations = allowEnclaveComputations;
    }

    public byte[] getSignature() {
        return signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }
    
}
